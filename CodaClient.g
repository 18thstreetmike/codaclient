grammar CodaClient;

/*
 * CodaServer and related original technologies are copyright 2008, 18th Street Software, LLC.
 *
 * Permission to use them is granted under the terms of the GNU GPLv2.
*/

options {
   output = template;
   k=2; 
   backtrack=true; 
   memoize=true;
}
@lexer::header {
	package org.codalang.codaclient;
}

@header{
	package org.codalang.codaclient;
	
	import java.io.IOException;
	import org.codalang.codaclient.*;
	import java.util.Iterator;
	import java.util.Vector;
	import java.util.Hashtable;
}

@lexer::members {
	public String getErrorMessage(RecognitionException e, String[]  tokenNames) {
		String msg = null;
              	if ( e instanceof MismatchedTokenException ) {
               		MismatchedTokenException mte = (MismatchedTokenException)e;
                        msg = "invalid token "+getCharErrorDisplay(e.c)+" expecting "+getCharErrorDisplay(mte.expecting);
                 } else if ( e instanceof NoViableAltException ) {
                         NoViableAltException nvae = (NoViableAltException)e;
                         // for development, can add "decision=<<"+nvae.grammarDecisionDescription+">>"
                         // and "(decision="+nvae.decisionNumber+") and
                         // "state "+nvae.stateNumber
                         msg = "no viable alternative at token "+getCharErrorDisplay(e.c);
                 } else if ( e instanceof EarlyExitException ) {
                         EarlyExitException eee = (EarlyExitException)e;
                         // for development, can add "(decision="+eee.decisionNumber+")"
                         msg = "unexpected token "+getCharErrorDisplay(e.c);
                 } else if ( e instanceof MismatchedNotSetException ) {
                         MismatchedNotSetException mse = (MismatchedNotSetException)e;
                         msg = "invalid token "+getCharErrorDisplay(e.c)+" expecting "+mse.expecting;
                 } else if ( e instanceof MismatchedSetException ) {
                         MismatchedSetException mse = (MismatchedSetException)e;
                         msg = "invalid token "+getCharErrorDisplay(e.c)+" expecting "+mse.expecting;
                 } else if ( e instanceof MismatchedRangeException ) {
                         MismatchedRangeException mre = (MismatchedRangeException)e;
                         msg = "invalid token "+getCharErrorDisplay(e.c)+" expecting "+
                                 getCharErrorDisplay(mre.a)+".."+getCharErrorDisplay(mre.b);
                 } else {
                         // msg = super.getErrorMessage(e, tokenNames);
                         msg = "";
                 }
                 return msg;
	}
	
	public String getErrorHeader(RecognitionException e) {
		return "Line " + e.line + ", Pos " + e.charPositionInLine + ":";

    	}
}

@members {
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
	
}

@rulecatch {
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

    
}

stat	returns [boolean response]:
	( connectResp=connect
	| disconnectResp=disconnect 
	| setEnvResp=setEnv
	| helpResp=help 
	| fetchResp=fetch
	| exitResp=exit) 
	{
		$response = false;
		if (connectResp != null) {
			$response = true;
		} else if (disconnectResp != null) {
			$response = true;
		} else if (helpResp != null) {
			$response = true;
		} else if (fetchResp != null) {
			$response = true;
		} else if (exitResp != null) {
			$response = true;
		} else if (setEnvResp != null) {
			$response = true;
		} 
		
	} 
	;

connect returns [boolean response]
	:	'CONNECT' hn=HostName ':' po=Integer ('TO' 'APPLICATION' app=ObjectName '.' env=EnvironmentName ('IN' 'GROUP' gn=ObjectName )? )?
		{
			$response = false;
			client.setHostname(hn != null ? $hn.text : "localhost");
			try {
				client.setPort(po != null ? java.lang.Integer.parseInt($po.text) : 3407);
			} catch (Exception e) {
				client.setPort(3407);
			}
			client.setApplication(app != null ? $app.text : null);
			client.setEnvironment(env != null ? $env.text : null);
			client.setGroupName(gn != null ? $gn.text : null);
			try {
				if (client.connect()) {
					$response = true;
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
	;

disconnect returns [boolean response]
	:	'DISCONNECT'
		{
			$response = false;
			try {
				if(client.disconnect()) {
					System.out.println("Connection closed!\n");
					$response = true;
				} else {
					System.out.println("Not currently connected.\n");
				}
			} catch (Exception e) {
				// error displayed by client
			}
			
		}
	;

setEnv returns [boolean response]
	:	'SETENV' var=ObjectName '=' value=stringLiteral
		{
			$response = client.setEnv($var.text, $value.value);
		}
	;

help returns [boolean response] 
	:	'HELP' 
		{
			client.help();
			$response = true;
		}
	;
	
fetch returns [boolean response] 
	:	'FETCH' ( 'DATA' '[' dataIndex=Integer ']' | 'ERROR' '[' errorIndex=Integer ']' | var=ObjectName)
		{
			if (var != null) {
				client.fetch($var.text);
			} else {
				client.fetch(($dataIndex.text == null ? $errorIndex.text : $dataIndex.text), ($dataIndex.text == null ? false : true));
			}
			$response = true;
		}
	;	
	
exit returns [boolean response] 
	:	'EXIT' 
		{
			client.exit();
			$response = true;
		}
	;
	
stringLiteral returns [String value]
    :
      	v=(UnicodeStringLiteral | ASCIIStringLiteral)
      	{
      		$value=$v.text.substring(1, $v.text.length() - 1).replace("''", "'");
      	}
    ;

Integer	:	'0' | '1'..'9' ('0'..'9')*;

ObjectName
	:	('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' )*;

HostName:	('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '.' )+;

ASCIIStringLiteral
    :
    '\'' (~'\'')* '\'' ( '\'' (~'\'')* '\'' )*
    //'\'' (EscapeSequence | ~('\'\'') )* '\''
    ;
UnicodeStringLiteral 
    :
    'U' '\'' (~'\'')* '\'' ( '\'' (~'\'')* '\'' )*
    //'U' '\'' (EscapeSequence | ~('\''|'\\') )* '\''
    ;	

EnvironmentName 
	:	'DEV' | 'TEST' | 'PROD';

WS : ( ' ' | '\t' | '\n' | '\r' )+
     {  $channel=HIDDEN; }
   ;
