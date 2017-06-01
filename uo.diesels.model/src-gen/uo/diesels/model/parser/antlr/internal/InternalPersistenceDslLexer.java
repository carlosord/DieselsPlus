package uo.diesels.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceDslLexer extends Lexer {
    public static final int RULE_SET=6;
    public static final int RULE_STRING=16;
    public static final int RULE_TYPE_CHAR=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_TYPE_STRING=12;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_TYPE_INT=7;
    public static final int RULE_ID=4;
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=10;
    public static final int RULE_WS=19;
    public static final int RULE_TYPE_FLOAT=9;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_TYPE_BOOLEAN=13;
    public static final int RULE_DATE=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_TYPE_DOUBLE=8;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalPersistenceDslLexer() {;} 
    public InternalPersistenceDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPersistenceDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPersistenceDsl.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:11:7: ( 'Finder' )
            // InternalPersistenceDsl.g:11:9: 'Finder'
            {
            match("Finder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:12:7: ( '{' )
            // InternalPersistenceDsl.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:13:7: ( '}' )
            // InternalPersistenceDsl.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:14:7: ( '(' )
            // InternalPersistenceDsl.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:15:7: ( ',' )
            // InternalPersistenceDsl.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:16:7: ( ')' )
            // InternalPersistenceDsl.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:17:7: ( 'non-null' )
            // InternalPersistenceDsl.g:17:9: 'non-null'
            {
            match("non-null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:18:7: ( '#' )
            // InternalPersistenceDsl.g:18:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:19:7: ( '<' )
            // InternalPersistenceDsl.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:20:7: ( '>' )
            // InternalPersistenceDsl.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_LIST"
    public final void mRULE_LIST() throws RecognitionException {
        try {
            int _type = RULE_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1475:11: ( 'List' )
            // InternalPersistenceDsl.g:1475:13: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIST"

    // $ANTLR start "RULE_SET"
    public final void mRULE_SET() throws RecognitionException {
        try {
            int _type = RULE_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1477:10: ( 'Set' )
            // InternalPersistenceDsl.g:1477:12: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SET"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1479:11: ( 'Date' )
            // InternalPersistenceDsl.g:1479:13: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_TYPE_INT"
    public final void mRULE_TYPE_INT() throws RecognitionException {
        try {
            int _type = RULE_TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1481:15: ( 'Integer' )
            // InternalPersistenceDsl.g:1481:17: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_INT"

    // $ANTLR start "RULE_TYPE_LONG"
    public final void mRULE_TYPE_LONG() throws RecognitionException {
        try {
            int _type = RULE_TYPE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1483:16: ( 'Long' )
            // InternalPersistenceDsl.g:1483:18: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_LONG"

    // $ANTLR start "RULE_TYPE_DOUBLE"
    public final void mRULE_TYPE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_TYPE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1485:18: ( 'Double' )
            // InternalPersistenceDsl.g:1485:20: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_DOUBLE"

    // $ANTLR start "RULE_TYPE_FLOAT"
    public final void mRULE_TYPE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_TYPE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1487:17: ( 'Float' )
            // InternalPersistenceDsl.g:1487:19: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_FLOAT"

    // $ANTLR start "RULE_TYPE_CHAR"
    public final void mRULE_TYPE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_TYPE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1489:16: ( 'Character' )
            // InternalPersistenceDsl.g:1489:18: 'Character'
            {
            match("Character"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_CHAR"

    // $ANTLR start "RULE_TYPE_STRING"
    public final void mRULE_TYPE_STRING() throws RecognitionException {
        try {
            int _type = RULE_TYPE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1491:18: ( 'String' )
            // InternalPersistenceDsl.g:1491:20: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_STRING"

    // $ANTLR start "RULE_TYPE_BOOLEAN"
    public final void mRULE_TYPE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_TYPE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1493:19: ( 'Boolean' )
            // InternalPersistenceDsl.g:1493:21: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1495:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPersistenceDsl.g:1495:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPersistenceDsl.g:1495:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPersistenceDsl.g:1495:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPersistenceDsl.g:1495:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPersistenceDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1497:10: ( ( '0' .. '9' )+ )
            // InternalPersistenceDsl.g:1497:12: ( '0' .. '9' )+
            {
            // InternalPersistenceDsl.g:1497:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1497:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1499:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPersistenceDsl.g:1499:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPersistenceDsl.g:1499:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPersistenceDsl.g:1499:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPersistenceDsl.g:1499:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPersistenceDsl.g:1499:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPersistenceDsl.g:1499:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:1499:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPersistenceDsl.g:1499:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPersistenceDsl.g:1499:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPersistenceDsl.g:1499:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1501:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPersistenceDsl.g:1501:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPersistenceDsl.g:1501:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1501:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1503:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPersistenceDsl.g:1503:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPersistenceDsl.g:1503:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1503:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPersistenceDsl.g:1503:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPersistenceDsl.g:1503:41: ( '\\r' )? '\\n'
                    {
                    // InternalPersistenceDsl.g:1503:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPersistenceDsl.g:1503:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1505:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPersistenceDsl.g:1505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPersistenceDsl.g:1505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPersistenceDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPersistenceDsl.g:1507:16: ( . )
            // InternalPersistenceDsl.g:1507:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPersistenceDsl.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_LIST | RULE_SET | RULE_DATE | RULE_TYPE_INT | RULE_TYPE_LONG | RULE_TYPE_DOUBLE | RULE_TYPE_FLOAT | RULE_TYPE_CHAR | RULE_TYPE_STRING | RULE_TYPE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=27;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPersistenceDsl.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalPersistenceDsl.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalPersistenceDsl.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalPersistenceDsl.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalPersistenceDsl.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalPersistenceDsl.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalPersistenceDsl.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalPersistenceDsl.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalPersistenceDsl.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalPersistenceDsl.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalPersistenceDsl.g:1:70: RULE_LIST
                {
                mRULE_LIST(); 

                }
                break;
            case 12 :
                // InternalPersistenceDsl.g:1:80: RULE_SET
                {
                mRULE_SET(); 

                }
                break;
            case 13 :
                // InternalPersistenceDsl.g:1:89: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 14 :
                // InternalPersistenceDsl.g:1:99: RULE_TYPE_INT
                {
                mRULE_TYPE_INT(); 

                }
                break;
            case 15 :
                // InternalPersistenceDsl.g:1:113: RULE_TYPE_LONG
                {
                mRULE_TYPE_LONG(); 

                }
                break;
            case 16 :
                // InternalPersistenceDsl.g:1:128: RULE_TYPE_DOUBLE
                {
                mRULE_TYPE_DOUBLE(); 

                }
                break;
            case 17 :
                // InternalPersistenceDsl.g:1:145: RULE_TYPE_FLOAT
                {
                mRULE_TYPE_FLOAT(); 

                }
                break;
            case 18 :
                // InternalPersistenceDsl.g:1:161: RULE_TYPE_CHAR
                {
                mRULE_TYPE_CHAR(); 

                }
                break;
            case 19 :
                // InternalPersistenceDsl.g:1:176: RULE_TYPE_STRING
                {
                mRULE_TYPE_STRING(); 

                }
                break;
            case 20 :
                // InternalPersistenceDsl.g:1:193: RULE_TYPE_BOOLEAN
                {
                mRULE_TYPE_BOOLEAN(); 

                }
                break;
            case 21 :
                // InternalPersistenceDsl.g:1:211: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalPersistenceDsl.g:1:219: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalPersistenceDsl.g:1:228: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalPersistenceDsl.g:1:240: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalPersistenceDsl.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalPersistenceDsl.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalPersistenceDsl.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\33\5\uffff\1\33\3\uffff\6\33\1\30\2\uffff\3\30\2\uffff\2\33\6\uffff\1\33\3\uffff\11\33\5\uffff\5\33\1\104\10\33\1\uffff\1\115\1\116\1\uffff\1\33\1\120\5\33\1\126\2\uffff\1\33\1\uffff\4\33\1\134\1\uffff\1\135\1\136\3\33\3\uffff\1\142\1\33\1\144\1\uffff\1\33\1\uffff\1\146\1\uffff";
    static final String DFA12_eofS =
        "\147\uffff";
    static final String DFA12_minS =
        "\1\0\1\151\5\uffff\1\157\3\uffff\1\151\1\145\1\141\1\156\1\150\1\157\1\101\2\uffff\2\0\1\52\2\uffff\1\156\1\157\6\uffff\1\156\3\uffff\1\163\1\156\1\164\1\162\1\164\1\165\1\164\1\141\1\157\5\uffff\1\144\1\141\1\55\1\164\1\147\1\60\1\151\1\145\1\142\1\145\1\162\1\154\1\145\1\164\1\uffff\2\60\1\uffff\1\156\1\60\1\154\1\147\1\141\1\145\1\162\1\60\2\uffff\1\147\1\uffff\2\145\1\143\1\141\1\60\1\uffff\2\60\1\162\1\164\1\156\3\uffff\1\60\1\145\1\60\1\uffff\1\162\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\154\5\uffff\1\157\3\uffff\1\157\1\164\1\157\1\156\1\150\1\157\1\172\2\uffff\2\uffff\1\57\2\uffff\1\156\1\157\6\uffff\1\156\3\uffff\1\163\1\156\1\164\1\162\1\164\1\165\1\164\1\141\1\157\5\uffff\1\144\1\141\1\55\1\164\1\147\1\172\1\151\1\145\1\142\1\145\1\162\1\154\1\145\1\164\1\uffff\2\172\1\uffff\1\156\1\172\1\154\1\147\1\141\1\145\1\162\1\172\2\uffff\1\147\1\uffff\2\145\1\143\1\141\1\172\1\uffff\2\172\1\162\1\164\1\156\3\uffff\1\172\1\145\1\172\1\uffff\1\162\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\7\uffff\1\25\1\26\3\uffff\1\32\1\33\2\uffff\1\25\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\11\uffff\1\26\1\27\1\30\1\31\1\32\16\uffff\1\7\2\uffff\1\14\10\uffff\1\13\1\17\1\uffff\1\15\5\uffff\1\21\5\uffff\1\1\1\23\1\20\3\uffff\1\16\1\uffff\1\24\1\uffff\1\22";
    static final String DFA12_specialS =
        "\1\1\23\uffff\1\2\1\0\121\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\1\10\3\30\1\25\1\4\1\6\2\30\1\5\2\30\1\26\12\23\2\30\1\11\1\30\1\12\2\30\1\22\1\20\1\17\1\15\1\22\1\1\2\22\1\16\2\22\1\13\6\22\1\14\7\22\3\30\1\21\1\22\1\30\15\22\1\7\14\22\1\2\1\30\1\3\uff82\30",
            "\1\31\2\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "",
            "",
            "",
            "\1\45\5\uffff\1\46",
            "\1\47\16\uffff\1\50",
            "\1\51\15\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\117",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\143",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\145",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_LIST | RULE_SET | RULE_DATE | RULE_TYPE_INT | RULE_TYPE_LONG | RULE_TYPE_DOUBLE | RULE_TYPE_FLOAT | RULE_TYPE_CHAR | RULE_TYPE_STRING | RULE_TYPE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='F') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='(') ) {s = 4;}

                        else if ( (LA12_0==',') ) {s = 5;}

                        else if ( (LA12_0==')') ) {s = 6;}

                        else if ( (LA12_0=='n') ) {s = 7;}

                        else if ( (LA12_0=='#') ) {s = 8;}

                        else if ( (LA12_0=='<') ) {s = 9;}

                        else if ( (LA12_0=='>') ) {s = 10;}

                        else if ( (LA12_0=='L') ) {s = 11;}

                        else if ( (LA12_0=='S') ) {s = 12;}

                        else if ( (LA12_0=='D') ) {s = 13;}

                        else if ( (LA12_0=='I') ) {s = 14;}

                        else if ( (LA12_0=='C') ) {s = 15;}

                        else if ( (LA12_0=='B') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( (LA12_0=='A'||LA12_0=='E'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='z')) ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\"') ) {s = 20;}

                        else if ( (LA12_0=='\'') ) {s = 21;}

                        else if ( (LA12_0=='/') ) {s = 22;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 23;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||LA12_0=='='||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}