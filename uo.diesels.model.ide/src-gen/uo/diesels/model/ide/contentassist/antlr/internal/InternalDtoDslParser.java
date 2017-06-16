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
import uo.diesels.model.services.DtoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDtoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_LIST", "RULE_SET", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_TYPE_BINARY", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Dto'", "'{'", "'}'", "'for'", "'<'", "'>'"
    };
    public static final int RULE_SET=6;
    public static final int RULE_STRING=17;
    public static final int RULE_TYPE_CHAR=11;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_TYPE_STRING=12;
    public static final int EOF=-1;
    public static final int RULE_TYPE_INT=7;
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=10;
    public static final int RULE_ID=15;
    public static final int RULE_WS=20;
    public static final int RULE_TYPE_FLOAT=9;
    public static final int RULE_TYPE_BINARY=14;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_TYPE_BOOLEAN=13;
    public static final int RULE_DATE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=16;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_TYPE_DOUBLE=8;
    public static final int T__25=25;

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

    	public void setGrammarAccess(DtoDslGrammarAccess grammarAccess) {
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
    // InternalDtoDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDtoDsl.g:54:1: ( ruleModel EOF )
            // InternalDtoDsl.g:55:1: ruleModel EOF
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
    // InternalDtoDsl.g:62:1: ruleModel : ( ( rule__Model__DtosAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:66:2: ( ( ( rule__Model__DtosAssignment )* ) )
            // InternalDtoDsl.g:67:2: ( ( rule__Model__DtosAssignment )* )
            {
            // InternalDtoDsl.g:67:2: ( ( rule__Model__DtosAssignment )* )
            // InternalDtoDsl.g:68:3: ( rule__Model__DtosAssignment )*
            {
             before(grammarAccess.getModelAccess().getDtosAssignment()); 
            // InternalDtoDsl.g:69:3: ( rule__Model__DtosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDtoDsl.g:69:4: rule__Model__DtosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DtosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDtosAssignment()); 

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


    // $ANTLR start "entryRuleDto"
    // InternalDtoDsl.g:78:1: entryRuleDto : ruleDto EOF ;
    public final void entryRuleDto() throws RecognitionException {
        try {
            // InternalDtoDsl.g:79:1: ( ruleDto EOF )
            // InternalDtoDsl.g:80:1: ruleDto EOF
            {
             before(grammarAccess.getDtoRule()); 
            pushFollow(FOLLOW_1);
            ruleDto();

            state._fsp--;

             after(grammarAccess.getDtoRule()); 
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
    // $ANTLR end "entryRuleDto"


    // $ANTLR start "ruleDto"
    // InternalDtoDsl.g:87:1: ruleDto : ( ( rule__Dto__Alternatives ) ) ;
    public final void ruleDto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:91:2: ( ( ( rule__Dto__Alternatives ) ) )
            // InternalDtoDsl.g:92:2: ( ( rule__Dto__Alternatives ) )
            {
            // InternalDtoDsl.g:92:2: ( ( rule__Dto__Alternatives ) )
            // InternalDtoDsl.g:93:3: ( rule__Dto__Alternatives )
            {
             before(grammarAccess.getDtoAccess().getAlternatives()); 
            // InternalDtoDsl.g:94:3: ( rule__Dto__Alternatives )
            // InternalDtoDsl.g:94:4: rule__Dto__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dto__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDtoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDto"


    // $ANTLR start "entryRuleDtoEntity"
    // InternalDtoDsl.g:103:1: entryRuleDtoEntity : ruleDtoEntity EOF ;
    public final void entryRuleDtoEntity() throws RecognitionException {
        try {
            // InternalDtoDsl.g:104:1: ( ruleDtoEntity EOF )
            // InternalDtoDsl.g:105:1: ruleDtoEntity EOF
            {
             before(grammarAccess.getDtoEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleDtoEntity();

            state._fsp--;

             after(grammarAccess.getDtoEntityRule()); 
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
    // $ANTLR end "entryRuleDtoEntity"


    // $ANTLR start "ruleDtoEntity"
    // InternalDtoDsl.g:112:1: ruleDtoEntity : ( ( rule__DtoEntity__Group__0 ) ) ;
    public final void ruleDtoEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:116:2: ( ( ( rule__DtoEntity__Group__0 ) ) )
            // InternalDtoDsl.g:117:2: ( ( rule__DtoEntity__Group__0 ) )
            {
            // InternalDtoDsl.g:117:2: ( ( rule__DtoEntity__Group__0 ) )
            // InternalDtoDsl.g:118:3: ( rule__DtoEntity__Group__0 )
            {
             before(grammarAccess.getDtoEntityAccess().getGroup()); 
            // InternalDtoDsl.g:119:3: ( rule__DtoEntity__Group__0 )
            // InternalDtoDsl.g:119:4: rule__DtoEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DtoEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDtoEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleDtoEntity"


    // $ANTLR start "entryRuleDtoFor"
    // InternalDtoDsl.g:128:1: entryRuleDtoFor : ruleDtoFor EOF ;
    public final void entryRuleDtoFor() throws RecognitionException {
        try {
            // InternalDtoDsl.g:129:1: ( ruleDtoFor EOF )
            // InternalDtoDsl.g:130:1: ruleDtoFor EOF
            {
             before(grammarAccess.getDtoForRule()); 
            pushFollow(FOLLOW_1);
            ruleDtoFor();

            state._fsp--;

             after(grammarAccess.getDtoForRule()); 
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
    // $ANTLR end "entryRuleDtoFor"


    // $ANTLR start "ruleDtoFor"
    // InternalDtoDsl.g:137:1: ruleDtoFor : ( ( rule__DtoFor__Group__0 ) ) ;
    public final void ruleDtoFor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:141:2: ( ( ( rule__DtoFor__Group__0 ) ) )
            // InternalDtoDsl.g:142:2: ( ( rule__DtoFor__Group__0 ) )
            {
            // InternalDtoDsl.g:142:2: ( ( rule__DtoFor__Group__0 ) )
            // InternalDtoDsl.g:143:3: ( rule__DtoFor__Group__0 )
            {
             before(grammarAccess.getDtoForAccess().getGroup()); 
            // InternalDtoDsl.g:144:3: ( rule__DtoFor__Group__0 )
            // InternalDtoDsl.g:144:4: rule__DtoFor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DtoFor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDtoForAccess().getGroup()); 

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
    // $ANTLR end "ruleDtoFor"


    // $ANTLR start "entryRuleDefDtoAttribute"
    // InternalDtoDsl.g:153:1: entryRuleDefDtoAttribute : ruleDefDtoAttribute EOF ;
    public final void entryRuleDefDtoAttribute() throws RecognitionException {
        try {
            // InternalDtoDsl.g:154:1: ( ruleDefDtoAttribute EOF )
            // InternalDtoDsl.g:155:1: ruleDefDtoAttribute EOF
            {
             before(grammarAccess.getDefDtoAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoAttribute();

            state._fsp--;

             after(grammarAccess.getDefDtoAttributeRule()); 
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
    // $ANTLR end "entryRuleDefDtoAttribute"


    // $ANTLR start "ruleDefDtoAttribute"
    // InternalDtoDsl.g:162:1: ruleDefDtoAttribute : ( ( rule__DefDtoAttribute__Alternatives ) ) ;
    public final void ruleDefDtoAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:166:2: ( ( ( rule__DefDtoAttribute__Alternatives ) ) )
            // InternalDtoDsl.g:167:2: ( ( rule__DefDtoAttribute__Alternatives ) )
            {
            // InternalDtoDsl.g:167:2: ( ( rule__DefDtoAttribute__Alternatives ) )
            // InternalDtoDsl.g:168:3: ( rule__DefDtoAttribute__Alternatives )
            {
             before(grammarAccess.getDefDtoAttributeAccess().getAlternatives()); 
            // InternalDtoDsl.g:169:3: ( rule__DefDtoAttribute__Alternatives )
            // InternalDtoDsl.g:169:4: rule__DefDtoAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefDtoAttribute"


    // $ANTLR start "entryRuleDefDtoSimpleVariable"
    // InternalDtoDsl.g:178:1: entryRuleDefDtoSimpleVariable : ruleDefDtoSimpleVariable EOF ;
    public final void entryRuleDefDtoSimpleVariable() throws RecognitionException {
        try {
            // InternalDtoDsl.g:179:1: ( ruleDefDtoSimpleVariable EOF )
            // InternalDtoDsl.g:180:1: ruleDefDtoSimpleVariable EOF
            {
             before(grammarAccess.getDefDtoSimpleVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoSimpleVariable();

            state._fsp--;

             after(grammarAccess.getDefDtoSimpleVariableRule()); 
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
    // $ANTLR end "entryRuleDefDtoSimpleVariable"


    // $ANTLR start "ruleDefDtoSimpleVariable"
    // InternalDtoDsl.g:187:1: ruleDefDtoSimpleVariable : ( ( rule__DefDtoSimpleVariable__Group__0 ) ) ;
    public final void ruleDefDtoSimpleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:191:2: ( ( ( rule__DefDtoSimpleVariable__Group__0 ) ) )
            // InternalDtoDsl.g:192:2: ( ( rule__DefDtoSimpleVariable__Group__0 ) )
            {
            // InternalDtoDsl.g:192:2: ( ( rule__DefDtoSimpleVariable__Group__0 ) )
            // InternalDtoDsl.g:193:3: ( rule__DefDtoSimpleVariable__Group__0 )
            {
             before(grammarAccess.getDefDtoSimpleVariableAccess().getGroup()); 
            // InternalDtoDsl.g:194:3: ( rule__DefDtoSimpleVariable__Group__0 )
            // InternalDtoDsl.g:194:4: rule__DefDtoSimpleVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefDtoSimpleVariable"


    // $ANTLR start "entryRuleDefDtoModelTypeVariable"
    // InternalDtoDsl.g:203:1: entryRuleDefDtoModelTypeVariable : ruleDefDtoModelTypeVariable EOF ;
    public final void entryRuleDefDtoModelTypeVariable() throws RecognitionException {
        try {
            // InternalDtoDsl.g:204:1: ( ruleDefDtoModelTypeVariable EOF )
            // InternalDtoDsl.g:205:1: ruleDefDtoModelTypeVariable EOF
            {
             before(grammarAccess.getDefDtoModelTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoModelTypeVariable();

            state._fsp--;

             after(grammarAccess.getDefDtoModelTypeVariableRule()); 
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
    // $ANTLR end "entryRuleDefDtoModelTypeVariable"


    // $ANTLR start "ruleDefDtoModelTypeVariable"
    // InternalDtoDsl.g:212:1: ruleDefDtoModelTypeVariable : ( ( rule__DefDtoModelTypeVariable__Group__0 ) ) ;
    public final void ruleDefDtoModelTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:216:2: ( ( ( rule__DefDtoModelTypeVariable__Group__0 ) ) )
            // InternalDtoDsl.g:217:2: ( ( rule__DefDtoModelTypeVariable__Group__0 ) )
            {
            // InternalDtoDsl.g:217:2: ( ( rule__DefDtoModelTypeVariable__Group__0 ) )
            // InternalDtoDsl.g:218:3: ( rule__DefDtoModelTypeVariable__Group__0 )
            {
             before(grammarAccess.getDefDtoModelTypeVariableAccess().getGroup()); 
            // InternalDtoDsl.g:219:3: ( rule__DefDtoModelTypeVariable__Group__0 )
            // InternalDtoDsl.g:219:4: rule__DefDtoModelTypeVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefDtoModelTypeVariable"


    // $ANTLR start "entryRuleDefDtoCollectionTypeAttribute"
    // InternalDtoDsl.g:228:1: entryRuleDefDtoCollectionTypeAttribute : ruleDefDtoCollectionTypeAttribute EOF ;
    public final void entryRuleDefDtoCollectionTypeAttribute() throws RecognitionException {
        try {
            // InternalDtoDsl.g:229:1: ( ruleDefDtoCollectionTypeAttribute EOF )
            // InternalDtoDsl.g:230:1: ruleDefDtoCollectionTypeAttribute EOF
            {
             before(grammarAccess.getDefDtoCollectionTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoCollectionTypeAttribute();

            state._fsp--;

             after(grammarAccess.getDefDtoCollectionTypeAttributeRule()); 
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
    // $ANTLR end "entryRuleDefDtoCollectionTypeAttribute"


    // $ANTLR start "ruleDefDtoCollectionTypeAttribute"
    // InternalDtoDsl.g:237:1: ruleDefDtoCollectionTypeAttribute : ( ( rule__DefDtoCollectionTypeAttribute__Alternatives ) ) ;
    public final void ruleDefDtoCollectionTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:241:2: ( ( ( rule__DefDtoCollectionTypeAttribute__Alternatives ) ) )
            // InternalDtoDsl.g:242:2: ( ( rule__DefDtoCollectionTypeAttribute__Alternatives ) )
            {
            // InternalDtoDsl.g:242:2: ( ( rule__DefDtoCollectionTypeAttribute__Alternatives ) )
            // InternalDtoDsl.g:243:3: ( rule__DefDtoCollectionTypeAttribute__Alternatives )
            {
             before(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getAlternatives()); 
            // InternalDtoDsl.g:244:3: ( rule__DefDtoCollectionTypeAttribute__Alternatives )
            // InternalDtoDsl.g:244:4: rule__DefDtoCollectionTypeAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoCollectionTypeAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefDtoCollectionTypeAttribute"


    // $ANTLR start "entryRuleDefDtoModelTypeCollectionVariable"
    // InternalDtoDsl.g:253:1: entryRuleDefDtoModelTypeCollectionVariable : ruleDefDtoModelTypeCollectionVariable EOF ;
    public final void entryRuleDefDtoModelTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalDtoDsl.g:254:1: ( ruleDefDtoModelTypeCollectionVariable EOF )
            // InternalDtoDsl.g:255:1: ruleDefDtoModelTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoModelTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefDtoModelTypeCollectionVariableRule()); 
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
    // $ANTLR end "entryRuleDefDtoModelTypeCollectionVariable"


    // $ANTLR start "ruleDefDtoModelTypeCollectionVariable"
    // InternalDtoDsl.g:262:1: ruleDefDtoModelTypeCollectionVariable : ( ( rule__DefDtoModelTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefDtoModelTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:266:2: ( ( ( rule__DefDtoModelTypeCollectionVariable__Group__0 ) ) )
            // InternalDtoDsl.g:267:2: ( ( rule__DefDtoModelTypeCollectionVariable__Group__0 ) )
            {
            // InternalDtoDsl.g:267:2: ( ( rule__DefDtoModelTypeCollectionVariable__Group__0 ) )
            // InternalDtoDsl.g:268:3: ( rule__DefDtoModelTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGroup()); 
            // InternalDtoDsl.g:269:3: ( rule__DefDtoModelTypeCollectionVariable__Group__0 )
            // InternalDtoDsl.g:269:4: rule__DefDtoModelTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefDtoModelTypeCollectionVariable"


    // $ANTLR start "entryRuleDefDtoSimpleTypeCollectionVariable"
    // InternalDtoDsl.g:278:1: entryRuleDefDtoSimpleTypeCollectionVariable : ruleDefDtoSimpleTypeCollectionVariable EOF ;
    public final void entryRuleDefDtoSimpleTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalDtoDsl.g:279:1: ( ruleDefDtoSimpleTypeCollectionVariable EOF )
            // InternalDtoDsl.g:280:1: ruleDefDtoSimpleTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoSimpleTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule()); 
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
    // $ANTLR end "entryRuleDefDtoSimpleTypeCollectionVariable"


    // $ANTLR start "ruleDefDtoSimpleTypeCollectionVariable"
    // InternalDtoDsl.g:287:1: ruleDefDtoSimpleTypeCollectionVariable : ( ( rule__DefDtoSimpleTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefDtoSimpleTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:291:2: ( ( ( rule__DefDtoSimpleTypeCollectionVariable__Group__0 ) ) )
            // InternalDtoDsl.g:292:2: ( ( rule__DefDtoSimpleTypeCollectionVariable__Group__0 ) )
            {
            // InternalDtoDsl.g:292:2: ( ( rule__DefDtoSimpleTypeCollectionVariable__Group__0 ) )
            // InternalDtoDsl.g:293:3: ( rule__DefDtoSimpleTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGroup()); 
            // InternalDtoDsl.g:294:3: ( rule__DefDtoSimpleTypeCollectionVariable__Group__0 )
            // InternalDtoDsl.g:294:4: rule__DefDtoSimpleTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefDtoSimpleTypeCollectionVariable"


    // $ANTLR start "entryRuleType"
    // InternalDtoDsl.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDtoDsl.g:304:1: ( ruleType EOF )
            // InternalDtoDsl.g:305:1: ruleType EOF
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
    // InternalDtoDsl.g:312:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:316:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDtoDsl.g:317:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDtoDsl.g:317:2: ( ( rule__Type__Alternatives ) )
            // InternalDtoDsl.g:318:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDtoDsl.g:319:3: ( rule__Type__Alternatives )
            // InternalDtoDsl.g:319:4: rule__Type__Alternatives
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
    // InternalDtoDsl.g:328:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalDtoDsl.g:329:1: ( ruleBasicType EOF )
            // InternalDtoDsl.g:330:1: ruleBasicType EOF
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
    // InternalDtoDsl.g:337:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:341:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDtoDsl.g:342:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDtoDsl.g:342:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDtoDsl.g:343:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDtoDsl.g:344:3: ( rule__BasicType__Alternatives )
            // InternalDtoDsl.g:344:4: rule__BasicType__Alternatives
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
    // InternalDtoDsl.g:353:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalDtoDsl.g:354:1: ( ruleComplexType EOF )
            // InternalDtoDsl.g:355:1: ruleComplexType EOF
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
    // InternalDtoDsl.g:362:1: ruleComplexType : ( RULE_DATE ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:366:2: ( ( RULE_DATE ) )
            // InternalDtoDsl.g:367:2: ( RULE_DATE )
            {
            // InternalDtoDsl.g:367:2: ( RULE_DATE )
            // InternalDtoDsl.g:368:3: RULE_DATE
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


    // $ANTLR start "rule__Dto__Alternatives"
    // InternalDtoDsl.g:377:1: rule__Dto__Alternatives : ( ( ruleDtoEntity ) | ( ruleDtoFor ) );
    public final void rule__Dto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:381:1: ( ( ruleDtoEntity ) | ( ruleDtoFor ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==23) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==25) ) {
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
                    // InternalDtoDsl.g:382:2: ( ruleDtoEntity )
                    {
                    // InternalDtoDsl.g:382:2: ( ruleDtoEntity )
                    // InternalDtoDsl.g:383:3: ruleDtoEntity
                    {
                     before(grammarAccess.getDtoAccess().getDtoEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDtoEntity();

                    state._fsp--;

                     after(grammarAccess.getDtoAccess().getDtoEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:388:2: ( ruleDtoFor )
                    {
                    // InternalDtoDsl.g:388:2: ( ruleDtoFor )
                    // InternalDtoDsl.g:389:3: ruleDtoFor
                    {
                     before(grammarAccess.getDtoAccess().getDtoForParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDtoFor();

                    state._fsp--;

                     after(grammarAccess.getDtoAccess().getDtoForParserRuleCall_1()); 

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
    // $ANTLR end "rule__Dto__Alternatives"


    // $ANTLR start "rule__DefDtoAttribute__Alternatives"
    // InternalDtoDsl.g:398:1: rule__DefDtoAttribute__Alternatives : ( ( ruleDefDtoSimpleVariable ) | ( ruleDefDtoModelTypeVariable ) | ( ruleDefDtoCollectionTypeAttribute ) );
    public final void rule__DefDtoAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:402:1: ( ( ruleDefDtoSimpleVariable ) | ( ruleDefDtoModelTypeVariable ) | ( ruleDefDtoCollectionTypeAttribute ) )
            int alt3=3;
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
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDtoDsl.g:403:2: ( ruleDefDtoSimpleVariable )
                    {
                    // InternalDtoDsl.g:403:2: ( ruleDefDtoSimpleVariable )
                    // InternalDtoDsl.g:404:3: ruleDefDtoSimpleVariable
                    {
                     before(grammarAccess.getDefDtoAttributeAccess().getDefDtoSimpleVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoSimpleVariable();

                    state._fsp--;

                     after(grammarAccess.getDefDtoAttributeAccess().getDefDtoSimpleVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:409:2: ( ruleDefDtoModelTypeVariable )
                    {
                    // InternalDtoDsl.g:409:2: ( ruleDefDtoModelTypeVariable )
                    // InternalDtoDsl.g:410:3: ruleDefDtoModelTypeVariable
                    {
                     before(grammarAccess.getDefDtoAttributeAccess().getDefDtoModelTypeVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoModelTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefDtoAttributeAccess().getDefDtoModelTypeVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDtoDsl.g:415:2: ( ruleDefDtoCollectionTypeAttribute )
                    {
                    // InternalDtoDsl.g:415:2: ( ruleDefDtoCollectionTypeAttribute )
                    // InternalDtoDsl.g:416:3: ruleDefDtoCollectionTypeAttribute
                    {
                     before(grammarAccess.getDefDtoAttributeAccess().getDefDtoCollectionTypeAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoCollectionTypeAttribute();

                    state._fsp--;

                     after(grammarAccess.getDefDtoAttributeAccess().getDefDtoCollectionTypeAttributeParserRuleCall_2()); 

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
    // $ANTLR end "rule__DefDtoAttribute__Alternatives"


    // $ANTLR start "rule__DefDtoCollectionTypeAttribute__Alternatives"
    // InternalDtoDsl.g:425:1: rule__DefDtoCollectionTypeAttribute__Alternatives : ( ( ruleDefDtoModelTypeCollectionVariable ) | ( ruleDefDtoSimpleTypeCollectionVariable ) );
    public final void rule__DefDtoCollectionTypeAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:429:1: ( ( ruleDefDtoModelTypeCollectionVariable ) | ( ruleDefDtoSimpleTypeCollectionVariable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LIST) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_ID) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==RULE_DATE||(LA4_3>=RULE_TYPE_INT && LA4_3<=RULE_TYPE_BINARY)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_SET) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==26) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_ID) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==RULE_DATE||(LA4_3>=RULE_TYPE_INT && LA4_3<=RULE_TYPE_BINARY)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDtoDsl.g:430:2: ( ruleDefDtoModelTypeCollectionVariable )
                    {
                    // InternalDtoDsl.g:430:2: ( ruleDefDtoModelTypeCollectionVariable )
                    // InternalDtoDsl.g:431:3: ruleDefDtoModelTypeCollectionVariable
                    {
                     before(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoModelTypeCollectionVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoModelTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoModelTypeCollectionVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:436:2: ( ruleDefDtoSimpleTypeCollectionVariable )
                    {
                    // InternalDtoDsl.g:436:2: ( ruleDefDtoSimpleTypeCollectionVariable )
                    // InternalDtoDsl.g:437:3: ruleDefDtoSimpleTypeCollectionVariable
                    {
                     before(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoSimpleTypeCollectionVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoSimpleTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoSimpleTypeCollectionVariableParserRuleCall_1()); 

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
    // $ANTLR end "rule__DefDtoCollectionTypeAttribute__Alternatives"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0"
    // InternalDtoDsl.g:446:1: rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:450:1: ( ( RULE_LIST ) | ( RULE_SET ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LIST) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SET) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDtoDsl.g:451:2: ( RULE_LIST )
                    {
                    // InternalDtoDsl.g:451:2: ( RULE_LIST )
                    // InternalDtoDsl.g:452:3: RULE_LIST
                    {
                     before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:457:2: ( RULE_SET )
                    {
                    // InternalDtoDsl.g:457:2: ( RULE_SET )
                    // InternalDtoDsl.g:458:3: RULE_SET
                    {
                     before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SET,FOLLOW_2); 
                     after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0"
    // InternalDtoDsl.g:467:1: rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:471:1: ( ( RULE_LIST ) | ( RULE_SET ) )
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
                    // InternalDtoDsl.g:472:2: ( RULE_LIST )
                    {
                    // InternalDtoDsl.g:472:2: ( RULE_LIST )
                    // InternalDtoDsl.g:473:3: RULE_LIST
                    {
                     before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:478:2: ( RULE_SET )
                    {
                    // InternalDtoDsl.g:478:2: ( RULE_SET )
                    // InternalDtoDsl.g:479:3: RULE_SET
                    {
                     before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SET,FOLLOW_2); 
                     after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDtoDsl.g:488:1: rule__Type__Alternatives : ( ( ruleBasicType ) | ( ruleComplexType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:492:1: ( ( ruleBasicType ) | ( ruleComplexType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_TYPE_INT && LA7_0<=RULE_TYPE_BINARY)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_DATE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDtoDsl.g:493:2: ( ruleBasicType )
                    {
                    // InternalDtoDsl.g:493:2: ( ruleBasicType )
                    // InternalDtoDsl.g:494:3: ruleBasicType
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
                    // InternalDtoDsl.g:499:2: ( ruleComplexType )
                    {
                    // InternalDtoDsl.g:499:2: ( ruleComplexType )
                    // InternalDtoDsl.g:500:3: ruleComplexType
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
    // InternalDtoDsl.g:509:1: rule__BasicType__Alternatives : ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:513:1: ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_TYPE_DOUBLE:
                {
                alt8=2;
                }
                break;
            case RULE_TYPE_FLOAT:
                {
                alt8=3;
                }
                break;
            case RULE_TYPE_LONG:
                {
                alt8=4;
                }
                break;
            case RULE_TYPE_CHAR:
                {
                alt8=5;
                }
                break;
            case RULE_TYPE_STRING:
                {
                alt8=6;
                }
                break;
            case RULE_TYPE_BOOLEAN:
                {
                alt8=7;
                }
                break;
            case RULE_TYPE_BINARY:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDtoDsl.g:514:2: ( RULE_TYPE_INT )
                    {
                    // InternalDtoDsl.g:514:2: ( RULE_TYPE_INT )
                    // InternalDtoDsl.g:515:3: RULE_TYPE_INT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 
                    match(input,RULE_TYPE_INT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDtoDsl.g:520:2: ( RULE_TYPE_DOUBLE )
                    {
                    // InternalDtoDsl.g:520:2: ( RULE_TYPE_DOUBLE )
                    // InternalDtoDsl.g:521:3: RULE_TYPE_DOUBLE
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDtoDsl.g:526:2: ( RULE_TYPE_FLOAT )
                    {
                    // InternalDtoDsl.g:526:2: ( RULE_TYPE_FLOAT )
                    // InternalDtoDsl.g:527:3: RULE_TYPE_FLOAT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 
                    match(input,RULE_TYPE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDtoDsl.g:532:2: ( RULE_TYPE_LONG )
                    {
                    // InternalDtoDsl.g:532:2: ( RULE_TYPE_LONG )
                    // InternalDtoDsl.g:533:3: RULE_TYPE_LONG
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 
                    match(input,RULE_TYPE_LONG,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDtoDsl.g:538:2: ( RULE_TYPE_CHAR )
                    {
                    // InternalDtoDsl.g:538:2: ( RULE_TYPE_CHAR )
                    // InternalDtoDsl.g:539:3: RULE_TYPE_CHAR
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 
                    match(input,RULE_TYPE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDtoDsl.g:544:2: ( RULE_TYPE_STRING )
                    {
                    // InternalDtoDsl.g:544:2: ( RULE_TYPE_STRING )
                    // InternalDtoDsl.g:545:3: RULE_TYPE_STRING
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 
                    match(input,RULE_TYPE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDtoDsl.g:550:2: ( RULE_TYPE_BOOLEAN )
                    {
                    // InternalDtoDsl.g:550:2: ( RULE_TYPE_BOOLEAN )
                    // InternalDtoDsl.g:551:3: RULE_TYPE_BOOLEAN
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); 
                    match(input,RULE_TYPE_BOOLEAN,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDtoDsl.g:556:2: ( RULE_TYPE_BINARY )
                    {
                    // InternalDtoDsl.g:556:2: ( RULE_TYPE_BINARY )
                    // InternalDtoDsl.g:557:3: RULE_TYPE_BINARY
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


    // $ANTLR start "rule__DtoEntity__Group__0"
    // InternalDtoDsl.g:566:1: rule__DtoEntity__Group__0 : rule__DtoEntity__Group__0__Impl rule__DtoEntity__Group__1 ;
    public final void rule__DtoEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:570:1: ( rule__DtoEntity__Group__0__Impl rule__DtoEntity__Group__1 )
            // InternalDtoDsl.g:571:2: rule__DtoEntity__Group__0__Impl rule__DtoEntity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DtoEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoEntity__Group__1();

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
    // $ANTLR end "rule__DtoEntity__Group__0"


    // $ANTLR start "rule__DtoEntity__Group__0__Impl"
    // InternalDtoDsl.g:578:1: rule__DtoEntity__Group__0__Impl : ( 'Dto' ) ;
    public final void rule__DtoEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:582:1: ( ( 'Dto' ) )
            // InternalDtoDsl.g:583:1: ( 'Dto' )
            {
            // InternalDtoDsl.g:583:1: ( 'Dto' )
            // InternalDtoDsl.g:584:2: 'Dto'
            {
             before(grammarAccess.getDtoEntityAccess().getDtoKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDtoEntityAccess().getDtoKeyword_0()); 

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
    // $ANTLR end "rule__DtoEntity__Group__0__Impl"


    // $ANTLR start "rule__DtoEntity__Group__1"
    // InternalDtoDsl.g:593:1: rule__DtoEntity__Group__1 : rule__DtoEntity__Group__1__Impl rule__DtoEntity__Group__2 ;
    public final void rule__DtoEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:597:1: ( rule__DtoEntity__Group__1__Impl rule__DtoEntity__Group__2 )
            // InternalDtoDsl.g:598:2: rule__DtoEntity__Group__1__Impl rule__DtoEntity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DtoEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoEntity__Group__2();

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
    // $ANTLR end "rule__DtoEntity__Group__1"


    // $ANTLR start "rule__DtoEntity__Group__1__Impl"
    // InternalDtoDsl.g:605:1: rule__DtoEntity__Group__1__Impl : ( ( rule__DtoEntity__NameAssignment_1 ) ) ;
    public final void rule__DtoEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:609:1: ( ( ( rule__DtoEntity__NameAssignment_1 ) ) )
            // InternalDtoDsl.g:610:1: ( ( rule__DtoEntity__NameAssignment_1 ) )
            {
            // InternalDtoDsl.g:610:1: ( ( rule__DtoEntity__NameAssignment_1 ) )
            // InternalDtoDsl.g:611:2: ( rule__DtoEntity__NameAssignment_1 )
            {
             before(grammarAccess.getDtoEntityAccess().getNameAssignment_1()); 
            // InternalDtoDsl.g:612:2: ( rule__DtoEntity__NameAssignment_1 )
            // InternalDtoDsl.g:612:3: rule__DtoEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DtoEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDtoEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DtoEntity__Group__1__Impl"


    // $ANTLR start "rule__DtoEntity__Group__2"
    // InternalDtoDsl.g:620:1: rule__DtoEntity__Group__2 : rule__DtoEntity__Group__2__Impl rule__DtoEntity__Group__3 ;
    public final void rule__DtoEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:624:1: ( rule__DtoEntity__Group__2__Impl rule__DtoEntity__Group__3 )
            // InternalDtoDsl.g:625:2: rule__DtoEntity__Group__2__Impl rule__DtoEntity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DtoEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoEntity__Group__3();

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
    // $ANTLR end "rule__DtoEntity__Group__2"


    // $ANTLR start "rule__DtoEntity__Group__2__Impl"
    // InternalDtoDsl.g:632:1: rule__DtoEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__DtoEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:636:1: ( ( '{' ) )
            // InternalDtoDsl.g:637:1: ( '{' )
            {
            // InternalDtoDsl.g:637:1: ( '{' )
            // InternalDtoDsl.g:638:2: '{'
            {
             before(grammarAccess.getDtoEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDtoEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DtoEntity__Group__2__Impl"


    // $ANTLR start "rule__DtoEntity__Group__3"
    // InternalDtoDsl.g:647:1: rule__DtoEntity__Group__3 : rule__DtoEntity__Group__3__Impl rule__DtoEntity__Group__4 ;
    public final void rule__DtoEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:651:1: ( rule__DtoEntity__Group__3__Impl rule__DtoEntity__Group__4 )
            // InternalDtoDsl.g:652:2: rule__DtoEntity__Group__3__Impl rule__DtoEntity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DtoEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoEntity__Group__4();

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
    // $ANTLR end "rule__DtoEntity__Group__3"


    // $ANTLR start "rule__DtoEntity__Group__3__Impl"
    // InternalDtoDsl.g:659:1: rule__DtoEntity__Group__3__Impl : ( ( rule__DtoEntity__AttributesAssignment_3 )* ) ;
    public final void rule__DtoEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:663:1: ( ( ( rule__DtoEntity__AttributesAssignment_3 )* ) )
            // InternalDtoDsl.g:664:1: ( ( rule__DtoEntity__AttributesAssignment_3 )* )
            {
            // InternalDtoDsl.g:664:1: ( ( rule__DtoEntity__AttributesAssignment_3 )* )
            // InternalDtoDsl.g:665:2: ( rule__DtoEntity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getDtoEntityAccess().getAttributesAssignment_3()); 
            // InternalDtoDsl.g:666:2: ( rule__DtoEntity__AttributesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_DATE && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDtoDsl.g:666:3: rule__DtoEntity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DtoEntity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDtoEntityAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__DtoEntity__Group__3__Impl"


    // $ANTLR start "rule__DtoEntity__Group__4"
    // InternalDtoDsl.g:674:1: rule__DtoEntity__Group__4 : rule__DtoEntity__Group__4__Impl ;
    public final void rule__DtoEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:678:1: ( rule__DtoEntity__Group__4__Impl )
            // InternalDtoDsl.g:679:2: rule__DtoEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtoEntity__Group__4__Impl();

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
    // $ANTLR end "rule__DtoEntity__Group__4"


    // $ANTLR start "rule__DtoEntity__Group__4__Impl"
    // InternalDtoDsl.g:685:1: rule__DtoEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__DtoEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:689:1: ( ( '}' ) )
            // InternalDtoDsl.g:690:1: ( '}' )
            {
            // InternalDtoDsl.g:690:1: ( '}' )
            // InternalDtoDsl.g:691:2: '}'
            {
             before(grammarAccess.getDtoEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDtoEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DtoEntity__Group__4__Impl"


    // $ANTLR start "rule__DtoFor__Group__0"
    // InternalDtoDsl.g:701:1: rule__DtoFor__Group__0 : rule__DtoFor__Group__0__Impl rule__DtoFor__Group__1 ;
    public final void rule__DtoFor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:705:1: ( rule__DtoFor__Group__0__Impl rule__DtoFor__Group__1 )
            // InternalDtoDsl.g:706:2: rule__DtoFor__Group__0__Impl rule__DtoFor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DtoFor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoFor__Group__1();

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
    // $ANTLR end "rule__DtoFor__Group__0"


    // $ANTLR start "rule__DtoFor__Group__0__Impl"
    // InternalDtoDsl.g:713:1: rule__DtoFor__Group__0__Impl : ( 'Dto' ) ;
    public final void rule__DtoFor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:717:1: ( ( 'Dto' ) )
            // InternalDtoDsl.g:718:1: ( 'Dto' )
            {
            // InternalDtoDsl.g:718:1: ( 'Dto' )
            // InternalDtoDsl.g:719:2: 'Dto'
            {
             before(grammarAccess.getDtoForAccess().getDtoKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDtoForAccess().getDtoKeyword_0()); 

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
    // $ANTLR end "rule__DtoFor__Group__0__Impl"


    // $ANTLR start "rule__DtoFor__Group__1"
    // InternalDtoDsl.g:728:1: rule__DtoFor__Group__1 : rule__DtoFor__Group__1__Impl rule__DtoFor__Group__2 ;
    public final void rule__DtoFor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:732:1: ( rule__DtoFor__Group__1__Impl rule__DtoFor__Group__2 )
            // InternalDtoDsl.g:733:2: rule__DtoFor__Group__1__Impl rule__DtoFor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DtoFor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoFor__Group__2();

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
    // $ANTLR end "rule__DtoFor__Group__1"


    // $ANTLR start "rule__DtoFor__Group__1__Impl"
    // InternalDtoDsl.g:740:1: rule__DtoFor__Group__1__Impl : ( ( rule__DtoFor__NameAssignment_1 ) ) ;
    public final void rule__DtoFor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:744:1: ( ( ( rule__DtoFor__NameAssignment_1 ) ) )
            // InternalDtoDsl.g:745:1: ( ( rule__DtoFor__NameAssignment_1 ) )
            {
            // InternalDtoDsl.g:745:1: ( ( rule__DtoFor__NameAssignment_1 ) )
            // InternalDtoDsl.g:746:2: ( rule__DtoFor__NameAssignment_1 )
            {
             before(grammarAccess.getDtoForAccess().getNameAssignment_1()); 
            // InternalDtoDsl.g:747:2: ( rule__DtoFor__NameAssignment_1 )
            // InternalDtoDsl.g:747:3: rule__DtoFor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DtoFor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDtoForAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DtoFor__Group__1__Impl"


    // $ANTLR start "rule__DtoFor__Group__2"
    // InternalDtoDsl.g:755:1: rule__DtoFor__Group__2 : rule__DtoFor__Group__2__Impl rule__DtoFor__Group__3 ;
    public final void rule__DtoFor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:759:1: ( rule__DtoFor__Group__2__Impl rule__DtoFor__Group__3 )
            // InternalDtoDsl.g:760:2: rule__DtoFor__Group__2__Impl rule__DtoFor__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DtoFor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoFor__Group__3();

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
    // $ANTLR end "rule__DtoFor__Group__2"


    // $ANTLR start "rule__DtoFor__Group__2__Impl"
    // InternalDtoDsl.g:767:1: rule__DtoFor__Group__2__Impl : ( 'for' ) ;
    public final void rule__DtoFor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:771:1: ( ( 'for' ) )
            // InternalDtoDsl.g:772:1: ( 'for' )
            {
            // InternalDtoDsl.g:772:1: ( 'for' )
            // InternalDtoDsl.g:773:2: 'for'
            {
             before(grammarAccess.getDtoForAccess().getForKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDtoForAccess().getForKeyword_2()); 

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
    // $ANTLR end "rule__DtoFor__Group__2__Impl"


    // $ANTLR start "rule__DtoFor__Group__3"
    // InternalDtoDsl.g:782:1: rule__DtoFor__Group__3 : rule__DtoFor__Group__3__Impl ;
    public final void rule__DtoFor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:786:1: ( rule__DtoFor__Group__3__Impl )
            // InternalDtoDsl.g:787:2: rule__DtoFor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtoFor__Group__3__Impl();

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
    // $ANTLR end "rule__DtoFor__Group__3"


    // $ANTLR start "rule__DtoFor__Group__3__Impl"
    // InternalDtoDsl.g:793:1: rule__DtoFor__Group__3__Impl : ( ( rule__DtoFor__EntityAssignment_3 ) ) ;
    public final void rule__DtoFor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:797:1: ( ( ( rule__DtoFor__EntityAssignment_3 ) ) )
            // InternalDtoDsl.g:798:1: ( ( rule__DtoFor__EntityAssignment_3 ) )
            {
            // InternalDtoDsl.g:798:1: ( ( rule__DtoFor__EntityAssignment_3 ) )
            // InternalDtoDsl.g:799:2: ( rule__DtoFor__EntityAssignment_3 )
            {
             before(grammarAccess.getDtoForAccess().getEntityAssignment_3()); 
            // InternalDtoDsl.g:800:2: ( rule__DtoFor__EntityAssignment_3 )
            // InternalDtoDsl.g:800:3: rule__DtoFor__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DtoFor__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDtoForAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__DtoFor__Group__3__Impl"


    // $ANTLR start "rule__DefDtoSimpleVariable__Group__0"
    // InternalDtoDsl.g:809:1: rule__DefDtoSimpleVariable__Group__0 : rule__DefDtoSimpleVariable__Group__0__Impl rule__DefDtoSimpleVariable__Group__1 ;
    public final void rule__DefDtoSimpleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:813:1: ( rule__DefDtoSimpleVariable__Group__0__Impl rule__DefDtoSimpleVariable__Group__1 )
            // InternalDtoDsl.g:814:2: rule__DefDtoSimpleVariable__Group__0__Impl rule__DefDtoSimpleVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoSimpleVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleVariable__Group__1();

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
    // $ANTLR end "rule__DefDtoSimpleVariable__Group__0"


    // $ANTLR start "rule__DefDtoSimpleVariable__Group__0__Impl"
    // InternalDtoDsl.g:821:1: rule__DefDtoSimpleVariable__Group__0__Impl : ( ( rule__DefDtoSimpleVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefDtoSimpleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:825:1: ( ( ( rule__DefDtoSimpleVariable__TypeAssignment_0 ) ) )
            // InternalDtoDsl.g:826:1: ( ( rule__DefDtoSimpleVariable__TypeAssignment_0 ) )
            {
            // InternalDtoDsl.g:826:1: ( ( rule__DefDtoSimpleVariable__TypeAssignment_0 ) )
            // InternalDtoDsl.g:827:2: ( rule__DefDtoSimpleVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefDtoSimpleVariableAccess().getTypeAssignment_0()); 
            // InternalDtoDsl.g:828:2: ( rule__DefDtoSimpleVariable__TypeAssignment_0 )
            // InternalDtoDsl.g:828:3: rule__DefDtoSimpleVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleVariable__Group__0__Impl"


    // $ANTLR start "rule__DefDtoSimpleVariable__Group__1"
    // InternalDtoDsl.g:836:1: rule__DefDtoSimpleVariable__Group__1 : rule__DefDtoSimpleVariable__Group__1__Impl ;
    public final void rule__DefDtoSimpleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:840:1: ( rule__DefDtoSimpleVariable__Group__1__Impl )
            // InternalDtoDsl.g:841:2: rule__DefDtoSimpleVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleVariable__Group__1__Impl();

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
    // $ANTLR end "rule__DefDtoSimpleVariable__Group__1"


    // $ANTLR start "rule__DefDtoSimpleVariable__Group__1__Impl"
    // InternalDtoDsl.g:847:1: rule__DefDtoSimpleVariable__Group__1__Impl : ( ( rule__DefDtoSimpleVariable__NameAssignment_1 ) ) ;
    public final void rule__DefDtoSimpleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:851:1: ( ( ( rule__DefDtoSimpleVariable__NameAssignment_1 ) ) )
            // InternalDtoDsl.g:852:1: ( ( rule__DefDtoSimpleVariable__NameAssignment_1 ) )
            {
            // InternalDtoDsl.g:852:1: ( ( rule__DefDtoSimpleVariable__NameAssignment_1 ) )
            // InternalDtoDsl.g:853:2: ( rule__DefDtoSimpleVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefDtoSimpleVariableAccess().getNameAssignment_1()); 
            // InternalDtoDsl.g:854:2: ( rule__DefDtoSimpleVariable__NameAssignment_1 )
            // InternalDtoDsl.g:854:3: rule__DefDtoSimpleVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DefDtoSimpleVariable__Group__1__Impl"


    // $ANTLR start "rule__DefDtoModelTypeVariable__Group__0"
    // InternalDtoDsl.g:863:1: rule__DefDtoModelTypeVariable__Group__0 : rule__DefDtoModelTypeVariable__Group__0__Impl rule__DefDtoModelTypeVariable__Group__1 ;
    public final void rule__DefDtoModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:867:1: ( rule__DefDtoModelTypeVariable__Group__0__Impl rule__DefDtoModelTypeVariable__Group__1 )
            // InternalDtoDsl.g:868:2: rule__DefDtoModelTypeVariable__Group__0__Impl rule__DefDtoModelTypeVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoModelTypeVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeVariable__Group__1();

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
    // $ANTLR end "rule__DefDtoModelTypeVariable__Group__0"


    // $ANTLR start "rule__DefDtoModelTypeVariable__Group__0__Impl"
    // InternalDtoDsl.g:875:1: rule__DefDtoModelTypeVariable__Group__0__Impl : ( ( rule__DefDtoModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefDtoModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:879:1: ( ( ( rule__DefDtoModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalDtoDsl.g:880:1: ( ( rule__DefDtoModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalDtoDsl.g:880:1: ( ( rule__DefDtoModelTypeVariable__TypeAssignment_0 ) )
            // InternalDtoDsl.g:881:2: ( rule__DefDtoModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalDtoDsl.g:882:2: ( rule__DefDtoModelTypeVariable__TypeAssignment_0 )
            // InternalDtoDsl.g:882:3: rule__DefDtoModelTypeVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeVariable__Group__0__Impl"


    // $ANTLR start "rule__DefDtoModelTypeVariable__Group__1"
    // InternalDtoDsl.g:890:1: rule__DefDtoModelTypeVariable__Group__1 : rule__DefDtoModelTypeVariable__Group__1__Impl ;
    public final void rule__DefDtoModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:894:1: ( rule__DefDtoModelTypeVariable__Group__1__Impl )
            // InternalDtoDsl.g:895:2: rule__DefDtoModelTypeVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeVariable__Group__1__Impl();

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
    // $ANTLR end "rule__DefDtoModelTypeVariable__Group__1"


    // $ANTLR start "rule__DefDtoModelTypeVariable__Group__1__Impl"
    // InternalDtoDsl.g:901:1: rule__DefDtoModelTypeVariable__Group__1__Impl : ( ( rule__DefDtoModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefDtoModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:905:1: ( ( ( rule__DefDtoModelTypeVariable__NameAssignment_1 ) ) )
            // InternalDtoDsl.g:906:1: ( ( rule__DefDtoModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalDtoDsl.g:906:1: ( ( rule__DefDtoModelTypeVariable__NameAssignment_1 ) )
            // InternalDtoDsl.g:907:2: ( rule__DefDtoModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefDtoModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalDtoDsl.g:908:2: ( rule__DefDtoModelTypeVariable__NameAssignment_1 )
            // InternalDtoDsl.g:908:3: rule__DefDtoModelTypeVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DefDtoModelTypeVariable__Group__1__Impl"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__0"
    // InternalDtoDsl.g:917:1: rule__DefDtoModelTypeCollectionVariable__Group__0 : rule__DefDtoModelTypeCollectionVariable__Group__0__Impl rule__DefDtoModelTypeCollectionVariable__Group__1 ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:921:1: ( rule__DefDtoModelTypeCollectionVariable__Group__0__Impl rule__DefDtoModelTypeCollectionVariable__Group__1 )
            // InternalDtoDsl.g:922:2: rule__DefDtoModelTypeCollectionVariable__Group__0__Impl rule__DefDtoModelTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DefDtoModelTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__Group__1();

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__0__Impl"
    // InternalDtoDsl.g:929:1: rule__DefDtoModelTypeCollectionVariable__Group__0__Impl : ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 ) ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:933:1: ( ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 ) ) )
            // InternalDtoDsl.g:934:1: ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 ) )
            {
            // InternalDtoDsl.g:934:1: ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 ) )
            // InternalDtoDsl.g:935:2: ( rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 )
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAssignment_0()); 
            // InternalDtoDsl.g:936:2: ( rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 )
            // InternalDtoDsl.g:936:3: rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAssignment_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__1"
    // InternalDtoDsl.g:944:1: rule__DefDtoModelTypeCollectionVariable__Group__1 : rule__DefDtoModelTypeCollectionVariable__Group__1__Impl rule__DefDtoModelTypeCollectionVariable__Group__2 ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:948:1: ( rule__DefDtoModelTypeCollectionVariable__Group__1__Impl rule__DefDtoModelTypeCollectionVariable__Group__2 )
            // InternalDtoDsl.g:949:2: rule__DefDtoModelTypeCollectionVariable__Group__1__Impl rule__DefDtoModelTypeCollectionVariable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoModelTypeCollectionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__Group__2();

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__1__Impl"
    // InternalDtoDsl.g:956:1: rule__DefDtoModelTypeCollectionVariable__Group__1__Impl : ( '<' ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:960:1: ( ( '<' ) )
            // InternalDtoDsl.g:961:1: ( '<' )
            {
            // InternalDtoDsl.g:961:1: ( '<' )
            // InternalDtoDsl.g:962:2: '<'
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getLessThanSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__2"
    // InternalDtoDsl.g:971:1: rule__DefDtoModelTypeCollectionVariable__Group__2 : rule__DefDtoModelTypeCollectionVariable__Group__2__Impl rule__DefDtoModelTypeCollectionVariable__Group__3 ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:975:1: ( rule__DefDtoModelTypeCollectionVariable__Group__2__Impl rule__DefDtoModelTypeCollectionVariable__Group__3 )
            // InternalDtoDsl.g:976:2: rule__DefDtoModelTypeCollectionVariable__Group__2__Impl rule__DefDtoModelTypeCollectionVariable__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DefDtoModelTypeCollectionVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__Group__3();

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__2"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__2__Impl"
    // InternalDtoDsl.g:983:1: rule__DefDtoModelTypeCollectionVariable__Group__2__Impl : ( ( rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 ) ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:987:1: ( ( ( rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 ) ) )
            // InternalDtoDsl.g:988:1: ( ( rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 ) )
            {
            // InternalDtoDsl.g:988:1: ( ( rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 ) )
            // InternalDtoDsl.g:989:2: ( rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeAssignment_2()); 
            // InternalDtoDsl.g:990:2: ( rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 )
            // InternalDtoDsl.g:990:3: rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__2__Impl"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__3"
    // InternalDtoDsl.g:998:1: rule__DefDtoModelTypeCollectionVariable__Group__3 : rule__DefDtoModelTypeCollectionVariable__Group__3__Impl rule__DefDtoModelTypeCollectionVariable__Group__4 ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1002:1: ( rule__DefDtoModelTypeCollectionVariable__Group__3__Impl rule__DefDtoModelTypeCollectionVariable__Group__4 )
            // InternalDtoDsl.g:1003:2: rule__DefDtoModelTypeCollectionVariable__Group__3__Impl rule__DefDtoModelTypeCollectionVariable__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoModelTypeCollectionVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__Group__4();

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__3"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__3__Impl"
    // InternalDtoDsl.g:1010:1: rule__DefDtoModelTypeCollectionVariable__Group__3__Impl : ( '>' ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1014:1: ( ( '>' ) )
            // InternalDtoDsl.g:1015:1: ( '>' )
            {
            // InternalDtoDsl.g:1015:1: ( '>' )
            // InternalDtoDsl.g:1016:2: '>'
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__3__Impl"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__4"
    // InternalDtoDsl.g:1025:1: rule__DefDtoModelTypeCollectionVariable__Group__4 : rule__DefDtoModelTypeCollectionVariable__Group__4__Impl ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1029:1: ( rule__DefDtoModelTypeCollectionVariable__Group__4__Impl )
            // InternalDtoDsl.g:1030:2: rule__DefDtoModelTypeCollectionVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__Group__4__Impl();

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__4"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__Group__4__Impl"
    // InternalDtoDsl.g:1036:1: rule__DefDtoModelTypeCollectionVariable__Group__4__Impl : ( ( rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 ) ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1040:1: ( ( ( rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 ) ) )
            // InternalDtoDsl.g:1041:1: ( ( rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 ) )
            {
            // InternalDtoDsl.g:1041:1: ( ( rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 ) )
            // InternalDtoDsl.g:1042:2: ( rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 )
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameAssignment_4()); 
            // InternalDtoDsl.g:1043:2: ( rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 )
            // InternalDtoDsl.g:1043:3: rule__DefDtoModelTypeCollectionVariable__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__Group__4__Impl"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__0"
    // InternalDtoDsl.g:1052:1: rule__DefDtoSimpleTypeCollectionVariable__Group__0 : rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__1 ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1056:1: ( rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__1 )
            // InternalDtoDsl.g:1057:2: rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__Group__1();

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl"
    // InternalDtoDsl.g:1064:1: rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl : ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 ) ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1068:1: ( ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 ) ) )
            // InternalDtoDsl.g:1069:1: ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 ) )
            {
            // InternalDtoDsl.g:1069:1: ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 ) )
            // InternalDtoDsl.g:1070:2: ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 )
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAssignment_0()); 
            // InternalDtoDsl.g:1071:2: ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 )
            // InternalDtoDsl.g:1071:3: rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAssignment_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__1"
    // InternalDtoDsl.g:1079:1: rule__DefDtoSimpleTypeCollectionVariable__Group__1 : rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__2 ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1083:1: ( rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__2 )
            // InternalDtoDsl.g:1084:2: rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__Group__2();

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl"
    // InternalDtoDsl.g:1091:1: rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl : ( '<' ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1095:1: ( ( '<' ) )
            // InternalDtoDsl.g:1096:1: ( '<' )
            {
            // InternalDtoDsl.g:1096:1: ( '<' )
            // InternalDtoDsl.g:1097:2: '<'
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getLessThanSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__2"
    // InternalDtoDsl.g:1106:1: rule__DefDtoSimpleTypeCollectionVariable__Group__2 : rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__3 ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1110:1: ( rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__3 )
            // InternalDtoDsl.g:1111:2: rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__Group__3();

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__2"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl"
    // InternalDtoDsl.g:1118:1: rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl : ( ( rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 ) ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1122:1: ( ( ( rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 ) ) )
            // InternalDtoDsl.g:1123:1: ( ( rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 ) )
            {
            // InternalDtoDsl.g:1123:1: ( ( rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 ) )
            // InternalDtoDsl.g:1124:2: ( rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeAssignment_2()); 
            // InternalDtoDsl.g:1125:2: ( rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 )
            // InternalDtoDsl.g:1125:3: rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__3"
    // InternalDtoDsl.g:1133:1: rule__DefDtoSimpleTypeCollectionVariable__Group__3 : rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__4 ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1137:1: ( rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__4 )
            // InternalDtoDsl.g:1138:2: rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl rule__DefDtoSimpleTypeCollectionVariable__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__Group__4();

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__3"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl"
    // InternalDtoDsl.g:1145:1: rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl : ( '>' ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1149:1: ( ( '>' ) )
            // InternalDtoDsl.g:1150:1: ( '>' )
            {
            // InternalDtoDsl.g:1150:1: ( '>' )
            // InternalDtoDsl.g:1151:2: '>'
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__4"
    // InternalDtoDsl.g:1160:1: rule__DefDtoSimpleTypeCollectionVariable__Group__4 : rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1164:1: ( rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl )
            // InternalDtoDsl.g:1165:2: rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl();

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__4"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl"
    // InternalDtoDsl.g:1171:1: rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl : ( ( rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 ) ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1175:1: ( ( ( rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 ) ) )
            // InternalDtoDsl.g:1176:1: ( ( rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 ) )
            {
            // InternalDtoDsl.g:1176:1: ( ( rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 ) )
            // InternalDtoDsl.g:1177:2: ( rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 )
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameAssignment_4()); 
            // InternalDtoDsl.g:1178:2: ( rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 )
            // InternalDtoDsl.g:1178:3: rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl"


    // $ANTLR start "rule__Model__DtosAssignment"
    // InternalDtoDsl.g:1187:1: rule__Model__DtosAssignment : ( ruleDto ) ;
    public final void rule__Model__DtosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1191:1: ( ( ruleDto ) )
            // InternalDtoDsl.g:1192:2: ( ruleDto )
            {
            // InternalDtoDsl.g:1192:2: ( ruleDto )
            // InternalDtoDsl.g:1193:3: ruleDto
            {
             before(grammarAccess.getModelAccess().getDtosDtoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDto();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDtosDtoParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DtosAssignment"


    // $ANTLR start "rule__DtoEntity__NameAssignment_1"
    // InternalDtoDsl.g:1202:1: rule__DtoEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DtoEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1206:1: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1207:2: ( RULE_ID )
            {
            // InternalDtoDsl.g:1207:2: ( RULE_ID )
            // InternalDtoDsl.g:1208:3: RULE_ID
            {
             before(grammarAccess.getDtoEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtoEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DtoEntity__NameAssignment_1"


    // $ANTLR start "rule__DtoEntity__AttributesAssignment_3"
    // InternalDtoDsl.g:1217:1: rule__DtoEntity__AttributesAssignment_3 : ( ruleDefDtoAttribute ) ;
    public final void rule__DtoEntity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1221:1: ( ( ruleDefDtoAttribute ) )
            // InternalDtoDsl.g:1222:2: ( ruleDefDtoAttribute )
            {
            // InternalDtoDsl.g:1222:2: ( ruleDefDtoAttribute )
            // InternalDtoDsl.g:1223:3: ruleDefDtoAttribute
            {
             before(grammarAccess.getDtoEntityAccess().getAttributesDefDtoAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefDtoAttribute();

            state._fsp--;

             after(grammarAccess.getDtoEntityAccess().getAttributesDefDtoAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DtoEntity__AttributesAssignment_3"


    // $ANTLR start "rule__DtoFor__NameAssignment_1"
    // InternalDtoDsl.g:1232:1: rule__DtoFor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DtoFor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1236:1: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1237:2: ( RULE_ID )
            {
            // InternalDtoDsl.g:1237:2: ( RULE_ID )
            // InternalDtoDsl.g:1238:3: RULE_ID
            {
             before(grammarAccess.getDtoForAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtoForAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DtoFor__NameAssignment_1"


    // $ANTLR start "rule__DtoFor__EntityAssignment_3"
    // InternalDtoDsl.g:1247:1: rule__DtoFor__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DtoFor__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1251:1: ( ( ( RULE_ID ) ) )
            // InternalDtoDsl.g:1252:2: ( ( RULE_ID ) )
            {
            // InternalDtoDsl.g:1252:2: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1253:3: ( RULE_ID )
            {
             before(grammarAccess.getDtoForAccess().getEntityEntityCrossReference_3_0()); 
            // InternalDtoDsl.g:1254:3: ( RULE_ID )
            // InternalDtoDsl.g:1255:4: RULE_ID
            {
             before(grammarAccess.getDtoForAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtoForAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDtoForAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__DtoFor__EntityAssignment_3"


    // $ANTLR start "rule__DefDtoSimpleVariable__TypeAssignment_0"
    // InternalDtoDsl.g:1266:1: rule__DefDtoSimpleVariable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefDtoSimpleVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1270:1: ( ( ruleType ) )
            // InternalDtoDsl.g:1271:2: ( ruleType )
            {
            // InternalDtoDsl.g:1271:2: ( ruleType )
            // InternalDtoDsl.g:1272:3: ruleType
            {
             before(grammarAccess.getDefDtoSimpleVariableAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefDtoSimpleVariableAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefDtoSimpleVariable__NameAssignment_1"
    // InternalDtoDsl.g:1281:1: rule__DefDtoSimpleVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefDtoSimpleVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1285:1: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1286:2: ( RULE_ID )
            {
            // InternalDtoDsl.g:1286:2: ( RULE_ID )
            // InternalDtoDsl.g:1287:3: RULE_ID
            {
             before(grammarAccess.getDefDtoSimpleVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoSimpleVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleVariable__NameAssignment_1"


    // $ANTLR start "rule__DefDtoModelTypeVariable__TypeAssignment_0"
    // InternalDtoDsl.g:1296:1: rule__DefDtoModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefDtoModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1300:1: ( ( ( RULE_ID ) ) )
            // InternalDtoDsl.g:1301:2: ( ( RULE_ID ) )
            {
            // InternalDtoDsl.g:1301:2: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1302:3: ( RULE_ID )
            {
             before(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0()); 
            // InternalDtoDsl.g:1303:3: ( RULE_ID )
            // InternalDtoDsl.g:1304:4: RULE_ID
            {
             before(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefDtoModelTypeVariable__NameAssignment_1"
    // InternalDtoDsl.g:1315:1: rule__DefDtoModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefDtoModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1319:1: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1320:2: ( RULE_ID )
            {
            // InternalDtoDsl.g:1320:2: ( RULE_ID )
            // InternalDtoDsl.g:1321:3: RULE_ID
            {
             before(grammarAccess.getDefDtoModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeVariable__NameAssignment_1"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0"
    // InternalDtoDsl.g:1330:1: rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0 : ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 ) ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1334:1: ( ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 ) ) )
            // InternalDtoDsl.g:1335:2: ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 ) )
            {
            // InternalDtoDsl.g:1335:2: ( ( rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 ) )
            // InternalDtoDsl.g:1336:3: ( rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); 
            // InternalDtoDsl.g:1337:3: ( rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0 )
            // InternalDtoDsl.g:1337:4: rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2"
    // InternalDtoDsl.g:1345:1: rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1349:1: ( ( ( RULE_ID ) ) )
            // InternalDtoDsl.g:1350:2: ( ( RULE_ID ) )
            {
            // InternalDtoDsl.g:1350:2: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1351:3: ( RULE_ID )
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeCrossReference_2_0()); 
            // InternalDtoDsl.g:1352:3: ( RULE_ID )
            // InternalDtoDsl.g:1353:4: RULE_ID
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2"


    // $ANTLR start "rule__DefDtoModelTypeCollectionVariable__NameAssignment_4"
    // InternalDtoDsl.g:1364:1: rule__DefDtoModelTypeCollectionVariable__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DefDtoModelTypeCollectionVariable__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1368:1: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1369:2: ( RULE_ID )
            {
            // InternalDtoDsl.g:1369:2: ( RULE_ID )
            // InternalDtoDsl.g:1370:3: RULE_ID
            {
             before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__DefDtoModelTypeCollectionVariable__NameAssignment_4"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0"
    // InternalDtoDsl.g:1379:1: rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0 : ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 ) ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1383:1: ( ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 ) ) )
            // InternalDtoDsl.g:1384:2: ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 ) )
            {
            // InternalDtoDsl.g:1384:2: ( ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 ) )
            // InternalDtoDsl.g:1385:3: ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); 
            // InternalDtoDsl.g:1386:3: ( rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0 )
            // InternalDtoDsl.g:1386:4: rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2"
    // InternalDtoDsl.g:1394:1: rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1398:1: ( ( ruleType ) )
            // InternalDtoDsl.g:1399:2: ( ruleType )
            {
            // InternalDtoDsl.g:1399:2: ( ruleType )
            // InternalDtoDsl.g:1400:3: ruleType
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2"


    // $ANTLR start "rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4"
    // InternalDtoDsl.g:1409:1: rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDtoDsl.g:1413:1: ( ( RULE_ID ) )
            // InternalDtoDsl.g:1414:2: ( RULE_ID )
            {
            // InternalDtoDsl.g:1414:2: ( RULE_ID )
            // InternalDtoDsl.g:1415:3: RULE_ID
            {
             before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000100FFF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000FFF2L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007F90L});

}