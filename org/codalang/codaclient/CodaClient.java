/*
 * Main.java
 *
 * Created on October 30, 2007, 1:21 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.codalang.codaclient;

import com.caucho.hessian.client.HessianProxyFactory;
import com.caucho.hessian.client.HessianRuntimeException;
import java.io.*;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.util.Hashtable;
import java.util.Vector;
import jline.ConsoleReader;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.codalang.codaserver.httpServer.ICodaAPI;

/**
 *
 * @author michaelarace
 */
public class CodaClient {
    
    public static final String version = "CodaClient 1.0 Alpha";
    
    boolean quietMode = false;
    private String hostname = "localhost";
    private int port = 3407;
    String username, password;
    private String application;
    private String environment;
    private String groupName;
    private boolean scriptMode = false;
    ConsoleReader reader;
    
    // server variables
    private String sessionKey = null;
    private Vector data;
    private Vector errors;
    
    /** Creates a new instance of Main */
    public CodaClient(boolean quietMode, String hostname, int port, String username, String password, String application, String environment, String groupName) {
        try {
            reader = new ConsoleReader(System.in, new PrintWriter(System.out));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        //System.setErr(new PrintStream(new ByteArrayOutputStream()));
        this.quietMode = quietMode;
        this.setHostname(hostname);
        this.setPort(port);
        this.username = username;
        this.password = password;
        this.setGroupName(groupName);
        this.setApplication(application);
        this.setEnvironment(environment);
        System.setErr(new PrintStream(new ByteArrayOutputStream()));
    }
    
    public void start() {
        while (true) {
            String command = "";
            try {
                command = this.readInput();
                CodaClientParser parser = new CodaClientParser(new CommonTokenStream(new CodaClientLexer(new CaseInsensitiveStringStream(command))), this);
                boolean found = true;
                try {
                    found = parser.stat().response;
                } catch (RecognitionException ex) {
                    ex.printStackTrace();
                    found = false;
                }
                if (!found) {
                    if (sessionKey != null) {
                        // issue the command to the server
                        HessianProxyFactory factory = new HessianProxyFactory();
        
                        ICodaAPI basic;
                        try {
                            basic = (ICodaAPI) factory.create(ICodaAPI.class, "http://" + hostname + ":" + port);
                            //System.out.println(command);
                            Hashtable response = basic.execute(sessionKey, command);
                            this.processResponse(response);
                            // test if errors or data
                            if (errors.size() > 0) {
                                if (errors.size() == 1) {
                                    this.fetch("0", false);
                                } else {
                                    System.out.println(errors.size() + " errors returned.  Use FETCH to retrieve them.");
                                }
                            } else {
                                if (data.size() == 1) {
                                    this.fetch("0", true);
                                } else {
                                    System.out.println(data.size() + " values returned.  Use FETCH to retrieve them.");
                                }
                            }
                        } catch ( MalformedURLException e ) {
                            this.printError("Please check the hostname and port.", 1008);
                        } catch (HessianRuntimeException ex) {
                            this.printError("There was a runtime exception talking to the server, probably a timeout.", 1008);
                        }
                    } else {
                        this.printError("Not connected to CodaServer.", 1008);
                    }
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                
                this.printError(e.getMessage(), 1008);
                
            }
            
            
        }
    }
    
    public String readInput() throws IOException {
        int rowNum = 1;
        String retval = "";
        
        while (!(isScriptMode() && retval.trim().endsWith("/")) && !(!isScriptMode() && retval.trim().endsWith(";"))) {
            if (rowNum == 1) {
                retval += reader.readLine("Coda %: ");
            } else {
                String prompt = "     " + rowNum;
                retval += "\n" + reader.readLine(prompt.substring(prompt.length() - 6) + ": ");
            }
            
            rowNum++;  
        }
        
        return retval.trim().substring(0, retval.trim().length() - 1);
    }
    
    public void processResponse (Hashtable response) {
        data = new Vector();
        errors = new Vector();
        if (((Boolean)response.get("errorstatus")).booleanValue()) {
            errors = (Vector)response.get("errors"); 
        } else {
            if (response.get("data") instanceof Vector) {
                data = (Vector)response.get("data");
            } else {
                data.add(response.get("data"));
            }
        }
    }
    
    public boolean connect() throws IOException {
        if (username == null) {
            username = reader.readLine("User: ");
            password = reader.readLine("Pass: ", new Character('*'));
        } else if (username != null && password == null) {
            password = reader.readLine("Pass: ", new Character('*'));
        } 
        
        HessianProxyFactory factory = new HessianProxyFactory();
        
        ICodaAPI basic;
        try {
            basic = (ICodaAPI) factory.create(ICodaAPI.class, "http://" + hostname + ":" + port);
            sessionKey = basic.login(username, password, application, environment, groupName);
            if (sessionKey == null || sessionKey.trim().equals("")) {
                this.username = null;
                this.password = null;
                this.printError("Invalid credentials.", 1001);
            } else {
                reader.printString("Connected!");
                reader.printNewline();
                reader.printNewline();
            }
        } catch ( MalformedURLException e ) {
            this.username = null;
            this.password = null;
            this.printError("Please check the hostname and port.", 1008);
        } catch ( com.caucho.hessian.client.HessianRuntimeException  e) {
            // Hessian throws java.net.ConnectException
            this.username = null;
            this.password = null;
            this.printError("Please check the hostname and port.", 1008);
        }

        return getSessionKey() != null;
    }
    
    public boolean disconnect() throws IOException {
        if (sessionKey != null) {
            HessianProxyFactory factory = new HessianProxyFactory();
        
            ICodaAPI basic;
            try {
                basic = (ICodaAPI) factory.create(ICodaAPI.class, "http://" + hostname + ":" + port);
                basic.logout(sessionKey);
                username = null;
                password = null;
                sessionKey = null;
                return true;
            } catch ( MalformedURLException e ) {
                this.printError("Please check the hostname and port.", 1008);
            }
        } 
        username = null;
        password = null;
        sessionKey = null;
        
        return false;
    }
    
    public boolean setEnv(String variableName, String value) {
        boolean retval = false;
        if (variableName.equalsIgnoreCase("SCRIPT_MODE")) {
            if (value.equalsIgnoreCase("TRUE")) {
                this.setScriptMode(true);
                System.out.println("Script Mode is On.\n");
                retval = true;
            } else if (value.equalsIgnoreCase("FALSE")) {
                this.setScriptMode(false);
                System.out.println("Script Mode is Off.\n");
                retval = true;
            } else {
                this.printError("Invalid value for Script Mode.", 1008);
            }
        } else {
            this.printError(variableName.toUpperCase() +" is not a valid environment variable.", 1008);
        }
        return retval;
    }
    
    public void help () {
        System.out.println("The following commands are available in CodaClient:\n");
        
        // connect
        System.out.println("CONNECT: Connect to a CodaServer.  Usage: CONNECT <hostname>:<port>;");
        
        // disconnect
        System.out.println("DISCONNECT: Disconnect from the current CodaServer.  Usage: DISCONNECT;");
        
        // setenv
        System.out.println("SETENV: Set an enviroment variable in the client.  Usage: SETENV <variable name> = '<new value>';");
        System.out.println("        Environment Variables: SCRIPT_MODE");
        
        // help
        System.out.println("HELP: This screen.  Usage: HELP;");
        
        // fetch
        System.out.println("FETCH: Print a value from the previous query or procedure call. Usage: FETCH DATA[<index>];");
        
        // exit
        System.out.println("EXIT: Exit from CodaClient.  Usage: EXIT;\n");
        
        System.out.println("Once CodaClient has connected to a server, you can communicate with the server using the Coda language.  For more details please see http://coda-lang.com.\n");
    }
    
    public void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String hostname = "localhost", username = null, password = null, groupName = null, application = null, environment = null;
        int port = 3407;
        boolean quietMode = false, connect = false;
        
        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("-h")) {
                try {
                    hostname = args[i+1];
                    i++;
                } catch (Exception e) {
                    //do nothing
                }
            } else if (args[i].equalsIgnoreCase("-t")) {
                try {
                    port = Integer.parseInt(args[i+1]);
                    i++;
                } catch (Exception e) {
                    //do nothing
                }
            } else if (args[i].equalsIgnoreCase("-u")) {
                try {
                    username = args[i+1];
                    i++;
                    connect = true;
                } catch (Exception e) {
                    //do nothing
                }
            } else if (args[i].equalsIgnoreCase("-p")) {
                try {
                    password = args[i+1];
                    i++;
                } catch (Exception e) {
                    //do nothing
                }
            } else if (args[i].equalsIgnoreCase("-g")) {
                try {
                    groupName = args[i+1];
                    i++;
                } catch (Exception e) {
                    //do nothing
                }
            } else if (args[i].equalsIgnoreCase("-a")) {
                try {
                    application = args[i+1];
                    i++;
                } catch (Exception e) {
                    //do nothing
                }
            } else if (args[i].equalsIgnoreCase("-e")) {
                try {
                    environment = args[i+1];
                    i++;
                } catch (Exception e) {
                    //do nothing
                }
            }
                
        }
        
        System.out.println(CodaClient.version);
            
        CodaClient app = new CodaClient(quietMode, hostname, port, username, password, application, environment, groupName);

        if (connect) {
            try {
                app.connect();
            } catch (Exception e) {
                CodaClient.printError("Unable to connect.  Please try again.", 1008);
            }
        }
        app.start();
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isScriptMode() {
        return scriptMode;
    }

    public void setScriptMode(boolean scriptMode) {
        this.scriptMode = scriptMode;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void fetch(String variableName) {
        if (variableName.equalsIgnoreCase("SESSION_KEY")) {
            System.out.println("Session Key");
            for (int i = 0 ; i < (sessionKey != null && sessionKey.length() > 11 ? sessionKey.length() : 11) ; i++) {
                System.out.print("-");
            } 
            System.out.print("\n");
            System.out.println(sessionKey != null ? sessionKey : "Not Connected");
            System.out.print("\n");
        } else {
            this.printError(variableName.toUpperCase() +" is not a valid variable.", 1008);
        }
        
    }
    
    public void fetch(String index, boolean dataFlag) {
        int intIndex = -1;
        try {
            intIndex = Integer.parseInt(index);
        } catch (Exception e) {
            this.printError("Requested index invalid.", 1008);
            return;
        }
        
        if (dataFlag) {
            Object ob;
            try {
                ob = data.get(intIndex);
            } catch(Exception e) {
                this.printError("Requested index invalid.", 1008);
                return;
            }
            if (ob instanceof Hashtable) {
                Vector<Integer> columnLengths = new Vector();
                Vector<String> columnHeadings = new Vector();
                Vector headings = (Vector)((Hashtable)ob).get("columns");
                int columnIndex = 0;
                for (Object column : headings) {
                    String columnName = (String)((Hashtable)column).get("columnname");
                    columnHeadings.add(columnName);
                    columnLengths.add(this.getColumnWidth(intIndex, columnIndex, columnName.length()));
                    columnIndex++;
                }
                System.out.println("");
                for (int i = 0; i < columnHeadings.size() ; i++) {
                    this.printColumn(columnLengths.get(i), columnHeadings.get(i), i == 0);
                }
                System.out.print("\n");
                this.printHorizontalSeparator(columnLengths);
                System.out.print("\n");
                Vector rows = (Vector)((Hashtable)ob).get("data");
                for (int i = 0; i < rows.size(); i++) {
                    Vector row = (Vector)rows.get(i);
                    for (int j = 0; j < row.size(); j++) {
                        this.printColumn(columnLengths.get(j), row.get(j) != null ? row.get(j).toString() : "<null>", j == 0);
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                System.out.println(rows.size() + " Rows Returned");
                System.out.print("\n");
                
            } else {
                System.out.print("\n");
                System.out.println("Value");
                for (int i = 0 ; i < (ob.toString().length() > 5 ? ob.toString().length() : 5) ; i++) {
                    System.out.print("-");
                } 
                System.out.print("\n");
                System.out.println(ob.toString());
                System.out.print("\n");
            }
        } else {
            Object ob;
            try {
                ob = errors.get(intIndex);
            } catch(Exception e) {
                this.printError("Requested index invalid.", 1008);
                return;
            }
            String errorString =  ((Hashtable)ob).get("errormessage").toString();
            this.printError(errorString, Integer.parseInt(((Hashtable)ob).get("errorcode").toString()));
        }
    }
    
    private int getColumnWidth(int index, int columnIndex, int headingWidth) {
        int retval = headingWidth;
        Vector rows = (Vector)((Hashtable)data.get(index)).get("data");
        
        for (Object ob : rows) {
            String value = ((Vector)ob).get(columnIndex) != null ? ((Vector)ob).get(columnIndex).toString() : "<null>";
            if (value.length() > retval) {
                retval = value.length();
            } 
        }
        return retval;
    }
    
    private void printColumn(int size, String text, boolean firstFlag) {
        if (!firstFlag) {
            System.out.print("|");
        }
        System.out.print(text);
        for (int i = text.length(); i < size; i++) {
            System.out.print(" ");
        }
    }
    
    private void printHorizontalSeparator(Vector<Integer> columnWidths) {
        for (int i = 0; i < columnWidths.size(); i++) {
            if (i != 0) {
                System.out.print("+");
            }
            for (int j = 0; j < columnWidths.get(i).intValue(); j++ ) {
                System.out.print("-");
            }
        }
    }
    
    public static void printError(String error, int code) {
        System.out.print("\n");
        System.out.println("Error");
        for (int i = 0 ; i < 5; i++) {
            System.out.print("-");
        } 
        System.out.print("\n");
        System.out.println((code > 0 ? "CE" + code + ": " : "") + error);
        System.out.print("\n");
    }
    
    public String getCharErrorDisplay(int c) {

        String s = String.valueOf((char)c);
        switch (c) {
            case Token.EOF: 
                s = "<EOF>";
                break;
            case '\n': 
                s = "\n";
                break;
            case '\t': 
                s = "\t";
                break;
            case '\r': 
                s = "\r";
                break;
        }
        return "'" + s + "'";
    }
}
