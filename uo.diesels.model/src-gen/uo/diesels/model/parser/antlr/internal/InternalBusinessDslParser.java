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
import uo.diesels.model.services.BusinessDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBusinessDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIST", "RULE_SET", "RULE_VOID", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_TYPE_BINARY", "RULE_DATE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Service'", "'{'", "'}'", "'('", "')'", "'save'", "'update'", "'delete'", "'find'", "'<'", "'>'", "'finder'", "','", "'#'"
    };
    public static final int RULE_SET=6;
    public static final int RULE_STRING=18;
    public static final int RULE_TYPE_CHAR=12;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_TYPE_STRING=13;
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
    public static final int RULE_ID=4;
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=11;
    public static final int RULE_WS=21;
    public static final int RULE_TYPE_FLOAT=10;
    public static final int RULE_TYPE_BINARY=15;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_TYPE_BOOLEAN=14;
    public static final int RULE_DATE=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_TYPE_DOUBLE=9;
    public static final int T__25=25;

    // delegates
    // delegators


        public InternalBusinessDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBusinessDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBusinessDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBusinessDsl.g"; }



     	private BusinessDslGrammarAccess grammarAccess;

        public InternalBusinessDslParser(TokenStream input, BusinessDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BusinessDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBusinessDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBusinessDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBusinessDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalBusinessDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_services_0_0= ruleService ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_services_0_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:77:2: ( ( (lv_services_0_0= ruleService ) )* )
            // InternalBusinessDsl.g:78:2: ( (lv_services_0_0= ruleService ) )*
            {
            // InternalBusinessDsl.g:78:2: ( (lv_services_0_0= ruleService ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBusinessDsl.g:79:3: (lv_services_0_0= ruleService )
            	    {
            	    // InternalBusinessDsl.g:79:3: (lv_services_0_0= ruleService )
            	    // InternalBusinessDsl.g:80:4: lv_services_0_0= ruleService
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_services_0_0=ruleService();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"services",
            	    					lv_services_0_0,
            	    					"uo.diesels.model.BusinessDsl.Service");
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


    // $ANTLR start "entryRuleService"
    // InternalBusinessDsl.g:100:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalBusinessDsl.g:100:48: (iv_ruleService= ruleService EOF )
            // InternalBusinessDsl.g:101:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalBusinessDsl.g:107:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleServiceMethod ) )+ otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:113:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleServiceMethod ) )+ otherlv_4= '}' ) )
            // InternalBusinessDsl.g:114:2: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleServiceMethod ) )+ otherlv_4= '}' )
            {
            // InternalBusinessDsl.g:114:2: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleServiceMethod ) )+ otherlv_4= '}' )
            // InternalBusinessDsl.g:115:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleServiceMethod ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalBusinessDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBusinessDsl.g:141:3: ( (lv_methods_3_0= ruleServiceMethod ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_DATE)||LA2_0==36) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBusinessDsl.g:142:4: (lv_methods_3_0= ruleServiceMethod )
            	    {
            	    // InternalBusinessDsl.g:142:4: (lv_methods_3_0= ruleServiceMethod )
            	    // InternalBusinessDsl.g:143:5: lv_methods_3_0= ruleServiceMethod
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getMethodsServiceMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_methods_3_0=ruleServiceMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_3_0,
            	    						"uo.diesels.model.BusinessDsl.ServiceMethod");
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

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceMethod"
    // InternalBusinessDsl.g:168:1: entryRuleServiceMethod returns [EObject current=null] : iv_ruleServiceMethod= ruleServiceMethod EOF ;
    public final EObject entryRuleServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMethod = null;


        try {
            // InternalBusinessDsl.g:168:54: (iv_ruleServiceMethod= ruleServiceMethod EOF )
            // InternalBusinessDsl.g:169:2: iv_ruleServiceMethod= ruleServiceMethod EOF
            {
             newCompositeNode(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceMethod=ruleServiceMethod();

            state._fsp--;

             current =iv_ruleServiceMethod; 
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
    // $ANTLR end "entryRuleServiceMethod"


    // $ANTLR start "ruleServiceMethod"
    // InternalBusinessDsl.g:175:1: ruleServiceMethod returns [EObject current=null] : (this_JpaMethod_0= ruleJpaMethod | this_FinderUserMethod_1= ruleFinderUserMethod ) ;
    public final EObject ruleServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject this_JpaMethod_0 = null;

        EObject this_FinderUserMethod_1 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:181:2: ( (this_JpaMethod_0= ruleJpaMethod | this_FinderUserMethod_1= ruleFinderUserMethod ) )
            // InternalBusinessDsl.g:182:2: (this_JpaMethod_0= ruleJpaMethod | this_FinderUserMethod_1= ruleFinderUserMethod )
            {
            // InternalBusinessDsl.g:182:2: (this_JpaMethod_0= ruleJpaMethod | this_FinderUserMethod_1= ruleFinderUserMethod )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==26) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=RULE_LIST && LA3_0<=RULE_DATE)||LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBusinessDsl.g:183:3: this_JpaMethod_0= ruleJpaMethod
                    {

                    			newCompositeNode(grammarAccess.getServiceMethodAccess().getJpaMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JpaMethod_0=ruleJpaMethod();

                    state._fsp--;


                    			current = this_JpaMethod_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:192:3: this_FinderUserMethod_1= ruleFinderUserMethod
                    {

                    			newCompositeNode(grammarAccess.getServiceMethodAccess().getFinderUserMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FinderUserMethod_1=ruleFinderUserMethod();

                    state._fsp--;


                    			current = this_FinderUserMethod_1;
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
    // $ANTLR end "ruleServiceMethod"


    // $ANTLR start "entryRuleJpaMethod"
    // InternalBusinessDsl.g:204:1: entryRuleJpaMethod returns [EObject current=null] : iv_ruleJpaMethod= ruleJpaMethod EOF ;
    public final EObject entryRuleJpaMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJpaMethod = null;


        try {
            // InternalBusinessDsl.g:204:50: (iv_ruleJpaMethod= ruleJpaMethod EOF )
            // InternalBusinessDsl.g:205:2: iv_ruleJpaMethod= ruleJpaMethod EOF
            {
             newCompositeNode(grammarAccess.getJpaMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJpaMethod=ruleJpaMethod();

            state._fsp--;

             current =iv_ruleJpaMethod; 
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
    // $ANTLR end "entryRuleJpaMethod"


    // $ANTLR start "ruleJpaMethod"
    // InternalBusinessDsl.g:211:1: ruleJpaMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ( ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) ) ) otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) otherlv_6= '>' ) ;
    public final EObject ruleJpaMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_keyword_3_1=null;
        Token lv_keyword_3_2=null;
        Token lv_keyword_3_3=null;
        Token lv_keyword_3_4=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBusinessDsl.g:217:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ( ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) ) ) otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) otherlv_6= '>' ) )
            // InternalBusinessDsl.g:218:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ( ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) ) ) otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) otherlv_6= '>' )
            {
            // InternalBusinessDsl.g:218:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ( ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) ) ) otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) otherlv_6= '>' )
            // InternalBusinessDsl.g:219:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ( ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) ) ) otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) otherlv_6= '>'
            {
            // InternalBusinessDsl.g:219:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBusinessDsl.g:220:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBusinessDsl.g:220:4: (lv_name_0_0= RULE_ID )
            // InternalBusinessDsl.g:221:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getJpaMethodAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJpaMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getJpaMethodAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getJpaMethodAccess().getRightParenthesisKeyword_2());
            		
            // InternalBusinessDsl.g:245:3: ( ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) ) )
            // InternalBusinessDsl.g:246:4: ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) )
            {
            // InternalBusinessDsl.g:246:4: ( (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' ) )
            // InternalBusinessDsl.g:247:5: (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' )
            {
            // InternalBusinessDsl.g:247:5: (lv_keyword_3_1= 'save' | lv_keyword_3_2= 'update' | lv_keyword_3_3= 'delete' | lv_keyword_3_4= 'find' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBusinessDsl.g:248:6: lv_keyword_3_1= 'save'
                    {
                    lv_keyword_3_1=(Token)match(input,28,FOLLOW_11); 

                    						newLeafNode(lv_keyword_3_1, grammarAccess.getJpaMethodAccess().getKeywordSaveKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJpaMethodRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:259:6: lv_keyword_3_2= 'update'
                    {
                    lv_keyword_3_2=(Token)match(input,29,FOLLOW_11); 

                    						newLeafNode(lv_keyword_3_2, grammarAccess.getJpaMethodAccess().getKeywordUpdateKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJpaMethodRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:270:6: lv_keyword_3_3= 'delete'
                    {
                    lv_keyword_3_3=(Token)match(input,30,FOLLOW_11); 

                    						newLeafNode(lv_keyword_3_3, grammarAccess.getJpaMethodAccess().getKeywordDeleteKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJpaMethodRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:281:6: lv_keyword_3_4= 'find'
                    {
                    lv_keyword_3_4=(Token)match(input,31,FOLLOW_11); 

                    						newLeafNode(lv_keyword_3_4, grammarAccess.getJpaMethodAccess().getKeywordFindKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJpaMethodRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_3_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getJpaMethodAccess().getLessThanSignKeyword_4());
            		
            // InternalBusinessDsl.g:298:3: ( (otherlv_5= RULE_ID ) )
            // InternalBusinessDsl.g:299:4: (otherlv_5= RULE_ID )
            {
            // InternalBusinessDsl.g:299:4: (otherlv_5= RULE_ID )
            // InternalBusinessDsl.g:300:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJpaMethodRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getJpaMethodAccess().getEntityEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJpaMethodAccess().getGreaterThanSignKeyword_6());
            		

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
    // $ANTLR end "ruleJpaMethod"


    // $ANTLR start "entryRuleFinderUserMethod"
    // InternalBusinessDsl.g:319:1: entryRuleFinderUserMethod returns [EObject current=null] : iv_ruleFinderUserMethod= ruleFinderUserMethod EOF ;
    public final EObject entryRuleFinderUserMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinderUserMethod = null;


        try {
            // InternalBusinessDsl.g:319:57: (iv_ruleFinderUserMethod= ruleFinderUserMethod EOF )
            // InternalBusinessDsl.g:320:2: iv_ruleFinderUserMethod= ruleFinderUserMethod EOF
            {
             newCompositeNode(grammarAccess.getFinderUserMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinderUserMethod=ruleFinderUserMethod();

            state._fsp--;

             current =iv_ruleFinderUserMethod; 
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
    // $ANTLR end "entryRuleFinderUserMethod"


    // $ANTLR start "ruleFinderUserMethod"
    // InternalBusinessDsl.g:326:1: ruleFinderUserMethod returns [EObject current=null] : ( (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodAllModelReturn_1= ruleMethodAllModelReturn | this_MethodDtoReturn_2= ruleMethodDtoReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) ( ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' )? ) ;
    public final EObject ruleFinderUserMethod() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_MethodSimpleReturn_0 = null;

        EObject this_MethodAllModelReturn_1 = null;

        EObject this_MethodDtoReturn_2 = null;

        EObject this_MethodCollectionReturn_3 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:332:2: ( ( (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodAllModelReturn_1= ruleMethodAllModelReturn | this_MethodDtoReturn_2= ruleMethodDtoReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) ( ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' )? ) )
            // InternalBusinessDsl.g:333:2: ( (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodAllModelReturn_1= ruleMethodAllModelReturn | this_MethodDtoReturn_2= ruleMethodDtoReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) ( ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' )? )
            {
            // InternalBusinessDsl.g:333:2: ( (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodAllModelReturn_1= ruleMethodAllModelReturn | this_MethodDtoReturn_2= ruleMethodDtoReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) ( ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' )? )
            // InternalBusinessDsl.g:334:3: (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodAllModelReturn_1= ruleMethodAllModelReturn | this_MethodDtoReturn_2= ruleMethodDtoReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn ) ( ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' )?
            {
            // InternalBusinessDsl.g:334:3: (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodAllModelReturn_1= ruleMethodAllModelReturn | this_MethodDtoReturn_2= ruleMethodDtoReturn | this_MethodCollectionReturn_3= ruleMethodCollectionReturn )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_VOID:
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
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBusinessDsl.g:335:4: this_MethodSimpleReturn_0= ruleMethodSimpleReturn
                    {

                    				newCompositeNode(grammarAccess.getFinderUserMethodAccess().getMethodSimpleReturnParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_MethodSimpleReturn_0=ruleMethodSimpleReturn();

                    state._fsp--;


                    				current = this_MethodSimpleReturn_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:344:4: this_MethodAllModelReturn_1= ruleMethodAllModelReturn
                    {

                    				newCompositeNode(grammarAccess.getFinderUserMethodAccess().getMethodAllModelReturnParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_MethodAllModelReturn_1=ruleMethodAllModelReturn();

                    state._fsp--;


                    				current = this_MethodAllModelReturn_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:353:4: this_MethodDtoReturn_2= ruleMethodDtoReturn
                    {

                    				newCompositeNode(grammarAccess.getFinderUserMethodAccess().getMethodDtoReturnParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_13);
                    this_MethodDtoReturn_2=ruleMethodDtoReturn();

                    state._fsp--;


                    				current = this_MethodDtoReturn_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:362:4: this_MethodCollectionReturn_3= ruleMethodCollectionReturn
                    {

                    				newCompositeNode(grammarAccess.getFinderUserMethodAccess().getMethodCollectionReturnParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_13);
                    this_MethodCollectionReturn_3=ruleMethodCollectionReturn();

                    state._fsp--;


                    				current = this_MethodCollectionReturn_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBusinessDsl.g:371:3: ( ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBusinessDsl.g:372:4: ( (lv_keyword_4_0= 'finder' ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>'
                    {
                    // InternalBusinessDsl.g:372:4: ( (lv_keyword_4_0= 'finder' ) )
                    // InternalBusinessDsl.g:373:5: (lv_keyword_4_0= 'finder' )
                    {
                    // InternalBusinessDsl.g:373:5: (lv_keyword_4_0= 'finder' )
                    // InternalBusinessDsl.g:374:6: lv_keyword_4_0= 'finder'
                    {
                    lv_keyword_4_0=(Token)match(input,34,FOLLOW_11); 

                    						newLeafNode(lv_keyword_4_0, grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFinderUserMethodRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_4_0, "finder");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFinderUserMethodAccess().getLessThanSignKeyword_1_1());
                    			
                    // InternalBusinessDsl.g:390:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBusinessDsl.g:391:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBusinessDsl.g:391:5: (otherlv_6= RULE_ID )
                    // InternalBusinessDsl.g:392:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFinderUserMethodRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_6, grammarAccess.getFinderUserMethodAccess().getFinderFinderCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFinderUserMethodAccess().getGreaterThanSignKeyword_1_3());
                    			

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
    // $ANTLR end "ruleFinderUserMethod"


    // $ANTLR start "entryRuleMethodSimpleReturn"
    // InternalBusinessDsl.g:412:1: entryRuleMethodSimpleReturn returns [EObject current=null] : iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF ;
    public final EObject entryRuleMethodSimpleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSimpleReturn = null;


        try {
            // InternalBusinessDsl.g:412:59: (iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF )
            // InternalBusinessDsl.g:413:2: iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF
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
    // InternalBusinessDsl.g:419:1: ruleMethodSimpleReturn returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleMethodSimpleReturn() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_returnType_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:425:2: ( ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalBusinessDsl.g:426:2: ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalBusinessDsl.g:426:2: ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalBusinessDsl.g:427:3: ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalBusinessDsl.g:427:3: ( (lv_returnType_0_0= ruleSimpleReturnType ) )
            // InternalBusinessDsl.g:428:4: (lv_returnType_0_0= ruleSimpleReturnType )
            {
            // InternalBusinessDsl.g:428:4: (lv_returnType_0_0= ruleSimpleReturnType )
            // InternalBusinessDsl.g:429:5: lv_returnType_0_0= ruleSimpleReturnType
            {

            					newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeSimpleReturnTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_returnType_0_0=ruleSimpleReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"uo.diesels.model.BusinessDsl.SimpleReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBusinessDsl.g:446:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:447:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:447:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:448:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBusinessDsl.g:468:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_SET)||(LA8_0>=RULE_TYPE_INT && LA8_0<=RULE_DATE)||LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBusinessDsl.g:469:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalBusinessDsl.g:469:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalBusinessDsl.g:470:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalBusinessDsl.g:470:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalBusinessDsl.g:471:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.BusinessDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBusinessDsl.g:488:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==35) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBusinessDsl.g:489:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalBusinessDsl.g:493:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalBusinessDsl.g:494:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalBusinessDsl.g:494:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalBusinessDsl.g:495:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.BusinessDsl.DefVariable");
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

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleMethodAllModelReturn"
    // InternalBusinessDsl.g:522:1: entryRuleMethodAllModelReturn returns [EObject current=null] : iv_ruleMethodAllModelReturn= ruleMethodAllModelReturn EOF ;
    public final EObject entryRuleMethodAllModelReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodAllModelReturn = null;


        try {
            // InternalBusinessDsl.g:522:61: (iv_ruleMethodAllModelReturn= ruleMethodAllModelReturn EOF )
            // InternalBusinessDsl.g:523:2: iv_ruleMethodAllModelReturn= ruleMethodAllModelReturn EOF
            {
             newCompositeNode(grammarAccess.getMethodAllModelReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodAllModelReturn=ruleMethodAllModelReturn();

            state._fsp--;

             current =iv_ruleMethodAllModelReturn; 
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
    // $ANTLR end "entryRuleMethodAllModelReturn"


    // $ANTLR start "ruleMethodAllModelReturn"
    // InternalBusinessDsl.g:529:1: ruleMethodAllModelReturn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleMethodAllModelReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:535:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalBusinessDsl.g:536:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalBusinessDsl.g:536:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalBusinessDsl.g:537:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalBusinessDsl.g:537:3: ( (otherlv_0= RULE_ID ) )
            // InternalBusinessDsl.g:538:4: (otherlv_0= RULE_ID )
            {
            // InternalBusinessDsl.g:538:4: (otherlv_0= RULE_ID )
            // InternalBusinessDsl.g:539:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodAllModelReturnRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalBusinessDsl.g:550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:551:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:552:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodAllModelReturnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodAllModelReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAllModelReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBusinessDsl.g:572:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_SET)||(LA10_0>=RULE_TYPE_INT && LA10_0<=RULE_DATE)||LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBusinessDsl.g:573:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalBusinessDsl.g:573:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalBusinessDsl.g:574:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalBusinessDsl.g:574:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalBusinessDsl.g:575:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodAllModelReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.BusinessDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBusinessDsl.g:592:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==35) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBusinessDsl.g:593:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAllModelReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalBusinessDsl.g:597:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalBusinessDsl.g:598:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalBusinessDsl.g:598:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalBusinessDsl.g:599:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodAllModelReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.BusinessDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAllModelReturnAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMethodAllModelReturn"


    // $ANTLR start "entryRuleMethodDtoReturn"
    // InternalBusinessDsl.g:626:1: entryRuleMethodDtoReturn returns [EObject current=null] : iv_ruleMethodDtoReturn= ruleMethodDtoReturn EOF ;
    public final EObject entryRuleMethodDtoReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDtoReturn = null;


        try {
            // InternalBusinessDsl.g:626:56: (iv_ruleMethodDtoReturn= ruleMethodDtoReturn EOF )
            // InternalBusinessDsl.g:627:2: iv_ruleMethodDtoReturn= ruleMethodDtoReturn EOF
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
    // InternalBusinessDsl.g:633:1: ruleMethodDtoReturn returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleMethodDtoReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:639:2: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' ) )
            // InternalBusinessDsl.g:640:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' )
            {
            // InternalBusinessDsl.g:640:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')' )
            // InternalBusinessDsl.g:641:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0());
            		
            // InternalBusinessDsl.g:645:3: ( (otherlv_1= RULE_ID ) )
            // InternalBusinessDsl.g:646:4: (otherlv_1= RULE_ID )
            {
            // InternalBusinessDsl.g:646:4: (otherlv_1= RULE_ID )
            // InternalBusinessDsl.g:647:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDtoReturnRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0());
            				

            }


            }

            // InternalBusinessDsl.g:658:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBusinessDsl.g:659:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBusinessDsl.g:659:4: (lv_name_2_0= RULE_ID )
            // InternalBusinessDsl.g:660:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBusinessDsl.g:680:3: ( ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_SET)||(LA12_0>=RULE_TYPE_INT && LA12_0<=RULE_DATE)||LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBusinessDsl.g:681:4: ( (lv_parameters_4_0= ruleDefVariable ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )*
                    {
                    // InternalBusinessDsl.g:681:4: ( (lv_parameters_4_0= ruleDefVariable ) )
                    // InternalBusinessDsl.g:682:5: (lv_parameters_4_0= ruleDefVariable )
                    {
                    // InternalBusinessDsl.g:682:5: (lv_parameters_4_0= ruleDefVariable )
                    // InternalBusinessDsl.g:683:6: lv_parameters_4_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_parameters_4_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodDtoReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"uo.diesels.model.BusinessDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBusinessDsl.g:700:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==35) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBusinessDsl.g:701:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBusinessDsl.g:705:5: ( (lv_parameters_6_0= ruleDefVariable ) )
                    	    // InternalBusinessDsl.g:706:6: (lv_parameters_6_0= ruleDefVariable )
                    	    {
                    	    // InternalBusinessDsl.g:706:6: (lv_parameters_6_0= ruleDefVariable )
                    	    // InternalBusinessDsl.g:707:7: lv_parameters_6_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_parameters_6_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodDtoReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"uo.diesels.model.BusinessDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalBusinessDsl.g:734:1: entryRuleMethodCollectionReturn returns [EObject current=null] : iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF ;
    public final EObject entryRuleMethodCollectionReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCollectionReturn = null;


        try {
            // InternalBusinessDsl.g:734:63: (iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF )
            // InternalBusinessDsl.g:735:2: iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF
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
    // InternalBusinessDsl.g:741:1: ruleMethodCollectionReturn returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalBusinessDsl.g:747:2: ( ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalBusinessDsl.g:748:2: ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalBusinessDsl.g:748:2: ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalBusinessDsl.g:749:3: ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalBusinessDsl.g:749:3: ( (lv_returnType_0_0= ruleCollectionReturnType ) )
            // InternalBusinessDsl.g:750:4: (lv_returnType_0_0= ruleCollectionReturnType )
            {
            // InternalBusinessDsl.g:750:4: (lv_returnType_0_0= ruleCollectionReturnType )
            // InternalBusinessDsl.g:751:5: lv_returnType_0_0= ruleCollectionReturnType
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
            						"uo.diesels.model.BusinessDsl.CollectionReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBusinessDsl.g:768:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:769:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:769:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:770:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBusinessDsl.g:790:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_SET)||(LA14_0>=RULE_TYPE_INT && LA14_0<=RULE_DATE)||LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBusinessDsl.g:791:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalBusinessDsl.g:791:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalBusinessDsl.g:792:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalBusinessDsl.g:792:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalBusinessDsl.g:793:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.BusinessDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBusinessDsl.g:810:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==35) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBusinessDsl.g:811:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalBusinessDsl.g:815:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalBusinessDsl.g:816:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalBusinessDsl.g:816:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalBusinessDsl.g:817:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.BusinessDsl.DefVariable");
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


    // $ANTLR start "entryRuleDefVariable"
    // InternalBusinessDsl.g:844:1: entryRuleDefVariable returns [EObject current=null] : iv_ruleDefVariable= ruleDefVariable EOF ;
    public final EObject entryRuleDefVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefVariable = null;


        try {
            // InternalBusinessDsl.g:844:52: (iv_ruleDefVariable= ruleDefVariable EOF )
            // InternalBusinessDsl.g:845:2: iv_ruleDefVariable= ruleDefVariable EOF
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
    // InternalBusinessDsl.g:851:1: ruleDefVariable returns [EObject current=null] : (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefDtoTypeVariable_2= ruleDefDtoTypeVariable | this_DefCollectionTypeVariable_3= ruleDefCollectionTypeVariable ) ;
    public final EObject ruleDefVariable() throws RecognitionException {
        EObject current = null;

        EObject this_DefSimpleVariable_0 = null;

        EObject this_DefAllModelTypeVariable_1 = null;

        EObject this_DefDtoTypeVariable_2 = null;

        EObject this_DefCollectionTypeVariable_3 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:857:2: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefDtoTypeVariable_2= ruleDefDtoTypeVariable | this_DefCollectionTypeVariable_3= ruleDefCollectionTypeVariable ) )
            // InternalBusinessDsl.g:858:2: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefDtoTypeVariable_2= ruleDefDtoTypeVariable | this_DefCollectionTypeVariable_3= ruleDefCollectionTypeVariable )
            {
            // InternalBusinessDsl.g:858:2: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefDtoTypeVariable_2= ruleDefDtoTypeVariable | this_DefCollectionTypeVariable_3= ruleDefCollectionTypeVariable )
            int alt15=4;
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
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBusinessDsl.g:859:3: this_DefSimpleVariable_0= ruleDefSimpleVariable
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
                    // InternalBusinessDsl.g:868:3: this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable
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
                    // InternalBusinessDsl.g:877:3: this_DefDtoTypeVariable_2= ruleDefDtoTypeVariable
                    {

                    			newCompositeNode(grammarAccess.getDefVariableAccess().getDefDtoTypeVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoTypeVariable_2=ruleDefDtoTypeVariable();

                    state._fsp--;


                    			current = this_DefDtoTypeVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:886:3: this_DefCollectionTypeVariable_3= ruleDefCollectionTypeVariable
                    {

                    			newCompositeNode(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefCollectionTypeVariable_3=ruleDefCollectionTypeVariable();

                    state._fsp--;


                    			current = this_DefCollectionTypeVariable_3;
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
    // InternalBusinessDsl.g:898:1: entryRuleDefAllModelTypeVariable returns [EObject current=null] : iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF ;
    public final EObject entryRuleDefAllModelTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAllModelTypeVariable = null;


        try {
            // InternalBusinessDsl.g:898:64: (iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF )
            // InternalBusinessDsl.g:899:2: iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF
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
    // InternalBusinessDsl.g:905:1: ruleDefAllModelTypeVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefAllModelTypeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBusinessDsl.g:911:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBusinessDsl.g:912:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBusinessDsl.g:912:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBusinessDsl.g:913:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBusinessDsl.g:913:3: ( (otherlv_0= RULE_ID ) )
            // InternalBusinessDsl.g:914:4: (otherlv_0= RULE_ID )
            {
            // InternalBusinessDsl.g:914:4: (otherlv_0= RULE_ID )
            // InternalBusinessDsl.g:915:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefAllModelTypeVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalBusinessDsl.g:926:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:927:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:927:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:928:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleDefDtoTypeVariable"
    // InternalBusinessDsl.g:948:1: entryRuleDefDtoTypeVariable returns [EObject current=null] : iv_ruleDefDtoTypeVariable= ruleDefDtoTypeVariable EOF ;
    public final EObject entryRuleDefDtoTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoTypeVariable = null;


        try {
            // InternalBusinessDsl.g:948:59: (iv_ruleDefDtoTypeVariable= ruleDefDtoTypeVariable EOF )
            // InternalBusinessDsl.g:949:2: iv_ruleDefDtoTypeVariable= ruleDefDtoTypeVariable EOF
            {
             newCompositeNode(grammarAccess.getDefDtoTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoTypeVariable=ruleDefDtoTypeVariable();

            state._fsp--;

             current =iv_ruleDefDtoTypeVariable; 
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
    // $ANTLR end "entryRuleDefDtoTypeVariable"


    // $ANTLR start "ruleDefDtoTypeVariable"
    // InternalBusinessDsl.g:955:1: ruleDefDtoTypeVariable returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDefDtoTypeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBusinessDsl.g:961:2: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBusinessDsl.g:962:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBusinessDsl.g:962:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBusinessDsl.g:963:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefDtoTypeVariableAccess().getNumberSignKeyword_0());
            		
            // InternalBusinessDsl.g:967:3: ( (otherlv_1= RULE_ID ) )
            // InternalBusinessDsl.g:968:4: (otherlv_1= RULE_ID )
            {
            // InternalBusinessDsl.g:968:4: (otherlv_1= RULE_ID )
            // InternalBusinessDsl.g:969:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoTypeVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getDefDtoTypeVariableAccess().getTypeDtoCrossReference_1_0());
            				

            }


            }

            // InternalBusinessDsl.g:980:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBusinessDsl.g:981:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBusinessDsl.g:981:4: (lv_name_2_0= RULE_ID )
            // InternalBusinessDsl.g:982:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDefDtoTypeVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoTypeVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleDefDtoTypeVariable"


    // $ANTLR start "entryRuleDefSimpleVariable"
    // InternalBusinessDsl.g:1002:1: entryRuleDefSimpleVariable returns [EObject current=null] : iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF ;
    public final EObject entryRuleDefSimpleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSimpleVariable = null;


        try {
            // InternalBusinessDsl.g:1002:58: (iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF )
            // InternalBusinessDsl.g:1003:2: iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF
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
    // InternalBusinessDsl.g:1009:1: ruleDefSimpleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefSimpleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1015:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBusinessDsl.g:1016:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBusinessDsl.g:1016:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBusinessDsl.g:1017:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBusinessDsl.g:1017:3: ( (lv_type_0_0= ruleType ) )
            // InternalBusinessDsl.g:1018:4: (lv_type_0_0= ruleType )
            {
            // InternalBusinessDsl.g:1018:4: (lv_type_0_0= ruleType )
            // InternalBusinessDsl.g:1019:5: lv_type_0_0= ruleType
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
            						"uo.diesels.model.BusinessDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBusinessDsl.g:1036:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:1037:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:1037:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:1038:5: lv_name_1_0= RULE_ID
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
    // InternalBusinessDsl.g:1058:1: entryRuleDefCollectionTypeVariable returns [EObject current=null] : iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF ;
    public final EObject entryRuleDefCollectionTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCollectionTypeVariable = null;


        try {
            // InternalBusinessDsl.g:1058:66: (iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF )
            // InternalBusinessDsl.g:1059:2: iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF
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
    // InternalBusinessDsl.g:1065:1: ruleDefCollectionTypeVariable returns [EObject current=null] : (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefDtoTypeCollectionVariable_1= ruleDefDtoTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_2= ruleDefSimpleTypeCollectionVariable ) ;
    public final EObject ruleDefCollectionTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject this_DefAllModelTypeCollectionVariable_0 = null;

        EObject this_DefDtoTypeCollectionVariable_1 = null;

        EObject this_DefSimpleTypeCollectionVariable_2 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1071:2: ( (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefDtoTypeCollectionVariable_1= ruleDefDtoTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_2= ruleDefSimpleTypeCollectionVariable ) )
            // InternalBusinessDsl.g:1072:2: (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefDtoTypeCollectionVariable_1= ruleDefDtoTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_2= ruleDefSimpleTypeCollectionVariable )
            {
            // InternalBusinessDsl.g:1072:2: (this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable | this_DefDtoTypeCollectionVariable_1= ruleDefDtoTypeCollectionVariable | this_DefSimpleTypeCollectionVariable_2= ruleDefSimpleTypeCollectionVariable )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LIST) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==32) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        alt16=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt16=1;
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
                        alt16=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==RULE_SET) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==32) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        alt16=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt16=1;
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
                        alt16=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBusinessDsl.g:1073:3: this_DefAllModelTypeCollectionVariable_0= ruleDefAllModelTypeCollectionVariable
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
                    // InternalBusinessDsl.g:1082:3: this_DefDtoTypeCollectionVariable_1= ruleDefDtoTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getDefDtoTypeCollectionVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoTypeCollectionVariable_1=ruleDefDtoTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefDtoTypeCollectionVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:1091:3: this_DefSimpleTypeCollectionVariable_2= ruleDefSimpleTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefSimpleTypeCollectionVariable_2=ruleDefSimpleTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefSimpleTypeCollectionVariable_2;
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
    // InternalBusinessDsl.g:1103:1: entryRuleDefAllModelTypeCollectionVariable returns [EObject current=null] : iv_ruleDefAllModelTypeCollectionVariable= ruleDefAllModelTypeCollectionVariable EOF ;
    public final EObject entryRuleDefAllModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAllModelTypeCollectionVariable = null;


        try {
            // InternalBusinessDsl.g:1103:74: (iv_ruleDefAllModelTypeCollectionVariable= ruleDefAllModelTypeCollectionVariable EOF )
            // InternalBusinessDsl.g:1104:2: iv_ruleDefAllModelTypeCollectionVariable= ruleDefAllModelTypeCollectionVariable EOF
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
    // InternalBusinessDsl.g:1110:1: ruleDefAllModelTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefAllModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1116:2: ( ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBusinessDsl.g:1117:2: ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBusinessDsl.g:1117:2: ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBusinessDsl.g:1118:3: ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBusinessDsl.g:1118:3: ( (lv_type_0_0= ruleAllModelTypeCollection ) )
            // InternalBusinessDsl.g:1119:4: (lv_type_0_0= ruleAllModelTypeCollection )
            {
            // InternalBusinessDsl.g:1119:4: (lv_type_0_0= ruleAllModelTypeCollection )
            // InternalBusinessDsl.g:1120:5: lv_type_0_0= ruleAllModelTypeCollection
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
            						"uo.diesels.model.BusinessDsl.AllModelTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBusinessDsl.g:1137:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:1138:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:1138:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:1139:5: lv_name_1_0= RULE_ID
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
    // InternalBusinessDsl.g:1159:1: entryRuleDefSimpleTypeCollectionVariable returns [EObject current=null] : iv_ruleDefSimpleTypeCollectionVariable= ruleDefSimpleTypeCollectionVariable EOF ;
    public final EObject entryRuleDefSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSimpleTypeCollectionVariable = null;


        try {
            // InternalBusinessDsl.g:1159:72: (iv_ruleDefSimpleTypeCollectionVariable= ruleDefSimpleTypeCollectionVariable EOF )
            // InternalBusinessDsl.g:1160:2: iv_ruleDefSimpleTypeCollectionVariable= ruleDefSimpleTypeCollectionVariable EOF
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
    // InternalBusinessDsl.g:1166:1: ruleDefSimpleTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1172:2: ( ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBusinessDsl.g:1173:2: ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBusinessDsl.g:1173:2: ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBusinessDsl.g:1174:3: ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBusinessDsl.g:1174:3: ( (lv_type_0_0= ruleSimpleTypeCollection ) )
            // InternalBusinessDsl.g:1175:4: (lv_type_0_0= ruleSimpleTypeCollection )
            {
            // InternalBusinessDsl.g:1175:4: (lv_type_0_0= ruleSimpleTypeCollection )
            // InternalBusinessDsl.g:1176:5: lv_type_0_0= ruleSimpleTypeCollection
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
            						"uo.diesels.model.BusinessDsl.SimpleTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBusinessDsl.g:1193:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:1194:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:1194:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:1195:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleDefDtoTypeCollectionVariable"
    // InternalBusinessDsl.g:1215:1: entryRuleDefDtoTypeCollectionVariable returns [EObject current=null] : iv_ruleDefDtoTypeCollectionVariable= ruleDefDtoTypeCollectionVariable EOF ;
    public final EObject entryRuleDefDtoTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoTypeCollectionVariable = null;


        try {
            // InternalBusinessDsl.g:1215:69: (iv_ruleDefDtoTypeCollectionVariable= ruleDefDtoTypeCollectionVariable EOF )
            // InternalBusinessDsl.g:1216:2: iv_ruleDefDtoTypeCollectionVariable= ruleDefDtoTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefDtoTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoTypeCollectionVariable=ruleDefDtoTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefDtoTypeCollectionVariable; 
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
    // $ANTLR end "entryRuleDefDtoTypeCollectionVariable"


    // $ANTLR start "ruleDefDtoTypeCollectionVariable"
    // InternalBusinessDsl.g:1222:1: ruleDefDtoTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleDtoTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefDtoTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1228:2: ( ( ( (lv_type_0_0= ruleDtoTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBusinessDsl.g:1229:2: ( ( (lv_type_0_0= ruleDtoTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBusinessDsl.g:1229:2: ( ( (lv_type_0_0= ruleDtoTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBusinessDsl.g:1230:3: ( (lv_type_0_0= ruleDtoTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBusinessDsl.g:1230:3: ( (lv_type_0_0= ruleDtoTypeCollection ) )
            // InternalBusinessDsl.g:1231:4: (lv_type_0_0= ruleDtoTypeCollection )
            {
            // InternalBusinessDsl.g:1231:4: (lv_type_0_0= ruleDtoTypeCollection )
            // InternalBusinessDsl.g:1232:5: lv_type_0_0= ruleDtoTypeCollection
            {

            					newCompositeNode(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeDtoTypeCollectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleDtoTypeCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefDtoTypeCollectionVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.BusinessDsl.DtoTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBusinessDsl.g:1249:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBusinessDsl.g:1250:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBusinessDsl.g:1250:4: (lv_name_1_0= RULE_ID )
            // InternalBusinessDsl.g:1251:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoTypeCollectionVariableRule());
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
    // $ANTLR end "ruleDefDtoTypeCollectionVariable"


    // $ANTLR start "entryRuleCollectionReturnType"
    // InternalBusinessDsl.g:1271:1: entryRuleCollectionReturnType returns [EObject current=null] : iv_ruleCollectionReturnType= ruleCollectionReturnType EOF ;
    public final EObject entryRuleCollectionReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionReturnType = null;


        try {
            // InternalBusinessDsl.g:1271:61: (iv_ruleCollectionReturnType= ruleCollectionReturnType EOF )
            // InternalBusinessDsl.g:1272:2: iv_ruleCollectionReturnType= ruleCollectionReturnType EOF
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
    // InternalBusinessDsl.g:1278:1: ruleCollectionReturnType returns [EObject current=null] : (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_DtoTypeCollection_1= ruleDtoTypeCollection | this_SimpleTypeCollection_2= ruleSimpleTypeCollection ) ;
    public final EObject ruleCollectionReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_AllModelTypeCollection_0 = null;

        EObject this_DtoTypeCollection_1 = null;

        EObject this_SimpleTypeCollection_2 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1284:2: ( (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_DtoTypeCollection_1= ruleDtoTypeCollection | this_SimpleTypeCollection_2= ruleSimpleTypeCollection ) )
            // InternalBusinessDsl.g:1285:2: (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_DtoTypeCollection_1= ruleDtoTypeCollection | this_SimpleTypeCollection_2= ruleSimpleTypeCollection )
            {
            // InternalBusinessDsl.g:1285:2: (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_DtoTypeCollection_1= ruleDtoTypeCollection | this_SimpleTypeCollection_2= ruleSimpleTypeCollection )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LIST) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==32) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        alt17=2;
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
                        alt17=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt17=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_SET) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==32) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        alt17=2;
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
                        alt17=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt17=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalBusinessDsl.g:1286:3: this_AllModelTypeCollection_0= ruleAllModelTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getAllModelTypeCollectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllModelTypeCollection_0=ruleAllModelTypeCollection();

                    state._fsp--;


                    			current = this_AllModelTypeCollection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:1295:3: this_DtoTypeCollection_1= ruleDtoTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getDtoTypeCollectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtoTypeCollection_1=ruleDtoTypeCollection();

                    state._fsp--;


                    			current = this_DtoTypeCollection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:1304:3: this_SimpleTypeCollection_2= ruleSimpleTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getSimpleTypeCollectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTypeCollection_2=ruleSimpleTypeCollection();

                    state._fsp--;


                    			current = this_SimpleTypeCollection_2;
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


    // $ANTLR start "entryRuleAllModelTypeCollection"
    // InternalBusinessDsl.g:1316:1: entryRuleAllModelTypeCollection returns [EObject current=null] : iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF ;
    public final EObject entryRuleAllModelTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllModelTypeCollection = null;


        try {
            // InternalBusinessDsl.g:1316:63: (iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF )
            // InternalBusinessDsl.g:1317:2: iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF
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
    // InternalBusinessDsl.g:1323:1: ruleAllModelTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) ;
    public final EObject ruleAllModelTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBusinessDsl.g:1329:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) )
            // InternalBusinessDsl.g:1330:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            {
            // InternalBusinessDsl.g:1330:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            // InternalBusinessDsl.g:1331:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>'
            {
            // InternalBusinessDsl.g:1331:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalBusinessDsl.g:1332:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalBusinessDsl.g:1332:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalBusinessDsl.g:1333:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalBusinessDsl.g:1333:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LIST) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_SET) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBusinessDsl.g:1334:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_11); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.BusinessDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:1349:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_11); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getAllModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.BusinessDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalBusinessDsl.g:1370:3: ( (otherlv_2= RULE_ID ) )
            // InternalBusinessDsl.g:1371:4: (otherlv_2= RULE_ID )
            {
            // InternalBusinessDsl.g:1371:4: (otherlv_2= RULE_ID )
            // InternalBusinessDsl.g:1372:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDtoTypeCollection"
    // InternalBusinessDsl.g:1391:1: entryRuleDtoTypeCollection returns [EObject current=null] : iv_ruleDtoTypeCollection= ruleDtoTypeCollection EOF ;
    public final EObject entryRuleDtoTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoTypeCollection = null;


        try {
            // InternalBusinessDsl.g:1391:58: (iv_ruleDtoTypeCollection= ruleDtoTypeCollection EOF )
            // InternalBusinessDsl.g:1392:2: iv_ruleDtoTypeCollection= ruleDtoTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getDtoTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtoTypeCollection=ruleDtoTypeCollection();

            state._fsp--;

             current =iv_ruleDtoTypeCollection; 
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
    // $ANTLR end "entryRuleDtoTypeCollection"


    // $ANTLR start "ruleDtoTypeCollection"
    // InternalBusinessDsl.g:1398:1: ruleDtoTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ) ;
    public final EObject ruleDtoTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBusinessDsl.g:1404:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ) )
            // InternalBusinessDsl.g:1405:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' )
            {
            // InternalBusinessDsl.g:1405:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' )
            // InternalBusinessDsl.g:1406:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' otherlv_2= '#' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>'
            {
            // InternalBusinessDsl.g:1406:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalBusinessDsl.g:1407:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalBusinessDsl.g:1407:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalBusinessDsl.g:1408:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalBusinessDsl.g:1408:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LIST) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_SET) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalBusinessDsl.g:1409:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_11); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getDtoTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.BusinessDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:1424:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_11); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getDtoTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.BusinessDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDtoTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDtoTypeCollectionAccess().getNumberSignKeyword_2());
            		
            // InternalBusinessDsl.g:1449:3: ( (otherlv_3= RULE_ID ) )
            // InternalBusinessDsl.g:1450:4: (otherlv_3= RULE_ID )
            {
            // InternalBusinessDsl.g:1450:4: (otherlv_3= RULE_ID )
            // InternalBusinessDsl.g:1451:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoTypeCollectionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDtoTypeCollectionAccess().getTypeDtoCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDtoTypeCollectionAccess().getGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleDtoTypeCollection"


    // $ANTLR start "entryRuleSimpleTypeCollection"
    // InternalBusinessDsl.g:1470:1: entryRuleSimpleTypeCollection returns [EObject current=null] : iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF ;
    public final EObject entryRuleSimpleTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeCollection = null;


        try {
            // InternalBusinessDsl.g:1470:61: (iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF )
            // InternalBusinessDsl.g:1471:2: iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF
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
    // InternalBusinessDsl.g:1477:1: ruleSimpleTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleSimpleTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1483:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalBusinessDsl.g:1484:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalBusinessDsl.g:1484:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalBusinessDsl.g:1485:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalBusinessDsl.g:1485:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalBusinessDsl.g:1486:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalBusinessDsl.g:1486:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalBusinessDsl.g:1487:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalBusinessDsl.g:1487:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LIST) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SET) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalBusinessDsl.g:1488:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_11); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.BusinessDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:1503:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_11); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getSimpleTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.BusinessDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalBusinessDsl.g:1524:3: ( (lv_type_2_0= ruleType ) )
            // InternalBusinessDsl.g:1525:4: (lv_type_2_0= ruleType )
            {
            // InternalBusinessDsl.g:1525:4: (lv_type_2_0= ruleType )
            // InternalBusinessDsl.g:1526:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSimpleTypeCollectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeCollectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"uo.diesels.model.BusinessDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSimpleReturnType"
    // InternalBusinessDsl.g:1551:1: entryRuleSimpleReturnType returns [String current=null] : iv_ruleSimpleReturnType= ruleSimpleReturnType EOF ;
    public final String entryRuleSimpleReturnType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleReturnType = null;


        try {
            // InternalBusinessDsl.g:1551:56: (iv_ruleSimpleReturnType= ruleSimpleReturnType EOF )
            // InternalBusinessDsl.g:1552:2: iv_ruleSimpleReturnType= ruleSimpleReturnType EOF
            {
             newCompositeNode(grammarAccess.getSimpleReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleReturnType=ruleSimpleReturnType();

            state._fsp--;

             current =iv_ruleSimpleReturnType.getText(); 
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
    // $ANTLR end "entryRuleSimpleReturnType"


    // $ANTLR start "ruleSimpleReturnType"
    // InternalBusinessDsl.g:1558:1: ruleSimpleReturnType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_0= ruleType | this_VOID_1= RULE_VOID ) ;
    public final AntlrDatatypeRuleToken ruleSimpleReturnType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VOID_1=null;
        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1564:2: ( (this_Type_0= ruleType | this_VOID_1= RULE_VOID ) )
            // InternalBusinessDsl.g:1565:2: (this_Type_0= ruleType | this_VOID_1= RULE_VOID )
            {
            // InternalBusinessDsl.g:1565:2: (this_Type_0= ruleType | this_VOID_1= RULE_VOID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_TYPE_INT && LA21_0<=RULE_DATE)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_VOID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBusinessDsl.g:1566:3: this_Type_0= ruleType
                    {

                    			newCompositeNode(grammarAccess.getSimpleReturnTypeAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_0=ruleType();

                    state._fsp--;


                    			current.merge(this_Type_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:1577:3: this_VOID_1= RULE_VOID
                    {
                    this_VOID_1=(Token)match(input,RULE_VOID,FOLLOW_2); 

                    			current.merge(this_VOID_1);
                    		

                    			newLeafNode(this_VOID_1, grammarAccess.getSimpleReturnTypeAccess().getVOIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleSimpleReturnType"


    // $ANTLR start "entryRuleType"
    // InternalBusinessDsl.g:1588:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalBusinessDsl.g:1588:44: (iv_ruleType= ruleType EOF )
            // InternalBusinessDsl.g:1589:2: iv_ruleType= ruleType EOF
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
    // InternalBusinessDsl.g:1595:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_ComplexType_1 = null;



        	enterRule();

        try {
            // InternalBusinessDsl.g:1601:2: ( (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) )
            // InternalBusinessDsl.g:1602:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            {
            // InternalBusinessDsl.g:1602:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_TYPE_INT && LA22_0<=RULE_TYPE_BINARY)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_DATE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBusinessDsl.g:1603:3: this_BasicType_0= ruleBasicType
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
                    // InternalBusinessDsl.g:1614:3: this_ComplexType_1= ruleComplexType
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
    // InternalBusinessDsl.g:1628:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalBusinessDsl.g:1628:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalBusinessDsl.g:1629:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalBusinessDsl.g:1635:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY ) ;
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
            // InternalBusinessDsl.g:1641:2: ( (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY ) )
            // InternalBusinessDsl.g:1642:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY )
            {
            // InternalBusinessDsl.g:1642:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN | this_TYPE_BINARY_7= RULE_TYPE_BINARY )
            int alt23=8;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
                {
                alt23=1;
                }
                break;
            case RULE_TYPE_DOUBLE:
                {
                alt23=2;
                }
                break;
            case RULE_TYPE_FLOAT:
                {
                alt23=3;
                }
                break;
            case RULE_TYPE_LONG:
                {
                alt23=4;
                }
                break;
            case RULE_TYPE_CHAR:
                {
                alt23=5;
                }
                break;
            case RULE_TYPE_STRING:
                {
                alt23=6;
                }
                break;
            case RULE_TYPE_BOOLEAN:
                {
                alt23=7;
                }
                break;
            case RULE_TYPE_BINARY:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalBusinessDsl.g:1643:3: this_TYPE_INT_0= RULE_TYPE_INT
                    {
                    this_TYPE_INT_0=(Token)match(input,RULE_TYPE_INT,FOLLOW_2); 

                    			current.merge(this_TYPE_INT_0);
                    		

                    			newLeafNode(this_TYPE_INT_0, grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:1651:3: this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE
                    {
                    this_TYPE_DOUBLE_1=(Token)match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_TYPE_DOUBLE_1);
                    		

                    			newLeafNode(this_TYPE_DOUBLE_1, grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:1659:3: this_TYPE_FLOAT_2= RULE_TYPE_FLOAT
                    {
                    this_TYPE_FLOAT_2=(Token)match(input,RULE_TYPE_FLOAT,FOLLOW_2); 

                    			current.merge(this_TYPE_FLOAT_2);
                    		

                    			newLeafNode(this_TYPE_FLOAT_2, grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:1667:3: this_TYPE_LONG_3= RULE_TYPE_LONG
                    {
                    this_TYPE_LONG_3=(Token)match(input,RULE_TYPE_LONG,FOLLOW_2); 

                    			current.merge(this_TYPE_LONG_3);
                    		

                    			newLeafNode(this_TYPE_LONG_3, grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBusinessDsl.g:1675:3: this_TYPE_CHAR_4= RULE_TYPE_CHAR
                    {
                    this_TYPE_CHAR_4=(Token)match(input,RULE_TYPE_CHAR,FOLLOW_2); 

                    			current.merge(this_TYPE_CHAR_4);
                    		

                    			newLeafNode(this_TYPE_CHAR_4, grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBusinessDsl.g:1683:3: this_TYPE_STRING_5= RULE_TYPE_STRING
                    {
                    this_TYPE_STRING_5=(Token)match(input,RULE_TYPE_STRING,FOLLOW_2); 

                    			current.merge(this_TYPE_STRING_5);
                    		

                    			newLeafNode(this_TYPE_STRING_5, grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBusinessDsl.g:1691:3: this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN
                    {
                    this_TYPE_BOOLEAN_6=(Token)match(input,RULE_TYPE_BOOLEAN,FOLLOW_2); 

                    			current.merge(this_TYPE_BOOLEAN_6);
                    		

                    			newLeafNode(this_TYPE_BOOLEAN_6, grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBusinessDsl.g:1699:3: this_TYPE_BINARY_7= RULE_TYPE_BINARY
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
    // InternalBusinessDsl.g:1710:1: entryRuleComplexType returns [String current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final String entryRuleComplexType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexType = null;


        try {
            // InternalBusinessDsl.g:1710:51: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalBusinessDsl.g:1711:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalBusinessDsl.g:1717:1: ruleComplexType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleComplexType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalBusinessDsl.g:1723:2: (this_DATE_0= RULE_DATE )
            // InternalBusinessDsl.g:1724:2: this_DATE_0= RULE_DATE
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000100001FFF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000100201FFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000100801FFF0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000001FF00L});

}