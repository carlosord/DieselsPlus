package uo.diesels.model.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uo.diesels.model.services.ModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_LIST", "RULE_SET", "RULE_VOID", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_TYPE_BINARY", "RULE_ONE", "RULE_MANY", "RULE_ONE_ONE", "RULE_ID", "RULE_ENUMERATE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'navigable'", "'non-navigable'", "'nullable'", "'non-nullable'", "'Entity'", "'{'", "'}'", "'extends'", "'EntityLink'", "'ValueType'", "'Enumerable'", "'Link'", "'id'", "'Link.'", "'('", "')'", "','", "'<'", "'>'", "'abstract'"
    };
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


        public InternalModelDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModelDsl.g"; }


    	private ModelDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ModelDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalModelDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalModelDsl.g:54:1: ( ruleModel EOF )
            // InternalModelDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalModelDsl.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalModelDsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalModelDsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalModelDsl.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalModelDsl.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31||(LA1_0>=35 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModelDsl.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalModelDsl.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalModelDsl.g:79:1: ( ruleElement EOF )
            // InternalModelDsl.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalModelDsl.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalModelDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalModelDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalModelDsl.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalModelDsl.g:94:3: ( rule__Element__Alternatives )
            // InternalModelDsl.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAllModelType"
    // InternalModelDsl.g:103:1: entryRuleAllModelType : ruleAllModelType EOF ;
    public final void entryRuleAllModelType() throws RecognitionException {
        try {
            // InternalModelDsl.g:104:1: ( ruleAllModelType EOF )
            // InternalModelDsl.g:105:1: ruleAllModelType EOF
            {
             before(grammarAccess.getAllModelTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAllModelType();

            state._fsp--;

             after(grammarAccess.getAllModelTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllModelType"


    // $ANTLR start "ruleAllModelType"
    // InternalModelDsl.g:112:1: ruleAllModelType : ( ( rule__AllModelType__Alternatives ) ) ;
    public final void ruleAllModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:116:2: ( ( ( rule__AllModelType__Alternatives ) ) )
            // InternalModelDsl.g:117:2: ( ( rule__AllModelType__Alternatives ) )
            {
            // InternalModelDsl.g:117:2: ( ( rule__AllModelType__Alternatives ) )
            // InternalModelDsl.g:118:3: ( rule__AllModelType__Alternatives )
            {
             before(grammarAccess.getAllModelTypeAccess().getAlternatives()); 
            // InternalModelDsl.g:119:3: ( rule__AllModelType__Alternatives )
            // InternalModelDsl.g:119:4: rule__AllModelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllModelType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllModelTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllModelType"


    // $ANTLR start "entryRuleEntity"
    // InternalModelDsl.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalModelDsl.g:129:1: ( ruleEntity EOF )
            // InternalModelDsl.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalModelDsl.g:137:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:141:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalModelDsl.g:142:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalModelDsl.g:142:2: ( ( rule__Entity__Alternatives ) )
            // InternalModelDsl.g:143:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalModelDsl.g:144:3: ( rule__Entity__Alternatives )
            // InternalModelDsl.g:144:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleModelType"
    // InternalModelDsl.g:153:1: entryRuleModelType : ruleModelType EOF ;
    public final void entryRuleModelType() throws RecognitionException {
        try {
            // InternalModelDsl.g:154:1: ( ruleModelType EOF )
            // InternalModelDsl.g:155:1: ruleModelType EOF
            {
             before(grammarAccess.getModelTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleModelType();

            state._fsp--;

             after(grammarAccess.getModelTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // InternalModelDsl.g:162:1: ruleModelType : ( ( rule__ModelType__Alternatives ) ) ;
    public final void ruleModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:166:2: ( ( ( rule__ModelType__Alternatives ) ) )
            // InternalModelDsl.g:167:2: ( ( rule__ModelType__Alternatives ) )
            {
            // InternalModelDsl.g:167:2: ( ( rule__ModelType__Alternatives ) )
            // InternalModelDsl.g:168:3: ( rule__ModelType__Alternatives )
            {
             before(grammarAccess.getModelTypeAccess().getAlternatives()); 
            // InternalModelDsl.g:169:3: ( rule__ModelType__Alternatives )
            // InternalModelDsl.g:169:4: rule__ModelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelType"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalModelDsl.g:178:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalModelDsl.g:179:1: ( ruleSimpleEntity EOF )
            // InternalModelDsl.g:180:1: ruleSimpleEntity EOF
            {
             before(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleEntity();

            state._fsp--;

             after(grammarAccess.getSimpleEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalModelDsl.g:187:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:191:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalModelDsl.g:192:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalModelDsl.g:192:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalModelDsl.g:193:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalModelDsl.g:194:3: ( rule__SimpleEntity__Group__0 )
            // InternalModelDsl.g:194:4: rule__SimpleEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleAssociativeEntity"
    // InternalModelDsl.g:203:1: entryRuleAssociativeEntity : ruleAssociativeEntity EOF ;
    public final void entryRuleAssociativeEntity() throws RecognitionException {
        try {
            // InternalModelDsl.g:204:1: ( ruleAssociativeEntity EOF )
            // InternalModelDsl.g:205:1: ruleAssociativeEntity EOF
            {
             before(grammarAccess.getAssociativeEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociativeEntity();

            state._fsp--;

             after(grammarAccess.getAssociativeEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociativeEntity"


    // $ANTLR start "ruleAssociativeEntity"
    // InternalModelDsl.g:212:1: ruleAssociativeEntity : ( ( rule__AssociativeEntity__Group__0 ) ) ;
    public final void ruleAssociativeEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:216:2: ( ( ( rule__AssociativeEntity__Group__0 ) ) )
            // InternalModelDsl.g:217:2: ( ( rule__AssociativeEntity__Group__0 ) )
            {
            // InternalModelDsl.g:217:2: ( ( rule__AssociativeEntity__Group__0 ) )
            // InternalModelDsl.g:218:3: ( rule__AssociativeEntity__Group__0 )
            {
             before(grammarAccess.getAssociativeEntityAccess().getGroup()); 
            // InternalModelDsl.g:219:3: ( rule__AssociativeEntity__Group__0 )
            // InternalModelDsl.g:219:4: rule__AssociativeEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociativeEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociativeEntity"


    // $ANTLR start "entryRuleValueType"
    // InternalModelDsl.g:228:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalModelDsl.g:229:1: ( ruleValueType EOF )
            // InternalModelDsl.g:230:1: ruleValueType EOF
            {
             before(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalModelDsl.g:237:1: ruleValueType : ( ( rule__ValueType__Group__0 ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:241:2: ( ( ( rule__ValueType__Group__0 ) ) )
            // InternalModelDsl.g:242:2: ( ( rule__ValueType__Group__0 ) )
            {
            // InternalModelDsl.g:242:2: ( ( rule__ValueType__Group__0 ) )
            // InternalModelDsl.g:243:3: ( rule__ValueType__Group__0 )
            {
             before(grammarAccess.getValueTypeAccess().getGroup()); 
            // InternalModelDsl.g:244:3: ( rule__ValueType__Group__0 )
            // InternalModelDsl.g:244:4: rule__ValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleEnumerable"
    // InternalModelDsl.g:253:1: entryRuleEnumerable : ruleEnumerable EOF ;
    public final void entryRuleEnumerable() throws RecognitionException {
        try {
            // InternalModelDsl.g:254:1: ( ruleEnumerable EOF )
            // InternalModelDsl.g:255:1: ruleEnumerable EOF
            {
             before(grammarAccess.getEnumerableRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerable();

            state._fsp--;

             after(grammarAccess.getEnumerableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerable"


    // $ANTLR start "ruleEnumerable"
    // InternalModelDsl.g:262:1: ruleEnumerable : ( ( rule__Enumerable__Group__0 ) ) ;
    public final void ruleEnumerable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:266:2: ( ( ( rule__Enumerable__Group__0 ) ) )
            // InternalModelDsl.g:267:2: ( ( rule__Enumerable__Group__0 ) )
            {
            // InternalModelDsl.g:267:2: ( ( rule__Enumerable__Group__0 ) )
            // InternalModelDsl.g:268:3: ( rule__Enumerable__Group__0 )
            {
             before(grammarAccess.getEnumerableAccess().getGroup()); 
            // InternalModelDsl.g:269:3: ( rule__Enumerable__Group__0 )
            // InternalModelDsl.g:269:4: rule__Enumerable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumerable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerable"


    // $ANTLR start "entryRuleSimpleLink"
    // InternalModelDsl.g:278:1: entryRuleSimpleLink : ruleSimpleLink EOF ;
    public final void entryRuleSimpleLink() throws RecognitionException {
        try {
            // InternalModelDsl.g:279:1: ( ruleSimpleLink EOF )
            // InternalModelDsl.g:280:1: ruleSimpleLink EOF
            {
             before(grammarAccess.getSimpleLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleLink();

            state._fsp--;

             after(grammarAccess.getSimpleLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleLink"


    // $ANTLR start "ruleSimpleLink"
    // InternalModelDsl.g:287:1: ruleSimpleLink : ( ( rule__SimpleLink__Group__0 ) ) ;
    public final void ruleSimpleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:291:2: ( ( ( rule__SimpleLink__Group__0 ) ) )
            // InternalModelDsl.g:292:2: ( ( rule__SimpleLink__Group__0 ) )
            {
            // InternalModelDsl.g:292:2: ( ( rule__SimpleLink__Group__0 ) )
            // InternalModelDsl.g:293:3: ( rule__SimpleLink__Group__0 )
            {
             before(grammarAccess.getSimpleLinkAccess().getGroup()); 
            // InternalModelDsl.g:294:3: ( rule__SimpleLink__Group__0 )
            // InternalModelDsl.g:294:4: rule__SimpleLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleLink"


    // $ANTLR start "entryRuleRelation"
    // InternalModelDsl.g:303:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalModelDsl.g:304:1: ( ruleRelation EOF )
            // InternalModelDsl.g:305:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalModelDsl.g:312:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:316:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalModelDsl.g:317:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalModelDsl.g:317:2: ( ( rule__Relation__Group__0 ) )
            // InternalModelDsl.g:318:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalModelDsl.g:319:3: ( rule__Relation__Group__0 )
            // InternalModelDsl.g:319:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleDefAttribute"
    // InternalModelDsl.g:328:1: entryRuleDefAttribute : ruleDefAttribute EOF ;
    public final void entryRuleDefAttribute() throws RecognitionException {
        try {
            // InternalModelDsl.g:329:1: ( ruleDefAttribute EOF )
            // InternalModelDsl.g:330:1: ruleDefAttribute EOF
            {
             before(grammarAccess.getDefAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefAttribute();

            state._fsp--;

             after(grammarAccess.getDefAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefAttribute"


    // $ANTLR start "ruleDefAttribute"
    // InternalModelDsl.g:337:1: ruleDefAttribute : ( ( rule__DefAttribute__Alternatives ) ) ;
    public final void ruleDefAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:341:2: ( ( ( rule__DefAttribute__Alternatives ) ) )
            // InternalModelDsl.g:342:2: ( ( rule__DefAttribute__Alternatives ) )
            {
            // InternalModelDsl.g:342:2: ( ( rule__DefAttribute__Alternatives ) )
            // InternalModelDsl.g:343:3: ( rule__DefAttribute__Alternatives )
            {
             before(grammarAccess.getDefAttributeAccess().getAlternatives()); 
            // InternalModelDsl.g:344:3: ( rule__DefAttribute__Alternatives )
            // InternalModelDsl.g:344:4: rule__DefAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefAttribute"


    // $ANTLR start "entryRuleDefVariable"
    // InternalModelDsl.g:353:1: entryRuleDefVariable : ruleDefVariable EOF ;
    public final void entryRuleDefVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:354:1: ( ruleDefVariable EOF )
            // InternalModelDsl.g:355:1: ruleDefVariable EOF
            {
             before(grammarAccess.getDefVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getDefVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefVariable"


    // $ANTLR start "ruleDefVariable"
    // InternalModelDsl.g:362:1: ruleDefVariable : ( ( rule__DefVariable__Alternatives ) ) ;
    public final void ruleDefVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:366:2: ( ( ( rule__DefVariable__Alternatives ) ) )
            // InternalModelDsl.g:367:2: ( ( rule__DefVariable__Alternatives ) )
            {
            // InternalModelDsl.g:367:2: ( ( rule__DefVariable__Alternatives ) )
            // InternalModelDsl.g:368:3: ( rule__DefVariable__Alternatives )
            {
             before(grammarAccess.getDefVariableAccess().getAlternatives()); 
            // InternalModelDsl.g:369:3: ( rule__DefVariable__Alternatives )
            // InternalModelDsl.g:369:4: rule__DefVariable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefVariable"


    // $ANTLR start "entryRuleDefIdAttribute"
    // InternalModelDsl.g:378:1: entryRuleDefIdAttribute : ruleDefIdAttribute EOF ;
    public final void entryRuleDefIdAttribute() throws RecognitionException {
        try {
            // InternalModelDsl.g:379:1: ( ruleDefIdAttribute EOF )
            // InternalModelDsl.g:380:1: ruleDefIdAttribute EOF
            {
             before(grammarAccess.getDefIdAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefIdAttribute();

            state._fsp--;

             after(grammarAccess.getDefIdAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefIdAttribute"


    // $ANTLR start "ruleDefIdAttribute"
    // InternalModelDsl.g:387:1: ruleDefIdAttribute : ( ( rule__DefIdAttribute__Group__0 ) ) ;
    public final void ruleDefIdAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:391:2: ( ( ( rule__DefIdAttribute__Group__0 ) ) )
            // InternalModelDsl.g:392:2: ( ( rule__DefIdAttribute__Group__0 ) )
            {
            // InternalModelDsl.g:392:2: ( ( rule__DefIdAttribute__Group__0 ) )
            // InternalModelDsl.g:393:3: ( rule__DefIdAttribute__Group__0 )
            {
             before(grammarAccess.getDefIdAttributeAccess().getGroup()); 
            // InternalModelDsl.g:394:3: ( rule__DefIdAttribute__Group__0 )
            // InternalModelDsl.g:394:4: rule__DefIdAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefIdAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefIdAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefIdAttribute"


    // $ANTLR start "entryRuleDefAllModelTypeVariable"
    // InternalModelDsl.g:403:1: entryRuleDefAllModelTypeVariable : ruleDefAllModelTypeVariable EOF ;
    public final void entryRuleDefAllModelTypeVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:404:1: ( ruleDefAllModelTypeVariable EOF )
            // InternalModelDsl.g:405:1: ruleDefAllModelTypeVariable EOF
            {
             before(grammarAccess.getDefAllModelTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefAllModelTypeVariable();

            state._fsp--;

             after(grammarAccess.getDefAllModelTypeVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefAllModelTypeVariable"


    // $ANTLR start "ruleDefAllModelTypeVariable"
    // InternalModelDsl.g:412:1: ruleDefAllModelTypeVariable : ( ( rule__DefAllModelTypeVariable__Group__0 ) ) ;
    public final void ruleDefAllModelTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:416:2: ( ( ( rule__DefAllModelTypeVariable__Group__0 ) ) )
            // InternalModelDsl.g:417:2: ( ( rule__DefAllModelTypeVariable__Group__0 ) )
            {
            // InternalModelDsl.g:417:2: ( ( rule__DefAllModelTypeVariable__Group__0 ) )
            // InternalModelDsl.g:418:3: ( rule__DefAllModelTypeVariable__Group__0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getGroup()); 
            // InternalModelDsl.g:419:3: ( rule__DefAllModelTypeVariable__Group__0 )
            // InternalModelDsl.g:419:4: rule__DefAllModelTypeVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefAllModelTypeVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefAllModelTypeVariable"


    // $ANTLR start "entryRuleDefSimpleVariable"
    // InternalModelDsl.g:428:1: entryRuleDefSimpleVariable : ruleDefSimpleVariable EOF ;
    public final void entryRuleDefSimpleVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:429:1: ( ruleDefSimpleVariable EOF )
            // InternalModelDsl.g:430:1: ruleDefSimpleVariable EOF
            {
             before(grammarAccess.getDefSimpleVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefSimpleVariable();

            state._fsp--;

             after(grammarAccess.getDefSimpleVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefSimpleVariable"


    // $ANTLR start "ruleDefSimpleVariable"
    // InternalModelDsl.g:437:1: ruleDefSimpleVariable : ( ( rule__DefSimpleVariable__Group__0 ) ) ;
    public final void ruleDefSimpleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:441:2: ( ( ( rule__DefSimpleVariable__Group__0 ) ) )
            // InternalModelDsl.g:442:2: ( ( rule__DefSimpleVariable__Group__0 ) )
            {
            // InternalModelDsl.g:442:2: ( ( rule__DefSimpleVariable__Group__0 ) )
            // InternalModelDsl.g:443:3: ( rule__DefSimpleVariable__Group__0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getGroup()); 
            // InternalModelDsl.g:444:3: ( rule__DefSimpleVariable__Group__0 )
            // InternalModelDsl.g:444:4: rule__DefSimpleVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefSimpleVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefSimpleVariable"


    // $ANTLR start "entryRuleDefModelTypeVariable"
    // InternalModelDsl.g:453:1: entryRuleDefModelTypeVariable : ruleDefModelTypeVariable EOF ;
    public final void entryRuleDefModelTypeVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:454:1: ( ruleDefModelTypeVariable EOF )
            // InternalModelDsl.g:455:1: ruleDefModelTypeVariable EOF
            {
             before(grammarAccess.getDefModelTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefModelTypeVariable();

            state._fsp--;

             after(grammarAccess.getDefModelTypeVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefModelTypeVariable"


    // $ANTLR start "ruleDefModelTypeVariable"
    // InternalModelDsl.g:462:1: ruleDefModelTypeVariable : ( ( rule__DefModelTypeVariable__Group__0 ) ) ;
    public final void ruleDefModelTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:466:2: ( ( ( rule__DefModelTypeVariable__Group__0 ) ) )
            // InternalModelDsl.g:467:2: ( ( rule__DefModelTypeVariable__Group__0 ) )
            {
            // InternalModelDsl.g:467:2: ( ( rule__DefModelTypeVariable__Group__0 ) )
            // InternalModelDsl.g:468:3: ( rule__DefModelTypeVariable__Group__0 )
            {
             before(grammarAccess.getDefModelTypeVariableAccess().getGroup()); 
            // InternalModelDsl.g:469:3: ( rule__DefModelTypeVariable__Group__0 )
            // InternalModelDsl.g:469:4: rule__DefModelTypeVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefModelTypeVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefModelTypeVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefModelTypeVariable"


    // $ANTLR start "entryRuleDefCollectionTypeAttribute"
    // InternalModelDsl.g:478:1: entryRuleDefCollectionTypeAttribute : ruleDefCollectionTypeAttribute EOF ;
    public final void entryRuleDefCollectionTypeAttribute() throws RecognitionException {
        try {
            // InternalModelDsl.g:479:1: ( ruleDefCollectionTypeAttribute EOF )
            // InternalModelDsl.g:480:1: ruleDefCollectionTypeAttribute EOF
            {
             before(grammarAccess.getDefCollectionTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefCollectionTypeAttribute();

            state._fsp--;

             after(grammarAccess.getDefCollectionTypeAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefCollectionTypeAttribute"


    // $ANTLR start "ruleDefCollectionTypeAttribute"
    // InternalModelDsl.g:487:1: ruleDefCollectionTypeAttribute : ( ( rule__DefCollectionTypeAttribute__Alternatives ) ) ;
    public final void ruleDefCollectionTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:491:2: ( ( ( rule__DefCollectionTypeAttribute__Alternatives ) ) )
            // InternalModelDsl.g:492:2: ( ( rule__DefCollectionTypeAttribute__Alternatives ) )
            {
            // InternalModelDsl.g:492:2: ( ( rule__DefCollectionTypeAttribute__Alternatives ) )
            // InternalModelDsl.g:493:3: ( rule__DefCollectionTypeAttribute__Alternatives )
            {
             before(grammarAccess.getDefCollectionTypeAttributeAccess().getAlternatives()); 
            // InternalModelDsl.g:494:3: ( rule__DefCollectionTypeAttribute__Alternatives )
            // InternalModelDsl.g:494:4: rule__DefCollectionTypeAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefCollectionTypeAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefCollectionTypeAttribute"


    // $ANTLR start "entryRuleDefCollectionTypeVariable"
    // InternalModelDsl.g:503:1: entryRuleDefCollectionTypeVariable : ruleDefCollectionTypeVariable EOF ;
    public final void entryRuleDefCollectionTypeVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:504:1: ( ruleDefCollectionTypeVariable EOF )
            // InternalModelDsl.g:505:1: ruleDefCollectionTypeVariable EOF
            {
             before(grammarAccess.getDefCollectionTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefCollectionTypeVariable();

            state._fsp--;

             after(grammarAccess.getDefCollectionTypeVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefCollectionTypeVariable"


    // $ANTLR start "ruleDefCollectionTypeVariable"
    // InternalModelDsl.g:512:1: ruleDefCollectionTypeVariable : ( ( rule__DefCollectionTypeVariable__Alternatives ) ) ;
    public final void ruleDefCollectionTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:516:2: ( ( ( rule__DefCollectionTypeVariable__Alternatives ) ) )
            // InternalModelDsl.g:517:2: ( ( rule__DefCollectionTypeVariable__Alternatives ) )
            {
            // InternalModelDsl.g:517:2: ( ( rule__DefCollectionTypeVariable__Alternatives ) )
            // InternalModelDsl.g:518:3: ( rule__DefCollectionTypeVariable__Alternatives )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getAlternatives()); 
            // InternalModelDsl.g:519:3: ( rule__DefCollectionTypeVariable__Alternatives )
            // InternalModelDsl.g:519:4: rule__DefCollectionTypeVariable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefCollectionTypeVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefCollectionTypeVariable"


    // $ANTLR start "entryRuleDefModelModelTypeCollectionVariable"
    // InternalModelDsl.g:528:1: entryRuleDefModelModelTypeCollectionVariable : ruleDefModelModelTypeCollectionVariable EOF ;
    public final void entryRuleDefModelModelTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:529:1: ( ruleDefModelModelTypeCollectionVariable EOF )
            // InternalModelDsl.g:530:1: ruleDefModelModelTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefModelModelTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefModelModelTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefModelModelTypeCollectionVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefModelModelTypeCollectionVariable"


    // $ANTLR start "ruleDefModelModelTypeCollectionVariable"
    // InternalModelDsl.g:537:1: ruleDefModelModelTypeCollectionVariable : ( ( rule__DefModelModelTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefModelModelTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:541:2: ( ( ( rule__DefModelModelTypeCollectionVariable__Group__0 ) ) )
            // InternalModelDsl.g:542:2: ( ( rule__DefModelModelTypeCollectionVariable__Group__0 ) )
            {
            // InternalModelDsl.g:542:2: ( ( rule__DefModelModelTypeCollectionVariable__Group__0 ) )
            // InternalModelDsl.g:543:3: ( rule__DefModelModelTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getGroup()); 
            // InternalModelDsl.g:544:3: ( rule__DefModelModelTypeCollectionVariable__Group__0 )
            // InternalModelDsl.g:544:4: rule__DefModelModelTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefModelModelTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefModelModelTypeCollectionVariable"


    // $ANTLR start "entryRuleDefModelSimpleTypeCollectionVariable"
    // InternalModelDsl.g:553:1: entryRuleDefModelSimpleTypeCollectionVariable : ruleDefModelSimpleTypeCollectionVariable EOF ;
    public final void entryRuleDefModelSimpleTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:554:1: ( ruleDefModelSimpleTypeCollectionVariable EOF )
            // InternalModelDsl.g:555:1: ruleDefModelSimpleTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefModelSimpleTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefModelSimpleTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefModelSimpleTypeCollectionVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefModelSimpleTypeCollectionVariable"


    // $ANTLR start "ruleDefModelSimpleTypeCollectionVariable"
    // InternalModelDsl.g:562:1: ruleDefModelSimpleTypeCollectionVariable : ( ( rule__DefModelSimpleTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefModelSimpleTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:566:2: ( ( ( rule__DefModelSimpleTypeCollectionVariable__Group__0 ) ) )
            // InternalModelDsl.g:567:2: ( ( rule__DefModelSimpleTypeCollectionVariable__Group__0 ) )
            {
            // InternalModelDsl.g:567:2: ( ( rule__DefModelSimpleTypeCollectionVariable__Group__0 ) )
            // InternalModelDsl.g:568:3: ( rule__DefModelSimpleTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getGroup()); 
            // InternalModelDsl.g:569:3: ( rule__DefModelSimpleTypeCollectionVariable__Group__0 )
            // InternalModelDsl.g:569:4: rule__DefModelSimpleTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefModelSimpleTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefModelSimpleTypeCollectionVariable"


    // $ANTLR start "entryRuleDefLinkVariable"
    // InternalModelDsl.g:578:1: entryRuleDefLinkVariable : ruleDefLinkVariable EOF ;
    public final void entryRuleDefLinkVariable() throws RecognitionException {
        try {
            // InternalModelDsl.g:579:1: ( ruleDefLinkVariable EOF )
            // InternalModelDsl.g:580:1: ruleDefLinkVariable EOF
            {
             before(grammarAccess.getDefLinkVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefLinkVariable();

            state._fsp--;

             after(grammarAccess.getDefLinkVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefLinkVariable"


    // $ANTLR start "ruleDefLinkVariable"
    // InternalModelDsl.g:587:1: ruleDefLinkVariable : ( ( rule__DefLinkVariable__Group__0 ) ) ;
    public final void ruleDefLinkVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:591:2: ( ( ( rule__DefLinkVariable__Group__0 ) ) )
            // InternalModelDsl.g:592:2: ( ( rule__DefLinkVariable__Group__0 ) )
            {
            // InternalModelDsl.g:592:2: ( ( rule__DefLinkVariable__Group__0 ) )
            // InternalModelDsl.g:593:3: ( rule__DefLinkVariable__Group__0 )
            {
             before(grammarAccess.getDefLinkVariableAccess().getGroup()); 
            // InternalModelDsl.g:594:3: ( rule__DefLinkVariable__Group__0 )
            // InternalModelDsl.g:594:4: rule__DefLinkVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefLinkVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefLinkVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefLinkVariable"


    // $ANTLR start "entryRuleMethod"
    // InternalModelDsl.g:603:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalModelDsl.g:604:1: ( ruleMethod EOF )
            // InternalModelDsl.g:605:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalModelDsl.g:612:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:616:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalModelDsl.g:617:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalModelDsl.g:617:2: ( ( rule__Method__Alternatives ) )
            // InternalModelDsl.g:618:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalModelDsl.g:619:3: ( rule__Method__Alternatives )
            // InternalModelDsl.g:619:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodSimpleReturn"
    // InternalModelDsl.g:628:1: entryRuleMethodSimpleReturn : ruleMethodSimpleReturn EOF ;
    public final void entryRuleMethodSimpleReturn() throws RecognitionException {
        try {
            // InternalModelDsl.g:629:1: ( ruleMethodSimpleReturn EOF )
            // InternalModelDsl.g:630:1: ruleMethodSimpleReturn EOF
            {
             before(grammarAccess.getMethodSimpleReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodSimpleReturn();

            state._fsp--;

             after(grammarAccess.getMethodSimpleReturnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodSimpleReturn"


    // $ANTLR start "ruleMethodSimpleReturn"
    // InternalModelDsl.g:637:1: ruleMethodSimpleReturn : ( ( rule__MethodSimpleReturn__Group__0 ) ) ;
    public final void ruleMethodSimpleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:641:2: ( ( ( rule__MethodSimpleReturn__Group__0 ) ) )
            // InternalModelDsl.g:642:2: ( ( rule__MethodSimpleReturn__Group__0 ) )
            {
            // InternalModelDsl.g:642:2: ( ( rule__MethodSimpleReturn__Group__0 ) )
            // InternalModelDsl.g:643:3: ( rule__MethodSimpleReturn__Group__0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup()); 
            // InternalModelDsl.g:644:3: ( rule__MethodSimpleReturn__Group__0 )
            // InternalModelDsl.g:644:4: rule__MethodSimpleReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodSimpleReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodSimpleReturn"


    // $ANTLR start "entryRuleMethodCollectionReturn"
    // InternalModelDsl.g:653:1: entryRuleMethodCollectionReturn : ruleMethodCollectionReturn EOF ;
    public final void entryRuleMethodCollectionReturn() throws RecognitionException {
        try {
            // InternalModelDsl.g:654:1: ( ruleMethodCollectionReturn EOF )
            // InternalModelDsl.g:655:1: ruleMethodCollectionReturn EOF
            {
             before(grammarAccess.getMethodCollectionReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCollectionReturn();

            state._fsp--;

             after(grammarAccess.getMethodCollectionReturnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodCollectionReturn"


    // $ANTLR start "ruleMethodCollectionReturn"
    // InternalModelDsl.g:662:1: ruleMethodCollectionReturn : ( ( rule__MethodCollectionReturn__Group__0 ) ) ;
    public final void ruleMethodCollectionReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:666:2: ( ( ( rule__MethodCollectionReturn__Group__0 ) ) )
            // InternalModelDsl.g:667:2: ( ( rule__MethodCollectionReturn__Group__0 ) )
            {
            // InternalModelDsl.g:667:2: ( ( rule__MethodCollectionReturn__Group__0 ) )
            // InternalModelDsl.g:668:3: ( rule__MethodCollectionReturn__Group__0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup()); 
            // InternalModelDsl.g:669:3: ( rule__MethodCollectionReturn__Group__0 )
            // InternalModelDsl.g:669:4: rule__MethodCollectionReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCollectionReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCollectionReturn"


    // $ANTLR start "entryRuleMethodAllModelReturn"
    // InternalModelDsl.g:678:1: entryRuleMethodAllModelReturn : ruleMethodAllModelReturn EOF ;
    public final void entryRuleMethodAllModelReturn() throws RecognitionException {
        try {
            // InternalModelDsl.g:679:1: ( ruleMethodAllModelReturn EOF )
            // InternalModelDsl.g:680:1: ruleMethodAllModelReturn EOF
            {
             before(grammarAccess.getMethodAllModelReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodAllModelReturn();

            state._fsp--;

             after(grammarAccess.getMethodAllModelReturnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodAllModelReturn"


    // $ANTLR start "ruleMethodAllModelReturn"
    // InternalModelDsl.g:687:1: ruleMethodAllModelReturn : ( ( rule__MethodAllModelReturn__Group__0 ) ) ;
    public final void ruleMethodAllModelReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:691:2: ( ( ( rule__MethodAllModelReturn__Group__0 ) ) )
            // InternalModelDsl.g:692:2: ( ( rule__MethodAllModelReturn__Group__0 ) )
            {
            // InternalModelDsl.g:692:2: ( ( rule__MethodAllModelReturn__Group__0 ) )
            // InternalModelDsl.g:693:3: ( rule__MethodAllModelReturn__Group__0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup()); 
            // InternalModelDsl.g:694:3: ( rule__MethodAllModelReturn__Group__0 )
            // InternalModelDsl.g:694:4: rule__MethodAllModelReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAllModelReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodAllModelReturn"


    // $ANTLR start "entryRuleAllModelTypeCollection"
    // InternalModelDsl.g:703:1: entryRuleAllModelTypeCollection : ruleAllModelTypeCollection EOF ;
    public final void entryRuleAllModelTypeCollection() throws RecognitionException {
        try {
            // InternalModelDsl.g:704:1: ( ruleAllModelTypeCollection EOF )
            // InternalModelDsl.g:705:1: ruleAllModelTypeCollection EOF
            {
             before(grammarAccess.getAllModelTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleAllModelTypeCollection();

            state._fsp--;

             after(grammarAccess.getAllModelTypeCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllModelTypeCollection"


    // $ANTLR start "ruleAllModelTypeCollection"
    // InternalModelDsl.g:712:1: ruleAllModelTypeCollection : ( ( rule__AllModelTypeCollection__Group__0 ) ) ;
    public final void ruleAllModelTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:716:2: ( ( ( rule__AllModelTypeCollection__Group__0 ) ) )
            // InternalModelDsl.g:717:2: ( ( rule__AllModelTypeCollection__Group__0 ) )
            {
            // InternalModelDsl.g:717:2: ( ( rule__AllModelTypeCollection__Group__0 ) )
            // InternalModelDsl.g:718:3: ( rule__AllModelTypeCollection__Group__0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGroup()); 
            // InternalModelDsl.g:719:3: ( rule__AllModelTypeCollection__Group__0 )
            // InternalModelDsl.g:719:4: rule__AllModelTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllModelTypeCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllModelTypeCollection"


    // $ANTLR start "entryRuleModelTypeCollection"
    // InternalModelDsl.g:728:1: entryRuleModelTypeCollection : ruleModelTypeCollection EOF ;
    public final void entryRuleModelTypeCollection() throws RecognitionException {
        try {
            // InternalModelDsl.g:729:1: ( ruleModelTypeCollection EOF )
            // InternalModelDsl.g:730:1: ruleModelTypeCollection EOF
            {
             before(grammarAccess.getModelTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleModelTypeCollection();

            state._fsp--;

             after(grammarAccess.getModelTypeCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelTypeCollection"


    // $ANTLR start "ruleModelTypeCollection"
    // InternalModelDsl.g:737:1: ruleModelTypeCollection : ( ( rule__ModelTypeCollection__Group__0 ) ) ;
    public final void ruleModelTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:741:2: ( ( ( rule__ModelTypeCollection__Group__0 ) ) )
            // InternalModelDsl.g:742:2: ( ( rule__ModelTypeCollection__Group__0 ) )
            {
            // InternalModelDsl.g:742:2: ( ( rule__ModelTypeCollection__Group__0 ) )
            // InternalModelDsl.g:743:3: ( rule__ModelTypeCollection__Group__0 )
            {
             before(grammarAccess.getModelTypeCollectionAccess().getGroup()); 
            // InternalModelDsl.g:744:3: ( rule__ModelTypeCollection__Group__0 )
            // InternalModelDsl.g:744:4: rule__ModelTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelTypeCollection"


    // $ANTLR start "entryRuleSimpleTypeCollection"
    // InternalModelDsl.g:753:1: entryRuleSimpleTypeCollection : ruleSimpleTypeCollection EOF ;
    public final void entryRuleSimpleTypeCollection() throws RecognitionException {
        try {
            // InternalModelDsl.g:754:1: ( ruleSimpleTypeCollection EOF )
            // InternalModelDsl.g:755:1: ruleSimpleTypeCollection EOF
            {
             before(grammarAccess.getSimpleTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTypeCollection();

            state._fsp--;

             after(grammarAccess.getSimpleTypeCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleTypeCollection"


    // $ANTLR start "ruleSimpleTypeCollection"
    // InternalModelDsl.g:762:1: ruleSimpleTypeCollection : ( ( rule__SimpleTypeCollection__Group__0 ) ) ;
    public final void ruleSimpleTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:766:2: ( ( ( rule__SimpleTypeCollection__Group__0 ) ) )
            // InternalModelDsl.g:767:2: ( ( rule__SimpleTypeCollection__Group__0 ) )
            {
            // InternalModelDsl.g:767:2: ( ( rule__SimpleTypeCollection__Group__0 ) )
            // InternalModelDsl.g:768:3: ( rule__SimpleTypeCollection__Group__0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGroup()); 
            // InternalModelDsl.g:769:3: ( rule__SimpleTypeCollection__Group__0 )
            // InternalModelDsl.g:769:4: rule__SimpleTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTypeCollection"


    // $ANTLR start "entryRuleCollectionReturnType"
    // InternalModelDsl.g:778:1: entryRuleCollectionReturnType : ruleCollectionReturnType EOF ;
    public final void entryRuleCollectionReturnType() throws RecognitionException {
        try {
            // InternalModelDsl.g:779:1: ( ruleCollectionReturnType EOF )
            // InternalModelDsl.g:780:1: ruleCollectionReturnType EOF
            {
             before(grammarAccess.getCollectionReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionReturnType();

            state._fsp--;

             after(grammarAccess.getCollectionReturnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionReturnType"


    // $ANTLR start "ruleCollectionReturnType"
    // InternalModelDsl.g:787:1: ruleCollectionReturnType : ( ( rule__CollectionReturnType__Alternatives ) ) ;
    public final void ruleCollectionReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:791:2: ( ( ( rule__CollectionReturnType__Alternatives ) ) )
            // InternalModelDsl.g:792:2: ( ( rule__CollectionReturnType__Alternatives ) )
            {
            // InternalModelDsl.g:792:2: ( ( rule__CollectionReturnType__Alternatives ) )
            // InternalModelDsl.g:793:3: ( rule__CollectionReturnType__Alternatives )
            {
             before(grammarAccess.getCollectionReturnTypeAccess().getAlternatives()); 
            // InternalModelDsl.g:794:3: ( rule__CollectionReturnType__Alternatives )
            // InternalModelDsl.g:794:4: rule__CollectionReturnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollectionReturnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionReturnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionReturnType"


    // $ANTLR start "entryRuleSimpleReturnType"
    // InternalModelDsl.g:803:1: entryRuleSimpleReturnType : ruleSimpleReturnType EOF ;
    public final void entryRuleSimpleReturnType() throws RecognitionException {
        try {
            // InternalModelDsl.g:804:1: ( ruleSimpleReturnType EOF )
            // InternalModelDsl.g:805:1: ruleSimpleReturnType EOF
            {
             before(grammarAccess.getSimpleReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleReturnType();

            state._fsp--;

             after(grammarAccess.getSimpleReturnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleReturnType"


    // $ANTLR start "ruleSimpleReturnType"
    // InternalModelDsl.g:812:1: ruleSimpleReturnType : ( ( rule__SimpleReturnType__Alternatives ) ) ;
    public final void ruleSimpleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:816:2: ( ( ( rule__SimpleReturnType__Alternatives ) ) )
            // InternalModelDsl.g:817:2: ( ( rule__SimpleReturnType__Alternatives ) )
            {
            // InternalModelDsl.g:817:2: ( ( rule__SimpleReturnType__Alternatives ) )
            // InternalModelDsl.g:818:3: ( rule__SimpleReturnType__Alternatives )
            {
             before(grammarAccess.getSimpleReturnTypeAccess().getAlternatives()); 
            // InternalModelDsl.g:819:3: ( rule__SimpleReturnType__Alternatives )
            // InternalModelDsl.g:819:4: rule__SimpleReturnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleReturnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleReturnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleReturnType"


    // $ANTLR start "entryRuleType"
    // InternalModelDsl.g:828:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalModelDsl.g:829:1: ( ruleType EOF )
            // InternalModelDsl.g:830:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalModelDsl.g:837:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:841:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalModelDsl.g:842:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalModelDsl.g:842:2: ( ( rule__Type__Alternatives ) )
            // InternalModelDsl.g:843:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalModelDsl.g:844:3: ( rule__Type__Alternatives )
            // InternalModelDsl.g:844:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBasicType"
    // InternalModelDsl.g:853:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalModelDsl.g:854:1: ( ruleBasicType EOF )
            // InternalModelDsl.g:855:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalModelDsl.g:862:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:866:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalModelDsl.g:867:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalModelDsl.g:867:2: ( ( rule__BasicType__Alternatives ) )
            // InternalModelDsl.g:868:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalModelDsl.g:869:3: ( rule__BasicType__Alternatives )
            // InternalModelDsl.g:869:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleComplexType"
    // InternalModelDsl.g:878:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalModelDsl.g:879:1: ( ruleComplexType EOF )
            // InternalModelDsl.g:880:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalModelDsl.g:887:1: ruleComplexType : ( RULE_DATE ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:891:2: ( ( RULE_DATE ) )
            // InternalModelDsl.g:892:2: ( RULE_DATE )
            {
            // InternalModelDsl.g:892:2: ( RULE_DATE )
            // InternalModelDsl.g:893:3: RULE_DATE
            {
             before(grammarAccess.getComplexTypeAccess().getDATETerminalRuleCall()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getDATETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalModelDsl.g:903:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalModelDsl.g:904:1: ( ruleMultiplicity EOF )
            // InternalModelDsl.g:905:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalModelDsl.g:912:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:916:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalModelDsl.g:917:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalModelDsl.g:917:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalModelDsl.g:918:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalModelDsl.g:919:3: ( rule__Multiplicity__Alternatives )
            // InternalModelDsl.g:919:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalModelDsl.g:927:1: rule__Element__Alternatives : ( ( ruleAllModelType ) | ( ruleSimpleLink ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:931:1: ( ( ruleAllModelType ) | ( ruleSimpleLink ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31||(LA2_0>=35 && LA2_0<=37)) ) {
                alt2=1;
            }
            else if ( (LA2_0==38) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelDsl.g:932:2: ( ruleAllModelType )
                    {
                    // InternalModelDsl.g:932:2: ( ruleAllModelType )
                    // InternalModelDsl.g:933:3: ruleAllModelType
                    {
                     before(grammarAccess.getElementAccess().getAllModelTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllModelType();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAllModelTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:938:2: ( ruleSimpleLink )
                    {
                    // InternalModelDsl.g:938:2: ( ruleSimpleLink )
                    // InternalModelDsl.g:939:3: ruleSimpleLink
                    {
                     before(grammarAccess.getElementAccess().getSimpleLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleLink();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSimpleLinkParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__AllModelType__Alternatives"
    // InternalModelDsl.g:948:1: rule__AllModelType__Alternatives : ( ( ruleEntity ) | ( ruleModelType ) );
    public final void rule__AllModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:952:1: ( ( ruleEntity ) | ( ruleModelType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31||LA3_0==35) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=36 && LA3_0<=37)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelDsl.g:953:2: ( ruleEntity )
                    {
                    // InternalModelDsl.g:953:2: ( ruleEntity )
                    // InternalModelDsl.g:954:3: ruleEntity
                    {
                     before(grammarAccess.getAllModelTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAllModelTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:959:2: ( ruleModelType )
                    {
                    // InternalModelDsl.g:959:2: ( ruleModelType )
                    // InternalModelDsl.g:960:3: ruleModelType
                    {
                     before(grammarAccess.getAllModelTypeAccess().getModelTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModelType();

                    state._fsp--;

                     after(grammarAccess.getAllModelTypeAccess().getModelTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelType__Alternatives"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalModelDsl.g:969:1: rule__Entity__Alternatives : ( ( ruleSimpleEntity ) | ( ruleAssociativeEntity ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:973:1: ( ( ruleSimpleEntity ) | ( ruleAssociativeEntity ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalModelDsl.g:974:2: ( ruleSimpleEntity )
                    {
                    // InternalModelDsl.g:974:2: ( ruleSimpleEntity )
                    // InternalModelDsl.g:975:3: ruleSimpleEntity
                    {
                     before(grammarAccess.getEntityAccess().getSimpleEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleEntity();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getSimpleEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:980:2: ( ruleAssociativeEntity )
                    {
                    // InternalModelDsl.g:980:2: ( ruleAssociativeEntity )
                    // InternalModelDsl.g:981:3: ruleAssociativeEntity
                    {
                     before(grammarAccess.getEntityAccess().getAssociativeEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociativeEntity();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getAssociativeEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__ModelType__Alternatives"
    // InternalModelDsl.g:990:1: rule__ModelType__Alternatives : ( ( ruleEnumerable ) | ( ruleValueType ) );
    public final void rule__ModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:994:1: ( ( ruleEnumerable ) | ( ruleValueType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelDsl.g:995:2: ( ruleEnumerable )
                    {
                    // InternalModelDsl.g:995:2: ( ruleEnumerable )
                    // InternalModelDsl.g:996:3: ruleEnumerable
                    {
                     before(grammarAccess.getModelTypeAccess().getEnumerableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerable();

                    state._fsp--;

                     after(grammarAccess.getModelTypeAccess().getEnumerableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1001:2: ( ruleValueType )
                    {
                    // InternalModelDsl.g:1001:2: ( ruleValueType )
                    // InternalModelDsl.g:1002:3: ruleValueType
                    {
                     before(grammarAccess.getModelTypeAccess().getValueTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getModelTypeAccess().getValueTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Alternatives"


    // $ANTLR start "rule__Relation__NavigableAlternatives_3_0"
    // InternalModelDsl.g:1011:1: rule__Relation__NavigableAlternatives_3_0 : ( ( 'navigable' ) | ( 'non-navigable' ) );
    public final void rule__Relation__NavigableAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1015:1: ( ( 'navigable' ) | ( 'non-navigable' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelDsl.g:1016:2: ( 'navigable' )
                    {
                    // InternalModelDsl.g:1016:2: ( 'navigable' )
                    // InternalModelDsl.g:1017:3: 'navigable'
                    {
                     before(grammarAccess.getRelationAccess().getNavigableNavigableKeyword_3_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getNavigableNavigableKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1022:2: ( 'non-navigable' )
                    {
                    // InternalModelDsl.g:1022:2: ( 'non-navigable' )
                    // InternalModelDsl.g:1023:3: 'non-navigable'
                    {
                     before(grammarAccess.getRelationAccess().getNavigableNonNavigableKeyword_3_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getNavigableNonNavigableKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NavigableAlternatives_3_0"


    // $ANTLR start "rule__DefAttribute__Alternatives"
    // InternalModelDsl.g:1032:1: rule__DefAttribute__Alternatives : ( ( ( rule__DefAttribute__Group_0__0 ) ) | ( ruleDefCollectionTypeAttribute ) );
    public final void rule__DefAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1036:1: ( ( ( rule__DefAttribute__Group_0__0 ) ) | ( ruleDefCollectionTypeAttribute ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DATE||(LA7_0>=RULE_TYPE_INT && LA7_0<=RULE_TYPE_BINARY)||LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_LIST && LA7_0<=RULE_SET)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelDsl.g:1037:2: ( ( rule__DefAttribute__Group_0__0 ) )
                    {
                    // InternalModelDsl.g:1037:2: ( ( rule__DefAttribute__Group_0__0 ) )
                    // InternalModelDsl.g:1038:3: ( rule__DefAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getDefAttributeAccess().getGroup_0()); 
                    // InternalModelDsl.g:1039:3: ( rule__DefAttribute__Group_0__0 )
                    // InternalModelDsl.g:1039:4: rule__DefAttribute__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefAttribute__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefAttributeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1043:2: ( ruleDefCollectionTypeAttribute )
                    {
                    // InternalModelDsl.g:1043:2: ( ruleDefCollectionTypeAttribute )
                    // InternalModelDsl.g:1044:3: ruleDefCollectionTypeAttribute
                    {
                     before(grammarAccess.getDefAttributeAccess().getDefCollectionTypeAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefCollectionTypeAttribute();

                    state._fsp--;

                     after(grammarAccess.getDefAttributeAccess().getDefCollectionTypeAttributeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__Alternatives"


    // $ANTLR start "rule__DefAttribute__Alternatives_0_0"
    // InternalModelDsl.g:1053:1: rule__DefAttribute__Alternatives_0_0 : ( ( ruleDefSimpleVariable ) | ( ruleDefModelTypeVariable ) );
    public final void rule__DefAttribute__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1057:1: ( ( ruleDefSimpleVariable ) | ( ruleDefModelTypeVariable ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DATE||(LA8_0>=RULE_TYPE_INT && LA8_0<=RULE_TYPE_BINARY)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalModelDsl.g:1058:2: ( ruleDefSimpleVariable )
                    {
                    // InternalModelDsl.g:1058:2: ( ruleDefSimpleVariable )
                    // InternalModelDsl.g:1059:3: ruleDefSimpleVariable
                    {
                     before(grammarAccess.getDefAttributeAccess().getDefSimpleVariableParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefSimpleVariable();

                    state._fsp--;

                     after(grammarAccess.getDefAttributeAccess().getDefSimpleVariableParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1064:2: ( ruleDefModelTypeVariable )
                    {
                    // InternalModelDsl.g:1064:2: ( ruleDefModelTypeVariable )
                    // InternalModelDsl.g:1065:3: ruleDefModelTypeVariable
                    {
                     before(grammarAccess.getDefAttributeAccess().getDefModelTypeVariableParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefModelTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefAttributeAccess().getDefModelTypeVariableParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__Alternatives_0_0"


    // $ANTLR start "rule__DefAttribute__NullableAlternatives_0_1_0"
    // InternalModelDsl.g:1074:1: rule__DefAttribute__NullableAlternatives_0_1_0 : ( ( 'nullable' ) | ( 'non-nullable' ) );
    public final void rule__DefAttribute__NullableAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1078:1: ( ( 'nullable' ) | ( 'non-nullable' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalModelDsl.g:1079:2: ( 'nullable' )
                    {
                    // InternalModelDsl.g:1079:2: ( 'nullable' )
                    // InternalModelDsl.g:1080:3: 'nullable'
                    {
                     before(grammarAccess.getDefAttributeAccess().getNullableNullableKeyword_0_1_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDefAttributeAccess().getNullableNullableKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1085:2: ( 'non-nullable' )
                    {
                    // InternalModelDsl.g:1085:2: ( 'non-nullable' )
                    // InternalModelDsl.g:1086:3: 'non-nullable'
                    {
                     before(grammarAccess.getDefAttributeAccess().getNullableNonNullableKeyword_0_1_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getDefAttributeAccess().getNullableNonNullableKeyword_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__NullableAlternatives_0_1_0"


    // $ANTLR start "rule__DefVariable__Alternatives"
    // InternalModelDsl.g:1095:1: rule__DefVariable__Alternatives : ( ( ruleDefSimpleVariable ) | ( ruleDefAllModelTypeVariable ) | ( ruleDefCollectionTypeVariable ) );
    public final void rule__DefVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1099:1: ( ( ruleDefSimpleVariable ) | ( ruleDefAllModelTypeVariable ) | ( ruleDefCollectionTypeVariable ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_TYPE_BINARY:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalModelDsl.g:1100:2: ( ruleDefSimpleVariable )
                    {
                    // InternalModelDsl.g:1100:2: ( ruleDefSimpleVariable )
                    // InternalModelDsl.g:1101:3: ruleDefSimpleVariable
                    {
                     before(grammarAccess.getDefVariableAccess().getDefSimpleVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefSimpleVariable();

                    state._fsp--;

                     after(grammarAccess.getDefVariableAccess().getDefSimpleVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1106:2: ( ruleDefAllModelTypeVariable )
                    {
                    // InternalModelDsl.g:1106:2: ( ruleDefAllModelTypeVariable )
                    // InternalModelDsl.g:1107:3: ruleDefAllModelTypeVariable
                    {
                     before(grammarAccess.getDefVariableAccess().getDefAllModelTypeVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefAllModelTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefVariableAccess().getDefAllModelTypeVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:1112:2: ( ruleDefCollectionTypeVariable )
                    {
                    // InternalModelDsl.g:1112:2: ( ruleDefCollectionTypeVariable )
                    // InternalModelDsl.g:1113:3: ruleDefCollectionTypeVariable
                    {
                     before(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefCollectionTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefVariable__Alternatives"


    // $ANTLR start "rule__DefIdAttribute__Alternatives_0"
    // InternalModelDsl.g:1122:1: rule__DefIdAttribute__Alternatives_0 : ( ( ruleDefSimpleVariable ) | ( ruleDefModelTypeVariable ) | ( ruleDefLinkVariable ) );
    public final void rule__DefIdAttribute__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1126:1: ( ( ruleDefSimpleVariable ) | ( ruleDefModelTypeVariable ) | ( ruleDefLinkVariable ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_TYPE_BINARY:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalModelDsl.g:1127:2: ( ruleDefSimpleVariable )
                    {
                    // InternalModelDsl.g:1127:2: ( ruleDefSimpleVariable )
                    // InternalModelDsl.g:1128:3: ruleDefSimpleVariable
                    {
                     before(grammarAccess.getDefIdAttributeAccess().getDefSimpleVariableParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefSimpleVariable();

                    state._fsp--;

                     after(grammarAccess.getDefIdAttributeAccess().getDefSimpleVariableParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1133:2: ( ruleDefModelTypeVariable )
                    {
                    // InternalModelDsl.g:1133:2: ( ruleDefModelTypeVariable )
                    // InternalModelDsl.g:1134:3: ruleDefModelTypeVariable
                    {
                     before(grammarAccess.getDefIdAttributeAccess().getDefModelTypeVariableParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefModelTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefIdAttributeAccess().getDefModelTypeVariableParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:1139:2: ( ruleDefLinkVariable )
                    {
                    // InternalModelDsl.g:1139:2: ( ruleDefLinkVariable )
                    // InternalModelDsl.g:1140:3: ruleDefLinkVariable
                    {
                     before(grammarAccess.getDefIdAttributeAccess().getDefLinkVariableParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefLinkVariable();

                    state._fsp--;

                     after(grammarAccess.getDefIdAttributeAccess().getDefLinkVariableParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefIdAttribute__Alternatives_0"


    // $ANTLR start "rule__DefCollectionTypeAttribute__Alternatives"
    // InternalModelDsl.g:1149:1: rule__DefCollectionTypeAttribute__Alternatives : ( ( ruleDefModelModelTypeCollectionVariable ) | ( ruleDefModelSimpleTypeCollectionVariable ) );
    public final void rule__DefCollectionTypeAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1153:1: ( ( ruleDefModelModelTypeCollectionVariable ) | ( ruleDefModelSimpleTypeCollectionVariable ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LIST) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==44) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_DATE||(LA12_3>=RULE_TYPE_INT && LA12_3<=RULE_TYPE_BINARY)) ) {
                        alt12=2;
                    }
                    else if ( (LA12_3==RULE_ID) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_SET) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==44) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_DATE||(LA12_3>=RULE_TYPE_INT && LA12_3<=RULE_TYPE_BINARY)) ) {
                        alt12=2;
                    }
                    else if ( (LA12_3==RULE_ID) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalModelDsl.g:1154:2: ( ruleDefModelModelTypeCollectionVariable )
                    {
                    // InternalModelDsl.g:1154:2: ( ruleDefModelModelTypeCollectionVariable )
                    // InternalModelDsl.g:1155:3: ruleDefModelModelTypeCollectionVariable
                    {
                     before(grammarAccess.getDefCollectionTypeAttributeAccess().getDefModelModelTypeCollectionVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefModelModelTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefCollectionTypeAttributeAccess().getDefModelModelTypeCollectionVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1160:2: ( ruleDefModelSimpleTypeCollectionVariable )
                    {
                    // InternalModelDsl.g:1160:2: ( ruleDefModelSimpleTypeCollectionVariable )
                    // InternalModelDsl.g:1161:3: ruleDefModelSimpleTypeCollectionVariable
                    {
                     before(grammarAccess.getDefCollectionTypeAttributeAccess().getDefModelSimpleTypeCollectionVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefModelSimpleTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefCollectionTypeAttributeAccess().getDefModelSimpleTypeCollectionVariableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeAttribute__Alternatives"


    // $ANTLR start "rule__DefCollectionTypeVariable__Alternatives"
    // InternalModelDsl.g:1170:1: rule__DefCollectionTypeVariable__Alternatives : ( ( ( rule__DefCollectionTypeVariable__Group_0__0 ) ) | ( ( rule__DefCollectionTypeVariable__Group_1__0 ) ) );
    public final void rule__DefCollectionTypeVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1174:1: ( ( ( rule__DefCollectionTypeVariable__Group_0__0 ) ) | ( ( rule__DefCollectionTypeVariable__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LIST) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==44) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_ID) ) {
                        alt13=1;
                    }
                    else if ( (LA13_3==RULE_DATE||(LA13_3>=RULE_TYPE_INT && LA13_3<=RULE_TYPE_BINARY)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_SET) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==44) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_ID) ) {
                        alt13=1;
                    }
                    else if ( (LA13_3==RULE_DATE||(LA13_3>=RULE_TYPE_INT && LA13_3<=RULE_TYPE_BINARY)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalModelDsl.g:1175:2: ( ( rule__DefCollectionTypeVariable__Group_0__0 ) )
                    {
                    // InternalModelDsl.g:1175:2: ( ( rule__DefCollectionTypeVariable__Group_0__0 ) )
                    // InternalModelDsl.g:1176:3: ( rule__DefCollectionTypeVariable__Group_0__0 )
                    {
                     before(grammarAccess.getDefCollectionTypeVariableAccess().getGroup_0()); 
                    // InternalModelDsl.g:1177:3: ( rule__DefCollectionTypeVariable__Group_0__0 )
                    // InternalModelDsl.g:1177:4: rule__DefCollectionTypeVariable__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefCollectionTypeVariable__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefCollectionTypeVariableAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1181:2: ( ( rule__DefCollectionTypeVariable__Group_1__0 ) )
                    {
                    // InternalModelDsl.g:1181:2: ( ( rule__DefCollectionTypeVariable__Group_1__0 ) )
                    // InternalModelDsl.g:1182:3: ( rule__DefCollectionTypeVariable__Group_1__0 )
                    {
                     before(grammarAccess.getDefCollectionTypeVariableAccess().getGroup_1()); 
                    // InternalModelDsl.g:1183:3: ( rule__DefCollectionTypeVariable__Group_1__0 )
                    // InternalModelDsl.g:1183:4: rule__DefCollectionTypeVariable__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefCollectionTypeVariable__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefCollectionTypeVariableAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Alternatives"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalModelDsl.g:1191:1: rule__Method__Alternatives : ( ( ruleMethodSimpleReturn ) | ( ruleMethodCollectionReturn ) | ( ruleMethodAllModelReturn ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1195:1: ( ( ruleMethodSimpleReturn ) | ( ruleMethodCollectionReturn ) | ( ruleMethodAllModelReturn ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case RULE_VOID:
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
            case RULE_TYPE_BINARY:
                {
                alt14=1;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalModelDsl.g:1196:2: ( ruleMethodSimpleReturn )
                    {
                    // InternalModelDsl.g:1196:2: ( ruleMethodSimpleReturn )
                    // InternalModelDsl.g:1197:3: ruleMethodSimpleReturn
                    {
                     before(grammarAccess.getMethodAccess().getMethodSimpleReturnParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodSimpleReturn();

                    state._fsp--;

                     after(grammarAccess.getMethodAccess().getMethodSimpleReturnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1202:2: ( ruleMethodCollectionReturn )
                    {
                    // InternalModelDsl.g:1202:2: ( ruleMethodCollectionReturn )
                    // InternalModelDsl.g:1203:3: ruleMethodCollectionReturn
                    {
                     before(grammarAccess.getMethodAccess().getMethodCollectionReturnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodCollectionReturn();

                    state._fsp--;

                     after(grammarAccess.getMethodAccess().getMethodCollectionReturnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:1208:2: ( ruleMethodAllModelReturn )
                    {
                    // InternalModelDsl.g:1208:2: ( ruleMethodAllModelReturn )
                    // InternalModelDsl.g:1209:3: ruleMethodAllModelReturn
                    {
                     before(grammarAccess.getMethodAccess().getMethodAllModelReturnParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodAllModelReturn();

                    state._fsp--;

                     after(grammarAccess.getMethodAccess().getMethodAllModelReturnParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__AllModelTypeCollection__CollectionAlternatives_0_0"
    // InternalModelDsl.g:1218:1: rule__AllModelTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__AllModelTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1222:1: ( ( RULE_LIST ) | ( RULE_SET ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LIST) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_SET) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalModelDsl.g:1223:2: ( RULE_LIST )
                    {
                    // InternalModelDsl.g:1223:2: ( RULE_LIST )
                    // InternalModelDsl.g:1224:3: RULE_LIST
                    {
                     before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1229:2: ( RULE_SET )
                    {
                    // InternalModelDsl.g:1229:2: ( RULE_SET )
                    // InternalModelDsl.g:1230:3: RULE_SET
                    {
                     before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SET,FOLLOW_2); 
                     after(grammarAccess.getAllModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__CollectionAlternatives_0_0"


    // $ANTLR start "rule__ModelTypeCollection__CollectionAlternatives_0_0"
    // InternalModelDsl.g:1239:1: rule__ModelTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__ModelTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1243:1: ( ( RULE_LIST ) | ( RULE_SET ) )
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
                    // InternalModelDsl.g:1244:2: ( RULE_LIST )
                    {
                    // InternalModelDsl.g:1244:2: ( RULE_LIST )
                    // InternalModelDsl.g:1245:3: RULE_LIST
                    {
                     before(grammarAccess.getModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1250:2: ( RULE_SET )
                    {
                    // InternalModelDsl.g:1250:2: ( RULE_SET )
                    // InternalModelDsl.g:1251:3: RULE_SET
                    {
                     before(grammarAccess.getModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SET,FOLLOW_2); 
                     after(grammarAccess.getModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__CollectionAlternatives_0_0"


    // $ANTLR start "rule__SimpleTypeCollection__CollectionAlternatives_0_0"
    // InternalModelDsl.g:1260:1: rule__SimpleTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__SimpleTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1264:1: ( ( RULE_LIST ) | ( RULE_SET ) )
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
                    // InternalModelDsl.g:1265:2: ( RULE_LIST )
                    {
                    // InternalModelDsl.g:1265:2: ( RULE_LIST )
                    // InternalModelDsl.g:1266:3: RULE_LIST
                    {
                     before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1271:2: ( RULE_SET )
                    {
                    // InternalModelDsl.g:1271:2: ( RULE_SET )
                    // InternalModelDsl.g:1272:3: RULE_SET
                    {
                     before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SET,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__CollectionAlternatives_0_0"


    // $ANTLR start "rule__CollectionReturnType__Alternatives"
    // InternalModelDsl.g:1281:1: rule__CollectionReturnType__Alternatives : ( ( ruleAllModelTypeCollection ) | ( ruleSimpleTypeCollection ) );
    public final void rule__CollectionReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1285:1: ( ( ruleAllModelTypeCollection ) | ( ruleSimpleTypeCollection ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LIST) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==44) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_3==RULE_DATE||(LA18_3>=RULE_TYPE_INT && LA18_3<=RULE_TYPE_BINARY)) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_SET) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==44) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_3==RULE_DATE||(LA18_3>=RULE_TYPE_INT && LA18_3<=RULE_TYPE_BINARY)) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalModelDsl.g:1286:2: ( ruleAllModelTypeCollection )
                    {
                    // InternalModelDsl.g:1286:2: ( ruleAllModelTypeCollection )
                    // InternalModelDsl.g:1287:3: ruleAllModelTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getAllModelTypeCollectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllModelTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getAllModelTypeCollectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1292:2: ( ruleSimpleTypeCollection )
                    {
                    // InternalModelDsl.g:1292:2: ( ruleSimpleTypeCollection )
                    // InternalModelDsl.g:1293:3: ruleSimpleTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getSimpleTypeCollectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getSimpleTypeCollectionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionReturnType__Alternatives"


    // $ANTLR start "rule__SimpleReturnType__Alternatives"
    // InternalModelDsl.g:1302:1: rule__SimpleReturnType__Alternatives : ( ( ruleType ) | ( RULE_VOID ) );
    public final void rule__SimpleReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1306:1: ( ( ruleType ) | ( RULE_VOID ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DATE||(LA19_0>=RULE_TYPE_INT && LA19_0<=RULE_TYPE_BINARY)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_VOID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalModelDsl.g:1307:2: ( ruleType )
                    {
                    // InternalModelDsl.g:1307:2: ( ruleType )
                    // InternalModelDsl.g:1308:3: ruleType
                    {
                     before(grammarAccess.getSimpleReturnTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getSimpleReturnTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1313:2: ( RULE_VOID )
                    {
                    // InternalModelDsl.g:1313:2: ( RULE_VOID )
                    // InternalModelDsl.g:1314:3: RULE_VOID
                    {
                     before(grammarAccess.getSimpleReturnTypeAccess().getVOIDTerminalRuleCall_1()); 
                    match(input,RULE_VOID,FOLLOW_2); 
                     after(grammarAccess.getSimpleReturnTypeAccess().getVOIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalModelDsl.g:1323:1: rule__Type__Alternatives : ( ( ruleBasicType ) | ( ruleComplexType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1327:1: ( ( ruleBasicType ) | ( ruleComplexType ) )
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
                    // InternalModelDsl.g:1328:2: ( ruleBasicType )
                    {
                    // InternalModelDsl.g:1328:2: ( ruleBasicType )
                    // InternalModelDsl.g:1329:3: ruleBasicType
                    {
                     before(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1334:2: ( ruleComplexType )
                    {
                    // InternalModelDsl.g:1334:2: ( ruleComplexType )
                    // InternalModelDsl.g:1335:3: ruleComplexType
                    {
                     before(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalModelDsl.g:1344:1: rule__BasicType__Alternatives : ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1348:1: ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) )
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
                    // InternalModelDsl.g:1349:2: ( RULE_TYPE_INT )
                    {
                    // InternalModelDsl.g:1349:2: ( RULE_TYPE_INT )
                    // InternalModelDsl.g:1350:3: RULE_TYPE_INT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 
                    match(input,RULE_TYPE_INT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1355:2: ( RULE_TYPE_DOUBLE )
                    {
                    // InternalModelDsl.g:1355:2: ( RULE_TYPE_DOUBLE )
                    // InternalModelDsl.g:1356:3: RULE_TYPE_DOUBLE
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:1361:2: ( RULE_TYPE_FLOAT )
                    {
                    // InternalModelDsl.g:1361:2: ( RULE_TYPE_FLOAT )
                    // InternalModelDsl.g:1362:3: RULE_TYPE_FLOAT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 
                    match(input,RULE_TYPE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModelDsl.g:1367:2: ( RULE_TYPE_LONG )
                    {
                    // InternalModelDsl.g:1367:2: ( RULE_TYPE_LONG )
                    // InternalModelDsl.g:1368:3: RULE_TYPE_LONG
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 
                    match(input,RULE_TYPE_LONG,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalModelDsl.g:1373:2: ( RULE_TYPE_CHAR )
                    {
                    // InternalModelDsl.g:1373:2: ( RULE_TYPE_CHAR )
                    // InternalModelDsl.g:1374:3: RULE_TYPE_CHAR
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 
                    match(input,RULE_TYPE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalModelDsl.g:1379:2: ( RULE_TYPE_STRING )
                    {
                    // InternalModelDsl.g:1379:2: ( RULE_TYPE_STRING )
                    // InternalModelDsl.g:1380:3: RULE_TYPE_STRING
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 
                    match(input,RULE_TYPE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalModelDsl.g:1385:2: ( RULE_TYPE_BOOLEAN )
                    {
                    // InternalModelDsl.g:1385:2: ( RULE_TYPE_BOOLEAN )
                    // InternalModelDsl.g:1386:3: RULE_TYPE_BOOLEAN
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); 
                    match(input,RULE_TYPE_BOOLEAN,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalModelDsl.g:1391:2: ( RULE_TYPE_BINARY )
                    {
                    // InternalModelDsl.g:1391:2: ( RULE_TYPE_BINARY )
                    // InternalModelDsl.g:1392:3: RULE_TYPE_BINARY
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_BINARYTerminalRuleCall_7()); 
                    match(input,RULE_TYPE_BINARY,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_BINARYTerminalRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalModelDsl.g:1401:1: rule__Multiplicity__Alternatives : ( ( RULE_ONE ) | ( RULE_MANY ) | ( RULE_ONE_ONE ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1405:1: ( ( RULE_ONE ) | ( RULE_MANY ) | ( RULE_ONE_ONE ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ONE:
                {
                alt22=1;
                }
                break;
            case RULE_MANY:
                {
                alt22=2;
                }
                break;
            case RULE_ONE_ONE:
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
                    // InternalModelDsl.g:1406:2: ( RULE_ONE )
                    {
                    // InternalModelDsl.g:1406:2: ( RULE_ONE )
                    // InternalModelDsl.g:1407:3: RULE_ONE
                    {
                     before(grammarAccess.getMultiplicityAccess().getONETerminalRuleCall_0()); 
                    match(input,RULE_ONE,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getONETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelDsl.g:1412:2: ( RULE_MANY )
                    {
                    // InternalModelDsl.g:1412:2: ( RULE_MANY )
                    // InternalModelDsl.g:1413:3: RULE_MANY
                    {
                     before(grammarAccess.getMultiplicityAccess().getMANYTerminalRuleCall_1()); 
                    match(input,RULE_MANY,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMANYTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelDsl.g:1418:2: ( RULE_ONE_ONE )
                    {
                    // InternalModelDsl.g:1418:2: ( RULE_ONE_ONE )
                    // InternalModelDsl.g:1419:3: RULE_ONE_ONE
                    {
                     before(grammarAccess.getMultiplicityAccess().getONE_ONETerminalRuleCall_2()); 
                    match(input,RULE_ONE_ONE,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getONE_ONETerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalModelDsl.g:1428:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1432:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalModelDsl.g:1433:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0"


    // $ANTLR start "rule__SimpleEntity__Group__0__Impl"
    // InternalModelDsl.g:1440:1: rule__SimpleEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1444:1: ( ( 'Entity' ) )
            // InternalModelDsl.g:1445:1: ( 'Entity' )
            {
            // InternalModelDsl.g:1445:1: ( 'Entity' )
            // InternalModelDsl.g:1446:2: 'Entity'
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__1"
    // InternalModelDsl.g:1455:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1459:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalModelDsl.g:1460:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SimpleEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1"


    // $ANTLR start "rule__SimpleEntity__Group__1__Impl"
    // InternalModelDsl.g:1467:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__ImplementationAssignment_1 )? ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1471:1: ( ( ( rule__SimpleEntity__ImplementationAssignment_1 )? ) )
            // InternalModelDsl.g:1472:1: ( ( rule__SimpleEntity__ImplementationAssignment_1 )? )
            {
            // InternalModelDsl.g:1472:1: ( ( rule__SimpleEntity__ImplementationAssignment_1 )? )
            // InternalModelDsl.g:1473:2: ( rule__SimpleEntity__ImplementationAssignment_1 )?
            {
             before(grammarAccess.getSimpleEntityAccess().getImplementationAssignment_1()); 
            // InternalModelDsl.g:1474:2: ( rule__SimpleEntity__ImplementationAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModelDsl.g:1474:3: rule__SimpleEntity__ImplementationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleEntity__ImplementationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleEntityAccess().getImplementationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__2"
    // InternalModelDsl.g:1482:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1486:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalModelDsl.g:1487:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SimpleEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2"


    // $ANTLR start "rule__SimpleEntity__Group__2__Impl"
    // InternalModelDsl.g:1494:1: rule__SimpleEntity__Group__2__Impl : ( ( rule__SimpleEntity__NameAssignment_2 ) ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1498:1: ( ( ( rule__SimpleEntity__NameAssignment_2 ) ) )
            // InternalModelDsl.g:1499:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            {
            // InternalModelDsl.g:1499:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            // InternalModelDsl.g:1500:2: ( rule__SimpleEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 
            // InternalModelDsl.g:1501:2: ( rule__SimpleEntity__NameAssignment_2 )
            // InternalModelDsl.g:1501:3: rule__SimpleEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__3"
    // InternalModelDsl.g:1509:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1513:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalModelDsl.g:1514:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SimpleEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3"


    // $ANTLR start "rule__SimpleEntity__Group__3__Impl"
    // InternalModelDsl.g:1521:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__Group_3__0 )? ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1525:1: ( ( ( rule__SimpleEntity__Group_3__0 )? ) )
            // InternalModelDsl.g:1526:1: ( ( rule__SimpleEntity__Group_3__0 )? )
            {
            // InternalModelDsl.g:1526:1: ( ( rule__SimpleEntity__Group_3__0 )? )
            // InternalModelDsl.g:1527:2: ( rule__SimpleEntity__Group_3__0 )?
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup_3()); 
            // InternalModelDsl.g:1528:2: ( rule__SimpleEntity__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModelDsl.g:1528:3: rule__SimpleEntity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleEntity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__4"
    // InternalModelDsl.g:1536:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1540:1: ( rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 )
            // InternalModelDsl.g:1541:2: rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SimpleEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4"


    // $ANTLR start "rule__SimpleEntity__Group__4__Impl"
    // InternalModelDsl.g:1548:1: rule__SimpleEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1552:1: ( ( '{' ) )
            // InternalModelDsl.g:1553:1: ( '{' )
            {
            // InternalModelDsl.g:1553:1: ( '{' )
            // InternalModelDsl.g:1554:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__5"
    // InternalModelDsl.g:1563:1: rule__SimpleEntity__Group__5 : rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 ;
    public final void rule__SimpleEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1567:1: ( rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 )
            // InternalModelDsl.g:1568:2: rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SimpleEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__5"


    // $ANTLR start "rule__SimpleEntity__Group__5__Impl"
    // InternalModelDsl.g:1575:1: rule__SimpleEntity__Group__5__Impl : ( ( rule__SimpleEntity__AttributesIdAssignment_5 )* ) ;
    public final void rule__SimpleEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1579:1: ( ( ( rule__SimpleEntity__AttributesIdAssignment_5 )* ) )
            // InternalModelDsl.g:1580:1: ( ( rule__SimpleEntity__AttributesIdAssignment_5 )* )
            {
            // InternalModelDsl.g:1580:1: ( ( rule__SimpleEntity__AttributesIdAssignment_5 )* )
            // InternalModelDsl.g:1581:2: ( rule__SimpleEntity__AttributesIdAssignment_5 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAttributesIdAssignment_5()); 
            // InternalModelDsl.g:1582:2: ( rule__SimpleEntity__AttributesIdAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalModelDsl.g:1582:3: rule__SimpleEntity__AttributesIdAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SimpleEntity__AttributesIdAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getAttributesIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__5__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__6"
    // InternalModelDsl.g:1590:1: rule__SimpleEntity__Group__6 : rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 ;
    public final void rule__SimpleEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1594:1: ( rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 )
            // InternalModelDsl.g:1595:2: rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SimpleEntity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__6"


    // $ANTLR start "rule__SimpleEntity__Group__6__Impl"
    // InternalModelDsl.g:1602:1: rule__SimpleEntity__Group__6__Impl : ( ( rule__SimpleEntity__AttributesAssignment_6 )* ) ;
    public final void rule__SimpleEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1606:1: ( ( ( rule__SimpleEntity__AttributesAssignment_6 )* ) )
            // InternalModelDsl.g:1607:1: ( ( rule__SimpleEntity__AttributesAssignment_6 )* )
            {
            // InternalModelDsl.g:1607:1: ( ( rule__SimpleEntity__AttributesAssignment_6 )* )
            // InternalModelDsl.g:1608:2: ( rule__SimpleEntity__AttributesAssignment_6 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAttributesAssignment_6()); 
            // InternalModelDsl.g:1609:2: ( rule__SimpleEntity__AttributesAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalModelDsl.g:1609:3: rule__SimpleEntity__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SimpleEntity__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getAttributesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__6__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__7"
    // InternalModelDsl.g:1617:1: rule__SimpleEntity__Group__7 : rule__SimpleEntity__Group__7__Impl rule__SimpleEntity__Group__8 ;
    public final void rule__SimpleEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1621:1: ( rule__SimpleEntity__Group__7__Impl rule__SimpleEntity__Group__8 )
            // InternalModelDsl.g:1622:2: rule__SimpleEntity__Group__7__Impl rule__SimpleEntity__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__SimpleEntity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__7"


    // $ANTLR start "rule__SimpleEntity__Group__7__Impl"
    // InternalModelDsl.g:1629:1: rule__SimpleEntity__Group__7__Impl : ( ( rule__SimpleEntity__MethodsAssignment_7 )* ) ;
    public final void rule__SimpleEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1633:1: ( ( ( rule__SimpleEntity__MethodsAssignment_7 )* ) )
            // InternalModelDsl.g:1634:1: ( ( rule__SimpleEntity__MethodsAssignment_7 )* )
            {
            // InternalModelDsl.g:1634:1: ( ( rule__SimpleEntity__MethodsAssignment_7 )* )
            // InternalModelDsl.g:1635:2: ( rule__SimpleEntity__MethodsAssignment_7 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getMethodsAssignment_7()); 
            // InternalModelDsl.g:1636:2: ( rule__SimpleEntity__MethodsAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_DATE && LA27_0<=RULE_TYPE_BINARY)||LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalModelDsl.g:1636:3: rule__SimpleEntity__MethodsAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleEntity__MethodsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getMethodsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__7__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__8"
    // InternalModelDsl.g:1644:1: rule__SimpleEntity__Group__8 : rule__SimpleEntity__Group__8__Impl ;
    public final void rule__SimpleEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1648:1: ( rule__SimpleEntity__Group__8__Impl )
            // InternalModelDsl.g:1649:2: rule__SimpleEntity__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__8"


    // $ANTLR start "rule__SimpleEntity__Group__8__Impl"
    // InternalModelDsl.g:1655:1: rule__SimpleEntity__Group__8__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1659:1: ( ( '}' ) )
            // InternalModelDsl.g:1660:1: ( '}' )
            {
            // InternalModelDsl.g:1660:1: ( '}' )
            // InternalModelDsl.g:1661:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__8__Impl"


    // $ANTLR start "rule__SimpleEntity__Group_3__0"
    // InternalModelDsl.g:1671:1: rule__SimpleEntity__Group_3__0 : rule__SimpleEntity__Group_3__0__Impl rule__SimpleEntity__Group_3__1 ;
    public final void rule__SimpleEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1675:1: ( rule__SimpleEntity__Group_3__0__Impl rule__SimpleEntity__Group_3__1 )
            // InternalModelDsl.g:1676:2: rule__SimpleEntity__Group_3__0__Impl rule__SimpleEntity__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__SimpleEntity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_3__0"


    // $ANTLR start "rule__SimpleEntity__Group_3__0__Impl"
    // InternalModelDsl.g:1683:1: rule__SimpleEntity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__SimpleEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1687:1: ( ( 'extends' ) )
            // InternalModelDsl.g:1688:1: ( 'extends' )
            {
            // InternalModelDsl.g:1688:1: ( 'extends' )
            // InternalModelDsl.g:1689:2: 'extends'
            {
             before(grammarAccess.getSimpleEntityAccess().getExtendsKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group_3__1"
    // InternalModelDsl.g:1698:1: rule__SimpleEntity__Group_3__1 : rule__SimpleEntity__Group_3__1__Impl ;
    public final void rule__SimpleEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1702:1: ( rule__SimpleEntity__Group_3__1__Impl )
            // InternalModelDsl.g:1703:2: rule__SimpleEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_3__1"


    // $ANTLR start "rule__SimpleEntity__Group_3__1__Impl"
    // InternalModelDsl.g:1709:1: rule__SimpleEntity__Group_3__1__Impl : ( ( rule__SimpleEntity__SuperClassAssignment_3_1 ) ) ;
    public final void rule__SimpleEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1713:1: ( ( ( rule__SimpleEntity__SuperClassAssignment_3_1 ) ) )
            // InternalModelDsl.g:1714:1: ( ( rule__SimpleEntity__SuperClassAssignment_3_1 ) )
            {
            // InternalModelDsl.g:1714:1: ( ( rule__SimpleEntity__SuperClassAssignment_3_1 ) )
            // InternalModelDsl.g:1715:2: ( rule__SimpleEntity__SuperClassAssignment_3_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getSuperClassAssignment_3_1()); 
            // InternalModelDsl.g:1716:2: ( rule__SimpleEntity__SuperClassAssignment_3_1 )
            // InternalModelDsl.g:1716:3: rule__SimpleEntity__SuperClassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__SuperClassAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getSuperClassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_3__1__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__0"
    // InternalModelDsl.g:1725:1: rule__AssociativeEntity__Group__0 : rule__AssociativeEntity__Group__0__Impl rule__AssociativeEntity__Group__1 ;
    public final void rule__AssociativeEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1729:1: ( rule__AssociativeEntity__Group__0__Impl rule__AssociativeEntity__Group__1 )
            // InternalModelDsl.g:1730:2: rule__AssociativeEntity__Group__0__Impl rule__AssociativeEntity__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AssociativeEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__0"


    // $ANTLR start "rule__AssociativeEntity__Group__0__Impl"
    // InternalModelDsl.g:1737:1: rule__AssociativeEntity__Group__0__Impl : ( 'EntityLink' ) ;
    public final void rule__AssociativeEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1741:1: ( ( 'EntityLink' ) )
            // InternalModelDsl.g:1742:1: ( 'EntityLink' )
            {
            // InternalModelDsl.g:1742:1: ( 'EntityLink' )
            // InternalModelDsl.g:1743:2: 'EntityLink'
            {
             before(grammarAccess.getAssociativeEntityAccess().getEntityLinkKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAssociativeEntityAccess().getEntityLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__0__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__1"
    // InternalModelDsl.g:1752:1: rule__AssociativeEntity__Group__1 : rule__AssociativeEntity__Group__1__Impl rule__AssociativeEntity__Group__2 ;
    public final void rule__AssociativeEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1756:1: ( rule__AssociativeEntity__Group__1__Impl rule__AssociativeEntity__Group__2 )
            // InternalModelDsl.g:1757:2: rule__AssociativeEntity__Group__1__Impl rule__AssociativeEntity__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AssociativeEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__1"


    // $ANTLR start "rule__AssociativeEntity__Group__1__Impl"
    // InternalModelDsl.g:1764:1: rule__AssociativeEntity__Group__1__Impl : ( ( rule__AssociativeEntity__NameAssignment_1 ) ) ;
    public final void rule__AssociativeEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1768:1: ( ( ( rule__AssociativeEntity__NameAssignment_1 ) ) )
            // InternalModelDsl.g:1769:1: ( ( rule__AssociativeEntity__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:1769:1: ( ( rule__AssociativeEntity__NameAssignment_1 ) )
            // InternalModelDsl.g:1770:2: ( rule__AssociativeEntity__NameAssignment_1 )
            {
             before(grammarAccess.getAssociativeEntityAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:1771:2: ( rule__AssociativeEntity__NameAssignment_1 )
            // InternalModelDsl.g:1771:3: rule__AssociativeEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociativeEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__1__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__2"
    // InternalModelDsl.g:1779:1: rule__AssociativeEntity__Group__2 : rule__AssociativeEntity__Group__2__Impl rule__AssociativeEntity__Group__3 ;
    public final void rule__AssociativeEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1783:1: ( rule__AssociativeEntity__Group__2__Impl rule__AssociativeEntity__Group__3 )
            // InternalModelDsl.g:1784:2: rule__AssociativeEntity__Group__2__Impl rule__AssociativeEntity__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AssociativeEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__2"


    // $ANTLR start "rule__AssociativeEntity__Group__2__Impl"
    // InternalModelDsl.g:1791:1: rule__AssociativeEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__AssociativeEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1795:1: ( ( '{' ) )
            // InternalModelDsl.g:1796:1: ( '{' )
            {
            // InternalModelDsl.g:1796:1: ( '{' )
            // InternalModelDsl.g:1797:2: '{'
            {
             before(grammarAccess.getAssociativeEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAssociativeEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__2__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__3"
    // InternalModelDsl.g:1806:1: rule__AssociativeEntity__Group__3 : rule__AssociativeEntity__Group__3__Impl rule__AssociativeEntity__Group__4 ;
    public final void rule__AssociativeEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1810:1: ( rule__AssociativeEntity__Group__3__Impl rule__AssociativeEntity__Group__4 )
            // InternalModelDsl.g:1811:2: rule__AssociativeEntity__Group__3__Impl rule__AssociativeEntity__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__AssociativeEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__3"


    // $ANTLR start "rule__AssociativeEntity__Group__3__Impl"
    // InternalModelDsl.g:1818:1: rule__AssociativeEntity__Group__3__Impl : ( ( rule__AssociativeEntity__RelationsAssignment_3 ) ) ;
    public final void rule__AssociativeEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1822:1: ( ( ( rule__AssociativeEntity__RelationsAssignment_3 ) ) )
            // InternalModelDsl.g:1823:1: ( ( rule__AssociativeEntity__RelationsAssignment_3 ) )
            {
            // InternalModelDsl.g:1823:1: ( ( rule__AssociativeEntity__RelationsAssignment_3 ) )
            // InternalModelDsl.g:1824:2: ( rule__AssociativeEntity__RelationsAssignment_3 )
            {
             before(grammarAccess.getAssociativeEntityAccess().getRelationsAssignment_3()); 
            // InternalModelDsl.g:1825:2: ( rule__AssociativeEntity__RelationsAssignment_3 )
            // InternalModelDsl.g:1825:3: rule__AssociativeEntity__RelationsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__RelationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociativeEntityAccess().getRelationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__3__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__4"
    // InternalModelDsl.g:1833:1: rule__AssociativeEntity__Group__4 : rule__AssociativeEntity__Group__4__Impl rule__AssociativeEntity__Group__5 ;
    public final void rule__AssociativeEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1837:1: ( rule__AssociativeEntity__Group__4__Impl rule__AssociativeEntity__Group__5 )
            // InternalModelDsl.g:1838:2: rule__AssociativeEntity__Group__4__Impl rule__AssociativeEntity__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__AssociativeEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__4"


    // $ANTLR start "rule__AssociativeEntity__Group__4__Impl"
    // InternalModelDsl.g:1845:1: rule__AssociativeEntity__Group__4__Impl : ( ( rule__AssociativeEntity__RelationsAssignment_4 ) ) ;
    public final void rule__AssociativeEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1849:1: ( ( ( rule__AssociativeEntity__RelationsAssignment_4 ) ) )
            // InternalModelDsl.g:1850:1: ( ( rule__AssociativeEntity__RelationsAssignment_4 ) )
            {
            // InternalModelDsl.g:1850:1: ( ( rule__AssociativeEntity__RelationsAssignment_4 ) )
            // InternalModelDsl.g:1851:2: ( rule__AssociativeEntity__RelationsAssignment_4 )
            {
             before(grammarAccess.getAssociativeEntityAccess().getRelationsAssignment_4()); 
            // InternalModelDsl.g:1852:2: ( rule__AssociativeEntity__RelationsAssignment_4 )
            // InternalModelDsl.g:1852:3: rule__AssociativeEntity__RelationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__RelationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociativeEntityAccess().getRelationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__4__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__5"
    // InternalModelDsl.g:1860:1: rule__AssociativeEntity__Group__5 : rule__AssociativeEntity__Group__5__Impl rule__AssociativeEntity__Group__6 ;
    public final void rule__AssociativeEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1864:1: ( rule__AssociativeEntity__Group__5__Impl rule__AssociativeEntity__Group__6 )
            // InternalModelDsl.g:1865:2: rule__AssociativeEntity__Group__5__Impl rule__AssociativeEntity__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__AssociativeEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__5"


    // $ANTLR start "rule__AssociativeEntity__Group__5__Impl"
    // InternalModelDsl.g:1872:1: rule__AssociativeEntity__Group__5__Impl : ( ( rule__AssociativeEntity__AttributesAssignment_5 )* ) ;
    public final void rule__AssociativeEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1876:1: ( ( ( rule__AssociativeEntity__AttributesAssignment_5 )* ) )
            // InternalModelDsl.g:1877:1: ( ( rule__AssociativeEntity__AttributesAssignment_5 )* )
            {
            // InternalModelDsl.g:1877:1: ( ( rule__AssociativeEntity__AttributesAssignment_5 )* )
            // InternalModelDsl.g:1878:2: ( rule__AssociativeEntity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getAssociativeEntityAccess().getAttributesAssignment_5()); 
            // InternalModelDsl.g:1879:2: ( rule__AssociativeEntity__AttributesAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // InternalModelDsl.g:1879:3: rule__AssociativeEntity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AssociativeEntity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAssociativeEntityAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__5__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__6"
    // InternalModelDsl.g:1887:1: rule__AssociativeEntity__Group__6 : rule__AssociativeEntity__Group__6__Impl rule__AssociativeEntity__Group__7 ;
    public final void rule__AssociativeEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1891:1: ( rule__AssociativeEntity__Group__6__Impl rule__AssociativeEntity__Group__7 )
            // InternalModelDsl.g:1892:2: rule__AssociativeEntity__Group__6__Impl rule__AssociativeEntity__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__AssociativeEntity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__6"


    // $ANTLR start "rule__AssociativeEntity__Group__6__Impl"
    // InternalModelDsl.g:1899:1: rule__AssociativeEntity__Group__6__Impl : ( ( rule__AssociativeEntity__MethodsAssignment_6 )* ) ;
    public final void rule__AssociativeEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1903:1: ( ( ( rule__AssociativeEntity__MethodsAssignment_6 )* ) )
            // InternalModelDsl.g:1904:1: ( ( rule__AssociativeEntity__MethodsAssignment_6 )* )
            {
            // InternalModelDsl.g:1904:1: ( ( rule__AssociativeEntity__MethodsAssignment_6 )* )
            // InternalModelDsl.g:1905:2: ( rule__AssociativeEntity__MethodsAssignment_6 )*
            {
             before(grammarAccess.getAssociativeEntityAccess().getMethodsAssignment_6()); 
            // InternalModelDsl.g:1906:2: ( rule__AssociativeEntity__MethodsAssignment_6 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_DATE && LA29_0<=RULE_TYPE_BINARY)||LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalModelDsl.g:1906:3: rule__AssociativeEntity__MethodsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AssociativeEntity__MethodsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAssociativeEntityAccess().getMethodsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__6__Impl"


    // $ANTLR start "rule__AssociativeEntity__Group__7"
    // InternalModelDsl.g:1914:1: rule__AssociativeEntity__Group__7 : rule__AssociativeEntity__Group__7__Impl ;
    public final void rule__AssociativeEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1918:1: ( rule__AssociativeEntity__Group__7__Impl )
            // InternalModelDsl.g:1919:2: rule__AssociativeEntity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociativeEntity__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__7"


    // $ANTLR start "rule__AssociativeEntity__Group__7__Impl"
    // InternalModelDsl.g:1925:1: rule__AssociativeEntity__Group__7__Impl : ( '}' ) ;
    public final void rule__AssociativeEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1929:1: ( ( '}' ) )
            // InternalModelDsl.g:1930:1: ( '}' )
            {
            // InternalModelDsl.g:1930:1: ( '}' )
            // InternalModelDsl.g:1931:2: '}'
            {
             before(grammarAccess.getAssociativeEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAssociativeEntityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__Group__7__Impl"


    // $ANTLR start "rule__ValueType__Group__0"
    // InternalModelDsl.g:1941:1: rule__ValueType__Group__0 : rule__ValueType__Group__0__Impl rule__ValueType__Group__1 ;
    public final void rule__ValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1945:1: ( rule__ValueType__Group__0__Impl rule__ValueType__Group__1 )
            // InternalModelDsl.g:1946:2: rule__ValueType__Group__0__Impl rule__ValueType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__0"


    // $ANTLR start "rule__ValueType__Group__0__Impl"
    // InternalModelDsl.g:1953:1: rule__ValueType__Group__0__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1957:1: ( ( 'ValueType' ) )
            // InternalModelDsl.g:1958:1: ( 'ValueType' )
            {
            // InternalModelDsl.g:1958:1: ( 'ValueType' )
            // InternalModelDsl.g:1959:2: 'ValueType'
            {
             before(grammarAccess.getValueTypeAccess().getValueTypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getValueTypeAccess().getValueTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__0__Impl"


    // $ANTLR start "rule__ValueType__Group__1"
    // InternalModelDsl.g:1968:1: rule__ValueType__Group__1 : rule__ValueType__Group__1__Impl rule__ValueType__Group__2 ;
    public final void rule__ValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1972:1: ( rule__ValueType__Group__1__Impl rule__ValueType__Group__2 )
            // InternalModelDsl.g:1973:2: rule__ValueType__Group__1__Impl rule__ValueType__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__1"


    // $ANTLR start "rule__ValueType__Group__1__Impl"
    // InternalModelDsl.g:1980:1: rule__ValueType__Group__1__Impl : ( ( rule__ValueType__NameAssignment_1 ) ) ;
    public final void rule__ValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1984:1: ( ( ( rule__ValueType__NameAssignment_1 ) ) )
            // InternalModelDsl.g:1985:1: ( ( rule__ValueType__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:1985:1: ( ( rule__ValueType__NameAssignment_1 ) )
            // InternalModelDsl.g:1986:2: ( rule__ValueType__NameAssignment_1 )
            {
             before(grammarAccess.getValueTypeAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:1987:2: ( rule__ValueType__NameAssignment_1 )
            // InternalModelDsl.g:1987:3: rule__ValueType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__1__Impl"


    // $ANTLR start "rule__ValueType__Group__2"
    // InternalModelDsl.g:1995:1: rule__ValueType__Group__2 : rule__ValueType__Group__2__Impl rule__ValueType__Group__3 ;
    public final void rule__ValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:1999:1: ( rule__ValueType__Group__2__Impl rule__ValueType__Group__3 )
            // InternalModelDsl.g:2000:2: rule__ValueType__Group__2__Impl rule__ValueType__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__2"


    // $ANTLR start "rule__ValueType__Group__2__Impl"
    // InternalModelDsl.g:2007:1: rule__ValueType__Group__2__Impl : ( '{' ) ;
    public final void rule__ValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2011:1: ( ( '{' ) )
            // InternalModelDsl.g:2012:1: ( '{' )
            {
            // InternalModelDsl.g:2012:1: ( '{' )
            // InternalModelDsl.g:2013:2: '{'
            {
             before(grammarAccess.getValueTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getValueTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__2__Impl"


    // $ANTLR start "rule__ValueType__Group__3"
    // InternalModelDsl.g:2022:1: rule__ValueType__Group__3 : rule__ValueType__Group__3__Impl rule__ValueType__Group__4 ;
    public final void rule__ValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2026:1: ( rule__ValueType__Group__3__Impl rule__ValueType__Group__4 )
            // InternalModelDsl.g:2027:2: rule__ValueType__Group__3__Impl rule__ValueType__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__3"


    // $ANTLR start "rule__ValueType__Group__3__Impl"
    // InternalModelDsl.g:2034:1: rule__ValueType__Group__3__Impl : ( ( ( rule__ValueType__AttributesAssignment_3 ) ) ( ( rule__ValueType__AttributesAssignment_3 )* ) ) ;
    public final void rule__ValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2038:1: ( ( ( ( rule__ValueType__AttributesAssignment_3 ) ) ( ( rule__ValueType__AttributesAssignment_3 )* ) ) )
            // InternalModelDsl.g:2039:1: ( ( ( rule__ValueType__AttributesAssignment_3 ) ) ( ( rule__ValueType__AttributesAssignment_3 )* ) )
            {
            // InternalModelDsl.g:2039:1: ( ( ( rule__ValueType__AttributesAssignment_3 ) ) ( ( rule__ValueType__AttributesAssignment_3 )* ) )
            // InternalModelDsl.g:2040:2: ( ( rule__ValueType__AttributesAssignment_3 ) ) ( ( rule__ValueType__AttributesAssignment_3 )* )
            {
            // InternalModelDsl.g:2040:2: ( ( rule__ValueType__AttributesAssignment_3 ) )
            // InternalModelDsl.g:2041:3: ( rule__ValueType__AttributesAssignment_3 )
            {
             before(grammarAccess.getValueTypeAccess().getAttributesAssignment_3()); 
            // InternalModelDsl.g:2042:3: ( rule__ValueType__AttributesAssignment_3 )
            // InternalModelDsl.g:2042:4: rule__ValueType__AttributesAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__ValueType__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAttributesAssignment_3()); 

            }

            // InternalModelDsl.g:2045:2: ( ( rule__ValueType__AttributesAssignment_3 )* )
            // InternalModelDsl.g:2046:3: ( rule__ValueType__AttributesAssignment_3 )*
            {
             before(grammarAccess.getValueTypeAccess().getAttributesAssignment_3()); 
            // InternalModelDsl.g:2047:3: ( rule__ValueType__AttributesAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_DATE && LA30_0<=RULE_SET)||(LA30_0>=RULE_TYPE_INT && LA30_0<=RULE_TYPE_BINARY)||LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalModelDsl.g:2047:4: rule__ValueType__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ValueType__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getValueTypeAccess().getAttributesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__3__Impl"


    // $ANTLR start "rule__ValueType__Group__4"
    // InternalModelDsl.g:2056:1: rule__ValueType__Group__4 : rule__ValueType__Group__4__Impl ;
    public final void rule__ValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2060:1: ( rule__ValueType__Group__4__Impl )
            // InternalModelDsl.g:2061:2: rule__ValueType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__4"


    // $ANTLR start "rule__ValueType__Group__4__Impl"
    // InternalModelDsl.g:2067:1: rule__ValueType__Group__4__Impl : ( '}' ) ;
    public final void rule__ValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2071:1: ( ( '}' ) )
            // InternalModelDsl.g:2072:1: ( '}' )
            {
            // InternalModelDsl.g:2072:1: ( '}' )
            // InternalModelDsl.g:2073:2: '}'
            {
             before(grammarAccess.getValueTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getValueTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Group__4__Impl"


    // $ANTLR start "rule__Enumerable__Group__0"
    // InternalModelDsl.g:2083:1: rule__Enumerable__Group__0 : rule__Enumerable__Group__0__Impl rule__Enumerable__Group__1 ;
    public final void rule__Enumerable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2087:1: ( rule__Enumerable__Group__0__Impl rule__Enumerable__Group__1 )
            // InternalModelDsl.g:2088:2: rule__Enumerable__Group__0__Impl rule__Enumerable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Enumerable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__0"


    // $ANTLR start "rule__Enumerable__Group__0__Impl"
    // InternalModelDsl.g:2095:1: rule__Enumerable__Group__0__Impl : ( 'Enumerable' ) ;
    public final void rule__Enumerable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2099:1: ( ( 'Enumerable' ) )
            // InternalModelDsl.g:2100:1: ( 'Enumerable' )
            {
            // InternalModelDsl.g:2100:1: ( 'Enumerable' )
            // InternalModelDsl.g:2101:2: 'Enumerable'
            {
             before(grammarAccess.getEnumerableAccess().getEnumerableKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumerableAccess().getEnumerableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__0__Impl"


    // $ANTLR start "rule__Enumerable__Group__1"
    // InternalModelDsl.g:2110:1: rule__Enumerable__Group__1 : rule__Enumerable__Group__1__Impl rule__Enumerable__Group__2 ;
    public final void rule__Enumerable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2114:1: ( rule__Enumerable__Group__1__Impl rule__Enumerable__Group__2 )
            // InternalModelDsl.g:2115:2: rule__Enumerable__Group__1__Impl rule__Enumerable__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Enumerable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__1"


    // $ANTLR start "rule__Enumerable__Group__1__Impl"
    // InternalModelDsl.g:2122:1: rule__Enumerable__Group__1__Impl : ( ( rule__Enumerable__NameAssignment_1 ) ) ;
    public final void rule__Enumerable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2126:1: ( ( ( rule__Enumerable__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2127:1: ( ( rule__Enumerable__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2127:1: ( ( rule__Enumerable__NameAssignment_1 ) )
            // InternalModelDsl.g:2128:2: ( rule__Enumerable__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerableAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2129:2: ( rule__Enumerable__NameAssignment_1 )
            // InternalModelDsl.g:2129:3: rule__Enumerable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumerable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__1__Impl"


    // $ANTLR start "rule__Enumerable__Group__2"
    // InternalModelDsl.g:2137:1: rule__Enumerable__Group__2 : rule__Enumerable__Group__2__Impl rule__Enumerable__Group__3 ;
    public final void rule__Enumerable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2141:1: ( rule__Enumerable__Group__2__Impl rule__Enumerable__Group__3 )
            // InternalModelDsl.g:2142:2: rule__Enumerable__Group__2__Impl rule__Enumerable__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Enumerable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__2"


    // $ANTLR start "rule__Enumerable__Group__2__Impl"
    // InternalModelDsl.g:2149:1: rule__Enumerable__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumerable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2153:1: ( ( '{' ) )
            // InternalModelDsl.g:2154:1: ( '{' )
            {
            // InternalModelDsl.g:2154:1: ( '{' )
            // InternalModelDsl.g:2155:2: '{'
            {
             before(grammarAccess.getEnumerableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnumerableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__2__Impl"


    // $ANTLR start "rule__Enumerable__Group__3"
    // InternalModelDsl.g:2164:1: rule__Enumerable__Group__3 : rule__Enumerable__Group__3__Impl rule__Enumerable__Group__4 ;
    public final void rule__Enumerable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2168:1: ( rule__Enumerable__Group__3__Impl rule__Enumerable__Group__4 )
            // InternalModelDsl.g:2169:2: rule__Enumerable__Group__3__Impl rule__Enumerable__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Enumerable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__3"


    // $ANTLR start "rule__Enumerable__Group__3__Impl"
    // InternalModelDsl.g:2176:1: rule__Enumerable__Group__3__Impl : ( ( ( rule__Enumerable__EnumsAssignment_3 ) ) ( ( rule__Enumerable__EnumsAssignment_3 )* ) ) ;
    public final void rule__Enumerable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2180:1: ( ( ( ( rule__Enumerable__EnumsAssignment_3 ) ) ( ( rule__Enumerable__EnumsAssignment_3 )* ) ) )
            // InternalModelDsl.g:2181:1: ( ( ( rule__Enumerable__EnumsAssignment_3 ) ) ( ( rule__Enumerable__EnumsAssignment_3 )* ) )
            {
            // InternalModelDsl.g:2181:1: ( ( ( rule__Enumerable__EnumsAssignment_3 ) ) ( ( rule__Enumerable__EnumsAssignment_3 )* ) )
            // InternalModelDsl.g:2182:2: ( ( rule__Enumerable__EnumsAssignment_3 ) ) ( ( rule__Enumerable__EnumsAssignment_3 )* )
            {
            // InternalModelDsl.g:2182:2: ( ( rule__Enumerable__EnumsAssignment_3 ) )
            // InternalModelDsl.g:2183:3: ( rule__Enumerable__EnumsAssignment_3 )
            {
             before(grammarAccess.getEnumerableAccess().getEnumsAssignment_3()); 
            // InternalModelDsl.g:2184:3: ( rule__Enumerable__EnumsAssignment_3 )
            // InternalModelDsl.g:2184:4: rule__Enumerable__EnumsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Enumerable__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerableAccess().getEnumsAssignment_3()); 

            }

            // InternalModelDsl.g:2187:2: ( ( rule__Enumerable__EnumsAssignment_3 )* )
            // InternalModelDsl.g:2188:3: ( rule__Enumerable__EnumsAssignment_3 )*
            {
             before(grammarAccess.getEnumerableAccess().getEnumsAssignment_3()); 
            // InternalModelDsl.g:2189:3: ( rule__Enumerable__EnumsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ENUMERATE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalModelDsl.g:2189:4: rule__Enumerable__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Enumerable__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEnumerableAccess().getEnumsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__3__Impl"


    // $ANTLR start "rule__Enumerable__Group__4"
    // InternalModelDsl.g:2198:1: rule__Enumerable__Group__4 : rule__Enumerable__Group__4__Impl ;
    public final void rule__Enumerable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2202:1: ( rule__Enumerable__Group__4__Impl )
            // InternalModelDsl.g:2203:2: rule__Enumerable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumerable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__4"


    // $ANTLR start "rule__Enumerable__Group__4__Impl"
    // InternalModelDsl.g:2209:1: rule__Enumerable__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumerable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2213:1: ( ( '}' ) )
            // InternalModelDsl.g:2214:1: ( '}' )
            {
            // InternalModelDsl.g:2214:1: ( '}' )
            // InternalModelDsl.g:2215:2: '}'
            {
             before(grammarAccess.getEnumerableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumerableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__Group__4__Impl"


    // $ANTLR start "rule__SimpleLink__Group__0"
    // InternalModelDsl.g:2225:1: rule__SimpleLink__Group__0 : rule__SimpleLink__Group__0__Impl rule__SimpleLink__Group__1 ;
    public final void rule__SimpleLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2229:1: ( rule__SimpleLink__Group__0__Impl rule__SimpleLink__Group__1 )
            // InternalModelDsl.g:2230:2: rule__SimpleLink__Group__0__Impl rule__SimpleLink__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SimpleLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__0"


    // $ANTLR start "rule__SimpleLink__Group__0__Impl"
    // InternalModelDsl.g:2237:1: rule__SimpleLink__Group__0__Impl : ( 'Link' ) ;
    public final void rule__SimpleLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2241:1: ( ( 'Link' ) )
            // InternalModelDsl.g:2242:1: ( 'Link' )
            {
            // InternalModelDsl.g:2242:1: ( 'Link' )
            // InternalModelDsl.g:2243:2: 'Link'
            {
             before(grammarAccess.getSimpleLinkAccess().getLinkKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSimpleLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__0__Impl"


    // $ANTLR start "rule__SimpleLink__Group__1"
    // InternalModelDsl.g:2252:1: rule__SimpleLink__Group__1 : rule__SimpleLink__Group__1__Impl rule__SimpleLink__Group__2 ;
    public final void rule__SimpleLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2256:1: ( rule__SimpleLink__Group__1__Impl rule__SimpleLink__Group__2 )
            // InternalModelDsl.g:2257:2: rule__SimpleLink__Group__1__Impl rule__SimpleLink__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SimpleLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__1"


    // $ANTLR start "rule__SimpleLink__Group__1__Impl"
    // InternalModelDsl.g:2264:1: rule__SimpleLink__Group__1__Impl : ( ( rule__SimpleLink__NameAssignment_1 ) ) ;
    public final void rule__SimpleLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2268:1: ( ( ( rule__SimpleLink__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2269:1: ( ( rule__SimpleLink__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2269:1: ( ( rule__SimpleLink__NameAssignment_1 ) )
            // InternalModelDsl.g:2270:2: ( rule__SimpleLink__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleLinkAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2271:2: ( rule__SimpleLink__NameAssignment_1 )
            // InternalModelDsl.g:2271:3: rule__SimpleLink__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleLink__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__1__Impl"


    // $ANTLR start "rule__SimpleLink__Group__2"
    // InternalModelDsl.g:2279:1: rule__SimpleLink__Group__2 : rule__SimpleLink__Group__2__Impl rule__SimpleLink__Group__3 ;
    public final void rule__SimpleLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2283:1: ( rule__SimpleLink__Group__2__Impl rule__SimpleLink__Group__3 )
            // InternalModelDsl.g:2284:2: rule__SimpleLink__Group__2__Impl rule__SimpleLink__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SimpleLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__2"


    // $ANTLR start "rule__SimpleLink__Group__2__Impl"
    // InternalModelDsl.g:2291:1: rule__SimpleLink__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2295:1: ( ( '{' ) )
            // InternalModelDsl.g:2296:1: ( '{' )
            {
            // InternalModelDsl.g:2296:1: ( '{' )
            // InternalModelDsl.g:2297:2: '{'
            {
             before(grammarAccess.getSimpleLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSimpleLinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__2__Impl"


    // $ANTLR start "rule__SimpleLink__Group__3"
    // InternalModelDsl.g:2306:1: rule__SimpleLink__Group__3 : rule__SimpleLink__Group__3__Impl rule__SimpleLink__Group__4 ;
    public final void rule__SimpleLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2310:1: ( rule__SimpleLink__Group__3__Impl rule__SimpleLink__Group__4 )
            // InternalModelDsl.g:2311:2: rule__SimpleLink__Group__3__Impl rule__SimpleLink__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SimpleLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__3"


    // $ANTLR start "rule__SimpleLink__Group__3__Impl"
    // InternalModelDsl.g:2318:1: rule__SimpleLink__Group__3__Impl : ( ( rule__SimpleLink__RelationsAssignment_3 ) ) ;
    public final void rule__SimpleLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2322:1: ( ( ( rule__SimpleLink__RelationsAssignment_3 ) ) )
            // InternalModelDsl.g:2323:1: ( ( rule__SimpleLink__RelationsAssignment_3 ) )
            {
            // InternalModelDsl.g:2323:1: ( ( rule__SimpleLink__RelationsAssignment_3 ) )
            // InternalModelDsl.g:2324:2: ( rule__SimpleLink__RelationsAssignment_3 )
            {
             before(grammarAccess.getSimpleLinkAccess().getRelationsAssignment_3()); 
            // InternalModelDsl.g:2325:2: ( rule__SimpleLink__RelationsAssignment_3 )
            // InternalModelDsl.g:2325:3: rule__SimpleLink__RelationsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SimpleLink__RelationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleLinkAccess().getRelationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__3__Impl"


    // $ANTLR start "rule__SimpleLink__Group__4"
    // InternalModelDsl.g:2333:1: rule__SimpleLink__Group__4 : rule__SimpleLink__Group__4__Impl rule__SimpleLink__Group__5 ;
    public final void rule__SimpleLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2337:1: ( rule__SimpleLink__Group__4__Impl rule__SimpleLink__Group__5 )
            // InternalModelDsl.g:2338:2: rule__SimpleLink__Group__4__Impl rule__SimpleLink__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__SimpleLink__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__4"


    // $ANTLR start "rule__SimpleLink__Group__4__Impl"
    // InternalModelDsl.g:2345:1: rule__SimpleLink__Group__4__Impl : ( ( rule__SimpleLink__RelationsAssignment_4 ) ) ;
    public final void rule__SimpleLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2349:1: ( ( ( rule__SimpleLink__RelationsAssignment_4 ) ) )
            // InternalModelDsl.g:2350:1: ( ( rule__SimpleLink__RelationsAssignment_4 ) )
            {
            // InternalModelDsl.g:2350:1: ( ( rule__SimpleLink__RelationsAssignment_4 ) )
            // InternalModelDsl.g:2351:2: ( rule__SimpleLink__RelationsAssignment_4 )
            {
             before(grammarAccess.getSimpleLinkAccess().getRelationsAssignment_4()); 
            // InternalModelDsl.g:2352:2: ( rule__SimpleLink__RelationsAssignment_4 )
            // InternalModelDsl.g:2352:3: rule__SimpleLink__RelationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SimpleLink__RelationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleLinkAccess().getRelationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__4__Impl"


    // $ANTLR start "rule__SimpleLink__Group__5"
    // InternalModelDsl.g:2360:1: rule__SimpleLink__Group__5 : rule__SimpleLink__Group__5__Impl ;
    public final void rule__SimpleLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2364:1: ( rule__SimpleLink__Group__5__Impl )
            // InternalModelDsl.g:2365:2: rule__SimpleLink__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleLink__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__5"


    // $ANTLR start "rule__SimpleLink__Group__5__Impl"
    // InternalModelDsl.g:2371:1: rule__SimpleLink__Group__5__Impl : ( '}' ) ;
    public final void rule__SimpleLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2375:1: ( ( '}' ) )
            // InternalModelDsl.g:2376:1: ( '}' )
            {
            // InternalModelDsl.g:2376:1: ( '}' )
            // InternalModelDsl.g:2377:2: '}'
            {
             before(grammarAccess.getSimpleLinkAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSimpleLinkAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalModelDsl.g:2387:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2391:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalModelDsl.g:2392:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalModelDsl.g:2399:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__MultiplicityAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2403:1: ( ( ( rule__Relation__MultiplicityAssignment_0 ) ) )
            // InternalModelDsl.g:2404:1: ( ( rule__Relation__MultiplicityAssignment_0 ) )
            {
            // InternalModelDsl.g:2404:1: ( ( rule__Relation__MultiplicityAssignment_0 ) )
            // InternalModelDsl.g:2405:2: ( rule__Relation__MultiplicityAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getMultiplicityAssignment_0()); 
            // InternalModelDsl.g:2406:2: ( rule__Relation__MultiplicityAssignment_0 )
            // InternalModelDsl.g:2406:3: rule__Relation__MultiplicityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__MultiplicityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getMultiplicityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalModelDsl.g:2414:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2418:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalModelDsl.g:2419:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalModelDsl.g:2426:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__TypeAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2430:1: ( ( ( rule__Relation__TypeAssignment_1 ) ) )
            // InternalModelDsl.g:2431:1: ( ( rule__Relation__TypeAssignment_1 ) )
            {
            // InternalModelDsl.g:2431:1: ( ( rule__Relation__TypeAssignment_1 ) )
            // InternalModelDsl.g:2432:2: ( rule__Relation__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_1()); 
            // InternalModelDsl.g:2433:2: ( rule__Relation__TypeAssignment_1 )
            // InternalModelDsl.g:2433:3: rule__Relation__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalModelDsl.g:2441:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2445:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalModelDsl.g:2446:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalModelDsl.g:2453:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__NameAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2457:1: ( ( ( rule__Relation__NameAssignment_2 ) ) )
            // InternalModelDsl.g:2458:1: ( ( rule__Relation__NameAssignment_2 ) )
            {
            // InternalModelDsl.g:2458:1: ( ( rule__Relation__NameAssignment_2 ) )
            // InternalModelDsl.g:2459:2: ( rule__Relation__NameAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_2()); 
            // InternalModelDsl.g:2460:2: ( rule__Relation__NameAssignment_2 )
            // InternalModelDsl.g:2460:3: rule__Relation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalModelDsl.g:2468:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2472:1: ( rule__Relation__Group__3__Impl )
            // InternalModelDsl.g:2473:2: rule__Relation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalModelDsl.g:2479:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__NavigableAssignment_3 )? ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2483:1: ( ( ( rule__Relation__NavigableAssignment_3 )? ) )
            // InternalModelDsl.g:2484:1: ( ( rule__Relation__NavigableAssignment_3 )? )
            {
            // InternalModelDsl.g:2484:1: ( ( rule__Relation__NavigableAssignment_3 )? )
            // InternalModelDsl.g:2485:2: ( rule__Relation__NavigableAssignment_3 )?
            {
             before(grammarAccess.getRelationAccess().getNavigableAssignment_3()); 
            // InternalModelDsl.g:2486:2: ( rule__Relation__NavigableAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=27 && LA32_0<=28)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModelDsl.g:2486:3: rule__Relation__NavigableAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__NavigableAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getNavigableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__DefAttribute__Group_0__0"
    // InternalModelDsl.g:2495:1: rule__DefAttribute__Group_0__0 : rule__DefAttribute__Group_0__0__Impl rule__DefAttribute__Group_0__1 ;
    public final void rule__DefAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2499:1: ( rule__DefAttribute__Group_0__0__Impl rule__DefAttribute__Group_0__1 )
            // InternalModelDsl.g:2500:2: rule__DefAttribute__Group_0__0__Impl rule__DefAttribute__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__DefAttribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefAttribute__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__Group_0__0"


    // $ANTLR start "rule__DefAttribute__Group_0__0__Impl"
    // InternalModelDsl.g:2507:1: rule__DefAttribute__Group_0__0__Impl : ( ( rule__DefAttribute__Alternatives_0_0 ) ) ;
    public final void rule__DefAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2511:1: ( ( ( rule__DefAttribute__Alternatives_0_0 ) ) )
            // InternalModelDsl.g:2512:1: ( ( rule__DefAttribute__Alternatives_0_0 ) )
            {
            // InternalModelDsl.g:2512:1: ( ( rule__DefAttribute__Alternatives_0_0 ) )
            // InternalModelDsl.g:2513:2: ( rule__DefAttribute__Alternatives_0_0 )
            {
             before(grammarAccess.getDefAttributeAccess().getAlternatives_0_0()); 
            // InternalModelDsl.g:2514:2: ( rule__DefAttribute__Alternatives_0_0 )
            // InternalModelDsl.g:2514:3: rule__DefAttribute__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefAttribute__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefAttributeAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__Group_0__0__Impl"


    // $ANTLR start "rule__DefAttribute__Group_0__1"
    // InternalModelDsl.g:2522:1: rule__DefAttribute__Group_0__1 : rule__DefAttribute__Group_0__1__Impl ;
    public final void rule__DefAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2526:1: ( rule__DefAttribute__Group_0__1__Impl )
            // InternalModelDsl.g:2527:2: rule__DefAttribute__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefAttribute__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__Group_0__1"


    // $ANTLR start "rule__DefAttribute__Group_0__1__Impl"
    // InternalModelDsl.g:2533:1: rule__DefAttribute__Group_0__1__Impl : ( ( rule__DefAttribute__NullableAssignment_0_1 )? ) ;
    public final void rule__DefAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2537:1: ( ( ( rule__DefAttribute__NullableAssignment_0_1 )? ) )
            // InternalModelDsl.g:2538:1: ( ( rule__DefAttribute__NullableAssignment_0_1 )? )
            {
            // InternalModelDsl.g:2538:1: ( ( rule__DefAttribute__NullableAssignment_0_1 )? )
            // InternalModelDsl.g:2539:2: ( rule__DefAttribute__NullableAssignment_0_1 )?
            {
             before(grammarAccess.getDefAttributeAccess().getNullableAssignment_0_1()); 
            // InternalModelDsl.g:2540:2: ( rule__DefAttribute__NullableAssignment_0_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=29 && LA33_0<=30)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModelDsl.g:2540:3: rule__DefAttribute__NullableAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefAttribute__NullableAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefAttributeAccess().getNullableAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__Group_0__1__Impl"


    // $ANTLR start "rule__DefIdAttribute__Group__0"
    // InternalModelDsl.g:2549:1: rule__DefIdAttribute__Group__0 : rule__DefIdAttribute__Group__0__Impl rule__DefIdAttribute__Group__1 ;
    public final void rule__DefIdAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2553:1: ( rule__DefIdAttribute__Group__0__Impl rule__DefIdAttribute__Group__1 )
            // InternalModelDsl.g:2554:2: rule__DefIdAttribute__Group__0__Impl rule__DefIdAttribute__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__DefIdAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefIdAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefIdAttribute__Group__0"


    // $ANTLR start "rule__DefIdAttribute__Group__0__Impl"
    // InternalModelDsl.g:2561:1: rule__DefIdAttribute__Group__0__Impl : ( ( rule__DefIdAttribute__Alternatives_0 ) ) ;
    public final void rule__DefIdAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2565:1: ( ( ( rule__DefIdAttribute__Alternatives_0 ) ) )
            // InternalModelDsl.g:2566:1: ( ( rule__DefIdAttribute__Alternatives_0 ) )
            {
            // InternalModelDsl.g:2566:1: ( ( rule__DefIdAttribute__Alternatives_0 ) )
            // InternalModelDsl.g:2567:2: ( rule__DefIdAttribute__Alternatives_0 )
            {
             before(grammarAccess.getDefIdAttributeAccess().getAlternatives_0()); 
            // InternalModelDsl.g:2568:2: ( rule__DefIdAttribute__Alternatives_0 )
            // InternalModelDsl.g:2568:3: rule__DefIdAttribute__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DefIdAttribute__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDefIdAttributeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefIdAttribute__Group__0__Impl"


    // $ANTLR start "rule__DefIdAttribute__Group__1"
    // InternalModelDsl.g:2576:1: rule__DefIdAttribute__Group__1 : rule__DefIdAttribute__Group__1__Impl ;
    public final void rule__DefIdAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2580:1: ( rule__DefIdAttribute__Group__1__Impl )
            // InternalModelDsl.g:2581:2: rule__DefIdAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefIdAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefIdAttribute__Group__1"


    // $ANTLR start "rule__DefIdAttribute__Group__1__Impl"
    // InternalModelDsl.g:2587:1: rule__DefIdAttribute__Group__1__Impl : ( 'id' ) ;
    public final void rule__DefIdAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2591:1: ( ( 'id' ) )
            // InternalModelDsl.g:2592:1: ( 'id' )
            {
            // InternalModelDsl.g:2592:1: ( 'id' )
            // InternalModelDsl.g:2593:2: 'id'
            {
             before(grammarAccess.getDefIdAttributeAccess().getIdKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDefIdAttributeAccess().getIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefIdAttribute__Group__1__Impl"


    // $ANTLR start "rule__DefAllModelTypeVariable__Group__0"
    // InternalModelDsl.g:2603:1: rule__DefAllModelTypeVariable__Group__0 : rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 ;
    public final void rule__DefAllModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2607:1: ( rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 )
            // InternalModelDsl.g:2608:2: rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefAllModelTypeVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAllModelTypeVariable__Group__0"


    // $ANTLR start "rule__DefAllModelTypeVariable__Group__0__Impl"
    // InternalModelDsl.g:2615:1: rule__DefAllModelTypeVariable__Group__0__Impl : ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2619:1: ( ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalModelDsl.g:2620:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalModelDsl.g:2620:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            // InternalModelDsl.g:2621:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalModelDsl.g:2622:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            // InternalModelDsl.g:2622:3: rule__DefAllModelTypeVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAllModelTypeVariable__Group__0__Impl"


    // $ANTLR start "rule__DefAllModelTypeVariable__Group__1"
    // InternalModelDsl.g:2630:1: rule__DefAllModelTypeVariable__Group__1 : rule__DefAllModelTypeVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2634:1: ( rule__DefAllModelTypeVariable__Group__1__Impl )
            // InternalModelDsl.g:2635:2: rule__DefAllModelTypeVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAllModelTypeVariable__Group__1"


    // $ANTLR start "rule__DefAllModelTypeVariable__Group__1__Impl"
    // InternalModelDsl.g:2641:1: rule__DefAllModelTypeVariable__Group__1__Impl : ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2645:1: ( ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2646:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2646:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            // InternalModelDsl.g:2647:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2648:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            // InternalModelDsl.g:2648:3: rule__DefAllModelTypeVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAllModelTypeVariable__Group__1__Impl"


    // $ANTLR start "rule__DefSimpleVariable__Group__0"
    // InternalModelDsl.g:2657:1: rule__DefSimpleVariable__Group__0 : rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 ;
    public final void rule__DefSimpleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2661:1: ( rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 )
            // InternalModelDsl.g:2662:2: rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefSimpleVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSimpleVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSimpleVariable__Group__0"


    // $ANTLR start "rule__DefSimpleVariable__Group__0__Impl"
    // InternalModelDsl.g:2669:1: rule__DefSimpleVariable__Group__0__Impl : ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2673:1: ( ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) )
            // InternalModelDsl.g:2674:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            {
            // InternalModelDsl.g:2674:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            // InternalModelDsl.g:2675:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0()); 
            // InternalModelDsl.g:2676:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            // InternalModelDsl.g:2676:3: rule__DefSimpleVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSimpleVariable__Group__0__Impl"


    // $ANTLR start "rule__DefSimpleVariable__Group__1"
    // InternalModelDsl.g:2684:1: rule__DefSimpleVariable__Group__1 : rule__DefSimpleVariable__Group__1__Impl ;
    public final void rule__DefSimpleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2688:1: ( rule__DefSimpleVariable__Group__1__Impl )
            // InternalModelDsl.g:2689:2: rule__DefSimpleVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSimpleVariable__Group__1"


    // $ANTLR start "rule__DefSimpleVariable__Group__1__Impl"
    // InternalModelDsl.g:2695:1: rule__DefSimpleVariable__Group__1__Impl : ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2699:1: ( ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2700:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2700:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            // InternalModelDsl.g:2701:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2702:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            // InternalModelDsl.g:2702:3: rule__DefSimpleVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSimpleVariable__Group__1__Impl"


    // $ANTLR start "rule__DefModelTypeVariable__Group__0"
    // InternalModelDsl.g:2711:1: rule__DefModelTypeVariable__Group__0 : rule__DefModelTypeVariable__Group__0__Impl rule__DefModelTypeVariable__Group__1 ;
    public final void rule__DefModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2715:1: ( rule__DefModelTypeVariable__Group__0__Impl rule__DefModelTypeVariable__Group__1 )
            // InternalModelDsl.g:2716:2: rule__DefModelTypeVariable__Group__0__Impl rule__DefModelTypeVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefModelTypeVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefModelTypeVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelTypeVariable__Group__0"


    // $ANTLR start "rule__DefModelTypeVariable__Group__0__Impl"
    // InternalModelDsl.g:2723:1: rule__DefModelTypeVariable__Group__0__Impl : ( ( rule__DefModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2727:1: ( ( ( rule__DefModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalModelDsl.g:2728:1: ( ( rule__DefModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalModelDsl.g:2728:1: ( ( rule__DefModelTypeVariable__TypeAssignment_0 ) )
            // InternalModelDsl.g:2729:2: ( rule__DefModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalModelDsl.g:2730:2: ( rule__DefModelTypeVariable__TypeAssignment_0 )
            // InternalModelDsl.g:2730:3: rule__DefModelTypeVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefModelTypeVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefModelTypeVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelTypeVariable__Group__0__Impl"


    // $ANTLR start "rule__DefModelTypeVariable__Group__1"
    // InternalModelDsl.g:2738:1: rule__DefModelTypeVariable__Group__1 : rule__DefModelTypeVariable__Group__1__Impl ;
    public final void rule__DefModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2742:1: ( rule__DefModelTypeVariable__Group__1__Impl )
            // InternalModelDsl.g:2743:2: rule__DefModelTypeVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefModelTypeVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelTypeVariable__Group__1"


    // $ANTLR start "rule__DefModelTypeVariable__Group__1__Impl"
    // InternalModelDsl.g:2749:1: rule__DefModelTypeVariable__Group__1__Impl : ( ( rule__DefModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2753:1: ( ( ( rule__DefModelTypeVariable__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2754:1: ( ( rule__DefModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2754:1: ( ( rule__DefModelTypeVariable__NameAssignment_1 ) )
            // InternalModelDsl.g:2755:2: ( rule__DefModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2756:2: ( rule__DefModelTypeVariable__NameAssignment_1 )
            // InternalModelDsl.g:2756:3: rule__DefModelTypeVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefModelTypeVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefModelTypeVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelTypeVariable__Group__1__Impl"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_0__0"
    // InternalModelDsl.g:2765:1: rule__DefCollectionTypeVariable__Group_0__0 : rule__DefCollectionTypeVariable__Group_0__0__Impl rule__DefCollectionTypeVariable__Group_0__1 ;
    public final void rule__DefCollectionTypeVariable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2769:1: ( rule__DefCollectionTypeVariable__Group_0__0__Impl rule__DefCollectionTypeVariable__Group_0__1 )
            // InternalModelDsl.g:2770:2: rule__DefCollectionTypeVariable__Group_0__0__Impl rule__DefCollectionTypeVariable__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__DefCollectionTypeVariable__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_0__0"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_0__0__Impl"
    // InternalModelDsl.g:2777:1: rule__DefCollectionTypeVariable__Group_0__0__Impl : ( ( rule__DefCollectionTypeVariable__TypeAssignment_0_0 ) ) ;
    public final void rule__DefCollectionTypeVariable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2781:1: ( ( ( rule__DefCollectionTypeVariable__TypeAssignment_0_0 ) ) )
            // InternalModelDsl.g:2782:1: ( ( rule__DefCollectionTypeVariable__TypeAssignment_0_0 ) )
            {
            // InternalModelDsl.g:2782:1: ( ( rule__DefCollectionTypeVariable__TypeAssignment_0_0 ) )
            // InternalModelDsl.g:2783:2: ( rule__DefCollectionTypeVariable__TypeAssignment_0_0 )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAssignment_0_0()); 
            // InternalModelDsl.g:2784:2: ( rule__DefCollectionTypeVariable__TypeAssignment_0_0 )
            // InternalModelDsl.g:2784:3: rule__DefCollectionTypeVariable__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_0__0__Impl"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_0__1"
    // InternalModelDsl.g:2792:1: rule__DefCollectionTypeVariable__Group_0__1 : rule__DefCollectionTypeVariable__Group_0__1__Impl ;
    public final void rule__DefCollectionTypeVariable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2796:1: ( rule__DefCollectionTypeVariable__Group_0__1__Impl )
            // InternalModelDsl.g:2797:2: rule__DefCollectionTypeVariable__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_0__1"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_0__1__Impl"
    // InternalModelDsl.g:2803:1: rule__DefCollectionTypeVariable__Group_0__1__Impl : ( ( rule__DefCollectionTypeVariable__NameAssignment_0_1 ) ) ;
    public final void rule__DefCollectionTypeVariable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2807:1: ( ( ( rule__DefCollectionTypeVariable__NameAssignment_0_1 ) ) )
            // InternalModelDsl.g:2808:1: ( ( rule__DefCollectionTypeVariable__NameAssignment_0_1 ) )
            {
            // InternalModelDsl.g:2808:1: ( ( rule__DefCollectionTypeVariable__NameAssignment_0_1 ) )
            // InternalModelDsl.g:2809:2: ( rule__DefCollectionTypeVariable__NameAssignment_0_1 )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getNameAssignment_0_1()); 
            // InternalModelDsl.g:2810:2: ( rule__DefCollectionTypeVariable__NameAssignment_0_1 )
            // InternalModelDsl.g:2810:3: rule__DefCollectionTypeVariable__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDefCollectionTypeVariableAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_0__1__Impl"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_1__0"
    // InternalModelDsl.g:2819:1: rule__DefCollectionTypeVariable__Group_1__0 : rule__DefCollectionTypeVariable__Group_1__0__Impl rule__DefCollectionTypeVariable__Group_1__1 ;
    public final void rule__DefCollectionTypeVariable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2823:1: ( rule__DefCollectionTypeVariable__Group_1__0__Impl rule__DefCollectionTypeVariable__Group_1__1 )
            // InternalModelDsl.g:2824:2: rule__DefCollectionTypeVariable__Group_1__0__Impl rule__DefCollectionTypeVariable__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DefCollectionTypeVariable__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_1__0"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_1__0__Impl"
    // InternalModelDsl.g:2831:1: rule__DefCollectionTypeVariable__Group_1__0__Impl : ( ( rule__DefCollectionTypeVariable__TypeAssignment_1_0 ) ) ;
    public final void rule__DefCollectionTypeVariable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2835:1: ( ( ( rule__DefCollectionTypeVariable__TypeAssignment_1_0 ) ) )
            // InternalModelDsl.g:2836:1: ( ( rule__DefCollectionTypeVariable__TypeAssignment_1_0 ) )
            {
            // InternalModelDsl.g:2836:1: ( ( rule__DefCollectionTypeVariable__TypeAssignment_1_0 ) )
            // InternalModelDsl.g:2837:2: ( rule__DefCollectionTypeVariable__TypeAssignment_1_0 )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAssignment_1_0()); 
            // InternalModelDsl.g:2838:2: ( rule__DefCollectionTypeVariable__TypeAssignment_1_0 )
            // InternalModelDsl.g:2838:3: rule__DefCollectionTypeVariable__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_1__0__Impl"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_1__1"
    // InternalModelDsl.g:2846:1: rule__DefCollectionTypeVariable__Group_1__1 : rule__DefCollectionTypeVariable__Group_1__1__Impl ;
    public final void rule__DefCollectionTypeVariable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2850:1: ( rule__DefCollectionTypeVariable__Group_1__1__Impl )
            // InternalModelDsl.g:2851:2: rule__DefCollectionTypeVariable__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_1__1"


    // $ANTLR start "rule__DefCollectionTypeVariable__Group_1__1__Impl"
    // InternalModelDsl.g:2857:1: rule__DefCollectionTypeVariable__Group_1__1__Impl : ( ( rule__DefCollectionTypeVariable__NameAssignment_1_1 ) ) ;
    public final void rule__DefCollectionTypeVariable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2861:1: ( ( ( rule__DefCollectionTypeVariable__NameAssignment_1_1 ) ) )
            // InternalModelDsl.g:2862:1: ( ( rule__DefCollectionTypeVariable__NameAssignment_1_1 ) )
            {
            // InternalModelDsl.g:2862:1: ( ( rule__DefCollectionTypeVariable__NameAssignment_1_1 ) )
            // InternalModelDsl.g:2863:2: ( rule__DefCollectionTypeVariable__NameAssignment_1_1 )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getNameAssignment_1_1()); 
            // InternalModelDsl.g:2864:2: ( rule__DefCollectionTypeVariable__NameAssignment_1_1 )
            // InternalModelDsl.g:2864:3: rule__DefCollectionTypeVariable__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefCollectionTypeVariable__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDefCollectionTypeVariableAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__Group_1__1__Impl"


    // $ANTLR start "rule__DefModelModelTypeCollectionVariable__Group__0"
    // InternalModelDsl.g:2873:1: rule__DefModelModelTypeCollectionVariable__Group__0 : rule__DefModelModelTypeCollectionVariable__Group__0__Impl rule__DefModelModelTypeCollectionVariable__Group__1 ;
    public final void rule__DefModelModelTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2877:1: ( rule__DefModelModelTypeCollectionVariable__Group__0__Impl rule__DefModelModelTypeCollectionVariable__Group__1 )
            // InternalModelDsl.g:2878:2: rule__DefModelModelTypeCollectionVariable__Group__0__Impl rule__DefModelModelTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefModelModelTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefModelModelTypeCollectionVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelModelTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefModelModelTypeCollectionVariable__Group__0__Impl"
    // InternalModelDsl.g:2885:1: rule__DefModelModelTypeCollectionVariable__Group__0__Impl : ( ( rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefModelModelTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2889:1: ( ( ( rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalModelDsl.g:2890:1: ( ( rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalModelDsl.g:2890:1: ( ( rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalModelDsl.g:2891:2: ( rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalModelDsl.g:2892:2: ( rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 )
            // InternalModelDsl.g:2892:3: rule__DefModelModelTypeCollectionVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefModelModelTypeCollectionVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelModelTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefModelModelTypeCollectionVariable__Group__1"
    // InternalModelDsl.g:2900:1: rule__DefModelModelTypeCollectionVariable__Group__1 : rule__DefModelModelTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefModelModelTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2904:1: ( rule__DefModelModelTypeCollectionVariable__Group__1__Impl )
            // InternalModelDsl.g:2905:2: rule__DefModelModelTypeCollectionVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefModelModelTypeCollectionVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelModelTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefModelModelTypeCollectionVariable__Group__1__Impl"
    // InternalModelDsl.g:2911:1: rule__DefModelModelTypeCollectionVariable__Group__1__Impl : ( ( rule__DefModelModelTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefModelModelTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2915:1: ( ( ( rule__DefModelModelTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2916:1: ( ( rule__DefModelModelTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2916:1: ( ( rule__DefModelModelTypeCollectionVariable__NameAssignment_1 ) )
            // InternalModelDsl.g:2917:2: ( rule__DefModelModelTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2918:2: ( rule__DefModelModelTypeCollectionVariable__NameAssignment_1 )
            // InternalModelDsl.g:2918:3: rule__DefModelModelTypeCollectionVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefModelModelTypeCollectionVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelModelTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__DefModelSimpleTypeCollectionVariable__Group__0"
    // InternalModelDsl.g:2927:1: rule__DefModelSimpleTypeCollectionVariable__Group__0 : rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl rule__DefModelSimpleTypeCollectionVariable__Group__1 ;
    public final void rule__DefModelSimpleTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2931:1: ( rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl rule__DefModelSimpleTypeCollectionVariable__Group__1 )
            // InternalModelDsl.g:2932:2: rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl rule__DefModelSimpleTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefModelSimpleTypeCollectionVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelSimpleTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl"
    // InternalModelDsl.g:2939:1: rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl : ( ( rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2943:1: ( ( ( rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalModelDsl.g:2944:1: ( ( rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalModelDsl.g:2944:1: ( ( rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalModelDsl.g:2945:2: ( rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalModelDsl.g:2946:2: ( rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 )
            // InternalModelDsl.g:2946:3: rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelSimpleTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefModelSimpleTypeCollectionVariable__Group__1"
    // InternalModelDsl.g:2954:1: rule__DefModelSimpleTypeCollectionVariable__Group__1 : rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefModelSimpleTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2958:1: ( rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl )
            // InternalModelDsl.g:2959:2: rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelSimpleTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl"
    // InternalModelDsl.g:2965:1: rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl : ( ( rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2969:1: ( ( ( rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalModelDsl.g:2970:1: ( ( rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:2970:1: ( ( rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 ) )
            // InternalModelDsl.g:2971:2: ( rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:2972:2: ( rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 )
            // InternalModelDsl.g:2972:3: rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelSimpleTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__DefLinkVariable__Group__0"
    // InternalModelDsl.g:2981:1: rule__DefLinkVariable__Group__0 : rule__DefLinkVariable__Group__0__Impl rule__DefLinkVariable__Group__1 ;
    public final void rule__DefLinkVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2985:1: ( rule__DefLinkVariable__Group__0__Impl rule__DefLinkVariable__Group__1 )
            // InternalModelDsl.g:2986:2: rule__DefLinkVariable__Group__0__Impl rule__DefLinkVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefLinkVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefLinkVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__Group__0"


    // $ANTLR start "rule__DefLinkVariable__Group__0__Impl"
    // InternalModelDsl.g:2993:1: rule__DefLinkVariable__Group__0__Impl : ( 'Link.' ) ;
    public final void rule__DefLinkVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:2997:1: ( ( 'Link.' ) )
            // InternalModelDsl.g:2998:1: ( 'Link.' )
            {
            // InternalModelDsl.g:2998:1: ( 'Link.' )
            // InternalModelDsl.g:2999:2: 'Link.'
            {
             before(grammarAccess.getDefLinkVariableAccess().getLinkKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDefLinkVariableAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__Group__0__Impl"


    // $ANTLR start "rule__DefLinkVariable__Group__1"
    // InternalModelDsl.g:3008:1: rule__DefLinkVariable__Group__1 : rule__DefLinkVariable__Group__1__Impl rule__DefLinkVariable__Group__2 ;
    public final void rule__DefLinkVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3012:1: ( rule__DefLinkVariable__Group__1__Impl rule__DefLinkVariable__Group__2 )
            // InternalModelDsl.g:3013:2: rule__DefLinkVariable__Group__1__Impl rule__DefLinkVariable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DefLinkVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefLinkVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__Group__1"


    // $ANTLR start "rule__DefLinkVariable__Group__1__Impl"
    // InternalModelDsl.g:3020:1: rule__DefLinkVariable__Group__1__Impl : ( ( rule__DefLinkVariable__TypeAssignment_1 ) ) ;
    public final void rule__DefLinkVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3024:1: ( ( ( rule__DefLinkVariable__TypeAssignment_1 ) ) )
            // InternalModelDsl.g:3025:1: ( ( rule__DefLinkVariable__TypeAssignment_1 ) )
            {
            // InternalModelDsl.g:3025:1: ( ( rule__DefLinkVariable__TypeAssignment_1 ) )
            // InternalModelDsl.g:3026:2: ( rule__DefLinkVariable__TypeAssignment_1 )
            {
             before(grammarAccess.getDefLinkVariableAccess().getTypeAssignment_1()); 
            // InternalModelDsl.g:3027:2: ( rule__DefLinkVariable__TypeAssignment_1 )
            // InternalModelDsl.g:3027:3: rule__DefLinkVariable__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefLinkVariable__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefLinkVariableAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__Group__1__Impl"


    // $ANTLR start "rule__DefLinkVariable__Group__2"
    // InternalModelDsl.g:3035:1: rule__DefLinkVariable__Group__2 : rule__DefLinkVariable__Group__2__Impl ;
    public final void rule__DefLinkVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3039:1: ( rule__DefLinkVariable__Group__2__Impl )
            // InternalModelDsl.g:3040:2: rule__DefLinkVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefLinkVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__Group__2"


    // $ANTLR start "rule__DefLinkVariable__Group__2__Impl"
    // InternalModelDsl.g:3046:1: rule__DefLinkVariable__Group__2__Impl : ( ( rule__DefLinkVariable__NameAssignment_2 ) ) ;
    public final void rule__DefLinkVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3050:1: ( ( ( rule__DefLinkVariable__NameAssignment_2 ) ) )
            // InternalModelDsl.g:3051:1: ( ( rule__DefLinkVariable__NameAssignment_2 ) )
            {
            // InternalModelDsl.g:3051:1: ( ( rule__DefLinkVariable__NameAssignment_2 ) )
            // InternalModelDsl.g:3052:2: ( rule__DefLinkVariable__NameAssignment_2 )
            {
             before(grammarAccess.getDefLinkVariableAccess().getNameAssignment_2()); 
            // InternalModelDsl.g:3053:2: ( rule__DefLinkVariable__NameAssignment_2 )
            // InternalModelDsl.g:3053:3: rule__DefLinkVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefLinkVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefLinkVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__Group__2__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__0"
    // InternalModelDsl.g:3062:1: rule__MethodSimpleReturn__Group__0 : rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 ;
    public final void rule__MethodSimpleReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3066:1: ( rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 )
            // InternalModelDsl.g:3067:2: rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodSimpleReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__0"


    // $ANTLR start "rule__MethodSimpleReturn__Group__0__Impl"
    // InternalModelDsl.g:3074:1: rule__MethodSimpleReturn__Group__0__Impl : ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3078:1: ( ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) )
            // InternalModelDsl.g:3079:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalModelDsl.g:3079:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            // InternalModelDsl.g:3080:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0()); 
            // InternalModelDsl.g:3081:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            // InternalModelDsl.g:3081:3: rule__MethodSimpleReturn__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__0__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__1"
    // InternalModelDsl.g:3089:1: rule__MethodSimpleReturn__Group__1 : rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 ;
    public final void rule__MethodSimpleReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3093:1: ( rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 )
            // InternalModelDsl.g:3094:2: rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MethodSimpleReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__1"


    // $ANTLR start "rule__MethodSimpleReturn__Group__1__Impl"
    // InternalModelDsl.g:3101:1: rule__MethodSimpleReturn__Group__1__Impl : ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3105:1: ( ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) )
            // InternalModelDsl.g:3106:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:3106:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            // InternalModelDsl.g:3107:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:3108:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            // InternalModelDsl.g:3108:3: rule__MethodSimpleReturn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__1__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__2"
    // InternalModelDsl.g:3116:1: rule__MethodSimpleReturn__Group__2 : rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 ;
    public final void rule__MethodSimpleReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3120:1: ( rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 )
            // InternalModelDsl.g:3121:2: rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__MethodSimpleReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__2"


    // $ANTLR start "rule__MethodSimpleReturn__Group__2__Impl"
    // InternalModelDsl.g:3128:1: rule__MethodSimpleReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodSimpleReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3132:1: ( ( '(' ) )
            // InternalModelDsl.g:3133:1: ( '(' )
            {
            // InternalModelDsl.g:3133:1: ( '(' )
            // InternalModelDsl.g:3134:2: '('
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__2__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__3"
    // InternalModelDsl.g:3143:1: rule__MethodSimpleReturn__Group__3 : rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 ;
    public final void rule__MethodSimpleReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3147:1: ( rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 )
            // InternalModelDsl.g:3148:2: rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__MethodSimpleReturn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__3"


    // $ANTLR start "rule__MethodSimpleReturn__Group__3__Impl"
    // InternalModelDsl.g:3155:1: rule__MethodSimpleReturn__Group__3__Impl : ( ( rule__MethodSimpleReturn__Group_3__0 )? ) ;
    public final void rule__MethodSimpleReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3159:1: ( ( ( rule__MethodSimpleReturn__Group_3__0 )? ) )
            // InternalModelDsl.g:3160:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            {
            // InternalModelDsl.g:3160:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            // InternalModelDsl.g:3161:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3()); 
            // InternalModelDsl.g:3162:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_DATE && LA34_0<=RULE_SET)||(LA34_0>=RULE_TYPE_INT && LA34_0<=RULE_TYPE_BINARY)||LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModelDsl.g:3162:3: rule__MethodSimpleReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodSimpleReturn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodSimpleReturnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__3__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__4"
    // InternalModelDsl.g:3170:1: rule__MethodSimpleReturn__Group__4 : rule__MethodSimpleReturn__Group__4__Impl ;
    public final void rule__MethodSimpleReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3174:1: ( rule__MethodSimpleReturn__Group__4__Impl )
            // InternalModelDsl.g:3175:2: rule__MethodSimpleReturn__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__4"


    // $ANTLR start "rule__MethodSimpleReturn__Group__4__Impl"
    // InternalModelDsl.g:3181:1: rule__MethodSimpleReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodSimpleReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3185:1: ( ( ')' ) )
            // InternalModelDsl.g:3186:1: ( ')' )
            {
            // InternalModelDsl.g:3186:1: ( ')' )
            // InternalModelDsl.g:3187:2: ')'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__4__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3__0"
    // InternalModelDsl.g:3197:1: rule__MethodSimpleReturn__Group_3__0 : rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 ;
    public final void rule__MethodSimpleReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3201:1: ( rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 )
            // InternalModelDsl.g:3202:2: rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__MethodSimpleReturn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3__0"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3__0__Impl"
    // InternalModelDsl.g:3209:1: rule__MethodSimpleReturn__Group_3__0__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3213:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) )
            // InternalModelDsl.g:3214:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            {
            // InternalModelDsl.g:3214:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            // InternalModelDsl.g:3215:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0()); 
            // InternalModelDsl.g:3216:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            // InternalModelDsl.g:3216:3: rule__MethodSimpleReturn__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3__0__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3__1"
    // InternalModelDsl.g:3224:1: rule__MethodSimpleReturn__Group_3__1 : rule__MethodSimpleReturn__Group_3__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3228:1: ( rule__MethodSimpleReturn__Group_3__1__Impl )
            // InternalModelDsl.g:3229:2: rule__MethodSimpleReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3__1"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3__1__Impl"
    // InternalModelDsl.g:3235:1: rule__MethodSimpleReturn__Group_3__1__Impl : ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodSimpleReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3239:1: ( ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) )
            // InternalModelDsl.g:3240:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            {
            // InternalModelDsl.g:3240:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            // InternalModelDsl.g:3241:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1()); 
            // InternalModelDsl.g:3242:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==43) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalModelDsl.g:3242:3: rule__MethodSimpleReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__MethodSimpleReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3__1__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3_1__0"
    // InternalModelDsl.g:3251:1: rule__MethodSimpleReturn__Group_3_1__0 : rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 ;
    public final void rule__MethodSimpleReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3255:1: ( rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 )
            // InternalModelDsl.g:3256:2: rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MethodSimpleReturn__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3_1__0"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3_1__0__Impl"
    // InternalModelDsl.g:3263:1: rule__MethodSimpleReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3267:1: ( ( ',' ) )
            // InternalModelDsl.g:3268:1: ( ',' )
            {
            // InternalModelDsl.g:3268:1: ( ',' )
            // InternalModelDsl.g:3269:2: ','
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3_1__0__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3_1__1"
    // InternalModelDsl.g:3278:1: rule__MethodSimpleReturn__Group_3_1__1 : rule__MethodSimpleReturn__Group_3_1__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3282:1: ( rule__MethodSimpleReturn__Group_3_1__1__Impl )
            // InternalModelDsl.g:3283:2: rule__MethodSimpleReturn__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3_1__1"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3_1__1__Impl"
    // InternalModelDsl.g:3289:1: rule__MethodSimpleReturn__Group_3_1__1__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3293:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalModelDsl.g:3294:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalModelDsl.g:3294:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            // InternalModelDsl.g:3295:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalModelDsl.g:3296:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            // InternalModelDsl.g:3296:3: rule__MethodSimpleReturn__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group_3_1__1__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group__0"
    // InternalModelDsl.g:3305:1: rule__MethodCollectionReturn__Group__0 : rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 ;
    public final void rule__MethodCollectionReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3309:1: ( rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 )
            // InternalModelDsl.g:3310:2: rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodCollectionReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__0"


    // $ANTLR start "rule__MethodCollectionReturn__Group__0__Impl"
    // InternalModelDsl.g:3317:1: rule__MethodCollectionReturn__Group__0__Impl : ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3321:1: ( ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) )
            // InternalModelDsl.g:3322:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalModelDsl.g:3322:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            // InternalModelDsl.g:3323:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0()); 
            // InternalModelDsl.g:3324:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            // InternalModelDsl.g:3324:3: rule__MethodCollectionReturn__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__0__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group__1"
    // InternalModelDsl.g:3332:1: rule__MethodCollectionReturn__Group__1 : rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 ;
    public final void rule__MethodCollectionReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3336:1: ( rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 )
            // InternalModelDsl.g:3337:2: rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MethodCollectionReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__1"


    // $ANTLR start "rule__MethodCollectionReturn__Group__1__Impl"
    // InternalModelDsl.g:3344:1: rule__MethodCollectionReturn__Group__1__Impl : ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3348:1: ( ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) )
            // InternalModelDsl.g:3349:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:3349:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            // InternalModelDsl.g:3350:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:3351:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            // InternalModelDsl.g:3351:3: rule__MethodCollectionReturn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__1__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group__2"
    // InternalModelDsl.g:3359:1: rule__MethodCollectionReturn__Group__2 : rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 ;
    public final void rule__MethodCollectionReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3363:1: ( rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 )
            // InternalModelDsl.g:3364:2: rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__MethodCollectionReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__2"


    // $ANTLR start "rule__MethodCollectionReturn__Group__2__Impl"
    // InternalModelDsl.g:3371:1: rule__MethodCollectionReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodCollectionReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3375:1: ( ( '(' ) )
            // InternalModelDsl.g:3376:1: ( '(' )
            {
            // InternalModelDsl.g:3376:1: ( '(' )
            // InternalModelDsl.g:3377:2: '('
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__2__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group__3"
    // InternalModelDsl.g:3386:1: rule__MethodCollectionReturn__Group__3 : rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 ;
    public final void rule__MethodCollectionReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3390:1: ( rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 )
            // InternalModelDsl.g:3391:2: rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__MethodCollectionReturn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__3"


    // $ANTLR start "rule__MethodCollectionReturn__Group__3__Impl"
    // InternalModelDsl.g:3398:1: rule__MethodCollectionReturn__Group__3__Impl : ( ( rule__MethodCollectionReturn__Group_3__0 )? ) ;
    public final void rule__MethodCollectionReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3402:1: ( ( ( rule__MethodCollectionReturn__Group_3__0 )? ) )
            // InternalModelDsl.g:3403:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            {
            // InternalModelDsl.g:3403:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            // InternalModelDsl.g:3404:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3()); 
            // InternalModelDsl.g:3405:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_DATE && LA36_0<=RULE_SET)||(LA36_0>=RULE_TYPE_INT && LA36_0<=RULE_TYPE_BINARY)||LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModelDsl.g:3405:3: rule__MethodCollectionReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCollectionReturn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodCollectionReturnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__3__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group__4"
    // InternalModelDsl.g:3413:1: rule__MethodCollectionReturn__Group__4 : rule__MethodCollectionReturn__Group__4__Impl ;
    public final void rule__MethodCollectionReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3417:1: ( rule__MethodCollectionReturn__Group__4__Impl )
            // InternalModelDsl.g:3418:2: rule__MethodCollectionReturn__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__4"


    // $ANTLR start "rule__MethodCollectionReturn__Group__4__Impl"
    // InternalModelDsl.g:3424:1: rule__MethodCollectionReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodCollectionReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3428:1: ( ( ')' ) )
            // InternalModelDsl.g:3429:1: ( ')' )
            {
            // InternalModelDsl.g:3429:1: ( ')' )
            // InternalModelDsl.g:3430:2: ')'
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group__4__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3__0"
    // InternalModelDsl.g:3440:1: rule__MethodCollectionReturn__Group_3__0 : rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 ;
    public final void rule__MethodCollectionReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3444:1: ( rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 )
            // InternalModelDsl.g:3445:2: rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__MethodCollectionReturn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3__0"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3__0__Impl"
    // InternalModelDsl.g:3452:1: rule__MethodCollectionReturn__Group_3__0__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3456:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) )
            // InternalModelDsl.g:3457:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            {
            // InternalModelDsl.g:3457:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            // InternalModelDsl.g:3458:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0()); 
            // InternalModelDsl.g:3459:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            // InternalModelDsl.g:3459:3: rule__MethodCollectionReturn__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3__0__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3__1"
    // InternalModelDsl.g:3467:1: rule__MethodCollectionReturn__Group_3__1 : rule__MethodCollectionReturn__Group_3__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3471:1: ( rule__MethodCollectionReturn__Group_3__1__Impl )
            // InternalModelDsl.g:3472:2: rule__MethodCollectionReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3__1"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3__1__Impl"
    // InternalModelDsl.g:3478:1: rule__MethodCollectionReturn__Group_3__1__Impl : ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodCollectionReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3482:1: ( ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) )
            // InternalModelDsl.g:3483:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            {
            // InternalModelDsl.g:3483:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            // InternalModelDsl.g:3484:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1()); 
            // InternalModelDsl.g:3485:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==43) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalModelDsl.g:3485:3: rule__MethodCollectionReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__MethodCollectionReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3__1__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3_1__0"
    // InternalModelDsl.g:3494:1: rule__MethodCollectionReturn__Group_3_1__0 : rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 ;
    public final void rule__MethodCollectionReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3498:1: ( rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 )
            // InternalModelDsl.g:3499:2: rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MethodCollectionReturn__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3_1__0"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3_1__0__Impl"
    // InternalModelDsl.g:3506:1: rule__MethodCollectionReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3510:1: ( ( ',' ) )
            // InternalModelDsl.g:3511:1: ( ',' )
            {
            // InternalModelDsl.g:3511:1: ( ',' )
            // InternalModelDsl.g:3512:2: ','
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3_1__0__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3_1__1"
    // InternalModelDsl.g:3521:1: rule__MethodCollectionReturn__Group_3_1__1 : rule__MethodCollectionReturn__Group_3_1__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3525:1: ( rule__MethodCollectionReturn__Group_3_1__1__Impl )
            // InternalModelDsl.g:3526:2: rule__MethodCollectionReturn__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3_1__1"


    // $ANTLR start "rule__MethodCollectionReturn__Group_3_1__1__Impl"
    // InternalModelDsl.g:3532:1: rule__MethodCollectionReturn__Group_3_1__1__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3536:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalModelDsl.g:3537:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalModelDsl.g:3537:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            // InternalModelDsl.g:3538:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalModelDsl.g:3539:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            // InternalModelDsl.g:3539:3: rule__MethodCollectionReturn__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodCollectionReturn__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__Group_3_1__1__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group__0"
    // InternalModelDsl.g:3548:1: rule__MethodAllModelReturn__Group__0 : rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1 ;
    public final void rule__MethodAllModelReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3552:1: ( rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1 )
            // InternalModelDsl.g:3553:2: rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodAllModelReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__0"


    // $ANTLR start "rule__MethodAllModelReturn__Group__0__Impl"
    // InternalModelDsl.g:3560:1: rule__MethodAllModelReturn__Group__0__Impl : ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodAllModelReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3564:1: ( ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) ) )
            // InternalModelDsl.g:3565:1: ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalModelDsl.g:3565:1: ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) )
            // InternalModelDsl.g:3566:2: ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAssignment_0()); 
            // InternalModelDsl.g:3567:2: ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 )
            // InternalModelDsl.g:3567:3: rule__MethodAllModelReturn__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__0__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group__1"
    // InternalModelDsl.g:3575:1: rule__MethodAllModelReturn__Group__1 : rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2 ;
    public final void rule__MethodAllModelReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3579:1: ( rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2 )
            // InternalModelDsl.g:3580:2: rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MethodAllModelReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__1"


    // $ANTLR start "rule__MethodAllModelReturn__Group__1__Impl"
    // InternalModelDsl.g:3587:1: rule__MethodAllModelReturn__Group__1__Impl : ( ( rule__MethodAllModelReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodAllModelReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3591:1: ( ( ( rule__MethodAllModelReturn__NameAssignment_1 ) ) )
            // InternalModelDsl.g:3592:1: ( ( rule__MethodAllModelReturn__NameAssignment_1 ) )
            {
            // InternalModelDsl.g:3592:1: ( ( rule__MethodAllModelReturn__NameAssignment_1 ) )
            // InternalModelDsl.g:3593:2: ( rule__MethodAllModelReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getNameAssignment_1()); 
            // InternalModelDsl.g:3594:2: ( rule__MethodAllModelReturn__NameAssignment_1 )
            // InternalModelDsl.g:3594:3: rule__MethodAllModelReturn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAllModelReturnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__1__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group__2"
    // InternalModelDsl.g:3602:1: rule__MethodAllModelReturn__Group__2 : rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3 ;
    public final void rule__MethodAllModelReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3606:1: ( rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3 )
            // InternalModelDsl.g:3607:2: rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__MethodAllModelReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__2"


    // $ANTLR start "rule__MethodAllModelReturn__Group__2__Impl"
    // InternalModelDsl.g:3614:1: rule__MethodAllModelReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodAllModelReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3618:1: ( ( '(' ) )
            // InternalModelDsl.g:3619:1: ( '(' )
            {
            // InternalModelDsl.g:3619:1: ( '(' )
            // InternalModelDsl.g:3620:2: '('
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMethodAllModelReturnAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__2__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group__3"
    // InternalModelDsl.g:3629:1: rule__MethodAllModelReturn__Group__3 : rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4 ;
    public final void rule__MethodAllModelReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3633:1: ( rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4 )
            // InternalModelDsl.g:3634:2: rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__MethodAllModelReturn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__3"


    // $ANTLR start "rule__MethodAllModelReturn__Group__3__Impl"
    // InternalModelDsl.g:3641:1: rule__MethodAllModelReturn__Group__3__Impl : ( ( rule__MethodAllModelReturn__Group_3__0 )? ) ;
    public final void rule__MethodAllModelReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3645:1: ( ( ( rule__MethodAllModelReturn__Group_3__0 )? ) )
            // InternalModelDsl.g:3646:1: ( ( rule__MethodAllModelReturn__Group_3__0 )? )
            {
            // InternalModelDsl.g:3646:1: ( ( rule__MethodAllModelReturn__Group_3__0 )? )
            // InternalModelDsl.g:3647:2: ( rule__MethodAllModelReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup_3()); 
            // InternalModelDsl.g:3648:2: ( rule__MethodAllModelReturn__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_DATE && LA38_0<=RULE_SET)||(LA38_0>=RULE_TYPE_INT && LA38_0<=RULE_TYPE_BINARY)||LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModelDsl.g:3648:3: rule__MethodAllModelReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodAllModelReturn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAllModelReturnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__3__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group__4"
    // InternalModelDsl.g:3656:1: rule__MethodAllModelReturn__Group__4 : rule__MethodAllModelReturn__Group__4__Impl ;
    public final void rule__MethodAllModelReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3660:1: ( rule__MethodAllModelReturn__Group__4__Impl )
            // InternalModelDsl.g:3661:2: rule__MethodAllModelReturn__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__4"


    // $ANTLR start "rule__MethodAllModelReturn__Group__4__Impl"
    // InternalModelDsl.g:3667:1: rule__MethodAllModelReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodAllModelReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3671:1: ( ( ')' ) )
            // InternalModelDsl.g:3672:1: ( ')' )
            {
            // InternalModelDsl.g:3672:1: ( ')' )
            // InternalModelDsl.g:3673:2: ')'
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMethodAllModelReturnAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group__4__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3__0"
    // InternalModelDsl.g:3683:1: rule__MethodAllModelReturn__Group_3__0 : rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1 ;
    public final void rule__MethodAllModelReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3687:1: ( rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1 )
            // InternalModelDsl.g:3688:2: rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__MethodAllModelReturn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3__0"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3__0__Impl"
    // InternalModelDsl.g:3695:1: rule__MethodAllModelReturn__Group_3__0__Impl : ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodAllModelReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3699:1: ( ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) ) )
            // InternalModelDsl.g:3700:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) )
            {
            // InternalModelDsl.g:3700:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) )
            // InternalModelDsl.g:3701:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_0()); 
            // InternalModelDsl.g:3702:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_0 )
            // InternalModelDsl.g:3702:3: rule__MethodAllModelReturn__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3__0__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3__1"
    // InternalModelDsl.g:3710:1: rule__MethodAllModelReturn__Group_3__1 : rule__MethodAllModelReturn__Group_3__1__Impl ;
    public final void rule__MethodAllModelReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3714:1: ( rule__MethodAllModelReturn__Group_3__1__Impl )
            // InternalModelDsl.g:3715:2: rule__MethodAllModelReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3__1"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3__1__Impl"
    // InternalModelDsl.g:3721:1: rule__MethodAllModelReturn__Group_3__1__Impl : ( ( rule__MethodAllModelReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodAllModelReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3725:1: ( ( ( rule__MethodAllModelReturn__Group_3_1__0 )* ) )
            // InternalModelDsl.g:3726:1: ( ( rule__MethodAllModelReturn__Group_3_1__0 )* )
            {
            // InternalModelDsl.g:3726:1: ( ( rule__MethodAllModelReturn__Group_3_1__0 )* )
            // InternalModelDsl.g:3727:2: ( rule__MethodAllModelReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup_3_1()); 
            // InternalModelDsl.g:3728:2: ( rule__MethodAllModelReturn__Group_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalModelDsl.g:3728:3: rule__MethodAllModelReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__MethodAllModelReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getMethodAllModelReturnAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3__1__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3_1__0"
    // InternalModelDsl.g:3737:1: rule__MethodAllModelReturn__Group_3_1__0 : rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1 ;
    public final void rule__MethodAllModelReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3741:1: ( rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1 )
            // InternalModelDsl.g:3742:2: rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MethodAllModelReturn__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3_1__0"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3_1__0__Impl"
    // InternalModelDsl.g:3749:1: rule__MethodAllModelReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodAllModelReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3753:1: ( ( ',' ) )
            // InternalModelDsl.g:3754:1: ( ',' )
            {
            // InternalModelDsl.g:3754:1: ( ',' )
            // InternalModelDsl.g:3755:2: ','
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodAllModelReturnAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3_1__0__Impl"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3_1__1"
    // InternalModelDsl.g:3764:1: rule__MethodAllModelReturn__Group_3_1__1 : rule__MethodAllModelReturn__Group_3_1__1__Impl ;
    public final void rule__MethodAllModelReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3768:1: ( rule__MethodAllModelReturn__Group_3_1__1__Impl )
            // InternalModelDsl.g:3769:2: rule__MethodAllModelReturn__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3_1__1"


    // $ANTLR start "rule__MethodAllModelReturn__Group_3_1__1__Impl"
    // InternalModelDsl.g:3775:1: rule__MethodAllModelReturn__Group_3_1__1__Impl : ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodAllModelReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3779:1: ( ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalModelDsl.g:3780:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalModelDsl.g:3780:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) )
            // InternalModelDsl.g:3781:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalModelDsl.g:3782:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 )
            // InternalModelDsl.g:3782:3: rule__MethodAllModelReturn__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodAllModelReturn__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__Group_3_1__1__Impl"


    // $ANTLR start "rule__AllModelTypeCollection__Group__0"
    // InternalModelDsl.g:3791:1: rule__AllModelTypeCollection__Group__0 : rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 ;
    public final void rule__AllModelTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3795:1: ( rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 )
            // InternalModelDsl.g:3796:2: rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AllModelTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__0"


    // $ANTLR start "rule__AllModelTypeCollection__Group__0__Impl"
    // InternalModelDsl.g:3803:1: rule__AllModelTypeCollection__Group__0__Impl : ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__AllModelTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3807:1: ( ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) )
            // InternalModelDsl.g:3808:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalModelDsl.g:3808:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            // InternalModelDsl.g:3809:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalModelDsl.g:3810:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            // InternalModelDsl.g:3810:3: rule__AllModelTypeCollection__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__AllModelTypeCollection__Group__1"
    // InternalModelDsl.g:3818:1: rule__AllModelTypeCollection__Group__1 : rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 ;
    public final void rule__AllModelTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3822:1: ( rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 )
            // InternalModelDsl.g:3823:2: rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AllModelTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__1"


    // $ANTLR start "rule__AllModelTypeCollection__Group__1__Impl"
    // InternalModelDsl.g:3830:1: rule__AllModelTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__AllModelTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3834:1: ( ( '<' ) )
            // InternalModelDsl.g:3835:1: ( '<' )
            {
            // InternalModelDsl.g:3835:1: ( '<' )
            // InternalModelDsl.g:3836:2: '<'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__AllModelTypeCollection__Group__2"
    // InternalModelDsl.g:3845:1: rule__AllModelTypeCollection__Group__2 : rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 ;
    public final void rule__AllModelTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3849:1: ( rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 )
            // InternalModelDsl.g:3850:2: rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__AllModelTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__2"


    // $ANTLR start "rule__AllModelTypeCollection__Group__2__Impl"
    // InternalModelDsl.g:3857:1: rule__AllModelTypeCollection__Group__2__Impl : ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__AllModelTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3861:1: ( ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) )
            // InternalModelDsl.g:3862:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            {
            // InternalModelDsl.g:3862:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            // InternalModelDsl.g:3863:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalModelDsl.g:3864:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            // InternalModelDsl.g:3864:3: rule__AllModelTypeCollection__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__AllModelTypeCollection__Group__3"
    // InternalModelDsl.g:3872:1: rule__AllModelTypeCollection__Group__3 : rule__AllModelTypeCollection__Group__3__Impl ;
    public final void rule__AllModelTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3876:1: ( rule__AllModelTypeCollection__Group__3__Impl )
            // InternalModelDsl.g:3877:2: rule__AllModelTypeCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__3"


    // $ANTLR start "rule__AllModelTypeCollection__Group__3__Impl"
    // InternalModelDsl.g:3883:1: rule__AllModelTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__AllModelTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3887:1: ( ( '>' ) )
            // InternalModelDsl.g:3888:1: ( '>' )
            {
            // InternalModelDsl.g:3888:1: ( '>' )
            // InternalModelDsl.g:3889:2: '>'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__ModelTypeCollection__Group__0"
    // InternalModelDsl.g:3899:1: rule__ModelTypeCollection__Group__0 : rule__ModelTypeCollection__Group__0__Impl rule__ModelTypeCollection__Group__1 ;
    public final void rule__ModelTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3903:1: ( rule__ModelTypeCollection__Group__0__Impl rule__ModelTypeCollection__Group__1 )
            // InternalModelDsl.g:3904:2: rule__ModelTypeCollection__Group__0__Impl rule__ModelTypeCollection__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ModelTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__0"


    // $ANTLR start "rule__ModelTypeCollection__Group__0__Impl"
    // InternalModelDsl.g:3911:1: rule__ModelTypeCollection__Group__0__Impl : ( ( rule__ModelTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__ModelTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3915:1: ( ( ( rule__ModelTypeCollection__CollectionAssignment_0 ) ) )
            // InternalModelDsl.g:3916:1: ( ( rule__ModelTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalModelDsl.g:3916:1: ( ( rule__ModelTypeCollection__CollectionAssignment_0 ) )
            // InternalModelDsl.g:3917:2: ( rule__ModelTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getModelTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalModelDsl.g:3918:2: ( rule__ModelTypeCollection__CollectionAssignment_0 )
            // InternalModelDsl.g:3918:3: rule__ModelTypeCollection__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeCollectionAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__ModelTypeCollection__Group__1"
    // InternalModelDsl.g:3926:1: rule__ModelTypeCollection__Group__1 : rule__ModelTypeCollection__Group__1__Impl rule__ModelTypeCollection__Group__2 ;
    public final void rule__ModelTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3930:1: ( rule__ModelTypeCollection__Group__1__Impl rule__ModelTypeCollection__Group__2 )
            // InternalModelDsl.g:3931:2: rule__ModelTypeCollection__Group__1__Impl rule__ModelTypeCollection__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ModelTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__1"


    // $ANTLR start "rule__ModelTypeCollection__Group__1__Impl"
    // InternalModelDsl.g:3938:1: rule__ModelTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__ModelTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3942:1: ( ( '<' ) )
            // InternalModelDsl.g:3943:1: ( '<' )
            {
            // InternalModelDsl.g:3943:1: ( '<' )
            // InternalModelDsl.g:3944:2: '<'
            {
             before(grammarAccess.getModelTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getModelTypeCollectionAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__ModelTypeCollection__Group__2"
    // InternalModelDsl.g:3953:1: rule__ModelTypeCollection__Group__2 : rule__ModelTypeCollection__Group__2__Impl rule__ModelTypeCollection__Group__3 ;
    public final void rule__ModelTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3957:1: ( rule__ModelTypeCollection__Group__2__Impl rule__ModelTypeCollection__Group__3 )
            // InternalModelDsl.g:3958:2: rule__ModelTypeCollection__Group__2__Impl rule__ModelTypeCollection__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ModelTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__2"


    // $ANTLR start "rule__ModelTypeCollection__Group__2__Impl"
    // InternalModelDsl.g:3965:1: rule__ModelTypeCollection__Group__2__Impl : ( ( rule__ModelTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__ModelTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3969:1: ( ( ( rule__ModelTypeCollection__TypeAssignment_2 ) ) )
            // InternalModelDsl.g:3970:1: ( ( rule__ModelTypeCollection__TypeAssignment_2 ) )
            {
            // InternalModelDsl.g:3970:1: ( ( rule__ModelTypeCollection__TypeAssignment_2 ) )
            // InternalModelDsl.g:3971:2: ( rule__ModelTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getModelTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalModelDsl.g:3972:2: ( rule__ModelTypeCollection__TypeAssignment_2 )
            // InternalModelDsl.g:3972:3: rule__ModelTypeCollection__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeCollectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__ModelTypeCollection__Group__3"
    // InternalModelDsl.g:3980:1: rule__ModelTypeCollection__Group__3 : rule__ModelTypeCollection__Group__3__Impl ;
    public final void rule__ModelTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3984:1: ( rule__ModelTypeCollection__Group__3__Impl )
            // InternalModelDsl.g:3985:2: rule__ModelTypeCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__3"


    // $ANTLR start "rule__ModelTypeCollection__Group__3__Impl"
    // InternalModelDsl.g:3991:1: rule__ModelTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__ModelTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:3995:1: ( ( '>' ) )
            // InternalModelDsl.g:3996:1: ( '>' )
            {
            // InternalModelDsl.g:3996:1: ( '>' )
            // InternalModelDsl.g:3997:2: '>'
            {
             before(grammarAccess.getModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__SimpleTypeCollection__Group__0"
    // InternalModelDsl.g:4007:1: rule__SimpleTypeCollection__Group__0 : rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 ;
    public final void rule__SimpleTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4011:1: ( rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 )
            // InternalModelDsl.g:4012:2: rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SimpleTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__0"


    // $ANTLR start "rule__SimpleTypeCollection__Group__0__Impl"
    // InternalModelDsl.g:4019:1: rule__SimpleTypeCollection__Group__0__Impl : ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__SimpleTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4023:1: ( ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) )
            // InternalModelDsl.g:4024:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalModelDsl.g:4024:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            // InternalModelDsl.g:4025:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalModelDsl.g:4026:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            // InternalModelDsl.g:4026:3: rule__SimpleTypeCollection__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__SimpleTypeCollection__Group__1"
    // InternalModelDsl.g:4034:1: rule__SimpleTypeCollection__Group__1 : rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 ;
    public final void rule__SimpleTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4038:1: ( rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 )
            // InternalModelDsl.g:4039:2: rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__SimpleTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__1"


    // $ANTLR start "rule__SimpleTypeCollection__Group__1__Impl"
    // InternalModelDsl.g:4046:1: rule__SimpleTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4050:1: ( ( '<' ) )
            // InternalModelDsl.g:4051:1: ( '<' )
            {
            // InternalModelDsl.g:4051:1: ( '<' )
            // InternalModelDsl.g:4052:2: '<'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__SimpleTypeCollection__Group__2"
    // InternalModelDsl.g:4061:1: rule__SimpleTypeCollection__Group__2 : rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 ;
    public final void rule__SimpleTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4065:1: ( rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 )
            // InternalModelDsl.g:4066:2: rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__SimpleTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__2"


    // $ANTLR start "rule__SimpleTypeCollection__Group__2__Impl"
    // InternalModelDsl.g:4073:1: rule__SimpleTypeCollection__Group__2__Impl : ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4077:1: ( ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) )
            // InternalModelDsl.g:4078:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            {
            // InternalModelDsl.g:4078:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            // InternalModelDsl.g:4079:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalModelDsl.g:4080:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            // InternalModelDsl.g:4080:3: rule__SimpleTypeCollection__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__SimpleTypeCollection__Group__3"
    // InternalModelDsl.g:4088:1: rule__SimpleTypeCollection__Group__3 : rule__SimpleTypeCollection__Group__3__Impl ;
    public final void rule__SimpleTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4092:1: ( rule__SimpleTypeCollection__Group__3__Impl )
            // InternalModelDsl.g:4093:2: rule__SimpleTypeCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__3"


    // $ANTLR start "rule__SimpleTypeCollection__Group__3__Impl"
    // InternalModelDsl.g:4099:1: rule__SimpleTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4103:1: ( ( '>' ) )
            // InternalModelDsl.g:4104:1: ( '>' )
            {
            // InternalModelDsl.g:4104:1: ( '>' )
            // InternalModelDsl.g:4105:2: '>'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalModelDsl.g:4115:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4119:1: ( ( ruleElement ) )
            // InternalModelDsl.g:4120:2: ( ruleElement )
            {
            // InternalModelDsl.g:4120:2: ( ruleElement )
            // InternalModelDsl.g:4121:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__SimpleEntity__ImplementationAssignment_1"
    // InternalModelDsl.g:4130:1: rule__SimpleEntity__ImplementationAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__SimpleEntity__ImplementationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4134:1: ( ( ( 'abstract' ) ) )
            // InternalModelDsl.g:4135:2: ( ( 'abstract' ) )
            {
            // InternalModelDsl.g:4135:2: ( ( 'abstract' ) )
            // InternalModelDsl.g:4136:3: ( 'abstract' )
            {
             before(grammarAccess.getSimpleEntityAccess().getImplementationAbstractKeyword_1_0()); 
            // InternalModelDsl.g:4137:3: ( 'abstract' )
            // InternalModelDsl.g:4138:4: 'abstract'
            {
             before(grammarAccess.getSimpleEntityAccess().getImplementationAbstractKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getImplementationAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getSimpleEntityAccess().getImplementationAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__ImplementationAssignment_1"


    // $ANTLR start "rule__SimpleEntity__NameAssignment_2"
    // InternalModelDsl.g:4149:1: rule__SimpleEntity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SimpleEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4153:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4154:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4154:2: ( RULE_ID )
            // InternalModelDsl.g:4155:3: RULE_ID
            {
             before(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__NameAssignment_2"


    // $ANTLR start "rule__SimpleEntity__SuperClassAssignment_3_1"
    // InternalModelDsl.g:4164:1: rule__SimpleEntity__SuperClassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleEntity__SuperClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4168:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4169:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4169:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4170:3: ( RULE_ID )
            {
             before(grammarAccess.getSimpleEntityAccess().getSuperClassSimpleEntityCrossReference_3_1_0()); 
            // InternalModelDsl.g:4171:3: ( RULE_ID )
            // InternalModelDsl.g:4172:4: RULE_ID
            {
             before(grammarAccess.getSimpleEntityAccess().getSuperClassSimpleEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSuperClassSimpleEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSimpleEntityAccess().getSuperClassSimpleEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__SuperClassAssignment_3_1"


    // $ANTLR start "rule__SimpleEntity__AttributesIdAssignment_5"
    // InternalModelDsl.g:4183:1: rule__SimpleEntity__AttributesIdAssignment_5 : ( ruleDefIdAttribute ) ;
    public final void rule__SimpleEntity__AttributesIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4187:1: ( ( ruleDefIdAttribute ) )
            // InternalModelDsl.g:4188:2: ( ruleDefIdAttribute )
            {
            // InternalModelDsl.g:4188:2: ( ruleDefIdAttribute )
            // InternalModelDsl.g:4189:3: ruleDefIdAttribute
            {
             before(grammarAccess.getSimpleEntityAccess().getAttributesIdDefIdAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDefIdAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getAttributesIdDefIdAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__AttributesIdAssignment_5"


    // $ANTLR start "rule__SimpleEntity__AttributesAssignment_6"
    // InternalModelDsl.g:4198:1: rule__SimpleEntity__AttributesAssignment_6 : ( ruleDefAttribute ) ;
    public final void rule__SimpleEntity__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4202:1: ( ( ruleDefAttribute ) )
            // InternalModelDsl.g:4203:2: ( ruleDefAttribute )
            {
            // InternalModelDsl.g:4203:2: ( ruleDefAttribute )
            // InternalModelDsl.g:4204:3: ruleDefAttribute
            {
             before(grammarAccess.getSimpleEntityAccess().getAttributesDefAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDefAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getAttributesDefAttributeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__AttributesAssignment_6"


    // $ANTLR start "rule__SimpleEntity__MethodsAssignment_7"
    // InternalModelDsl.g:4213:1: rule__SimpleEntity__MethodsAssignment_7 : ( ruleMethod ) ;
    public final void rule__SimpleEntity__MethodsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4217:1: ( ( ruleMethod ) )
            // InternalModelDsl.g:4218:2: ( ruleMethod )
            {
            // InternalModelDsl.g:4218:2: ( ruleMethod )
            // InternalModelDsl.g:4219:3: ruleMethod
            {
             before(grammarAccess.getSimpleEntityAccess().getMethodsMethodParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getMethodsMethodParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__MethodsAssignment_7"


    // $ANTLR start "rule__AssociativeEntity__NameAssignment_1"
    // InternalModelDsl.g:4228:1: rule__AssociativeEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssociativeEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4232:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4233:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4233:2: ( RULE_ID )
            // InternalModelDsl.g:4234:3: RULE_ID
            {
             before(grammarAccess.getAssociativeEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociativeEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__NameAssignment_1"


    // $ANTLR start "rule__AssociativeEntity__RelationsAssignment_3"
    // InternalModelDsl.g:4243:1: rule__AssociativeEntity__RelationsAssignment_3 : ( ruleRelation ) ;
    public final void rule__AssociativeEntity__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4247:1: ( ( ruleRelation ) )
            // InternalModelDsl.g:4248:2: ( ruleRelation )
            {
            // InternalModelDsl.g:4248:2: ( ruleRelation )
            // InternalModelDsl.g:4249:3: ruleRelation
            {
             before(grammarAccess.getAssociativeEntityAccess().getRelationsRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getAssociativeEntityAccess().getRelationsRelationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__RelationsAssignment_3"


    // $ANTLR start "rule__AssociativeEntity__RelationsAssignment_4"
    // InternalModelDsl.g:4258:1: rule__AssociativeEntity__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__AssociativeEntity__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4262:1: ( ( ruleRelation ) )
            // InternalModelDsl.g:4263:2: ( ruleRelation )
            {
            // InternalModelDsl.g:4263:2: ( ruleRelation )
            // InternalModelDsl.g:4264:3: ruleRelation
            {
             before(grammarAccess.getAssociativeEntityAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getAssociativeEntityAccess().getRelationsRelationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__RelationsAssignment_4"


    // $ANTLR start "rule__AssociativeEntity__AttributesAssignment_5"
    // InternalModelDsl.g:4273:1: rule__AssociativeEntity__AttributesAssignment_5 : ( ruleDefAttribute ) ;
    public final void rule__AssociativeEntity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4277:1: ( ( ruleDefAttribute ) )
            // InternalModelDsl.g:4278:2: ( ruleDefAttribute )
            {
            // InternalModelDsl.g:4278:2: ( ruleDefAttribute )
            // InternalModelDsl.g:4279:3: ruleDefAttribute
            {
             before(grammarAccess.getAssociativeEntityAccess().getAttributesDefAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDefAttribute();

            state._fsp--;

             after(grammarAccess.getAssociativeEntityAccess().getAttributesDefAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__AttributesAssignment_5"


    // $ANTLR start "rule__AssociativeEntity__MethodsAssignment_6"
    // InternalModelDsl.g:4288:1: rule__AssociativeEntity__MethodsAssignment_6 : ( ruleMethod ) ;
    public final void rule__AssociativeEntity__MethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4292:1: ( ( ruleMethod ) )
            // InternalModelDsl.g:4293:2: ( ruleMethod )
            {
            // InternalModelDsl.g:4293:2: ( ruleMethod )
            // InternalModelDsl.g:4294:3: ruleMethod
            {
             before(grammarAccess.getAssociativeEntityAccess().getMethodsMethodParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getAssociativeEntityAccess().getMethodsMethodParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativeEntity__MethodsAssignment_6"


    // $ANTLR start "rule__ValueType__NameAssignment_1"
    // InternalModelDsl.g:4303:1: rule__ValueType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValueType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4307:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4308:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4308:2: ( RULE_ID )
            // InternalModelDsl.g:4309:3: RULE_ID
            {
             before(grammarAccess.getValueTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__NameAssignment_1"


    // $ANTLR start "rule__ValueType__AttributesAssignment_3"
    // InternalModelDsl.g:4318:1: rule__ValueType__AttributesAssignment_3 : ( ruleDefAttribute ) ;
    public final void rule__ValueType__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4322:1: ( ( ruleDefAttribute ) )
            // InternalModelDsl.g:4323:2: ( ruleDefAttribute )
            {
            // InternalModelDsl.g:4323:2: ( ruleDefAttribute )
            // InternalModelDsl.g:4324:3: ruleDefAttribute
            {
             before(grammarAccess.getValueTypeAccess().getAttributesDefAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefAttribute();

            state._fsp--;

             after(grammarAccess.getValueTypeAccess().getAttributesDefAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__AttributesAssignment_3"


    // $ANTLR start "rule__Enumerable__NameAssignment_1"
    // InternalModelDsl.g:4333:1: rule__Enumerable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumerable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4337:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4338:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4338:2: ( RULE_ID )
            // InternalModelDsl.g:4339:3: RULE_ID
            {
             before(grammarAccess.getEnumerableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__NameAssignment_1"


    // $ANTLR start "rule__Enumerable__EnumsAssignment_3"
    // InternalModelDsl.g:4348:1: rule__Enumerable__EnumsAssignment_3 : ( RULE_ENUMERATE ) ;
    public final void rule__Enumerable__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4352:1: ( ( RULE_ENUMERATE ) )
            // InternalModelDsl.g:4353:2: ( RULE_ENUMERATE )
            {
            // InternalModelDsl.g:4353:2: ( RULE_ENUMERATE )
            // InternalModelDsl.g:4354:3: RULE_ENUMERATE
            {
             before(grammarAccess.getEnumerableAccess().getEnumsENUMERATETerminalRuleCall_3_0()); 
            match(input,RULE_ENUMERATE,FOLLOW_2); 
             after(grammarAccess.getEnumerableAccess().getEnumsENUMERATETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerable__EnumsAssignment_3"


    // $ANTLR start "rule__SimpleLink__NameAssignment_1"
    // InternalModelDsl.g:4363:1: rule__SimpleLink__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4367:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4368:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4368:2: ( RULE_ID )
            // InternalModelDsl.g:4369:3: RULE_ID
            {
             before(grammarAccess.getSimpleLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__NameAssignment_1"


    // $ANTLR start "rule__SimpleLink__RelationsAssignment_3"
    // InternalModelDsl.g:4378:1: rule__SimpleLink__RelationsAssignment_3 : ( ruleRelation ) ;
    public final void rule__SimpleLink__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4382:1: ( ( ruleRelation ) )
            // InternalModelDsl.g:4383:2: ( ruleRelation )
            {
            // InternalModelDsl.g:4383:2: ( ruleRelation )
            // InternalModelDsl.g:4384:3: ruleRelation
            {
             before(grammarAccess.getSimpleLinkAccess().getRelationsRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSimpleLinkAccess().getRelationsRelationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__RelationsAssignment_3"


    // $ANTLR start "rule__SimpleLink__RelationsAssignment_4"
    // InternalModelDsl.g:4393:1: rule__SimpleLink__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__SimpleLink__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4397:1: ( ( ruleRelation ) )
            // InternalModelDsl.g:4398:2: ( ruleRelation )
            {
            // InternalModelDsl.g:4398:2: ( ruleRelation )
            // InternalModelDsl.g:4399:3: ruleRelation
            {
             before(grammarAccess.getSimpleLinkAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSimpleLinkAccess().getRelationsRelationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleLink__RelationsAssignment_4"


    // $ANTLR start "rule__Relation__MultiplicityAssignment_0"
    // InternalModelDsl.g:4408:1: rule__Relation__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__Relation__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4412:1: ( ( ruleMultiplicity ) )
            // InternalModelDsl.g:4413:2: ( ruleMultiplicity )
            {
            // InternalModelDsl.g:4413:2: ( ruleMultiplicity )
            // InternalModelDsl.g:4414:3: ruleMultiplicity
            {
             before(grammarAccess.getRelationAccess().getMultiplicityMultiplicityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getMultiplicityMultiplicityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__MultiplicityAssignment_0"


    // $ANTLR start "rule__Relation__TypeAssignment_1"
    // InternalModelDsl.g:4423:1: rule__Relation__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4427:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4428:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4428:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4429:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTypeEntityCrossReference_1_0()); 
            // InternalModelDsl.g:4430:3: ( RULE_ID )
            // InternalModelDsl.g:4431:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getTypeEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTypeEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTypeEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_1"


    // $ANTLR start "rule__Relation__NameAssignment_2"
    // InternalModelDsl.g:4442:1: rule__Relation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4446:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4447:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4447:2: ( RULE_ID )
            // InternalModelDsl.g:4448:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_2"


    // $ANTLR start "rule__Relation__NavigableAssignment_3"
    // InternalModelDsl.g:4457:1: rule__Relation__NavigableAssignment_3 : ( ( rule__Relation__NavigableAlternatives_3_0 ) ) ;
    public final void rule__Relation__NavigableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4461:1: ( ( ( rule__Relation__NavigableAlternatives_3_0 ) ) )
            // InternalModelDsl.g:4462:2: ( ( rule__Relation__NavigableAlternatives_3_0 ) )
            {
            // InternalModelDsl.g:4462:2: ( ( rule__Relation__NavigableAlternatives_3_0 ) )
            // InternalModelDsl.g:4463:3: ( rule__Relation__NavigableAlternatives_3_0 )
            {
             before(grammarAccess.getRelationAccess().getNavigableAlternatives_3_0()); 
            // InternalModelDsl.g:4464:3: ( rule__Relation__NavigableAlternatives_3_0 )
            // InternalModelDsl.g:4464:4: rule__Relation__NavigableAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NavigableAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNavigableAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NavigableAssignment_3"


    // $ANTLR start "rule__DefAttribute__NullableAssignment_0_1"
    // InternalModelDsl.g:4472:1: rule__DefAttribute__NullableAssignment_0_1 : ( ( rule__DefAttribute__NullableAlternatives_0_1_0 ) ) ;
    public final void rule__DefAttribute__NullableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4476:1: ( ( ( rule__DefAttribute__NullableAlternatives_0_1_0 ) ) )
            // InternalModelDsl.g:4477:2: ( ( rule__DefAttribute__NullableAlternatives_0_1_0 ) )
            {
            // InternalModelDsl.g:4477:2: ( ( rule__DefAttribute__NullableAlternatives_0_1_0 ) )
            // InternalModelDsl.g:4478:3: ( rule__DefAttribute__NullableAlternatives_0_1_0 )
            {
             before(grammarAccess.getDefAttributeAccess().getNullableAlternatives_0_1_0()); 
            // InternalModelDsl.g:4479:3: ( rule__DefAttribute__NullableAlternatives_0_1_0 )
            // InternalModelDsl.g:4479:4: rule__DefAttribute__NullableAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DefAttribute__NullableAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDefAttributeAccess().getNullableAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAttribute__NullableAssignment_0_1"


    // $ANTLR start "rule__DefAllModelTypeVariable__TypeAssignment_0"
    // InternalModelDsl.g:4487:1: rule__DefAllModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefAllModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4491:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4492:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4492:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4493:3: ( RULE_ID )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0()); 
            // InternalModelDsl.g:4494:3: ( RULE_ID )
            // InternalModelDsl.g:4495:4: RULE_ID
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAllModelTypeVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefAllModelTypeVariable__NameAssignment_1"
    // InternalModelDsl.g:4506:1: rule__DefAllModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4510:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4511:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4511:2: ( RULE_ID )
            // InternalModelDsl.g:4512:3: RULE_ID
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefAllModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefAllModelTypeVariable__NameAssignment_1"


    // $ANTLR start "rule__DefSimpleVariable__TypeAssignment_0"
    // InternalModelDsl.g:4521:1: rule__DefSimpleVariable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefSimpleVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4525:1: ( ( ruleType ) )
            // InternalModelDsl.g:4526:2: ( ruleType )
            {
            // InternalModelDsl.g:4526:2: ( ruleType )
            // InternalModelDsl.g:4527:3: ruleType
            {
             before(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSimpleVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefSimpleVariable__NameAssignment_1"
    // InternalModelDsl.g:4536:1: rule__DefSimpleVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4540:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4541:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4541:2: ( RULE_ID )
            // InternalModelDsl.g:4542:3: RULE_ID
            {
             before(grammarAccess.getDefSimpleVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefSimpleVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSimpleVariable__NameAssignment_1"


    // $ANTLR start "rule__DefModelTypeVariable__TypeAssignment_0"
    // InternalModelDsl.g:4551:1: rule__DefModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4555:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4556:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4556:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4557:3: ( RULE_ID )
            {
             before(grammarAccess.getDefModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0()); 
            // InternalModelDsl.g:4558:3: ( RULE_ID )
            // InternalModelDsl.g:4559:4: RULE_ID
            {
             before(grammarAccess.getDefModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDefModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelTypeVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefModelTypeVariable__NameAssignment_1"
    // InternalModelDsl.g:4570:1: rule__DefModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4574:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4575:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4575:2: ( RULE_ID )
            // InternalModelDsl.g:4576:3: RULE_ID
            {
             before(grammarAccess.getDefModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelTypeVariable__NameAssignment_1"


    // $ANTLR start "rule__DefCollectionTypeVariable__TypeAssignment_0_0"
    // InternalModelDsl.g:4585:1: rule__DefCollectionTypeVariable__TypeAssignment_0_0 : ( ruleAllModelTypeCollection ) ;
    public final void rule__DefCollectionTypeVariable__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4589:1: ( ( ruleAllModelTypeCollection ) )
            // InternalModelDsl.g:4590:2: ( ruleAllModelTypeCollection )
            {
            // InternalModelDsl.g:4590:2: ( ruleAllModelTypeCollection )
            // InternalModelDsl.g:4591:3: ruleAllModelTypeCollection
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAllModelTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefCollectionTypeVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__TypeAssignment_0_0"


    // $ANTLR start "rule__DefCollectionTypeVariable__NameAssignment_0_1"
    // InternalModelDsl.g:4600:1: rule__DefCollectionTypeVariable__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__DefCollectionTypeVariable__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4604:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4605:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4605:2: ( RULE_ID )
            // InternalModelDsl.g:4606:3: RULE_ID
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefCollectionTypeVariableAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__NameAssignment_0_1"


    // $ANTLR start "rule__DefCollectionTypeVariable__TypeAssignment_1_0"
    // InternalModelDsl.g:4615:1: rule__DefCollectionTypeVariable__TypeAssignment_1_0 : ( ruleSimpleTypeCollection ) ;
    public final void rule__DefCollectionTypeVariable__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4619:1: ( ( ruleSimpleTypeCollection ) )
            // InternalModelDsl.g:4620:2: ( ruleSimpleTypeCollection )
            {
            // InternalModelDsl.g:4620:2: ( ruleSimpleTypeCollection )
            // InternalModelDsl.g:4621:3: ruleSimpleTypeCollection
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefCollectionTypeVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__TypeAssignment_1_0"


    // $ANTLR start "rule__DefCollectionTypeVariable__NameAssignment_1_1"
    // InternalModelDsl.g:4630:1: rule__DefCollectionTypeVariable__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DefCollectionTypeVariable__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4634:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4635:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4635:2: ( RULE_ID )
            // InternalModelDsl.g:4636:3: RULE_ID
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefCollectionTypeVariableAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCollectionTypeVariable__NameAssignment_1_1"


    // $ANTLR start "rule__DefModelModelTypeCollectionVariable__TypeAssignment_0"
    // InternalModelDsl.g:4645:1: rule__DefModelModelTypeCollectionVariable__TypeAssignment_0 : ( ruleModelTypeCollection ) ;
    public final void rule__DefModelModelTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4649:1: ( ( ruleModelTypeCollection ) )
            // InternalModelDsl.g:4650:2: ( ruleModelTypeCollection )
            {
            // InternalModelDsl.g:4650:2: ( ruleModelTypeCollection )
            // InternalModelDsl.g:4651:3: ruleModelTypeCollection
            {
             before(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getTypeModelTypeCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModelTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getTypeModelTypeCollectionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelModelTypeCollectionVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefModelModelTypeCollectionVariable__NameAssignment_1"
    // InternalModelDsl.g:4660:1: rule__DefModelModelTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefModelModelTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4664:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4665:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4665:2: ( RULE_ID )
            // InternalModelDsl.g:4666:3: RULE_ID
            {
             before(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelModelTypeCollectionVariable__NameAssignment_1"


    // $ANTLR start "rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0"
    // InternalModelDsl.g:4675:1: rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0 : ( ruleSimpleTypeCollection ) ;
    public final void rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4679:1: ( ( ruleSimpleTypeCollection ) )
            // InternalModelDsl.g:4680:2: ( ruleSimpleTypeCollection )
            {
            // InternalModelDsl.g:4680:2: ( ruleSimpleTypeCollection )
            // InternalModelDsl.g:4681:3: ruleSimpleTypeCollection
            {
             before(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelSimpleTypeCollectionVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1"
    // InternalModelDsl.g:4690:1: rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4694:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4695:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4695:2: ( RULE_ID )
            // InternalModelDsl.g:4696:3: RULE_ID
            {
             before(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefModelSimpleTypeCollectionVariable__NameAssignment_1"


    // $ANTLR start "rule__DefLinkVariable__TypeAssignment_1"
    // InternalModelDsl.g:4705:1: rule__DefLinkVariable__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefLinkVariable__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4709:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4710:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4710:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4711:3: ( RULE_ID )
            {
             before(grammarAccess.getDefLinkVariableAccess().getTypeLinkCrossReference_1_0()); 
            // InternalModelDsl.g:4712:3: ( RULE_ID )
            // InternalModelDsl.g:4713:4: RULE_ID
            {
             before(grammarAccess.getDefLinkVariableAccess().getTypeLinkIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefLinkVariableAccess().getTypeLinkIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefLinkVariableAccess().getTypeLinkCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__TypeAssignment_1"


    // $ANTLR start "rule__DefLinkVariable__NameAssignment_2"
    // InternalModelDsl.g:4724:1: rule__DefLinkVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefLinkVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4728:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4729:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4729:2: ( RULE_ID )
            // InternalModelDsl.g:4730:3: RULE_ID
            {
             before(grammarAccess.getDefLinkVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefLinkVariableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefLinkVariable__NameAssignment_2"


    // $ANTLR start "rule__MethodSimpleReturn__ReturnTypeAssignment_0"
    // InternalModelDsl.g:4739:1: rule__MethodSimpleReturn__ReturnTypeAssignment_0 : ( ruleSimpleReturnType ) ;
    public final void rule__MethodSimpleReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4743:1: ( ( ruleSimpleReturnType ) )
            // InternalModelDsl.g:4744:2: ( ruleSimpleReturnType )
            {
            // InternalModelDsl.g:4744:2: ( ruleSimpleReturnType )
            // InternalModelDsl.g:4745:3: ruleSimpleReturnType
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeSimpleReturnTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleReturnType();

            state._fsp--;

             after(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeSimpleReturnTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__ReturnTypeAssignment_0"


    // $ANTLR start "rule__MethodSimpleReturn__NameAssignment_1"
    // InternalModelDsl.g:4754:1: rule__MethodSimpleReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodSimpleReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4758:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4759:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4759:2: ( RULE_ID )
            // InternalModelDsl.g:4760:3: RULE_ID
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodSimpleReturnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__NameAssignment_1"


    // $ANTLR start "rule__MethodSimpleReturn__ParametersAssignment_3_0"
    // InternalModelDsl.g:4769:1: rule__MethodSimpleReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4773:1: ( ( ruleDefVariable ) )
            // InternalModelDsl.g:4774:2: ( ruleDefVariable )
            {
            // InternalModelDsl.g:4774:2: ( ruleDefVariable )
            // InternalModelDsl.g:4775:3: ruleDefVariable
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__ParametersAssignment_3_0"


    // $ANTLR start "rule__MethodSimpleReturn__ParametersAssignment_3_1_1"
    // InternalModelDsl.g:4784:1: rule__MethodSimpleReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4788:1: ( ( ruleDefVariable ) )
            // InternalModelDsl.g:4789:2: ( ruleDefVariable )
            {
            // InternalModelDsl.g:4789:2: ( ruleDefVariable )
            // InternalModelDsl.g:4790:3: ruleDefVariable
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__MethodCollectionReturn__ReturnTypeAssignment_0"
    // InternalModelDsl.g:4799:1: rule__MethodCollectionReturn__ReturnTypeAssignment_0 : ( ruleCollectionReturnType ) ;
    public final void rule__MethodCollectionReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4803:1: ( ( ruleCollectionReturnType ) )
            // InternalModelDsl.g:4804:2: ( ruleCollectionReturnType )
            {
            // InternalModelDsl.g:4804:2: ( ruleCollectionReturnType )
            // InternalModelDsl.g:4805:3: ruleCollectionReturnType
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeCollectionReturnTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionReturnType();

            state._fsp--;

             after(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeCollectionReturnTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__ReturnTypeAssignment_0"


    // $ANTLR start "rule__MethodCollectionReturn__NameAssignment_1"
    // InternalModelDsl.g:4814:1: rule__MethodCollectionReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodCollectionReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4818:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4819:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4819:2: ( RULE_ID )
            // InternalModelDsl.g:4820:3: RULE_ID
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCollectionReturnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__NameAssignment_1"


    // $ANTLR start "rule__MethodCollectionReturn__ParametersAssignment_3_0"
    // InternalModelDsl.g:4829:1: rule__MethodCollectionReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4833:1: ( ( ruleDefVariable ) )
            // InternalModelDsl.g:4834:2: ( ruleDefVariable )
            {
            // InternalModelDsl.g:4834:2: ( ruleDefVariable )
            // InternalModelDsl.g:4835:3: ruleDefVariable
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__ParametersAssignment_3_0"


    // $ANTLR start "rule__MethodCollectionReturn__ParametersAssignment_3_1_1"
    // InternalModelDsl.g:4844:1: rule__MethodCollectionReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4848:1: ( ( ruleDefVariable ) )
            // InternalModelDsl.g:4849:2: ( ruleDefVariable )
            {
            // InternalModelDsl.g:4849:2: ( ruleDefVariable )
            // InternalModelDsl.g:4850:3: ruleDefVariable
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCollectionReturn__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__MethodAllModelReturn__ReturnTypeAssignment_0"
    // InternalModelDsl.g:4859:1: rule__MethodAllModelReturn__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodAllModelReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4863:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4864:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4864:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4865:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeCrossReference_0_0()); 
            // InternalModelDsl.g:4866:3: ( RULE_ID )
            // InternalModelDsl.g:4867:4: RULE_ID
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__ReturnTypeAssignment_0"


    // $ANTLR start "rule__MethodAllModelReturn__NameAssignment_1"
    // InternalModelDsl.g:4878:1: rule__MethodAllModelReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodAllModelReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4882:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:4883:2: ( RULE_ID )
            {
            // InternalModelDsl.g:4883:2: ( RULE_ID )
            // InternalModelDsl.g:4884:3: RULE_ID
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAllModelReturnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__NameAssignment_1"


    // $ANTLR start "rule__MethodAllModelReturn__ParametersAssignment_3_0"
    // InternalModelDsl.g:4893:1: rule__MethodAllModelReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodAllModelReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4897:1: ( ( ruleDefVariable ) )
            // InternalModelDsl.g:4898:2: ( ruleDefVariable )
            {
            // InternalModelDsl.g:4898:2: ( ruleDefVariable )
            // InternalModelDsl.g:4899:3: ruleDefVariable
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__ParametersAssignment_3_0"


    // $ANTLR start "rule__MethodAllModelReturn__ParametersAssignment_3_1_1"
    // InternalModelDsl.g:4908:1: rule__MethodAllModelReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodAllModelReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4912:1: ( ( ruleDefVariable ) )
            // InternalModelDsl.g:4913:2: ( ruleDefVariable )
            {
            // InternalModelDsl.g:4913:2: ( ruleDefVariable )
            // InternalModelDsl.g:4914:3: ruleDefVariable
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodAllModelReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodAllModelReturn__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__AllModelTypeCollection__CollectionAssignment_0"
    // InternalModelDsl.g:4923:1: rule__AllModelTypeCollection__CollectionAssignment_0 : ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__AllModelTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4927:1: ( ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalModelDsl.g:4928:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalModelDsl.g:4928:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalModelDsl.g:4929:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalModelDsl.g:4930:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            // InternalModelDsl.g:4930:4: rule__AllModelTypeCollection__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AllModelTypeCollection__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__CollectionAssignment_0"


    // $ANTLR start "rule__AllModelTypeCollection__TypeAssignment_2"
    // InternalModelDsl.g:4938:1: rule__AllModelTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AllModelTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4942:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4943:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4943:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4944:3: ( RULE_ID )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0()); 
            // InternalModelDsl.g:4945:3: ( RULE_ID )
            // InternalModelDsl.g:4946:4: RULE_ID
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllModelTypeCollection__TypeAssignment_2"


    // $ANTLR start "rule__ModelTypeCollection__CollectionAssignment_0"
    // InternalModelDsl.g:4957:1: rule__ModelTypeCollection__CollectionAssignment_0 : ( ( rule__ModelTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__ModelTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4961:1: ( ( ( rule__ModelTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalModelDsl.g:4962:2: ( ( rule__ModelTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalModelDsl.g:4962:2: ( ( rule__ModelTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalModelDsl.g:4963:3: ( rule__ModelTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalModelDsl.g:4964:3: ( rule__ModelTypeCollection__CollectionAlternatives_0_0 )
            // InternalModelDsl.g:4964:4: rule__ModelTypeCollection__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelTypeCollection__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__CollectionAssignment_0"


    // $ANTLR start "rule__ModelTypeCollection__TypeAssignment_2"
    // InternalModelDsl.g:4972:1: rule__ModelTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ModelTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4976:1: ( ( ( RULE_ID ) ) )
            // InternalModelDsl.g:4977:2: ( ( RULE_ID ) )
            {
            // InternalModelDsl.g:4977:2: ( ( RULE_ID ) )
            // InternalModelDsl.g:4978:3: ( RULE_ID )
            {
             before(grammarAccess.getModelTypeCollectionAccess().getTypeModelTypeCrossReference_2_0()); 
            // InternalModelDsl.g:4979:3: ( RULE_ID )
            // InternalModelDsl.g:4980:4: RULE_ID
            {
             before(grammarAccess.getModelTypeCollectionAccess().getTypeModelTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelTypeCollectionAccess().getTypeModelTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getModelTypeCollectionAccess().getTypeModelTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelTypeCollection__TypeAssignment_2"


    // $ANTLR start "rule__SimpleTypeCollection__CollectionAssignment_0"
    // InternalModelDsl.g:4991:1: rule__SimpleTypeCollection__CollectionAssignment_0 : ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__SimpleTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:4995:1: ( ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalModelDsl.g:4996:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalModelDsl.g:4996:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalModelDsl.g:4997:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalModelDsl.g:4998:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            // InternalModelDsl.g:4998:4: rule__SimpleTypeCollection__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeCollection__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__CollectionAssignment_0"


    // $ANTLR start "rule__SimpleTypeCollection__TypeAssignment_2"
    // InternalModelDsl.g:5006:1: rule__SimpleTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:5010:1: ( ( ruleType ) )
            // InternalModelDsl.g:5011:2: ( ruleType )
            {
            // InternalModelDsl.g:5011:2: ( ruleType )
            // InternalModelDsl.g:5012:3: ruleType
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeCollectionAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeCollection__TypeAssignment_2"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\12\23\2\uffff\2\4";
    static final String dfa_3s = "\1\50\12\23\2\uffff\2\51";
    static final String dfa_4s = "\13\uffff\1\2\1\1\2\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\3\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\12\15\uffff\1\13\6\uffff\1\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\16",
            "",
            "",
            "\14\13\3\uffff\1\13\11\uffff\2\13\2\uffff\1\13\5\uffff\1\14\1\uffff\1\13",
            "\14\13\3\uffff\1\13\11\uffff\2\13\2\uffff\1\13\5\uffff\1\14\1\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1582:2: ( rule__SimpleEntity__AttributesIdAssignment_5 )*";
        }
    }
    static final String dfa_7s = "\40\uffff";
    static final String dfa_8s = "\1\4\11\23\1\uffff\2\54\1\23\3\4\1\uffff\12\55\2\23\2\4";
    static final String dfa_9s = "\1\41\11\23\1\uffff\2\54\1\23\1\51\1\23\1\51\1\uffff\12\55\2\23\2\51";
    static final String dfa_10s = "\12\uffff\1\2\6\uffff\1\1\16\uffff";
    static final String dfa_11s = "\40\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\1\13\1\14\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\15\15\uffff\1\12",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "",
            "\1\17",
            "\1\17",
            "\1\20",
            "\14\21\3\uffff\1\21\11\uffff\2\21\2\uffff\1\21\7\uffff\1\12",
            "\1\33\3\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\3\uffff\1\22",
            "\14\21\3\uffff\1\21\11\uffff\2\21\2\uffff\1\21\7\uffff\1\12",
            "",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\37",
            "\14\21\3\uffff\1\21\15\uffff\1\21\7\uffff\1\12",
            "\14\21\3\uffff\1\21\15\uffff\1\21\7\uffff\1\12"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 1609:2: ( rule__SimpleEntity__AttributesAssignment_6 )*";
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 1879:2: ( rule__AssociativeEntity__AttributesAssignment_5 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000007880000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001020008FFF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001000008FF12L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000008FF72L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000008FFF2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000020008FFF0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000008FF70L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000004000008FF70L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000000FF10L});

}