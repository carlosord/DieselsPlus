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
import uo.diesels.model.services.BusinessDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBusinessDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_LIST", "RULE_SET", "RULE_VOID", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'save'", "'update'", "'delete'", "'find'", "'Service'", "'{'", "'}'", "'('", "')'", "'<'", "'>'", "','", "'#'", "'finder'"
    };
    public static final int RULE_SET=6;
    public static final int RULE_STRING=17;
    public static final int RULE_TYPE_CHAR=12;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_TYPE_STRING=13;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_VOID=7;
    public static final int T__31=31;
    public static final int RULE_TYPE_INT=8;
    public static final int T__32=32;
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=11;
    public static final int RULE_ID=15;
    public static final int RULE_WS=20;
    public static final int RULE_TYPE_FLOAT=10;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_TYPE_BOOLEAN=14;
    public static final int RULE_DATE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
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

    	public void setGrammarAccess(BusinessDslGrammarAccess grammarAccess) {
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
    // InternalBusinessDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:54:1: ( ruleModel EOF )
            // InternalBusinessDsl.g:55:1: ruleModel EOF
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
    // InternalBusinessDsl.g:62:1: ruleModel : ( ( rule__Model__ServicesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:66:2: ( ( ( rule__Model__ServicesAssignment )* ) )
            // InternalBusinessDsl.g:67:2: ( ( rule__Model__ServicesAssignment )* )
            {
            // InternalBusinessDsl.g:67:2: ( ( rule__Model__ServicesAssignment )* )
            // InternalBusinessDsl.g:68:3: ( rule__Model__ServicesAssignment )*
            {
             before(grammarAccess.getModelAccess().getServicesAssignment()); 
            // InternalBusinessDsl.g:69:3: ( rule__Model__ServicesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBusinessDsl.g:69:4: rule__Model__ServicesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ServicesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getServicesAssignment()); 

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


    // $ANTLR start "entryRuleService"
    // InternalBusinessDsl.g:78:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:79:1: ( ruleService EOF )
            // InternalBusinessDsl.g:80:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalBusinessDsl.g:87:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:91:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalBusinessDsl.g:92:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalBusinessDsl.g:92:2: ( ( rule__Service__Group__0 ) )
            // InternalBusinessDsl.g:93:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalBusinessDsl.g:94:3: ( rule__Service__Group__0 )
            // InternalBusinessDsl.g:94:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceMethod"
    // InternalBusinessDsl.g:103:1: entryRuleServiceMethod : ruleServiceMethod EOF ;
    public final void entryRuleServiceMethod() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:104:1: ( ruleServiceMethod EOF )
            // InternalBusinessDsl.g:105:1: ruleServiceMethod EOF
            {
             before(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceMethod();

            state._fsp--;

             after(grammarAccess.getServiceMethodRule()); 
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
    // $ANTLR end "entryRuleServiceMethod"


    // $ANTLR start "ruleServiceMethod"
    // InternalBusinessDsl.g:112:1: ruleServiceMethod : ( ( rule__ServiceMethod__Alternatives ) ) ;
    public final void ruleServiceMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:116:2: ( ( ( rule__ServiceMethod__Alternatives ) ) )
            // InternalBusinessDsl.g:117:2: ( ( rule__ServiceMethod__Alternatives ) )
            {
            // InternalBusinessDsl.g:117:2: ( ( rule__ServiceMethod__Alternatives ) )
            // InternalBusinessDsl.g:118:3: ( rule__ServiceMethod__Alternatives )
            {
             before(grammarAccess.getServiceMethodAccess().getAlternatives()); 
            // InternalBusinessDsl.g:119:3: ( rule__ServiceMethod__Alternatives )
            // InternalBusinessDsl.g:119:4: rule__ServiceMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getAlternatives()); 

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
    // $ANTLR end "ruleServiceMethod"


    // $ANTLR start "entryRuleJpaMethod"
    // InternalBusinessDsl.g:128:1: entryRuleJpaMethod : ruleJpaMethod EOF ;
    public final void entryRuleJpaMethod() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:129:1: ( ruleJpaMethod EOF )
            // InternalBusinessDsl.g:130:1: ruleJpaMethod EOF
            {
             before(grammarAccess.getJpaMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleJpaMethod();

            state._fsp--;

             after(grammarAccess.getJpaMethodRule()); 
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
    // $ANTLR end "entryRuleJpaMethod"


    // $ANTLR start "ruleJpaMethod"
    // InternalBusinessDsl.g:137:1: ruleJpaMethod : ( ( rule__JpaMethod__Group__0 ) ) ;
    public final void ruleJpaMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:141:2: ( ( ( rule__JpaMethod__Group__0 ) ) )
            // InternalBusinessDsl.g:142:2: ( ( rule__JpaMethod__Group__0 ) )
            {
            // InternalBusinessDsl.g:142:2: ( ( rule__JpaMethod__Group__0 ) )
            // InternalBusinessDsl.g:143:3: ( rule__JpaMethod__Group__0 )
            {
             before(grammarAccess.getJpaMethodAccess().getGroup()); 
            // InternalBusinessDsl.g:144:3: ( rule__JpaMethod__Group__0 )
            // InternalBusinessDsl.g:144:4: rule__JpaMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJpaMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleJpaMethod"


    // $ANTLR start "entryRuleFinderUserMethod"
    // InternalBusinessDsl.g:153:1: entryRuleFinderUserMethod : ruleFinderUserMethod EOF ;
    public final void entryRuleFinderUserMethod() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:154:1: ( ruleFinderUserMethod EOF )
            // InternalBusinessDsl.g:155:1: ruleFinderUserMethod EOF
            {
             before(grammarAccess.getFinderUserMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleFinderUserMethod();

            state._fsp--;

             after(grammarAccess.getFinderUserMethodRule()); 
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
    // $ANTLR end "entryRuleFinderUserMethod"


    // $ANTLR start "ruleFinderUserMethod"
    // InternalBusinessDsl.g:162:1: ruleFinderUserMethod : ( ( rule__FinderUserMethod__Group__0 ) ) ;
    public final void ruleFinderUserMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:166:2: ( ( ( rule__FinderUserMethod__Group__0 ) ) )
            // InternalBusinessDsl.g:167:2: ( ( rule__FinderUserMethod__Group__0 ) )
            {
            // InternalBusinessDsl.g:167:2: ( ( rule__FinderUserMethod__Group__0 ) )
            // InternalBusinessDsl.g:168:3: ( rule__FinderUserMethod__Group__0 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getGroup()); 
            // InternalBusinessDsl.g:169:3: ( rule__FinderUserMethod__Group__0 )
            // InternalBusinessDsl.g:169:4: rule__FinderUserMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinderUserMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleFinderUserMethod"


    // $ANTLR start "entryRuleMethodSimpleReturn"
    // InternalBusinessDsl.g:178:1: entryRuleMethodSimpleReturn : ruleMethodSimpleReturn EOF ;
    public final void entryRuleMethodSimpleReturn() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:179:1: ( ruleMethodSimpleReturn EOF )
            // InternalBusinessDsl.g:180:1: ruleMethodSimpleReturn EOF
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
    // InternalBusinessDsl.g:187:1: ruleMethodSimpleReturn : ( ( rule__MethodSimpleReturn__Group__0 ) ) ;
    public final void ruleMethodSimpleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:191:2: ( ( ( rule__MethodSimpleReturn__Group__0 ) ) )
            // InternalBusinessDsl.g:192:2: ( ( rule__MethodSimpleReturn__Group__0 ) )
            {
            // InternalBusinessDsl.g:192:2: ( ( rule__MethodSimpleReturn__Group__0 ) )
            // InternalBusinessDsl.g:193:3: ( rule__MethodSimpleReturn__Group__0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup()); 
            // InternalBusinessDsl.g:194:3: ( rule__MethodSimpleReturn__Group__0 )
            // InternalBusinessDsl.g:194:4: rule__MethodSimpleReturn__Group__0
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


    // $ANTLR start "entryRuleMethodAllModelReturn"
    // InternalBusinessDsl.g:203:1: entryRuleMethodAllModelReturn : ruleMethodAllModelReturn EOF ;
    public final void entryRuleMethodAllModelReturn() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:204:1: ( ruleMethodAllModelReturn EOF )
            // InternalBusinessDsl.g:205:1: ruleMethodAllModelReturn EOF
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
    // InternalBusinessDsl.g:212:1: ruleMethodAllModelReturn : ( ( rule__MethodAllModelReturn__Group__0 ) ) ;
    public final void ruleMethodAllModelReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:216:2: ( ( ( rule__MethodAllModelReturn__Group__0 ) ) )
            // InternalBusinessDsl.g:217:2: ( ( rule__MethodAllModelReturn__Group__0 ) )
            {
            // InternalBusinessDsl.g:217:2: ( ( rule__MethodAllModelReturn__Group__0 ) )
            // InternalBusinessDsl.g:218:3: ( rule__MethodAllModelReturn__Group__0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup()); 
            // InternalBusinessDsl.g:219:3: ( rule__MethodAllModelReturn__Group__0 )
            // InternalBusinessDsl.g:219:4: rule__MethodAllModelReturn__Group__0
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


    // $ANTLR start "entryRuleMethodDtoReturn"
    // InternalBusinessDsl.g:228:1: entryRuleMethodDtoReturn : ruleMethodDtoReturn EOF ;
    public final void entryRuleMethodDtoReturn() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:229:1: ( ruleMethodDtoReturn EOF )
            // InternalBusinessDsl.g:230:1: ruleMethodDtoReturn EOF
            {
             before(grammarAccess.getMethodDtoReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodDtoReturn();

            state._fsp--;

             after(grammarAccess.getMethodDtoReturnRule()); 
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
    // $ANTLR end "entryRuleMethodDtoReturn"


    // $ANTLR start "ruleMethodDtoReturn"
    // InternalBusinessDsl.g:237:1: ruleMethodDtoReturn : ( ( rule__MethodDtoReturn__Group__0 ) ) ;
    public final void ruleMethodDtoReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:241:2: ( ( ( rule__MethodDtoReturn__Group__0 ) ) )
            // InternalBusinessDsl.g:242:2: ( ( rule__MethodDtoReturn__Group__0 ) )
            {
            // InternalBusinessDsl.g:242:2: ( ( rule__MethodDtoReturn__Group__0 ) )
            // InternalBusinessDsl.g:243:3: ( rule__MethodDtoReturn__Group__0 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup()); 
            // InternalBusinessDsl.g:244:3: ( rule__MethodDtoReturn__Group__0 )
            // InternalBusinessDsl.g:244:4: rule__MethodDtoReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDtoReturnAccess().getGroup()); 

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
    // $ANTLR end "ruleMethodDtoReturn"


    // $ANTLR start "entryRuleMethodCollectionReturn"
    // InternalBusinessDsl.g:253:1: entryRuleMethodCollectionReturn : ruleMethodCollectionReturn EOF ;
    public final void entryRuleMethodCollectionReturn() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:254:1: ( ruleMethodCollectionReturn EOF )
            // InternalBusinessDsl.g:255:1: ruleMethodCollectionReturn EOF
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
    // InternalBusinessDsl.g:262:1: ruleMethodCollectionReturn : ( ( rule__MethodCollectionReturn__Group__0 ) ) ;
    public final void ruleMethodCollectionReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:266:2: ( ( ( rule__MethodCollectionReturn__Group__0 ) ) )
            // InternalBusinessDsl.g:267:2: ( ( rule__MethodCollectionReturn__Group__0 ) )
            {
            // InternalBusinessDsl.g:267:2: ( ( rule__MethodCollectionReturn__Group__0 ) )
            // InternalBusinessDsl.g:268:3: ( rule__MethodCollectionReturn__Group__0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup()); 
            // InternalBusinessDsl.g:269:3: ( rule__MethodCollectionReturn__Group__0 )
            // InternalBusinessDsl.g:269:4: rule__MethodCollectionReturn__Group__0
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


    // $ANTLR start "entryRuleDefVariable"
    // InternalBusinessDsl.g:278:1: entryRuleDefVariable : ruleDefVariable EOF ;
    public final void entryRuleDefVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:279:1: ( ruleDefVariable EOF )
            // InternalBusinessDsl.g:280:1: ruleDefVariable EOF
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
    // InternalBusinessDsl.g:287:1: ruleDefVariable : ( ( rule__DefVariable__Alternatives ) ) ;
    public final void ruleDefVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:291:2: ( ( ( rule__DefVariable__Alternatives ) ) )
            // InternalBusinessDsl.g:292:2: ( ( rule__DefVariable__Alternatives ) )
            {
            // InternalBusinessDsl.g:292:2: ( ( rule__DefVariable__Alternatives ) )
            // InternalBusinessDsl.g:293:3: ( rule__DefVariable__Alternatives )
            {
             before(grammarAccess.getDefVariableAccess().getAlternatives()); 
            // InternalBusinessDsl.g:294:3: ( rule__DefVariable__Alternatives )
            // InternalBusinessDsl.g:294:4: rule__DefVariable__Alternatives
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


    // $ANTLR start "entryRuleDefAllModelTypeVariable"
    // InternalBusinessDsl.g:303:1: entryRuleDefAllModelTypeVariable : ruleDefAllModelTypeVariable EOF ;
    public final void entryRuleDefAllModelTypeVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:304:1: ( ruleDefAllModelTypeVariable EOF )
            // InternalBusinessDsl.g:305:1: ruleDefAllModelTypeVariable EOF
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
    // InternalBusinessDsl.g:312:1: ruleDefAllModelTypeVariable : ( ( rule__DefAllModelTypeVariable__Group__0 ) ) ;
    public final void ruleDefAllModelTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:316:2: ( ( ( rule__DefAllModelTypeVariable__Group__0 ) ) )
            // InternalBusinessDsl.g:317:2: ( ( rule__DefAllModelTypeVariable__Group__0 ) )
            {
            // InternalBusinessDsl.g:317:2: ( ( rule__DefAllModelTypeVariable__Group__0 ) )
            // InternalBusinessDsl.g:318:3: ( rule__DefAllModelTypeVariable__Group__0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getGroup()); 
            // InternalBusinessDsl.g:319:3: ( rule__DefAllModelTypeVariable__Group__0 )
            // InternalBusinessDsl.g:319:4: rule__DefAllModelTypeVariable__Group__0
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


    // $ANTLR start "entryRuleDefDtoTypeVariable"
    // InternalBusinessDsl.g:328:1: entryRuleDefDtoTypeVariable : ruleDefDtoTypeVariable EOF ;
    public final void entryRuleDefDtoTypeVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:329:1: ( ruleDefDtoTypeVariable EOF )
            // InternalBusinessDsl.g:330:1: ruleDefDtoTypeVariable EOF
            {
             before(grammarAccess.getDefDtoTypeVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoTypeVariable();

            state._fsp--;

             after(grammarAccess.getDefDtoTypeVariableRule()); 
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
    // $ANTLR end "entryRuleDefDtoTypeVariable"


    // $ANTLR start "ruleDefDtoTypeVariable"
    // InternalBusinessDsl.g:337:1: ruleDefDtoTypeVariable : ( ( rule__DefDtoTypeVariable__Group__0 ) ) ;
    public final void ruleDefDtoTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:341:2: ( ( ( rule__DefDtoTypeVariable__Group__0 ) ) )
            // InternalBusinessDsl.g:342:2: ( ( rule__DefDtoTypeVariable__Group__0 ) )
            {
            // InternalBusinessDsl.g:342:2: ( ( rule__DefDtoTypeVariable__Group__0 ) )
            // InternalBusinessDsl.g:343:3: ( rule__DefDtoTypeVariable__Group__0 )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getGroup()); 
            // InternalBusinessDsl.g:344:3: ( rule__DefDtoTypeVariable__Group__0 )
            // InternalBusinessDsl.g:344:4: rule__DefDtoTypeVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoTypeVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefDtoTypeVariable"


    // $ANTLR start "entryRuleDefSimpleVariable"
    // InternalBusinessDsl.g:353:1: entryRuleDefSimpleVariable : ruleDefSimpleVariable EOF ;
    public final void entryRuleDefSimpleVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:354:1: ( ruleDefSimpleVariable EOF )
            // InternalBusinessDsl.g:355:1: ruleDefSimpleVariable EOF
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
    // InternalBusinessDsl.g:362:1: ruleDefSimpleVariable : ( ( rule__DefSimpleVariable__Group__0 ) ) ;
    public final void ruleDefSimpleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:366:2: ( ( ( rule__DefSimpleVariable__Group__0 ) ) )
            // InternalBusinessDsl.g:367:2: ( ( rule__DefSimpleVariable__Group__0 ) )
            {
            // InternalBusinessDsl.g:367:2: ( ( rule__DefSimpleVariable__Group__0 ) )
            // InternalBusinessDsl.g:368:3: ( rule__DefSimpleVariable__Group__0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getGroup()); 
            // InternalBusinessDsl.g:369:3: ( rule__DefSimpleVariable__Group__0 )
            // InternalBusinessDsl.g:369:4: rule__DefSimpleVariable__Group__0
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


    // $ANTLR start "entryRuleDefCollectionTypeVariable"
    // InternalBusinessDsl.g:378:1: entryRuleDefCollectionTypeVariable : ruleDefCollectionTypeVariable EOF ;
    public final void entryRuleDefCollectionTypeVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:379:1: ( ruleDefCollectionTypeVariable EOF )
            // InternalBusinessDsl.g:380:1: ruleDefCollectionTypeVariable EOF
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
    // InternalBusinessDsl.g:387:1: ruleDefCollectionTypeVariable : ( ( rule__DefCollectionTypeVariable__Alternatives ) ) ;
    public final void ruleDefCollectionTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:391:2: ( ( ( rule__DefCollectionTypeVariable__Alternatives ) ) )
            // InternalBusinessDsl.g:392:2: ( ( rule__DefCollectionTypeVariable__Alternatives ) )
            {
            // InternalBusinessDsl.g:392:2: ( ( rule__DefCollectionTypeVariable__Alternatives ) )
            // InternalBusinessDsl.g:393:3: ( rule__DefCollectionTypeVariable__Alternatives )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getAlternatives()); 
            // InternalBusinessDsl.g:394:3: ( rule__DefCollectionTypeVariable__Alternatives )
            // InternalBusinessDsl.g:394:4: rule__DefCollectionTypeVariable__Alternatives
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


    // $ANTLR start "entryRuleDefAllModelTypeCollectionVariable"
    // InternalBusinessDsl.g:403:1: entryRuleDefAllModelTypeCollectionVariable : ruleDefAllModelTypeCollectionVariable EOF ;
    public final void entryRuleDefAllModelTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:404:1: ( ruleDefAllModelTypeCollectionVariable EOF )
            // InternalBusinessDsl.g:405:1: ruleDefAllModelTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefAllModelTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefAllModelTypeCollectionVariableRule()); 
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
    // $ANTLR end "entryRuleDefAllModelTypeCollectionVariable"


    // $ANTLR start "ruleDefAllModelTypeCollectionVariable"
    // InternalBusinessDsl.g:412:1: ruleDefAllModelTypeCollectionVariable : ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefAllModelTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:416:2: ( ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) ) )
            // InternalBusinessDsl.g:417:2: ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) )
            {
            // InternalBusinessDsl.g:417:2: ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) )
            // InternalBusinessDsl.g:418:3: ( rule__DefAllModelTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getGroup()); 
            // InternalBusinessDsl.g:419:3: ( rule__DefAllModelTypeCollectionVariable__Group__0 )
            // InternalBusinessDsl.g:419:4: rule__DefAllModelTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefAllModelTypeCollectionVariable"


    // $ANTLR start "entryRuleDefSimpleTypeCollectionVariable"
    // InternalBusinessDsl.g:428:1: entryRuleDefSimpleTypeCollectionVariable : ruleDefSimpleTypeCollectionVariable EOF ;
    public final void entryRuleDefSimpleTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:429:1: ( ruleDefSimpleTypeCollectionVariable EOF )
            // InternalBusinessDsl.g:430:1: ruleDefSimpleTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefSimpleTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefSimpleTypeCollectionVariableRule()); 
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
    // $ANTLR end "entryRuleDefSimpleTypeCollectionVariable"


    // $ANTLR start "ruleDefSimpleTypeCollectionVariable"
    // InternalBusinessDsl.g:437:1: ruleDefSimpleTypeCollectionVariable : ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefSimpleTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:441:2: ( ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) ) )
            // InternalBusinessDsl.g:442:2: ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) )
            {
            // InternalBusinessDsl.g:442:2: ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) )
            // InternalBusinessDsl.g:443:3: ( rule__DefSimpleTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getGroup()); 
            // InternalBusinessDsl.g:444:3: ( rule__DefSimpleTypeCollectionVariable__Group__0 )
            // InternalBusinessDsl.g:444:4: rule__DefSimpleTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefSimpleTypeCollectionVariable"


    // $ANTLR start "entryRuleDefDtoTypeCollectionVariable"
    // InternalBusinessDsl.g:453:1: entryRuleDefDtoTypeCollectionVariable : ruleDefDtoTypeCollectionVariable EOF ;
    public final void entryRuleDefDtoTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:454:1: ( ruleDefDtoTypeCollectionVariable EOF )
            // InternalBusinessDsl.g:455:1: ruleDefDtoTypeCollectionVariable EOF
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDefDtoTypeCollectionVariable();

            state._fsp--;

             after(grammarAccess.getDefDtoTypeCollectionVariableRule()); 
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
    // $ANTLR end "entryRuleDefDtoTypeCollectionVariable"


    // $ANTLR start "ruleDefDtoTypeCollectionVariable"
    // InternalBusinessDsl.g:462:1: ruleDefDtoTypeCollectionVariable : ( ( rule__DefDtoTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefDtoTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:466:2: ( ( ( rule__DefDtoTypeCollectionVariable__Group__0 ) ) )
            // InternalBusinessDsl.g:467:2: ( ( rule__DefDtoTypeCollectionVariable__Group__0 ) )
            {
            // InternalBusinessDsl.g:467:2: ( ( rule__DefDtoTypeCollectionVariable__Group__0 ) )
            // InternalBusinessDsl.g:468:3: ( rule__DefDtoTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getGroup()); 
            // InternalBusinessDsl.g:469:3: ( rule__DefDtoTypeCollectionVariable__Group__0 )
            // InternalBusinessDsl.g:469:4: rule__DefDtoTypeCollectionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeCollectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoTypeCollectionVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleDefDtoTypeCollectionVariable"


    // $ANTLR start "entryRuleCollectionReturnType"
    // InternalBusinessDsl.g:478:1: entryRuleCollectionReturnType : ruleCollectionReturnType EOF ;
    public final void entryRuleCollectionReturnType() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:479:1: ( ruleCollectionReturnType EOF )
            // InternalBusinessDsl.g:480:1: ruleCollectionReturnType EOF
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
    // InternalBusinessDsl.g:487:1: ruleCollectionReturnType : ( ( rule__CollectionReturnType__Alternatives ) ) ;
    public final void ruleCollectionReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:491:2: ( ( ( rule__CollectionReturnType__Alternatives ) ) )
            // InternalBusinessDsl.g:492:2: ( ( rule__CollectionReturnType__Alternatives ) )
            {
            // InternalBusinessDsl.g:492:2: ( ( rule__CollectionReturnType__Alternatives ) )
            // InternalBusinessDsl.g:493:3: ( rule__CollectionReturnType__Alternatives )
            {
             before(grammarAccess.getCollectionReturnTypeAccess().getAlternatives()); 
            // InternalBusinessDsl.g:494:3: ( rule__CollectionReturnType__Alternatives )
            // InternalBusinessDsl.g:494:4: rule__CollectionReturnType__Alternatives
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


    // $ANTLR start "entryRuleAllModelTypeCollection"
    // InternalBusinessDsl.g:503:1: entryRuleAllModelTypeCollection : ruleAllModelTypeCollection EOF ;
    public final void entryRuleAllModelTypeCollection() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:504:1: ( ruleAllModelTypeCollection EOF )
            // InternalBusinessDsl.g:505:1: ruleAllModelTypeCollection EOF
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
    // InternalBusinessDsl.g:512:1: ruleAllModelTypeCollection : ( ( rule__AllModelTypeCollection__Group__0 ) ) ;
    public final void ruleAllModelTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:516:2: ( ( ( rule__AllModelTypeCollection__Group__0 ) ) )
            // InternalBusinessDsl.g:517:2: ( ( rule__AllModelTypeCollection__Group__0 ) )
            {
            // InternalBusinessDsl.g:517:2: ( ( rule__AllModelTypeCollection__Group__0 ) )
            // InternalBusinessDsl.g:518:3: ( rule__AllModelTypeCollection__Group__0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGroup()); 
            // InternalBusinessDsl.g:519:3: ( rule__AllModelTypeCollection__Group__0 )
            // InternalBusinessDsl.g:519:4: rule__AllModelTypeCollection__Group__0
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


    // $ANTLR start "entryRuleDtoTypeCollection"
    // InternalBusinessDsl.g:528:1: entryRuleDtoTypeCollection : ruleDtoTypeCollection EOF ;
    public final void entryRuleDtoTypeCollection() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:529:1: ( ruleDtoTypeCollection EOF )
            // InternalBusinessDsl.g:530:1: ruleDtoTypeCollection EOF
            {
             before(grammarAccess.getDtoTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDtoTypeCollection();

            state._fsp--;

             after(grammarAccess.getDtoTypeCollectionRule()); 
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
    // $ANTLR end "entryRuleDtoTypeCollection"


    // $ANTLR start "ruleDtoTypeCollection"
    // InternalBusinessDsl.g:537:1: ruleDtoTypeCollection : ( ( rule__DtoTypeCollection__Group__0 ) ) ;
    public final void ruleDtoTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:541:2: ( ( ( rule__DtoTypeCollection__Group__0 ) ) )
            // InternalBusinessDsl.g:542:2: ( ( rule__DtoTypeCollection__Group__0 ) )
            {
            // InternalBusinessDsl.g:542:2: ( ( rule__DtoTypeCollection__Group__0 ) )
            // InternalBusinessDsl.g:543:3: ( rule__DtoTypeCollection__Group__0 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getGroup()); 
            // InternalBusinessDsl.g:544:3: ( rule__DtoTypeCollection__Group__0 )
            // InternalBusinessDsl.g:544:4: rule__DtoTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDtoTypeCollectionAccess().getGroup()); 

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
    // $ANTLR end "ruleDtoTypeCollection"


    // $ANTLR start "entryRuleSimpleTypeCollection"
    // InternalBusinessDsl.g:553:1: entryRuleSimpleTypeCollection : ruleSimpleTypeCollection EOF ;
    public final void entryRuleSimpleTypeCollection() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:554:1: ( ruleSimpleTypeCollection EOF )
            // InternalBusinessDsl.g:555:1: ruleSimpleTypeCollection EOF
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
    // InternalBusinessDsl.g:562:1: ruleSimpleTypeCollection : ( ( rule__SimpleTypeCollection__Group__0 ) ) ;
    public final void ruleSimpleTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:566:2: ( ( ( rule__SimpleTypeCollection__Group__0 ) ) )
            // InternalBusinessDsl.g:567:2: ( ( rule__SimpleTypeCollection__Group__0 ) )
            {
            // InternalBusinessDsl.g:567:2: ( ( rule__SimpleTypeCollection__Group__0 ) )
            // InternalBusinessDsl.g:568:3: ( rule__SimpleTypeCollection__Group__0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGroup()); 
            // InternalBusinessDsl.g:569:3: ( rule__SimpleTypeCollection__Group__0 )
            // InternalBusinessDsl.g:569:4: rule__SimpleTypeCollection__Group__0
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


    // $ANTLR start "entryRuleSimpleReturnType"
    // InternalBusinessDsl.g:578:1: entryRuleSimpleReturnType : ruleSimpleReturnType EOF ;
    public final void entryRuleSimpleReturnType() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:579:1: ( ruleSimpleReturnType EOF )
            // InternalBusinessDsl.g:580:1: ruleSimpleReturnType EOF
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
    // InternalBusinessDsl.g:587:1: ruleSimpleReturnType : ( ( rule__SimpleReturnType__Alternatives ) ) ;
    public final void ruleSimpleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:591:2: ( ( ( rule__SimpleReturnType__Alternatives ) ) )
            // InternalBusinessDsl.g:592:2: ( ( rule__SimpleReturnType__Alternatives ) )
            {
            // InternalBusinessDsl.g:592:2: ( ( rule__SimpleReturnType__Alternatives ) )
            // InternalBusinessDsl.g:593:3: ( rule__SimpleReturnType__Alternatives )
            {
             before(grammarAccess.getSimpleReturnTypeAccess().getAlternatives()); 
            // InternalBusinessDsl.g:594:3: ( rule__SimpleReturnType__Alternatives )
            // InternalBusinessDsl.g:594:4: rule__SimpleReturnType__Alternatives
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
    // InternalBusinessDsl.g:603:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:604:1: ( ruleType EOF )
            // InternalBusinessDsl.g:605:1: ruleType EOF
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
    // InternalBusinessDsl.g:612:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:616:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalBusinessDsl.g:617:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalBusinessDsl.g:617:2: ( ( rule__Type__Alternatives ) )
            // InternalBusinessDsl.g:618:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalBusinessDsl.g:619:3: ( rule__Type__Alternatives )
            // InternalBusinessDsl.g:619:4: rule__Type__Alternatives
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
    // InternalBusinessDsl.g:628:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:629:1: ( ruleBasicType EOF )
            // InternalBusinessDsl.g:630:1: ruleBasicType EOF
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
    // InternalBusinessDsl.g:637:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:641:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalBusinessDsl.g:642:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalBusinessDsl.g:642:2: ( ( rule__BasicType__Alternatives ) )
            // InternalBusinessDsl.g:643:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalBusinessDsl.g:644:3: ( rule__BasicType__Alternatives )
            // InternalBusinessDsl.g:644:4: rule__BasicType__Alternatives
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
    // InternalBusinessDsl.g:653:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalBusinessDsl.g:654:1: ( ruleComplexType EOF )
            // InternalBusinessDsl.g:655:1: ruleComplexType EOF
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
    // InternalBusinessDsl.g:662:1: ruleComplexType : ( RULE_DATE ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:666:2: ( ( RULE_DATE ) )
            // InternalBusinessDsl.g:667:2: ( RULE_DATE )
            {
            // InternalBusinessDsl.g:667:2: ( RULE_DATE )
            // InternalBusinessDsl.g:668:3: RULE_DATE
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


    // $ANTLR start "rule__ServiceMethod__Alternatives"
    // InternalBusinessDsl.g:677:1: rule__ServiceMethod__Alternatives : ( ( ruleJpaMethod ) | ( ruleFinderUserMethod ) );
    public final void rule__ServiceMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:681:1: ( ( ruleJpaMethod ) | ( ruleFinderUserMethod ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==29) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_DATE && LA2_0<=RULE_TYPE_BOOLEAN)||LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBusinessDsl.g:682:2: ( ruleJpaMethod )
                    {
                    // InternalBusinessDsl.g:682:2: ( ruleJpaMethod )
                    // InternalBusinessDsl.g:683:3: ruleJpaMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getJpaMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJpaMethod();

                    state._fsp--;

                     after(grammarAccess.getServiceMethodAccess().getJpaMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:688:2: ( ruleFinderUserMethod )
                    {
                    // InternalBusinessDsl.g:688:2: ( ruleFinderUserMethod )
                    // InternalBusinessDsl.g:689:3: ruleFinderUserMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getFinderUserMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFinderUserMethod();

                    state._fsp--;

                     after(grammarAccess.getServiceMethodAccess().getFinderUserMethodParserRuleCall_1()); 

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
    // $ANTLR end "rule__ServiceMethod__Alternatives"


    // $ANTLR start "rule__JpaMethod__KeywordAlternatives_3_0"
    // InternalBusinessDsl.g:698:1: rule__JpaMethod__KeywordAlternatives_3_0 : ( ( 'save' ) | ( 'update' ) | ( 'delete' ) | ( 'find' ) );
    public final void rule__JpaMethod__KeywordAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:702:1: ( ( 'save' ) | ( 'update' ) | ( 'delete' ) | ( 'find' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
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
                    // InternalBusinessDsl.g:703:2: ( 'save' )
                    {
                    // InternalBusinessDsl.g:703:2: ( 'save' )
                    // InternalBusinessDsl.g:704:3: 'save'
                    {
                     before(grammarAccess.getJpaMethodAccess().getKeywordSaveKeyword_3_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getJpaMethodAccess().getKeywordSaveKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:709:2: ( 'update' )
                    {
                    // InternalBusinessDsl.g:709:2: ( 'update' )
                    // InternalBusinessDsl.g:710:3: 'update'
                    {
                     before(grammarAccess.getJpaMethodAccess().getKeywordUpdateKeyword_3_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getJpaMethodAccess().getKeywordUpdateKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:715:2: ( 'delete' )
                    {
                    // InternalBusinessDsl.g:715:2: ( 'delete' )
                    // InternalBusinessDsl.g:716:3: 'delete'
                    {
                     before(grammarAccess.getJpaMethodAccess().getKeywordDeleteKeyword_3_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getJpaMethodAccess().getKeywordDeleteKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:721:2: ( 'find' )
                    {
                    // InternalBusinessDsl.g:721:2: ( 'find' )
                    // InternalBusinessDsl.g:722:3: 'find'
                    {
                     before(grammarAccess.getJpaMethodAccess().getKeywordFindKeyword_3_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getJpaMethodAccess().getKeywordFindKeyword_3_0_3()); 

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
    // $ANTLR end "rule__JpaMethod__KeywordAlternatives_3_0"


    // $ANTLR start "rule__FinderUserMethod__Alternatives_0"
    // InternalBusinessDsl.g:731:1: rule__FinderUserMethod__Alternatives_0 : ( ( ruleMethodSimpleReturn ) | ( ruleMethodAllModelReturn ) | ( ruleMethodDtoReturn ) | ( ruleMethodCollectionReturn ) );
    public final void rule__FinderUserMethod__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:735:1: ( ( ruleMethodSimpleReturn ) | ( ruleMethodAllModelReturn ) | ( ruleMethodDtoReturn ) | ( ruleMethodCollectionReturn ) )
            int alt4=4;
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
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
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
                    // InternalBusinessDsl.g:736:2: ( ruleMethodSimpleReturn )
                    {
                    // InternalBusinessDsl.g:736:2: ( ruleMethodSimpleReturn )
                    // InternalBusinessDsl.g:737:3: ruleMethodSimpleReturn
                    {
                     before(grammarAccess.getFinderUserMethodAccess().getMethodSimpleReturnParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodSimpleReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderUserMethodAccess().getMethodSimpleReturnParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:742:2: ( ruleMethodAllModelReturn )
                    {
                    // InternalBusinessDsl.g:742:2: ( ruleMethodAllModelReturn )
                    // InternalBusinessDsl.g:743:3: ruleMethodAllModelReturn
                    {
                     before(grammarAccess.getFinderUserMethodAccess().getMethodAllModelReturnParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodAllModelReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderUserMethodAccess().getMethodAllModelReturnParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:748:2: ( ruleMethodDtoReturn )
                    {
                    // InternalBusinessDsl.g:748:2: ( ruleMethodDtoReturn )
                    // InternalBusinessDsl.g:749:3: ruleMethodDtoReturn
                    {
                     before(grammarAccess.getFinderUserMethodAccess().getMethodDtoReturnParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodDtoReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderUserMethodAccess().getMethodDtoReturnParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:754:2: ( ruleMethodCollectionReturn )
                    {
                    // InternalBusinessDsl.g:754:2: ( ruleMethodCollectionReturn )
                    // InternalBusinessDsl.g:755:3: ruleMethodCollectionReturn
                    {
                     before(grammarAccess.getFinderUserMethodAccess().getMethodCollectionReturnParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodCollectionReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderUserMethodAccess().getMethodCollectionReturnParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__FinderUserMethod__Alternatives_0"


    // $ANTLR start "rule__DefVariable__Alternatives"
    // InternalBusinessDsl.g:764:1: rule__DefVariable__Alternatives : ( ( ruleDefSimpleVariable ) | ( ruleDefAllModelTypeVariable ) | ( ruleDefDtoTypeVariable ) | ( ruleDefCollectionTypeVariable ) );
    public final void rule__DefVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:768:1: ( ( ruleDefSimpleVariable ) | ( ruleDefAllModelTypeVariable ) | ( ruleDefDtoTypeVariable ) | ( ruleDefCollectionTypeVariable ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case RULE_TYPE_INT:
            case RULE_TYPE_DOUBLE:
            case RULE_TYPE_FLOAT:
            case RULE_TYPE_LONG:
            case RULE_TYPE_CHAR:
            case RULE_TYPE_STRING:
            case RULE_TYPE_BOOLEAN:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 34:
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
                    // InternalBusinessDsl.g:769:2: ( ruleDefSimpleVariable )
                    {
                    // InternalBusinessDsl.g:769:2: ( ruleDefSimpleVariable )
                    // InternalBusinessDsl.g:770:3: ruleDefSimpleVariable
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
                    // InternalBusinessDsl.g:775:2: ( ruleDefAllModelTypeVariable )
                    {
                    // InternalBusinessDsl.g:775:2: ( ruleDefAllModelTypeVariable )
                    // InternalBusinessDsl.g:776:3: ruleDefAllModelTypeVariable
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
                    // InternalBusinessDsl.g:781:2: ( ruleDefDtoTypeVariable )
                    {
                    // InternalBusinessDsl.g:781:2: ( ruleDefDtoTypeVariable )
                    // InternalBusinessDsl.g:782:3: ruleDefDtoTypeVariable
                    {
                     before(grammarAccess.getDefVariableAccess().getDefDtoTypeVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefVariableAccess().getDefDtoTypeVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:787:2: ( ruleDefCollectionTypeVariable )
                    {
                    // InternalBusinessDsl.g:787:2: ( ruleDefCollectionTypeVariable )
                    // InternalBusinessDsl.g:788:3: ruleDefCollectionTypeVariable
                    {
                     before(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefCollectionTypeVariable();

                    state._fsp--;

                     after(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_3()); 

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


    // $ANTLR start "rule__DefCollectionTypeVariable__Alternatives"
    // InternalBusinessDsl.g:797:1: rule__DefCollectionTypeVariable__Alternatives : ( ( ruleDefAllModelTypeCollectionVariable ) | ( ruleDefDtoTypeCollectionVariable ) | ( ruleDefSimpleTypeCollectionVariable ) );
    public final void rule__DefCollectionTypeVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:801:1: ( ( ruleDefAllModelTypeCollectionVariable ) | ( ruleDefDtoTypeCollectionVariable ) | ( ruleDefSimpleTypeCollectionVariable ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LIST) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==31) ) {
                    switch ( input.LA(3) ) {
                    case 34:
                        {
                        alt6=2;
                        }
                        break;
                    case RULE_DATE:
                    case RULE_TYPE_INT:
                    case RULE_TYPE_DOUBLE:
                    case RULE_TYPE_FLOAT:
                    case RULE_TYPE_LONG:
                    case RULE_TYPE_CHAR:
                    case RULE_TYPE_STRING:
                    case RULE_TYPE_BOOLEAN:
                        {
                        alt6=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_SET) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==31) ) {
                    switch ( input.LA(3) ) {
                    case 34:
                        {
                        alt6=2;
                        }
                        break;
                    case RULE_DATE:
                    case RULE_TYPE_INT:
                    case RULE_TYPE_DOUBLE:
                    case RULE_TYPE_FLOAT:
                    case RULE_TYPE_LONG:
                    case RULE_TYPE_CHAR:
                    case RULE_TYPE_STRING:
                    case RULE_TYPE_BOOLEAN:
                        {
                        alt6=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBusinessDsl.g:802:2: ( ruleDefAllModelTypeCollectionVariable )
                    {
                    // InternalBusinessDsl.g:802:2: ( ruleDefAllModelTypeCollectionVariable )
                    // InternalBusinessDsl.g:803:3: ruleDefAllModelTypeCollectionVariable
                    {
                     before(grammarAccess.getDefCollectionTypeVariableAccess().getDefAllModelTypeCollectionVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefAllModelTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefCollectionTypeVariableAccess().getDefAllModelTypeCollectionVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:808:2: ( ruleDefDtoTypeCollectionVariable )
                    {
                    // InternalBusinessDsl.g:808:2: ( ruleDefDtoTypeCollectionVariable )
                    // InternalBusinessDsl.g:809:3: ruleDefDtoTypeCollectionVariable
                    {
                     before(grammarAccess.getDefCollectionTypeVariableAccess().getDefDtoTypeCollectionVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefDtoTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefCollectionTypeVariableAccess().getDefDtoTypeCollectionVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:814:2: ( ruleDefSimpleTypeCollectionVariable )
                    {
                    // InternalBusinessDsl.g:814:2: ( ruleDefSimpleTypeCollectionVariable )
                    // InternalBusinessDsl.g:815:3: ruleDefSimpleTypeCollectionVariable
                    {
                     before(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefSimpleTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_2()); 

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


    // $ANTLR start "rule__CollectionReturnType__Alternatives"
    // InternalBusinessDsl.g:824:1: rule__CollectionReturnType__Alternatives : ( ( ruleAllModelTypeCollection ) | ( ruleDtoTypeCollection ) | ( ruleSimpleTypeCollection ) );
    public final void rule__CollectionReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:828:1: ( ( ruleAllModelTypeCollection ) | ( ruleDtoTypeCollection ) | ( ruleSimpleTypeCollection ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LIST) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==31) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        alt7=1;
                        }
                        break;
                    case RULE_DATE:
                    case RULE_TYPE_INT:
                    case RULE_TYPE_DOUBLE:
                    case RULE_TYPE_FLOAT:
                    case RULE_TYPE_LONG:
                    case RULE_TYPE_CHAR:
                    case RULE_TYPE_STRING:
                    case RULE_TYPE_BOOLEAN:
                        {
                        alt7=3;
                        }
                        break;
                    case 34:
                        {
                        alt7=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_SET) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==31) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        alt7=1;
                        }
                        break;
                    case RULE_DATE:
                    case RULE_TYPE_INT:
                    case RULE_TYPE_DOUBLE:
                    case RULE_TYPE_FLOAT:
                    case RULE_TYPE_LONG:
                    case RULE_TYPE_CHAR:
                    case RULE_TYPE_STRING:
                    case RULE_TYPE_BOOLEAN:
                        {
                        alt7=3;
                        }
                        break;
                    case 34:
                        {
                        alt7=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBusinessDsl.g:829:2: ( ruleAllModelTypeCollection )
                    {
                    // InternalBusinessDsl.g:829:2: ( ruleAllModelTypeCollection )
                    // InternalBusinessDsl.g:830:3: ruleAllModelTypeCollection
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
                    // InternalBusinessDsl.g:835:2: ( ruleDtoTypeCollection )
                    {
                    // InternalBusinessDsl.g:835:2: ( ruleDtoTypeCollection )
                    // InternalBusinessDsl.g:836:3: ruleDtoTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getDtoTypeCollectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDtoTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getDtoTypeCollectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:841:2: ( ruleSimpleTypeCollection )
                    {
                    // InternalBusinessDsl.g:841:2: ( ruleSimpleTypeCollection )
                    // InternalBusinessDsl.g:842:3: ruleSimpleTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getSimpleTypeCollectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getSimpleTypeCollectionParserRuleCall_2()); 

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


    // $ANTLR start "rule__AllModelTypeCollection__CollectionAlternatives_0_0"
    // InternalBusinessDsl.g:851:1: rule__AllModelTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__AllModelTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:855:1: ( ( RULE_LIST ) | ( RULE_SET ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LIST) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SET) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBusinessDsl.g:856:2: ( RULE_LIST )
                    {
                    // InternalBusinessDsl.g:856:2: ( RULE_LIST )
                    // InternalBusinessDsl.g:857:3: RULE_LIST
                    {
                     before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:862:2: ( RULE_SET )
                    {
                    // InternalBusinessDsl.g:862:2: ( RULE_SET )
                    // InternalBusinessDsl.g:863:3: RULE_SET
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


    // $ANTLR start "rule__DtoTypeCollection__CollectionAlternatives_0_0"
    // InternalBusinessDsl.g:872:1: rule__DtoTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__DtoTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:876:1: ( ( RULE_LIST ) | ( RULE_SET ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LIST) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SET) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBusinessDsl.g:877:2: ( RULE_LIST )
                    {
                    // InternalBusinessDsl.g:877:2: ( RULE_LIST )
                    // InternalBusinessDsl.g:878:3: RULE_LIST
                    {
                     before(grammarAccess.getDtoTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getDtoTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:883:2: ( RULE_SET )
                    {
                    // InternalBusinessDsl.g:883:2: ( RULE_SET )
                    // InternalBusinessDsl.g:884:3: RULE_SET
                    {
                     before(grammarAccess.getDtoTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SET,FOLLOW_2); 
                     after(grammarAccess.getDtoTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__DtoTypeCollection__CollectionAlternatives_0_0"


    // $ANTLR start "rule__SimpleTypeCollection__CollectionAlternatives_0_0"
    // InternalBusinessDsl.g:893:1: rule__SimpleTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__SimpleTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:897:1: ( ( RULE_LIST ) | ( RULE_SET ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LIST) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SET) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBusinessDsl.g:898:2: ( RULE_LIST )
                    {
                    // InternalBusinessDsl.g:898:2: ( RULE_LIST )
                    // InternalBusinessDsl.g:899:3: RULE_LIST
                    {
                     before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:904:2: ( RULE_SET )
                    {
                    // InternalBusinessDsl.g:904:2: ( RULE_SET )
                    // InternalBusinessDsl.g:905:3: RULE_SET
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


    // $ANTLR start "rule__SimpleReturnType__Alternatives"
    // InternalBusinessDsl.g:914:1: rule__SimpleReturnType__Alternatives : ( ( ruleType ) | ( RULE_VOID ) );
    public final void rule__SimpleReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:918:1: ( ( ruleType ) | ( RULE_VOID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DATE||(LA11_0>=RULE_TYPE_INT && LA11_0<=RULE_TYPE_BOOLEAN)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_VOID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBusinessDsl.g:919:2: ( ruleType )
                    {
                    // InternalBusinessDsl.g:919:2: ( ruleType )
                    // InternalBusinessDsl.g:920:3: ruleType
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
                    // InternalBusinessDsl.g:925:2: ( RULE_VOID )
                    {
                    // InternalBusinessDsl.g:925:2: ( RULE_VOID )
                    // InternalBusinessDsl.g:926:3: RULE_VOID
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
    // InternalBusinessDsl.g:935:1: rule__Type__Alternatives : ( ( ruleBasicType ) | ( ruleComplexType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:939:1: ( ( ruleBasicType ) | ( ruleComplexType ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_TYPE_INT && LA12_0<=RULE_TYPE_BOOLEAN)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DATE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBusinessDsl.g:940:2: ( ruleBasicType )
                    {
                    // InternalBusinessDsl.g:940:2: ( ruleBasicType )
                    // InternalBusinessDsl.g:941:3: ruleBasicType
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
                    // InternalBusinessDsl.g:946:2: ( ruleComplexType )
                    {
                    // InternalBusinessDsl.g:946:2: ( ruleComplexType )
                    // InternalBusinessDsl.g:947:3: ruleComplexType
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
    // InternalBusinessDsl.g:956:1: rule__BasicType__Alternatives : ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:960:1: ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case RULE_TYPE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_TYPE_DOUBLE:
                {
                alt13=2;
                }
                break;
            case RULE_TYPE_FLOAT:
                {
                alt13=3;
                }
                break;
            case RULE_TYPE_LONG:
                {
                alt13=4;
                }
                break;
            case RULE_TYPE_CHAR:
                {
                alt13=5;
                }
                break;
            case RULE_TYPE_STRING:
                {
                alt13=6;
                }
                break;
            case RULE_TYPE_BOOLEAN:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBusinessDsl.g:961:2: ( RULE_TYPE_INT )
                    {
                    // InternalBusinessDsl.g:961:2: ( RULE_TYPE_INT )
                    // InternalBusinessDsl.g:962:3: RULE_TYPE_INT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 
                    match(input,RULE_TYPE_INT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBusinessDsl.g:967:2: ( RULE_TYPE_DOUBLE )
                    {
                    // InternalBusinessDsl.g:967:2: ( RULE_TYPE_DOUBLE )
                    // InternalBusinessDsl.g:968:3: RULE_TYPE_DOUBLE
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBusinessDsl.g:973:2: ( RULE_TYPE_FLOAT )
                    {
                    // InternalBusinessDsl.g:973:2: ( RULE_TYPE_FLOAT )
                    // InternalBusinessDsl.g:974:3: RULE_TYPE_FLOAT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 
                    match(input,RULE_TYPE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBusinessDsl.g:979:2: ( RULE_TYPE_LONG )
                    {
                    // InternalBusinessDsl.g:979:2: ( RULE_TYPE_LONG )
                    // InternalBusinessDsl.g:980:3: RULE_TYPE_LONG
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 
                    match(input,RULE_TYPE_LONG,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBusinessDsl.g:985:2: ( RULE_TYPE_CHAR )
                    {
                    // InternalBusinessDsl.g:985:2: ( RULE_TYPE_CHAR )
                    // InternalBusinessDsl.g:986:3: RULE_TYPE_CHAR
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 
                    match(input,RULE_TYPE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBusinessDsl.g:991:2: ( RULE_TYPE_STRING )
                    {
                    // InternalBusinessDsl.g:991:2: ( RULE_TYPE_STRING )
                    // InternalBusinessDsl.g:992:3: RULE_TYPE_STRING
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 
                    match(input,RULE_TYPE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBusinessDsl.g:997:2: ( RULE_TYPE_BOOLEAN )
                    {
                    // InternalBusinessDsl.g:997:2: ( RULE_TYPE_BOOLEAN )
                    // InternalBusinessDsl.g:998:3: RULE_TYPE_BOOLEAN
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); 
                    match(input,RULE_TYPE_BOOLEAN,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); 

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


    // $ANTLR start "rule__Service__Group__0"
    // InternalBusinessDsl.g:1007:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1011:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalBusinessDsl.g:1012:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalBusinessDsl.g:1019:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1023:1: ( ( 'Service' ) )
            // InternalBusinessDsl.g:1024:1: ( 'Service' )
            {
            // InternalBusinessDsl.g:1024:1: ( 'Service' )
            // InternalBusinessDsl.g:1025:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalBusinessDsl.g:1034:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1038:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalBusinessDsl.g:1039:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalBusinessDsl.g:1046:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1050:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:1051:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:1051:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalBusinessDsl.g:1052:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:1053:2: ( rule__Service__NameAssignment_1 )
            // InternalBusinessDsl.g:1053:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalBusinessDsl.g:1061:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1065:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalBusinessDsl.g:1066:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalBusinessDsl.g:1073:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1077:1: ( ( '{' ) )
            // InternalBusinessDsl.g:1078:1: ( '{' )
            {
            // InternalBusinessDsl.g:1078:1: ( '{' )
            // InternalBusinessDsl.g:1079:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalBusinessDsl.g:1088:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1092:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalBusinessDsl.g:1093:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalBusinessDsl.g:1100:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1104:1: ( ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) ) )
            // InternalBusinessDsl.g:1105:1: ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) )
            {
            // InternalBusinessDsl.g:1105:1: ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) )
            // InternalBusinessDsl.g:1106:2: ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* )
            {
            // InternalBusinessDsl.g:1106:2: ( ( rule__Service__MethodsAssignment_3 ) )
            // InternalBusinessDsl.g:1107:3: ( rule__Service__MethodsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 
            // InternalBusinessDsl.g:1108:3: ( rule__Service__MethodsAssignment_3 )
            // InternalBusinessDsl.g:1108:4: rule__Service__MethodsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Service__MethodsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 

            }

            // InternalBusinessDsl.g:1111:2: ( ( rule__Service__MethodsAssignment_3 )* )
            // InternalBusinessDsl.g:1112:3: ( rule__Service__MethodsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 
            // InternalBusinessDsl.g:1113:3: ( rule__Service__MethodsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_DATE && LA14_0<=RULE_ID)||LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBusinessDsl.g:1113:4: rule__Service__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalBusinessDsl.g:1122:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1126:1: ( rule__Service__Group__4__Impl )
            // InternalBusinessDsl.g:1127:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__4__Impl();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalBusinessDsl.g:1133:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1137:1: ( ( '}' ) )
            // InternalBusinessDsl.g:1138:1: ( '}' )
            {
            // InternalBusinessDsl.g:1138:1: ( '}' )
            // InternalBusinessDsl.g:1139:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__JpaMethod__Group__0"
    // InternalBusinessDsl.g:1149:1: rule__JpaMethod__Group__0 : rule__JpaMethod__Group__0__Impl rule__JpaMethod__Group__1 ;
    public final void rule__JpaMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1153:1: ( rule__JpaMethod__Group__0__Impl rule__JpaMethod__Group__1 )
            // InternalBusinessDsl.g:1154:2: rule__JpaMethod__Group__0__Impl rule__JpaMethod__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__JpaMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__1();

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
    // $ANTLR end "rule__JpaMethod__Group__0"


    // $ANTLR start "rule__JpaMethod__Group__0__Impl"
    // InternalBusinessDsl.g:1161:1: rule__JpaMethod__Group__0__Impl : ( ( rule__JpaMethod__NameAssignment_0 ) ) ;
    public final void rule__JpaMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1165:1: ( ( ( rule__JpaMethod__NameAssignment_0 ) ) )
            // InternalBusinessDsl.g:1166:1: ( ( rule__JpaMethod__NameAssignment_0 ) )
            {
            // InternalBusinessDsl.g:1166:1: ( ( rule__JpaMethod__NameAssignment_0 ) )
            // InternalBusinessDsl.g:1167:2: ( rule__JpaMethod__NameAssignment_0 )
            {
             before(grammarAccess.getJpaMethodAccess().getNameAssignment_0()); 
            // InternalBusinessDsl.g:1168:2: ( rule__JpaMethod__NameAssignment_0 )
            // InternalBusinessDsl.g:1168:3: rule__JpaMethod__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JpaMethod__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJpaMethodAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__JpaMethod__Group__0__Impl"


    // $ANTLR start "rule__JpaMethod__Group__1"
    // InternalBusinessDsl.g:1176:1: rule__JpaMethod__Group__1 : rule__JpaMethod__Group__1__Impl rule__JpaMethod__Group__2 ;
    public final void rule__JpaMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1180:1: ( rule__JpaMethod__Group__1__Impl rule__JpaMethod__Group__2 )
            // InternalBusinessDsl.g:1181:2: rule__JpaMethod__Group__1__Impl rule__JpaMethod__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__JpaMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__2();

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
    // $ANTLR end "rule__JpaMethod__Group__1"


    // $ANTLR start "rule__JpaMethod__Group__1__Impl"
    // InternalBusinessDsl.g:1188:1: rule__JpaMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__JpaMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1192:1: ( ( '(' ) )
            // InternalBusinessDsl.g:1193:1: ( '(' )
            {
            // InternalBusinessDsl.g:1193:1: ( '(' )
            // InternalBusinessDsl.g:1194:2: '('
            {
             before(grammarAccess.getJpaMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJpaMethodAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__JpaMethod__Group__1__Impl"


    // $ANTLR start "rule__JpaMethod__Group__2"
    // InternalBusinessDsl.g:1203:1: rule__JpaMethod__Group__2 : rule__JpaMethod__Group__2__Impl rule__JpaMethod__Group__3 ;
    public final void rule__JpaMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1207:1: ( rule__JpaMethod__Group__2__Impl rule__JpaMethod__Group__3 )
            // InternalBusinessDsl.g:1208:2: rule__JpaMethod__Group__2__Impl rule__JpaMethod__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__JpaMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__3();

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
    // $ANTLR end "rule__JpaMethod__Group__2"


    // $ANTLR start "rule__JpaMethod__Group__2__Impl"
    // InternalBusinessDsl.g:1215:1: rule__JpaMethod__Group__2__Impl : ( ')' ) ;
    public final void rule__JpaMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1219:1: ( ( ')' ) )
            // InternalBusinessDsl.g:1220:1: ( ')' )
            {
            // InternalBusinessDsl.g:1220:1: ( ')' )
            // InternalBusinessDsl.g:1221:2: ')'
            {
             before(grammarAccess.getJpaMethodAccess().getRightParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getJpaMethodAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__JpaMethod__Group__2__Impl"


    // $ANTLR start "rule__JpaMethod__Group__3"
    // InternalBusinessDsl.g:1230:1: rule__JpaMethod__Group__3 : rule__JpaMethod__Group__3__Impl rule__JpaMethod__Group__4 ;
    public final void rule__JpaMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1234:1: ( rule__JpaMethod__Group__3__Impl rule__JpaMethod__Group__4 )
            // InternalBusinessDsl.g:1235:2: rule__JpaMethod__Group__3__Impl rule__JpaMethod__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__JpaMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__4();

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
    // $ANTLR end "rule__JpaMethod__Group__3"


    // $ANTLR start "rule__JpaMethod__Group__3__Impl"
    // InternalBusinessDsl.g:1242:1: rule__JpaMethod__Group__3__Impl : ( ( rule__JpaMethod__KeywordAssignment_3 ) ) ;
    public final void rule__JpaMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1246:1: ( ( ( rule__JpaMethod__KeywordAssignment_3 ) ) )
            // InternalBusinessDsl.g:1247:1: ( ( rule__JpaMethod__KeywordAssignment_3 ) )
            {
            // InternalBusinessDsl.g:1247:1: ( ( rule__JpaMethod__KeywordAssignment_3 ) )
            // InternalBusinessDsl.g:1248:2: ( rule__JpaMethod__KeywordAssignment_3 )
            {
             before(grammarAccess.getJpaMethodAccess().getKeywordAssignment_3()); 
            // InternalBusinessDsl.g:1249:2: ( rule__JpaMethod__KeywordAssignment_3 )
            // InternalBusinessDsl.g:1249:3: rule__JpaMethod__KeywordAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JpaMethod__KeywordAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJpaMethodAccess().getKeywordAssignment_3()); 

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
    // $ANTLR end "rule__JpaMethod__Group__3__Impl"


    // $ANTLR start "rule__JpaMethod__Group__4"
    // InternalBusinessDsl.g:1257:1: rule__JpaMethod__Group__4 : rule__JpaMethod__Group__4__Impl rule__JpaMethod__Group__5 ;
    public final void rule__JpaMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1261:1: ( rule__JpaMethod__Group__4__Impl rule__JpaMethod__Group__5 )
            // InternalBusinessDsl.g:1262:2: rule__JpaMethod__Group__4__Impl rule__JpaMethod__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__JpaMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__5();

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
    // $ANTLR end "rule__JpaMethod__Group__4"


    // $ANTLR start "rule__JpaMethod__Group__4__Impl"
    // InternalBusinessDsl.g:1269:1: rule__JpaMethod__Group__4__Impl : ( '<' ) ;
    public final void rule__JpaMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1273:1: ( ( '<' ) )
            // InternalBusinessDsl.g:1274:1: ( '<' )
            {
            // InternalBusinessDsl.g:1274:1: ( '<' )
            // InternalBusinessDsl.g:1275:2: '<'
            {
             before(grammarAccess.getJpaMethodAccess().getLessThanSignKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getJpaMethodAccess().getLessThanSignKeyword_4()); 

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
    // $ANTLR end "rule__JpaMethod__Group__4__Impl"


    // $ANTLR start "rule__JpaMethod__Group__5"
    // InternalBusinessDsl.g:1284:1: rule__JpaMethod__Group__5 : rule__JpaMethod__Group__5__Impl rule__JpaMethod__Group__6 ;
    public final void rule__JpaMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1288:1: ( rule__JpaMethod__Group__5__Impl rule__JpaMethod__Group__6 )
            // InternalBusinessDsl.g:1289:2: rule__JpaMethod__Group__5__Impl rule__JpaMethod__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__JpaMethod__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__6();

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
    // $ANTLR end "rule__JpaMethod__Group__5"


    // $ANTLR start "rule__JpaMethod__Group__5__Impl"
    // InternalBusinessDsl.g:1296:1: rule__JpaMethod__Group__5__Impl : ( ( rule__JpaMethod__EntityAssignment_5 ) ) ;
    public final void rule__JpaMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1300:1: ( ( ( rule__JpaMethod__EntityAssignment_5 ) ) )
            // InternalBusinessDsl.g:1301:1: ( ( rule__JpaMethod__EntityAssignment_5 ) )
            {
            // InternalBusinessDsl.g:1301:1: ( ( rule__JpaMethod__EntityAssignment_5 ) )
            // InternalBusinessDsl.g:1302:2: ( rule__JpaMethod__EntityAssignment_5 )
            {
             before(grammarAccess.getJpaMethodAccess().getEntityAssignment_5()); 
            // InternalBusinessDsl.g:1303:2: ( rule__JpaMethod__EntityAssignment_5 )
            // InternalBusinessDsl.g:1303:3: rule__JpaMethod__EntityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__JpaMethod__EntityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJpaMethodAccess().getEntityAssignment_5()); 

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
    // $ANTLR end "rule__JpaMethod__Group__5__Impl"


    // $ANTLR start "rule__JpaMethod__Group__6"
    // InternalBusinessDsl.g:1311:1: rule__JpaMethod__Group__6 : rule__JpaMethod__Group__6__Impl ;
    public final void rule__JpaMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1315:1: ( rule__JpaMethod__Group__6__Impl )
            // InternalBusinessDsl.g:1316:2: rule__JpaMethod__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JpaMethod__Group__6__Impl();

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
    // $ANTLR end "rule__JpaMethod__Group__6"


    // $ANTLR start "rule__JpaMethod__Group__6__Impl"
    // InternalBusinessDsl.g:1322:1: rule__JpaMethod__Group__6__Impl : ( '>' ) ;
    public final void rule__JpaMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1326:1: ( ( '>' ) )
            // InternalBusinessDsl.g:1327:1: ( '>' )
            {
            // InternalBusinessDsl.g:1327:1: ( '>' )
            // InternalBusinessDsl.g:1328:2: '>'
            {
             before(grammarAccess.getJpaMethodAccess().getGreaterThanSignKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJpaMethodAccess().getGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__JpaMethod__Group__6__Impl"


    // $ANTLR start "rule__FinderUserMethod__Group__0"
    // InternalBusinessDsl.g:1338:1: rule__FinderUserMethod__Group__0 : rule__FinderUserMethod__Group__0__Impl rule__FinderUserMethod__Group__1 ;
    public final void rule__FinderUserMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1342:1: ( rule__FinderUserMethod__Group__0__Impl rule__FinderUserMethod__Group__1 )
            // InternalBusinessDsl.g:1343:2: rule__FinderUserMethod__Group__0__Impl rule__FinderUserMethod__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FinderUserMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group__1();

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
    // $ANTLR end "rule__FinderUserMethod__Group__0"


    // $ANTLR start "rule__FinderUserMethod__Group__0__Impl"
    // InternalBusinessDsl.g:1350:1: rule__FinderUserMethod__Group__0__Impl : ( ( rule__FinderUserMethod__Alternatives_0 ) ) ;
    public final void rule__FinderUserMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1354:1: ( ( ( rule__FinderUserMethod__Alternatives_0 ) ) )
            // InternalBusinessDsl.g:1355:1: ( ( rule__FinderUserMethod__Alternatives_0 ) )
            {
            // InternalBusinessDsl.g:1355:1: ( ( rule__FinderUserMethod__Alternatives_0 ) )
            // InternalBusinessDsl.g:1356:2: ( rule__FinderUserMethod__Alternatives_0 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getAlternatives_0()); 
            // InternalBusinessDsl.g:1357:2: ( rule__FinderUserMethod__Alternatives_0 )
            // InternalBusinessDsl.g:1357:3: rule__FinderUserMethod__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFinderUserMethodAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__FinderUserMethod__Group__0__Impl"


    // $ANTLR start "rule__FinderUserMethod__Group__1"
    // InternalBusinessDsl.g:1365:1: rule__FinderUserMethod__Group__1 : rule__FinderUserMethod__Group__1__Impl ;
    public final void rule__FinderUserMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1369:1: ( rule__FinderUserMethod__Group__1__Impl )
            // InternalBusinessDsl.g:1370:2: rule__FinderUserMethod__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group__1__Impl();

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
    // $ANTLR end "rule__FinderUserMethod__Group__1"


    // $ANTLR start "rule__FinderUserMethod__Group__1__Impl"
    // InternalBusinessDsl.g:1376:1: rule__FinderUserMethod__Group__1__Impl : ( ( rule__FinderUserMethod__Group_1__0 )? ) ;
    public final void rule__FinderUserMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1380:1: ( ( ( rule__FinderUserMethod__Group_1__0 )? ) )
            // InternalBusinessDsl.g:1381:1: ( ( rule__FinderUserMethod__Group_1__0 )? )
            {
            // InternalBusinessDsl.g:1381:1: ( ( rule__FinderUserMethod__Group_1__0 )? )
            // InternalBusinessDsl.g:1382:2: ( rule__FinderUserMethod__Group_1__0 )?
            {
             before(grammarAccess.getFinderUserMethodAccess().getGroup_1()); 
            // InternalBusinessDsl.g:1383:2: ( rule__FinderUserMethod__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBusinessDsl.g:1383:3: rule__FinderUserMethod__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FinderUserMethod__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinderUserMethodAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FinderUserMethod__Group__1__Impl"


    // $ANTLR start "rule__FinderUserMethod__Group_1__0"
    // InternalBusinessDsl.g:1392:1: rule__FinderUserMethod__Group_1__0 : rule__FinderUserMethod__Group_1__0__Impl rule__FinderUserMethod__Group_1__1 ;
    public final void rule__FinderUserMethod__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1396:1: ( rule__FinderUserMethod__Group_1__0__Impl rule__FinderUserMethod__Group_1__1 )
            // InternalBusinessDsl.g:1397:2: rule__FinderUserMethod__Group_1__0__Impl rule__FinderUserMethod__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__FinderUserMethod__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group_1__1();

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__0"


    // $ANTLR start "rule__FinderUserMethod__Group_1__0__Impl"
    // InternalBusinessDsl.g:1404:1: rule__FinderUserMethod__Group_1__0__Impl : ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) ) ;
    public final void rule__FinderUserMethod__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1408:1: ( ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) ) )
            // InternalBusinessDsl.g:1409:1: ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) )
            {
            // InternalBusinessDsl.g:1409:1: ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) )
            // InternalBusinessDsl.g:1410:2: ( rule__FinderUserMethod__KeywordAssignment_1_0 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getKeywordAssignment_1_0()); 
            // InternalBusinessDsl.g:1411:2: ( rule__FinderUserMethod__KeywordAssignment_1_0 )
            // InternalBusinessDsl.g:1411:3: rule__FinderUserMethod__KeywordAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__KeywordAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFinderUserMethodAccess().getKeywordAssignment_1_0()); 

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__0__Impl"


    // $ANTLR start "rule__FinderUserMethod__Group_1__1"
    // InternalBusinessDsl.g:1419:1: rule__FinderUserMethod__Group_1__1 : rule__FinderUserMethod__Group_1__1__Impl rule__FinderUserMethod__Group_1__2 ;
    public final void rule__FinderUserMethod__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1423:1: ( rule__FinderUserMethod__Group_1__1__Impl rule__FinderUserMethod__Group_1__2 )
            // InternalBusinessDsl.g:1424:2: rule__FinderUserMethod__Group_1__1__Impl rule__FinderUserMethod__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__FinderUserMethod__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group_1__2();

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__1"


    // $ANTLR start "rule__FinderUserMethod__Group_1__1__Impl"
    // InternalBusinessDsl.g:1431:1: rule__FinderUserMethod__Group_1__1__Impl : ( '<' ) ;
    public final void rule__FinderUserMethod__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1435:1: ( ( '<' ) )
            // InternalBusinessDsl.g:1436:1: ( '<' )
            {
            // InternalBusinessDsl.g:1436:1: ( '<' )
            // InternalBusinessDsl.g:1437:2: '<'
            {
             before(grammarAccess.getFinderUserMethodAccess().getLessThanSignKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFinderUserMethodAccess().getLessThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__1__Impl"


    // $ANTLR start "rule__FinderUserMethod__Group_1__2"
    // InternalBusinessDsl.g:1446:1: rule__FinderUserMethod__Group_1__2 : rule__FinderUserMethod__Group_1__2__Impl rule__FinderUserMethod__Group_1__3 ;
    public final void rule__FinderUserMethod__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1450:1: ( rule__FinderUserMethod__Group_1__2__Impl rule__FinderUserMethod__Group_1__3 )
            // InternalBusinessDsl.g:1451:2: rule__FinderUserMethod__Group_1__2__Impl rule__FinderUserMethod__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__FinderUserMethod__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group_1__3();

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__2"


    // $ANTLR start "rule__FinderUserMethod__Group_1__2__Impl"
    // InternalBusinessDsl.g:1458:1: rule__FinderUserMethod__Group_1__2__Impl : ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) ) ;
    public final void rule__FinderUserMethod__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1462:1: ( ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) ) )
            // InternalBusinessDsl.g:1463:1: ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) )
            {
            // InternalBusinessDsl.g:1463:1: ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) )
            // InternalBusinessDsl.g:1464:2: ( rule__FinderUserMethod__FinderAssignment_1_2 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getFinderAssignment_1_2()); 
            // InternalBusinessDsl.g:1465:2: ( rule__FinderUserMethod__FinderAssignment_1_2 )
            // InternalBusinessDsl.g:1465:3: rule__FinderUserMethod__FinderAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__FinderAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFinderUserMethodAccess().getFinderAssignment_1_2()); 

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__2__Impl"


    // $ANTLR start "rule__FinderUserMethod__Group_1__3"
    // InternalBusinessDsl.g:1473:1: rule__FinderUserMethod__Group_1__3 : rule__FinderUserMethod__Group_1__3__Impl ;
    public final void rule__FinderUserMethod__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1477:1: ( rule__FinderUserMethod__Group_1__3__Impl )
            // InternalBusinessDsl.g:1478:2: rule__FinderUserMethod__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinderUserMethod__Group_1__3__Impl();

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__3"


    // $ANTLR start "rule__FinderUserMethod__Group_1__3__Impl"
    // InternalBusinessDsl.g:1484:1: rule__FinderUserMethod__Group_1__3__Impl : ( '>' ) ;
    public final void rule__FinderUserMethod__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1488:1: ( ( '>' ) )
            // InternalBusinessDsl.g:1489:1: ( '>' )
            {
            // InternalBusinessDsl.g:1489:1: ( '>' )
            // InternalBusinessDsl.g:1490:2: '>'
            {
             before(grammarAccess.getFinderUserMethodAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFinderUserMethodAccess().getGreaterThanSignKeyword_1_3()); 

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
    // $ANTLR end "rule__FinderUserMethod__Group_1__3__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__0"
    // InternalBusinessDsl.g:1500:1: rule__MethodSimpleReturn__Group__0 : rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 ;
    public final void rule__MethodSimpleReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1504:1: ( rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 )
            // InternalBusinessDsl.g:1505:2: rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBusinessDsl.g:1512:1: rule__MethodSimpleReturn__Group__0__Impl : ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1516:1: ( ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:1517:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:1517:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            // InternalBusinessDsl.g:1518:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0()); 
            // InternalBusinessDsl.g:1519:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            // InternalBusinessDsl.g:1519:3: rule__MethodSimpleReturn__ReturnTypeAssignment_0
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
    // InternalBusinessDsl.g:1527:1: rule__MethodSimpleReturn__Group__1 : rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 ;
    public final void rule__MethodSimpleReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1531:1: ( rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 )
            // InternalBusinessDsl.g:1532:2: rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBusinessDsl.g:1539:1: rule__MethodSimpleReturn__Group__1__Impl : ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1543:1: ( ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:1544:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:1544:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            // InternalBusinessDsl.g:1545:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:1546:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            // InternalBusinessDsl.g:1546:3: rule__MethodSimpleReturn__NameAssignment_1
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
    // InternalBusinessDsl.g:1554:1: rule__MethodSimpleReturn__Group__2 : rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 ;
    public final void rule__MethodSimpleReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1558:1: ( rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 )
            // InternalBusinessDsl.g:1559:2: rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBusinessDsl.g:1566:1: rule__MethodSimpleReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodSimpleReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1570:1: ( ( '(' ) )
            // InternalBusinessDsl.g:1571:1: ( '(' )
            {
            // InternalBusinessDsl.g:1571:1: ( '(' )
            // InternalBusinessDsl.g:1572:2: '('
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1581:1: rule__MethodSimpleReturn__Group__3 : rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 ;
    public final void rule__MethodSimpleReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1585:1: ( rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 )
            // InternalBusinessDsl.g:1586:2: rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBusinessDsl.g:1593:1: rule__MethodSimpleReturn__Group__3__Impl : ( ( rule__MethodSimpleReturn__Group_3__0 )? ) ;
    public final void rule__MethodSimpleReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1597:1: ( ( ( rule__MethodSimpleReturn__Group_3__0 )? ) )
            // InternalBusinessDsl.g:1598:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            {
            // InternalBusinessDsl.g:1598:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            // InternalBusinessDsl.g:1599:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3()); 
            // InternalBusinessDsl.g:1600:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_DATE && LA16_0<=RULE_SET)||(LA16_0>=RULE_TYPE_INT && LA16_0<=RULE_ID)||LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBusinessDsl.g:1600:3: rule__MethodSimpleReturn__Group_3__0
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
    // InternalBusinessDsl.g:1608:1: rule__MethodSimpleReturn__Group__4 : rule__MethodSimpleReturn__Group__4__Impl ;
    public final void rule__MethodSimpleReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1612:1: ( rule__MethodSimpleReturn__Group__4__Impl )
            // InternalBusinessDsl.g:1613:2: rule__MethodSimpleReturn__Group__4__Impl
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
    // InternalBusinessDsl.g:1619:1: rule__MethodSimpleReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodSimpleReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1623:1: ( ( ')' ) )
            // InternalBusinessDsl.g:1624:1: ( ')' )
            {
            // InternalBusinessDsl.g:1624:1: ( ')' )
            // InternalBusinessDsl.g:1625:2: ')'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1635:1: rule__MethodSimpleReturn__Group_3__0 : rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 ;
    public final void rule__MethodSimpleReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1639:1: ( rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 )
            // InternalBusinessDsl.g:1640:2: rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBusinessDsl.g:1647:1: rule__MethodSimpleReturn__Group_3__0__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1651:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) )
            // InternalBusinessDsl.g:1652:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            {
            // InternalBusinessDsl.g:1652:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            // InternalBusinessDsl.g:1653:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0()); 
            // InternalBusinessDsl.g:1654:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            // InternalBusinessDsl.g:1654:3: rule__MethodSimpleReturn__ParametersAssignment_3_0
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
    // InternalBusinessDsl.g:1662:1: rule__MethodSimpleReturn__Group_3__1 : rule__MethodSimpleReturn__Group_3__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1666:1: ( rule__MethodSimpleReturn__Group_3__1__Impl )
            // InternalBusinessDsl.g:1667:2: rule__MethodSimpleReturn__Group_3__1__Impl
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
    // InternalBusinessDsl.g:1673:1: rule__MethodSimpleReturn__Group_3__1__Impl : ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodSimpleReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1677:1: ( ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) )
            // InternalBusinessDsl.g:1678:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            {
            // InternalBusinessDsl.g:1678:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            // InternalBusinessDsl.g:1679:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1()); 
            // InternalBusinessDsl.g:1680:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBusinessDsl.g:1680:3: rule__MethodSimpleReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MethodSimpleReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBusinessDsl.g:1689:1: rule__MethodSimpleReturn__Group_3_1__0 : rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 ;
    public final void rule__MethodSimpleReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1693:1: ( rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 )
            // InternalBusinessDsl.g:1694:2: rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBusinessDsl.g:1701:1: rule__MethodSimpleReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1705:1: ( ( ',' ) )
            // InternalBusinessDsl.g:1706:1: ( ',' )
            {
            // InternalBusinessDsl.g:1706:1: ( ',' )
            // InternalBusinessDsl.g:1707:2: ','
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1716:1: rule__MethodSimpleReturn__Group_3_1__1 : rule__MethodSimpleReturn__Group_3_1__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1720:1: ( rule__MethodSimpleReturn__Group_3_1__1__Impl )
            // InternalBusinessDsl.g:1721:2: rule__MethodSimpleReturn__Group_3_1__1__Impl
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
    // InternalBusinessDsl.g:1727:1: rule__MethodSimpleReturn__Group_3_1__1__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1731:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalBusinessDsl.g:1732:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalBusinessDsl.g:1732:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            // InternalBusinessDsl.g:1733:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalBusinessDsl.g:1734:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            // InternalBusinessDsl.g:1734:3: rule__MethodSimpleReturn__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__MethodAllModelReturn__Group__0"
    // InternalBusinessDsl.g:1743:1: rule__MethodAllModelReturn__Group__0 : rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1 ;
    public final void rule__MethodAllModelReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1747:1: ( rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1 )
            // InternalBusinessDsl.g:1748:2: rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBusinessDsl.g:1755:1: rule__MethodAllModelReturn__Group__0__Impl : ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodAllModelReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1759:1: ( ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:1760:1: ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:1760:1: ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) )
            // InternalBusinessDsl.g:1761:2: ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAssignment_0()); 
            // InternalBusinessDsl.g:1762:2: ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 )
            // InternalBusinessDsl.g:1762:3: rule__MethodAllModelReturn__ReturnTypeAssignment_0
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
    // InternalBusinessDsl.g:1770:1: rule__MethodAllModelReturn__Group__1 : rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2 ;
    public final void rule__MethodAllModelReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1774:1: ( rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2 )
            // InternalBusinessDsl.g:1775:2: rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBusinessDsl.g:1782:1: rule__MethodAllModelReturn__Group__1__Impl : ( ( rule__MethodAllModelReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodAllModelReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1786:1: ( ( ( rule__MethodAllModelReturn__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:1787:1: ( ( rule__MethodAllModelReturn__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:1787:1: ( ( rule__MethodAllModelReturn__NameAssignment_1 ) )
            // InternalBusinessDsl.g:1788:2: ( rule__MethodAllModelReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:1789:2: ( rule__MethodAllModelReturn__NameAssignment_1 )
            // InternalBusinessDsl.g:1789:3: rule__MethodAllModelReturn__NameAssignment_1
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
    // InternalBusinessDsl.g:1797:1: rule__MethodAllModelReturn__Group__2 : rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3 ;
    public final void rule__MethodAllModelReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1801:1: ( rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3 )
            // InternalBusinessDsl.g:1802:2: rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBusinessDsl.g:1809:1: rule__MethodAllModelReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodAllModelReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1813:1: ( ( '(' ) )
            // InternalBusinessDsl.g:1814:1: ( '(' )
            {
            // InternalBusinessDsl.g:1814:1: ( '(' )
            // InternalBusinessDsl.g:1815:2: '('
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1824:1: rule__MethodAllModelReturn__Group__3 : rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4 ;
    public final void rule__MethodAllModelReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1828:1: ( rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4 )
            // InternalBusinessDsl.g:1829:2: rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBusinessDsl.g:1836:1: rule__MethodAllModelReturn__Group__3__Impl : ( ( rule__MethodAllModelReturn__Group_3__0 )? ) ;
    public final void rule__MethodAllModelReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1840:1: ( ( ( rule__MethodAllModelReturn__Group_3__0 )? ) )
            // InternalBusinessDsl.g:1841:1: ( ( rule__MethodAllModelReturn__Group_3__0 )? )
            {
            // InternalBusinessDsl.g:1841:1: ( ( rule__MethodAllModelReturn__Group_3__0 )? )
            // InternalBusinessDsl.g:1842:2: ( rule__MethodAllModelReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup_3()); 
            // InternalBusinessDsl.g:1843:2: ( rule__MethodAllModelReturn__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_DATE && LA18_0<=RULE_SET)||(LA18_0>=RULE_TYPE_INT && LA18_0<=RULE_ID)||LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBusinessDsl.g:1843:3: rule__MethodAllModelReturn__Group_3__0
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
    // InternalBusinessDsl.g:1851:1: rule__MethodAllModelReturn__Group__4 : rule__MethodAllModelReturn__Group__4__Impl ;
    public final void rule__MethodAllModelReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1855:1: ( rule__MethodAllModelReturn__Group__4__Impl )
            // InternalBusinessDsl.g:1856:2: rule__MethodAllModelReturn__Group__4__Impl
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
    // InternalBusinessDsl.g:1862:1: rule__MethodAllModelReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodAllModelReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1866:1: ( ( ')' ) )
            // InternalBusinessDsl.g:1867:1: ( ')' )
            {
            // InternalBusinessDsl.g:1867:1: ( ')' )
            // InternalBusinessDsl.g:1868:2: ')'
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1878:1: rule__MethodAllModelReturn__Group_3__0 : rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1 ;
    public final void rule__MethodAllModelReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1882:1: ( rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1 )
            // InternalBusinessDsl.g:1883:2: rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBusinessDsl.g:1890:1: rule__MethodAllModelReturn__Group_3__0__Impl : ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodAllModelReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1894:1: ( ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) ) )
            // InternalBusinessDsl.g:1895:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) )
            {
            // InternalBusinessDsl.g:1895:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) )
            // InternalBusinessDsl.g:1896:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_0()); 
            // InternalBusinessDsl.g:1897:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_0 )
            // InternalBusinessDsl.g:1897:3: rule__MethodAllModelReturn__ParametersAssignment_3_0
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
    // InternalBusinessDsl.g:1905:1: rule__MethodAllModelReturn__Group_3__1 : rule__MethodAllModelReturn__Group_3__1__Impl ;
    public final void rule__MethodAllModelReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1909:1: ( rule__MethodAllModelReturn__Group_3__1__Impl )
            // InternalBusinessDsl.g:1910:2: rule__MethodAllModelReturn__Group_3__1__Impl
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
    // InternalBusinessDsl.g:1916:1: rule__MethodAllModelReturn__Group_3__1__Impl : ( ( rule__MethodAllModelReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodAllModelReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1920:1: ( ( ( rule__MethodAllModelReturn__Group_3_1__0 )* ) )
            // InternalBusinessDsl.g:1921:1: ( ( rule__MethodAllModelReturn__Group_3_1__0 )* )
            {
            // InternalBusinessDsl.g:1921:1: ( ( rule__MethodAllModelReturn__Group_3_1__0 )* )
            // InternalBusinessDsl.g:1922:2: ( rule__MethodAllModelReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup_3_1()); 
            // InternalBusinessDsl.g:1923:2: ( rule__MethodAllModelReturn__Group_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBusinessDsl.g:1923:3: rule__MethodAllModelReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MethodAllModelReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBusinessDsl.g:1932:1: rule__MethodAllModelReturn__Group_3_1__0 : rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1 ;
    public final void rule__MethodAllModelReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1936:1: ( rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1 )
            // InternalBusinessDsl.g:1937:2: rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBusinessDsl.g:1944:1: rule__MethodAllModelReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodAllModelReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1948:1: ( ( ',' ) )
            // InternalBusinessDsl.g:1949:1: ( ',' )
            {
            // InternalBusinessDsl.g:1949:1: ( ',' )
            // InternalBusinessDsl.g:1950:2: ','
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1959:1: rule__MethodAllModelReturn__Group_3_1__1 : rule__MethodAllModelReturn__Group_3_1__1__Impl ;
    public final void rule__MethodAllModelReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1963:1: ( rule__MethodAllModelReturn__Group_3_1__1__Impl )
            // InternalBusinessDsl.g:1964:2: rule__MethodAllModelReturn__Group_3_1__1__Impl
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
    // InternalBusinessDsl.g:1970:1: rule__MethodAllModelReturn__Group_3_1__1__Impl : ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodAllModelReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1974:1: ( ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalBusinessDsl.g:1975:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalBusinessDsl.g:1975:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) )
            // InternalBusinessDsl.g:1976:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalBusinessDsl.g:1977:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 )
            // InternalBusinessDsl.g:1977:3: rule__MethodAllModelReturn__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__MethodDtoReturn__Group__0"
    // InternalBusinessDsl.g:1986:1: rule__MethodDtoReturn__Group__0 : rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 ;
    public final void rule__MethodDtoReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1990:1: ( rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 )
            // InternalBusinessDsl.g:1991:2: rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MethodDtoReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__1();

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
    // $ANTLR end "rule__MethodDtoReturn__Group__0"


    // $ANTLR start "rule__MethodDtoReturn__Group__0__Impl"
    // InternalBusinessDsl.g:1998:1: rule__MethodDtoReturn__Group__0__Impl : ( '#' ) ;
    public final void rule__MethodDtoReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2002:1: ( ( '#' ) )
            // InternalBusinessDsl.g:2003:1: ( '#' )
            {
            // InternalBusinessDsl.g:2003:1: ( '#' )
            // InternalBusinessDsl.g:2004:2: '#'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group__0__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group__1"
    // InternalBusinessDsl.g:2013:1: rule__MethodDtoReturn__Group__1 : rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 ;
    public final void rule__MethodDtoReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2017:1: ( rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 )
            // InternalBusinessDsl.g:2018:2: rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MethodDtoReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__2();

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
    // $ANTLR end "rule__MethodDtoReturn__Group__1"


    // $ANTLR start "rule__MethodDtoReturn__Group__1__Impl"
    // InternalBusinessDsl.g:2025:1: rule__MethodDtoReturn__Group__1__Impl : ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodDtoReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2029:1: ( ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) )
            // InternalBusinessDsl.g:2030:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2030:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            // InternalBusinessDsl.g:2031:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeAssignment_1()); 
            // InternalBusinessDsl.g:2032:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            // InternalBusinessDsl.g:2032:3: rule__MethodDtoReturn__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDtoReturnAccess().getReturnTypeAssignment_1()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group__1__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group__2"
    // InternalBusinessDsl.g:2040:1: rule__MethodDtoReturn__Group__2 : rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 ;
    public final void rule__MethodDtoReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2044:1: ( rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 )
            // InternalBusinessDsl.g:2045:2: rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MethodDtoReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__3();

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
    // $ANTLR end "rule__MethodDtoReturn__Group__2"


    // $ANTLR start "rule__MethodDtoReturn__Group__2__Impl"
    // InternalBusinessDsl.g:2052:1: rule__MethodDtoReturn__Group__2__Impl : ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) ;
    public final void rule__MethodDtoReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2056:1: ( ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) )
            // InternalBusinessDsl.g:2057:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            {
            // InternalBusinessDsl.g:2057:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            // InternalBusinessDsl.g:2058:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNameAssignment_2()); 
            // InternalBusinessDsl.g:2059:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            // InternalBusinessDsl.g:2059:3: rule__MethodDtoReturn__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodDtoReturnAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group__2__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group__3"
    // InternalBusinessDsl.g:2067:1: rule__MethodDtoReturn__Group__3 : rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 ;
    public final void rule__MethodDtoReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2071:1: ( rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 )
            // InternalBusinessDsl.g:2072:2: rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__MethodDtoReturn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__4();

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
    // $ANTLR end "rule__MethodDtoReturn__Group__3"


    // $ANTLR start "rule__MethodDtoReturn__Group__3__Impl"
    // InternalBusinessDsl.g:2079:1: rule__MethodDtoReturn__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDtoReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2083:1: ( ( '(' ) )
            // InternalBusinessDsl.g:2084:1: ( '(' )
            {
            // InternalBusinessDsl.g:2084:1: ( '(' )
            // InternalBusinessDsl.g:2085:2: '('
            {
             before(grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group__3__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group__4"
    // InternalBusinessDsl.g:2094:1: rule__MethodDtoReturn__Group__4 : rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 ;
    public final void rule__MethodDtoReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2098:1: ( rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 )
            // InternalBusinessDsl.g:2099:2: rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__MethodDtoReturn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__5();

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
    // $ANTLR end "rule__MethodDtoReturn__Group__4"


    // $ANTLR start "rule__MethodDtoReturn__Group__4__Impl"
    // InternalBusinessDsl.g:2106:1: rule__MethodDtoReturn__Group__4__Impl : ( ( rule__MethodDtoReturn__Group_4__0 )? ) ;
    public final void rule__MethodDtoReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2110:1: ( ( ( rule__MethodDtoReturn__Group_4__0 )? ) )
            // InternalBusinessDsl.g:2111:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            {
            // InternalBusinessDsl.g:2111:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            // InternalBusinessDsl.g:2112:2: ( rule__MethodDtoReturn__Group_4__0 )?
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4()); 
            // InternalBusinessDsl.g:2113:2: ( rule__MethodDtoReturn__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_DATE && LA20_0<=RULE_SET)||(LA20_0>=RULE_TYPE_INT && LA20_0<=RULE_ID)||LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBusinessDsl.g:2113:3: rule__MethodDtoReturn__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDtoReturn__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDtoReturnAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group__4__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group__5"
    // InternalBusinessDsl.g:2121:1: rule__MethodDtoReturn__Group__5 : rule__MethodDtoReturn__Group__5__Impl ;
    public final void rule__MethodDtoReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2125:1: ( rule__MethodDtoReturn__Group__5__Impl )
            // InternalBusinessDsl.g:2126:2: rule__MethodDtoReturn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__5__Impl();

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
    // $ANTLR end "rule__MethodDtoReturn__Group__5"


    // $ANTLR start "rule__MethodDtoReturn__Group__5__Impl"
    // InternalBusinessDsl.g:2132:1: rule__MethodDtoReturn__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDtoReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2136:1: ( ( ')' ) )
            // InternalBusinessDsl.g:2137:1: ( ')' )
            {
            // InternalBusinessDsl.g:2137:1: ( ')' )
            // InternalBusinessDsl.g:2138:2: ')'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group__5__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group_4__0"
    // InternalBusinessDsl.g:2148:1: rule__MethodDtoReturn__Group_4__0 : rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 ;
    public final void rule__MethodDtoReturn__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2152:1: ( rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 )
            // InternalBusinessDsl.g:2153:2: rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__MethodDtoReturn__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group_4__1();

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4__0"


    // $ANTLR start "rule__MethodDtoReturn__Group_4__0__Impl"
    // InternalBusinessDsl.g:2160:1: rule__MethodDtoReturn__Group_4__0__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) ;
    public final void rule__MethodDtoReturn__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2164:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) )
            // InternalBusinessDsl.g:2165:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            {
            // InternalBusinessDsl.g:2165:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            // InternalBusinessDsl.g:2166:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_0()); 
            // InternalBusinessDsl.g:2167:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            // InternalBusinessDsl.g:2167:3: rule__MethodDtoReturn__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4__0__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group_4__1"
    // InternalBusinessDsl.g:2175:1: rule__MethodDtoReturn__Group_4__1 : rule__MethodDtoReturn__Group_4__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2179:1: ( rule__MethodDtoReturn__Group_4__1__Impl )
            // InternalBusinessDsl.g:2180:2: rule__MethodDtoReturn__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group_4__1__Impl();

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4__1"


    // $ANTLR start "rule__MethodDtoReturn__Group_4__1__Impl"
    // InternalBusinessDsl.g:2186:1: rule__MethodDtoReturn__Group_4__1__Impl : ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) ;
    public final void rule__MethodDtoReturn__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2190:1: ( ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) )
            // InternalBusinessDsl.g:2191:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            {
            // InternalBusinessDsl.g:2191:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            // InternalBusinessDsl.g:2192:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4_1()); 
            // InternalBusinessDsl.g:2193:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBusinessDsl.g:2193:3: rule__MethodDtoReturn__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MethodDtoReturn__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMethodDtoReturnAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4__1__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group_4_1__0"
    // InternalBusinessDsl.g:2202:1: rule__MethodDtoReturn__Group_4_1__0 : rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 ;
    public final void rule__MethodDtoReturn__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2206:1: ( rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 )
            // InternalBusinessDsl.g:2207:2: rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1
            {
            pushFollow(FOLLOW_6);
            rule__MethodDtoReturn__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group_4_1__1();

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4_1__0"


    // $ANTLR start "rule__MethodDtoReturn__Group_4_1__0__Impl"
    // InternalBusinessDsl.g:2214:1: rule__MethodDtoReturn__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MethodDtoReturn__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2218:1: ( ( ',' ) )
            // InternalBusinessDsl.g:2219:1: ( ',' )
            {
            // InternalBusinessDsl.g:2219:1: ( ',' )
            // InternalBusinessDsl.g:2220:2: ','
            {
             before(grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4_1__0__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group_4_1__1"
    // InternalBusinessDsl.g:2229:1: rule__MethodDtoReturn__Group_4_1__1 : rule__MethodDtoReturn__Group_4_1__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2233:1: ( rule__MethodDtoReturn__Group_4_1__1__Impl )
            // InternalBusinessDsl.g:2234:2: rule__MethodDtoReturn__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4_1__1"


    // $ANTLR start "rule__MethodDtoReturn__Group_4_1__1__Impl"
    // InternalBusinessDsl.g:2240:1: rule__MethodDtoReturn__Group_4_1__1__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__MethodDtoReturn__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2244:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) )
            // InternalBusinessDsl.g:2245:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            {
            // InternalBusinessDsl.g:2245:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            // InternalBusinessDsl.g:2246:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_1_1()); 
            // InternalBusinessDsl.g:2247:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            // InternalBusinessDsl.g:2247:3: rule__MethodDtoReturn__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_1_1()); 

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
    // $ANTLR end "rule__MethodDtoReturn__Group_4_1__1__Impl"


    // $ANTLR start "rule__MethodCollectionReturn__Group__0"
    // InternalBusinessDsl.g:2256:1: rule__MethodCollectionReturn__Group__0 : rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 ;
    public final void rule__MethodCollectionReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2260:1: ( rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 )
            // InternalBusinessDsl.g:2261:2: rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBusinessDsl.g:2268:1: rule__MethodCollectionReturn__Group__0__Impl : ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2272:1: ( ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2273:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2273:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            // InternalBusinessDsl.g:2274:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0()); 
            // InternalBusinessDsl.g:2275:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            // InternalBusinessDsl.g:2275:3: rule__MethodCollectionReturn__ReturnTypeAssignment_0
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
    // InternalBusinessDsl.g:2283:1: rule__MethodCollectionReturn__Group__1 : rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 ;
    public final void rule__MethodCollectionReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2287:1: ( rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 )
            // InternalBusinessDsl.g:2288:2: rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBusinessDsl.g:2295:1: rule__MethodCollectionReturn__Group__1__Impl : ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2299:1: ( ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2300:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2300:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2301:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2302:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            // InternalBusinessDsl.g:2302:3: rule__MethodCollectionReturn__NameAssignment_1
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
    // InternalBusinessDsl.g:2310:1: rule__MethodCollectionReturn__Group__2 : rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 ;
    public final void rule__MethodCollectionReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2314:1: ( rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 )
            // InternalBusinessDsl.g:2315:2: rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBusinessDsl.g:2322:1: rule__MethodCollectionReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodCollectionReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2326:1: ( ( '(' ) )
            // InternalBusinessDsl.g:2327:1: ( '(' )
            {
            // InternalBusinessDsl.g:2327:1: ( '(' )
            // InternalBusinessDsl.g:2328:2: '('
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2337:1: rule__MethodCollectionReturn__Group__3 : rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 ;
    public final void rule__MethodCollectionReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2341:1: ( rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 )
            // InternalBusinessDsl.g:2342:2: rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBusinessDsl.g:2349:1: rule__MethodCollectionReturn__Group__3__Impl : ( ( rule__MethodCollectionReturn__Group_3__0 )? ) ;
    public final void rule__MethodCollectionReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2353:1: ( ( ( rule__MethodCollectionReturn__Group_3__0 )? ) )
            // InternalBusinessDsl.g:2354:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            {
            // InternalBusinessDsl.g:2354:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            // InternalBusinessDsl.g:2355:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3()); 
            // InternalBusinessDsl.g:2356:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_DATE && LA22_0<=RULE_SET)||(LA22_0>=RULE_TYPE_INT && LA22_0<=RULE_ID)||LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBusinessDsl.g:2356:3: rule__MethodCollectionReturn__Group_3__0
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
    // InternalBusinessDsl.g:2364:1: rule__MethodCollectionReturn__Group__4 : rule__MethodCollectionReturn__Group__4__Impl ;
    public final void rule__MethodCollectionReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2368:1: ( rule__MethodCollectionReturn__Group__4__Impl )
            // InternalBusinessDsl.g:2369:2: rule__MethodCollectionReturn__Group__4__Impl
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
    // InternalBusinessDsl.g:2375:1: rule__MethodCollectionReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodCollectionReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2379:1: ( ( ')' ) )
            // InternalBusinessDsl.g:2380:1: ( ')' )
            {
            // InternalBusinessDsl.g:2380:1: ( ')' )
            // InternalBusinessDsl.g:2381:2: ')'
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2391:1: rule__MethodCollectionReturn__Group_3__0 : rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 ;
    public final void rule__MethodCollectionReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2395:1: ( rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 )
            // InternalBusinessDsl.g:2396:2: rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBusinessDsl.g:2403:1: rule__MethodCollectionReturn__Group_3__0__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2407:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) )
            // InternalBusinessDsl.g:2408:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            {
            // InternalBusinessDsl.g:2408:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            // InternalBusinessDsl.g:2409:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0()); 
            // InternalBusinessDsl.g:2410:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            // InternalBusinessDsl.g:2410:3: rule__MethodCollectionReturn__ParametersAssignment_3_0
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
    // InternalBusinessDsl.g:2418:1: rule__MethodCollectionReturn__Group_3__1 : rule__MethodCollectionReturn__Group_3__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2422:1: ( rule__MethodCollectionReturn__Group_3__1__Impl )
            // InternalBusinessDsl.g:2423:2: rule__MethodCollectionReturn__Group_3__1__Impl
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
    // InternalBusinessDsl.g:2429:1: rule__MethodCollectionReturn__Group_3__1__Impl : ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodCollectionReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2433:1: ( ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) )
            // InternalBusinessDsl.g:2434:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            {
            // InternalBusinessDsl.g:2434:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            // InternalBusinessDsl.g:2435:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1()); 
            // InternalBusinessDsl.g:2436:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBusinessDsl.g:2436:3: rule__MethodCollectionReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MethodCollectionReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBusinessDsl.g:2445:1: rule__MethodCollectionReturn__Group_3_1__0 : rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 ;
    public final void rule__MethodCollectionReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2449:1: ( rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 )
            // InternalBusinessDsl.g:2450:2: rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBusinessDsl.g:2457:1: rule__MethodCollectionReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2461:1: ( ( ',' ) )
            // InternalBusinessDsl.g:2462:1: ( ',' )
            {
            // InternalBusinessDsl.g:2462:1: ( ',' )
            // InternalBusinessDsl.g:2463:2: ','
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2472:1: rule__MethodCollectionReturn__Group_3_1__1 : rule__MethodCollectionReturn__Group_3_1__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2476:1: ( rule__MethodCollectionReturn__Group_3_1__1__Impl )
            // InternalBusinessDsl.g:2477:2: rule__MethodCollectionReturn__Group_3_1__1__Impl
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
    // InternalBusinessDsl.g:2483:1: rule__MethodCollectionReturn__Group_3_1__1__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2487:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalBusinessDsl.g:2488:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalBusinessDsl.g:2488:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            // InternalBusinessDsl.g:2489:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalBusinessDsl.g:2490:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            // InternalBusinessDsl.g:2490:3: rule__MethodCollectionReturn__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__DefAllModelTypeVariable__Group__0"
    // InternalBusinessDsl.g:2499:1: rule__DefAllModelTypeVariable__Group__0 : rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 ;
    public final void rule__DefAllModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2503:1: ( rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 )
            // InternalBusinessDsl.g:2504:2: rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBusinessDsl.g:2511:1: rule__DefAllModelTypeVariable__Group__0__Impl : ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2515:1: ( ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2516:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2516:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2517:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2518:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2518:3: rule__DefAllModelTypeVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2526:1: rule__DefAllModelTypeVariable__Group__1 : rule__DefAllModelTypeVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2530:1: ( rule__DefAllModelTypeVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2531:2: rule__DefAllModelTypeVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2537:1: rule__DefAllModelTypeVariable__Group__1__Impl : ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2541:1: ( ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2542:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2542:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2543:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2544:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2544:3: rule__DefAllModelTypeVariable__NameAssignment_1
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


    // $ANTLR start "rule__DefDtoTypeVariable__Group__0"
    // InternalBusinessDsl.g:2553:1: rule__DefDtoTypeVariable__Group__0 : rule__DefDtoTypeVariable__Group__0__Impl rule__DefDtoTypeVariable__Group__1 ;
    public final void rule__DefDtoTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2557:1: ( rule__DefDtoTypeVariable__Group__0__Impl rule__DefDtoTypeVariable__Group__1 )
            // InternalBusinessDsl.g:2558:2: rule__DefDtoTypeVariable__Group__0__Impl rule__DefDtoTypeVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoTypeVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoTypeVariable__Group__1();

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
    // $ANTLR end "rule__DefDtoTypeVariable__Group__0"


    // $ANTLR start "rule__DefDtoTypeVariable__Group__0__Impl"
    // InternalBusinessDsl.g:2565:1: rule__DefDtoTypeVariable__Group__0__Impl : ( '#' ) ;
    public final void rule__DefDtoTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2569:1: ( ( '#' ) )
            // InternalBusinessDsl.g:2570:1: ( '#' )
            {
            // InternalBusinessDsl.g:2570:1: ( '#' )
            // InternalBusinessDsl.g:2571:2: '#'
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getNumberSignKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDefDtoTypeVariableAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__DefDtoTypeVariable__Group__0__Impl"


    // $ANTLR start "rule__DefDtoTypeVariable__Group__1"
    // InternalBusinessDsl.g:2580:1: rule__DefDtoTypeVariable__Group__1 : rule__DefDtoTypeVariable__Group__1__Impl rule__DefDtoTypeVariable__Group__2 ;
    public final void rule__DefDtoTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2584:1: ( rule__DefDtoTypeVariable__Group__1__Impl rule__DefDtoTypeVariable__Group__2 )
            // InternalBusinessDsl.g:2585:2: rule__DefDtoTypeVariable__Group__1__Impl rule__DefDtoTypeVariable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoTypeVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoTypeVariable__Group__2();

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
    // $ANTLR end "rule__DefDtoTypeVariable__Group__1"


    // $ANTLR start "rule__DefDtoTypeVariable__Group__1__Impl"
    // InternalBusinessDsl.g:2592:1: rule__DefDtoTypeVariable__Group__1__Impl : ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) ) ;
    public final void rule__DefDtoTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2596:1: ( ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) ) )
            // InternalBusinessDsl.g:2597:1: ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2597:1: ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) )
            // InternalBusinessDsl.g:2598:2: ( rule__DefDtoTypeVariable__TypeAssignment_1 )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getTypeAssignment_1()); 
            // InternalBusinessDsl.g:2599:2: ( rule__DefDtoTypeVariable__TypeAssignment_1 )
            // InternalBusinessDsl.g:2599:3: rule__DefDtoTypeVariable__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeVariable__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoTypeVariableAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__DefDtoTypeVariable__Group__1__Impl"


    // $ANTLR start "rule__DefDtoTypeVariable__Group__2"
    // InternalBusinessDsl.g:2607:1: rule__DefDtoTypeVariable__Group__2 : rule__DefDtoTypeVariable__Group__2__Impl ;
    public final void rule__DefDtoTypeVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2611:1: ( rule__DefDtoTypeVariable__Group__2__Impl )
            // InternalBusinessDsl.g:2612:2: rule__DefDtoTypeVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeVariable__Group__2__Impl();

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
    // $ANTLR end "rule__DefDtoTypeVariable__Group__2"


    // $ANTLR start "rule__DefDtoTypeVariable__Group__2__Impl"
    // InternalBusinessDsl.g:2618:1: rule__DefDtoTypeVariable__Group__2__Impl : ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) ) ;
    public final void rule__DefDtoTypeVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2622:1: ( ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) ) )
            // InternalBusinessDsl.g:2623:1: ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) )
            {
            // InternalBusinessDsl.g:2623:1: ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) )
            // InternalBusinessDsl.g:2624:2: ( rule__DefDtoTypeVariable__NameAssignment_2 )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getNameAssignment_2()); 
            // InternalBusinessDsl.g:2625:2: ( rule__DefDtoTypeVariable__NameAssignment_2 )
            // InternalBusinessDsl.g:2625:3: rule__DefDtoTypeVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoTypeVariableAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DefDtoTypeVariable__Group__2__Impl"


    // $ANTLR start "rule__DefSimpleVariable__Group__0"
    // InternalBusinessDsl.g:2634:1: rule__DefSimpleVariable__Group__0 : rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 ;
    public final void rule__DefSimpleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2638:1: ( rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 )
            // InternalBusinessDsl.g:2639:2: rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBusinessDsl.g:2646:1: rule__DefSimpleVariable__Group__0__Impl : ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2650:1: ( ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2651:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2651:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2652:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2653:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2653:3: rule__DefSimpleVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2661:1: rule__DefSimpleVariable__Group__1 : rule__DefSimpleVariable__Group__1__Impl ;
    public final void rule__DefSimpleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2665:1: ( rule__DefSimpleVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2666:2: rule__DefSimpleVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2672:1: rule__DefSimpleVariable__Group__1__Impl : ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2676:1: ( ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2677:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2677:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2678:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2679:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2679:3: rule__DefSimpleVariable__NameAssignment_1
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


    // $ANTLR start "rule__DefAllModelTypeCollectionVariable__Group__0"
    // InternalBusinessDsl.g:2688:1: rule__DefAllModelTypeCollectionVariable__Group__0 : rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2692:1: ( rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 )
            // InternalBusinessDsl.g:2693:2: rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DefAllModelTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeCollectionVariable__Group__1();

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
    // $ANTLR end "rule__DefAllModelTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefAllModelTypeCollectionVariable__Group__0__Impl"
    // InternalBusinessDsl.g:2700:1: rule__DefAllModelTypeCollectionVariable__Group__0__Impl : ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2704:1: ( ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2705:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2705:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2706:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2707:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2707:3: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeCollectionVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__DefAllModelTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefAllModelTypeCollectionVariable__Group__1"
    // InternalBusinessDsl.g:2715:1: rule__DefAllModelTypeCollectionVariable__Group__1 : rule__DefAllModelTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2719:1: ( rule__DefAllModelTypeCollectionVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2720:2: rule__DefAllModelTypeCollectionVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeCollectionVariable__Group__1__Impl();

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
    // $ANTLR end "rule__DefAllModelTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefAllModelTypeCollectionVariable__Group__1__Impl"
    // InternalBusinessDsl.g:2726:1: rule__DefAllModelTypeCollectionVariable__Group__1__Impl : ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2730:1: ( ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2731:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2731:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2732:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2733:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2733:3: rule__DefAllModelTypeCollectionVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefAllModelTypeCollectionVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DefAllModelTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__DefSimpleTypeCollectionVariable__Group__0"
    // InternalBusinessDsl.g:2742:1: rule__DefSimpleTypeCollectionVariable__Group__0 : rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2746:1: ( rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 )
            // InternalBusinessDsl.g:2747:2: rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DefSimpleTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSimpleTypeCollectionVariable__Group__1();

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
    // $ANTLR end "rule__DefSimpleTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefSimpleTypeCollectionVariable__Group__0__Impl"
    // InternalBusinessDsl.g:2754:1: rule__DefSimpleTypeCollectionVariable__Group__0__Impl : ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2758:1: ( ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2759:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2759:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2760:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2761:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2761:3: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleTypeCollectionVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__DefSimpleTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefSimpleTypeCollectionVariable__Group__1"
    // InternalBusinessDsl.g:2769:1: rule__DefSimpleTypeCollectionVariable__Group__1 : rule__DefSimpleTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2773:1: ( rule__DefSimpleTypeCollectionVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2774:2: rule__DefSimpleTypeCollectionVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleTypeCollectionVariable__Group__1__Impl();

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
    // $ANTLR end "rule__DefSimpleTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefSimpleTypeCollectionVariable__Group__1__Impl"
    // InternalBusinessDsl.g:2780:1: rule__DefSimpleTypeCollectionVariable__Group__1__Impl : ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2784:1: ( ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2785:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2785:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2786:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2787:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2787:3: rule__DefSimpleTypeCollectionVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefSimpleTypeCollectionVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DefSimpleTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__DefDtoTypeCollectionVariable__Group__0"
    // InternalBusinessDsl.g:2796:1: rule__DefDtoTypeCollectionVariable__Group__0 : rule__DefDtoTypeCollectionVariable__Group__0__Impl rule__DefDtoTypeCollectionVariable__Group__1 ;
    public final void rule__DefDtoTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2800:1: ( rule__DefDtoTypeCollectionVariable__Group__0__Impl rule__DefDtoTypeCollectionVariable__Group__1 )
            // InternalBusinessDsl.g:2801:2: rule__DefDtoTypeCollectionVariable__Group__0__Impl rule__DefDtoTypeCollectionVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DefDtoTypeCollectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefDtoTypeCollectionVariable__Group__1();

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
    // $ANTLR end "rule__DefDtoTypeCollectionVariable__Group__0"


    // $ANTLR start "rule__DefDtoTypeCollectionVariable__Group__0__Impl"
    // InternalBusinessDsl.g:2808:1: rule__DefDtoTypeCollectionVariable__Group__0__Impl : ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefDtoTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2812:1: ( ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2813:1: ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2813:1: ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2814:2: ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2815:2: ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2815:3: rule__DefDtoTypeCollectionVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeCollectionVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__DefDtoTypeCollectionVariable__Group__0__Impl"


    // $ANTLR start "rule__DefDtoTypeCollectionVariable__Group__1"
    // InternalBusinessDsl.g:2823:1: rule__DefDtoTypeCollectionVariable__Group__1 : rule__DefDtoTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefDtoTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2827:1: ( rule__DefDtoTypeCollectionVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2828:2: rule__DefDtoTypeCollectionVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeCollectionVariable__Group__1__Impl();

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
    // $ANTLR end "rule__DefDtoTypeCollectionVariable__Group__1"


    // $ANTLR start "rule__DefDtoTypeCollectionVariable__Group__1__Impl"
    // InternalBusinessDsl.g:2834:1: rule__DefDtoTypeCollectionVariable__Group__1__Impl : ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefDtoTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2838:1: ( ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2839:1: ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2839:1: ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2840:2: ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2841:2: ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2841:3: rule__DefDtoTypeCollectionVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefDtoTypeCollectionVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DefDtoTypeCollectionVariable__Group__1__Impl"


    // $ANTLR start "rule__AllModelTypeCollection__Group__0"
    // InternalBusinessDsl.g:2850:1: rule__AllModelTypeCollection__Group__0 : rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 ;
    public final void rule__AllModelTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2854:1: ( rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 )
            // InternalBusinessDsl.g:2855:2: rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBusinessDsl.g:2862:1: rule__AllModelTypeCollection__Group__0__Impl : ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__AllModelTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2866:1: ( ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) )
            // InternalBusinessDsl.g:2867:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2867:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            // InternalBusinessDsl.g:2868:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalBusinessDsl.g:2869:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            // InternalBusinessDsl.g:2869:3: rule__AllModelTypeCollection__CollectionAssignment_0
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
    // InternalBusinessDsl.g:2877:1: rule__AllModelTypeCollection__Group__1 : rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 ;
    public final void rule__AllModelTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2881:1: ( rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 )
            // InternalBusinessDsl.g:2882:2: rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBusinessDsl.g:2889:1: rule__AllModelTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__AllModelTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2893:1: ( ( '<' ) )
            // InternalBusinessDsl.g:2894:1: ( '<' )
            {
            // InternalBusinessDsl.g:2894:1: ( '<' )
            // InternalBusinessDsl.g:2895:2: '<'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2904:1: rule__AllModelTypeCollection__Group__2 : rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 ;
    public final void rule__AllModelTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2908:1: ( rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 )
            // InternalBusinessDsl.g:2909:2: rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalBusinessDsl.g:2916:1: rule__AllModelTypeCollection__Group__2__Impl : ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__AllModelTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2920:1: ( ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) )
            // InternalBusinessDsl.g:2921:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            {
            // InternalBusinessDsl.g:2921:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            // InternalBusinessDsl.g:2922:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalBusinessDsl.g:2923:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            // InternalBusinessDsl.g:2923:3: rule__AllModelTypeCollection__TypeAssignment_2
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
    // InternalBusinessDsl.g:2931:1: rule__AllModelTypeCollection__Group__3 : rule__AllModelTypeCollection__Group__3__Impl ;
    public final void rule__AllModelTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2935:1: ( rule__AllModelTypeCollection__Group__3__Impl )
            // InternalBusinessDsl.g:2936:2: rule__AllModelTypeCollection__Group__3__Impl
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
    // InternalBusinessDsl.g:2942:1: rule__AllModelTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__AllModelTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2946:1: ( ( '>' ) )
            // InternalBusinessDsl.g:2947:1: ( '>' )
            {
            // InternalBusinessDsl.g:2947:1: ( '>' )
            // InternalBusinessDsl.g:2948:2: '>'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_2); 
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


    // $ANTLR start "rule__DtoTypeCollection__Group__0"
    // InternalBusinessDsl.g:2958:1: rule__DtoTypeCollection__Group__0 : rule__DtoTypeCollection__Group__0__Impl rule__DtoTypeCollection__Group__1 ;
    public final void rule__DtoTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2962:1: ( rule__DtoTypeCollection__Group__0__Impl rule__DtoTypeCollection__Group__1 )
            // InternalBusinessDsl.g:2963:2: rule__DtoTypeCollection__Group__0__Impl rule__DtoTypeCollection__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DtoTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__Group__1();

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
    // $ANTLR end "rule__DtoTypeCollection__Group__0"


    // $ANTLR start "rule__DtoTypeCollection__Group__0__Impl"
    // InternalBusinessDsl.g:2970:1: rule__DtoTypeCollection__Group__0__Impl : ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__DtoTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2974:1: ( ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) ) )
            // InternalBusinessDsl.g:2975:1: ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2975:1: ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) )
            // InternalBusinessDsl.g:2976:2: ( rule__DtoTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalBusinessDsl.g:2977:2: ( rule__DtoTypeCollection__CollectionAssignment_0 )
            // InternalBusinessDsl.g:2977:3: rule__DtoTypeCollection__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDtoTypeCollectionAccess().getCollectionAssignment_0()); 

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
    // $ANTLR end "rule__DtoTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__DtoTypeCollection__Group__1"
    // InternalBusinessDsl.g:2985:1: rule__DtoTypeCollection__Group__1 : rule__DtoTypeCollection__Group__1__Impl rule__DtoTypeCollection__Group__2 ;
    public final void rule__DtoTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2989:1: ( rule__DtoTypeCollection__Group__1__Impl rule__DtoTypeCollection__Group__2 )
            // InternalBusinessDsl.g:2990:2: rule__DtoTypeCollection__Group__1__Impl rule__DtoTypeCollection__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DtoTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__Group__2();

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
    // $ANTLR end "rule__DtoTypeCollection__Group__1"


    // $ANTLR start "rule__DtoTypeCollection__Group__1__Impl"
    // InternalBusinessDsl.g:2997:1: rule__DtoTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__DtoTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3001:1: ( ( '<' ) )
            // InternalBusinessDsl.g:3002:1: ( '<' )
            {
            // InternalBusinessDsl.g:3002:1: ( '<' )
            // InternalBusinessDsl.g:3003:2: '<'
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDtoTypeCollectionAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DtoTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__DtoTypeCollection__Group__2"
    // InternalBusinessDsl.g:3012:1: rule__DtoTypeCollection__Group__2 : rule__DtoTypeCollection__Group__2__Impl rule__DtoTypeCollection__Group__3 ;
    public final void rule__DtoTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3016:1: ( rule__DtoTypeCollection__Group__2__Impl rule__DtoTypeCollection__Group__3 )
            // InternalBusinessDsl.g:3017:2: rule__DtoTypeCollection__Group__2__Impl rule__DtoTypeCollection__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DtoTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__Group__3();

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
    // $ANTLR end "rule__DtoTypeCollection__Group__2"


    // $ANTLR start "rule__DtoTypeCollection__Group__2__Impl"
    // InternalBusinessDsl.g:3024:1: rule__DtoTypeCollection__Group__2__Impl : ( '#' ) ;
    public final void rule__DtoTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3028:1: ( ( '#' ) )
            // InternalBusinessDsl.g:3029:1: ( '#' )
            {
            // InternalBusinessDsl.g:3029:1: ( '#' )
            // InternalBusinessDsl.g:3030:2: '#'
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getNumberSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDtoTypeCollectionAccess().getNumberSignKeyword_2()); 

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
    // $ANTLR end "rule__DtoTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__DtoTypeCollection__Group__3"
    // InternalBusinessDsl.g:3039:1: rule__DtoTypeCollection__Group__3 : rule__DtoTypeCollection__Group__3__Impl rule__DtoTypeCollection__Group__4 ;
    public final void rule__DtoTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3043:1: ( rule__DtoTypeCollection__Group__3__Impl rule__DtoTypeCollection__Group__4 )
            // InternalBusinessDsl.g:3044:2: rule__DtoTypeCollection__Group__3__Impl rule__DtoTypeCollection__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DtoTypeCollection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__Group__4();

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
    // $ANTLR end "rule__DtoTypeCollection__Group__3"


    // $ANTLR start "rule__DtoTypeCollection__Group__3__Impl"
    // InternalBusinessDsl.g:3051:1: rule__DtoTypeCollection__Group__3__Impl : ( ( rule__DtoTypeCollection__TypeAssignment_3 ) ) ;
    public final void rule__DtoTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3055:1: ( ( ( rule__DtoTypeCollection__TypeAssignment_3 ) ) )
            // InternalBusinessDsl.g:3056:1: ( ( rule__DtoTypeCollection__TypeAssignment_3 ) )
            {
            // InternalBusinessDsl.g:3056:1: ( ( rule__DtoTypeCollection__TypeAssignment_3 ) )
            // InternalBusinessDsl.g:3057:2: ( rule__DtoTypeCollection__TypeAssignment_3 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getTypeAssignment_3()); 
            // InternalBusinessDsl.g:3058:2: ( rule__DtoTypeCollection__TypeAssignment_3 )
            // InternalBusinessDsl.g:3058:3: rule__DtoTypeCollection__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDtoTypeCollectionAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__DtoTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__DtoTypeCollection__Group__4"
    // InternalBusinessDsl.g:3066:1: rule__DtoTypeCollection__Group__4 : rule__DtoTypeCollection__Group__4__Impl ;
    public final void rule__DtoTypeCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3070:1: ( rule__DtoTypeCollection__Group__4__Impl )
            // InternalBusinessDsl.g:3071:2: rule__DtoTypeCollection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__Group__4__Impl();

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
    // $ANTLR end "rule__DtoTypeCollection__Group__4"


    // $ANTLR start "rule__DtoTypeCollection__Group__4__Impl"
    // InternalBusinessDsl.g:3077:1: rule__DtoTypeCollection__Group__4__Impl : ( '>' ) ;
    public final void rule__DtoTypeCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3081:1: ( ( '>' ) )
            // InternalBusinessDsl.g:3082:1: ( '>' )
            {
            // InternalBusinessDsl.g:3082:1: ( '>' )
            // InternalBusinessDsl.g:3083:2: '>'
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getGreaterThanSignKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDtoTypeCollectionAccess().getGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__DtoTypeCollection__Group__4__Impl"


    // $ANTLR start "rule__SimpleTypeCollection__Group__0"
    // InternalBusinessDsl.g:3093:1: rule__SimpleTypeCollection__Group__0 : rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 ;
    public final void rule__SimpleTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3097:1: ( rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 )
            // InternalBusinessDsl.g:3098:2: rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBusinessDsl.g:3105:1: rule__SimpleTypeCollection__Group__0__Impl : ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__SimpleTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3109:1: ( ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) )
            // InternalBusinessDsl.g:3110:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalBusinessDsl.g:3110:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            // InternalBusinessDsl.g:3111:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalBusinessDsl.g:3112:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            // InternalBusinessDsl.g:3112:3: rule__SimpleTypeCollection__CollectionAssignment_0
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
    // InternalBusinessDsl.g:3120:1: rule__SimpleTypeCollection__Group__1 : rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 ;
    public final void rule__SimpleTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3124:1: ( rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 )
            // InternalBusinessDsl.g:3125:2: rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBusinessDsl.g:3132:1: rule__SimpleTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3136:1: ( ( '<' ) )
            // InternalBusinessDsl.g:3137:1: ( '<' )
            {
            // InternalBusinessDsl.g:3137:1: ( '<' )
            // InternalBusinessDsl.g:3138:2: '<'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3147:1: rule__SimpleTypeCollection__Group__2 : rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 ;
    public final void rule__SimpleTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3151:1: ( rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 )
            // InternalBusinessDsl.g:3152:2: rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalBusinessDsl.g:3159:1: rule__SimpleTypeCollection__Group__2__Impl : ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3163:1: ( ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) )
            // InternalBusinessDsl.g:3164:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            {
            // InternalBusinessDsl.g:3164:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            // InternalBusinessDsl.g:3165:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalBusinessDsl.g:3166:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            // InternalBusinessDsl.g:3166:3: rule__SimpleTypeCollection__TypeAssignment_2
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
    // InternalBusinessDsl.g:3174:1: rule__SimpleTypeCollection__Group__3 : rule__SimpleTypeCollection__Group__3__Impl ;
    public final void rule__SimpleTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3178:1: ( rule__SimpleTypeCollection__Group__3__Impl )
            // InternalBusinessDsl.g:3179:2: rule__SimpleTypeCollection__Group__3__Impl
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
    // InternalBusinessDsl.g:3185:1: rule__SimpleTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3189:1: ( ( '>' ) )
            // InternalBusinessDsl.g:3190:1: ( '>' )
            {
            // InternalBusinessDsl.g:3190:1: ( '>' )
            // InternalBusinessDsl.g:3191:2: '>'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__ServicesAssignment"
    // InternalBusinessDsl.g:3201:1: rule__Model__ServicesAssignment : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3205:1: ( ( ruleService ) )
            // InternalBusinessDsl.g:3206:2: ( ruleService )
            {
            // InternalBusinessDsl.g:3206:2: ( ruleService )
            // InternalBusinessDsl.g:3207:3: ruleService
            {
             before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ServicesAssignment"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalBusinessDsl.g:3216:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3220:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3221:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3221:2: ( RULE_ID )
            // InternalBusinessDsl.g:3222:3: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__MethodsAssignment_3"
    // InternalBusinessDsl.g:3231:1: rule__Service__MethodsAssignment_3 : ( ruleServiceMethod ) ;
    public final void rule__Service__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3235:1: ( ( ruleServiceMethod ) )
            // InternalBusinessDsl.g:3236:2: ( ruleServiceMethod )
            {
            // InternalBusinessDsl.g:3236:2: ( ruleServiceMethod )
            // InternalBusinessDsl.g:3237:3: ruleServiceMethod
            {
             before(grammarAccess.getServiceAccess().getMethodsServiceMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getMethodsServiceMethodParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Service__MethodsAssignment_3"


    // $ANTLR start "rule__JpaMethod__NameAssignment_0"
    // InternalBusinessDsl.g:3246:1: rule__JpaMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JpaMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3250:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3251:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3251:2: ( RULE_ID )
            // InternalBusinessDsl.g:3252:3: RULE_ID
            {
             before(grammarAccess.getJpaMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJpaMethodAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__JpaMethod__NameAssignment_0"


    // $ANTLR start "rule__JpaMethod__KeywordAssignment_3"
    // InternalBusinessDsl.g:3261:1: rule__JpaMethod__KeywordAssignment_3 : ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) ) ;
    public final void rule__JpaMethod__KeywordAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3265:1: ( ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) ) )
            // InternalBusinessDsl.g:3266:2: ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) )
            {
            // InternalBusinessDsl.g:3266:2: ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) )
            // InternalBusinessDsl.g:3267:3: ( rule__JpaMethod__KeywordAlternatives_3_0 )
            {
             before(grammarAccess.getJpaMethodAccess().getKeywordAlternatives_3_0()); 
            // InternalBusinessDsl.g:3268:3: ( rule__JpaMethod__KeywordAlternatives_3_0 )
            // InternalBusinessDsl.g:3268:4: rule__JpaMethod__KeywordAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__JpaMethod__KeywordAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getJpaMethodAccess().getKeywordAlternatives_3_0()); 

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
    // $ANTLR end "rule__JpaMethod__KeywordAssignment_3"


    // $ANTLR start "rule__JpaMethod__EntityAssignment_5"
    // InternalBusinessDsl.g:3276:1: rule__JpaMethod__EntityAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__JpaMethod__EntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3280:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3281:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3281:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3282:3: ( RULE_ID )
            {
             before(grammarAccess.getJpaMethodAccess().getEntityEntityCrossReference_5_0()); 
            // InternalBusinessDsl.g:3283:3: ( RULE_ID )
            // InternalBusinessDsl.g:3284:4: RULE_ID
            {
             before(grammarAccess.getJpaMethodAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJpaMethodAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJpaMethodAccess().getEntityEntityCrossReference_5_0()); 

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
    // $ANTLR end "rule__JpaMethod__EntityAssignment_5"


    // $ANTLR start "rule__FinderUserMethod__KeywordAssignment_1_0"
    // InternalBusinessDsl.g:3295:1: rule__FinderUserMethod__KeywordAssignment_1_0 : ( ( 'finder' ) ) ;
    public final void rule__FinderUserMethod__KeywordAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3299:1: ( ( ( 'finder' ) ) )
            // InternalBusinessDsl.g:3300:2: ( ( 'finder' ) )
            {
            // InternalBusinessDsl.g:3300:2: ( ( 'finder' ) )
            // InternalBusinessDsl.g:3301:3: ( 'finder' )
            {
             before(grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0()); 
            // InternalBusinessDsl.g:3302:3: ( 'finder' )
            // InternalBusinessDsl.g:3303:4: 'finder'
            {
             before(grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0()); 

            }

             after(grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0()); 

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
    // $ANTLR end "rule__FinderUserMethod__KeywordAssignment_1_0"


    // $ANTLR start "rule__FinderUserMethod__FinderAssignment_1_2"
    // InternalBusinessDsl.g:3314:1: rule__FinderUserMethod__FinderAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__FinderUserMethod__FinderAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3318:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3319:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3319:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3320:3: ( RULE_ID )
            {
             before(grammarAccess.getFinderUserMethodAccess().getFinderFinderCrossReference_1_2_0()); 
            // InternalBusinessDsl.g:3321:3: ( RULE_ID )
            // InternalBusinessDsl.g:3322:4: RULE_ID
            {
             before(grammarAccess.getFinderUserMethodAccess().getFinderFinderIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFinderUserMethodAccess().getFinderFinderIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getFinderUserMethodAccess().getFinderFinderCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__FinderUserMethod__FinderAssignment_1_2"


    // $ANTLR start "rule__MethodSimpleReturn__ReturnTypeAssignment_0"
    // InternalBusinessDsl.g:3333:1: rule__MethodSimpleReturn__ReturnTypeAssignment_0 : ( ruleSimpleReturnType ) ;
    public final void rule__MethodSimpleReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3337:1: ( ( ruleSimpleReturnType ) )
            // InternalBusinessDsl.g:3338:2: ( ruleSimpleReturnType )
            {
            // InternalBusinessDsl.g:3338:2: ( ruleSimpleReturnType )
            // InternalBusinessDsl.g:3339:3: ruleSimpleReturnType
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
    // InternalBusinessDsl.g:3348:1: rule__MethodSimpleReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodSimpleReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3352:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3353:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3353:2: ( RULE_ID )
            // InternalBusinessDsl.g:3354:3: RULE_ID
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
    // InternalBusinessDsl.g:3363:1: rule__MethodSimpleReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3367:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3368:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3368:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3369:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3378:1: rule__MethodSimpleReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3382:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3383:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3383:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3384:3: ruleDefVariable
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


    // $ANTLR start "rule__MethodAllModelReturn__ReturnTypeAssignment_0"
    // InternalBusinessDsl.g:3393:1: rule__MethodAllModelReturn__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodAllModelReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3397:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3398:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3398:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3399:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeCrossReference_0_0()); 
            // InternalBusinessDsl.g:3400:3: ( RULE_ID )
            // InternalBusinessDsl.g:3401:4: RULE_ID
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
    // InternalBusinessDsl.g:3412:1: rule__MethodAllModelReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodAllModelReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3416:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3417:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3417:2: ( RULE_ID )
            // InternalBusinessDsl.g:3418:3: RULE_ID
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
    // InternalBusinessDsl.g:3427:1: rule__MethodAllModelReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodAllModelReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3431:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3432:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3432:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3433:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3442:1: rule__MethodAllModelReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodAllModelReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3446:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3447:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3447:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3448:3: ruleDefVariable
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


    // $ANTLR start "rule__MethodDtoReturn__ReturnTypeAssignment_1"
    // InternalBusinessDsl.g:3457:1: rule__MethodDtoReturn__ReturnTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodDtoReturn__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3461:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3462:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3462:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3463:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0()); 
            // InternalBusinessDsl.g:3464:3: ( RULE_ID )
            // InternalBusinessDsl.g:3465:4: RULE_ID
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__ReturnTypeAssignment_1"


    // $ANTLR start "rule__MethodDtoReturn__NameAssignment_2"
    // InternalBusinessDsl.g:3476:1: rule__MethodDtoReturn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDtoReturn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3480:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3481:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3481:2: ( RULE_ID )
            // InternalBusinessDsl.g:3482:3: RULE_ID
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__NameAssignment_2"


    // $ANTLR start "rule__MethodDtoReturn__ParametersAssignment_4_0"
    // InternalBusinessDsl.g:3491:1: rule__MethodDtoReturn__ParametersAssignment_4_0 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3495:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3496:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3496:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3497:3: ruleDefVariable
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__ParametersAssignment_4_0"


    // $ANTLR start "rule__MethodDtoReturn__ParametersAssignment_4_1_1"
    // InternalBusinessDsl.g:3506:1: rule__MethodDtoReturn__ParametersAssignment_4_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3510:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3511:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3511:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3512:3: ruleDefVariable
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__MethodDtoReturn__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__MethodCollectionReturn__ReturnTypeAssignment_0"
    // InternalBusinessDsl.g:3521:1: rule__MethodCollectionReturn__ReturnTypeAssignment_0 : ( ruleCollectionReturnType ) ;
    public final void rule__MethodCollectionReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3525:1: ( ( ruleCollectionReturnType ) )
            // InternalBusinessDsl.g:3526:2: ( ruleCollectionReturnType )
            {
            // InternalBusinessDsl.g:3526:2: ( ruleCollectionReturnType )
            // InternalBusinessDsl.g:3527:3: ruleCollectionReturnType
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
    // InternalBusinessDsl.g:3536:1: rule__MethodCollectionReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodCollectionReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3540:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3541:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3541:2: ( RULE_ID )
            // InternalBusinessDsl.g:3542:3: RULE_ID
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
    // InternalBusinessDsl.g:3551:1: rule__MethodCollectionReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3555:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3556:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3556:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3557:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3566:1: rule__MethodCollectionReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3570:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3571:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3571:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3572:3: ruleDefVariable
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


    // $ANTLR start "rule__DefAllModelTypeVariable__TypeAssignment_0"
    // InternalBusinessDsl.g:3581:1: rule__DefAllModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefAllModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3585:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3586:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3586:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3587:3: ( RULE_ID )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0()); 
            // InternalBusinessDsl.g:3588:3: ( RULE_ID )
            // InternalBusinessDsl.g:3589:4: RULE_ID
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
    // InternalBusinessDsl.g:3600:1: rule__DefAllModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3604:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3605:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3605:2: ( RULE_ID )
            // InternalBusinessDsl.g:3606:3: RULE_ID
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


    // $ANTLR start "rule__DefDtoTypeVariable__TypeAssignment_1"
    // InternalBusinessDsl.g:3615:1: rule__DefDtoTypeVariable__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefDtoTypeVariable__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3619:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3620:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3620:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3621:3: ( RULE_ID )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getTypeDtoCrossReference_1_0()); 
            // InternalBusinessDsl.g:3622:3: ( RULE_ID )
            // InternalBusinessDsl.g:3623:4: RULE_ID
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getTypeDtoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoTypeVariableAccess().getTypeDtoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefDtoTypeVariableAccess().getTypeDtoCrossReference_1_0()); 

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
    // $ANTLR end "rule__DefDtoTypeVariable__TypeAssignment_1"


    // $ANTLR start "rule__DefDtoTypeVariable__NameAssignment_2"
    // InternalBusinessDsl.g:3634:1: rule__DefDtoTypeVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefDtoTypeVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3638:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3639:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3639:2: ( RULE_ID )
            // InternalBusinessDsl.g:3640:3: RULE_ID
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoTypeVariableAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DefDtoTypeVariable__NameAssignment_2"


    // $ANTLR start "rule__DefSimpleVariable__TypeAssignment_0"
    // InternalBusinessDsl.g:3649:1: rule__DefSimpleVariable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefSimpleVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3653:1: ( ( ruleType ) )
            // InternalBusinessDsl.g:3654:2: ( ruleType )
            {
            // InternalBusinessDsl.g:3654:2: ( ruleType )
            // InternalBusinessDsl.g:3655:3: ruleType
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
    // InternalBusinessDsl.g:3664:1: rule__DefSimpleVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3668:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3669:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3669:2: ( RULE_ID )
            // InternalBusinessDsl.g:3670:3: RULE_ID
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


    // $ANTLR start "rule__DefAllModelTypeCollectionVariable__TypeAssignment_0"
    // InternalBusinessDsl.g:3679:1: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 : ( ruleAllModelTypeCollection ) ;
    public final void rule__DefAllModelTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3683:1: ( ( ruleAllModelTypeCollection ) )
            // InternalBusinessDsl.g:3684:2: ( ruleAllModelTypeCollection )
            {
            // InternalBusinessDsl.g:3684:2: ( ruleAllModelTypeCollection )
            // InternalBusinessDsl.g:3685:3: ruleAllModelTypeCollection
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAllModelTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefAllModelTypeCollectionVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefAllModelTypeCollectionVariable__NameAssignment_1"
    // InternalBusinessDsl.g:3694:1: rule__DefAllModelTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3698:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3699:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3699:2: ( RULE_ID )
            // InternalBusinessDsl.g:3700:3: RULE_ID
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DefAllModelTypeCollectionVariable__NameAssignment_1"


    // $ANTLR start "rule__DefSimpleTypeCollectionVariable__TypeAssignment_0"
    // InternalBusinessDsl.g:3709:1: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 : ( ruleSimpleTypeCollection ) ;
    public final void rule__DefSimpleTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3713:1: ( ( ruleSimpleTypeCollection ) )
            // InternalBusinessDsl.g:3714:2: ( ruleSimpleTypeCollection )
            {
            // InternalBusinessDsl.g:3714:2: ( ruleSimpleTypeCollection )
            // InternalBusinessDsl.g:3715:3: ruleSimpleTypeCollection
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefSimpleTypeCollectionVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefSimpleTypeCollectionVariable__NameAssignment_1"
    // InternalBusinessDsl.g:3724:1: rule__DefSimpleTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3728:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3729:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3729:2: ( RULE_ID )
            // InternalBusinessDsl.g:3730:3: RULE_ID
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DefSimpleTypeCollectionVariable__NameAssignment_1"


    // $ANTLR start "rule__DefDtoTypeCollectionVariable__TypeAssignment_0"
    // InternalBusinessDsl.g:3739:1: rule__DefDtoTypeCollectionVariable__TypeAssignment_0 : ( ruleDtoTypeCollection ) ;
    public final void rule__DefDtoTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3743:1: ( ( ruleDtoTypeCollection ) )
            // InternalBusinessDsl.g:3744:2: ( ruleDtoTypeCollection )
            {
            // InternalBusinessDsl.g:3744:2: ( ruleDtoTypeCollection )
            // InternalBusinessDsl.g:3745:3: ruleDtoTypeCollection
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeDtoTypeCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDtoTypeCollection();

            state._fsp--;

             after(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeDtoTypeCollectionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefDtoTypeCollectionVariable__TypeAssignment_0"


    // $ANTLR start "rule__DefDtoTypeCollectionVariable__NameAssignment_1"
    // InternalBusinessDsl.g:3754:1: rule__DefDtoTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefDtoTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3758:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3759:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3759:2: ( RULE_ID )
            // InternalBusinessDsl.g:3760:3: RULE_ID
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DefDtoTypeCollectionVariable__NameAssignment_1"


    // $ANTLR start "rule__AllModelTypeCollection__CollectionAssignment_0"
    // InternalBusinessDsl.g:3769:1: rule__AllModelTypeCollection__CollectionAssignment_0 : ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__AllModelTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3773:1: ( ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalBusinessDsl.g:3774:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalBusinessDsl.g:3774:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalBusinessDsl.g:3775:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalBusinessDsl.g:3776:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            // InternalBusinessDsl.g:3776:4: rule__AllModelTypeCollection__CollectionAlternatives_0_0
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
    // InternalBusinessDsl.g:3784:1: rule__AllModelTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AllModelTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3788:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3789:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3789:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3790:3: ( RULE_ID )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0()); 
            // InternalBusinessDsl.g:3791:3: ( RULE_ID )
            // InternalBusinessDsl.g:3792:4: RULE_ID
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


    // $ANTLR start "rule__DtoTypeCollection__CollectionAssignment_0"
    // InternalBusinessDsl.g:3803:1: rule__DtoTypeCollection__CollectionAssignment_0 : ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__DtoTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3807:1: ( ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalBusinessDsl.g:3808:2: ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalBusinessDsl.g:3808:2: ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalBusinessDsl.g:3809:3: ( rule__DtoTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalBusinessDsl.g:3810:3: ( rule__DtoTypeCollection__CollectionAlternatives_0_0 )
            // InternalBusinessDsl.g:3810:4: rule__DtoTypeCollection__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DtoTypeCollection__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDtoTypeCollectionAccess().getCollectionAlternatives_0_0()); 

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
    // $ANTLR end "rule__DtoTypeCollection__CollectionAssignment_0"


    // $ANTLR start "rule__DtoTypeCollection__TypeAssignment_3"
    // InternalBusinessDsl.g:3818:1: rule__DtoTypeCollection__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DtoTypeCollection__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3822:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3823:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3823:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3824:3: ( RULE_ID )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getTypeDtoCrossReference_3_0()); 
            // InternalBusinessDsl.g:3825:3: ( RULE_ID )
            // InternalBusinessDsl.g:3826:4: RULE_ID
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getTypeDtoIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtoTypeCollectionAccess().getTypeDtoIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDtoTypeCollectionAccess().getTypeDtoCrossReference_3_0()); 

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
    // $ANTLR end "rule__DtoTypeCollection__TypeAssignment_3"


    // $ANTLR start "rule__SimpleTypeCollection__CollectionAssignment_0"
    // InternalBusinessDsl.g:3837:1: rule__SimpleTypeCollection__CollectionAssignment_0 : ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__SimpleTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3841:1: ( ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalBusinessDsl.g:3842:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalBusinessDsl.g:3842:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalBusinessDsl.g:3843:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalBusinessDsl.g:3844:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            // InternalBusinessDsl.g:3844:4: rule__SimpleTypeCollection__CollectionAlternatives_0_0
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
    // InternalBusinessDsl.g:3852:1: rule__SimpleTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3856:1: ( ( ruleType ) )
            // InternalBusinessDsl.g:3857:2: ( ruleType )
            {
            // InternalBusinessDsl.g:3857:2: ( ruleType )
            // InternalBusinessDsl.g:3858:3: ruleType
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000040000FFF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000040000FFF2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000044000FFF0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007F10L});

}