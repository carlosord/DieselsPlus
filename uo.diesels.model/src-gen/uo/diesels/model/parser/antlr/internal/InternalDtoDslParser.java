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
import uo.diesels.model.services.DtoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDtoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIST", "RULE_SET", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_DATE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Dto'", "'{'", "'}'", "'for'", "'<'", "'>'"
    };
    public static final int RULE_SET=6;
    public static final int RULE_STRING=16;
    public static final int RULE_TYPE_CHAR=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_TYPE_STRING=12;
    public static final int EOF=-1;
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
    public static final int RULE_INT=15;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_TYPE_DOUBLE=8;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDtoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDtoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDtoDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDtoDsl.g"; }



     	private DtoDslGrammarAccess grammarAccess;

        public InternalDtoDslParser(TokenStream input, DtoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DtoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDtoDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDtoDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDtoDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalDtoDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_dtos_0_0= ruleDto ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dtos_0_0 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:77:2: ( ( (lv_dtos_0_0= ruleDto ) )* )
            // InternalDtoDsl.g:78:2: ( (lv_dtos_0_0= ruleDto ) )*
            {
            // InternalDtoDsl.g:78:2: ( (lv_dtos_0_0= ruleDto ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDtoDsl.g:79:3: (lv_dtos_0_0= ruleDto )
            	    {
            	    // InternalDtoDsl.g:79:3: (lv_dtos_0_0= ruleDto )
            	    // InternalDtoDsl.g:80:4: lv_dtos_0_0= ruleDto
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDtosDtoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_dtos_0_0=ruleDto();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"dtos",
            	    					lv_dtos_0_0,
            	    					"uo.diesels.model.DtoDsl.Dto");
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


    // $ANTLR start "entryRuleDto"
    // InternalDtoDsl.g:100:1: entryRuleDto returns [EObject current=null] : iv_ruleDto= ruleDto EOF ;
    public final EObject entryRuleDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDto = null;


        try {
            // InternalDtoDsl.g:100:44: (iv_ruleDto= ruleDto EOF )
            // InternalDtoDsl.g:101:2: iv_ruleDto= ruleDto EOF
            {
             newCompositeNode(grammarAccess.getDtoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDto=ruleDto();

            state._fsp--;

             current =iv_ruleDto; 
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
    // $ANTLR end "entryRuleDto"


    // $ANTLR start "ruleDto"
    // InternalDtoDsl.g:107:1: ruleDto returns [EObject current=null] : (this_DtoEntity_0= ruleDtoEntity | this_DtoFor_1= ruleDtoFor ) ;
    public final EObject ruleDto() throws RecognitionException {
        EObject current = null;

        EObject this_DtoEntity_0 = null;

        EObject this_DtoFor_1 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:113:2: ( (this_DtoEntity_0= ruleDtoEntity | this_DtoFor_1= ruleDtoFor ) )
            // InternalDtoDsl.g:114:2: (this_DtoEntity_0= ruleDtoEntity | this_DtoFor_1= ruleDtoFor )
            {
            // InternalDtoDsl.g:114:2: (this_DtoEntity_0= ruleDtoEntity | this_DtoFor_1= ruleDtoFor )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==22) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==24) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDtoDsl.g:115:3: this_DtoEntity_0= ruleDtoEntity
                    {

                    			newCompositeNode(grammarAccess.getDtoAccess().getDtoEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtoEntity_0=ruleDtoEntity();

                    state._fsp--;


                    			current = this_DtoEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:124:3: this_DtoFor_1= ruleDtoFor
                    {

                    			newCompositeNode(grammarAccess.getDtoAccess().getDtoForParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtoFor_1=ruleDtoFor();

                    state._fsp--;


                    			current = this_DtoFor_1;
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
    // $ANTLR end "ruleDto"


    // $ANTLR start "entryRuleDtoEntity"
    // InternalDtoDsl.g:136:1: entryRuleDtoEntity returns [EObject current=null] : iv_ruleDtoEntity= ruleDtoEntity EOF ;
    public final EObject entryRuleDtoEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoEntity = null;


        try {
            // InternalDtoDsl.g:136:50: (iv_ruleDtoEntity= ruleDtoEntity EOF )
            // InternalDtoDsl.g:137:2: iv_ruleDtoEntity= ruleDtoEntity EOF
            {
             newCompositeNode(grammarAccess.getDtoEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtoEntity=ruleDtoEntity();

            state._fsp--;

             current =iv_ruleDtoEntity; 
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
    // $ANTLR end "entryRuleDtoEntity"


    // $ANTLR start "ruleDtoEntity"
    // InternalDtoDsl.g:143:1: ruleDtoEntity returns [EObject current=null] : (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefDtoAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleDtoEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:149:2: ( (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefDtoAttribute ) )* otherlv_4= '}' ) )
            // InternalDtoDsl.g:150:2: (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefDtoAttribute ) )* otherlv_4= '}' )
            {
            // InternalDtoDsl.g:150:2: (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefDtoAttribute ) )* otherlv_4= '}' )
            // InternalDtoDsl.g:151:3: otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefDtoAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDtoEntityAccess().getDtoKeyword_0());
            		
            // InternalDtoDsl.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDtoDsl.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDtoDsl.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalDtoDsl.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtoEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDtoEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDtoDsl.g:177:3: ( (lv_attributes_3_0= ruleDefDtoAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_DATE)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDtoDsl.g:178:4: (lv_attributes_3_0= ruleDefDtoAttribute )
            	    {
            	    // InternalDtoDsl.g:178:4: (lv_attributes_3_0= ruleDefDtoAttribute )
            	    // InternalDtoDsl.g:179:5: lv_attributes_3_0= ruleDefDtoAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDtoEntityAccess().getAttributesDefDtoAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_3_0=ruleDefDtoAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtoEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"uo.diesels.model.DtoDsl.DefDtoAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDtoEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDtoEntity"


    // $ANTLR start "entryRuleDtoFor"
    // InternalDtoDsl.g:204:1: entryRuleDtoFor returns [EObject current=null] : iv_ruleDtoFor= ruleDtoFor EOF ;
    public final EObject entryRuleDtoFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoFor = null;


        try {
            // InternalDtoDsl.g:204:47: (iv_ruleDtoFor= ruleDtoFor EOF )
            // InternalDtoDsl.g:205:2: iv_ruleDtoFor= ruleDtoFor EOF
            {
             newCompositeNode(grammarAccess.getDtoForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtoFor=ruleDtoFor();

            state._fsp--;

             current =iv_ruleDtoFor; 
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
    // $ANTLR end "entryRuleDtoFor"


    // $ANTLR start "ruleDtoFor"
    // InternalDtoDsl.g:211:1: ruleDtoFor returns [EObject current=null] : (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDtoFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDtoDsl.g:217:2: ( (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDtoDsl.g:218:2: (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDtoDsl.g:218:2: (otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // InternalDtoDsl.g:219:3: otherlv_0= 'Dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDtoForAccess().getDtoKeyword_0());
            		
            // InternalDtoDsl.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDtoDsl.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDtoDsl.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalDtoDsl.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtoForAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDtoForAccess().getForKeyword_2());
            		
            // InternalDtoDsl.g:245:3: ( (otherlv_3= RULE_ID ) )
            // InternalDtoDsl.g:246:4: (otherlv_3= RULE_ID )
            {
            // InternalDtoDsl.g:246:4: (otherlv_3= RULE_ID )
            // InternalDtoDsl.g:247:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoForRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getDtoForAccess().getEntityEntityCrossReference_3_0());
            				

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
    // $ANTLR end "ruleDtoFor"


    // $ANTLR start "entryRuleDefDtoAttribute"
    // InternalDtoDsl.g:262:1: entryRuleDefDtoAttribute returns [EObject current=null] : iv_ruleDefDtoAttribute= ruleDefDtoAttribute EOF ;
    public final EObject entryRuleDefDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoAttribute = null;


        try {
            // InternalDtoDsl.g:262:56: (iv_ruleDefDtoAttribute= ruleDefDtoAttribute EOF )
            // InternalDtoDsl.g:263:2: iv_ruleDefDtoAttribute= ruleDefDtoAttribute EOF
            {
             newCompositeNode(grammarAccess.getDefDtoAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoAttribute=ruleDefDtoAttribute();

            state._fsp--;

             current =iv_ruleDefDtoAttribute; 
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
    // $ANTLR end "entryRuleDefDtoAttribute"


    // $ANTLR start "ruleDefDtoAttribute"
    // InternalDtoDsl.g:269:1: ruleDefDtoAttribute returns [EObject current=null] : (this_DefDtoSimpleVariable_0= ruleDefDtoSimpleVariable | this_DefDtoModelTypeVariable_1= ruleDefDtoModelTypeVariable | this_DefDtoCollectionTypeAttribute_2= ruleDefDtoCollectionTypeAttribute ) ;
    public final EObject ruleDefDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_DefDtoSimpleVariable_0 = null;

        EObject this_DefDtoModelTypeVariable_1 = null;

        EObject this_DefDtoCollectionTypeAttribute_2 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:275:2: ( (this_DefDtoSimpleVariable_0= ruleDefDtoSimpleVariable | this_DefDtoModelTypeVariable_1= ruleDefDtoModelTypeVariable | this_DefDtoCollectionTypeAttribute_2= ruleDefDtoCollectionTypeAttribute ) )
            // InternalDtoDsl.g:276:2: (this_DefDtoSimpleVariable_0= ruleDefDtoSimpleVariable | this_DefDtoModelTypeVariable_1= ruleDefDtoModelTypeVariable | this_DefDtoCollectionTypeAttribute_2= ruleDefDtoCollectionTypeAttribute )
            {
            // InternalDtoDsl.g:276:2: (this_DefDtoSimpleVariable_0= ruleDefDtoSimpleVariable | this_DefDtoModelTypeVariable_1= ruleDefDtoModelTypeVariable | this_DefDtoCollectionTypeAttribute_2= ruleDefDtoCollectionTypeAttribute )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_DATE:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDtoDsl.g:277:3: this_DefDtoSimpleVariable_0= ruleDefDtoSimpleVariable
                    {

                    			newCompositeNode(grammarAccess.getDefDtoAttributeAccess().getDefDtoSimpleVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoSimpleVariable_0=ruleDefDtoSimpleVariable();

                    state._fsp--;


                    			current = this_DefDtoSimpleVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:286:3: this_DefDtoModelTypeVariable_1= ruleDefDtoModelTypeVariable
                    {

                    			newCompositeNode(grammarAccess.getDefDtoAttributeAccess().getDefDtoModelTypeVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoModelTypeVariable_1=ruleDefDtoModelTypeVariable();

                    state._fsp--;


                    			current = this_DefDtoModelTypeVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDtoDsl.g:295:3: this_DefDtoCollectionTypeAttribute_2= ruleDefDtoCollectionTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getDefDtoAttributeAccess().getDefDtoCollectionTypeAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoCollectionTypeAttribute_2=ruleDefDtoCollectionTypeAttribute();

                    state._fsp--;


                    			current = this_DefDtoCollectionTypeAttribute_2;
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
    // $ANTLR end "ruleDefDtoAttribute"


    // $ANTLR start "entryRuleDefDtoSimpleVariable"
    // InternalDtoDsl.g:307:1: entryRuleDefDtoSimpleVariable returns [EObject current=null] : iv_ruleDefDtoSimpleVariable= ruleDefDtoSimpleVariable EOF ;
    public final EObject entryRuleDefDtoSimpleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoSimpleVariable = null;


        try {
            // InternalDtoDsl.g:307:61: (iv_ruleDefDtoSimpleVariable= ruleDefDtoSimpleVariable EOF )
            // InternalDtoDsl.g:308:2: iv_ruleDefDtoSimpleVariable= ruleDefDtoSimpleVariable EOF
            {
             newCompositeNode(grammarAccess.getDefDtoSimpleVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoSimpleVariable=ruleDefDtoSimpleVariable();

            state._fsp--;

             current =iv_ruleDefDtoSimpleVariable; 
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
    // $ANTLR end "entryRuleDefDtoSimpleVariable"


    // $ANTLR start "ruleDefDtoSimpleVariable"
    // InternalDtoDsl.g:314:1: ruleDefDtoSimpleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefDtoSimpleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:320:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDtoDsl.g:321:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDtoDsl.g:321:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDtoDsl.g:322:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDtoDsl.g:322:3: ( (lv_type_0_0= ruleType ) )
            // InternalDtoDsl.g:323:4: (lv_type_0_0= ruleType )
            {
            // InternalDtoDsl.g:323:4: (lv_type_0_0= ruleType )
            // InternalDtoDsl.g:324:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDefDtoSimpleVariableAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefDtoSimpleVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.DtoDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDtoDsl.g:341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDtoDsl.g:342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDtoDsl.g:342:4: (lv_name_1_0= RULE_ID )
            // InternalDtoDsl.g:343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefDtoSimpleVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoSimpleVariableRule());
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
    // $ANTLR end "ruleDefDtoSimpleVariable"


    // $ANTLR start "entryRuleDefDtoModelTypeVariable"
    // InternalDtoDsl.g:363:1: entryRuleDefDtoModelTypeVariable returns [EObject current=null] : iv_ruleDefDtoModelTypeVariable= ruleDefDtoModelTypeVariable EOF ;
    public final EObject entryRuleDefDtoModelTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoModelTypeVariable = null;


        try {
            // InternalDtoDsl.g:363:64: (iv_ruleDefDtoModelTypeVariable= ruleDefDtoModelTypeVariable EOF )
            // InternalDtoDsl.g:364:2: iv_ruleDefDtoModelTypeVariable= ruleDefDtoModelTypeVariable EOF
            {
             newCompositeNode(grammarAccess.getDefDtoModelTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoModelTypeVariable=ruleDefDtoModelTypeVariable();

            state._fsp--;

             current =iv_ruleDefDtoModelTypeVariable; 
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
    // $ANTLR end "entryRuleDefDtoModelTypeVariable"


    // $ANTLR start "ruleDefDtoModelTypeVariable"
    // InternalDtoDsl.g:370:1: ruleDefDtoModelTypeVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefDtoModelTypeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDtoDsl.g:376:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDtoDsl.g:377:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDtoDsl.g:377:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDtoDsl.g:378:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDtoDsl.g:378:3: ( (otherlv_0= RULE_ID ) )
            // InternalDtoDsl.g:379:4: (otherlv_0= RULE_ID )
            {
            // InternalDtoDsl.g:379:4: (otherlv_0= RULE_ID )
            // InternalDtoDsl.g:380:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoModelTypeVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalDtoDsl.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDtoDsl.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDtoDsl.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalDtoDsl.g:393:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefDtoModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoModelTypeVariableRule());
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
    // $ANTLR end "ruleDefDtoModelTypeVariable"


    // $ANTLR start "entryRuleDefDtoCollectionTypeAttribute"
    // InternalDtoDsl.g:413:1: entryRuleDefDtoCollectionTypeAttribute returns [EObject current=null] : iv_ruleDefDtoCollectionTypeAttribute= ruleDefDtoCollectionTypeAttribute EOF ;
    public final EObject entryRuleDefDtoCollectionTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoCollectionTypeAttribute = null;


        try {
            // InternalDtoDsl.g:413:70: (iv_ruleDefDtoCollectionTypeAttribute= ruleDefDtoCollectionTypeAttribute EOF )
            // InternalDtoDsl.g:414:2: iv_ruleDefDtoCollectionTypeAttribute= ruleDefDtoCollectionTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getDefDtoCollectionTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoCollectionTypeAttribute=ruleDefDtoCollectionTypeAttribute();

            state._fsp--;

             current =iv_ruleDefDtoCollectionTypeAttribute; 
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
    // $ANTLR end "entryRuleDefDtoCollectionTypeAttribute"


    // $ANTLR start "ruleDefDtoCollectionTypeAttribute"
    // InternalDtoDsl.g:420:1: ruleDefDtoCollectionTypeAttribute returns [EObject current=null] : (this_DefDtoModelTypeCollectionVariable_0= ruleDefDtoModelTypeCollectionVariable | this_DefDtoSimpleTypeCollectionVariable_1= ruleDefDtoSimpleTypeCollectionVariable ) ;
    public final EObject ruleDefDtoCollectionTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_DefDtoModelTypeCollectionVariable_0 = null;

        EObject this_DefDtoSimpleTypeCollectionVariable_1 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:426:2: ( (this_DefDtoModelTypeCollectionVariable_0= ruleDefDtoModelTypeCollectionVariable | this_DefDtoSimpleTypeCollectionVariable_1= ruleDefDtoSimpleTypeCollectionVariable ) )
            // InternalDtoDsl.g:427:2: (this_DefDtoModelTypeCollectionVariable_0= ruleDefDtoModelTypeCollectionVariable | this_DefDtoSimpleTypeCollectionVariable_1= ruleDefDtoSimpleTypeCollectionVariable )
            {
            // InternalDtoDsl.g:427:2: (this_DefDtoModelTypeCollectionVariable_0= ruleDefDtoModelTypeCollectionVariable | this_DefDtoSimpleTypeCollectionVariable_1= ruleDefDtoSimpleTypeCollectionVariable )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LIST) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==25) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3>=RULE_TYPE_INT && LA5_3<=RULE_DATE)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==RULE_ID) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_SET) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==25) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3>=RULE_TYPE_INT && LA5_3<=RULE_DATE)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==RULE_ID) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDtoDsl.g:428:3: this_DefDtoModelTypeCollectionVariable_0= ruleDefDtoModelTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoModelTypeCollectionVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoModelTypeCollectionVariable_0=ruleDefDtoModelTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefDtoModelTypeCollectionVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:437:3: this_DefDtoSimpleTypeCollectionVariable_1= ruleDefDtoSimpleTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoSimpleTypeCollectionVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefDtoSimpleTypeCollectionVariable_1=ruleDefDtoSimpleTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefDtoSimpleTypeCollectionVariable_1;
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
    // $ANTLR end "ruleDefDtoCollectionTypeAttribute"


    // $ANTLR start "entryRuleDefDtoModelTypeCollectionVariable"
    // InternalDtoDsl.g:449:1: entryRuleDefDtoModelTypeCollectionVariable returns [EObject current=null] : iv_ruleDefDtoModelTypeCollectionVariable= ruleDefDtoModelTypeCollectionVariable EOF ;
    public final EObject entryRuleDefDtoModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoModelTypeCollectionVariable = null;


        try {
            // InternalDtoDsl.g:449:74: (iv_ruleDefDtoModelTypeCollectionVariable= ruleDefDtoModelTypeCollectionVariable EOF )
            // InternalDtoDsl.g:450:2: iv_ruleDefDtoModelTypeCollectionVariable= ruleDefDtoModelTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefDtoModelTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoModelTypeCollectionVariable=ruleDefDtoModelTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefDtoModelTypeCollectionVariable; 
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
    // $ANTLR end "entryRuleDefDtoModelTypeCollectionVariable"


    // $ANTLR start "ruleDefDtoModelTypeCollectionVariable"
    // InternalDtoDsl.g:456:1: ruleDefDtoModelTypeCollectionVariable returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDefDtoModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDtoDsl.g:462:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalDtoDsl.g:463:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalDtoDsl.g:463:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalDtoDsl.g:464:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalDtoDsl.g:464:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalDtoDsl.g:465:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalDtoDsl.g:465:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalDtoDsl.g:466:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalDtoDsl.g:466:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LIST) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_SET) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDtoDsl.g:467:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefDtoModelTypeCollectionVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.DtoDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:482:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefDtoModelTypeCollectionVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.DtoDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getLessThanSignKeyword_1());
            		
            // InternalDtoDsl.g:503:3: ( (otherlv_2= RULE_ID ) )
            // InternalDtoDsl.g:504:4: (otherlv_2= RULE_ID )
            {
            // InternalDtoDsl.g:504:4: (otherlv_2= RULE_ID )
            // InternalDtoDsl.g:505:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoModelTypeCollectionVariableRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGreaterThanSignKeyword_3());
            		
            // InternalDtoDsl.g:520:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDtoDsl.g:521:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDtoDsl.g:521:4: (lv_name_4_0= RULE_ID )
            // InternalDtoDsl.g:522:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoModelTypeCollectionVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
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
    // $ANTLR end "ruleDefDtoModelTypeCollectionVariable"


    // $ANTLR start "entryRuleDefDtoSimpleTypeCollectionVariable"
    // InternalDtoDsl.g:542:1: entryRuleDefDtoSimpleTypeCollectionVariable returns [EObject current=null] : iv_ruleDefDtoSimpleTypeCollectionVariable= ruleDefDtoSimpleTypeCollectionVariable EOF ;
    public final EObject entryRuleDefDtoSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDtoSimpleTypeCollectionVariable = null;


        try {
            // InternalDtoDsl.g:542:75: (iv_ruleDefDtoSimpleTypeCollectionVariable= ruleDefDtoSimpleTypeCollectionVariable EOF )
            // InternalDtoDsl.g:543:2: iv_ruleDefDtoSimpleTypeCollectionVariable= ruleDefDtoSimpleTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefDtoSimpleTypeCollectionVariable=ruleDefDtoSimpleTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefDtoSimpleTypeCollectionVariable; 
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
    // $ANTLR end "entryRuleDefDtoSimpleTypeCollectionVariable"


    // $ANTLR start "ruleDefDtoSimpleTypeCollectionVariable"
    // InternalDtoDsl.g:549:1: ruleDefDtoSimpleTypeCollectionVariable returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDefDtoSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:555:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalDtoDsl.g:556:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalDtoDsl.g:556:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalDtoDsl.g:557:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalDtoDsl.g:557:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalDtoDsl.g:558:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalDtoDsl.g:558:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalDtoDsl.g:559:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalDtoDsl.g:559:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LIST) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SET) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDtoDsl.g:560:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.DtoDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:575:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.DtoDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getLessThanSignKeyword_1());
            		
            // InternalDtoDsl.g:596:3: ( (lv_type_2_0= ruleType ) )
            // InternalDtoDsl.g:597:4: (lv_type_2_0= ruleType )
            {
            // InternalDtoDsl.g:597:4: (lv_type_2_0= ruleType )
            // InternalDtoDsl.g:598:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"uo.diesels.model.DtoDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGreaterThanSignKeyword_3());
            		
            // InternalDtoDsl.g:619:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDtoDsl.g:620:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDtoDsl.g:620:4: (lv_name_4_0= RULE_ID )
            // InternalDtoDsl.g:621:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
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
    // $ANTLR end "ruleDefDtoSimpleTypeCollectionVariable"


    // $ANTLR start "entryRuleType"
    // InternalDtoDsl.g:641:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDtoDsl.g:641:44: (iv_ruleType= ruleType EOF )
            // InternalDtoDsl.g:642:2: iv_ruleType= ruleType EOF
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
    // InternalDtoDsl.g:648:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_ComplexType_1 = null;



        	enterRule();

        try {
            // InternalDtoDsl.g:654:2: ( (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) )
            // InternalDtoDsl.g:655:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            {
            // InternalDtoDsl.g:655:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_TYPE_INT && LA8_0<=RULE_TYPE_BOOLEAN)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DATE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDtoDsl.g:656:3: this_BasicType_0= ruleBasicType
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
                    // InternalDtoDsl.g:667:3: this_ComplexType_1= ruleComplexType
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
    // InternalDtoDsl.g:681:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalDtoDsl.g:681:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalDtoDsl.g:682:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalDtoDsl.g:688:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_INT_0=null;
        Token this_TYPE_DOUBLE_1=null;
        Token this_TYPE_FLOAT_2=null;
        Token this_TYPE_LONG_3=null;
        Token this_TYPE_CHAR_4=null;
        Token this_TYPE_STRING_5=null;
        Token this_TYPE_BOOLEAN_6=null;


        	enterRule();

        try {
            // InternalDtoDsl.g:694:2: ( (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN ) )
            // InternalDtoDsl.g:695:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN )
            {
            // InternalDtoDsl.g:695:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN )
            int alt9=7;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_TYPE_DOUBLE:
                {
                alt9=2;
                }
                break;
            case RULE_TYPE_FLOAT:
                {
                alt9=3;
                }
                break;
            case RULE_TYPE_LONG:
                {
                alt9=4;
                }
                break;
            case RULE_TYPE_CHAR:
                {
                alt9=5;
                }
                break;
            case RULE_TYPE_STRING:
                {
                alt9=6;
                }
                break;
            case RULE_TYPE_BOOLEAN:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDtoDsl.g:696:3: this_TYPE_INT_0= RULE_TYPE_INT
                    {
                    this_TYPE_INT_0=(Token)match(input,RULE_TYPE_INT,FOLLOW_2); 

                    			current.merge(this_TYPE_INT_0);
                    		

                    			newLeafNode(this_TYPE_INT_0, grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:704:3: this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE
                    {
                    this_TYPE_DOUBLE_1=(Token)match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_TYPE_DOUBLE_1);
                    		

                    			newLeafNode(this_TYPE_DOUBLE_1, grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDtoDsl.g:712:3: this_TYPE_FLOAT_2= RULE_TYPE_FLOAT
                    {
                    this_TYPE_FLOAT_2=(Token)match(input,RULE_TYPE_FLOAT,FOLLOW_2); 

                    			current.merge(this_TYPE_FLOAT_2);
                    		

                    			newLeafNode(this_TYPE_FLOAT_2, grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDtoDsl.g:720:3: this_TYPE_LONG_3= RULE_TYPE_LONG
                    {
                    this_TYPE_LONG_3=(Token)match(input,RULE_TYPE_LONG,FOLLOW_2); 

                    			current.merge(this_TYPE_LONG_3);
                    		

                    			newLeafNode(this_TYPE_LONG_3, grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDtoDsl.g:728:3: this_TYPE_CHAR_4= RULE_TYPE_CHAR
                    {
                    this_TYPE_CHAR_4=(Token)match(input,RULE_TYPE_CHAR,FOLLOW_2); 

                    			current.merge(this_TYPE_CHAR_4);
                    		

                    			newLeafNode(this_TYPE_CHAR_4, grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDtoDsl.g:736:3: this_TYPE_STRING_5= RULE_TYPE_STRING
                    {
                    this_TYPE_STRING_5=(Token)match(input,RULE_TYPE_STRING,FOLLOW_2); 

                    			current.merge(this_TYPE_STRING_5);
                    		

                    			newLeafNode(this_TYPE_STRING_5, grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDtoDsl.g:744:3: this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN
                    {
                    this_TYPE_BOOLEAN_6=(Token)match(input,RULE_TYPE_BOOLEAN,FOLLOW_2); 

                    			current.merge(this_TYPE_BOOLEAN_6);
                    		

                    			newLeafNode(this_TYPE_BOOLEAN_6, grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6());
                    		

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
    // InternalDtoDsl.g:755:1: entryRuleComplexType returns [String current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final String entryRuleComplexType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexType = null;


        try {
            // InternalDtoDsl.g:755:51: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalDtoDsl.g:756:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalDtoDsl.g:762:1: ruleComplexType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleComplexType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalDtoDsl.g:768:2: (this_DATE_0= RULE_DATE )
            // InternalDtoDsl.g:769:2: this_DATE_0= RULE_DATE
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000807FF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007F80L});

}