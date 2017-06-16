package uo.diesels.model.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uo.diesels.model.services.PersistenceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIST", "RULE_SET", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_TYPE_BINARY", "RULE_DATE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Finder'", "'{'", "'}'", "'('", "','", "')'", "'non-null'", "'#'", "'<'", "'>'"
    };
    public static final int RULE_SET=6;
    public static final int RULE_STRING=17;
    public static final int RULE_TYPE_CHAR=11;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_TYPE_STRING=12;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_TYPE_INT=7;
    public static final int RULE_ID=4;
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=10;
    public static final int RULE_WS=20;
    public static final int RULE_TYPE_FLOAT=9;
    public static final int RULE_TYPE_BINARY=14;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_TYPE_BOOLEAN=13;
    public static final int RULE_DATE=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_TYPE_DOUBLE=8;
    public static final int T__25=25;

    // delegates
    // delegators


        public InternalPersistenceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersistenceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersistenceDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPersistenceDsl.g"; }



     	private PersistenceDslGrammarAccess grammarAccess;

        public InternalPersistenceDslParser(TokenStream input, PersistenceDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PersistenceDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPersistenceDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPersistenceDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPersistenceDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPersistenceDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_finder_0_0= ruleFinder ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_finder_0_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:77:2: ( ( (lv_finder_0_0= ruleFinder ) )* )
            // InternalPersistenceDsl.g:78:2: ( (lv_finder_0_0= ruleFinder ) )*
            {
            // InternalPersistenceDsl.g:78:2: ( (lv_finder_0_0= ruleFinder ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPersistenceDsl.g:79:3: (lv_finder_0_0= ruleFinder )
            	    {
            	    // InternalPersistenceDsl.g:79:3: (lv_finder_0_0= ruleFinder )
            	    // InternalPersistenceDsl.g:80:4: lv_finder_0_0= ruleFinder
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getFinderFinderParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_finder_0_0=ruleFinder();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"finder",
            	    					lv_finder_0_0,
            	    					"uo.diesels.model.PersistenceDsl.Finder");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFinder"
    // InternalPersistenceDsl.g:100:1: entryRuleFinder returns [EObject current=null] : iv_ruleFinder= ruleFinder EOF ;
    public final EObject entryRuleFinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinder = null;


        try {
            // InternalPersistenceDsl.g:100:47: (iv_ruleFinder= ruleFinder EOF )
            // InternalPersistenceDsl.g:101:2: iv_ruleFinder= ruleFinder EOF
            {
             newCompositeNode(grammarAccess.getFinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinder=ruleFinder();

            state._fsp--;

             current =iv_ruleFinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinder"


    // $ANTLR start "ruleFinder"
    // InternalPersistenceDsl.g:107:1: ruleFinder returns [EObject current=null] : (otherlv_0= 'Finder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleFinderMethod ) )+ otherlv_4= '}' ) ;
    public final EObject ruleFinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:113:2: ( (otherlv_0= 'Finder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleFinderMethod ) )+ otherlv_4= '}' ) )
            // InternalPersistenceDsl.g:114:2: (otherlv_0= 'Finder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleFinderMethod ) )+ otherlv_4= '}' )
            {
            // InternalPersistenceDsl.g:114:2: (otherlv_0= 'Finder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleFinderMethod ) )+ otherlv_4= '}' )
            // InternalPersistenceDsl.g:115:3: otherlv_0= 'Finder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleFinderMethod ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFinderAccess().getFinderKeyword_0());
            		
            // InternalPersistenceDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFinderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFinderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPersistenceDsl.g:141:3: ( (lv_methods_3_0= ruleFinderMethod ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_LIST)||(LA2_0>=RULE_TYPE_INT && LA2_0<=RULE_DATE)||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPersistenceDsl.g:142:4: (lv_methods_3_0= ruleFinderMethod )
            	    {
            	    // InternalPersistenceDsl.g:142:4: (lv_methods_3_0= ruleFinderMethod )
            	    // InternalPersistenceDsl.g:143:5: lv_methods_3_0= ruleFinderMethod
            	    {

            	    					newCompositeNode(grammarAccess.getFinderAccess().getMethodsFinderMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_methods_3_0=ruleFinderMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFinderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_3_0,
            	    						"uo.diesels.model.PersistenceDsl.FinderMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFinderAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinder"


    // $ANTLR start "entryRuleFinderMethod"
    // InternalPersistenceDsl.g:168:1: entryRuleFinderMethod returns [EObject current=null] : iv_ruleFinderMethod= ruleFinderMethod EOF ;
    public final EObject entryRuleFinderMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinderMethod = null;


        try {
            // InternalPersistenceDsl.g:168:53: (iv_ruleFinderMethod= ruleFinderMethod EOF )
            // InternalPersistenceDsl.g:169:2: iv_ruleFinderMethod= ruleFinderMethod EOF
            {
             newCompositeNode(grammarAccess.getFinderMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinderMethod=ruleFinderMethod();

            state._fsp--;

             current =iv_ruleFinderMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinderMethod"


    // $ANTLR start "ruleFinderMethod"
    // InternalPersistenceDsl.g:175:1: ruleFinderMethod returns [EObject current=null] : (this_MethodEntityReturn_0= ruleMethodEntityReturn | this_MethodDtoReturn_1= ruleMethodDtoReturn | this_MethodSimpleReturn_2= ruleMethodSimpleReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) ;
    public final EObject ruleFinderMethod() throws RecognitionException {
        EObject current = null;

        EObject this_MethodEntityReturn_0 = null;

        EObject this_MethodDtoReturn_1 = null;

        EObject this_MethodSimpleReturn_2 = null;

        EObject this_MethodCollectionReturn_3 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:181:2: ( (this_MethodEntityReturn_0= ruleMethodEntityReturn | this_MethodDtoReturn_1= ruleMethodDtoReturn | this_MethodSimpleReturn_2= ruleMethodSimpleReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) )
            // InternalPersistenceDsl.g:182:2: (this_MethodEntityReturn_0= ruleMethodEntityReturn | this_MethodDtoReturn_1= ruleMethodDtoReturn | this_MethodSimpleReturn_2= ruleMethodSimpleReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn )
            {
            // InternalPersistenceDsl.g:182:2: (this_MethodEntityReturn_0= ruleMethodEntityReturn | this_MethodDtoReturn_1= ruleMethodDtoReturn | this_MethodSimpleReturn_2= ruleMethodSimpleReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_TYPE_BINARY:
            case RULE_DATE:
                {
                alt3=3;
                }
                break;
            case RULE_LIST:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPersistenceDsl.g:183:3: this_MethodEntityReturn_0= ruleMethodEntityReturn
                    {

                    			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodEntityReturnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodEntityReturn_0=ruleMethodEntityReturn();

                    state._fsp--;


                    			current = this_MethodEntityReturn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:192:3: this_MethodDtoReturn_1= ruleMethodDtoReturn
                    {

                    			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodDtoReturnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodDtoReturn_1=ruleMethodDtoReturn();

                    state._fsp--;


                    			current = this_MethodDtoReturn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:201:3: this_MethodSimpleReturn_2= ruleMethodSimpleReturn
                    {

                    			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodSimpleReturnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodSimpleReturn_2=ruleMethodSimpleReturn();

                    state._fsp--;


                    			current = this_MethodSimpleReturn_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPersistenceDsl.g:210:3: this_MethodCollectionReturn_3= ruleMethodCollectionReturn
                    {

                    			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodCollectionReturnParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCollectionReturn_3=ruleMethodCollectionReturn();

                    state._fsp--;


                    			current = this_MethodCollectionReturn_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinderMethod"


    // $ANTLR start "entryRuleMethodSimpleReturn"
    // InternalPersistenceDsl.g:222:1: entryRuleMethodSimpleReturn returns [EObject current=null] : iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF ;
    public final EObject entryRuleMethodSimpleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSimpleReturn = null;


        try {
            // InternalPersistenceDsl.g:222:59: (iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF )
            // InternalPersistenceDsl.g:223:2: iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF
            {
             newCompositeNode(grammarAccess.getMethodSimpleReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodSimpleReturn=ruleMethodSimpleReturn();

            state._fsp--;

             current =iv_ruleMethodSimpleReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodSimpleReturn"


    // $ANTLR start "ruleMethodSimpleReturn"
    // InternalPersistenceDsl.g:229:1: ruleMethodSimpleReturn returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? ) ;
    public final EObject ruleMethodSimpleReturn() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_nullable_7_0=null;
        AntlrDatatypeRuleToken lv_returnType_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:235:2: ( ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? ) )
            // InternalPersistenceDsl.g:236:2: ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? )
            {
            // InternalPersistenceDsl.g:236:2: ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? )
            // InternalPersistenceDsl.g:237:3: ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )?
            {
            // InternalPersistenceDsl.g:237:3: ( (lv_returnType_0_0= ruleType ) )
            // InternalPersistenceDsl.g:238:4: (lv_returnType_0_0= ruleType )
            {
            // InternalPersistenceDsl.g:238:4: (lv_returnType_0_0= ruleType )
            // InternalPersistenceDsl.g:239:5: lv_returnType_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_returnType_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"uo.diesels.model.PersistenceDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersistenceDsl.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodSimpleReturnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodSimpleReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPersistenceDsl.g:278:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_DATE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPersistenceDsl.g:279:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalPersistenceDsl.g:279:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalPersistenceDsl.g:280:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalPersistenceDsl.g:280:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalPersistenceDsl.g:281:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.PersistenceDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPersistenceDsl.g:298:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==26) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPersistenceDsl.g:299:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalPersistenceDsl.g:303:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalPersistenceDsl.g:304:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalPersistenceDsl.g:304:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalPersistenceDsl.g:305:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.PersistenceDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4());
            		
            // InternalPersistenceDsl.g:328:3: ( (lv_nullable_7_0= 'non-null' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPersistenceDsl.g:329:4: (lv_nullable_7_0= 'non-null' )
                    {
                    // InternalPersistenceDsl.g:329:4: (lv_nullable_7_0= 'non-null' )
                    // InternalPersistenceDsl.g:330:5: lv_nullable_7_0= 'non-null'
                    {
                    lv_nullable_7_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_nullable_7_0, grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodSimpleReturnRule());
                    					}
                    					setWithLastConsumed(current, "nullable", lv_nullable_7_0, "non-null");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodSimpleReturn"


    // $ANTLR start "entryRuleMethodEntityReturn"
    // InternalPersistenceDsl.g:346:1: entryRuleMethodEntityReturn returns [EObject current=null] : iv_ruleMethodEntityReturn= ruleMethodEntityReturn EOF ;
    public final EObject entryRuleMethodEntityReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodEntityReturn = null;


        try {
            // InternalPersistenceDsl.g:346:59: (iv_ruleMethodEntityReturn= ruleMethodEntityReturn EOF )
            // InternalPersistenceDsl.g:347:2: iv_ruleMethodEntityReturn= ruleMethodEntityReturn EOF
            {
             newCompositeNode(grammarAccess.getMethodEntityReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodEntityReturn=ruleMethodEntityReturn();

            state._fsp--;

             current =iv_ruleMethodEntityReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodEntityReturn"


    // $ANTLR start "ruleMethodEntityReturn"
    // InternalPersistenceDsl.g:353:1: ruleMethodEntityReturn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? ) ;
    public final EObject ruleMethodEntityReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_nullable_7_0=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:359:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? ) )
            // InternalPersistenceDsl.g:360:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? )
            {
            // InternalPersistenceDsl.g:360:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )? )
            // InternalPersistenceDsl.g:361:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ( (lv_nullable_7_0= 'non-null' ) )?
            {
            // InternalPersistenceDsl.g:361:3: ( (otherlv_0= RULE_ID ) )
            // InternalPersistenceDsl.g:362:4: (otherlv_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:362:4: (otherlv_0= RULE_ID )
            // InternalPersistenceDsl.g:363:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodEntityReturnRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityCrossReference_0_0());
            				

            }


            }

            // InternalPersistenceDsl.g:374:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:375:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:375:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:376:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodEntityReturnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodEntityReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodEntityReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPersistenceDsl.g:396:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_DATE)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPersistenceDsl.g:397:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalPersistenceDsl.g:397:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalPersistenceDsl.g:398:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalPersistenceDsl.g:398:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalPersistenceDsl.g:399:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodEntityReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.PersistenceDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPersistenceDsl.g:416:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPersistenceDsl.g:417:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodEntityReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalPersistenceDsl.g:421:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalPersistenceDsl.g:422:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalPersistenceDsl.g:422:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalPersistenceDsl.g:423:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodEntityReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.PersistenceDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodEntityReturnAccess().getRightParenthesisKeyword_4());
            		
            // InternalPersistenceDsl.g:446:3: ( (lv_nullable_7_0= 'non-null' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPersistenceDsl.g:447:4: (lv_nullable_7_0= 'non-null' )
                    {
                    // InternalPersistenceDsl.g:447:4: (lv_nullable_7_0= 'non-null' )
                    // InternalPersistenceDsl.g:448:5: lv_nullable_7_0= 'non-null'
                    {
                    lv_nullable_7_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_nullable_7_0, grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodEntityReturnRule());
                    					}
                    					setWithLastConsumed(current, "nullable", lv_nullable_7_0, "non-null");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodEntityReturn"


    // $ANTLR start "entryRuleMethodDtoReturn"
    // InternalPersistenceDsl.g:464:1: entryRuleMethodDtoReturn returns [EObject current=null] : iv_ruleMethodDtoReturn= ruleMethodDtoReturn EOF ;
    public final EObject entryRuleMethodDtoReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDtoReturn = null;


        try {
            // InternalPersistenceDsl.g:464:56: (iv_ruleMethodDtoReturn= ruleMethodDtoReturn EOF )
            // InternalPersistenceDsl.g:465:2: iv_ruleMethodDtoReturn= ruleMethodDtoReturn EOF
            {
             newCompositeNode(grammarAccess.getMethodDtoReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDtoReturn=ruleMethodDtoReturn();

            state._fsp--;

             current =iv_ruleMethodDtoReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDtoReturn"


    // $ANTLR start "ruleMethodDtoReturn"
    // InternalPersistenceDsl.g:471:1: ruleMethodDtoReturn returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ( (lv_nullable_8_0= 'non-null' ) )? ) ;
    public final EObject ruleMethodDtoReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_nullable_8_0=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:477:2: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ( (lv_nullable_8_0= 'non-null' ) )? ) )
            // InternalPersistenceDsl.g:478:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ( (lv_nullable_8_0= 'non-null' ) )? )
            {
            // InternalPersistenceDsl.g:478:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ( (lv_nullable_8_0= 'non-null' ) )? )
            // InternalPersistenceDsl.g:479:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ( (lv_nullable_8_0= 'non-null' ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0());
            		
            // InternalPersistenceDsl.g:483:3: ( (otherlv_1= RULE_ID ) )
            // InternalPersistenceDsl.g:484:4: (otherlv_1= RULE_ID )
            {
            // InternalPersistenceDsl.g:484:4: (otherlv_1= RULE_ID )
            // InternalPersistenceDsl.g:485:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDtoReturnRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0());
            				

            }


            }

            // InternalPersistenceDsl.g:496:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPersistenceDsl.g:497:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:497:4: (lv_name_2_0= RULE_ID )
            // InternalPersistenceDsl.g:498:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMethodDtoReturnAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDtoReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPersistenceDsl.g:518:3: ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_DATE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPersistenceDsl.g:519:4: ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )*
                    {
                    // InternalPersistenceDsl.g:519:4: ( (lv_parameters_4_0= ruleDefVariable ) )
                    // InternalPersistenceDsl.g:520:5: (lv_parameters_4_0= ruleDefVariable )
                    {
                    // InternalPersistenceDsl.g:520:5: (lv_parameters_4_0= ruleDefVariable )
                    // InternalPersistenceDsl.g:521:6: lv_parameters_4_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameters_4_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodDtoReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"uo.diesels.model.PersistenceDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPersistenceDsl.g:538:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPersistenceDsl.g:539:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalPersistenceDsl.g:543:5: ( (lv_parameters_6_0= ruleDefVariable ) )
                    	    // InternalPersistenceDsl.g:544:6: (lv_parameters_6_0= ruleDefVariable )
                    	    {
                    	    // InternalPersistenceDsl.g:544:6: (lv_parameters_6_0= ruleDefVariable )
                    	    // InternalPersistenceDsl.g:545:7: lv_parameters_6_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_6_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodDtoReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"uo.diesels.model.PersistenceDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5());
            		
            // InternalPersistenceDsl.g:568:3: ( (lv_nullable_8_0= 'non-null' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPersistenceDsl.g:569:4: (lv_nullable_8_0= 'non-null' )
                    {
                    // InternalPersistenceDsl.g:569:4: (lv_nullable_8_0= 'non-null' )
                    // InternalPersistenceDsl.g:570:5: lv_nullable_8_0= 'non-null'
                    {
                    lv_nullable_8_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_nullable_8_0, grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodDtoReturnRule());
                    					}
                    					setWithLastConsumed(current, "nullable", lv_nullable_8_0, "non-null");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDtoReturn"


    // $ANTLR start "entryRuleMethodCollectionReturn"
    // InternalPersistenceDsl.g:586:1: entryRuleMethodCollectionReturn returns [EObject current=null] : iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF ;
    public final EObject entryRuleMethodCollectionReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCollectionReturn = null;


        try {
            // InternalPersistenceDsl.g:586:63: (iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF )
            // InternalPersistenceDsl.g:587:2: iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF
            {
             newCompositeNode(grammarAccess.getMethodCollectionReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCollectionReturn=ruleMethodCollectionReturn();

            state._fsp--;

             current =iv_ruleMethodCollectionReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCollectionReturn"


    // $ANTLR start "ruleMethodCollectionReturn"
    // InternalPersistenceDsl.g:593:1: ruleMethodCollectionReturn returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleMethodCollectionReturn() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_returnType_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:599:2: ( ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalPersistenceDsl.g:600:2: ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalPersistenceDsl.g:600:2: ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalPersistenceDsl.g:601:3: ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalPersistenceDsl.g:601:3: ( (lv_returnType_0_0= ruleCollectionReturnType ) )
            // InternalPersistenceDsl.g:602:4: (lv_returnType_0_0= ruleCollectionReturnType )
            {
            // InternalPersistenceDsl.g:602:4: (lv_returnType_0_0= ruleCollectionReturnType )
            // InternalPersistenceDsl.g:603:5: lv_returnType_0_0= ruleCollectionReturnType
            {

            					newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeCollectionReturnTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_returnType_0_0=ruleCollectionReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"uo.diesels.model.PersistenceDsl.CollectionReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersistenceDsl.g:620:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:621:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:621:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:622:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodCollectionReturnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCollectionReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPersistenceDsl.g:642:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_DATE)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPersistenceDsl.g:643:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalPersistenceDsl.g:643:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalPersistenceDsl.g:644:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalPersistenceDsl.g:644:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalPersistenceDsl.g:645:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.PersistenceDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPersistenceDsl.g:662:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPersistenceDsl.g:663:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalPersistenceDsl.g:667:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalPersistenceDsl.g:668:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalPersistenceDsl.g:668:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalPersistenceDsl.g:669:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.PersistenceDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCollectionReturn"


    // $ANTLR start "entryRuleCollectionReturnType"
    // InternalPersistenceDsl.g:696:1: entryRuleCollectionReturnType returns [EObject current=null] : iv_ruleCollectionReturnType= ruleCollectionReturnType EOF ;
    public final EObject entryRuleCollectionReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionReturnType = null;


        try {
            // InternalPersistenceDsl.g:696:61: (iv_ruleCollectionReturnType= ruleCollectionReturnType EOF )
            // InternalPersistenceDsl.g:697:2: iv_ruleCollectionReturnType= ruleCollectionReturnType EOF
            {
             newCompositeNode(grammarAccess.getCollectionReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionReturnType=ruleCollectionReturnType();

            state._fsp--;

             current =iv_ruleCollectionReturnType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionReturnType"


    // $ANTLR start "ruleCollectionReturnType"
    // InternalPersistenceDsl.g:703:1: ruleCollectionReturnType returns [EObject current=null] : (this_EntityReturnTypeCollection_0= ruleEntityReturnTypeCollection | this_DtoReturnTypeCollection_1= ruleDtoReturnTypeCollection | this_SimpleReturnTypeCollection_2= ruleSimpleReturnTypeCollection ) ;
    public final EObject ruleCollectionReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_EntityReturnTypeCollection_0 = null;

        EObject this_DtoReturnTypeCollection_1 = null;

        EObject this_SimpleReturnTypeCollection_2 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:709:2: ( (this_EntityReturnTypeCollection_0= ruleEntityReturnTypeCollection | this_DtoReturnTypeCollection_1= ruleDtoReturnTypeCollection | this_SimpleReturnTypeCollection_2= ruleSimpleReturnTypeCollection ) )
            // InternalPersistenceDsl.g:710:2: (this_EntityReturnTypeCollection_0= ruleEntityReturnTypeCollection | this_DtoReturnTypeCollection_1= ruleDtoReturnTypeCollection | this_SimpleReturnTypeCollection_2= ruleSimpleReturnTypeCollection )
            {
            // InternalPersistenceDsl.g:710:2: (this_EntityReturnTypeCollection_0= ruleEntityReturnTypeCollection | this_DtoReturnTypeCollection_1= ruleDtoReturnTypeCollection | this_SimpleReturnTypeCollection_2= ruleSimpleReturnTypeCollection )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LIST) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==30) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        alt15=1;
                        }
                        break;
                    case RULE_TYPE_INT:
                    case RULE_TYPE_DOUBLE:
                    case RULE_TYPE_FLOAT:
                    case RULE_TYPE_LONG:
                    case RULE_TYPE_CHAR:
                    case RULE_TYPE_STRING:
                    case RULE_TYPE_BOOLEAN:
                    case RULE_TYPE_BINARY:
                    case RULE_DATE:
                        {
                        alt15=3;
                        }
                        break;
                    case 29:
                        {
                        alt15=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPersistenceDsl.g:711:3: this_EntityReturnTypeCollection_0= ruleEntityReturnTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getEntityReturnTypeCollectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityReturnTypeCollection_0=ruleEntityReturnTypeCollection();

                    state._fsp--;


                    			current = this_EntityReturnTypeCollection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:720:3: this_DtoReturnTypeCollection_1= ruleDtoReturnTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getDtoReturnTypeCollectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtoReturnTypeCollection_1=ruleDtoReturnTypeCollection();

                    state._fsp--;


                    			current = this_DtoReturnTypeCollection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:729:3: this_SimpleReturnTypeCollection_2= ruleSimpleReturnTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getSimpleReturnTypeCollectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleReturnTypeCollection_2=ruleSimpleReturnTypeCollection();

                    state._fsp--;


                    			current = this_SimpleReturnTypeCollection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionReturnType"


    // $ANTLR start "entryRuleEntityReturnTypeCollection"
    // InternalPersistenceDsl.g:741:1: entryRuleEntityReturnTypeCollection returns [EObject current=null] : iv_ruleEntityReturnTypeCollection= ruleEntityReturnTypeCollection EOF ;
    public final EObject entryRuleEntityReturnTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReturnTypeCollection = null;


        try {
            // InternalPersistenceDsl.g:741:67: (iv_ruleEntityReturnTypeCollection= ruleEntityReturnTypeCollection EOF )
            // InternalPersistenceDsl.g:742:2: iv_ruleEntityReturnTypeCollection= ruleEntityReturnTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getEntityReturnTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityReturnTypeCollection=ruleEntityReturnTypeCollection();

            state._fsp--;

             current =iv_ruleEntityReturnTypeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityReturnTypeCollection"


    // $ANTLR start "ruleEntityReturnTypeCollection"
    // InternalPersistenceDsl.g:748:1: ruleEntityReturnTypeCollection returns [EObject current=null] : (this_LIST_0= RULE_LIST otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) ;
    public final EObject ruleEntityReturnTypeCollection() throws RecognitionException {
        EObject current = null;

        Token this_LIST_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPersistenceDsl.g:754:2: ( (this_LIST_0= RULE_LIST otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) )
            // InternalPersistenceDsl.g:755:2: (this_LIST_0= RULE_LIST otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            {
            // InternalPersistenceDsl.g:755:2: (this_LIST_0= RULE_LIST otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            // InternalPersistenceDsl.g:756:3: this_LIST_0= RULE_LIST otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>'
            {
            this_LIST_0=(Token)match(input,RULE_LIST,FOLLOW_13); 

            			newLeafNode(this_LIST_0, grammarAccess.getEntityReturnTypeCollectionAccess().getLISTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityReturnTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalPersistenceDsl.g:764:3: ( (otherlv_2= RULE_ID ) )
            // InternalPersistenceDsl.g:765:4: (otherlv_2= RULE_ID )
            {
            // InternalPersistenceDsl.g:765:4: (otherlv_2= RULE_ID )
            // InternalPersistenceDsl.g:766:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityReturnTypeCollectionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityReturnTypeCollectionAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityReturnTypeCollection"


    // $ANTLR start "entryRuleDtoReturnTypeCollection"
    // InternalPersistenceDsl.g:785:1: entryRuleDtoReturnTypeCollection returns [EObject current=null] : iv_ruleDtoReturnTypeCollection= ruleDtoReturnTypeCollection EOF ;
    public final EObject entryRuleDtoReturnTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoReturnTypeCollection = null;


        try {
            // InternalPersistenceDsl.g:785:64: (iv_ruleDtoReturnTypeCollection= ruleDtoReturnTypeCollection EOF )
            // InternalPersistenceDsl.g:786:2: iv_ruleDtoReturnTypeCollection= ruleDtoReturnTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getDtoReturnTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtoReturnTypeCollection=ruleDtoReturnTypeCollection();

            state._fsp--;

             current =iv_ruleDtoReturnTypeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDtoReturnTypeCollection"


    // $ANTLR start "ruleDtoReturnTypeCollection"
    // InternalPersistenceDsl.g:792:1: ruleDtoReturnTypeCollection returns [EObject current=null] : (this_LIST_0= RULE_LIST otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ) ;
    public final EObject ruleDtoReturnTypeCollection() throws RecognitionException {
        EObject current = null;

        Token this_LIST_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPersistenceDsl.g:798:2: ( (this_LIST_0= RULE_LIST otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ) )
            // InternalPersistenceDsl.g:799:2: (this_LIST_0= RULE_LIST otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' )
            {
            // InternalPersistenceDsl.g:799:2: (this_LIST_0= RULE_LIST otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' )
            // InternalPersistenceDsl.g:800:3: this_LIST_0= RULE_LIST otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>'
            {
            this_LIST_0=(Token)match(input,RULE_LIST,FOLLOW_13); 

            			newLeafNode(this_LIST_0, grammarAccess.getDtoReturnTypeCollectionAccess().getLISTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDtoReturnTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDtoReturnTypeCollectionAccess().getNumberSignKeyword_2());
            		
            // InternalPersistenceDsl.g:812:3: ( (otherlv_3= RULE_ID ) )
            // InternalPersistenceDsl.g:813:4: (otherlv_3= RULE_ID )
            {
            // InternalPersistenceDsl.g:813:4: (otherlv_3= RULE_ID )
            // InternalPersistenceDsl.g:814:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoReturnTypeCollectionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDtoReturnTypeCollectionAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDtoReturnTypeCollection"


    // $ANTLR start "entryRuleSimpleReturnTypeCollection"
    // InternalPersistenceDsl.g:833:1: entryRuleSimpleReturnTypeCollection returns [EObject current=null] : iv_ruleSimpleReturnTypeCollection= ruleSimpleReturnTypeCollection EOF ;
    public final EObject entryRuleSimpleReturnTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleReturnTypeCollection = null;


        try {
            // InternalPersistenceDsl.g:833:67: (iv_ruleSimpleReturnTypeCollection= ruleSimpleReturnTypeCollection EOF )
            // InternalPersistenceDsl.g:834:2: iv_ruleSimpleReturnTypeCollection= ruleSimpleReturnTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getSimpleReturnTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleReturnTypeCollection=ruleSimpleReturnTypeCollection();

            state._fsp--;

             current =iv_ruleSimpleReturnTypeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleReturnTypeCollection"


    // $ANTLR start "ruleSimpleReturnTypeCollection"
    // InternalPersistenceDsl.g:840:1: ruleSimpleReturnTypeCollection returns [EObject current=null] : (this_LIST_0= RULE_LIST otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleSimpleReturnTypeCollection() throws RecognitionException {
        EObject current = null;

        Token this_LIST_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:846:2: ( (this_LIST_0= RULE_LIST otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalPersistenceDsl.g:847:2: (this_LIST_0= RULE_LIST otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalPersistenceDsl.g:847:2: (this_LIST_0= RULE_LIST otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalPersistenceDsl.g:848:3: this_LIST_0= RULE_LIST otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>'
            {
            this_LIST_0=(Token)match(input,RULE_LIST,FOLLOW_13); 

            			newLeafNode(this_LIST_0, grammarAccess.getSimpleReturnTypeCollectionAccess().getLISTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleReturnTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalPersistenceDsl.g:856:3: ( (lv_type_2_0= ruleType ) )
            // InternalPersistenceDsl.g:857:4: (lv_type_2_0= ruleType )
            {
            // InternalPersistenceDsl.g:857:4: (lv_type_2_0= ruleType )
            // InternalPersistenceDsl.g:858:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleReturnTypeCollectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"uo.diesels.model.PersistenceDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleReturnTypeCollectionAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleReturnTypeCollection"


    // $ANTLR start "entryRuleAllModelTypeCollection"
    // InternalPersistenceDsl.g:883:1: entryRuleAllModelTypeCollection returns [EObject current=null] : iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF ;
    public final EObject entryRuleAllModelTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllModelTypeCollection = null;


        try {
            // InternalPersistenceDsl.g:883:63: (iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF )
            // InternalPersistenceDsl.g:884:2: iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getAllModelTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllModelTypeCollection=ruleAllModelTypeCollection();

            state._fsp--;

             current =iv_ruleAllModelTypeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllModelTypeCollection"


    // $ANTLR start "ruleAllModelTypeCollection"
    // InternalPersistenceDsl.g:890:1: ruleAllModelTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) ;
    public final EObject ruleAllModelTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPersistenceDsl.g:896:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) )
            // InternalPersistenceDsl.g:897:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            {
            // InternalPersistenceDsl.g:897:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            // InternalPersistenceDsl.g:898:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>'
            {
            // InternalPersistenceDsl.g:898:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalPersistenceDsl.g:899:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalPersistenceDsl.g:899:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalPersistenceDsl.g:900:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalPersistenceDsl.g:900:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LIST) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SET) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPersistenceDsl.g:901:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_13); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.PersistenceDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:916:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_13); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getAllModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.PersistenceDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalPersistenceDsl.g:937:3: ( (otherlv_2= RULE_ID ) )
            // InternalPersistenceDsl.g:938:4: (otherlv_2= RULE_ID )
            {
            // InternalPersistenceDsl.g:938:4: (otherlv_2= RULE_ID )
            // InternalPersistenceDsl.g:939:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllModelTypeCollection"


    // $ANTLR start "entryRuleSimpleTypeCollection"
    // InternalPersistenceDsl.g:958:1: entryRuleSimpleTypeCollection returns [EObject current=null] : iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF ;
    public final EObject entryRuleSimpleTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeCollection = null;


        try {
            // InternalPersistenceDsl.g:958:61: (iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF )
            // InternalPersistenceDsl.g:959:2: iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypeCollection=ruleSimpleTypeCollection();

            state._fsp--;

             current =iv_ruleSimpleTypeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleTypeCollection"


    // $ANTLR start "ruleSimpleTypeCollection"
    // InternalPersistenceDsl.g:965:1: ruleSimpleTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleSimpleTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:971:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalPersistenceDsl.g:972:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalPersistenceDsl.g:972:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalPersistenceDsl.g:973:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalPersistenceDsl.g:973:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalPersistenceDsl.g:974:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalPersistenceDsl.g:974:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalPersistenceDsl.g:975:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalPersistenceDsl.g:975:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LIST) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_SET) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPersistenceDsl.g:976:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_13); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.PersistenceDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:991:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_13); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getSimpleTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.PersistenceDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalPersistenceDsl.g:1012:3: ( (lv_type_2_0= ruleType ) )
            // InternalPersistenceDsl.g:1013:4: (lv_type_2_0= ruleType )
            {
            // InternalPersistenceDsl.g:1013:4: (lv_type_2_0= ruleType )
            // InternalPersistenceDsl.g:1014:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSimpleTypeCollectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeCollectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"uo.diesels.model.PersistenceDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypeCollection"


    // $ANTLR start "entryRuleDefVariable"
    // InternalPersistenceDsl.g:1039:1: entryRuleDefVariable returns [EObject current=null] : iv_ruleDefVariable= ruleDefVariable EOF ;
    public final EObject entryRuleDefVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefVariable = null;


        try {
            // InternalPersistenceDsl.g:1039:52: (iv_ruleDefVariable= ruleDefVariable EOF )
            // InternalPersistenceDsl.g:1040:2: iv_ruleDefVariable= ruleDefVariable EOF
            {
             newCompositeNode(grammarAccess.getDefVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefVariable=ruleDefVariable();

            state._fsp--;

             current =iv_ruleDefVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefVariable"


    // $ANTLR start "ruleDefVariable"
    // InternalPersistenceDsl.g:1046:1: ruleDefVariable returns [EObject current=null] : (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable ) ;
    public final EObject ruleDefVariable() throws RecognitionException {
        EObject current = null;

        EObject this_DefSimpleVariable_0 = null;

        EObject this_DefAllModelTypeVariable_1 = null;

        EObject this_DefCollectionTypeVariable_2 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:1052:2: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable ) )
            // InternalPersistenceDsl.g:1053:2: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable )
            {
            // InternalPersistenceDsl.g:1053:2: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_TYPE_BINARY:
            case RULE_DATE:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPersistenceDsl.g:1054:3: this_DefSimpleVariable_0= ruleDefSimpleVariable
                    {

                    			newCompositeNode(grammarAccess.getDefVariableAccess().getDefSimpleVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefSimpleVariable_0=ruleDefSimpleVariable();

                    state._fsp--;


                    			current = this_DefSimpleVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:1063:3: this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable
                    {

                    			newCompositeNode(grammarAccess.getDefVariableAccess().getDefAllModelTypeVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefAllModelTypeVariable_1=ruleDefAllModelTypeVariable();

                    state._fsp--;


                    			current = this_DefAllModelTypeVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:1072:3: this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable
                    {

                    			newCompositeNode(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefCollectionTypeVariable_2=ruleDefCollectionTypeVariable();

                    state._fsp--;


                    			current = this_DefCollectionTypeVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefVariable"


    // $ANTLR start "entryRuleDefAllModelTypeVariable"
    // InternalPersistenceDsl.g:1084:1: entryRuleDefAllModelTypeVariable returns [EObject current=null] : iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF ;
    public final EObject entryRuleDefAllModelTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAllModelTypeVariable = null;


        try {
            // InternalPersistenceDsl.g:1084:64: (iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF )
            // InternalPersistenceDsl.g:1085:2: iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF
            {
             newCompositeNode(grammarAccess.getDefAllModelTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefAllModelTypeVariable=ruleDefAllModelTypeVariable();

            state._fsp--;

             current =iv_ruleDefAllModelTypeVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefAllModelTypeVariable"


    // $ANTLR start "ruleDefAllModelTypeVariable"
    // InternalPersistenceDsl.g:1091:1: ruleDefAllModelTypeVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefAllModelTypeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPersistenceDsl.g:1097:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPersistenceDsl.g:1098:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPersistenceDsl.g:1098:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPersistenceDsl.g:1099:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPersistenceDsl.g:1099:3: ( (otherlv_0= RULE_ID ) )
            // InternalPersistenceDsl.g:1100:4: (otherlv_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:1100:4: (otherlv_0= RULE_ID )
            // InternalPersistenceDsl.g:1101:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefAllModelTypeVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalPersistenceDsl.g:1112:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:1113:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:1113:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:1114:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefAllModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefAllModelTypeVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefAllModelTypeVariable"


    // $ANTLR start "entryRuleDefSimpleVariable"
    // InternalPersistenceDsl.g:1134:1: entryRuleDefSimpleVariable returns [EObject current=null] : iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF ;
    public final EObject entryRuleDefSimpleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSimpleVariable = null;


        try {
            // InternalPersistenceDsl.g:1134:58: (iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF )
            // InternalPersistenceDsl.g:1135:2: iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF
            {
             newCompositeNode(grammarAccess.getDefSimpleVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefSimpleVariable=ruleDefSimpleVariable();

            state._fsp--;

             current =iv_ruleDefSimpleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefSimpleVariable"


    // $ANTLR start "ruleDefSimpleVariable"
    // InternalPersistenceDsl.g:1141:1: ruleDefSimpleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefSimpleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:1147:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPersistenceDsl.g:1148:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPersistenceDsl.g:1148:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPersistenceDsl.g:1149:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPersistenceDsl.g:1149:3: ( (lv_type_0_0= ruleType ) )
            // InternalPersistenceDsl.g:1150:4: (lv_type_0_0= ruleType )
            {
            // InternalPersistenceDsl.g:1150:4: (lv_type_0_0= ruleType )
            // InternalPersistenceDsl.g:1151:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefSimpleVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.PersistenceDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersistenceDsl.g:1168:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:1169:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:1169:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:1170:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefSimpleVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefSimpleVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefSimpleVariable"


    // $ANTLR start "entryRuleDefCollectionTypeVariable"
    // InternalPersistenceDsl.g:1190:1: entryRuleDefCollectionTypeVariable returns [EObject current=null] : iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF ;
    public final EObject entryRuleDefCollectionTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCollectionTypeVariable = null;


        try {
            // InternalPersistenceDsl.g:1190:66: (iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF )
            // InternalPersistenceDsl.g:1191:2: iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF
            {
             newCompositeNode(grammarAccess.getDefCollectionTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefCollectionTypeVariable=ruleDefCollectionTypeVariable();

            state._fsp--;

             current =iv_ruleDefCollectionTypeVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefCollectionTypeVariable"


    // $ANTLR start "ruleDefCollectionTypeVariable"
    // InternalPersistenceDsl.g:1197:1: ruleDefCollectionTypeVariable returns [EObject current=null] : (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_1= ruleDefSimpleTypeCollectionVariable ) ;
    public final EObject ruleDefCollectionTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject this_DefAllModelTypeCollectionVariable_0 = null;

        EObject this_DefSimpleTypeCollectionVariable_1 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:1203:2: ( (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_1= ruleDefSimpleTypeCollectionVariable ) )
            // InternalPersistenceDsl.g:1204:2: (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_1= ruleDefSimpleTypeCollectionVariable )
            {
            // InternalPersistenceDsl.g:1204:2: (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_1= ruleDefSimpleTypeCollectionVariable )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LIST) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==30) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_ID) ) {
                        alt19=1;
                    }
                    else if ( ((LA19_3>=RULE_TYPE_INT && LA19_3<=RULE_DATE)) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_SET) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==30) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_ID) ) {
                        alt19=1;
                    }
                    else if ( ((LA19_3>=RULE_TYPE_INT && LA19_3<=RULE_DATE)) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPersistenceDsl.g:1205:3: this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getDefAllModelTypeCollectionVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefAllModelTypeCollectionVariable_0=ruleDefAllModelTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefAllModelTypeCollectionVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:1214:3: this_DefSimpleTypeCollectionVariable_1= ruleDefSimpleTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefSimpleTypeCollectionVariable_1=ruleDefSimpleTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefSimpleTypeCollectionVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefCollectionTypeVariable"


    // $ANTLR start "entryRuleDefAllModelTypeCollectionVariable"
    // InternalPersistenceDsl.g:1226:1: entryRuleDefAllModelTypeCollectionVariable returns [EObject current=null] : iv_ruleDefAllModelTypeCollectionVariable= ruleDefAllModelTypeCollectionVariable EOF ;
    public final EObject entryRuleDefAllModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAllModelTypeCollectionVariable = null;


        try {
            // InternalPersistenceDsl.g:1226:74: (iv_ruleDefAllModelTypeCollectionVariable= ruleDefAllModelTypeCollectionVariable EOF )
            // InternalPersistenceDsl.g:1227:2: iv_ruleDefAllModelTypeCollectionVariable= ruleDefAllModelTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefAllModelTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefAllModelTypeCollectionVariable=ruleDefAllModelTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefAllModelTypeCollectionVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefAllModelTypeCollectionVariable"


    // $ANTLR start "ruleDefAllModelTypeCollectionVariable"
    // InternalPersistenceDsl.g:1233:1: ruleDefAllModelTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefAllModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:1239:2: ( ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPersistenceDsl.g:1240:2: ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPersistenceDsl.g:1240:2: ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPersistenceDsl.g:1241:3: ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPersistenceDsl.g:1241:3: ( (lv_type_0_0= ruleAllModelTypeCollection ) )
            // InternalPersistenceDsl.g:1242:4: (lv_type_0_0= ruleAllModelTypeCollection )
            {
            // InternalPersistenceDsl.g:1242:4: (lv_type_0_0= ruleAllModelTypeCollection )
            // InternalPersistenceDsl.g:1243:5: lv_type_0_0= ruleAllModelTypeCollection
            {

            					newCompositeNode(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleAllModelTypeCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefAllModelTypeCollectionVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.PersistenceDsl.AllModelTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersistenceDsl.g:1260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:1261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:1261:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:1262:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefAllModelTypeCollectionVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefAllModelTypeCollectionVariable"


    // $ANTLR start "entryRuleDefSimpleTypeCollectionVariable"
    // InternalPersistenceDsl.g:1282:1: entryRuleDefSimpleTypeCollectionVariable returns [EObject current=null] : iv_ruleDefSimpleTypeCollectionVariable= ruleDefSimpleTypeCollectionVariable EOF ;
    public final EObject entryRuleDefSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSimpleTypeCollectionVariable = null;


        try {
            // InternalPersistenceDsl.g:1282:72: (iv_ruleDefSimpleTypeCollectionVariable= ruleDefSimpleTypeCollectionVariable EOF )
            // InternalPersistenceDsl.g:1283:2: iv_ruleDefSimpleTypeCollectionVariable= ruleDefSimpleTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefSimpleTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefSimpleTypeCollectionVariable=ruleDefSimpleTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefSimpleTypeCollectionVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefSimpleTypeCollectionVariable"


    // $ANTLR start "ruleDefSimpleTypeCollectionVariable"
    // InternalPersistenceDsl.g:1289:1: ruleDefSimpleTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:1295:2: ( ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPersistenceDsl.g:1296:2: ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPersistenceDsl.g:1296:2: ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPersistenceDsl.g:1297:3: ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPersistenceDsl.g:1297:3: ( (lv_type_0_0= ruleSimpleTypeCollection ) )
            // InternalPersistenceDsl.g:1298:4: (lv_type_0_0= ruleSimpleTypeCollection )
            {
            // InternalPersistenceDsl.g:1298:4: (lv_type_0_0= ruleSimpleTypeCollection )
            // InternalPersistenceDsl.g:1299:5: lv_type_0_0= ruleSimpleTypeCollection
            {

            					newCompositeNode(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleSimpleTypeCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefSimpleTypeCollectionVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.PersistenceDsl.SimpleTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersistenceDsl.g:1316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistenceDsl.g:1317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistenceDsl.g:1317:4: (lv_name_1_0= RULE_ID )
            // InternalPersistenceDsl.g:1318:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefSimpleTypeCollectionVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefSimpleTypeCollectionVariable"


    // $ANTLR start "entryRuleType"
    // InternalPersistenceDsl.g:1338:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalPersistenceDsl.g:1338:44: (iv_ruleType= ruleType EOF )
            // InternalPersistenceDsl.g:1339:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPersistenceDsl.g:1345:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_ComplexType_1 = null;



        	enterRule();

        try {
            // InternalPersistenceDsl.g:1351:2: ( (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) )
            // InternalPersistenceDsl.g:1352:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            {
            // InternalPersistenceDsl.g:1352:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_TYPE_INT && LA20_0<=RULE_TYPE_BINARY)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_DATE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPersistenceDsl.g:1353:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current.merge(this_BasicType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:1364:3: this_ComplexType_1= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_1=ruleComplexType();

                    state._fsp--;


                    			current.merge(this_ComplexType_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBasicType"
    // InternalPersistenceDsl.g:1378:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalPersistenceDsl.g:1378:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalPersistenceDsl.g:1379:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalPersistenceDsl.g:1385:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_INT_0=null;
        Token this_TYPE_DOUBLE_1=null;
        Token this_TYPE_FLOAT_2=null;
        Token this_TYPE_LONG_3=null;
        Token this_TYPE_CHAR_4=null;
        Token this_TYPE_STRING_5=null;
        Token this_TYPE_BOOLEAN_6=null;
        Token this_TYPE_BINARY_7=null;


        	enterRule();

        try {
            // InternalPersistenceDsl.g:1391:2: ( (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY ) )
            // InternalPersistenceDsl.g:1392:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY )
            {
            // InternalPersistenceDsl.g:1392:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY )
            int alt21=8;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
                {
                alt21=1;
                }
                break;
            case RULE_TYPE_DOUBLE:
                {
                alt21=2;
                }
                break;
            case RULE_TYPE_FLOAT:
                {
                alt21=3;
                }
                break;
            case RULE_TYPE_LONG:
                {
                alt21=4;
                }
                break;
            case RULE_TYPE_CHAR:
                {
                alt21=5;
                }
                break;
            case RULE_TYPE_STRING:
                {
                alt21=6;
                }
                break;
            case RULE_TYPE_BOOLEAN:
                {
                alt21=7;
                }
                break;
            case RULE_TYPE_BINARY:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPersistenceDsl.g:1393:3: this_TYPE_INT_0= RULE_TYPE_INT
                    {
                    this_TYPE_INT_0=(Token)match(input,RULE_TYPE_INT,FOLLOW_2); 

                    			current.merge(this_TYPE_INT_0);
                    		

                    			newLeafNode(this_TYPE_INT_0, grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:1401:3: this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE
                    {
                    this_TYPE_DOUBLE_1=(Token)match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_TYPE_DOUBLE_1);
                    		

                    			newLeafNode(this_TYPE_DOUBLE_1, grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:1409:3: this_TYPE_FLOAT_2= RULE_TYPE_FLOAT
                    {
                    this_TYPE_FLOAT_2=(Token)match(input,RULE_TYPE_FLOAT,FOLLOW_2); 

                    			current.merge(this_TYPE_FLOAT_2);
                    		

                    			newLeafNode(this_TYPE_FLOAT_2, grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPersistenceDsl.g:1417:3: this_TYPE_LONG_3= RULE_TYPE_LONG
                    {
                    this_TYPE_LONG_3=(Token)match(input,RULE_TYPE_LONG,FOLLOW_2); 

                    			current.merge(this_TYPE_LONG_3);
                    		

                    			newLeafNode(this_TYPE_LONG_3, grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPersistenceDsl.g:1425:3: this_TYPE_CHAR_4= RULE_TYPE_CHAR
                    {
                    this_TYPE_CHAR_4=(Token)match(input,RULE_TYPE_CHAR,FOLLOW_2); 

                    			current.merge(this_TYPE_CHAR_4);
                    		

                    			newLeafNode(this_TYPE_CHAR_4, grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPersistenceDsl.g:1433:3: this_TYPE_STRING_5= RULE_TYPE_STRING
                    {
                    this_TYPE_STRING_5=(Token)match(input,RULE_TYPE_STRING,FOLLOW_2); 

                    			current.merge(this_TYPE_STRING_5);
                    		

                    			newLeafNode(this_TYPE_STRING_5, grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPersistenceDsl.g:1441:3: this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN
                    {
                    this_TYPE_BOOLEAN_6=(Token)match(input,RULE_TYPE_BOOLEAN,FOLLOW_2); 

                    			current.merge(this_TYPE_BOOLEAN_6);
                    		

                    			newLeafNode(this_TYPE_BOOLEAN_6, grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalPersistenceDsl.g:1449:3: this_TYPE_BINARY_7= RULE_TYPE_BINARY
                    {
                    this_TYPE_BINARY_7=(Token)match(input,RULE_TYPE_BINARY,FOLLOW_2); 

                    			current.merge(this_TYPE_BINARY_7);
                    		

                    			newLeafNode(this_TYPE_BINARY_7, grammarAccess.getBasicTypeAccess().getTYPE_BINARYTerminalRuleCall_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleComplexType"
    // InternalPersistenceDsl.g:1460:1: entryRuleComplexType returns [String current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final String entryRuleComplexType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexType = null;


        try {
            // InternalPersistenceDsl.g:1460:51: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalPersistenceDsl.g:1461:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalPersistenceDsl.g:1467:1: ruleComplexType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleComplexType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalPersistenceDsl.g:1473:2: (this_DATE_0= RULE_DATE )
            // InternalPersistenceDsl.g:1474:2: this_DATE_0= RULE_DATE
            {
            this_DATE_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            		current.merge(this_DATE_0);
            	

            		newLeafNode(this_DATE_0, grammarAccess.getComplexTypeAccess().getDATETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000002000FFB0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000002100FFB0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000800FFF0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000FF80L});

}