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
import uo.diesels.model.services.ModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ENUMERATE", "RULE_LIST", "RULE_SET", "RULE_VOID", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_DATE", "RULE_ONE", "RULE_MANY", "RULE_ONE_ONE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'abstract'", "'extends'", "'{'", "'}'", "'EntityLink'", "'ValueType'", "'Enumerable'", "'Link'", "'navigable'", "'non-navigable'", "'nullable'", "'non-nullable'", "'id'", "'Link.'", "'('", "','", "')'", "'<'", "'>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_LIST=6;
    public static final int RULE_TYPE_LONG=12;
    public static final int RULE_TYPE_BOOLEAN=15;
    public static final int RULE_DATE=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int RULE_ONE=17;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_ENUMERATE=5;
    public static final int RULE_SET=7;
    public static final int RULE_STRING=21;
    public static final int RULE_TYPE_CHAR=13;
    public static final int RULE_ONE_ONE=19;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int RULE_TYPE_STRING=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_VOID=8;
    public static final int T__31=31;
    public static final int RULE_TYPE_INT=9;
    public static final int T__32=32;
    public static final int RULE_MANY=18;
    public static final int RULE_WS=24;
    public static final int RULE_TYPE_FLOAT=11;
    public static final int RULE_ANY_OTHER=25;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_TYPE_DOUBLE=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalModelDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModelDsl.g"; }



     	private ModelDslGrammarAccess grammarAccess;

        public InternalModelDslParser(TokenStream input, ModelDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ModelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalModelDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalModelDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalModelDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalModelDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalModelDsl.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalModelDsl.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26||(LA1_0>=31 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModelDsl.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalModelDsl.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalModelDsl.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"uo.diesels.model.ModelDsl.Element");
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


    // $ANTLR start "entryRuleElement"
    // InternalModelDsl.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalModelDsl.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalModelDsl.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalModelDsl.g:107:1: ruleElement returns [EObject current=null] : (this_AllModelType_0= ruleAllModelType | this_SimpleLink_1= ruleSimpleLink ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_AllModelType_0 = null;

        EObject this_SimpleLink_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:113:2: ( (this_AllModelType_0= ruleAllModelType | this_SimpleLink_1= ruleSimpleLink ) )
            // InternalModelDsl.g:114:2: (this_AllModelType_0= ruleAllModelType | this_SimpleLink_1= ruleSimpleLink )
            {
            // InternalModelDsl.g:114:2: (this_AllModelType_0= ruleAllModelType | this_SimpleLink_1= ruleSimpleLink )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26||(LA2_0>=31 && LA2_0<=33)) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelDsl.g:115:3: this_AllModelType_0= ruleAllModelType
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAllModelTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllModelType_0=ruleAllModelType();

                    state._fsp--;


                    			current = this_AllModelType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:124:3: this_SimpleLink_1= ruleSimpleLink
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSimpleLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleLink_1=ruleSimpleLink();

                    state._fsp--;


                    			current = this_SimpleLink_1;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAllModelType"
    // InternalModelDsl.g:136:1: entryRuleAllModelType returns [EObject current=null] : iv_ruleAllModelType= ruleAllModelType EOF ;
    public final EObject entryRuleAllModelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllModelType = null;


        try {
            // InternalModelDsl.g:136:53: (iv_ruleAllModelType= ruleAllModelType EOF )
            // InternalModelDsl.g:137:2: iv_ruleAllModelType= ruleAllModelType EOF
            {
             newCompositeNode(grammarAccess.getAllModelTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllModelType=ruleAllModelType();

            state._fsp--;

             current =iv_ruleAllModelType; 
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
    // $ANTLR end "entryRuleAllModelType"


    // $ANTLR start "ruleAllModelType"
    // InternalModelDsl.g:143:1: ruleAllModelType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_ModelType_1= ruleModelType ) ;
    public final EObject ruleAllModelType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_ModelType_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:149:2: ( (this_Entity_0= ruleEntity | this_ModelType_1= ruleModelType ) )
            // InternalModelDsl.g:150:2: (this_Entity_0= ruleEntity | this_ModelType_1= ruleModelType )
            {
            // InternalModelDsl.g:150:2: (this_Entity_0= ruleEntity | this_ModelType_1= ruleModelType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26||LA3_0==31) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=32 && LA3_0<=33)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelDsl.g:151:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getAllModelTypeAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:160:3: this_ModelType_1= ruleModelType
                    {

                    			newCompositeNode(grammarAccess.getAllModelTypeAccess().getModelTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelType_1=ruleModelType();

                    state._fsp--;


                    			current = this_ModelType_1;
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
    // $ANTLR end "ruleAllModelType"


    // $ANTLR start "entryRuleEntity"
    // InternalModelDsl.g:172:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalModelDsl.g:172:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalModelDsl.g:173:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalModelDsl.g:179:1: ruleEntity returns [EObject current=null] : (this_SimpleEntity_0= ruleSimpleEntity | this_AssociativeEntity_1= ruleAssociativeEntity ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleEntity_0 = null;

        EObject this_AssociativeEntity_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:185:2: ( (this_SimpleEntity_0= ruleSimpleEntity | this_AssociativeEntity_1= ruleAssociativeEntity ) )
            // InternalModelDsl.g:186:2: (this_SimpleEntity_0= ruleSimpleEntity | this_AssociativeEntity_1= ruleAssociativeEntity )
            {
            // InternalModelDsl.g:186:2: (this_SimpleEntity_0= ruleSimpleEntity | this_AssociativeEntity_1= ruleAssociativeEntity )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalModelDsl.g:187:3: this_SimpleEntity_0= ruleSimpleEntity
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getSimpleEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleEntity_0=ruleSimpleEntity();

                    state._fsp--;


                    			current = this_SimpleEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:196:3: this_AssociativeEntity_1= ruleAssociativeEntity
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getAssociativeEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociativeEntity_1=ruleAssociativeEntity();

                    state._fsp--;


                    			current = this_AssociativeEntity_1;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleModelType"
    // InternalModelDsl.g:208:1: entryRuleModelType returns [EObject current=null] : iv_ruleModelType= ruleModelType EOF ;
    public final EObject entryRuleModelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelType = null;


        try {
            // InternalModelDsl.g:208:50: (iv_ruleModelType= ruleModelType EOF )
            // InternalModelDsl.g:209:2: iv_ruleModelType= ruleModelType EOF
            {
             newCompositeNode(grammarAccess.getModelTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelType=ruleModelType();

            state._fsp--;

             current =iv_ruleModelType; 
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
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // InternalModelDsl.g:215:1: ruleModelType returns [EObject current=null] : (this_Enumerable_0= ruleEnumerable | this_ValueType_1= ruleValueType ) ;
    public final EObject ruleModelType() throws RecognitionException {
        EObject current = null;

        EObject this_Enumerable_0 = null;

        EObject this_ValueType_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:221:2: ( (this_Enumerable_0= ruleEnumerable | this_ValueType_1= ruleValueType ) )
            // InternalModelDsl.g:222:2: (this_Enumerable_0= ruleEnumerable | this_ValueType_1= ruleValueType )
            {
            // InternalModelDsl.g:222:2: (this_Enumerable_0= ruleEnumerable | this_ValueType_1= ruleValueType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelDsl.g:223:3: this_Enumerable_0= ruleEnumerable
                    {

                    			newCompositeNode(grammarAccess.getModelTypeAccess().getEnumerableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumerable_0=ruleEnumerable();

                    state._fsp--;


                    			current = this_Enumerable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:232:3: this_ValueType_1= ruleValueType
                    {

                    			newCompositeNode(grammarAccess.getModelTypeAccess().getValueTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueType_1=ruleValueType();

                    state._fsp--;


                    			current = this_ValueType_1;
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
    // $ANTLR end "ruleModelType"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalModelDsl.g:244:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalModelDsl.g:244:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalModelDsl.g:245:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
            {
             newCompositeNode(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleEntity=ruleSimpleEntity();

            state._fsp--;

             current =iv_ruleSimpleEntity; 
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
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalModelDsl.g:251:1: ruleSimpleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_implementation_1_0= 'abstract' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributesId_6_0= ruleDefIdAttribute ) )* ( (lv_attributes_7_0= ruleDefAttribute ) )* ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) ;
    public final EObject ruleSimpleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_implementation_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_attributesId_6_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_methods_8_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:257:2: ( (otherlv_0= 'Entity' ( (lv_implementation_1_0= 'abstract' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributesId_6_0= ruleDefIdAttribute ) )* ( (lv_attributes_7_0= ruleDefAttribute ) )* ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) )
            // InternalModelDsl.g:258:2: (otherlv_0= 'Entity' ( (lv_implementation_1_0= 'abstract' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributesId_6_0= ruleDefIdAttribute ) )* ( (lv_attributes_7_0= ruleDefAttribute ) )* ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' )
            {
            // InternalModelDsl.g:258:2: (otherlv_0= 'Entity' ( (lv_implementation_1_0= 'abstract' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributesId_6_0= ruleDefIdAttribute ) )* ( (lv_attributes_7_0= ruleDefAttribute ) )* ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' )
            // InternalModelDsl.g:259:3: otherlv_0= 'Entity' ( (lv_implementation_1_0= 'abstract' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributesId_6_0= ruleDefIdAttribute ) )* ( (lv_attributes_7_0= ruleDefAttribute ) )* ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleEntityAccess().getEntityKeyword_0());
            		
            // InternalModelDsl.g:263:3: ( (lv_implementation_1_0= 'abstract' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelDsl.g:264:4: (lv_implementation_1_0= 'abstract' )
                    {
                    // InternalModelDsl.g:264:4: (lv_implementation_1_0= 'abstract' )
                    // InternalModelDsl.g:265:5: lv_implementation_1_0= 'abstract'
                    {
                    lv_implementation_1_0=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(lv_implementation_1_0, grammarAccess.getSimpleEntityAccess().getImplementationAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleEntityRule());
                    					}
                    					setWithLastConsumed(current, "implementation", lv_implementation_1_0, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalModelDsl.g:277:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalModelDsl.g:278:4: (lv_name_2_0= RULE_ID )
            {
            // InternalModelDsl.g:278:4: (lv_name_2_0= RULE_ID )
            // InternalModelDsl.g:279:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalModelDsl.g:295:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelDsl.g:296:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalModelDsl.g:300:4: ( (otherlv_4= RULE_ID ) )
                    // InternalModelDsl.g:301:5: (otherlv_4= RULE_ID )
                    {
                    // InternalModelDsl.g:301:5: (otherlv_4= RULE_ID )
                    // InternalModelDsl.g:302:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleEntityRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getSimpleEntityAccess().getSuperClassSimpleEntityCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalModelDsl.g:318:3: ( (lv_attributesId_6_0= ruleDefIdAttribute ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalModelDsl.g:319:4: (lv_attributesId_6_0= ruleDefIdAttribute )
            	    {
            	    // InternalModelDsl.g:319:4: (lv_attributesId_6_0= ruleDefIdAttribute )
            	    // InternalModelDsl.g:320:5: lv_attributesId_6_0= ruleDefIdAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getAttributesIdDefIdAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributesId_6_0=ruleDefIdAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributesId",
            	    						lv_attributesId_6_0,
            	    						"uo.diesels.model.ModelDsl.DefIdAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalModelDsl.g:337:3: ( (lv_attributes_7_0= ruleDefAttribute ) )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalModelDsl.g:338:4: (lv_attributes_7_0= ruleDefAttribute )
            	    {
            	    // InternalModelDsl.g:338:4: (lv_attributes_7_0= ruleDefAttribute )
            	    // InternalModelDsl.g:339:5: lv_attributes_7_0= ruleDefAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getAttributesDefAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_7_0=ruleDefAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_7_0,
            	    						"uo.diesels.model.ModelDsl.DefAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalModelDsl.g:356:3: ( (lv_methods_8_0= ruleMethod ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=RULE_LIST && LA10_0<=RULE_DATE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModelDsl.g:357:4: (lv_methods_8_0= ruleMethod )
            	    {
            	    // InternalModelDsl.g:357:4: (lv_methods_8_0= ruleMethod )
            	    // InternalModelDsl.g:358:5: lv_methods_8_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getMethodsMethodParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_methods_8_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_8_0,
            	    						"uo.diesels.model.ModelDsl.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleAssociativeEntity"
    // InternalModelDsl.g:383:1: entryRuleAssociativeEntity returns [EObject current=null] : iv_ruleAssociativeEntity= ruleAssociativeEntity EOF ;
    public final EObject entryRuleAssociativeEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociativeEntity = null;


        try {
            // InternalModelDsl.g:383:58: (iv_ruleAssociativeEntity= ruleAssociativeEntity EOF )
            // InternalModelDsl.g:384:2: iv_ruleAssociativeEntity= ruleAssociativeEntity EOF
            {
             newCompositeNode(grammarAccess.getAssociativeEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociativeEntity=ruleAssociativeEntity();

            state._fsp--;

             current =iv_ruleAssociativeEntity; 
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
    // $ANTLR end "entryRuleAssociativeEntity"


    // $ANTLR start "ruleAssociativeEntity"
    // InternalModelDsl.g:390:1: ruleAssociativeEntity returns [EObject current=null] : (otherlv_0= 'EntityLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) ( (lv_attributes_5_0= ruleDefAttribute ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) ;
    public final EObject ruleAssociativeEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_relations_3_0 = null;

        EObject lv_relations_4_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_methods_6_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:396:2: ( (otherlv_0= 'EntityLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) ( (lv_attributes_5_0= ruleDefAttribute ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) )
            // InternalModelDsl.g:397:2: (otherlv_0= 'EntityLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) ( (lv_attributes_5_0= ruleDefAttribute ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            {
            // InternalModelDsl.g:397:2: (otherlv_0= 'EntityLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) ( (lv_attributes_5_0= ruleDefAttribute ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            // InternalModelDsl.g:398:3: otherlv_0= 'EntityLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) ( (lv_attributes_5_0= ruleDefAttribute ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociativeEntityAccess().getEntityLinkKeyword_0());
            		
            // InternalModelDsl.g:402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:403:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:404:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssociativeEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociativeEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociativeEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModelDsl.g:424:3: ( (lv_relations_3_0= ruleRelation ) )
            // InternalModelDsl.g:425:4: (lv_relations_3_0= ruleRelation )
            {
            // InternalModelDsl.g:425:4: (lv_relations_3_0= ruleRelation )
            // InternalModelDsl.g:426:5: lv_relations_3_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getAssociativeEntityAccess().getRelationsRelationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_relations_3_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociativeEntityRule());
            					}
            					add(
            						current,
            						"relations",
            						lv_relations_3_0,
            						"uo.diesels.model.ModelDsl.Relation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:443:3: ( (lv_relations_4_0= ruleRelation ) )
            // InternalModelDsl.g:444:4: (lv_relations_4_0= ruleRelation )
            {
            // InternalModelDsl.g:444:4: (lv_relations_4_0= ruleRelation )
            // InternalModelDsl.g:445:5: lv_relations_4_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getAssociativeEntityAccess().getRelationsRelationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_relations_4_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociativeEntityRule());
            					}
            					add(
            						current,
            						"relations",
            						lv_relations_4_0,
            						"uo.diesels.model.ModelDsl.Relation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:462:3: ( (lv_attributes_5_0= ruleDefAttribute ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalModelDsl.g:463:4: (lv_attributes_5_0= ruleDefAttribute )
            	    {
            	    // InternalModelDsl.g:463:4: (lv_attributes_5_0= ruleDefAttribute )
            	    // InternalModelDsl.g:464:5: lv_attributes_5_0= ruleDefAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAssociativeEntityAccess().getAttributesDefAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_5_0=ruleDefAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociativeEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"uo.diesels.model.ModelDsl.DefAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalModelDsl.g:481:3: ( (lv_methods_6_0= ruleMethod ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=RULE_LIST && LA12_0<=RULE_DATE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalModelDsl.g:482:4: (lv_methods_6_0= ruleMethod )
            	    {
            	    // InternalModelDsl.g:482:4: (lv_methods_6_0= ruleMethod )
            	    // InternalModelDsl.g:483:5: lv_methods_6_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getAssociativeEntityAccess().getMethodsMethodParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_methods_6_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociativeEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_6_0,
            	    						"uo.diesels.model.ModelDsl.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociativeEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAssociativeEntity"


    // $ANTLR start "entryRuleValueType"
    // InternalModelDsl.g:508:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalModelDsl.g:508:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalModelDsl.g:509:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType; 
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
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalModelDsl.g:515:1: ruleValueType returns [EObject current=null] : (otherlv_0= 'ValueType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefAttribute ) )+ otherlv_4= '}' ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:521:2: ( (otherlv_0= 'ValueType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefAttribute ) )+ otherlv_4= '}' ) )
            // InternalModelDsl.g:522:2: (otherlv_0= 'ValueType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefAttribute ) )+ otherlv_4= '}' )
            {
            // InternalModelDsl.g:522:2: (otherlv_0= 'ValueType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefAttribute ) )+ otherlv_4= '}' )
            // InternalModelDsl.g:523:3: otherlv_0= 'ValueType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDefAttribute ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getValueTypeAccess().getValueTypeKeyword_0());
            		
            // InternalModelDsl.g:527:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:528:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:528:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:529:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValueTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getValueTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModelDsl.g:549:3: ( (lv_attributes_3_0= ruleDefAttribute ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=RULE_LIST && LA13_0<=RULE_SET)||(LA13_0>=RULE_TYPE_INT && LA13_0<=RULE_DATE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModelDsl.g:550:4: (lv_attributes_3_0= ruleDefAttribute )
            	    {
            	    // InternalModelDsl.g:550:4: (lv_attributes_3_0= ruleDefAttribute )
            	    // InternalModelDsl.g:551:5: lv_attributes_3_0= ruleDefAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getValueTypeAccess().getAttributesDefAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attributes_3_0=ruleDefAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValueTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"uo.diesels.model.ModelDsl.DefAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getValueTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleEnumerable"
    // InternalModelDsl.g:576:1: entryRuleEnumerable returns [EObject current=null] : iv_ruleEnumerable= ruleEnumerable EOF ;
    public final EObject entryRuleEnumerable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerable = null;


        try {
            // InternalModelDsl.g:576:51: (iv_ruleEnumerable= ruleEnumerable EOF )
            // InternalModelDsl.g:577:2: iv_ruleEnumerable= ruleEnumerable EOF
            {
             newCompositeNode(grammarAccess.getEnumerableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerable=ruleEnumerable();

            state._fsp--;

             current =iv_ruleEnumerable; 
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
    // $ANTLR end "entryRuleEnumerable"


    // $ANTLR start "ruleEnumerable"
    // InternalModelDsl.g:583:1: ruleEnumerable returns [EObject current=null] : (otherlv_0= 'Enumerable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= RULE_ENUMERATE ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumerable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_enums_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalModelDsl.g:589:2: ( (otherlv_0= 'Enumerable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= RULE_ENUMERATE ) )+ otherlv_4= '}' ) )
            // InternalModelDsl.g:590:2: (otherlv_0= 'Enumerable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= RULE_ENUMERATE ) )+ otherlv_4= '}' )
            {
            // InternalModelDsl.g:590:2: (otherlv_0= 'Enumerable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= RULE_ENUMERATE ) )+ otherlv_4= '}' )
            // InternalModelDsl.g:591:3: otherlv_0= 'Enumerable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= RULE_ENUMERATE ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerableAccess().getEnumerableKeyword_0());
            		
            // InternalModelDsl.g:595:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:596:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:596:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:597:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModelDsl.g:617:3: ( (lv_enums_3_0= RULE_ENUMERATE ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ENUMERATE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalModelDsl.g:618:4: (lv_enums_3_0= RULE_ENUMERATE )
            	    {
            	    // InternalModelDsl.g:618:4: (lv_enums_3_0= RULE_ENUMERATE )
            	    // InternalModelDsl.g:619:5: lv_enums_3_0= RULE_ENUMERATE
            	    {
            	    lv_enums_3_0=(Token)match(input,RULE_ENUMERATE,FOLLOW_14); 

            	    					newLeafNode(lv_enums_3_0, grammarAccess.getEnumerableAccess().getEnumsENUMERATETerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEnumerableRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"enums",
            	    						lv_enums_3_0,
            	    						"uo.diesels.model.ModelDsl.ENUMERATE");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerableAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumerable"


    // $ANTLR start "entryRuleSimpleLink"
    // InternalModelDsl.g:643:1: entryRuleSimpleLink returns [EObject current=null] : iv_ruleSimpleLink= ruleSimpleLink EOF ;
    public final EObject entryRuleSimpleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLink = null;


        try {
            // InternalModelDsl.g:643:51: (iv_ruleSimpleLink= ruleSimpleLink EOF )
            // InternalModelDsl.g:644:2: iv_ruleSimpleLink= ruleSimpleLink EOF
            {
             newCompositeNode(grammarAccess.getSimpleLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleLink=ruleSimpleLink();

            state._fsp--;

             current =iv_ruleSimpleLink; 
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
    // $ANTLR end "entryRuleSimpleLink"


    // $ANTLR start "ruleSimpleLink"
    // InternalModelDsl.g:650:1: ruleSimpleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) otherlv_5= '}' ) ;
    public final EObject ruleSimpleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_relations_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:656:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) otherlv_5= '}' ) )
            // InternalModelDsl.g:657:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) otherlv_5= '}' )
            {
            // InternalModelDsl.g:657:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) otherlv_5= '}' )
            // InternalModelDsl.g:658:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_relations_3_0= ruleRelation ) ) ( (lv_relations_4_0= ruleRelation ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleLinkAccess().getLinkKeyword_0());
            		
            // InternalModelDsl.g:662:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:663:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:663:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:664:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModelDsl.g:684:3: ( (lv_relations_3_0= ruleRelation ) )
            // InternalModelDsl.g:685:4: (lv_relations_3_0= ruleRelation )
            {
            // InternalModelDsl.g:685:4: (lv_relations_3_0= ruleRelation )
            // InternalModelDsl.g:686:5: lv_relations_3_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getSimpleLinkAccess().getRelationsRelationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_relations_3_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleLinkRule());
            					}
            					add(
            						current,
            						"relations",
            						lv_relations_3_0,
            						"uo.diesels.model.ModelDsl.Relation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:703:3: ( (lv_relations_4_0= ruleRelation ) )
            // InternalModelDsl.g:704:4: (lv_relations_4_0= ruleRelation )
            {
            // InternalModelDsl.g:704:4: (lv_relations_4_0= ruleRelation )
            // InternalModelDsl.g:705:5: lv_relations_4_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getSimpleLinkAccess().getRelationsRelationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_relations_4_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleLinkRule());
            					}
            					add(
            						current,
            						"relations",
            						lv_relations_4_0,
            						"uo.diesels.model.ModelDsl.Relation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleLinkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSimpleLink"


    // $ANTLR start "entryRuleRelation"
    // InternalModelDsl.g:730:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalModelDsl.g:730:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalModelDsl.g:731:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalModelDsl.g:737:1: ruleRelation returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_navigable_3_1=null;
        Token lv_navigable_3_2=null;
        AntlrDatatypeRuleToken lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:743:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) ) )? ) )
            // InternalModelDsl.g:744:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) ) )? )
            {
            // InternalModelDsl.g:744:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) ) )? )
            // InternalModelDsl.g:745:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) ) )?
            {
            // InternalModelDsl.g:745:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )
            // InternalModelDsl.g:746:4: (lv_multiplicity_0_0= ruleMultiplicity )
            {
            // InternalModelDsl.g:746:4: (lv_multiplicity_0_0= ruleMultiplicity )
            // InternalModelDsl.g:747:5: lv_multiplicity_0_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getMultiplicityMultiplicityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_multiplicity_0_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_0_0,
            						"uo.diesels.model.ModelDsl.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:764:3: ( (otherlv_1= RULE_ID ) )
            // InternalModelDsl.g:765:4: (otherlv_1= RULE_ID )
            {
            // InternalModelDsl.g:765:4: (otherlv_1= RULE_ID )
            // InternalModelDsl.g:766:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            // InternalModelDsl.g:777:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalModelDsl.g:778:4: (lv_name_2_0= RULE_ID )
            {
            // InternalModelDsl.g:778:4: (lv_name_2_0= RULE_ID )
            // InternalModelDsl.g:779:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalModelDsl.g:795:3: ( ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=35 && LA16_0<=36)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModelDsl.g:796:4: ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) )
                    {
                    // InternalModelDsl.g:796:4: ( (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' ) )
                    // InternalModelDsl.g:797:5: (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' )
                    {
                    // InternalModelDsl.g:797:5: (lv_navigable_3_1= 'navigable' | lv_navigable_3_2= 'non-navigable' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==35) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==36) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalModelDsl.g:798:6: lv_navigable_3_1= 'navigable'
                            {
                            lv_navigable_3_1=(Token)match(input,35,FOLLOW_2); 

                            						newLeafNode(lv_navigable_3_1, grammarAccess.getRelationAccess().getNavigableNavigableKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRelationRule());
                            						}
                            						setWithLastConsumed(current, "navigable", lv_navigable_3_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalModelDsl.g:809:6: lv_navigable_3_2= 'non-navigable'
                            {
                            lv_navigable_3_2=(Token)match(input,36,FOLLOW_2); 

                            						newLeafNode(lv_navigable_3_2, grammarAccess.getRelationAccess().getNavigableNonNavigableKeyword_3_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRelationRule());
                            						}
                            						setWithLastConsumed(current, "navigable", lv_navigable_3_2, null);
                            					

                            }
                            break;

                    }


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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleDefAttribute"
    // InternalModelDsl.g:826:1: entryRuleDefAttribute returns [EObject current=null] : iv_ruleDefAttribute= ruleDefAttribute EOF ;
    public final EObject entryRuleDefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAttribute = null;


        try {
            // InternalModelDsl.g:826:53: (iv_ruleDefAttribute= ruleDefAttribute EOF )
            // InternalModelDsl.g:827:2: iv_ruleDefAttribute= ruleDefAttribute EOF
            {
             newCompositeNode(grammarAccess.getDefAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefAttribute=ruleDefAttribute();

            state._fsp--;

             current =iv_ruleDefAttribute; 
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
    // $ANTLR end "entryRuleDefAttribute"


    // $ANTLR start "ruleDefAttribute"
    // InternalModelDsl.g:833:1: ruleDefAttribute returns [EObject current=null] : ( ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )? ) | this_DefCollectionTypeAttribute_3= ruleDefCollectionTypeAttribute ) ;
    public final EObject ruleDefAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_2_1=null;
        Token lv_nullable_2_2=null;
        EObject this_DefSimpleVariable_0 = null;

        EObject this_DefModelTypeVariable_1 = null;

        EObject this_DefCollectionTypeAttribute_3 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:839:2: ( ( ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )? ) | this_DefCollectionTypeAttribute_3= ruleDefCollectionTypeAttribute ) )
            // InternalModelDsl.g:840:2: ( ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )? ) | this_DefCollectionTypeAttribute_3= ruleDefCollectionTypeAttribute )
            {
            // InternalModelDsl.g:840:2: ( ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )? ) | this_DefCollectionTypeAttribute_3= ruleDefCollectionTypeAttribute )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=RULE_TYPE_INT && LA20_0<=RULE_DATE)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_LIST && LA20_0<=RULE_SET)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalModelDsl.g:841:3: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )? )
                    {
                    // InternalModelDsl.g:841:3: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )? )
                    // InternalModelDsl.g:842:4: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable ) ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )?
                    {
                    // InternalModelDsl.g:842:4: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_TYPE_INT && LA17_0<=RULE_DATE)) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_ID) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalModelDsl.g:843:5: this_DefSimpleVariable_0= ruleDefSimpleVariable
                            {

                            					newCompositeNode(grammarAccess.getDefAttributeAccess().getDefSimpleVariableParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_17);
                            this_DefSimpleVariable_0=ruleDefSimpleVariable();

                            state._fsp--;


                            					current = this_DefSimpleVariable_0;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalModelDsl.g:852:5: this_DefModelTypeVariable_1= ruleDefModelTypeVariable
                            {

                            					newCompositeNode(grammarAccess.getDefAttributeAccess().getDefModelTypeVariableParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_17);
                            this_DefModelTypeVariable_1=ruleDefModelTypeVariable();

                            state._fsp--;


                            					current = this_DefModelTypeVariable_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalModelDsl.g:861:4: ( ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=37 && LA19_0<=38)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalModelDsl.g:862:5: ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) )
                            {
                            // InternalModelDsl.g:862:5: ( (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' ) )
                            // InternalModelDsl.g:863:6: (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' )
                            {
                            // InternalModelDsl.g:863:6: (lv_nullable_2_1= 'nullable' | lv_nullable_2_2= 'non-nullable' )
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==37) ) {
                                alt18=1;
                            }
                            else if ( (LA18_0==38) ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 0, input);

                                throw nvae;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalModelDsl.g:864:7: lv_nullable_2_1= 'nullable'
                                    {
                                    lv_nullable_2_1=(Token)match(input,37,FOLLOW_2); 

                                    							newLeafNode(lv_nullable_2_1, grammarAccess.getDefAttributeAccess().getNullableNullableKeyword_0_1_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getDefAttributeRule());
                                    							}
                                    							setWithLastConsumed(current, "nullable", lv_nullable_2_1, null);
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalModelDsl.g:875:7: lv_nullable_2_2= 'non-nullable'
                                    {
                                    lv_nullable_2_2=(Token)match(input,38,FOLLOW_2); 

                                    							newLeafNode(lv_nullable_2_2, grammarAccess.getDefAttributeAccess().getNullableNonNullableKeyword_0_1_0_1());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getDefAttributeRule());
                                    							}
                                    							setWithLastConsumed(current, "nullable", lv_nullable_2_2, null);
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:890:3: this_DefCollectionTypeAttribute_3= ruleDefCollectionTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getDefAttributeAccess().getDefCollectionTypeAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefCollectionTypeAttribute_3=ruleDefCollectionTypeAttribute();

                    state._fsp--;


                    			current = this_DefCollectionTypeAttribute_3;
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
    // $ANTLR end "ruleDefAttribute"


    // $ANTLR start "entryRuleDefVariable"
    // InternalModelDsl.g:902:1: entryRuleDefVariable returns [EObject current=null] : iv_ruleDefVariable= ruleDefVariable EOF ;
    public final EObject entryRuleDefVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefVariable = null;


        try {
            // InternalModelDsl.g:902:52: (iv_ruleDefVariable= ruleDefVariable EOF )
            // InternalModelDsl.g:903:2: iv_ruleDefVariable= ruleDefVariable EOF
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
    // InternalModelDsl.g:909:1: ruleDefVariable returns [EObject current=null] : (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable ) ;
    public final EObject ruleDefVariable() throws RecognitionException {
        EObject current = null;

        EObject this_DefSimpleVariable_0 = null;

        EObject this_DefAllModelTypeVariable_1 = null;

        EObject this_DefCollectionTypeVariable_2 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:915:2: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable ) )
            // InternalModelDsl.g:916:2: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable )
            {
            // InternalModelDsl.g:916:2: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable | this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable )
            int alt21=3;
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
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                alt21=2;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalModelDsl.g:917:3: this_DefSimpleVariable_0= ruleDefSimpleVariable
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
                    // InternalModelDsl.g:926:3: this_DefAllModelTypeVariable_1= ruleDefAllModelTypeVariable
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
                    // InternalModelDsl.g:935:3: this_DefCollectionTypeVariable_2= ruleDefCollectionTypeVariable
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


    // $ANTLR start "entryRuleDefIdAttribute"
    // InternalModelDsl.g:947:1: entryRuleDefIdAttribute returns [EObject current=null] : iv_ruleDefIdAttribute= ruleDefIdAttribute EOF ;
    public final EObject entryRuleDefIdAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefIdAttribute = null;


        try {
            // InternalModelDsl.g:947:55: (iv_ruleDefIdAttribute= ruleDefIdAttribute EOF )
            // InternalModelDsl.g:948:2: iv_ruleDefIdAttribute= ruleDefIdAttribute EOF
            {
             newCompositeNode(grammarAccess.getDefIdAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefIdAttribute=ruleDefIdAttribute();

            state._fsp--;

             current =iv_ruleDefIdAttribute; 
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
    // $ANTLR end "entryRuleDefIdAttribute"


    // $ANTLR start "ruleDefIdAttribute"
    // InternalModelDsl.g:954:1: ruleDefIdAttribute returns [EObject current=null] : ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable | this_DefLinkVariable_2= ruleDefLinkVariable ) otherlv_3= 'id' ) ;
    public final EObject ruleDefIdAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DefSimpleVariable_0 = null;

        EObject this_DefModelTypeVariable_1 = null;

        EObject this_DefLinkVariable_2 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:960:2: ( ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable | this_DefLinkVariable_2= ruleDefLinkVariable ) otherlv_3= 'id' ) )
            // InternalModelDsl.g:961:2: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable | this_DefLinkVariable_2= ruleDefLinkVariable ) otherlv_3= 'id' )
            {
            // InternalModelDsl.g:961:2: ( (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable | this_DefLinkVariable_2= ruleDefLinkVariable ) otherlv_3= 'id' )
            // InternalModelDsl.g:962:3: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable | this_DefLinkVariable_2= ruleDefLinkVariable ) otherlv_3= 'id'
            {
            // InternalModelDsl.g:962:3: (this_DefSimpleVariable_0= ruleDefSimpleVariable | this_DefModelTypeVariable_1= ruleDefModelTypeVariable | this_DefLinkVariable_2= ruleDefLinkVariable )
            int alt22=3;
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
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case 40:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalModelDsl.g:963:4: this_DefSimpleVariable_0= ruleDefSimpleVariable
                    {

                    				newCompositeNode(grammarAccess.getDefIdAttributeAccess().getDefSimpleVariableParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_18);
                    this_DefSimpleVariable_0=ruleDefSimpleVariable();

                    state._fsp--;


                    				current = this_DefSimpleVariable_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:972:4: this_DefModelTypeVariable_1= ruleDefModelTypeVariable
                    {

                    				newCompositeNode(grammarAccess.getDefIdAttributeAccess().getDefModelTypeVariableParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_DefModelTypeVariable_1=ruleDefModelTypeVariable();

                    state._fsp--;


                    				current = this_DefModelTypeVariable_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:981:4: this_DefLinkVariable_2= ruleDefLinkVariable
                    {

                    				newCompositeNode(grammarAccess.getDefIdAttributeAccess().getDefLinkVariableParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_18);
                    this_DefLinkVariable_2=ruleDefLinkVariable();

                    state._fsp--;


                    				current = this_DefLinkVariable_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDefIdAttributeAccess().getIdKeyword_1());
            		

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
    // $ANTLR end "ruleDefIdAttribute"


    // $ANTLR start "entryRuleDefAllModelTypeVariable"
    // InternalModelDsl.g:998:1: entryRuleDefAllModelTypeVariable returns [EObject current=null] : iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF ;
    public final EObject entryRuleDefAllModelTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAllModelTypeVariable = null;


        try {
            // InternalModelDsl.g:998:64: (iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF )
            // InternalModelDsl.g:999:2: iv_ruleDefAllModelTypeVariable= ruleDefAllModelTypeVariable EOF
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
    // InternalModelDsl.g:1005:1: ruleDefAllModelTypeVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefAllModelTypeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalModelDsl.g:1011:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:1012:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:1012:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalModelDsl.g:1013:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalModelDsl.g:1013:3: ( (otherlv_0= RULE_ID ) )
            // InternalModelDsl.g:1014:4: (otherlv_0= RULE_ID )
            {
            // InternalModelDsl.g:1014:4: (otherlv_0= RULE_ID )
            // InternalModelDsl.g:1015:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefAllModelTypeVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalModelDsl.g:1026:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1027:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1027:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1028:5: lv_name_1_0= RULE_ID
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
    // InternalModelDsl.g:1048:1: entryRuleDefSimpleVariable returns [EObject current=null] : iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF ;
    public final EObject entryRuleDefSimpleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSimpleVariable = null;


        try {
            // InternalModelDsl.g:1048:58: (iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF )
            // InternalModelDsl.g:1049:2: iv_ruleDefSimpleVariable= ruleDefSimpleVariable EOF
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
    // InternalModelDsl.g:1055:1: ruleDefSimpleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefSimpleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1061:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:1062:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:1062:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalModelDsl.g:1063:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalModelDsl.g:1063:3: ( (lv_type_0_0= ruleType ) )
            // InternalModelDsl.g:1064:4: (lv_type_0_0= ruleType )
            {
            // InternalModelDsl.g:1064:4: (lv_type_0_0= ruleType )
            // InternalModelDsl.g:1065:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefSimpleVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.ModelDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:1082:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1083:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1083:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1084:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleDefModelTypeVariable"
    // InternalModelDsl.g:1104:1: entryRuleDefModelTypeVariable returns [EObject current=null] : iv_ruleDefModelTypeVariable= ruleDefModelTypeVariable EOF ;
    public final EObject entryRuleDefModelTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefModelTypeVariable = null;


        try {
            // InternalModelDsl.g:1104:61: (iv_ruleDefModelTypeVariable= ruleDefModelTypeVariable EOF )
            // InternalModelDsl.g:1105:2: iv_ruleDefModelTypeVariable= ruleDefModelTypeVariable EOF
            {
             newCompositeNode(grammarAccess.getDefModelTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefModelTypeVariable=ruleDefModelTypeVariable();

            state._fsp--;

             current =iv_ruleDefModelTypeVariable; 
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
    // $ANTLR end "entryRuleDefModelTypeVariable"


    // $ANTLR start "ruleDefModelTypeVariable"
    // InternalModelDsl.g:1111:1: ruleDefModelTypeVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefModelTypeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalModelDsl.g:1117:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:1118:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:1118:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalModelDsl.g:1119:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalModelDsl.g:1119:3: ( (otherlv_0= RULE_ID ) )
            // InternalModelDsl.g:1120:4: (otherlv_0= RULE_ID )
            {
            // InternalModelDsl.g:1120:4: (otherlv_0= RULE_ID )
            // InternalModelDsl.g:1121:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefModelTypeVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getDefModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalModelDsl.g:1132:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1133:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1133:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1134:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefModelTypeVariableRule());
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
    // $ANTLR end "ruleDefModelTypeVariable"


    // $ANTLR start "entryRuleDefCollectionTypeAttribute"
    // InternalModelDsl.g:1154:1: entryRuleDefCollectionTypeAttribute returns [EObject current=null] : iv_ruleDefCollectionTypeAttribute= ruleDefCollectionTypeAttribute EOF ;
    public final EObject entryRuleDefCollectionTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCollectionTypeAttribute = null;


        try {
            // InternalModelDsl.g:1154:67: (iv_ruleDefCollectionTypeAttribute= ruleDefCollectionTypeAttribute EOF )
            // InternalModelDsl.g:1155:2: iv_ruleDefCollectionTypeAttribute= ruleDefCollectionTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getDefCollectionTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefCollectionTypeAttribute=ruleDefCollectionTypeAttribute();

            state._fsp--;

             current =iv_ruleDefCollectionTypeAttribute; 
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
    // $ANTLR end "entryRuleDefCollectionTypeAttribute"


    // $ANTLR start "ruleDefCollectionTypeAttribute"
    // InternalModelDsl.g:1161:1: ruleDefCollectionTypeAttribute returns [EObject current=null] : (this_DefModelModelTypeCollectionVariable_0= ruleDefModelModelTypeCollectionVariable | this_DefModelSimpleTypeCollectionVariable_1= ruleDefModelSimpleTypeCollectionVariable ) ;
    public final EObject ruleDefCollectionTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_DefModelModelTypeCollectionVariable_0 = null;

        EObject this_DefModelSimpleTypeCollectionVariable_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1167:2: ( (this_DefModelModelTypeCollectionVariable_0= ruleDefModelModelTypeCollectionVariable | this_DefModelSimpleTypeCollectionVariable_1= ruleDefModelSimpleTypeCollectionVariable ) )
            // InternalModelDsl.g:1168:2: (this_DefModelModelTypeCollectionVariable_0= ruleDefModelModelTypeCollectionVariable | this_DefModelSimpleTypeCollectionVariable_1= ruleDefModelSimpleTypeCollectionVariable )
            {
            // InternalModelDsl.g:1168:2: (this_DefModelModelTypeCollectionVariable_0= ruleDefModelModelTypeCollectionVariable | this_DefModelSimpleTypeCollectionVariable_1= ruleDefModelSimpleTypeCollectionVariable )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LIST) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==44) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_ID) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_3>=RULE_TYPE_INT && LA23_3<=RULE_DATE)) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_SET) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==44) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_ID) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_3>=RULE_TYPE_INT && LA23_3<=RULE_DATE)) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalModelDsl.g:1169:3: this_DefModelModelTypeCollectionVariable_0= ruleDefModelModelTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefCollectionTypeAttributeAccess().getDefModelModelTypeCollectionVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefModelModelTypeCollectionVariable_0=ruleDefModelModelTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefModelModelTypeCollectionVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1178:3: this_DefModelSimpleTypeCollectionVariable_1= ruleDefModelSimpleTypeCollectionVariable
                    {

                    			newCompositeNode(grammarAccess.getDefCollectionTypeAttributeAccess().getDefModelSimpleTypeCollectionVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefModelSimpleTypeCollectionVariable_1=ruleDefModelSimpleTypeCollectionVariable();

                    state._fsp--;


                    			current = this_DefModelSimpleTypeCollectionVariable_1;
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
    // $ANTLR end "ruleDefCollectionTypeAttribute"


    // $ANTLR start "entryRuleDefCollectionTypeVariable"
    // InternalModelDsl.g:1190:1: entryRuleDefCollectionTypeVariable returns [EObject current=null] : iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF ;
    public final EObject entryRuleDefCollectionTypeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCollectionTypeVariable = null;


        try {
            // InternalModelDsl.g:1190:66: (iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF )
            // InternalModelDsl.g:1191:2: iv_ruleDefCollectionTypeVariable= ruleDefCollectionTypeVariable EOF
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
    // InternalModelDsl.g:1197:1: ruleDefCollectionTypeVariable returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleDefCollectionTypeVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1203:2: ( ( ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalModelDsl.g:1204:2: ( ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalModelDsl.g:1204:2: ( ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LIST) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==44) ) {
                    int LA24_3 = input.LA(3);

                    if ( ((LA24_3>=RULE_TYPE_INT && LA24_3<=RULE_DATE)) ) {
                        alt24=2;
                    }
                    else if ( (LA24_3==RULE_ID) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_SET) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==44) ) {
                    int LA24_3 = input.LA(3);

                    if ( ((LA24_3>=RULE_TYPE_INT && LA24_3<=RULE_DATE)) ) {
                        alt24=2;
                    }
                    else if ( (LA24_3==RULE_ID) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalModelDsl.g:1205:3: ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalModelDsl.g:1205:3: ( ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalModelDsl.g:1206:4: ( (lv_type_0_0= ruleAllModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalModelDsl.g:1206:4: ( (lv_type_0_0= ruleAllModelTypeCollection ) )
                    // InternalModelDsl.g:1207:5: (lv_type_0_0= ruleAllModelTypeCollection )
                    {
                    // InternalModelDsl.g:1207:5: (lv_type_0_0= ruleAllModelTypeCollection )
                    // InternalModelDsl.g:1208:6: lv_type_0_0= ruleAllModelTypeCollection
                    {

                    						newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_type_0_0=ruleAllModelTypeCollection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefCollectionTypeVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"uo.diesels.model.ModelDsl.AllModelTypeCollection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelDsl.g:1225:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalModelDsl.g:1226:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalModelDsl.g:1226:5: (lv_name_1_0= RULE_ID )
                    // InternalModelDsl.g:1227:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getDefCollectionTypeVariableAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefCollectionTypeVariableRule());
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
                    break;
                case 2 :
                    // InternalModelDsl.g:1245:3: ( ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalModelDsl.g:1245:3: ( ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalModelDsl.g:1246:4: ( (lv_type_2_0= ruleSimpleTypeCollection ) ) ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalModelDsl.g:1246:4: ( (lv_type_2_0= ruleSimpleTypeCollection ) )
                    // InternalModelDsl.g:1247:5: (lv_type_2_0= ruleSimpleTypeCollection )
                    {
                    // InternalModelDsl.g:1247:5: (lv_type_2_0= ruleSimpleTypeCollection )
                    // InternalModelDsl.g:1248:6: lv_type_2_0= ruleSimpleTypeCollection
                    {

                    						newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_type_2_0=ruleSimpleTypeCollection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefCollectionTypeVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"uo.diesels.model.ModelDsl.SimpleTypeCollection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelDsl.g:1265:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalModelDsl.g:1266:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalModelDsl.g:1266:5: (lv_name_3_0= RULE_ID )
                    // InternalModelDsl.g:1267:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getDefCollectionTypeVariableAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefCollectionTypeVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


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


    // $ANTLR start "entryRuleDefModelModelTypeCollectionVariable"
    // InternalModelDsl.g:1288:1: entryRuleDefModelModelTypeCollectionVariable returns [EObject current=null] : iv_ruleDefModelModelTypeCollectionVariable= ruleDefModelModelTypeCollectionVariable EOF ;
    public final EObject entryRuleDefModelModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefModelModelTypeCollectionVariable = null;


        try {
            // InternalModelDsl.g:1288:76: (iv_ruleDefModelModelTypeCollectionVariable= ruleDefModelModelTypeCollectionVariable EOF )
            // InternalModelDsl.g:1289:2: iv_ruleDefModelModelTypeCollectionVariable= ruleDefModelModelTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefModelModelTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefModelModelTypeCollectionVariable=ruleDefModelModelTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefModelModelTypeCollectionVariable; 
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
    // $ANTLR end "entryRuleDefModelModelTypeCollectionVariable"


    // $ANTLR start "ruleDefModelModelTypeCollectionVariable"
    // InternalModelDsl.g:1295:1: ruleDefModelModelTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefModelModelTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1301:2: ( ( ( (lv_type_0_0= ruleModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:1302:2: ( ( (lv_type_0_0= ruleModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:1302:2: ( ( (lv_type_0_0= ruleModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalModelDsl.g:1303:3: ( (lv_type_0_0= ruleModelTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalModelDsl.g:1303:3: ( (lv_type_0_0= ruleModelTypeCollection ) )
            // InternalModelDsl.g:1304:4: (lv_type_0_0= ruleModelTypeCollection )
            {
            // InternalModelDsl.g:1304:4: (lv_type_0_0= ruleModelTypeCollection )
            // InternalModelDsl.g:1305:5: lv_type_0_0= ruleModelTypeCollection
            {

            					newCompositeNode(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getTypeModelTypeCollectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleModelTypeCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefModelModelTypeCollectionVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.ModelDsl.ModelTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:1322:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1323:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1323:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1324:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefModelModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefModelModelTypeCollectionVariableRule());
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
    // $ANTLR end "ruleDefModelModelTypeCollectionVariable"


    // $ANTLR start "entryRuleDefModelSimpleTypeCollectionVariable"
    // InternalModelDsl.g:1344:1: entryRuleDefModelSimpleTypeCollectionVariable returns [EObject current=null] : iv_ruleDefModelSimpleTypeCollectionVariable= ruleDefModelSimpleTypeCollectionVariable EOF ;
    public final EObject entryRuleDefModelSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefModelSimpleTypeCollectionVariable = null;


        try {
            // InternalModelDsl.g:1344:77: (iv_ruleDefModelSimpleTypeCollectionVariable= ruleDefModelSimpleTypeCollectionVariable EOF )
            // InternalModelDsl.g:1345:2: iv_ruleDefModelSimpleTypeCollectionVariable= ruleDefModelSimpleTypeCollectionVariable EOF
            {
             newCompositeNode(grammarAccess.getDefModelSimpleTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefModelSimpleTypeCollectionVariable=ruleDefModelSimpleTypeCollectionVariable();

            state._fsp--;

             current =iv_ruleDefModelSimpleTypeCollectionVariable; 
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
    // $ANTLR end "entryRuleDefModelSimpleTypeCollectionVariable"


    // $ANTLR start "ruleDefModelSimpleTypeCollectionVariable"
    // InternalModelDsl.g:1351:1: ruleDefModelSimpleTypeCollectionVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefModelSimpleTypeCollectionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1357:2: ( ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:1358:2: ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:1358:2: ( ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalModelDsl.g:1359:3: ( (lv_type_0_0= ruleSimpleTypeCollection ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalModelDsl.g:1359:3: ( (lv_type_0_0= ruleSimpleTypeCollection ) )
            // InternalModelDsl.g:1360:4: (lv_type_0_0= ruleSimpleTypeCollection )
            {
            // InternalModelDsl.g:1360:4: (lv_type_0_0= ruleSimpleTypeCollection )
            // InternalModelDsl.g:1361:5: lv_type_0_0= ruleSimpleTypeCollection
            {

            					newCompositeNode(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleSimpleTypeCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefModelSimpleTypeCollectionVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uo.diesels.model.ModelDsl.SimpleTypeCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:1378:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1379:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1379:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1380:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefModelSimpleTypeCollectionVariableRule());
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
    // $ANTLR end "ruleDefModelSimpleTypeCollectionVariable"


    // $ANTLR start "entryRuleDefLinkVariable"
    // InternalModelDsl.g:1400:1: entryRuleDefLinkVariable returns [EObject current=null] : iv_ruleDefLinkVariable= ruleDefLinkVariable EOF ;
    public final EObject entryRuleDefLinkVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefLinkVariable = null;


        try {
            // InternalModelDsl.g:1400:56: (iv_ruleDefLinkVariable= ruleDefLinkVariable EOF )
            // InternalModelDsl.g:1401:2: iv_ruleDefLinkVariable= ruleDefLinkVariable EOF
            {
             newCompositeNode(grammarAccess.getDefLinkVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefLinkVariable=ruleDefLinkVariable();

            state._fsp--;

             current =iv_ruleDefLinkVariable; 
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
    // $ANTLR end "entryRuleDefLinkVariable"


    // $ANTLR start "ruleDefLinkVariable"
    // InternalModelDsl.g:1407:1: ruleDefLinkVariable returns [EObject current=null] : (otherlv_0= 'Link.' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDefLinkVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalModelDsl.g:1413:2: ( (otherlv_0= 'Link.' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:1414:2: (otherlv_0= 'Link.' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:1414:2: (otherlv_0= 'Link.' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalModelDsl.g:1415:3: otherlv_0= 'Link.' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDefLinkVariableAccess().getLinkKeyword_0());
            		
            // InternalModelDsl.g:1419:3: ( (otherlv_1= RULE_ID ) )
            // InternalModelDsl.g:1420:4: (otherlv_1= RULE_ID )
            {
            // InternalModelDsl.g:1420:4: (otherlv_1= RULE_ID )
            // InternalModelDsl.g:1421:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefLinkVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getDefLinkVariableAccess().getTypeLinkCrossReference_1_0());
            				

            }


            }

            // InternalModelDsl.g:1432:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalModelDsl.g:1433:4: (lv_name_2_0= RULE_ID )
            {
            // InternalModelDsl.g:1433:4: (lv_name_2_0= RULE_ID )
            // InternalModelDsl.g:1434:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDefLinkVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefLinkVariableRule());
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
    // $ANTLR end "ruleDefLinkVariable"


    // $ANTLR start "entryRuleMethod"
    // InternalModelDsl.g:1454:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalModelDsl.g:1454:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalModelDsl.g:1455:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalModelDsl.g:1461:1: ruleMethod returns [EObject current=null] : (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodCollectionReturn_1= ruleMethodCollectionReturn | this_MethodAllModelReturn_2= ruleMethodAllModelReturn ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_MethodSimpleReturn_0 = null;

        EObject this_MethodCollectionReturn_1 = null;

        EObject this_MethodAllModelReturn_2 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1467:2: ( (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodCollectionReturn_1= ruleMethodCollectionReturn | this_MethodAllModelReturn_2= ruleMethodAllModelReturn ) )
            // InternalModelDsl.g:1468:2: (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodCollectionReturn_1= ruleMethodCollectionReturn | this_MethodAllModelReturn_2= ruleMethodAllModelReturn )
            {
            // InternalModelDsl.g:1468:2: (this_MethodSimpleReturn_0= ruleMethodSimpleReturn | this_MethodCollectionReturn_1= ruleMethodCollectionReturn | this_MethodAllModelReturn_2= ruleMethodAllModelReturn )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_VOID:
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_DATE:
                {
                alt25=1;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalModelDsl.g:1469:3: this_MethodSimpleReturn_0= ruleMethodSimpleReturn
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getMethodSimpleReturnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodSimpleReturn_0=ruleMethodSimpleReturn();

                    state._fsp--;


                    			current = this_MethodSimpleReturn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1478:3: this_MethodCollectionReturn_1= ruleMethodCollectionReturn
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getMethodCollectionReturnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCollectionReturn_1=ruleMethodCollectionReturn();

                    state._fsp--;


                    			current = this_MethodCollectionReturn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:1487:3: this_MethodAllModelReturn_2= ruleMethodAllModelReturn
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getMethodAllModelReturnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodAllModelReturn_2=ruleMethodAllModelReturn();

                    state._fsp--;


                    			current = this_MethodAllModelReturn_2;
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodSimpleReturn"
    // InternalModelDsl.g:1499:1: entryRuleMethodSimpleReturn returns [EObject current=null] : iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF ;
    public final EObject entryRuleMethodSimpleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSimpleReturn = null;


        try {
            // InternalModelDsl.g:1499:59: (iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF )
            // InternalModelDsl.g:1500:2: iv_ruleMethodSimpleReturn= ruleMethodSimpleReturn EOF
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
    // InternalModelDsl.g:1506:1: ruleMethodSimpleReturn returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalModelDsl.g:1512:2: ( ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalModelDsl.g:1513:2: ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalModelDsl.g:1513:2: ( ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalModelDsl.g:1514:3: ( (lv_returnType_0_0= ruleSimpleReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalModelDsl.g:1514:3: ( (lv_returnType_0_0= ruleSimpleReturnType ) )
            // InternalModelDsl.g:1515:4: (lv_returnType_0_0= ruleSimpleReturnType )
            {
            // InternalModelDsl.g:1515:4: (lv_returnType_0_0= ruleSimpleReturnType )
            // InternalModelDsl.g:1516:5: lv_returnType_0_0= ruleSimpleReturnType
            {

            					newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeSimpleReturnTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_returnType_0_0=ruleSimpleReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"uo.diesels.model.ModelDsl.SimpleReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:1533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1534:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1535:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelDsl.g:1555:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=RULE_LIST && LA27_0<=RULE_SET)||(LA27_0>=RULE_TYPE_INT && LA27_0<=RULE_DATE)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModelDsl.g:1556:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalModelDsl.g:1556:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalModelDsl.g:1557:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalModelDsl.g:1557:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalModelDsl.g:1558:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.ModelDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelDsl.g:1575:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==42) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalModelDsl.g:1576:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalModelDsl.g:1580:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalModelDsl.g:1581:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalModelDsl.g:1581:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalModelDsl.g:1582:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.ModelDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMethodCollectionReturn"
    // InternalModelDsl.g:1609:1: entryRuleMethodCollectionReturn returns [EObject current=null] : iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF ;
    public final EObject entryRuleMethodCollectionReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCollectionReturn = null;


        try {
            // InternalModelDsl.g:1609:63: (iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF )
            // InternalModelDsl.g:1610:2: iv_ruleMethodCollectionReturn= ruleMethodCollectionReturn EOF
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
    // InternalModelDsl.g:1616:1: ruleMethodCollectionReturn returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalModelDsl.g:1622:2: ( ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalModelDsl.g:1623:2: ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalModelDsl.g:1623:2: ( ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalModelDsl.g:1624:3: ( (lv_returnType_0_0= ruleCollectionReturnType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalModelDsl.g:1624:3: ( (lv_returnType_0_0= ruleCollectionReturnType ) )
            // InternalModelDsl.g:1625:4: (lv_returnType_0_0= ruleCollectionReturnType )
            {
            // InternalModelDsl.g:1625:4: (lv_returnType_0_0= ruleCollectionReturnType )
            // InternalModelDsl.g:1626:5: lv_returnType_0_0= ruleCollectionReturnType
            {

            					newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeCollectionReturnTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_returnType_0_0=ruleCollectionReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"uo.diesels.model.ModelDsl.CollectionReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelDsl.g:1643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1644:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelDsl.g:1665:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=RULE_LIST && LA29_0<=RULE_SET)||(LA29_0>=RULE_TYPE_INT && LA29_0<=RULE_DATE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModelDsl.g:1666:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalModelDsl.g:1666:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalModelDsl.g:1667:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalModelDsl.g:1667:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalModelDsl.g:1668:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.ModelDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelDsl.g:1685:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==42) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalModelDsl.g:1686:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalModelDsl.g:1690:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalModelDsl.g:1691:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalModelDsl.g:1691:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalModelDsl.g:1692:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.ModelDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMethodAllModelReturn"
    // InternalModelDsl.g:1719:1: entryRuleMethodAllModelReturn returns [EObject current=null] : iv_ruleMethodAllModelReturn= ruleMethodAllModelReturn EOF ;
    public final EObject entryRuleMethodAllModelReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodAllModelReturn = null;


        try {
            // InternalModelDsl.g:1719:61: (iv_ruleMethodAllModelReturn= ruleMethodAllModelReturn EOF )
            // InternalModelDsl.g:1720:2: iv_ruleMethodAllModelReturn= ruleMethodAllModelReturn EOF
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
    // InternalModelDsl.g:1726:1: ruleMethodAllModelReturn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalModelDsl.g:1732:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalModelDsl.g:1733:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalModelDsl.g:1733:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')' )
            // InternalModelDsl.g:1734:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalModelDsl.g:1734:3: ( (otherlv_0= RULE_ID ) )
            // InternalModelDsl.g:1735:4: (otherlv_0= RULE_ID )
            {
            // InternalModelDsl.g:1735:4: (otherlv_0= RULE_ID )
            // InternalModelDsl.g:1736:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodAllModelReturnRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeCrossReference_0_0());
            				

            }


            }

            // InternalModelDsl.g:1747:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelDsl.g:1748:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelDsl.g:1748:4: (lv_name_1_0= RULE_ID )
            // InternalModelDsl.g:1749:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAllModelReturnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelDsl.g:1769:3: ( ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=RULE_LIST && LA31_0<=RULE_SET)||(LA31_0>=RULE_TYPE_INT && LA31_0<=RULE_DATE)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalModelDsl.g:1770:4: ( (lv_parameters_3_0= ruleDefVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    {
                    // InternalModelDsl.g:1770:4: ( (lv_parameters_3_0= ruleDefVariable ) )
                    // InternalModelDsl.g:1771:5: (lv_parameters_3_0= ruleDefVariable )
                    {
                    // InternalModelDsl.g:1771:5: (lv_parameters_3_0= ruleDefVariable )
                    // InternalModelDsl.g:1772:6: lv_parameters_3_0= ruleDefVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_parameters_3_0=ruleDefVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodAllModelReturnRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"uo.diesels.model.ModelDsl.DefVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelDsl.g:1789:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==42) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalModelDsl.g:1790:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAllModelReturnAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalModelDsl.g:1794:5: ( (lv_parameters_5_0= ruleDefVariable ) )
                    	    // InternalModelDsl.g:1795:6: (lv_parameters_5_0= ruleDefVariable )
                    	    {
                    	    // InternalModelDsl.g:1795:6: (lv_parameters_5_0= ruleDefVariable )
                    	    // InternalModelDsl.g:1796:7: lv_parameters_5_0= ruleDefVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_parameters_5_0=ruleDefVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodAllModelReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"uo.diesels.model.ModelDsl.DefVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAllModelTypeCollection"
    // InternalModelDsl.g:1823:1: entryRuleAllModelTypeCollection returns [EObject current=null] : iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF ;
    public final EObject entryRuleAllModelTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllModelTypeCollection = null;


        try {
            // InternalModelDsl.g:1823:63: (iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF )
            // InternalModelDsl.g:1824:2: iv_ruleAllModelTypeCollection= ruleAllModelTypeCollection EOF
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
    // InternalModelDsl.g:1830:1: ruleAllModelTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) ;
    public final EObject ruleAllModelTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalModelDsl.g:1836:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) )
            // InternalModelDsl.g:1837:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            {
            // InternalModelDsl.g:1837:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            // InternalModelDsl.g:1838:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>'
            {
            // InternalModelDsl.g:1838:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalModelDsl.g:1839:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalModelDsl.g:1839:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalModelDsl.g:1840:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalModelDsl.g:1840:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LIST) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_SET) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalModelDsl.g:1841:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_22); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.ModelDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1856:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_22); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getAllModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.ModelDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalModelDsl.g:1877:3: ( (otherlv_2= RULE_ID ) )
            // InternalModelDsl.g:1878:4: (otherlv_2= RULE_ID )
            {
            // InternalModelDsl.g:1878:4: (otherlv_2= RULE_ID )
            // InternalModelDsl.g:1879:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

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


    // $ANTLR start "entryRuleModelTypeCollection"
    // InternalModelDsl.g:1898:1: entryRuleModelTypeCollection returns [EObject current=null] : iv_ruleModelTypeCollection= ruleModelTypeCollection EOF ;
    public final EObject entryRuleModelTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelTypeCollection = null;


        try {
            // InternalModelDsl.g:1898:60: (iv_ruleModelTypeCollection= ruleModelTypeCollection EOF )
            // InternalModelDsl.g:1899:2: iv_ruleModelTypeCollection= ruleModelTypeCollection EOF
            {
             newCompositeNode(grammarAccess.getModelTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelTypeCollection=ruleModelTypeCollection();

            state._fsp--;

             current =iv_ruleModelTypeCollection; 
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
    // $ANTLR end "entryRuleModelTypeCollection"


    // $ANTLR start "ruleModelTypeCollection"
    // InternalModelDsl.g:1905:1: ruleModelTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) ;
    public final EObject ruleModelTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalModelDsl.g:1911:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ) )
            // InternalModelDsl.g:1912:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            {
            // InternalModelDsl.g:1912:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' )
            // InternalModelDsl.g:1913:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>'
            {
            // InternalModelDsl.g:1913:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalModelDsl.g:1914:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalModelDsl.g:1914:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalModelDsl.g:1915:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalModelDsl.g:1915:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LIST) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_SET) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalModelDsl.g:1916:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_22); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.ModelDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1931:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_22); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.ModelDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModelTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalModelDsl.g:1952:3: ( (otherlv_2= RULE_ID ) )
            // InternalModelDsl.g:1953:4: (otherlv_2= RULE_ID )
            {
            // InternalModelDsl.g:1953:4: (otherlv_2= RULE_ID )
            // InternalModelDsl.g:1954:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelTypeCollectionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getModelTypeCollectionAccess().getTypeModelTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelTypeCollectionAccess().getGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleModelTypeCollection"


    // $ANTLR start "entryRuleSimpleTypeCollection"
    // InternalModelDsl.g:1973:1: entryRuleSimpleTypeCollection returns [EObject current=null] : iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF ;
    public final EObject entryRuleSimpleTypeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeCollection = null;


        try {
            // InternalModelDsl.g:1973:61: (iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF )
            // InternalModelDsl.g:1974:2: iv_ruleSimpleTypeCollection= ruleSimpleTypeCollection EOF
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
    // InternalModelDsl.g:1980:1: ruleSimpleTypeCollection returns [EObject current=null] : ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleSimpleTypeCollection() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:1986:2: ( ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalModelDsl.g:1987:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalModelDsl.g:1987:2: ( ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalModelDsl.g:1988:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) ) otherlv_1= '<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalModelDsl.g:1988:3: ( ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) ) )
            // InternalModelDsl.g:1989:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            {
            // InternalModelDsl.g:1989:4: ( (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET ) )
            // InternalModelDsl.g:1990:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            {
            // InternalModelDsl.g:1990:5: (lv_collection_0_1= RULE_LIST | lv_collection_0_2= RULE_SET )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_LIST) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_SET) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalModelDsl.g:1991:6: lv_collection_0_1= RULE_LIST
                    {
                    lv_collection_0_1=(Token)match(input,RULE_LIST,FOLLOW_22); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_1,
                    							"uo.diesels.model.ModelDsl.LIST");
                    					

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:2006:6: lv_collection_0_2= RULE_SET
                    {
                    lv_collection_0_2=(Token)match(input,RULE_SET,FOLLOW_22); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getSimpleTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"collection",
                    							lv_collection_0_2,
                    							"uo.diesels.model.ModelDsl.SET");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1());
            		
            // InternalModelDsl.g:2027:3: ( (lv_type_2_0= ruleType ) )
            // InternalModelDsl.g:2028:4: (lv_type_2_0= ruleType )
            {
            // InternalModelDsl.g:2028:4: (lv_type_2_0= ruleType )
            // InternalModelDsl.g:2029:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSimpleTypeCollectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeCollectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"uo.diesels.model.ModelDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCollectionReturnType"
    // InternalModelDsl.g:2054:1: entryRuleCollectionReturnType returns [EObject current=null] : iv_ruleCollectionReturnType= ruleCollectionReturnType EOF ;
    public final EObject entryRuleCollectionReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionReturnType = null;


        try {
            // InternalModelDsl.g:2054:61: (iv_ruleCollectionReturnType= ruleCollectionReturnType EOF )
            // InternalModelDsl.g:2055:2: iv_ruleCollectionReturnType= ruleCollectionReturnType EOF
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
    // InternalModelDsl.g:2061:1: ruleCollectionReturnType returns [EObject current=null] : (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_SimpleTypeCollection_1= ruleSimpleTypeCollection ) ;
    public final EObject ruleCollectionReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_AllModelTypeCollection_0 = null;

        EObject this_SimpleTypeCollection_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:2067:2: ( (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_SimpleTypeCollection_1= ruleSimpleTypeCollection ) )
            // InternalModelDsl.g:2068:2: (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_SimpleTypeCollection_1= ruleSimpleTypeCollection )
            {
            // InternalModelDsl.g:2068:2: (this_AllModelTypeCollection_0= ruleAllModelTypeCollection | this_SimpleTypeCollection_1= ruleSimpleTypeCollection )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LIST) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==44) ) {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==RULE_ID) ) {
                        alt35=1;
                    }
                    else if ( ((LA35_3>=RULE_TYPE_INT && LA35_3<=RULE_DATE)) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==RULE_SET) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==44) ) {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==RULE_ID) ) {
                        alt35=1;
                    }
                    else if ( ((LA35_3>=RULE_TYPE_INT && LA35_3<=RULE_DATE)) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalModelDsl.g:2069:3: this_AllModelTypeCollection_0= ruleAllModelTypeCollection
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
                    // InternalModelDsl.g:2078:3: this_SimpleTypeCollection_1= ruleSimpleTypeCollection
                    {

                    			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getSimpleTypeCollectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTypeCollection_1=ruleSimpleTypeCollection();

                    state._fsp--;


                    			current = this_SimpleTypeCollection_1;
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


    // $ANTLR start "entryRuleSimpleReturnType"
    // InternalModelDsl.g:2090:1: entryRuleSimpleReturnType returns [String current=null] : iv_ruleSimpleReturnType= ruleSimpleReturnType EOF ;
    public final String entryRuleSimpleReturnType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleReturnType = null;


        try {
            // InternalModelDsl.g:2090:56: (iv_ruleSimpleReturnType= ruleSimpleReturnType EOF )
            // InternalModelDsl.g:2091:2: iv_ruleSimpleReturnType= ruleSimpleReturnType EOF
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
    // InternalModelDsl.g:2097:1: ruleSimpleReturnType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_0= ruleType | this_VOID_1= RULE_VOID ) ;
    public final AntlrDatatypeRuleToken ruleSimpleReturnType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VOID_1=null;
        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:2103:2: ( (this_Type_0= ruleType | this_VOID_1= RULE_VOID ) )
            // InternalModelDsl.g:2104:2: (this_Type_0= ruleType | this_VOID_1= RULE_VOID )
            {
            // InternalModelDsl.g:2104:2: (this_Type_0= ruleType | this_VOID_1= RULE_VOID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_TYPE_INT && LA36_0<=RULE_DATE)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_VOID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalModelDsl.g:2105:3: this_Type_0= ruleType
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
                    // InternalModelDsl.g:2116:3: this_VOID_1= RULE_VOID
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
    // InternalModelDsl.g:2127:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalModelDsl.g:2127:44: (iv_ruleType= ruleType EOF )
            // InternalModelDsl.g:2128:2: iv_ruleType= ruleType EOF
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
    // InternalModelDsl.g:2134:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_ComplexType_1 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:2140:2: ( (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType ) )
            // InternalModelDsl.g:2141:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            {
            // InternalModelDsl.g:2141:2: (this_BasicType_0= ruleBasicType | this_ComplexType_1= ruleComplexType )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_TYPE_INT && LA37_0<=RULE_TYPE_BOOLEAN)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_DATE) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalModelDsl.g:2142:3: this_BasicType_0= ruleBasicType
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
                    // InternalModelDsl.g:2153:3: this_ComplexType_1= ruleComplexType
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
    // InternalModelDsl.g:2167:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalModelDsl.g:2167:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalModelDsl.g:2168:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalModelDsl.g:2174:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN ) ;
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
            // InternalModelDsl.g:2180:2: ( (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN ) )
            // InternalModelDsl.g:2181:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN )
            {
            // InternalModelDsl.g:2181:2: (this_TYPE_INT_0= RULE_TYPE_INT | this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE | this_TYPE_FLOAT_2= RULE_TYPE_FLOAT | this_TYPE_LONG_3= RULE_TYPE_LONG | this_TYPE_CHAR_4= RULE_TYPE_CHAR | this_TYPE_STRING_5= RULE_TYPE_STRING | this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN )
            int alt38=7;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
                {
                alt38=1;
                }
                break;
            case RULE_TYPE_DOUBLE:
                {
                alt38=2;
                }
                break;
            case RULE_TYPE_FLOAT:
                {
                alt38=3;
                }
                break;
            case RULE_TYPE_LONG:
                {
                alt38=4;
                }
                break;
            case RULE_TYPE_CHAR:
                {
                alt38=5;
                }
                break;
            case RULE_TYPE_STRING:
                {
                alt38=6;
                }
                break;
            case RULE_TYPE_BOOLEAN:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalModelDsl.g:2182:3: this_TYPE_INT_0= RULE_TYPE_INT
                    {
                    this_TYPE_INT_0=(Token)match(input,RULE_TYPE_INT,FOLLOW_2); 

                    			current.merge(this_TYPE_INT_0);
                    		

                    			newLeafNode(this_TYPE_INT_0, grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:2190:3: this_TYPE_DOUBLE_1= RULE_TYPE_DOUBLE
                    {
                    this_TYPE_DOUBLE_1=(Token)match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_TYPE_DOUBLE_1);
                    		

                    			newLeafNode(this_TYPE_DOUBLE_1, grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:2198:3: this_TYPE_FLOAT_2= RULE_TYPE_FLOAT
                    {
                    this_TYPE_FLOAT_2=(Token)match(input,RULE_TYPE_FLOAT,FOLLOW_2); 

                    			current.merge(this_TYPE_FLOAT_2);
                    		

                    			newLeafNode(this_TYPE_FLOAT_2, grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelDsl.g:2206:3: this_TYPE_LONG_3= RULE_TYPE_LONG
                    {
                    this_TYPE_LONG_3=(Token)match(input,RULE_TYPE_LONG,FOLLOW_2); 

                    			current.merge(this_TYPE_LONG_3);
                    		

                    			newLeafNode(this_TYPE_LONG_3, grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalModelDsl.g:2214:3: this_TYPE_CHAR_4= RULE_TYPE_CHAR
                    {
                    this_TYPE_CHAR_4=(Token)match(input,RULE_TYPE_CHAR,FOLLOW_2); 

                    			current.merge(this_TYPE_CHAR_4);
                    		

                    			newLeafNode(this_TYPE_CHAR_4, grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalModelDsl.g:2222:3: this_TYPE_STRING_5= RULE_TYPE_STRING
                    {
                    this_TYPE_STRING_5=(Token)match(input,RULE_TYPE_STRING,FOLLOW_2); 

                    			current.merge(this_TYPE_STRING_5);
                    		

                    			newLeafNode(this_TYPE_STRING_5, grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalModelDsl.g:2230:3: this_TYPE_BOOLEAN_6= RULE_TYPE_BOOLEAN
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
    // InternalModelDsl.g:2241:1: entryRuleComplexType returns [String current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final String entryRuleComplexType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexType = null;


        try {
            // InternalModelDsl.g:2241:51: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalModelDsl.g:2242:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalModelDsl.g:2248:1: ruleComplexType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleComplexType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalModelDsl.g:2254:2: (this_DATE_0= RULE_DATE )
            // InternalModelDsl.g:2255:2: this_DATE_0= RULE_DATE
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


    // $ANTLR start "entryRuleMultiplicity"
    // InternalModelDsl.g:2265:1: entryRuleMultiplicity returns [String current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final String entryRuleMultiplicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicity = null;


        try {
            // InternalModelDsl.g:2265:52: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalModelDsl.g:2266:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity.getText(); 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalModelDsl.g:2272:1: ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ONE_0= RULE_ONE | this_MANY_1= RULE_MANY | this_ONE_ONE_2= RULE_ONE_ONE ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ONE_0=null;
        Token this_MANY_1=null;
        Token this_ONE_ONE_2=null;


        	enterRule();

        try {
            // InternalModelDsl.g:2278:2: ( (this_ONE_0= RULE_ONE | this_MANY_1= RULE_MANY | this_ONE_ONE_2= RULE_ONE_ONE ) )
            // InternalModelDsl.g:2279:2: (this_ONE_0= RULE_ONE | this_MANY_1= RULE_MANY | this_ONE_ONE_2= RULE_ONE_ONE )
            {
            // InternalModelDsl.g:2279:2: (this_ONE_0= RULE_ONE | this_MANY_1= RULE_MANY | this_ONE_ONE_2= RULE_ONE_ONE )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ONE:
                {
                alt39=1;
                }
                break;
            case RULE_MANY:
                {
                alt39=2;
                }
                break;
            case RULE_ONE_ONE:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalModelDsl.g:2280:3: this_ONE_0= RULE_ONE
                    {
                    this_ONE_0=(Token)match(input,RULE_ONE,FOLLOW_2); 

                    			current.merge(this_ONE_0);
                    		

                    			newLeafNode(this_ONE_0, grammarAccess.getMultiplicityAccess().getONETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:2288:3: this_MANY_1= RULE_MANY
                    {
                    this_MANY_1=(Token)match(input,RULE_MANY,FOLLOW_2); 

                    			current.merge(this_MANY_1);
                    		

                    			newLeafNode(this_MANY_1, grammarAccess.getMultiplicityAccess().getMANYTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:2296:3: this_ONE_ONE_2= RULE_ONE_ONE
                    {
                    this_ONE_ONE_2=(Token)match(input,RULE_ONE_ONE,FOLLOW_2); 

                    			current.merge(this_ONE_ONE_2);
                    		

                    			newLeafNode(this_ONE_ONE_2, grammarAccess.getMultiplicityAccess().getONE_ONETerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleMultiplicity"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\12\4\2\uffff\2\4";
    static final String dfa_3s = "\1\50\11\4\2\uffff\2\51";
    static final String dfa_4s = "\12\uffff\1\2\1\1\2\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\1\uffff\3\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\15\uffff\1\12\11\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\15",
            "",
            "",
            "\1\12\1\uffff\13\12\15\uffff\1\12\6\uffff\2\12\1\13\1\uffff\1\12",
            "\1\12\1\uffff\13\12\15\uffff\1\12\6\uffff\2\12\1\13\1\uffff\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 318:3: ( (lv_attributesId_6_0= ruleDefIdAttribute ) )*";
        }
    }
    static final String dfa_7s = "\36\uffff";
    static final String dfa_8s = "\11\4\1\uffff\2\54\4\4\1\uffff\11\55\4\4";
    static final String dfa_9s = "\1\36\10\4\1\uffff\2\54\1\4\1\51\1\20\1\51\1\uffff\11\55\2\4\2\51";
    static final String dfa_10s = "\11\uffff\1\2\6\uffff\1\1\15\uffff";
    static final String dfa_11s = "\36\uffff}>";
    static final String[] dfa_12s = {
            "\1\14\1\uffff\1\12\1\13\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\15\uffff\1\11",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20\1\uffff\13\20\15\uffff\1\20\6\uffff\2\20\2\uffff\1\11",
            "\1\31\4\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\20\1\uffff\13\20\15\uffff\1\20\6\uffff\2\20\2\uffff\1\11",
            "",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\20\1\uffff\13\20\15\uffff\1\20\12\uffff\1\11",
            "\1\20\1\uffff\13\20\15\uffff\1\20\12\uffff\1\11"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 337:3: ( (lv_attributes_7_0= ruleDefAttribute ) )*";
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 462:3: ( (lv_attributes_5_0= ruleDefAttribute ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000784000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001004001FFD0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000004001FFD0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001FED0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000004001FED0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000008000001FED0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000001FE00L});

}