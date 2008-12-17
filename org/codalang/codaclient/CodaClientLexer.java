// $ANTLR 3.0.1 /Users/michaelarace/CodaClient/CodaClient.g 2008-04-16 22:04:52

	package org.codalang.codaclient;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CodaClientLexer extends Lexer {
    public static final int T21=21;
    public static final int T14=14;
    public static final int T22=22;
    public static final int T11=11;
    public static final int EnvironmentName=7;
    public static final int ObjectName=6;
    public static final int WS=10;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T25=25;
    public static final int T18=18;
    public static final int HostName=4;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int UnicodeStringLiteral=8;
    public static final int T17=17;
    public static final int Tokens=28;
    public static final int Integer=5;
    public static final int T16=16;
    public static final int T27=27;
    public static final int T24=24;
    public static final int ASCIIStringLiteral=9;
    public static final int T19=19;

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

    public CodaClientLexer() {;} 
    public CodaClientLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/michaelarace/CodaClient/CodaClient.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // /Users/michaelarace/CodaClient/CodaClient.g:44:5: ( 'CONNECT' )
            // /Users/michaelarace/CodaClient/CodaClient.g:44:7: 'CONNECT'
            {
            match("CONNECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // /Users/michaelarace/CodaClient/CodaClient.g:45:5: ( ':' )
            // /Users/michaelarace/CodaClient/CodaClient.g:45:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // /Users/michaelarace/CodaClient/CodaClient.g:46:5: ( 'TO' )
            // /Users/michaelarace/CodaClient/CodaClient.g:46:7: 'TO'
            {
            match("TO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // /Users/michaelarace/CodaClient/CodaClient.g:47:5: ( 'APPLICATION' )
            // /Users/michaelarace/CodaClient/CodaClient.g:47:7: 'APPLICATION'
            {
            match("APPLICATION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // /Users/michaelarace/CodaClient/CodaClient.g:48:5: ( '.' )
            // /Users/michaelarace/CodaClient/CodaClient.g:48:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // /Users/michaelarace/CodaClient/CodaClient.g:49:5: ( 'IN' )
            // /Users/michaelarace/CodaClient/CodaClient.g:49:7: 'IN'
            {
            match("IN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // /Users/michaelarace/CodaClient/CodaClient.g:50:5: ( 'GROUP' )
            // /Users/michaelarace/CodaClient/CodaClient.g:50:7: 'GROUP'
            {
            match("GROUP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // /Users/michaelarace/CodaClient/CodaClient.g:51:5: ( 'DISCONNECT' )
            // /Users/michaelarace/CodaClient/CodaClient.g:51:7: 'DISCONNECT'
            {
            match("DISCONNECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // /Users/michaelarace/CodaClient/CodaClient.g:52:5: ( 'SETENV' )
            // /Users/michaelarace/CodaClient/CodaClient.g:52:7: 'SETENV'
            {
            match("SETENV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // /Users/michaelarace/CodaClient/CodaClient.g:53:5: ( '=' )
            // /Users/michaelarace/CodaClient/CodaClient.g:53:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // /Users/michaelarace/CodaClient/CodaClient.g:54:5: ( 'HELP' )
            // /Users/michaelarace/CodaClient/CodaClient.g:54:7: 'HELP'
            {
            match("HELP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // /Users/michaelarace/CodaClient/CodaClient.g:55:5: ( 'FETCH' )
            // /Users/michaelarace/CodaClient/CodaClient.g:55:7: 'FETCH'
            {
            match("FETCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // /Users/michaelarace/CodaClient/CodaClient.g:56:5: ( 'DATA' )
            // /Users/michaelarace/CodaClient/CodaClient.g:56:7: 'DATA'
            {
            match("DATA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // /Users/michaelarace/CodaClient/CodaClient.g:57:5: ( '[' )
            // /Users/michaelarace/CodaClient/CodaClient.g:57:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // /Users/michaelarace/CodaClient/CodaClient.g:58:5: ( ']' )
            // /Users/michaelarace/CodaClient/CodaClient.g:58:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // /Users/michaelarace/CodaClient/CodaClient.g:59:5: ( 'ERROR' )
            // /Users/michaelarace/CodaClient/CodaClient.g:59:7: 'ERROR'
            {
            match("ERROR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // /Users/michaelarace/CodaClient/CodaClient.g:60:5: ( 'EXIT' )
            // /Users/michaelarace/CodaClient/CodaClient.g:60:7: 'EXIT'
            {
            match("EXIT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start Integer
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            // /Users/michaelarace/CodaClient/CodaClient.g:236:9: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("236:1: Integer : ( '0' | '1' .. '9' ( '0' .. '9' )* );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:236:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:236:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // /Users/michaelarace/CodaClient/CodaClient.g:236:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/michaelarace/CodaClient/CodaClient.g:236:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Integer

    // $ANTLR start ObjectName
    public final void mObjectName() throws RecognitionException {
        try {
            int _type = ObjectName;
            // /Users/michaelarace/CodaClient/CodaClient.g:239:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/michaelarace/CodaClient/CodaClient.g:239:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/michaelarace/CodaClient/CodaClient.g:239:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ObjectName

    // $ANTLR start HostName
    public final void mHostName() throws RecognitionException {
        try {
            int _type = HostName;
            // /Users/michaelarace/CodaClient/CodaClient.g:241:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+ )
            // /Users/michaelarace/CodaClient/CodaClient.g:241:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            {
            // /Users/michaelarace/CodaClient/CodaClient.g:241:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HostName

    // $ANTLR start ASCIIStringLiteral
    public final void mASCIIStringLiteral() throws RecognitionException {
        try {
            int _type = ASCIIStringLiteral;
            // /Users/michaelarace/CodaClient/CodaClient.g:244:5: ( '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /Users/michaelarace/CodaClient/CodaClient.g:245:5: '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('\''); 
            // /Users/michaelarace/CodaClient/CodaClient.g:245:10: (~ '\\'' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:245:11: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 
            // /Users/michaelarace/CodaClient/CodaClient.g:245:24: ( '\\'' (~ '\\'' )* '\\'' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:245:26: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/michaelarace/CodaClient/CodaClient.g:245:31: (~ '\\'' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFE')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /Users/michaelarace/CodaClient/CodaClient.g:245:32: ~ '\\''
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASCIIStringLiteral

    // $ANTLR start UnicodeStringLiteral
    public final void mUnicodeStringLiteral() throws RecognitionException {
        try {
            int _type = UnicodeStringLiteral;
            // /Users/michaelarace/CodaClient/CodaClient.g:249:5: ( 'U' '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /Users/michaelarace/CodaClient/CodaClient.g:250:5: 'U' '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('U'); 
            match('\''); 
            // /Users/michaelarace/CodaClient/CodaClient.g:250:14: (~ '\\'' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:250:15: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\''); 
            // /Users/michaelarace/CodaClient/CodaClient.g:250:28: ( '\\'' (~ '\\'' )* '\\'' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:250:30: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/michaelarace/CodaClient/CodaClient.g:250:35: (~ '\\'' )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFE')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // /Users/michaelarace/CodaClient/CodaClient.g:250:36: ~ '\\''
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UnicodeStringLiteral

    // $ANTLR start EnvironmentName
    public final void mEnvironmentName() throws RecognitionException {
        try {
            int _type = EnvironmentName;
            // /Users/michaelarace/CodaClient/CodaClient.g:255:2: ( 'DEV' | 'TEST' | 'PROD' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 'D':
                {
                alt11=1;
                }
                break;
            case 'T':
                {
                alt11=2;
                }
                break;
            case 'P':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("254:1: EnvironmentName : ( 'DEV' | 'TEST' | 'PROD' );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:255:4: 'DEV'
                    {
                    match("DEV"); 


                    }
                    break;
                case 2 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:255:12: 'TEST'
                    {
                    match("TEST"); 


                    }
                    break;
                case 3 :
                    // /Users/michaelarace/CodaClient/CodaClient.g:255:21: 'PROD'
                    {
                    match("PROD"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EnvironmentName

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/michaelarace/CodaClient/CodaClient.g:257:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/michaelarace/CodaClient/CodaClient.g:257:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/michaelarace/CodaClient/CodaClient.g:257:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/michaelarace/CodaClient/CodaClient.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

              channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // /Users/michaelarace/CodaClient/CodaClient.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | Integer | ObjectName | HostName | ASCIIStringLiteral | UnicodeStringLiteral | EnvironmentName | WS )
        int alt13=24;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:78: Integer
                {
                mInteger(); 

                }
                break;
            case 19 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:86: ObjectName
                {
                mObjectName(); 

                }
                break;
            case 20 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:97: HostName
                {
                mHostName(); 

                }
                break;
            case 21 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:106: ASCIIStringLiteral
                {
                mASCIIStringLiteral(); 

                }
                break;
            case 22 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:125: UnicodeStringLiteral
                {
                mUnicodeStringLiteral(); 

                }
                break;
            case 23 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:146: EnvironmentName
                {
                mEnvironmentName(); 

                }
                break;
            case 24 :
                // /Users/michaelarace/CodaClient/CodaClient.g:1:162: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\31\1\uffff\2\31\1\36\4\31\1\uffff\2\31\2\uffff\1\31\2"+
        "\51\1\31\2\uffff\2\31\1\uffff\1\31\1\uffff\1\31\1\56\2\31\1\uffff"+
        "\1\61\11\31\1\uffff\1\51\1\uffff\2\31\1\uffff\2\31\1\uffff\17\31"+
        "\1\114\1\31\1\116\1\31\1\120\4\31\1\124\1\31\1\uffff\1\31\1\uffff"+
        "\1\127\1\uffff\1\130\2\31\1\uffff\1\31\1\134\2\uffff\1\135\2\31"+
        "\2\uffff\5\31\1\145\1\146\2\uffff";
    static final String DFA13_eofS =
        "\147\uffff";
    static final String DFA13_minS =
        "\1\11\1\55\1\uffff\7\55\1\uffff\2\55\2\uffff\3\55\1\47\2\uffff\2"+
        "\55\1\uffff\1\55\1\uffff\4\55\1\uffff\12\55\1\uffff\1\55\1\uffff"+
        "\2\55\1\uffff\2\55\1\uffff\32\55\1\uffff\1\55\1\uffff\1\55\1\uffff"+
        "\3\55\1\uffff\2\55\2\uffff\3\55\2\uffff\7\55\2\uffff";
    static final String DFA13_maxS =
        "\2\172\1\uffff\7\172\1\uffff\2\172\2\uffff\4\172\2\uffff\2\172\1"+
        "\uffff\1\172\1\uffff\4\172\1\uffff\12\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff\2\172\1\uffff\32\172\1\uffff\1\172\1\uffff\1\172"+
        "\1\uffff\3\172\1\uffff\2\172\2\uffff\3\172\2\uffff\7\172\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\7\uffff\1\12\2\uffff\1\16\1\17\4\uffff\1\24\1\25\2"+
        "\uffff\1\30\1\uffff\1\23\4\uffff\1\5\12\uffff\1\22\1\uffff\1\26"+
        "\2\uffff\1\3\2\uffff\1\6\32\uffff\1\15\1\uffff\1\13\1\uffff\1\21"+
        "\3\uffff\1\7\2\uffff\1\14\1\20\3\uffff\1\11\1\1\7\uffff\1\10\1\4";
    static final String DFA13_specialS =
        "\147\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\6\uffff\1\24\5\uffff\1\23\1"+
            "\5\1\uffff\1\20\11\21\1\2\2\uffff\1\12\3\uffff\1\4\1\26\1\1"+
            "\1\10\1\17\1\14\1\7\1\13\1\6\6\26\1\25\2\26\1\11\1\3\1\22\5"+
            "\26\1\15\1\uffff\1\16\3\uffff\32\26",
            "\2\23\1\uffff\12\32\7\uffff\16\32\1\30\13\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\34\11\32\1\33\13\32\6\uffff"+
            "\32\32",
            "\2\23\1\uffff\12\32\7\uffff\17\32\1\35\12\32\6\uffff\32\32",
            "\2\23\1\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\37\14\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\21\32\1\40\10\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\1\42\3\32\1\43\3\32\1\41\21\32\6"+
            "\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\44\25\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\45\25\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\46\25\32\6\uffff\32\32",
            "",
            "",
            "\2\23\1\uffff\12\32\7\uffff\21\32\1\50\5\32\1\47\2\32\6\uffff"+
            "\32\32",
            "\2\23\1\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
            "\2\23\1\uffff\12\52\7\uffff\32\23\6\uffff\32\23",
            "\1\53\5\uffff\2\23\1\uffff\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "\2\23\1\uffff\12\32\7\uffff\21\32\1\54\10\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\55\14\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\32\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\22\32\1\57\7\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\17\32\1\60\12\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\16\32\1\62\13\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\22\32\1\63\7\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\64\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\25\32\1\65\4\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\66\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\13\32\1\67\16\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\70\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\10\32\1\71\21\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\21\32\1\72\10\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\52\7\uffff\32\23\6\uffff\32\23",
            "",
            "\2\23\1\uffff\12\32\7\uffff\16\32\1\73\13\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\74\14\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\75\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\13\32\1\76\16\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\24\32\1\77\5\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\2\32\1\100\27\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\1\101\31\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\102\25\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\17\32\1\103\12\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\2\32\1\104\27\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\105\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\16\32\1\106\13\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\3\32\1\107\26\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\110\25\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\10\32\1\111\21\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\17\32\1\112\12\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\16\32\1\113\13\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\115\14\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\7\32\1\117\22\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\21\32\1\121\10\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\2\32\1\122\27\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\2\32\1\123\27\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\125\14\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\25\32\1\126\4\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\131\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\1\132\31\32\6\uffff\32\32",
            "",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\133\14\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "",
            "",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\136\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\4\32\1\137\25\32\6\uffff\32\32",
            "",
            "",
            "\2\23\1\uffff\12\32\7\uffff\10\32\1\140\21\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\2\32\1\141\27\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\16\32\1\142\13\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\23\32\1\143\6\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\15\32\1\144\14\32\6\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "\2\23\1\uffff\12\32\7\uffff\32\32\4\uffff\1\31\1\uffff\32\32",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | Integer | ObjectName | HostName | ASCIIStringLiteral | UnicodeStringLiteral | EnvironmentName | WS );";
        }
    }
 

}