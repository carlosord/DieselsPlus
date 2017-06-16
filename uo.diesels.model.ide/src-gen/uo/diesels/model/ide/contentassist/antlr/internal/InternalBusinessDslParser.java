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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_LIST", "RULE_SET", "RULE_VOID", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_TYPE_BINARY", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'save'", "'update'", "'delete'", "'find'", "'Service'", "'{'", "'}'", "'('", "')'", "'<'", "'>'", "','", "'#'", "'finder'"
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
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=11;
    public static final int RULE_ID=16;
    public static final int RULE_WS=21;
    public static final int RULE_TYPE_FLOAT=10;
    public static final int RULE_TYPE_BINARY=15;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_TYPE_BOOLEAN=14;
    public static final int RULE_DATE=4;
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

                if ( (LA1_0==27) ) {
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
                else if ( (LA2_1==30) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_DATE && LA2_0<=RULE_TYPE_BINARY)||LA2_0==35) ) {
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
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
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
                    match(input,23,FOLLOW_2); 
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
                    match(input,24,FOLLOW_2); 
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
                    match(input,25,FOLLOW_2); 
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
                    match(input,26,FOLLOW_2); 
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
            case RULE_TYPE_BINARY:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 35:
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
            case RULE_TYPE_BINARY:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 35:
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

                if ( (LA6_1==32) ) {
                    switch ( input.LA(3) ) {
                    case 35:
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
                    case RULE_TYPE_BINARY:
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

                if ( (LA6_2==32) ) {
                    switch ( input.LA(3) ) {
                    case 35:
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
                    case RULE_TYPE_BINARY:
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

                if ( (LA7_1==32) ) {
                    switch ( input.LA(3) ) {
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
                        alt7=3;
                        }
                        break;
                    case 35:
                        {
                        alt7=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt7=1;
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

                if ( (LA7_2==32) ) {
                    switch ( input.LA(3) ) {
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
                        alt7=3;
                        }
                        break;
                    case 35:
                        {
                        alt7=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt7=1;
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

            if ( (LA11_0==RULE_DATE||(LA11_0>=RULE_TYPE_INT && LA11_0<=RULE_TYPE_BINARY)) ) {
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

            if ( ((LA12_0>=RULE_TYPE_INT && LA12_0<=RULE_TYPE_BINARY)) ) {
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
    // InternalBusinessDsl.g:956:1: rule__BasicType__Alternatives : ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:960:1: ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) )
            int alt13=8;
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
            case RULE_TYPE_BINARY:
                {
                alt13=8;
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
                case 8 :
                    // InternalBusinessDsl.g:1003:2: ( RULE_TYPE_BINARY )
                    {
                    // InternalBusinessDsl.g:1003:2: ( RULE_TYPE_BINARY )
                    // InternalBusinessDsl.g:1004:3: RULE_TYPE_BINARY
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


    // $ANTLR start "rule__Service__Group__0"
    // InternalBusinessDsl.g:1013:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1017:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalBusinessDsl.g:1018:2: rule__Service__Group__0__Impl rule__Service__Group__1
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
    // InternalBusinessDsl.g:1025:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1029:1: ( ( 'Service' ) )
            // InternalBusinessDsl.g:1030:1: ( 'Service' )
            {
            // InternalBusinessDsl.g:1030:1: ( 'Service' )
            // InternalBusinessDsl.g:1031:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1040:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1044:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalBusinessDsl.g:1045:2: rule__Service__Group__1__Impl rule__Service__Group__2
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
    // InternalBusinessDsl.g:1052:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1056:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:1057:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:1057:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalBusinessDsl.g:1058:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:1059:2: ( rule__Service__NameAssignment_1 )
            // InternalBusinessDsl.g:1059:3: rule__Service__NameAssignment_1
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
    // InternalBusinessDsl.g:1067:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1071:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalBusinessDsl.g:1072:2: rule__Service__Group__2__Impl rule__Service__Group__3
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
    // InternalBusinessDsl.g:1079:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1083:1: ( ( '{' ) )
            // InternalBusinessDsl.g:1084:1: ( '{' )
            {
            // InternalBusinessDsl.g:1084:1: ( '{' )
            // InternalBusinessDsl.g:1085:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1094:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1098:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalBusinessDsl.g:1099:2: rule__Service__Group__3__Impl rule__Service__Group__4
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
    // InternalBusinessDsl.g:1106:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1110:1: ( ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) ) )
            // InternalBusinessDsl.g:1111:1: ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) )
            {
            // InternalBusinessDsl.g:1111:1: ( ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* ) )
            // InternalBusinessDsl.g:1112:2: ( ( rule__Service__MethodsAssignment_3 ) ) ( ( rule__Service__MethodsAssignment_3 )* )
            {
            // InternalBusinessDsl.g:1112:2: ( ( rule__Service__MethodsAssignment_3 ) )
            // InternalBusinessDsl.g:1113:3: ( rule__Service__MethodsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 
            // InternalBusinessDsl.g:1114:3: ( rule__Service__MethodsAssignment_3 )
            // InternalBusinessDsl.g:1114:4: rule__Service__MethodsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Service__MethodsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 

            }

            // InternalBusinessDsl.g:1117:2: ( ( rule__Service__MethodsAssignment_3 )* )
            // InternalBusinessDsl.g:1118:3: ( rule__Service__MethodsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 
            // InternalBusinessDsl.g:1119:3: ( rule__Service__MethodsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_DATE && LA14_0<=RULE_ID)||LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBusinessDsl.g:1119:4: rule__Service__MethodsAssignment_3
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
    // InternalBusinessDsl.g:1128:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1132:1: ( rule__Service__Group__4__Impl )
            // InternalBusinessDsl.g:1133:2: rule__Service__Group__4__Impl
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
    // InternalBusinessDsl.g:1139:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1143:1: ( ( '}' ) )
            // InternalBusinessDsl.g:1144:1: ( '}' )
            {
            // InternalBusinessDsl.g:1144:1: ( '}' )
            // InternalBusinessDsl.g:1145:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1155:1: rule__JpaMethod__Group__0 : rule__JpaMethod__Group__0__Impl rule__JpaMethod__Group__1 ;
    public final void rule__JpaMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1159:1: ( rule__JpaMethod__Group__0__Impl rule__JpaMethod__Group__1 )
            // InternalBusinessDsl.g:1160:2: rule__JpaMethod__Group__0__Impl rule__JpaMethod__Group__1
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
    // InternalBusinessDsl.g:1167:1: rule__JpaMethod__Group__0__Impl : ( ( rule__JpaMethod__NameAssignment_0 ) ) ;
    public final void rule__JpaMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1171:1: ( ( ( rule__JpaMethod__NameAssignment_0 ) ) )
            // InternalBusinessDsl.g:1172:1: ( ( rule__JpaMethod__NameAssignment_0 ) )
            {
            // InternalBusinessDsl.g:1172:1: ( ( rule__JpaMethod__NameAssignment_0 ) )
            // InternalBusinessDsl.g:1173:2: ( rule__JpaMethod__NameAssignment_0 )
            {
             before(grammarAccess.getJpaMethodAccess().getNameAssignment_0()); 
            // InternalBusinessDsl.g:1174:2: ( rule__JpaMethod__NameAssignment_0 )
            // InternalBusinessDsl.g:1174:3: rule__JpaMethod__NameAssignment_0
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
    // InternalBusinessDsl.g:1182:1: rule__JpaMethod__Group__1 : rule__JpaMethod__Group__1__Impl rule__JpaMethod__Group__2 ;
    public final void rule__JpaMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1186:1: ( rule__JpaMethod__Group__1__Impl rule__JpaMethod__Group__2 )
            // InternalBusinessDsl.g:1187:2: rule__JpaMethod__Group__1__Impl rule__JpaMethod__Group__2
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
    // InternalBusinessDsl.g:1194:1: rule__JpaMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__JpaMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1198:1: ( ( '(' ) )
            // InternalBusinessDsl.g:1199:1: ( '(' )
            {
            // InternalBusinessDsl.g:1199:1: ( '(' )
            // InternalBusinessDsl.g:1200:2: '('
            {
             before(grammarAccess.getJpaMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1209:1: rule__JpaMethod__Group__2 : rule__JpaMethod__Group__2__Impl rule__JpaMethod__Group__3 ;
    public final void rule__JpaMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1213:1: ( rule__JpaMethod__Group__2__Impl rule__JpaMethod__Group__3 )
            // InternalBusinessDsl.g:1214:2: rule__JpaMethod__Group__2__Impl rule__JpaMethod__Group__3
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
    // InternalBusinessDsl.g:1221:1: rule__JpaMethod__Group__2__Impl : ( ')' ) ;
    public final void rule__JpaMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1225:1: ( ( ')' ) )
            // InternalBusinessDsl.g:1226:1: ( ')' )
            {
            // InternalBusinessDsl.g:1226:1: ( ')' )
            // InternalBusinessDsl.g:1227:2: ')'
            {
             before(grammarAccess.getJpaMethodAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1236:1: rule__JpaMethod__Group__3 : rule__JpaMethod__Group__3__Impl rule__JpaMethod__Group__4 ;
    public final void rule__JpaMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1240:1: ( rule__JpaMethod__Group__3__Impl rule__JpaMethod__Group__4 )
            // InternalBusinessDsl.g:1241:2: rule__JpaMethod__Group__3__Impl rule__JpaMethod__Group__4
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
    // InternalBusinessDsl.g:1248:1: rule__JpaMethod__Group__3__Impl : ( ( rule__JpaMethod__KeywordAssignment_3 ) ) ;
    public final void rule__JpaMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1252:1: ( ( ( rule__JpaMethod__KeywordAssignment_3 ) ) )
            // InternalBusinessDsl.g:1253:1: ( ( rule__JpaMethod__KeywordAssignment_3 ) )
            {
            // InternalBusinessDsl.g:1253:1: ( ( rule__JpaMethod__KeywordAssignment_3 ) )
            // InternalBusinessDsl.g:1254:2: ( rule__JpaMethod__KeywordAssignment_3 )
            {
             before(grammarAccess.getJpaMethodAccess().getKeywordAssignment_3()); 
            // InternalBusinessDsl.g:1255:2: ( rule__JpaMethod__KeywordAssignment_3 )
            // InternalBusinessDsl.g:1255:3: rule__JpaMethod__KeywordAssignment_3
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
    // InternalBusinessDsl.g:1263:1: rule__JpaMethod__Group__4 : rule__JpaMethod__Group__4__Impl rule__JpaMethod__Group__5 ;
    public final void rule__JpaMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1267:1: ( rule__JpaMethod__Group__4__Impl rule__JpaMethod__Group__5 )
            // InternalBusinessDsl.g:1268:2: rule__JpaMethod__Group__4__Impl rule__JpaMethod__Group__5
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
    // InternalBusinessDsl.g:1275:1: rule__JpaMethod__Group__4__Impl : ( '<' ) ;
    public final void rule__JpaMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1279:1: ( ( '<' ) )
            // InternalBusinessDsl.g:1280:1: ( '<' )
            {
            // InternalBusinessDsl.g:1280:1: ( '<' )
            // InternalBusinessDsl.g:1281:2: '<'
            {
             before(grammarAccess.getJpaMethodAccess().getLessThanSignKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1290:1: rule__JpaMethod__Group__5 : rule__JpaMethod__Group__5__Impl rule__JpaMethod__Group__6 ;
    public final void rule__JpaMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1294:1: ( rule__JpaMethod__Group__5__Impl rule__JpaMethod__Group__6 )
            // InternalBusinessDsl.g:1295:2: rule__JpaMethod__Group__5__Impl rule__JpaMethod__Group__6
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
    // InternalBusinessDsl.g:1302:1: rule__JpaMethod__Group__5__Impl : ( ( rule__JpaMethod__EntityAssignment_5 ) ) ;
    public final void rule__JpaMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1306:1: ( ( ( rule__JpaMethod__EntityAssignment_5 ) ) )
            // InternalBusinessDsl.g:1307:1: ( ( rule__JpaMethod__EntityAssignment_5 ) )
            {
            // InternalBusinessDsl.g:1307:1: ( ( rule__JpaMethod__EntityAssignment_5 ) )
            // InternalBusinessDsl.g:1308:2: ( rule__JpaMethod__EntityAssignment_5 )
            {
             before(grammarAccess.getJpaMethodAccess().getEntityAssignment_5()); 
            // InternalBusinessDsl.g:1309:2: ( rule__JpaMethod__EntityAssignment_5 )
            // InternalBusinessDsl.g:1309:3: rule__JpaMethod__EntityAssignment_5
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
    // InternalBusinessDsl.g:1317:1: rule__JpaMethod__Group__6 : rule__JpaMethod__Group__6__Impl ;
    public final void rule__JpaMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1321:1: ( rule__JpaMethod__Group__6__Impl )
            // InternalBusinessDsl.g:1322:2: rule__JpaMethod__Group__6__Impl
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
    // InternalBusinessDsl.g:1328:1: rule__JpaMethod__Group__6__Impl : ( '>' ) ;
    public final void rule__JpaMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1332:1: ( ( '>' ) )
            // InternalBusinessDsl.g:1333:1: ( '>' )
            {
            // InternalBusinessDsl.g:1333:1: ( '>' )
            // InternalBusinessDsl.g:1334:2: '>'
            {
             before(grammarAccess.getJpaMethodAccess().getGreaterThanSignKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1344:1: rule__FinderUserMethod__Group__0 : rule__FinderUserMethod__Group__0__Impl rule__FinderUserMethod__Group__1 ;
    public final void rule__FinderUserMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1348:1: ( rule__FinderUserMethod__Group__0__Impl rule__FinderUserMethod__Group__1 )
            // InternalBusinessDsl.g:1349:2: rule__FinderUserMethod__Group__0__Impl rule__FinderUserMethod__Group__1
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
    // InternalBusinessDsl.g:1356:1: rule__FinderUserMethod__Group__0__Impl : ( ( rule__FinderUserMethod__Alternatives_0 ) ) ;
    public final void rule__FinderUserMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1360:1: ( ( ( rule__FinderUserMethod__Alternatives_0 ) ) )
            // InternalBusinessDsl.g:1361:1: ( ( rule__FinderUserMethod__Alternatives_0 ) )
            {
            // InternalBusinessDsl.g:1361:1: ( ( rule__FinderUserMethod__Alternatives_0 ) )
            // InternalBusinessDsl.g:1362:2: ( rule__FinderUserMethod__Alternatives_0 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getAlternatives_0()); 
            // InternalBusinessDsl.g:1363:2: ( rule__FinderUserMethod__Alternatives_0 )
            // InternalBusinessDsl.g:1363:3: rule__FinderUserMethod__Alternatives_0
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
    // InternalBusinessDsl.g:1371:1: rule__FinderUserMethod__Group__1 : rule__FinderUserMethod__Group__1__Impl ;
    public final void rule__FinderUserMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1375:1: ( rule__FinderUserMethod__Group__1__Impl )
            // InternalBusinessDsl.g:1376:2: rule__FinderUserMethod__Group__1__Impl
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
    // InternalBusinessDsl.g:1382:1: rule__FinderUserMethod__Group__1__Impl : ( ( rule__FinderUserMethod__Group_1__0 )? ) ;
    public final void rule__FinderUserMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1386:1: ( ( ( rule__FinderUserMethod__Group_1__0 )? ) )
            // InternalBusinessDsl.g:1387:1: ( ( rule__FinderUserMethod__Group_1__0 )? )
            {
            // InternalBusinessDsl.g:1387:1: ( ( rule__FinderUserMethod__Group_1__0 )? )
            // InternalBusinessDsl.g:1388:2: ( rule__FinderUserMethod__Group_1__0 )?
            {
             before(grammarAccess.getFinderUserMethodAccess().getGroup_1()); 
            // InternalBusinessDsl.g:1389:2: ( rule__FinderUserMethod__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBusinessDsl.g:1389:3: rule__FinderUserMethod__Group_1__0
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
    // InternalBusinessDsl.g:1398:1: rule__FinderUserMethod__Group_1__0 : rule__FinderUserMethod__Group_1__0__Impl rule__FinderUserMethod__Group_1__1 ;
    public final void rule__FinderUserMethod__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1402:1: ( rule__FinderUserMethod__Group_1__0__Impl rule__FinderUserMethod__Group_1__1 )
            // InternalBusinessDsl.g:1403:2: rule__FinderUserMethod__Group_1__0__Impl rule__FinderUserMethod__Group_1__1
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
    // InternalBusinessDsl.g:1410:1: rule__FinderUserMethod__Group_1__0__Impl : ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) ) ;
    public final void rule__FinderUserMethod__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1414:1: ( ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) ) )
            // InternalBusinessDsl.g:1415:1: ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) )
            {
            // InternalBusinessDsl.g:1415:1: ( ( rule__FinderUserMethod__KeywordAssignment_1_0 ) )
            // InternalBusinessDsl.g:1416:2: ( rule__FinderUserMethod__KeywordAssignment_1_0 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getKeywordAssignment_1_0()); 
            // InternalBusinessDsl.g:1417:2: ( rule__FinderUserMethod__KeywordAssignment_1_0 )
            // InternalBusinessDsl.g:1417:3: rule__FinderUserMethod__KeywordAssignment_1_0
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
    // InternalBusinessDsl.g:1425:1: rule__FinderUserMethod__Group_1__1 : rule__FinderUserMethod__Group_1__1__Impl rule__FinderUserMethod__Group_1__2 ;
    public final void rule__FinderUserMethod__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1429:1: ( rule__FinderUserMethod__Group_1__1__Impl rule__FinderUserMethod__Group_1__2 )
            // InternalBusinessDsl.g:1430:2: rule__FinderUserMethod__Group_1__1__Impl rule__FinderUserMethod__Group_1__2
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
    // InternalBusinessDsl.g:1437:1: rule__FinderUserMethod__Group_1__1__Impl : ( '<' ) ;
    public final void rule__FinderUserMethod__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1441:1: ( ( '<' ) )
            // InternalBusinessDsl.g:1442:1: ( '<' )
            {
            // InternalBusinessDsl.g:1442:1: ( '<' )
            // InternalBusinessDsl.g:1443:2: '<'
            {
             before(grammarAccess.getFinderUserMethodAccess().getLessThanSignKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1452:1: rule__FinderUserMethod__Group_1__2 : rule__FinderUserMethod__Group_1__2__Impl rule__FinderUserMethod__Group_1__3 ;
    public final void rule__FinderUserMethod__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1456:1: ( rule__FinderUserMethod__Group_1__2__Impl rule__FinderUserMethod__Group_1__3 )
            // InternalBusinessDsl.g:1457:2: rule__FinderUserMethod__Group_1__2__Impl rule__FinderUserMethod__Group_1__3
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
    // InternalBusinessDsl.g:1464:1: rule__FinderUserMethod__Group_1__2__Impl : ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) ) ;
    public final void rule__FinderUserMethod__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1468:1: ( ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) ) )
            // InternalBusinessDsl.g:1469:1: ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) )
            {
            // InternalBusinessDsl.g:1469:1: ( ( rule__FinderUserMethod__FinderAssignment_1_2 ) )
            // InternalBusinessDsl.g:1470:2: ( rule__FinderUserMethod__FinderAssignment_1_2 )
            {
             before(grammarAccess.getFinderUserMethodAccess().getFinderAssignment_1_2()); 
            // InternalBusinessDsl.g:1471:2: ( rule__FinderUserMethod__FinderAssignment_1_2 )
            // InternalBusinessDsl.g:1471:3: rule__FinderUserMethod__FinderAssignment_1_2
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
    // InternalBusinessDsl.g:1479:1: rule__FinderUserMethod__Group_1__3 : rule__FinderUserMethod__Group_1__3__Impl ;
    public final void rule__FinderUserMethod__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1483:1: ( rule__FinderUserMethod__Group_1__3__Impl )
            // InternalBusinessDsl.g:1484:2: rule__FinderUserMethod__Group_1__3__Impl
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
    // InternalBusinessDsl.g:1490:1: rule__FinderUserMethod__Group_1__3__Impl : ( '>' ) ;
    public final void rule__FinderUserMethod__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1494:1: ( ( '>' ) )
            // InternalBusinessDsl.g:1495:1: ( '>' )
            {
            // InternalBusinessDsl.g:1495:1: ( '>' )
            // InternalBusinessDsl.g:1496:2: '>'
            {
             before(grammarAccess.getFinderUserMethodAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1506:1: rule__MethodSimpleReturn__Group__0 : rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 ;
    public final void rule__MethodSimpleReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1510:1: ( rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 )
            // InternalBusinessDsl.g:1511:2: rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1
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
    // InternalBusinessDsl.g:1518:1: rule__MethodSimpleReturn__Group__0__Impl : ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1522:1: ( ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:1523:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:1523:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            // InternalBusinessDsl.g:1524:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0()); 
            // InternalBusinessDsl.g:1525:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            // InternalBusinessDsl.g:1525:3: rule__MethodSimpleReturn__ReturnTypeAssignment_0
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
    // InternalBusinessDsl.g:1533:1: rule__MethodSimpleReturn__Group__1 : rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 ;
    public final void rule__MethodSimpleReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1537:1: ( rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 )
            // InternalBusinessDsl.g:1538:2: rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2
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
    // InternalBusinessDsl.g:1545:1: rule__MethodSimpleReturn__Group__1__Impl : ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1549:1: ( ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:1550:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:1550:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            // InternalBusinessDsl.g:1551:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:1552:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            // InternalBusinessDsl.g:1552:3: rule__MethodSimpleReturn__NameAssignment_1
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
    // InternalBusinessDsl.g:1560:1: rule__MethodSimpleReturn__Group__2 : rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 ;
    public final void rule__MethodSimpleReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1564:1: ( rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 )
            // InternalBusinessDsl.g:1565:2: rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3
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
    // InternalBusinessDsl.g:1572:1: rule__MethodSimpleReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodSimpleReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1576:1: ( ( '(' ) )
            // InternalBusinessDsl.g:1577:1: ( '(' )
            {
            // InternalBusinessDsl.g:1577:1: ( '(' )
            // InternalBusinessDsl.g:1578:2: '('
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1587:1: rule__MethodSimpleReturn__Group__3 : rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 ;
    public final void rule__MethodSimpleReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1591:1: ( rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 )
            // InternalBusinessDsl.g:1592:2: rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4
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
    // InternalBusinessDsl.g:1599:1: rule__MethodSimpleReturn__Group__3__Impl : ( ( rule__MethodSimpleReturn__Group_3__0 )? ) ;
    public final void rule__MethodSimpleReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1603:1: ( ( ( rule__MethodSimpleReturn__Group_3__0 )? ) )
            // InternalBusinessDsl.g:1604:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            {
            // InternalBusinessDsl.g:1604:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            // InternalBusinessDsl.g:1605:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3()); 
            // InternalBusinessDsl.g:1606:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_DATE && LA16_0<=RULE_SET)||(LA16_0>=RULE_TYPE_INT && LA16_0<=RULE_ID)||LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBusinessDsl.g:1606:3: rule__MethodSimpleReturn__Group_3__0
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
    // InternalBusinessDsl.g:1614:1: rule__MethodSimpleReturn__Group__4 : rule__MethodSimpleReturn__Group__4__Impl ;
    public final void rule__MethodSimpleReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1618:1: ( rule__MethodSimpleReturn__Group__4__Impl )
            // InternalBusinessDsl.g:1619:2: rule__MethodSimpleReturn__Group__4__Impl
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
    // InternalBusinessDsl.g:1625:1: rule__MethodSimpleReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodSimpleReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1629:1: ( ( ')' ) )
            // InternalBusinessDsl.g:1630:1: ( ')' )
            {
            // InternalBusinessDsl.g:1630:1: ( ')' )
            // InternalBusinessDsl.g:1631:2: ')'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1641:1: rule__MethodSimpleReturn__Group_3__0 : rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 ;
    public final void rule__MethodSimpleReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1645:1: ( rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 )
            // InternalBusinessDsl.g:1646:2: rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1
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
    // InternalBusinessDsl.g:1653:1: rule__MethodSimpleReturn__Group_3__0__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1657:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) )
            // InternalBusinessDsl.g:1658:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            {
            // InternalBusinessDsl.g:1658:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            // InternalBusinessDsl.g:1659:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0()); 
            // InternalBusinessDsl.g:1660:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            // InternalBusinessDsl.g:1660:3: rule__MethodSimpleReturn__ParametersAssignment_3_0
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
    // InternalBusinessDsl.g:1668:1: rule__MethodSimpleReturn__Group_3__1 : rule__MethodSimpleReturn__Group_3__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1672:1: ( rule__MethodSimpleReturn__Group_3__1__Impl )
            // InternalBusinessDsl.g:1673:2: rule__MethodSimpleReturn__Group_3__1__Impl
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
    // InternalBusinessDsl.g:1679:1: rule__MethodSimpleReturn__Group_3__1__Impl : ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodSimpleReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1683:1: ( ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) )
            // InternalBusinessDsl.g:1684:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            {
            // InternalBusinessDsl.g:1684:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            // InternalBusinessDsl.g:1685:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1()); 
            // InternalBusinessDsl.g:1686:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBusinessDsl.g:1686:3: rule__MethodSimpleReturn__Group_3_1__0
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
    // InternalBusinessDsl.g:1695:1: rule__MethodSimpleReturn__Group_3_1__0 : rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 ;
    public final void rule__MethodSimpleReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1699:1: ( rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 )
            // InternalBusinessDsl.g:1700:2: rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1
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
    // InternalBusinessDsl.g:1707:1: rule__MethodSimpleReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1711:1: ( ( ',' ) )
            // InternalBusinessDsl.g:1712:1: ( ',' )
            {
            // InternalBusinessDsl.g:1712:1: ( ',' )
            // InternalBusinessDsl.g:1713:2: ','
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1722:1: rule__MethodSimpleReturn__Group_3_1__1 : rule__MethodSimpleReturn__Group_3_1__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1726:1: ( rule__MethodSimpleReturn__Group_3_1__1__Impl )
            // InternalBusinessDsl.g:1727:2: rule__MethodSimpleReturn__Group_3_1__1__Impl
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
    // InternalBusinessDsl.g:1733:1: rule__MethodSimpleReturn__Group_3_1__1__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1737:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalBusinessDsl.g:1738:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalBusinessDsl.g:1738:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            // InternalBusinessDsl.g:1739:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalBusinessDsl.g:1740:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            // InternalBusinessDsl.g:1740:3: rule__MethodSimpleReturn__ParametersAssignment_3_1_1
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
    // InternalBusinessDsl.g:1749:1: rule__MethodAllModelReturn__Group__0 : rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1 ;
    public final void rule__MethodAllModelReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1753:1: ( rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1 )
            // InternalBusinessDsl.g:1754:2: rule__MethodAllModelReturn__Group__0__Impl rule__MethodAllModelReturn__Group__1
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
    // InternalBusinessDsl.g:1761:1: rule__MethodAllModelReturn__Group__0__Impl : ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodAllModelReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1765:1: ( ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:1766:1: ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:1766:1: ( ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 ) )
            // InternalBusinessDsl.g:1767:2: ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAssignment_0()); 
            // InternalBusinessDsl.g:1768:2: ( rule__MethodAllModelReturn__ReturnTypeAssignment_0 )
            // InternalBusinessDsl.g:1768:3: rule__MethodAllModelReturn__ReturnTypeAssignment_0
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
    // InternalBusinessDsl.g:1776:1: rule__MethodAllModelReturn__Group__1 : rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2 ;
    public final void rule__MethodAllModelReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1780:1: ( rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2 )
            // InternalBusinessDsl.g:1781:2: rule__MethodAllModelReturn__Group__1__Impl rule__MethodAllModelReturn__Group__2
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
    // InternalBusinessDsl.g:1788:1: rule__MethodAllModelReturn__Group__1__Impl : ( ( rule__MethodAllModelReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodAllModelReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1792:1: ( ( ( rule__MethodAllModelReturn__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:1793:1: ( ( rule__MethodAllModelReturn__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:1793:1: ( ( rule__MethodAllModelReturn__NameAssignment_1 ) )
            // InternalBusinessDsl.g:1794:2: ( rule__MethodAllModelReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:1795:2: ( rule__MethodAllModelReturn__NameAssignment_1 )
            // InternalBusinessDsl.g:1795:3: rule__MethodAllModelReturn__NameAssignment_1
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
    // InternalBusinessDsl.g:1803:1: rule__MethodAllModelReturn__Group__2 : rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3 ;
    public final void rule__MethodAllModelReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1807:1: ( rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3 )
            // InternalBusinessDsl.g:1808:2: rule__MethodAllModelReturn__Group__2__Impl rule__MethodAllModelReturn__Group__3
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
    // InternalBusinessDsl.g:1815:1: rule__MethodAllModelReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodAllModelReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1819:1: ( ( '(' ) )
            // InternalBusinessDsl.g:1820:1: ( '(' )
            {
            // InternalBusinessDsl.g:1820:1: ( '(' )
            // InternalBusinessDsl.g:1821:2: '('
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1830:1: rule__MethodAllModelReturn__Group__3 : rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4 ;
    public final void rule__MethodAllModelReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1834:1: ( rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4 )
            // InternalBusinessDsl.g:1835:2: rule__MethodAllModelReturn__Group__3__Impl rule__MethodAllModelReturn__Group__4
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
    // InternalBusinessDsl.g:1842:1: rule__MethodAllModelReturn__Group__3__Impl : ( ( rule__MethodAllModelReturn__Group_3__0 )? ) ;
    public final void rule__MethodAllModelReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1846:1: ( ( ( rule__MethodAllModelReturn__Group_3__0 )? ) )
            // InternalBusinessDsl.g:1847:1: ( ( rule__MethodAllModelReturn__Group_3__0 )? )
            {
            // InternalBusinessDsl.g:1847:1: ( ( rule__MethodAllModelReturn__Group_3__0 )? )
            // InternalBusinessDsl.g:1848:2: ( rule__MethodAllModelReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup_3()); 
            // InternalBusinessDsl.g:1849:2: ( rule__MethodAllModelReturn__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_DATE && LA18_0<=RULE_SET)||(LA18_0>=RULE_TYPE_INT && LA18_0<=RULE_ID)||LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBusinessDsl.g:1849:3: rule__MethodAllModelReturn__Group_3__0
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
    // InternalBusinessDsl.g:1857:1: rule__MethodAllModelReturn__Group__4 : rule__MethodAllModelReturn__Group__4__Impl ;
    public final void rule__MethodAllModelReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1861:1: ( rule__MethodAllModelReturn__Group__4__Impl )
            // InternalBusinessDsl.g:1862:2: rule__MethodAllModelReturn__Group__4__Impl
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
    // InternalBusinessDsl.g:1868:1: rule__MethodAllModelReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodAllModelReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1872:1: ( ( ')' ) )
            // InternalBusinessDsl.g:1873:1: ( ')' )
            {
            // InternalBusinessDsl.g:1873:1: ( ')' )
            // InternalBusinessDsl.g:1874:2: ')'
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1884:1: rule__MethodAllModelReturn__Group_3__0 : rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1 ;
    public final void rule__MethodAllModelReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1888:1: ( rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1 )
            // InternalBusinessDsl.g:1889:2: rule__MethodAllModelReturn__Group_3__0__Impl rule__MethodAllModelReturn__Group_3__1
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
    // InternalBusinessDsl.g:1896:1: rule__MethodAllModelReturn__Group_3__0__Impl : ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodAllModelReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1900:1: ( ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) ) )
            // InternalBusinessDsl.g:1901:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) )
            {
            // InternalBusinessDsl.g:1901:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_0 ) )
            // InternalBusinessDsl.g:1902:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_0()); 
            // InternalBusinessDsl.g:1903:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_0 )
            // InternalBusinessDsl.g:1903:3: rule__MethodAllModelReturn__ParametersAssignment_3_0
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
    // InternalBusinessDsl.g:1911:1: rule__MethodAllModelReturn__Group_3__1 : rule__MethodAllModelReturn__Group_3__1__Impl ;
    public final void rule__MethodAllModelReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1915:1: ( rule__MethodAllModelReturn__Group_3__1__Impl )
            // InternalBusinessDsl.g:1916:2: rule__MethodAllModelReturn__Group_3__1__Impl
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
    // InternalBusinessDsl.g:1922:1: rule__MethodAllModelReturn__Group_3__1__Impl : ( ( rule__MethodAllModelReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodAllModelReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1926:1: ( ( ( rule__MethodAllModelReturn__Group_3_1__0 )* ) )
            // InternalBusinessDsl.g:1927:1: ( ( rule__MethodAllModelReturn__Group_3_1__0 )* )
            {
            // InternalBusinessDsl.g:1927:1: ( ( rule__MethodAllModelReturn__Group_3_1__0 )* )
            // InternalBusinessDsl.g:1928:2: ( rule__MethodAllModelReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getGroup_3_1()); 
            // InternalBusinessDsl.g:1929:2: ( rule__MethodAllModelReturn__Group_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBusinessDsl.g:1929:3: rule__MethodAllModelReturn__Group_3_1__0
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
    // InternalBusinessDsl.g:1938:1: rule__MethodAllModelReturn__Group_3_1__0 : rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1 ;
    public final void rule__MethodAllModelReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1942:1: ( rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1 )
            // InternalBusinessDsl.g:1943:2: rule__MethodAllModelReturn__Group_3_1__0__Impl rule__MethodAllModelReturn__Group_3_1__1
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
    // InternalBusinessDsl.g:1950:1: rule__MethodAllModelReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodAllModelReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1954:1: ( ( ',' ) )
            // InternalBusinessDsl.g:1955:1: ( ',' )
            {
            // InternalBusinessDsl.g:1955:1: ( ',' )
            // InternalBusinessDsl.g:1956:2: ','
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBusinessDsl.g:1965:1: rule__MethodAllModelReturn__Group_3_1__1 : rule__MethodAllModelReturn__Group_3_1__1__Impl ;
    public final void rule__MethodAllModelReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1969:1: ( rule__MethodAllModelReturn__Group_3_1__1__Impl )
            // InternalBusinessDsl.g:1970:2: rule__MethodAllModelReturn__Group_3_1__1__Impl
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
    // InternalBusinessDsl.g:1976:1: rule__MethodAllModelReturn__Group_3_1__1__Impl : ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodAllModelReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1980:1: ( ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalBusinessDsl.g:1981:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalBusinessDsl.g:1981:1: ( ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 ) )
            // InternalBusinessDsl.g:1982:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalBusinessDsl.g:1983:2: ( rule__MethodAllModelReturn__ParametersAssignment_3_1_1 )
            // InternalBusinessDsl.g:1983:3: rule__MethodAllModelReturn__ParametersAssignment_3_1_1
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
    // InternalBusinessDsl.g:1992:1: rule__MethodDtoReturn__Group__0 : rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 ;
    public final void rule__MethodDtoReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:1996:1: ( rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 )
            // InternalBusinessDsl.g:1997:2: rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1
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
    // InternalBusinessDsl.g:2004:1: rule__MethodDtoReturn__Group__0__Impl : ( '#' ) ;
    public final void rule__MethodDtoReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2008:1: ( ( '#' ) )
            // InternalBusinessDsl.g:2009:1: ( '#' )
            {
            // InternalBusinessDsl.g:2009:1: ( '#' )
            // InternalBusinessDsl.g:2010:2: '#'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2019:1: rule__MethodDtoReturn__Group__1 : rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 ;
    public final void rule__MethodDtoReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2023:1: ( rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 )
            // InternalBusinessDsl.g:2024:2: rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2
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
    // InternalBusinessDsl.g:2031:1: rule__MethodDtoReturn__Group__1__Impl : ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodDtoReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2035:1: ( ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) )
            // InternalBusinessDsl.g:2036:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2036:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            // InternalBusinessDsl.g:2037:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeAssignment_1()); 
            // InternalBusinessDsl.g:2038:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            // InternalBusinessDsl.g:2038:3: rule__MethodDtoReturn__ReturnTypeAssignment_1
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
    // InternalBusinessDsl.g:2046:1: rule__MethodDtoReturn__Group__2 : rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 ;
    public final void rule__MethodDtoReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2050:1: ( rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 )
            // InternalBusinessDsl.g:2051:2: rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3
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
    // InternalBusinessDsl.g:2058:1: rule__MethodDtoReturn__Group__2__Impl : ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) ;
    public final void rule__MethodDtoReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2062:1: ( ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) )
            // InternalBusinessDsl.g:2063:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            {
            // InternalBusinessDsl.g:2063:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            // InternalBusinessDsl.g:2064:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNameAssignment_2()); 
            // InternalBusinessDsl.g:2065:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            // InternalBusinessDsl.g:2065:3: rule__MethodDtoReturn__NameAssignment_2
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
    // InternalBusinessDsl.g:2073:1: rule__MethodDtoReturn__Group__3 : rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 ;
    public final void rule__MethodDtoReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2077:1: ( rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 )
            // InternalBusinessDsl.g:2078:2: rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4
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
    // InternalBusinessDsl.g:2085:1: rule__MethodDtoReturn__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDtoReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2089:1: ( ( '(' ) )
            // InternalBusinessDsl.g:2090:1: ( '(' )
            {
            // InternalBusinessDsl.g:2090:1: ( '(' )
            // InternalBusinessDsl.g:2091:2: '('
            {
             before(grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2100:1: rule__MethodDtoReturn__Group__4 : rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 ;
    public final void rule__MethodDtoReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2104:1: ( rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 )
            // InternalBusinessDsl.g:2105:2: rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5
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
    // InternalBusinessDsl.g:2112:1: rule__MethodDtoReturn__Group__4__Impl : ( ( rule__MethodDtoReturn__Group_4__0 )? ) ;
    public final void rule__MethodDtoReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2116:1: ( ( ( rule__MethodDtoReturn__Group_4__0 )? ) )
            // InternalBusinessDsl.g:2117:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            {
            // InternalBusinessDsl.g:2117:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            // InternalBusinessDsl.g:2118:2: ( rule__MethodDtoReturn__Group_4__0 )?
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4()); 
            // InternalBusinessDsl.g:2119:2: ( rule__MethodDtoReturn__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_DATE && LA20_0<=RULE_SET)||(LA20_0>=RULE_TYPE_INT && LA20_0<=RULE_ID)||LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBusinessDsl.g:2119:3: rule__MethodDtoReturn__Group_4__0
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
    // InternalBusinessDsl.g:2127:1: rule__MethodDtoReturn__Group__5 : rule__MethodDtoReturn__Group__5__Impl ;
    public final void rule__MethodDtoReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2131:1: ( rule__MethodDtoReturn__Group__5__Impl )
            // InternalBusinessDsl.g:2132:2: rule__MethodDtoReturn__Group__5__Impl
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
    // InternalBusinessDsl.g:2138:1: rule__MethodDtoReturn__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDtoReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2142:1: ( ( ')' ) )
            // InternalBusinessDsl.g:2143:1: ( ')' )
            {
            // InternalBusinessDsl.g:2143:1: ( ')' )
            // InternalBusinessDsl.g:2144:2: ')'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2154:1: rule__MethodDtoReturn__Group_4__0 : rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 ;
    public final void rule__MethodDtoReturn__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2158:1: ( rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 )
            // InternalBusinessDsl.g:2159:2: rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1
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
    // InternalBusinessDsl.g:2166:1: rule__MethodDtoReturn__Group_4__0__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) ;
    public final void rule__MethodDtoReturn__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2170:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) )
            // InternalBusinessDsl.g:2171:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            {
            // InternalBusinessDsl.g:2171:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            // InternalBusinessDsl.g:2172:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_0()); 
            // InternalBusinessDsl.g:2173:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            // InternalBusinessDsl.g:2173:3: rule__MethodDtoReturn__ParametersAssignment_4_0
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
    // InternalBusinessDsl.g:2181:1: rule__MethodDtoReturn__Group_4__1 : rule__MethodDtoReturn__Group_4__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2185:1: ( rule__MethodDtoReturn__Group_4__1__Impl )
            // InternalBusinessDsl.g:2186:2: rule__MethodDtoReturn__Group_4__1__Impl
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
    // InternalBusinessDsl.g:2192:1: rule__MethodDtoReturn__Group_4__1__Impl : ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) ;
    public final void rule__MethodDtoReturn__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2196:1: ( ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) )
            // InternalBusinessDsl.g:2197:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            {
            // InternalBusinessDsl.g:2197:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            // InternalBusinessDsl.g:2198:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4_1()); 
            // InternalBusinessDsl.g:2199:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBusinessDsl.g:2199:3: rule__MethodDtoReturn__Group_4_1__0
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
    // InternalBusinessDsl.g:2208:1: rule__MethodDtoReturn__Group_4_1__0 : rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 ;
    public final void rule__MethodDtoReturn__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2212:1: ( rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 )
            // InternalBusinessDsl.g:2213:2: rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1
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
    // InternalBusinessDsl.g:2220:1: rule__MethodDtoReturn__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MethodDtoReturn__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2224:1: ( ( ',' ) )
            // InternalBusinessDsl.g:2225:1: ( ',' )
            {
            // InternalBusinessDsl.g:2225:1: ( ',' )
            // InternalBusinessDsl.g:2226:2: ','
            {
             before(grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2235:1: rule__MethodDtoReturn__Group_4_1__1 : rule__MethodDtoReturn__Group_4_1__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2239:1: ( rule__MethodDtoReturn__Group_4_1__1__Impl )
            // InternalBusinessDsl.g:2240:2: rule__MethodDtoReturn__Group_4_1__1__Impl
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
    // InternalBusinessDsl.g:2246:1: rule__MethodDtoReturn__Group_4_1__1__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__MethodDtoReturn__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2250:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) )
            // InternalBusinessDsl.g:2251:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            {
            // InternalBusinessDsl.g:2251:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            // InternalBusinessDsl.g:2252:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_1_1()); 
            // InternalBusinessDsl.g:2253:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            // InternalBusinessDsl.g:2253:3: rule__MethodDtoReturn__ParametersAssignment_4_1_1
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
    // InternalBusinessDsl.g:2262:1: rule__MethodCollectionReturn__Group__0 : rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 ;
    public final void rule__MethodCollectionReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2266:1: ( rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 )
            // InternalBusinessDsl.g:2267:2: rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1
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
    // InternalBusinessDsl.g:2274:1: rule__MethodCollectionReturn__Group__0__Impl : ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2278:1: ( ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2279:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2279:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            // InternalBusinessDsl.g:2280:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0()); 
            // InternalBusinessDsl.g:2281:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            // InternalBusinessDsl.g:2281:3: rule__MethodCollectionReturn__ReturnTypeAssignment_0
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
    // InternalBusinessDsl.g:2289:1: rule__MethodCollectionReturn__Group__1 : rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 ;
    public final void rule__MethodCollectionReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2293:1: ( rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 )
            // InternalBusinessDsl.g:2294:2: rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2
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
    // InternalBusinessDsl.g:2301:1: rule__MethodCollectionReturn__Group__1__Impl : ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2305:1: ( ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2306:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2306:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2307:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2308:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            // InternalBusinessDsl.g:2308:3: rule__MethodCollectionReturn__NameAssignment_1
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
    // InternalBusinessDsl.g:2316:1: rule__MethodCollectionReturn__Group__2 : rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 ;
    public final void rule__MethodCollectionReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2320:1: ( rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 )
            // InternalBusinessDsl.g:2321:2: rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3
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
    // InternalBusinessDsl.g:2328:1: rule__MethodCollectionReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodCollectionReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2332:1: ( ( '(' ) )
            // InternalBusinessDsl.g:2333:1: ( '(' )
            {
            // InternalBusinessDsl.g:2333:1: ( '(' )
            // InternalBusinessDsl.g:2334:2: '('
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2343:1: rule__MethodCollectionReturn__Group__3 : rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 ;
    public final void rule__MethodCollectionReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2347:1: ( rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 )
            // InternalBusinessDsl.g:2348:2: rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4
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
    // InternalBusinessDsl.g:2355:1: rule__MethodCollectionReturn__Group__3__Impl : ( ( rule__MethodCollectionReturn__Group_3__0 )? ) ;
    public final void rule__MethodCollectionReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2359:1: ( ( ( rule__MethodCollectionReturn__Group_3__0 )? ) )
            // InternalBusinessDsl.g:2360:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            {
            // InternalBusinessDsl.g:2360:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            // InternalBusinessDsl.g:2361:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3()); 
            // InternalBusinessDsl.g:2362:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_DATE && LA22_0<=RULE_SET)||(LA22_0>=RULE_TYPE_INT && LA22_0<=RULE_ID)||LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBusinessDsl.g:2362:3: rule__MethodCollectionReturn__Group_3__0
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
    // InternalBusinessDsl.g:2370:1: rule__MethodCollectionReturn__Group__4 : rule__MethodCollectionReturn__Group__4__Impl ;
    public final void rule__MethodCollectionReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2374:1: ( rule__MethodCollectionReturn__Group__4__Impl )
            // InternalBusinessDsl.g:2375:2: rule__MethodCollectionReturn__Group__4__Impl
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
    // InternalBusinessDsl.g:2381:1: rule__MethodCollectionReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodCollectionReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2385:1: ( ( ')' ) )
            // InternalBusinessDsl.g:2386:1: ( ')' )
            {
            // InternalBusinessDsl.g:2386:1: ( ')' )
            // InternalBusinessDsl.g:2387:2: ')'
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2397:1: rule__MethodCollectionReturn__Group_3__0 : rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 ;
    public final void rule__MethodCollectionReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2401:1: ( rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 )
            // InternalBusinessDsl.g:2402:2: rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1
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
    // InternalBusinessDsl.g:2409:1: rule__MethodCollectionReturn__Group_3__0__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2413:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) )
            // InternalBusinessDsl.g:2414:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            {
            // InternalBusinessDsl.g:2414:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            // InternalBusinessDsl.g:2415:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0()); 
            // InternalBusinessDsl.g:2416:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            // InternalBusinessDsl.g:2416:3: rule__MethodCollectionReturn__ParametersAssignment_3_0
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
    // InternalBusinessDsl.g:2424:1: rule__MethodCollectionReturn__Group_3__1 : rule__MethodCollectionReturn__Group_3__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2428:1: ( rule__MethodCollectionReturn__Group_3__1__Impl )
            // InternalBusinessDsl.g:2429:2: rule__MethodCollectionReturn__Group_3__1__Impl
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
    // InternalBusinessDsl.g:2435:1: rule__MethodCollectionReturn__Group_3__1__Impl : ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodCollectionReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2439:1: ( ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) )
            // InternalBusinessDsl.g:2440:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            {
            // InternalBusinessDsl.g:2440:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            // InternalBusinessDsl.g:2441:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1()); 
            // InternalBusinessDsl.g:2442:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBusinessDsl.g:2442:3: rule__MethodCollectionReturn__Group_3_1__0
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
    // InternalBusinessDsl.g:2451:1: rule__MethodCollectionReturn__Group_3_1__0 : rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 ;
    public final void rule__MethodCollectionReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2455:1: ( rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 )
            // InternalBusinessDsl.g:2456:2: rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1
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
    // InternalBusinessDsl.g:2463:1: rule__MethodCollectionReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2467:1: ( ( ',' ) )
            // InternalBusinessDsl.g:2468:1: ( ',' )
            {
            // InternalBusinessDsl.g:2468:1: ( ',' )
            // InternalBusinessDsl.g:2469:2: ','
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2478:1: rule__MethodCollectionReturn__Group_3_1__1 : rule__MethodCollectionReturn__Group_3_1__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2482:1: ( rule__MethodCollectionReturn__Group_3_1__1__Impl )
            // InternalBusinessDsl.g:2483:2: rule__MethodCollectionReturn__Group_3_1__1__Impl
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
    // InternalBusinessDsl.g:2489:1: rule__MethodCollectionReturn__Group_3_1__1__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2493:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalBusinessDsl.g:2494:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalBusinessDsl.g:2494:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            // InternalBusinessDsl.g:2495:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalBusinessDsl.g:2496:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            // InternalBusinessDsl.g:2496:3: rule__MethodCollectionReturn__ParametersAssignment_3_1_1
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
    // InternalBusinessDsl.g:2505:1: rule__DefAllModelTypeVariable__Group__0 : rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 ;
    public final void rule__DefAllModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2509:1: ( rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 )
            // InternalBusinessDsl.g:2510:2: rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1
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
    // InternalBusinessDsl.g:2517:1: rule__DefAllModelTypeVariable__Group__0__Impl : ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2521:1: ( ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2522:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2522:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2523:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2524:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2524:3: rule__DefAllModelTypeVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2532:1: rule__DefAllModelTypeVariable__Group__1 : rule__DefAllModelTypeVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2536:1: ( rule__DefAllModelTypeVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2537:2: rule__DefAllModelTypeVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2543:1: rule__DefAllModelTypeVariable__Group__1__Impl : ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2547:1: ( ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2548:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2548:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2549:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2550:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2550:3: rule__DefAllModelTypeVariable__NameAssignment_1
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
    // InternalBusinessDsl.g:2559:1: rule__DefDtoTypeVariable__Group__0 : rule__DefDtoTypeVariable__Group__0__Impl rule__DefDtoTypeVariable__Group__1 ;
    public final void rule__DefDtoTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2563:1: ( rule__DefDtoTypeVariable__Group__0__Impl rule__DefDtoTypeVariable__Group__1 )
            // InternalBusinessDsl.g:2564:2: rule__DefDtoTypeVariable__Group__0__Impl rule__DefDtoTypeVariable__Group__1
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
    // InternalBusinessDsl.g:2571:1: rule__DefDtoTypeVariable__Group__0__Impl : ( '#' ) ;
    public final void rule__DefDtoTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2575:1: ( ( '#' ) )
            // InternalBusinessDsl.g:2576:1: ( '#' )
            {
            // InternalBusinessDsl.g:2576:1: ( '#' )
            // InternalBusinessDsl.g:2577:2: '#'
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getNumberSignKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2586:1: rule__DefDtoTypeVariable__Group__1 : rule__DefDtoTypeVariable__Group__1__Impl rule__DefDtoTypeVariable__Group__2 ;
    public final void rule__DefDtoTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2590:1: ( rule__DefDtoTypeVariable__Group__1__Impl rule__DefDtoTypeVariable__Group__2 )
            // InternalBusinessDsl.g:2591:2: rule__DefDtoTypeVariable__Group__1__Impl rule__DefDtoTypeVariable__Group__2
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
    // InternalBusinessDsl.g:2598:1: rule__DefDtoTypeVariable__Group__1__Impl : ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) ) ;
    public final void rule__DefDtoTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2602:1: ( ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) ) )
            // InternalBusinessDsl.g:2603:1: ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2603:1: ( ( rule__DefDtoTypeVariable__TypeAssignment_1 ) )
            // InternalBusinessDsl.g:2604:2: ( rule__DefDtoTypeVariable__TypeAssignment_1 )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getTypeAssignment_1()); 
            // InternalBusinessDsl.g:2605:2: ( rule__DefDtoTypeVariable__TypeAssignment_1 )
            // InternalBusinessDsl.g:2605:3: rule__DefDtoTypeVariable__TypeAssignment_1
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
    // InternalBusinessDsl.g:2613:1: rule__DefDtoTypeVariable__Group__2 : rule__DefDtoTypeVariable__Group__2__Impl ;
    public final void rule__DefDtoTypeVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2617:1: ( rule__DefDtoTypeVariable__Group__2__Impl )
            // InternalBusinessDsl.g:2618:2: rule__DefDtoTypeVariable__Group__2__Impl
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
    // InternalBusinessDsl.g:2624:1: rule__DefDtoTypeVariable__Group__2__Impl : ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) ) ;
    public final void rule__DefDtoTypeVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2628:1: ( ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) ) )
            // InternalBusinessDsl.g:2629:1: ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) )
            {
            // InternalBusinessDsl.g:2629:1: ( ( rule__DefDtoTypeVariable__NameAssignment_2 ) )
            // InternalBusinessDsl.g:2630:2: ( rule__DefDtoTypeVariable__NameAssignment_2 )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getNameAssignment_2()); 
            // InternalBusinessDsl.g:2631:2: ( rule__DefDtoTypeVariable__NameAssignment_2 )
            // InternalBusinessDsl.g:2631:3: rule__DefDtoTypeVariable__NameAssignment_2
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
    // InternalBusinessDsl.g:2640:1: rule__DefSimpleVariable__Group__0 : rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 ;
    public final void rule__DefSimpleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2644:1: ( rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 )
            // InternalBusinessDsl.g:2645:2: rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1
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
    // InternalBusinessDsl.g:2652:1: rule__DefSimpleVariable__Group__0__Impl : ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2656:1: ( ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2657:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2657:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2658:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2659:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2659:3: rule__DefSimpleVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2667:1: rule__DefSimpleVariable__Group__1 : rule__DefSimpleVariable__Group__1__Impl ;
    public final void rule__DefSimpleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2671:1: ( rule__DefSimpleVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2672:2: rule__DefSimpleVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2678:1: rule__DefSimpleVariable__Group__1__Impl : ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2682:1: ( ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2683:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2683:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2684:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2685:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2685:3: rule__DefSimpleVariable__NameAssignment_1
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
    // InternalBusinessDsl.g:2694:1: rule__DefAllModelTypeCollectionVariable__Group__0 : rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2698:1: ( rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 )
            // InternalBusinessDsl.g:2699:2: rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1
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
    // InternalBusinessDsl.g:2706:1: rule__DefAllModelTypeCollectionVariable__Group__0__Impl : ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2710:1: ( ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2711:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2711:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2712:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2713:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2713:3: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2721:1: rule__DefAllModelTypeCollectionVariable__Group__1 : rule__DefAllModelTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2725:1: ( rule__DefAllModelTypeCollectionVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2726:2: rule__DefAllModelTypeCollectionVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2732:1: rule__DefAllModelTypeCollectionVariable__Group__1__Impl : ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2736:1: ( ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2737:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2737:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2738:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2739:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2739:3: rule__DefAllModelTypeCollectionVariable__NameAssignment_1
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
    // InternalBusinessDsl.g:2748:1: rule__DefSimpleTypeCollectionVariable__Group__0 : rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2752:1: ( rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 )
            // InternalBusinessDsl.g:2753:2: rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1
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
    // InternalBusinessDsl.g:2760:1: rule__DefSimpleTypeCollectionVariable__Group__0__Impl : ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2764:1: ( ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2765:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2765:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2766:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2767:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2767:3: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2775:1: rule__DefSimpleTypeCollectionVariable__Group__1 : rule__DefSimpleTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2779:1: ( rule__DefSimpleTypeCollectionVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2780:2: rule__DefSimpleTypeCollectionVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2786:1: rule__DefSimpleTypeCollectionVariable__Group__1__Impl : ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2790:1: ( ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2791:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2791:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2792:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2793:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2793:3: rule__DefSimpleTypeCollectionVariable__NameAssignment_1
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
    // InternalBusinessDsl.g:2802:1: rule__DefDtoTypeCollectionVariable__Group__0 : rule__DefDtoTypeCollectionVariable__Group__0__Impl rule__DefDtoTypeCollectionVariable__Group__1 ;
    public final void rule__DefDtoTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2806:1: ( rule__DefDtoTypeCollectionVariable__Group__0__Impl rule__DefDtoTypeCollectionVariable__Group__1 )
            // InternalBusinessDsl.g:2807:2: rule__DefDtoTypeCollectionVariable__Group__0__Impl rule__DefDtoTypeCollectionVariable__Group__1
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
    // InternalBusinessDsl.g:2814:1: rule__DefDtoTypeCollectionVariable__Group__0__Impl : ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefDtoTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2818:1: ( ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalBusinessDsl.g:2819:1: ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2819:1: ( ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalBusinessDsl.g:2820:2: ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalBusinessDsl.g:2821:2: ( rule__DefDtoTypeCollectionVariable__TypeAssignment_0 )
            // InternalBusinessDsl.g:2821:3: rule__DefDtoTypeCollectionVariable__TypeAssignment_0
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
    // InternalBusinessDsl.g:2829:1: rule__DefDtoTypeCollectionVariable__Group__1 : rule__DefDtoTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefDtoTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2833:1: ( rule__DefDtoTypeCollectionVariable__Group__1__Impl )
            // InternalBusinessDsl.g:2834:2: rule__DefDtoTypeCollectionVariable__Group__1__Impl
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
    // InternalBusinessDsl.g:2840:1: rule__DefDtoTypeCollectionVariable__Group__1__Impl : ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefDtoTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2844:1: ( ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalBusinessDsl.g:2845:1: ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalBusinessDsl.g:2845:1: ( ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 ) )
            // InternalBusinessDsl.g:2846:2: ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalBusinessDsl.g:2847:2: ( rule__DefDtoTypeCollectionVariable__NameAssignment_1 )
            // InternalBusinessDsl.g:2847:3: rule__DefDtoTypeCollectionVariable__NameAssignment_1
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
    // InternalBusinessDsl.g:2856:1: rule__AllModelTypeCollection__Group__0 : rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 ;
    public final void rule__AllModelTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2860:1: ( rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 )
            // InternalBusinessDsl.g:2861:2: rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1
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
    // InternalBusinessDsl.g:2868:1: rule__AllModelTypeCollection__Group__0__Impl : ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__AllModelTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2872:1: ( ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) )
            // InternalBusinessDsl.g:2873:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2873:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            // InternalBusinessDsl.g:2874:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalBusinessDsl.g:2875:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            // InternalBusinessDsl.g:2875:3: rule__AllModelTypeCollection__CollectionAssignment_0
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
    // InternalBusinessDsl.g:2883:1: rule__AllModelTypeCollection__Group__1 : rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 ;
    public final void rule__AllModelTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2887:1: ( rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 )
            // InternalBusinessDsl.g:2888:2: rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2
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
    // InternalBusinessDsl.g:2895:1: rule__AllModelTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__AllModelTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2899:1: ( ( '<' ) )
            // InternalBusinessDsl.g:2900:1: ( '<' )
            {
            // InternalBusinessDsl.g:2900:1: ( '<' )
            // InternalBusinessDsl.g:2901:2: '<'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2910:1: rule__AllModelTypeCollection__Group__2 : rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 ;
    public final void rule__AllModelTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2914:1: ( rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 )
            // InternalBusinessDsl.g:2915:2: rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3
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
    // InternalBusinessDsl.g:2922:1: rule__AllModelTypeCollection__Group__2__Impl : ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__AllModelTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2926:1: ( ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) )
            // InternalBusinessDsl.g:2927:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            {
            // InternalBusinessDsl.g:2927:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            // InternalBusinessDsl.g:2928:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalBusinessDsl.g:2929:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            // InternalBusinessDsl.g:2929:3: rule__AllModelTypeCollection__TypeAssignment_2
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
    // InternalBusinessDsl.g:2937:1: rule__AllModelTypeCollection__Group__3 : rule__AllModelTypeCollection__Group__3__Impl ;
    public final void rule__AllModelTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2941:1: ( rule__AllModelTypeCollection__Group__3__Impl )
            // InternalBusinessDsl.g:2942:2: rule__AllModelTypeCollection__Group__3__Impl
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
    // InternalBusinessDsl.g:2948:1: rule__AllModelTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__AllModelTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2952:1: ( ( '>' ) )
            // InternalBusinessDsl.g:2953:1: ( '>' )
            {
            // InternalBusinessDsl.g:2953:1: ( '>' )
            // InternalBusinessDsl.g:2954:2: '>'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:2964:1: rule__DtoTypeCollection__Group__0 : rule__DtoTypeCollection__Group__0__Impl rule__DtoTypeCollection__Group__1 ;
    public final void rule__DtoTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2968:1: ( rule__DtoTypeCollection__Group__0__Impl rule__DtoTypeCollection__Group__1 )
            // InternalBusinessDsl.g:2969:2: rule__DtoTypeCollection__Group__0__Impl rule__DtoTypeCollection__Group__1
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
    // InternalBusinessDsl.g:2976:1: rule__DtoTypeCollection__Group__0__Impl : ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__DtoTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2980:1: ( ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) ) )
            // InternalBusinessDsl.g:2981:1: ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalBusinessDsl.g:2981:1: ( ( rule__DtoTypeCollection__CollectionAssignment_0 ) )
            // InternalBusinessDsl.g:2982:2: ( rule__DtoTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalBusinessDsl.g:2983:2: ( rule__DtoTypeCollection__CollectionAssignment_0 )
            // InternalBusinessDsl.g:2983:3: rule__DtoTypeCollection__CollectionAssignment_0
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
    // InternalBusinessDsl.g:2991:1: rule__DtoTypeCollection__Group__1 : rule__DtoTypeCollection__Group__1__Impl rule__DtoTypeCollection__Group__2 ;
    public final void rule__DtoTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:2995:1: ( rule__DtoTypeCollection__Group__1__Impl rule__DtoTypeCollection__Group__2 )
            // InternalBusinessDsl.g:2996:2: rule__DtoTypeCollection__Group__1__Impl rule__DtoTypeCollection__Group__2
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
    // InternalBusinessDsl.g:3003:1: rule__DtoTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__DtoTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3007:1: ( ( '<' ) )
            // InternalBusinessDsl.g:3008:1: ( '<' )
            {
            // InternalBusinessDsl.g:3008:1: ( '<' )
            // InternalBusinessDsl.g:3009:2: '<'
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3018:1: rule__DtoTypeCollection__Group__2 : rule__DtoTypeCollection__Group__2__Impl rule__DtoTypeCollection__Group__3 ;
    public final void rule__DtoTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3022:1: ( rule__DtoTypeCollection__Group__2__Impl rule__DtoTypeCollection__Group__3 )
            // InternalBusinessDsl.g:3023:2: rule__DtoTypeCollection__Group__2__Impl rule__DtoTypeCollection__Group__3
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
    // InternalBusinessDsl.g:3030:1: rule__DtoTypeCollection__Group__2__Impl : ( '#' ) ;
    public final void rule__DtoTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3034:1: ( ( '#' ) )
            // InternalBusinessDsl.g:3035:1: ( '#' )
            {
            // InternalBusinessDsl.g:3035:1: ( '#' )
            // InternalBusinessDsl.g:3036:2: '#'
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getNumberSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3045:1: rule__DtoTypeCollection__Group__3 : rule__DtoTypeCollection__Group__3__Impl rule__DtoTypeCollection__Group__4 ;
    public final void rule__DtoTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3049:1: ( rule__DtoTypeCollection__Group__3__Impl rule__DtoTypeCollection__Group__4 )
            // InternalBusinessDsl.g:3050:2: rule__DtoTypeCollection__Group__3__Impl rule__DtoTypeCollection__Group__4
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
    // InternalBusinessDsl.g:3057:1: rule__DtoTypeCollection__Group__3__Impl : ( ( rule__DtoTypeCollection__TypeAssignment_3 ) ) ;
    public final void rule__DtoTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3061:1: ( ( ( rule__DtoTypeCollection__TypeAssignment_3 ) ) )
            // InternalBusinessDsl.g:3062:1: ( ( rule__DtoTypeCollection__TypeAssignment_3 ) )
            {
            // InternalBusinessDsl.g:3062:1: ( ( rule__DtoTypeCollection__TypeAssignment_3 ) )
            // InternalBusinessDsl.g:3063:2: ( rule__DtoTypeCollection__TypeAssignment_3 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getTypeAssignment_3()); 
            // InternalBusinessDsl.g:3064:2: ( rule__DtoTypeCollection__TypeAssignment_3 )
            // InternalBusinessDsl.g:3064:3: rule__DtoTypeCollection__TypeAssignment_3
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
    // InternalBusinessDsl.g:3072:1: rule__DtoTypeCollection__Group__4 : rule__DtoTypeCollection__Group__4__Impl ;
    public final void rule__DtoTypeCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3076:1: ( rule__DtoTypeCollection__Group__4__Impl )
            // InternalBusinessDsl.g:3077:2: rule__DtoTypeCollection__Group__4__Impl
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
    // InternalBusinessDsl.g:3083:1: rule__DtoTypeCollection__Group__4__Impl : ( '>' ) ;
    public final void rule__DtoTypeCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3087:1: ( ( '>' ) )
            // InternalBusinessDsl.g:3088:1: ( '>' )
            {
            // InternalBusinessDsl.g:3088:1: ( '>' )
            // InternalBusinessDsl.g:3089:2: '>'
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getGreaterThanSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3099:1: rule__SimpleTypeCollection__Group__0 : rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 ;
    public final void rule__SimpleTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3103:1: ( rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 )
            // InternalBusinessDsl.g:3104:2: rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1
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
    // InternalBusinessDsl.g:3111:1: rule__SimpleTypeCollection__Group__0__Impl : ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__SimpleTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3115:1: ( ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) )
            // InternalBusinessDsl.g:3116:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalBusinessDsl.g:3116:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            // InternalBusinessDsl.g:3117:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalBusinessDsl.g:3118:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            // InternalBusinessDsl.g:3118:3: rule__SimpleTypeCollection__CollectionAssignment_0
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
    // InternalBusinessDsl.g:3126:1: rule__SimpleTypeCollection__Group__1 : rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 ;
    public final void rule__SimpleTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3130:1: ( rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 )
            // InternalBusinessDsl.g:3131:2: rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2
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
    // InternalBusinessDsl.g:3138:1: rule__SimpleTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3142:1: ( ( '<' ) )
            // InternalBusinessDsl.g:3143:1: ( '<' )
            {
            // InternalBusinessDsl.g:3143:1: ( '<' )
            // InternalBusinessDsl.g:3144:2: '<'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3153:1: rule__SimpleTypeCollection__Group__2 : rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 ;
    public final void rule__SimpleTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3157:1: ( rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 )
            // InternalBusinessDsl.g:3158:2: rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3
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
    // InternalBusinessDsl.g:3165:1: rule__SimpleTypeCollection__Group__2__Impl : ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3169:1: ( ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) )
            // InternalBusinessDsl.g:3170:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            {
            // InternalBusinessDsl.g:3170:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            // InternalBusinessDsl.g:3171:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalBusinessDsl.g:3172:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            // InternalBusinessDsl.g:3172:3: rule__SimpleTypeCollection__TypeAssignment_2
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
    // InternalBusinessDsl.g:3180:1: rule__SimpleTypeCollection__Group__3 : rule__SimpleTypeCollection__Group__3__Impl ;
    public final void rule__SimpleTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3184:1: ( rule__SimpleTypeCollection__Group__3__Impl )
            // InternalBusinessDsl.g:3185:2: rule__SimpleTypeCollection__Group__3__Impl
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
    // InternalBusinessDsl.g:3191:1: rule__SimpleTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3195:1: ( ( '>' ) )
            // InternalBusinessDsl.g:3196:1: ( '>' )
            {
            // InternalBusinessDsl.g:3196:1: ( '>' )
            // InternalBusinessDsl.g:3197:2: '>'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3207:1: rule__Model__ServicesAssignment : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3211:1: ( ( ruleService ) )
            // InternalBusinessDsl.g:3212:2: ( ruleService )
            {
            // InternalBusinessDsl.g:3212:2: ( ruleService )
            // InternalBusinessDsl.g:3213:3: ruleService
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
    // InternalBusinessDsl.g:3222:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3226:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3227:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3227:2: ( RULE_ID )
            // InternalBusinessDsl.g:3228:3: RULE_ID
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
    // InternalBusinessDsl.g:3237:1: rule__Service__MethodsAssignment_3 : ( ruleServiceMethod ) ;
    public final void rule__Service__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3241:1: ( ( ruleServiceMethod ) )
            // InternalBusinessDsl.g:3242:2: ( ruleServiceMethod )
            {
            // InternalBusinessDsl.g:3242:2: ( ruleServiceMethod )
            // InternalBusinessDsl.g:3243:3: ruleServiceMethod
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
    // InternalBusinessDsl.g:3252:1: rule__JpaMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JpaMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3256:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3257:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3257:2: ( RULE_ID )
            // InternalBusinessDsl.g:3258:3: RULE_ID
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
    // InternalBusinessDsl.g:3267:1: rule__JpaMethod__KeywordAssignment_3 : ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) ) ;
    public final void rule__JpaMethod__KeywordAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3271:1: ( ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) ) )
            // InternalBusinessDsl.g:3272:2: ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) )
            {
            // InternalBusinessDsl.g:3272:2: ( ( rule__JpaMethod__KeywordAlternatives_3_0 ) )
            // InternalBusinessDsl.g:3273:3: ( rule__JpaMethod__KeywordAlternatives_3_0 )
            {
             before(grammarAccess.getJpaMethodAccess().getKeywordAlternatives_3_0()); 
            // InternalBusinessDsl.g:3274:3: ( rule__JpaMethod__KeywordAlternatives_3_0 )
            // InternalBusinessDsl.g:3274:4: rule__JpaMethod__KeywordAlternatives_3_0
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
    // InternalBusinessDsl.g:3282:1: rule__JpaMethod__EntityAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__JpaMethod__EntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3286:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3287:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3287:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3288:3: ( RULE_ID )
            {
             before(grammarAccess.getJpaMethodAccess().getEntityEntityCrossReference_5_0()); 
            // InternalBusinessDsl.g:3289:3: ( RULE_ID )
            // InternalBusinessDsl.g:3290:4: RULE_ID
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
    // InternalBusinessDsl.g:3301:1: rule__FinderUserMethod__KeywordAssignment_1_0 : ( ( 'finder' ) ) ;
    public final void rule__FinderUserMethod__KeywordAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3305:1: ( ( ( 'finder' ) ) )
            // InternalBusinessDsl.g:3306:2: ( ( 'finder' ) )
            {
            // InternalBusinessDsl.g:3306:2: ( ( 'finder' ) )
            // InternalBusinessDsl.g:3307:3: ( 'finder' )
            {
             before(grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0()); 
            // InternalBusinessDsl.g:3308:3: ( 'finder' )
            // InternalBusinessDsl.g:3309:4: 'finder'
            {
             before(grammarAccess.getFinderUserMethodAccess().getKeywordFinderKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBusinessDsl.g:3320:1: rule__FinderUserMethod__FinderAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__FinderUserMethod__FinderAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3324:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3325:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3325:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3326:3: ( RULE_ID )
            {
             before(grammarAccess.getFinderUserMethodAccess().getFinderFinderCrossReference_1_2_0()); 
            // InternalBusinessDsl.g:3327:3: ( RULE_ID )
            // InternalBusinessDsl.g:3328:4: RULE_ID
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
    // InternalBusinessDsl.g:3339:1: rule__MethodSimpleReturn__ReturnTypeAssignment_0 : ( ruleSimpleReturnType ) ;
    public final void rule__MethodSimpleReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3343:1: ( ( ruleSimpleReturnType ) )
            // InternalBusinessDsl.g:3344:2: ( ruleSimpleReturnType )
            {
            // InternalBusinessDsl.g:3344:2: ( ruleSimpleReturnType )
            // InternalBusinessDsl.g:3345:3: ruleSimpleReturnType
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
    // InternalBusinessDsl.g:3354:1: rule__MethodSimpleReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodSimpleReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3358:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3359:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3359:2: ( RULE_ID )
            // InternalBusinessDsl.g:3360:3: RULE_ID
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
    // InternalBusinessDsl.g:3369:1: rule__MethodSimpleReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3373:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3374:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3374:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3375:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3384:1: rule__MethodSimpleReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3388:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3389:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3389:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3390:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3399:1: rule__MethodAllModelReturn__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodAllModelReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3403:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3404:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3404:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3405:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAllModelTypeCrossReference_0_0()); 
            // InternalBusinessDsl.g:3406:3: ( RULE_ID )
            // InternalBusinessDsl.g:3407:4: RULE_ID
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
    // InternalBusinessDsl.g:3418:1: rule__MethodAllModelReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodAllModelReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3422:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3423:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3423:2: ( RULE_ID )
            // InternalBusinessDsl.g:3424:3: RULE_ID
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
    // InternalBusinessDsl.g:3433:1: rule__MethodAllModelReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodAllModelReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3437:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3438:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3438:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3439:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3448:1: rule__MethodAllModelReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodAllModelReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3452:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3453:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3453:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3454:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3463:1: rule__MethodDtoReturn__ReturnTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodDtoReturn__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3467:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3468:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3468:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3469:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0()); 
            // InternalBusinessDsl.g:3470:3: ( RULE_ID )
            // InternalBusinessDsl.g:3471:4: RULE_ID
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
    // InternalBusinessDsl.g:3482:1: rule__MethodDtoReturn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDtoReturn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3486:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3487:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3487:2: ( RULE_ID )
            // InternalBusinessDsl.g:3488:3: RULE_ID
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
    // InternalBusinessDsl.g:3497:1: rule__MethodDtoReturn__ParametersAssignment_4_0 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3501:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3502:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3502:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3503:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3512:1: rule__MethodDtoReturn__ParametersAssignment_4_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3516:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3517:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3517:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3518:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3527:1: rule__MethodCollectionReturn__ReturnTypeAssignment_0 : ( ruleCollectionReturnType ) ;
    public final void rule__MethodCollectionReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3531:1: ( ( ruleCollectionReturnType ) )
            // InternalBusinessDsl.g:3532:2: ( ruleCollectionReturnType )
            {
            // InternalBusinessDsl.g:3532:2: ( ruleCollectionReturnType )
            // InternalBusinessDsl.g:3533:3: ruleCollectionReturnType
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
    // InternalBusinessDsl.g:3542:1: rule__MethodCollectionReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodCollectionReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3546:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3547:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3547:2: ( RULE_ID )
            // InternalBusinessDsl.g:3548:3: RULE_ID
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
    // InternalBusinessDsl.g:3557:1: rule__MethodCollectionReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3561:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3562:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3562:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3563:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3572:1: rule__MethodCollectionReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3576:1: ( ( ruleDefVariable ) )
            // InternalBusinessDsl.g:3577:2: ( ruleDefVariable )
            {
            // InternalBusinessDsl.g:3577:2: ( ruleDefVariable )
            // InternalBusinessDsl.g:3578:3: ruleDefVariable
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
    // InternalBusinessDsl.g:3587:1: rule__DefAllModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefAllModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3591:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3592:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3592:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3593:3: ( RULE_ID )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0()); 
            // InternalBusinessDsl.g:3594:3: ( RULE_ID )
            // InternalBusinessDsl.g:3595:4: RULE_ID
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
    // InternalBusinessDsl.g:3606:1: rule__DefAllModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3610:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3611:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3611:2: ( RULE_ID )
            // InternalBusinessDsl.g:3612:3: RULE_ID
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
    // InternalBusinessDsl.g:3621:1: rule__DefDtoTypeVariable__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefDtoTypeVariable__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3625:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3626:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3626:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3627:3: ( RULE_ID )
            {
             before(grammarAccess.getDefDtoTypeVariableAccess().getTypeDtoCrossReference_1_0()); 
            // InternalBusinessDsl.g:3628:3: ( RULE_ID )
            // InternalBusinessDsl.g:3629:4: RULE_ID
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
    // InternalBusinessDsl.g:3640:1: rule__DefDtoTypeVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefDtoTypeVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3644:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3645:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3645:2: ( RULE_ID )
            // InternalBusinessDsl.g:3646:3: RULE_ID
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
    // InternalBusinessDsl.g:3655:1: rule__DefSimpleVariable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefSimpleVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3659:1: ( ( ruleType ) )
            // InternalBusinessDsl.g:3660:2: ( ruleType )
            {
            // InternalBusinessDsl.g:3660:2: ( ruleType )
            // InternalBusinessDsl.g:3661:3: ruleType
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
    // InternalBusinessDsl.g:3670:1: rule__DefSimpleVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3674:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3675:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3675:2: ( RULE_ID )
            // InternalBusinessDsl.g:3676:3: RULE_ID
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
    // InternalBusinessDsl.g:3685:1: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 : ( ruleAllModelTypeCollection ) ;
    public final void rule__DefAllModelTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3689:1: ( ( ruleAllModelTypeCollection ) )
            // InternalBusinessDsl.g:3690:2: ( ruleAllModelTypeCollection )
            {
            // InternalBusinessDsl.g:3690:2: ( ruleAllModelTypeCollection )
            // InternalBusinessDsl.g:3691:3: ruleAllModelTypeCollection
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
    // InternalBusinessDsl.g:3700:1: rule__DefAllModelTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3704:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3705:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3705:2: ( RULE_ID )
            // InternalBusinessDsl.g:3706:3: RULE_ID
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
    // InternalBusinessDsl.g:3715:1: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 : ( ruleSimpleTypeCollection ) ;
    public final void rule__DefSimpleTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3719:1: ( ( ruleSimpleTypeCollection ) )
            // InternalBusinessDsl.g:3720:2: ( ruleSimpleTypeCollection )
            {
            // InternalBusinessDsl.g:3720:2: ( ruleSimpleTypeCollection )
            // InternalBusinessDsl.g:3721:3: ruleSimpleTypeCollection
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
    // InternalBusinessDsl.g:3730:1: rule__DefSimpleTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3734:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3735:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3735:2: ( RULE_ID )
            // InternalBusinessDsl.g:3736:3: RULE_ID
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
    // InternalBusinessDsl.g:3745:1: rule__DefDtoTypeCollectionVariable__TypeAssignment_0 : ( ruleDtoTypeCollection ) ;
    public final void rule__DefDtoTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3749:1: ( ( ruleDtoTypeCollection ) )
            // InternalBusinessDsl.g:3750:2: ( ruleDtoTypeCollection )
            {
            // InternalBusinessDsl.g:3750:2: ( ruleDtoTypeCollection )
            // InternalBusinessDsl.g:3751:3: ruleDtoTypeCollection
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
    // InternalBusinessDsl.g:3760:1: rule__DefDtoTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefDtoTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3764:1: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3765:2: ( RULE_ID )
            {
            // InternalBusinessDsl.g:3765:2: ( RULE_ID )
            // InternalBusinessDsl.g:3766:3: RULE_ID
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
    // InternalBusinessDsl.g:3775:1: rule__AllModelTypeCollection__CollectionAssignment_0 : ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__AllModelTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3779:1: ( ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalBusinessDsl.g:3780:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalBusinessDsl.g:3780:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalBusinessDsl.g:3781:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalBusinessDsl.g:3782:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            // InternalBusinessDsl.g:3782:4: rule__AllModelTypeCollection__CollectionAlternatives_0_0
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
    // InternalBusinessDsl.g:3790:1: rule__AllModelTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AllModelTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3794:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3795:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3795:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3796:3: ( RULE_ID )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0()); 
            // InternalBusinessDsl.g:3797:3: ( RULE_ID )
            // InternalBusinessDsl.g:3798:4: RULE_ID
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
    // InternalBusinessDsl.g:3809:1: rule__DtoTypeCollection__CollectionAssignment_0 : ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__DtoTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3813:1: ( ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalBusinessDsl.g:3814:2: ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalBusinessDsl.g:3814:2: ( ( rule__DtoTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalBusinessDsl.g:3815:3: ( rule__DtoTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalBusinessDsl.g:3816:3: ( rule__DtoTypeCollection__CollectionAlternatives_0_0 )
            // InternalBusinessDsl.g:3816:4: rule__DtoTypeCollection__CollectionAlternatives_0_0
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
    // InternalBusinessDsl.g:3824:1: rule__DtoTypeCollection__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DtoTypeCollection__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3828:1: ( ( ( RULE_ID ) ) )
            // InternalBusinessDsl.g:3829:2: ( ( RULE_ID ) )
            {
            // InternalBusinessDsl.g:3829:2: ( ( RULE_ID ) )
            // InternalBusinessDsl.g:3830:3: ( RULE_ID )
            {
             before(grammarAccess.getDtoTypeCollectionAccess().getTypeDtoCrossReference_3_0()); 
            // InternalBusinessDsl.g:3831:3: ( RULE_ID )
            // InternalBusinessDsl.g:3832:4: RULE_ID
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
    // InternalBusinessDsl.g:3843:1: rule__SimpleTypeCollection__CollectionAssignment_0 : ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__SimpleTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3847:1: ( ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalBusinessDsl.g:3848:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalBusinessDsl.g:3848:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalBusinessDsl.g:3849:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalBusinessDsl.g:3850:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            // InternalBusinessDsl.g:3850:4: rule__SimpleTypeCollection__CollectionAlternatives_0_0
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
    // InternalBusinessDsl.g:3858:1: rule__SimpleTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBusinessDsl.g:3862:1: ( ( ruleType ) )
            // InternalBusinessDsl.g:3863:2: ( ruleType )
            {
            // InternalBusinessDsl.g:3863:2: ( ruleType )
            // InternalBusinessDsl.g:3864:3: ruleType
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000080001FFF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000080001FFF2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000088001FFF0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000FF10L});

}