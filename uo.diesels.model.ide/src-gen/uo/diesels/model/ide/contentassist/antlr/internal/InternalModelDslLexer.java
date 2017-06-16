package uo.diesels.model.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelDslLexer extends Lexer {
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=11;
    public static final int RULE_ID=19;
    public static final int RULE_TYPE_BOOLEAN=14;
    public static final int RULE_DATE=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=21;
    public static final int T__29=29;
    public static final int RULE_ONE=16;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SET=6;
    public static final int RULE_ENUMERATE=20;
    public static final int RULE_STRING=22;
    public static final int RULE_TYPE_CHAR=12;
    public static final int RULE_ONE_ONE=18;
    public static final int RULE_SL_COMMENT=24;
    public static final int T__37=37;
    public static final int RULE_TYPE_STRING=13;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_VOID=7;
    public static final int T__31=31;
    public static final int RULE_TYPE_INT=8;
    public static final int T__32=32;
    public static final int RULE_MANY=17;
    public static final int RULE_WS=25;
    public static final int RULE_TYPE_FLOAT=10;
    public static final int RULE_TYPE_BINARY=15;
    public static final int RULE_ANY_OTHER=26;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_TYPE_DOUBLE=9;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalModelDslLexer() {;} 
    public InternalModelDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalModelDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalModelDsl.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:11:7: ( 'navigable' )
            // InternalModelDsl.g:11:9: 'navigable'
            {
            match("navigable"); 


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
            // InternalModelDsl.g:12:7: ( 'non-navigable' )
            // InternalModelDsl.g:12:9: 'non-navigable'
            {
            match("non-navigable"); 


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
            // InternalModelDsl.g:13:7: ( 'nullable' )
            // InternalModelDsl.g:13:9: 'nullable'
            {
            match("nullable"); 


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
            // InternalModelDsl.g:14:7: ( 'non-nullable' )
            // InternalModelDsl.g:14:9: 'non-nullable'
            {
            match("non-nullable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:15:7: ( 'Entity' )
            // InternalModelDsl.g:15:9: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:16:7: ( '{' )
            // InternalModelDsl.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:17:7: ( '}' )
            // InternalModelDsl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:18:7: ( 'extends' )
            // InternalModelDsl.g:18:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:19:7: ( 'EntityLink' )
            // InternalModelDsl.g:19:9: 'EntityLink'
            {
            match("EntityLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:20:7: ( 'ValueType' )
            // InternalModelDsl.g:20:9: 'ValueType'
            {
            match("ValueType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:21:7: ( 'Enumerable' )
            // InternalModelDsl.g:21:9: 'Enumerable'
            {
            match("Enumerable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:22:7: ( 'Link' )
            // InternalModelDsl.g:22:9: 'Link'
            {
            match("Link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:23:7: ( 'id' )
            // InternalModelDsl.g:23:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:24:7: ( 'Link.' )
            // InternalModelDsl.g:24:9: 'Link.'
            {
            match("Link."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:25:7: ( '(' )
            // InternalModelDsl.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:26:7: ( ')' )
            // InternalModelDsl.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:27:7: ( ',' )
            // InternalModelDsl.g:27:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:28:7: ( '<' )
            // InternalModelDsl.g:28:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:29:7: ( '>' )
            // InternalModelDsl.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:30:7: ( 'abstract' )
            // InternalModelDsl.g:30:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_ONE"
    public final void mRULE_ONE() throws RecognitionException {
        try {
            int _type = RULE_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5021:10: ( 'one' )
            // InternalModelDsl.g:5021:12: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE"

    // $ANTLR start "RULE_MANY"
    public final void mRULE_MANY() throws RecognitionException {
        try {
            int _type = RULE_MANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5023:11: ( 'many' )
            // InternalModelDsl.g:5023:13: 'many'
            {
            match("many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MANY"

    // $ANTLR start "RULE_ONE_ONE"
    public final void mRULE_ONE_ONE() throws RecognitionException {
        try {
            int _type = RULE_ONE_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5025:14: ( 'one-one' )
            // InternalModelDsl.g:5025:16: 'one-one'
            {
            match("one-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_ONE"

    // $ANTLR start "RULE_LIST"
    public final void mRULE_LIST() throws RecognitionException {
        try {
            int _type = RULE_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5027:11: ( 'List' )
            // InternalModelDsl.g:5027:13: 'List'
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
            // InternalModelDsl.g:5029:10: ( 'Set' )
            // InternalModelDsl.g:5029:12: 'Set'
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
            // InternalModelDsl.g:5031:11: ( 'Date' )
            // InternalModelDsl.g:5031:13: 'Date'
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

    // $ANTLR start "RULE_VOID"
    public final void mRULE_VOID() throws RecognitionException {
        try {
            int _type = RULE_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5033:11: ( 'void' )
            // InternalModelDsl.g:5033:13: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOID"

    // $ANTLR start "RULE_TYPE_INT"
    public final void mRULE_TYPE_INT() throws RecognitionException {
        try {
            int _type = RULE_TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5035:15: ( 'Integer' )
            // InternalModelDsl.g:5035:17: 'Integer'
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
            // InternalModelDsl.g:5037:16: ( 'Long' )
            // InternalModelDsl.g:5037:18: 'Long'
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
            // InternalModelDsl.g:5039:18: ( 'Double' )
            // InternalModelDsl.g:5039:20: 'Double'
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
            // InternalModelDsl.g:5041:17: ( 'Float' )
            // InternalModelDsl.g:5041:19: 'Float'
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
            // InternalModelDsl.g:5043:16: ( 'Character' )
            // InternalModelDsl.g:5043:18: 'Character'
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
            // InternalModelDsl.g:5045:18: ( 'String' )
            // InternalModelDsl.g:5045:20: 'String'
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
            // InternalModelDsl.g:5047:19: ( 'Boolean' )
            // InternalModelDsl.g:5047:21: 'Boolean'
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

    // $ANTLR start "RULE_TYPE_BINARY"
    public final void mRULE_TYPE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_TYPE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5049:18: ( 'Binary' )
            // InternalModelDsl.g:5049:20: 'Binary'
            {
            match("Binary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_BINARY"

    // $ANTLR start "RULE_ENUMERATE"
    public final void mRULE_ENUMERATE() throws RecognitionException {
        try {
            int _type = RULE_ENUMERATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5051:16: ( ( 'A' .. 'Z' | '\\u00D1' | '_' ) ( 'A' .. 'Z' | '0' .. '9' | '\\u00D1' | '_' )* )
            // InternalModelDsl.g:5051:18: ( 'A' .. 'Z' | '\\u00D1' | '_' ) ( 'A' .. 'Z' | '0' .. '9' | '\\u00D1' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||input.LA(1)=='\u00D1' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalModelDsl.g:5051:42: ( 'A' .. 'Z' | '0' .. '9' | '\\u00D1' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||LA1_0=='\u00D1') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModelDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||input.LA(1)=='\u00D1' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENUMERATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelDsl.g:5053:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalModelDsl.g:5053:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalModelDsl.g:5053:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelDsl.g:5053:11: '^'
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

            // InternalModelDsl.g:5053:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModelDsl.g:
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
            	    break loop3;
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
            // InternalModelDsl.g:5055:10: ( ( '0' .. '9' )+ )
            // InternalModelDsl.g:5055:12: ( '0' .. '9' )+
            {
            // InternalModelDsl.g:5055:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalModelDsl.g:5055:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalModelDsl.g:5057:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalModelDsl.g:5057:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalModelDsl.g:5057:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelDsl.g:5057:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalModelDsl.g:5057:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalModelDsl.g:5057:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalModelDsl.g:5057:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:5057:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalModelDsl.g:5057:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalModelDsl.g:5057:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalModelDsl.g:5057:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalModelDsl.g:5059:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalModelDsl.g:5059:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalModelDsl.g:5059:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModelDsl.g:5059:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalModelDsl.g:5061:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalModelDsl.g:5061:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalModelDsl.g:5061:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModelDsl.g:5061:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalModelDsl.g:5061:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalModelDsl.g:5061:41: ( '\\r' )? '\\n'
                    {
                    // InternalModelDsl.g:5061:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalModelDsl.g:5061:41: '\\r'
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
            // InternalModelDsl.g:5063:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalModelDsl.g:5063:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalModelDsl.g:5063:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalModelDsl.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalModelDsl.g:5065:16: ( . )
            // InternalModelDsl.g:5065:18: .
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
        // InternalModelDsl.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ONE | RULE_MANY | RULE_ONE_ONE | RULE_LIST | RULE_SET | RULE_DATE | RULE_VOID | RULE_TYPE_INT | RULE_TYPE_LONG | RULE_TYPE_DOUBLE | RULE_TYPE_FLOAT | RULE_TYPE_CHAR | RULE_TYPE_STRING | RULE_TYPE_BOOLEAN | RULE_TYPE_BINARY | RULE_ENUMERATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=43;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalModelDsl.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // InternalModelDsl.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // InternalModelDsl.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // InternalModelDsl.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // InternalModelDsl.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // InternalModelDsl.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // InternalModelDsl.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // InternalModelDsl.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // InternalModelDsl.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // InternalModelDsl.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // InternalModelDsl.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // InternalModelDsl.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // InternalModelDsl.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // InternalModelDsl.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // InternalModelDsl.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // InternalModelDsl.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // InternalModelDsl.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // InternalModelDsl.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // InternalModelDsl.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // InternalModelDsl.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // InternalModelDsl.g:1:130: RULE_ONE
                {
                mRULE_ONE(); 

                }
                break;
            case 22 :
                // InternalModelDsl.g:1:139: RULE_MANY
                {
                mRULE_MANY(); 

                }
                break;
            case 23 :
                // InternalModelDsl.g:1:149: RULE_ONE_ONE
                {
                mRULE_ONE_ONE(); 

                }
                break;
            case 24 :
                // InternalModelDsl.g:1:162: RULE_LIST
                {
                mRULE_LIST(); 

                }
                break;
            case 25 :
                // InternalModelDsl.g:1:172: RULE_SET
                {
                mRULE_SET(); 

                }
                break;
            case 26 :
                // InternalModelDsl.g:1:181: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 27 :
                // InternalModelDsl.g:1:191: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;
            case 28 :
                // InternalModelDsl.g:1:201: RULE_TYPE_INT
                {
                mRULE_TYPE_INT(); 

                }
                break;
            case 29 :
                // InternalModelDsl.g:1:215: RULE_TYPE_LONG
                {
                mRULE_TYPE_LONG(); 

                }
                break;
            case 30 :
                // InternalModelDsl.g:1:230: RULE_TYPE_DOUBLE
                {
                mRULE_TYPE_DOUBLE(); 

                }
                break;
            case 31 :
                // InternalModelDsl.g:1:247: RULE_TYPE_FLOAT
                {
                mRULE_TYPE_FLOAT(); 

                }
                break;
            case 32 :
                // InternalModelDsl.g:1:263: RULE_TYPE_CHAR
                {
                mRULE_TYPE_CHAR(); 

                }
                break;
            case 33 :
                // InternalModelDsl.g:1:278: RULE_TYPE_STRING
                {
                mRULE_TYPE_STRING(); 

                }
                break;
            case 34 :
                // InternalModelDsl.g:1:295: RULE_TYPE_BOOLEAN
                {
                mRULE_TYPE_BOOLEAN(); 

                }
                break;
            case 35 :
                // InternalModelDsl.g:1:313: RULE_TYPE_BINARY
                {
                mRULE_TYPE_BINARY(); 

                }
                break;
            case 36 :
                // InternalModelDsl.g:1:330: RULE_ENUMERATE
                {
                mRULE_ENUMERATE(); 

                }
                break;
            case 37 :
                // InternalModelDsl.g:1:345: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalModelDsl.g:1:353: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalModelDsl.g:1:362: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalModelDsl.g:1:374: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalModelDsl.g:1:390: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalModelDsl.g:1:406: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalModelDsl.g:1:414: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\45\1\47\2\uffff\1\45\2\47\1\45\5\uffff\3\45\2\47\1\45\5\47\1\41\3\uffff\3\41\2\uffff\3\45\1\uffff\1\45\1\uffff\1\47\2\uffff\4\45\1\121\5\uffff\15\45\5\uffff\12\45\1\uffff\1\45\1\153\1\45\1\155\12\45\1\uffff\5\45\1\177\1\u0080\1\u0081\1\45\2\uffff\1\u0083\1\uffff\1\45\1\u0085\1\45\1\u0087\6\45\1\uffff\5\45\4\uffff\1\45\1\uffff\1\45\1\uffff\1\45\1\uffff\1\45\1\u0099\4\45\2\uffff\1\45\1\u00a0\4\45\1\u00a5\1\u00a6\1\45\1\uffff\2\45\1\u00aa\3\45\1\uffff\1\45\1\u00af\2\45\2\uffff\1\u00b2\1\45\1\u00b4\1\uffff\1\45\1\u00b6\2\45\1\uffff\1\45\1\u00ba\1\uffff\1\45\1\uffff\1\u00bc\1\uffff\2\45\1\u00bf\1\uffff\1\u00c0\1\uffff\1\u00c1\1\u00c2\4\uffff";
    static final String DFA13_eofS =
        "\u00c3\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\60\2\uffff\1\170\2\60\1\144\5\uffff\1\142\1\156\1\141\2\60\1\157\5\60\1\101\3\uffff\2\0\1\52\2\uffff\1\166\1\156\1\154\1\uffff\1\164\1\uffff\1\60\2\uffff\1\164\1\154\2\156\1\60\5\uffff\1\163\1\145\1\156\1\164\1\162\1\164\1\165\1\151\1\164\1\157\1\141\1\157\1\156\5\uffff\1\151\1\55\1\154\1\151\1\155\1\145\1\165\1\153\1\164\1\147\1\uffff\1\164\1\55\1\171\1\60\1\151\1\145\1\142\1\144\1\145\1\141\1\162\1\154\1\141\1\147\1\156\1\141\1\164\1\145\1\156\1\145\1\56\2\60\1\162\2\uffff\1\60\1\uffff\1\156\1\60\1\154\1\60\1\147\1\164\1\141\1\145\1\162\2\141\1\142\1\171\1\162\1\144\1\124\4\uffff\1\141\1\uffff\1\147\1\uffff\1\145\1\uffff\1\145\1\60\1\143\1\141\1\171\1\142\2\uffff\1\154\1\60\1\141\1\163\1\171\1\143\2\60\1\162\1\uffff\1\164\1\156\1\60\1\154\1\145\1\151\1\uffff\1\142\1\60\1\160\1\164\2\uffff\1\60\1\145\1\60\1\uffff\1\145\1\60\1\156\1\154\1\uffff\1\145\1\60\1\uffff\1\162\1\uffff\1\60\1\uffff\1\153\1\145\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\165\1\172\2\uffff\1\170\2\172\1\144\5\uffff\1\142\1\156\1\141\2\172\1\157\6\172\3\uffff\2\uffff\1\57\2\uffff\1\166\1\156\1\154\1\uffff\1\165\1\uffff\1\172\2\uffff\1\164\1\154\1\163\1\156\1\172\5\uffff\1\163\1\145\1\156\1\164\1\162\1\164\1\165\1\151\1\164\1\157\1\141\1\157\1\156\5\uffff\1\151\1\55\1\154\1\151\1\155\1\145\1\165\1\153\1\164\1\147\1\uffff\1\164\1\172\1\171\1\172\1\151\1\145\1\142\1\144\1\145\1\141\1\162\1\154\1\141\1\147\1\156\1\141\1\164\1\145\1\156\1\145\3\172\1\162\2\uffff\1\172\1\uffff\1\156\1\172\1\154\1\172\1\147\1\164\1\141\1\145\1\162\1\141\1\165\1\142\1\171\1\162\1\144\1\124\4\uffff\1\141\1\uffff\1\147\1\uffff\1\145\1\uffff\1\145\1\172\1\143\1\141\1\171\1\142\2\uffff\1\154\1\172\1\141\1\163\1\171\1\143\2\172\1\162\1\uffff\1\164\1\156\1\172\1\154\1\145\1\151\1\uffff\1\142\1\172\1\160\1\164\2\uffff\1\172\1\145\1\172\1\uffff\1\145\1\172\1\156\1\154\1\uffff\1\145\1\172\1\uffff\1\162\1\uffff\1\172\1\uffff\1\153\1\145\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\6\1\7\4\uffff\1\17\1\20\1\21\1\22\1\23\14\uffff\1\44\1\45\1\46\3\uffff\1\52\1\53\3\uffff\1\45\1\uffff\1\44\1\uffff\1\6\1\7\5\uffff\1\17\1\20\1\21\1\22\1\23\15\uffff\1\46\1\47\1\50\1\51\1\52\12\uffff\1\15\30\uffff\1\27\1\25\1\uffff\1\31\20\uffff\1\16\1\14\1\30\1\35\1\uffff\1\26\1\uffff\1\32\1\uffff\1\33\6\uffff\1\2\1\4\11\uffff\1\37\6\uffff\1\5\4\uffff\1\41\1\36\3\uffff\1\43\4\uffff\1\10\2\uffff\1\34\1\uffff\1\42\1\uffff\1\3\3\uffff\1\24\1\uffff\1\1\2\uffff\1\12\1\40\1\11\1\13";
    static final String DFA13_specialS =
        "\1\1\34\uffff\1\0\1\2\u00a4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\1\11\1\12\2\41\1\13\2\41\1\37\12\34\2\41\1\14\1\41\1\15\2\41\1\30\1\27\1\26\1\22\1\2\1\25\2\30\1\24\2\30\1\7\6\30\1\21\2\30\1\6\4\30\3\41\1\31\1\30\1\41\1\16\3\33\1\5\3\33\1\10\3\33\1\20\1\1\1\17\6\33\1\23\4\33\1\3\1\41\1\4\123\41\1\32\uff2e\41",
            "\1\42\15\uffff\1\43\5\uffff\1\44",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\45\1\46\14\45",
            "",
            "",
            "\1\53",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\54\31\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\45\1\55\5\45\1\56\13\45",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\45\1\70\16\45\1\71\6\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\72\15\45\1\73\13\45",
            "\1\74",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\45\1\75\14\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\45\1\76\16\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\45\1\77\22\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\45\1\101\5\45\1\100\13\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\45",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\0\103",
            "\0\103",
            "\1\104\4\uffff\1\105",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112\1\113",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\45",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116\4\uffff\1\117",
            "\1\120",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\154",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0084",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0086",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\23\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "\12\45\7\uffff\13\45\1\u009f\16\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00b5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00bb",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
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
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ONE | RULE_MANY | RULE_ONE_ONE | RULE_LIST | RULE_SET | RULE_DATE | RULE_VOID | RULE_TYPE_INT | RULE_TYPE_LONG | RULE_TYPE_DOUBLE | RULE_TYPE_FLOAT | RULE_TYPE_CHAR | RULE_TYPE_STRING | RULE_TYPE_BOOLEAN | RULE_TYPE_BINARY | RULE_ENUMERATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_29 = input.LA(1);

                        s = -1;
                        if ( ((LA13_29>='\u0000' && LA13_29<='\uFFFF')) ) {s = 67;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='n') ) {s = 1;}

                        else if ( (LA13_0=='E') ) {s = 2;}

                        else if ( (LA13_0=='{') ) {s = 3;}

                        else if ( (LA13_0=='}') ) {s = 4;}

                        else if ( (LA13_0=='e') ) {s = 5;}

                        else if ( (LA13_0=='V') ) {s = 6;}

                        else if ( (LA13_0=='L') ) {s = 7;}

                        else if ( (LA13_0=='i') ) {s = 8;}

                        else if ( (LA13_0=='(') ) {s = 9;}

                        else if ( (LA13_0==')') ) {s = 10;}

                        else if ( (LA13_0==',') ) {s = 11;}

                        else if ( (LA13_0=='<') ) {s = 12;}

                        else if ( (LA13_0=='>') ) {s = 13;}

                        else if ( (LA13_0=='a') ) {s = 14;}

                        else if ( (LA13_0=='o') ) {s = 15;}

                        else if ( (LA13_0=='m') ) {s = 16;}

                        else if ( (LA13_0=='S') ) {s = 17;}

                        else if ( (LA13_0=='D') ) {s = 18;}

                        else if ( (LA13_0=='v') ) {s = 19;}

                        else if ( (LA13_0=='I') ) {s = 20;}

                        else if ( (LA13_0=='F') ) {s = 21;}

                        else if ( (LA13_0=='C') ) {s = 22;}

                        else if ( (LA13_0=='B') ) {s = 23;}

                        else if ( (LA13_0=='A'||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='U')||(LA13_0>='W' && LA13_0<='Z')||LA13_0=='_') ) {s = 24;}

                        else if ( (LA13_0=='^') ) {s = 25;}

                        else if ( (LA13_0=='\u00D1') ) {s = 26;}

                        else if ( ((LA13_0>='b' && LA13_0<='d')||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='p' && LA13_0<='u')||(LA13_0>='w' && LA13_0<='z')) ) {s = 27;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 28;}

                        else if ( (LA13_0=='\"') ) {s = 29;}

                        else if ( (LA13_0=='\'') ) {s = 30;}

                        else if ( (LA13_0=='/') ) {s = 31;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 32;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<=';')||LA13_0=='='||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\u00D0')||(LA13_0>='\u00D2' && LA13_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( ((LA13_30>='\u0000' && LA13_30<='\uFFFF')) ) {s = 67;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}