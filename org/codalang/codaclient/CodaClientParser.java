// $ANTLR 3.0.1 /Users/michaelarace/CodaClient/CodaClient.g 2008-04-16 22:04:52

	package org.codalang.codaclient;
	
	import java.io.IOException;
	import org.codalang.codaclient.*;
	import java.util.Iterator;
	import java.util.Vector;
	import java.util.Hashtable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class CodaClientParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "HostName", "Integer", "ObjectName", "EnvironmentName", "UnicodeStringLiteral", "ASCIIStringLiteral", "WS", "'CONNECT'", "':'", "'TO'", "'APPLICATION'", "'.'", "'IN'", "'GROUP'", "'DISCONNECT'", "'SETENV'", "'='", "'HELP'", "'FETCH'", "'DATA'", "'['", "']'", "'ERROR'", "'EXIT'"
    };
    public static final int HostName=4;
    public static final int WS=10;
    public static final int EOF=-1;
    public static final int ObjectName=6;
    public static final int EnvironmentName=7;
    public static final int UnicodeStringLiteral=8;
    public static final int Integer=5;
    public static final int ASCIIStringLiteral=9;

        public CodaClientParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[18+1];
         }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CodaClientParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/michaelarace/CodaClient/CodaClient.g"; }


    	CodaClient client;
    	
    	public CodaClientParser(TokenStream input, CodaClient client) {
    		this(input);
    		this.client = client;
    	}
    	
    	public String getTokenErrorDisplay(Token t) {
    	        String s = t.getText();
    	        if (s == null) {
    	            if (t.getType() == Token.EOF) {
    	                s = "<EOF>";
    	            } else  {
    	                s = "<" + t.getType() + ">";
    	            }
    	        }
    	        s = s.replaceAll("\\n", "\\\\\\\\n");
    	        s = s.replaceAll("\\r", "\\\\\\\\r");
    	        s = s.replaceAll("\\t", "\\\\\\\\t");
    	        return "\'" + s + "\'";
    	}
    	


    public static class stat_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start stat
    // /Users/michaelarace/CodaClient/CodaClient.g:121:1: stat returns [boolean response] : (connectResp= connect | disconnectResp= disconnect | setEnvResp= setEnv | helpResp= help | fetchResp= fetch | exitResp= exit ) ;
    public final stat_return stat() throws RecognitionException {
        stat_return retval = new stat_return();
        retval.start = input.LT(1);
        int stat_StartIndex = input.index();
        connect_return connectResp = null;

        disconnect_return disconnectResp = null;

        setEnv_return setEnvResp = null;

        help_return helpResp = null;

        fetch_return fetchResp = null;

        exit_return exitResp = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:121:32: ( (connectResp= connect | disconnectResp= disconnect | setEnvResp= setEnv | helpResp= help | fetchResp= fetch | exitResp= exit ) )
            // /Users/michaelarace/CodaClient/CodaClient.g:122:2: (connectResp= connect | disconnectResp= disconnect | setEnvResp= setEnv | helpResp= help | fetchResp= fetch | exitResp= exit )
            {
            // /Users/michaelarace/CodaClient/CodaClient.g:122:2: (connectResp= connect | disconnectResp= disconnect | setEnvResp= setEnv | helpResp= help | fetchResp= fetch | exitResp= exit )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 27:
                {
                alt1=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("122:2: (connectResp= connect | disconnectResp= disconnect | setEnvResp= setEnv | helpResp= help | fetchResp= fetch | exitResp= exit )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:122:4: connectResp= connect
                    {
                    pushFollow(FOLLOW_connect_in_stat97);
                    connectResp=connect();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:123:4: disconnectResp= disconnect
                    {
                    pushFollow(FOLLOW_disconnect_in_stat104);
                    disconnectResp=disconnect();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:124:4: setEnvResp= setEnv
                    {
                    pushFollow(FOLLOW_setEnv_in_stat112);
                    setEnvResp=setEnv();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:125:4: helpResp= help
                    {
                    pushFollow(FOLLOW_help_in_stat119);
                    helpResp=help();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:126:4: fetchResp= fetch
                    {
                    pushFollow(FOLLOW_fetch_in_stat127);
                    fetchResp=fetch();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 6 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:127:4: exitResp= exit
                    {
                    pushFollow(FOLLOW_exit_in_stat134);
                    exitResp=exit();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {

              		retval.response = false;
              		if (connectResp != null) {
              			retval.response = true;
              		} else if (disconnectResp != null) {
              			retval.response = true;
              		} else if (helpResp != null) {
              			retval.response = true;
              		} else if (fetchResp != null) {
              			retval.response = true;
              		} else if (exitResp != null) {
              			retval.response = true;
              		} else if (setEnvResp != null) {
              			retval.response = true;
              		} 
              		
              	
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 1, stat_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end stat

    public static class connect_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start connect
    // /Users/michaelarace/CodaClient/CodaClient.g:147:1: connect returns [boolean response] : 'CONNECT' hn= HostName ':' po= Integer ( 'TO' 'APPLICATION' app= ObjectName '.' env= EnvironmentName ( 'IN' 'GROUP' gn= ObjectName )? )? ;
    public final connect_return connect() throws RecognitionException {
        connect_return retval = new connect_return();
        retval.start = input.LT(1);
        int connect_StartIndex = input.index();
        Token hn=null;
        Token po=null;
        Token app=null;
        Token env=null;
        Token gn=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:148:2: ( 'CONNECT' hn= HostName ':' po= Integer ( 'TO' 'APPLICATION' app= ObjectName '.' env= EnvironmentName ( 'IN' 'GROUP' gn= ObjectName )? )? )
            // /Users/michaelarace/CodaClient/CodaClient.g:148:4: 'CONNECT' hn= HostName ':' po= Integer ( 'TO' 'APPLICATION' app= ObjectName '.' env= EnvironmentName ( 'IN' 'GROUP' gn= ObjectName )? )?
            {
            match(input,11,FOLLOW_11_in_connect155); if (failed) return retval;
            hn=(Token)input.LT(1);
            match(input,HostName,FOLLOW_HostName_in_connect159); if (failed) return retval;
            match(input,12,FOLLOW_12_in_connect161); if (failed) return retval;
            po=(Token)input.LT(1);
            match(input,Integer,FOLLOW_Integer_in_connect165); if (failed) return retval;
            // /Users/michaelarace/CodaClient/CodaClient.g:148:41: ( 'TO' 'APPLICATION' app= ObjectName '.' env= EnvironmentName ( 'IN' 'GROUP' gn= ObjectName )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:148:42: 'TO' 'APPLICATION' app= ObjectName '.' env= EnvironmentName ( 'IN' 'GROUP' gn= ObjectName )?
                    {
                    match(input,13,FOLLOW_13_in_connect168); if (failed) return retval;
                    match(input,14,FOLLOW_14_in_connect170); if (failed) return retval;
                    app=(Token)input.LT(1);
                    match(input,ObjectName,FOLLOW_ObjectName_in_connect174); if (failed) return retval;
                    match(input,15,FOLLOW_15_in_connect176); if (failed) return retval;
                    env=(Token)input.LT(1);
                    match(input,EnvironmentName,FOLLOW_EnvironmentName_in_connect180); if (failed) return retval;
                    // /Users/michaelarace/CodaClient/CodaClient.g:148:100: ( 'IN' 'GROUP' gn= ObjectName )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==16) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/michaelarace/CodaClient/CodaClient.g:148:101: 'IN' 'GROUP' gn= ObjectName
                            {
                            match(input,16,FOLLOW_16_in_connect183); if (failed) return retval;
                            match(input,17,FOLLOW_17_in_connect185); if (failed) return retval;
                            gn=(Token)input.LT(1);
                            match(input,ObjectName,FOLLOW_ObjectName_in_connect189); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {

              			retval.response = false;
              			client.setHostname(hn != null ? hn.getText() : "localhost");
              			try {
              				client.setPort(po != null ? java.lang.Integer.parseInt(po.getText()) : 3407);
              			} catch (Exception e) {
              				client.setPort(3407);
              			}
              			client.setApplication(app != null ? app.getText() : null);
              			client.setEnvironment(env != null ? env.getText() : null);
              			client.setGroupName(gn != null ? gn.getText() : null);
              			try {
              				if (client.connect()) {
              					retval.response = true;
              				} else {
              					client.setUsername(null);
              					client.setPassword(null);
              				}
              			} catch (IOException e) {
              				client.setUsername(null);
              				client.setPassword(null);
              				CodaClient.printError("Please check the hostname and port.", 1008);
              			}
              		
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 2, connect_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end connect

    public static class disconnect_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start disconnect
    // /Users/michaelarace/CodaClient/CodaClient.g:175:1: disconnect returns [boolean response] : 'DISCONNECT' ;
    public final disconnect_return disconnect() throws RecognitionException {
        disconnect_return retval = new disconnect_return();
        retval.start = input.LT(1);
        int disconnect_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:176:2: ( 'DISCONNECT' )
            // /Users/michaelarace/CodaClient/CodaClient.g:176:4: 'DISCONNECT'
            {
            match(input,18,FOLLOW_18_in_disconnect214); if (failed) return retval;
            if ( backtracking==0 ) {

              			retval.response = false;
              			try {
              				if(client.disconnect()) {
              					System.out.println("Connection closed!\n");
              					retval.response = true;
              				} else {
              					System.out.println("Not currently connected.\n");
              				}
              			} catch (Exception e) {
              				// error displayed by client
              			}
              			
              		
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 3, disconnect_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end disconnect

    public static class setEnv_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start setEnv
    // /Users/michaelarace/CodaClient/CodaClient.g:193:1: setEnv returns [boolean response] : 'SETENV' var= ObjectName '=' value= stringLiteral ;
    public final setEnv_return setEnv() throws RecognitionException {
        setEnv_return retval = new setEnv_return();
        retval.start = input.LT(1);
        int setEnv_StartIndex = input.index();
        Token var=null;
        stringLiteral_return value = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:194:2: ( 'SETENV' var= ObjectName '=' value= stringLiteral )
            // /Users/michaelarace/CodaClient/CodaClient.g:194:4: 'SETENV' var= ObjectName '=' value= stringLiteral
            {
            match(input,19,FOLLOW_19_in_setEnv233); if (failed) return retval;
            var=(Token)input.LT(1);
            match(input,ObjectName,FOLLOW_ObjectName_in_setEnv237); if (failed) return retval;
            match(input,20,FOLLOW_20_in_setEnv239); if (failed) return retval;
            pushFollow(FOLLOW_stringLiteral_in_setEnv243);
            value=stringLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) {

              			retval.response = client.setEnv(var.getText(), value.value);
              		
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 4, setEnv_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end setEnv

    public static class help_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start help
    // /Users/michaelarace/CodaClient/CodaClient.g:200:1: help returns [boolean response] : 'HELP' ;
    public final help_return help() throws RecognitionException {
        help_return retval = new help_return();
        retval.start = input.LT(1);
        int help_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:201:2: ( 'HELP' )
            // /Users/michaelarace/CodaClient/CodaClient.g:201:4: 'HELP'
            {
            match(input,21,FOLLOW_21_in_help263); if (failed) return retval;
            if ( backtracking==0 ) {

              			client.help();
              			retval.response = true;
              		
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 5, help_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end help

    public static class fetch_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start fetch
    // /Users/michaelarace/CodaClient/CodaClient.g:208:1: fetch returns [boolean response] : 'FETCH' ( 'DATA' '[' dataIndex= Integer ']' | 'ERROR' '[' errorIndex= Integer ']' | var= ObjectName ) ;
    public final fetch_return fetch() throws RecognitionException {
        fetch_return retval = new fetch_return();
        retval.start = input.LT(1);
        int fetch_StartIndex = input.index();
        Token dataIndex=null;
        Token errorIndex=null;
        Token var=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:209:2: ( 'FETCH' ( 'DATA' '[' dataIndex= Integer ']' | 'ERROR' '[' errorIndex= Integer ']' | var= ObjectName ) )
            // /Users/michaelarace/CodaClient/CodaClient.g:209:4: 'FETCH' ( 'DATA' '[' dataIndex= Integer ']' | 'ERROR' '[' errorIndex= Integer ']' | var= ObjectName )
            {
            match(input,22,FOLLOW_22_in_fetch285); if (failed) return retval;
            // /Users/michaelarace/CodaClient/CodaClient.g:209:12: ( 'DATA' '[' dataIndex= Integer ']' | 'ERROR' '[' errorIndex= Integer ']' | var= ObjectName )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case ObjectName:
                {
                alt4=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("209:12: ( 'DATA' '[' dataIndex= Integer ']' | 'ERROR' '[' errorIndex= Integer ']' | var= ObjectName )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:209:14: 'DATA' '[' dataIndex= Integer ']'
                    {
                    match(input,23,FOLLOW_23_in_fetch289); if (failed) return retval;
                    match(input,24,FOLLOW_24_in_fetch291); if (failed) return retval;
                    dataIndex=(Token)input.LT(1);
                    match(input,Integer,FOLLOW_Integer_in_fetch295); if (failed) return retval;
                    match(input,25,FOLLOW_25_in_fetch297); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:209:49: 'ERROR' '[' errorIndex= Integer ']'
                    {
                    match(input,26,FOLLOW_26_in_fetch301); if (failed) return retval;
                    match(input,24,FOLLOW_24_in_fetch303); if (failed) return retval;
                    errorIndex=(Token)input.LT(1);
                    match(input,Integer,FOLLOW_Integer_in_fetch307); if (failed) return retval;
                    match(input,25,FOLLOW_25_in_fetch309); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:209:86: var= ObjectName
                    {
                    var=(Token)input.LT(1);
                    match(input,ObjectName,FOLLOW_ObjectName_in_fetch315); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {

              			if (var != null) {
              				client.fetch(var.getText());
              			} else {
              				client.fetch((dataIndex.getText() == null ? errorIndex.getText() : dataIndex.getText()), (dataIndex.getText() == null ? false : true));
              			}
              			retval.response = true;
              		
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 6, fetch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end fetch

    public static class exit_return extends ParserRuleReturnScope {
        public boolean response;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start exit
    // /Users/michaelarace/CodaClient/CodaClient.g:220:1: exit returns [boolean response] : 'EXIT' ;
    public final exit_return exit() throws RecognitionException {
        exit_return retval = new exit_return();
        retval.start = input.LT(1);
        int exit_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:221:2: ( 'EXIT' )
            // /Users/michaelarace/CodaClient/CodaClient.g:221:4: 'EXIT'
            {
            match(input,27,FOLLOW_27_in_exit338); if (failed) return retval;
            if ( backtracking==0 ) {

              			client.exit();
              			retval.response = true;
              		
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 7, exit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exit

    public static class stringLiteral_return extends ParserRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start stringLiteral
    // /Users/michaelarace/CodaClient/CodaClient.g:228:1: stringLiteral returns [String value] : v= ( UnicodeStringLiteral | ASCIIStringLiteral ) ;
    public final stringLiteral_return stringLiteral() throws RecognitionException {
        stringLiteral_return retval = new stringLiteral_return();
        retval.start = input.LT(1);
        int stringLiteral_StartIndex = input.index();
        Token v=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/michaelarace/CodaClient/CodaClient.g:229:5: (v= ( UnicodeStringLiteral | ASCIIStringLiteral ) )
            // /Users/michaelarace/CodaClient/CodaClient.g:230:8: v= ( UnicodeStringLiteral | ASCIIStringLiteral )
            {
            v=(Token)input.LT(1);
            if ( (input.LA(1)>=UnicodeStringLiteral && input.LA(1)<=ASCIIStringLiteral) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_stringLiteral371);    throw mse;
            }

            if ( backtracking==0 ) {

                    		retval.value =v.getText().substring(1, v.getText().length() - 1).replace("''", "'");
                    	
            }

            }

            retval.stop = input.LT(-1);

        }

        	catch (MismatchedTokenException e) {
        		String msg = "";
        		String tokenName = "<unknown>";

                    	if (e.expecting == Token.EOF) {
        			tokenName = "EOF";
        		} else  {
                        	tokenName = tokenNames[e.expecting];
                   	}

                    	msg = "Mismatched input " + getTokenErrorDisplay(e.token) + " expecting " + tokenName;
        		client.printError(msg + " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (NoViableAltException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "no viable alternative at input " + getTokenErrorDisplay(e.token));
        	} catch (EarlyExitException e) {
        		client.printError("Required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token)+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (MismatchedSetException e) {
        		client.printError("Mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	//} catch (MismatchedNotSetException e) {
        		//client.printError("Line " + e.line + ", Pos " + e.charPositionInLine + ": " + "mismatched input " + getTokenErrorDisplay(e.token) + " expecting set " + e.expecting);
        	} catch (FailedPredicateException e) {
        		client.printError("Rule " + e.ruleName + " failed predicate: {" + e.predicateText + "}?"+ " at line " + e.line + ", position " + e.charPositionInLine, 1008);
        	} catch (RecognitionException e) {
        		// do nothing
        	}

            
        finally {
            if ( backtracking>0 ) { memoize(input, 8, stringLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end stringLiteral


 

    public static final BitSet FOLLOW_connect_in_stat97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disconnect_in_stat104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setEnv_in_stat112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_help_in_stat119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_in_stat127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_connect155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_HostName_in_connect159 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_connect161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Integer_in_connect165 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_connect168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_connect170 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ObjectName_in_connect174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_connect176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EnvironmentName_in_connect180 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_connect183 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_connect185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ObjectName_in_connect189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_disconnect214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_setEnv233 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ObjectName_in_setEnv237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_setEnv239 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_stringLiteral_in_setEnv243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_help263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_fetch285 = new BitSet(new long[]{0x0000000004800040L});
    public static final BitSet FOLLOW_23_in_fetch289 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fetch291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Integer_in_fetch295 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_fetch297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_fetch301 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fetch303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Integer_in_fetch307 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_fetch309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ObjectName_in_fetch315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_exit338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_stringLiteral371 = new BitSet(new long[]{0x0000000000000002L});

}