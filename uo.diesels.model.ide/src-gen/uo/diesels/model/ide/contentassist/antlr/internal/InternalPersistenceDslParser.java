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
import uo.diesels.model.services.PersistenceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_LIST", "RULE_SET", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Finder'", "'{'", "'}'", "'('", "')'", "','", "'#'", "'<'", "'>'", "'non-null'"
    };
    public static final int RULE_SET=6;
    public static final int RULE_STRING=16;
    public static final int RULE_TYPE_CHAR=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_TYPE_STRING=12;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_TYPE_INT=7;
    public static final int RULE_LIST=5;
    public static final int RULE_TYPE_LONG=10;
    public static final int RULE_ID=14;
    public static final int RULE_WS=19;
    public static final int RULE_TYPE_FLOAT=9;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_TYPE_BOOLEAN=13;
    public static final int RULE_DATE=4;
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


        public InternalPersistenceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersistenceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersistenceDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPersistenceDsl.g"; }


    	private PersistenceDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(PersistenceDslGrammarAccess grammarAccess) {
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
    // InternalPersistenceDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:54:1: ( ruleModel EOF )
            // InternalPersistenceDsl.g:55:1: ruleModel EOF
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
    // InternalPersistenceDsl.g:62:1: ruleModel : ( ( rule__Model__FinderAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:66:2: ( ( ( rule__Model__FinderAssignment )* ) )
            // InternalPersistenceDsl.g:67:2: ( ( rule__Model__FinderAssignment )* )
            {
            // InternalPersistenceDsl.g:67:2: ( ( rule__Model__FinderAssignment )* )
            // InternalPersistenceDsl.g:68:3: ( rule__Model__FinderAssignment )*
            {
             before(grammarAccess.getModelAccess().getFinderAssignment()); 
            // InternalPersistenceDsl.g:69:3: ( rule__Model__FinderAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPersistenceDsl.g:69:4: rule__Model__FinderAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FinderAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFinderAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFinder"
    // InternalPersistenceDsl.g:78:1: entryRuleFinder : ruleFinder EOF ;
    public final void entryRuleFinder() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:79:1: ( ruleFinder EOF )
            // InternalPersistenceDsl.g:80:1: ruleFinder EOF
            {
             before(grammarAccess.getFinderRule()); 
            pushFollow(FOLLOW_1);
            ruleFinder();

            state._fsp--;

             after(grammarAccess.getFinderRule()); 
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
    // $ANTLR end "entryRuleFinder"


    // $ANTLR start "ruleFinder"
    // InternalPersistenceDsl.g:87:1: ruleFinder : ( ( rule__Finder__Group__0 ) ) ;
    public final void ruleFinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:91:2: ( ( ( rule__Finder__Group__0 ) ) )
            // InternalPersistenceDsl.g:92:2: ( ( rule__Finder__Group__0 ) )
            {
            // InternalPersistenceDsl.g:92:2: ( ( rule__Finder__Group__0 ) )
            // InternalPersistenceDsl.g:93:3: ( rule__Finder__Group__0 )
            {
             before(grammarAccess.getFinderAccess().getGroup()); 
            // InternalPersistenceDsl.g:94:3: ( rule__Finder__Group__0 )
            // InternalPersistenceDsl.g:94:4: rule__Finder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Finder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinder"


    // $ANTLR start "entryRuleFinderMethod"
    // InternalPersistenceDsl.g:103:1: entryRuleFinderMethod : ruleFinderMethod EOF ;
    public final void entryRuleFinderMethod() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:104:1: ( ruleFinderMethod EOF )
            // InternalPersistenceDsl.g:105:1: ruleFinderMethod EOF
            {
             before(grammarAccess.getFinderMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleFinderMethod();

            state._fsp--;

             after(grammarAccess.getFinderMethodRule()); 
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
    // $ANTLR end "entryRuleFinderMethod"


    // $ANTLR start "ruleFinderMethod"
    // InternalPersistenceDsl.g:112:1: ruleFinderMethod : ( ( rule__FinderMethod__Alternatives ) ) ;
    public final void ruleFinderMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:116:2: ( ( ( rule__FinderMethod__Alternatives ) ) )
            // InternalPersistenceDsl.g:117:2: ( ( rule__FinderMethod__Alternatives ) )
            {
            // InternalPersistenceDsl.g:117:2: ( ( rule__FinderMethod__Alternatives ) )
            // InternalPersistenceDsl.g:118:3: ( rule__FinderMethod__Alternatives )
            {
             before(grammarAccess.getFinderMethodAccess().getAlternatives()); 
            // InternalPersistenceDsl.g:119:3: ( rule__FinderMethod__Alternatives )
            // InternalPersistenceDsl.g:119:4: rule__FinderMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FinderMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFinderMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinderMethod"


    // $ANTLR start "entryRuleMethodSimpleReturn"
    // InternalPersistenceDsl.g:128:1: entryRuleMethodSimpleReturn : ruleMethodSimpleReturn EOF ;
    public final void entryRuleMethodSimpleReturn() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:129:1: ( ruleMethodSimpleReturn EOF )
            // InternalPersistenceDsl.g:130:1: ruleMethodSimpleReturn EOF
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
    // InternalPersistenceDsl.g:137:1: ruleMethodSimpleReturn : ( ( rule__MethodSimpleReturn__Group__0 ) ) ;
    public final void ruleMethodSimpleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:141:2: ( ( ( rule__MethodSimpleReturn__Group__0 ) ) )
            // InternalPersistenceDsl.g:142:2: ( ( rule__MethodSimpleReturn__Group__0 ) )
            {
            // InternalPersistenceDsl.g:142:2: ( ( rule__MethodSimpleReturn__Group__0 ) )
            // InternalPersistenceDsl.g:143:3: ( rule__MethodSimpleReturn__Group__0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup()); 
            // InternalPersistenceDsl.g:144:3: ( rule__MethodSimpleReturn__Group__0 )
            // InternalPersistenceDsl.g:144:4: rule__MethodSimpleReturn__Group__0
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


    // $ANTLR start "entryRuleMethodEntityReturn"
    // InternalPersistenceDsl.g:153:1: entryRuleMethodEntityReturn : ruleMethodEntityReturn EOF ;
    public final void entryRuleMethodEntityReturn() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:154:1: ( ruleMethodEntityReturn EOF )
            // InternalPersistenceDsl.g:155:1: ruleMethodEntityReturn EOF
            {
             before(grammarAccess.getMethodEntityReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodEntityReturn();

            state._fsp--;

             after(grammarAccess.getMethodEntityReturnRule()); 
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
    // $ANTLR end "entryRuleMethodEntityReturn"


    // $ANTLR start "ruleMethodEntityReturn"
    // InternalPersistenceDsl.g:162:1: ruleMethodEntityReturn : ( ( rule__MethodEntityReturn__Group__0 ) ) ;
    public final void ruleMethodEntityReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:166:2: ( ( ( rule__MethodEntityReturn__Group__0 ) ) )
            // InternalPersistenceDsl.g:167:2: ( ( rule__MethodEntityReturn__Group__0 ) )
            {
            // InternalPersistenceDsl.g:167:2: ( ( rule__MethodEntityReturn__Group__0 ) )
            // InternalPersistenceDsl.g:168:3: ( rule__MethodEntityReturn__Group__0 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getGroup()); 
            // InternalPersistenceDsl.g:169:3: ( rule__MethodEntityReturn__Group__0 )
            // InternalPersistenceDsl.g:169:4: rule__MethodEntityReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodEntityReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodEntityReturn"


    // $ANTLR start "entryRuleMethodDtoReturn"
    // InternalPersistenceDsl.g:178:1: entryRuleMethodDtoReturn : ruleMethodDtoReturn EOF ;
    public final void entryRuleMethodDtoReturn() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:179:1: ( ruleMethodDtoReturn EOF )
            // InternalPersistenceDsl.g:180:1: ruleMethodDtoReturn EOF
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
    // InternalPersistenceDsl.g:187:1: ruleMethodDtoReturn : ( ( rule__MethodDtoReturn__Group__0 ) ) ;
    public final void ruleMethodDtoReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:191:2: ( ( ( rule__MethodDtoReturn__Group__0 ) ) )
            // InternalPersistenceDsl.g:192:2: ( ( rule__MethodDtoReturn__Group__0 ) )
            {
            // InternalPersistenceDsl.g:192:2: ( ( rule__MethodDtoReturn__Group__0 ) )
            // InternalPersistenceDsl.g:193:3: ( rule__MethodDtoReturn__Group__0 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup()); 
            // InternalPersistenceDsl.g:194:3: ( rule__MethodDtoReturn__Group__0 )
            // InternalPersistenceDsl.g:194:4: rule__MethodDtoReturn__Group__0
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
    // InternalPersistenceDsl.g:203:1: entryRuleMethodCollectionReturn : ruleMethodCollectionReturn EOF ;
    public final void entryRuleMethodCollectionReturn() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:204:1: ( ruleMethodCollectionReturn EOF )
            // InternalPersistenceDsl.g:205:1: ruleMethodCollectionReturn EOF
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
    // InternalPersistenceDsl.g:212:1: ruleMethodCollectionReturn : ( ( rule__MethodCollectionReturn__Group__0 ) ) ;
    public final void ruleMethodCollectionReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:216:2: ( ( ( rule__MethodCollectionReturn__Group__0 ) ) )
            // InternalPersistenceDsl.g:217:2: ( ( rule__MethodCollectionReturn__Group__0 ) )
            {
            // InternalPersistenceDsl.g:217:2: ( ( rule__MethodCollectionReturn__Group__0 ) )
            // InternalPersistenceDsl.g:218:3: ( rule__MethodCollectionReturn__Group__0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup()); 
            // InternalPersistenceDsl.g:219:3: ( rule__MethodCollectionReturn__Group__0 )
            // InternalPersistenceDsl.g:219:4: rule__MethodCollectionReturn__Group__0
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


    // $ANTLR start "entryRuleCollectionReturnType"
    // InternalPersistenceDsl.g:228:1: entryRuleCollectionReturnType : ruleCollectionReturnType EOF ;
    public final void entryRuleCollectionReturnType() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:229:1: ( ruleCollectionReturnType EOF )
            // InternalPersistenceDsl.g:230:1: ruleCollectionReturnType EOF
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
    // InternalPersistenceDsl.g:237:1: ruleCollectionReturnType : ( ( rule__CollectionReturnType__Alternatives ) ) ;
    public final void ruleCollectionReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:241:2: ( ( ( rule__CollectionReturnType__Alternatives ) ) )
            // InternalPersistenceDsl.g:242:2: ( ( rule__CollectionReturnType__Alternatives ) )
            {
            // InternalPersistenceDsl.g:242:2: ( ( rule__CollectionReturnType__Alternatives ) )
            // InternalPersistenceDsl.g:243:3: ( rule__CollectionReturnType__Alternatives )
            {
             before(grammarAccess.getCollectionReturnTypeAccess().getAlternatives()); 
            // InternalPersistenceDsl.g:244:3: ( rule__CollectionReturnType__Alternatives )
            // InternalPersistenceDsl.g:244:4: rule__CollectionReturnType__Alternatives
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


    // $ANTLR start "entryRuleEntityReturnTypeCollection"
    // InternalPersistenceDsl.g:253:1: entryRuleEntityReturnTypeCollection : ruleEntityReturnTypeCollection EOF ;
    public final void entryRuleEntityReturnTypeCollection() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:254:1: ( ruleEntityReturnTypeCollection EOF )
            // InternalPersistenceDsl.g:255:1: ruleEntityReturnTypeCollection EOF
            {
             before(grammarAccess.getEntityReturnTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityReturnTypeCollection();

            state._fsp--;

             after(grammarAccess.getEntityReturnTypeCollectionRule()); 
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
    // $ANTLR end "entryRuleEntityReturnTypeCollection"


    // $ANTLR start "ruleEntityReturnTypeCollection"
    // InternalPersistenceDsl.g:262:1: ruleEntityReturnTypeCollection : ( ( rule__EntityReturnTypeCollection__Group__0 ) ) ;
    public final void ruleEntityReturnTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:266:2: ( ( ( rule__EntityReturnTypeCollection__Group__0 ) ) )
            // InternalPersistenceDsl.g:267:2: ( ( rule__EntityReturnTypeCollection__Group__0 ) )
            {
            // InternalPersistenceDsl.g:267:2: ( ( rule__EntityReturnTypeCollection__Group__0 ) )
            // InternalPersistenceDsl.g:268:3: ( rule__EntityReturnTypeCollection__Group__0 )
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getGroup()); 
            // InternalPersistenceDsl.g:269:3: ( rule__EntityReturnTypeCollection__Group__0 )
            // InternalPersistenceDsl.g:269:4: rule__EntityReturnTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityReturnTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityReturnTypeCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityReturnTypeCollection"


    // $ANTLR start "entryRuleDtoReturnTypeCollection"
    // InternalPersistenceDsl.g:278:1: entryRuleDtoReturnTypeCollection : ruleDtoReturnTypeCollection EOF ;
    public final void entryRuleDtoReturnTypeCollection() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:279:1: ( ruleDtoReturnTypeCollection EOF )
            // InternalPersistenceDsl.g:280:1: ruleDtoReturnTypeCollection EOF
            {
             before(grammarAccess.getDtoReturnTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDtoReturnTypeCollection();

            state._fsp--;

             after(grammarAccess.getDtoReturnTypeCollectionRule()); 
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
    // $ANTLR end "entryRuleDtoReturnTypeCollection"


    // $ANTLR start "ruleDtoReturnTypeCollection"
    // InternalPersistenceDsl.g:287:1: ruleDtoReturnTypeCollection : ( ( rule__DtoReturnTypeCollection__Group__0 ) ) ;
    public final void ruleDtoReturnTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:291:2: ( ( ( rule__DtoReturnTypeCollection__Group__0 ) ) )
            // InternalPersistenceDsl.g:292:2: ( ( rule__DtoReturnTypeCollection__Group__0 ) )
            {
            // InternalPersistenceDsl.g:292:2: ( ( rule__DtoReturnTypeCollection__Group__0 ) )
            // InternalPersistenceDsl.g:293:3: ( rule__DtoReturnTypeCollection__Group__0 )
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getGroup()); 
            // InternalPersistenceDsl.g:294:3: ( rule__DtoReturnTypeCollection__Group__0 )
            // InternalPersistenceDsl.g:294:4: rule__DtoReturnTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDtoReturnTypeCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDtoReturnTypeCollection"


    // $ANTLR start "entryRuleSimpleReturnTypeCollection"
    // InternalPersistenceDsl.g:303:1: entryRuleSimpleReturnTypeCollection : ruleSimpleReturnTypeCollection EOF ;
    public final void entryRuleSimpleReturnTypeCollection() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:304:1: ( ruleSimpleReturnTypeCollection EOF )
            // InternalPersistenceDsl.g:305:1: ruleSimpleReturnTypeCollection EOF
            {
             before(grammarAccess.getSimpleReturnTypeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleReturnTypeCollection();

            state._fsp--;

             after(grammarAccess.getSimpleReturnTypeCollectionRule()); 
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
    // $ANTLR end "entryRuleSimpleReturnTypeCollection"


    // $ANTLR start "ruleSimpleReturnTypeCollection"
    // InternalPersistenceDsl.g:312:1: ruleSimpleReturnTypeCollection : ( ( rule__SimpleReturnTypeCollection__Group__0 ) ) ;
    public final void ruleSimpleReturnTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:316:2: ( ( ( rule__SimpleReturnTypeCollection__Group__0 ) ) )
            // InternalPersistenceDsl.g:317:2: ( ( rule__SimpleReturnTypeCollection__Group__0 ) )
            {
            // InternalPersistenceDsl.g:317:2: ( ( rule__SimpleReturnTypeCollection__Group__0 ) )
            // InternalPersistenceDsl.g:318:3: ( rule__SimpleReturnTypeCollection__Group__0 )
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getGroup()); 
            // InternalPersistenceDsl.g:319:3: ( rule__SimpleReturnTypeCollection__Group__0 )
            // InternalPersistenceDsl.g:319:4: rule__SimpleReturnTypeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleReturnTypeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleReturnTypeCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleReturnTypeCollection"


    // $ANTLR start "entryRuleAllModelTypeCollection"
    // InternalPersistenceDsl.g:328:1: entryRuleAllModelTypeCollection : ruleAllModelTypeCollection EOF ;
    public final void entryRuleAllModelTypeCollection() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:329:1: ( ruleAllModelTypeCollection EOF )
            // InternalPersistenceDsl.g:330:1: ruleAllModelTypeCollection EOF
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
    // InternalPersistenceDsl.g:337:1: ruleAllModelTypeCollection : ( ( rule__AllModelTypeCollection__Group__0 ) ) ;
    public final void ruleAllModelTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:341:2: ( ( ( rule__AllModelTypeCollection__Group__0 ) ) )
            // InternalPersistenceDsl.g:342:2: ( ( rule__AllModelTypeCollection__Group__0 ) )
            {
            // InternalPersistenceDsl.g:342:2: ( ( rule__AllModelTypeCollection__Group__0 ) )
            // InternalPersistenceDsl.g:343:3: ( rule__AllModelTypeCollection__Group__0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGroup()); 
            // InternalPersistenceDsl.g:344:3: ( rule__AllModelTypeCollection__Group__0 )
            // InternalPersistenceDsl.g:344:4: rule__AllModelTypeCollection__Group__0
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


    // $ANTLR start "entryRuleSimpleTypeCollection"
    // InternalPersistenceDsl.g:353:1: entryRuleSimpleTypeCollection : ruleSimpleTypeCollection EOF ;
    public final void entryRuleSimpleTypeCollection() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:354:1: ( ruleSimpleTypeCollection EOF )
            // InternalPersistenceDsl.g:355:1: ruleSimpleTypeCollection EOF
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
    // InternalPersistenceDsl.g:362:1: ruleSimpleTypeCollection : ( ( rule__SimpleTypeCollection__Group__0 ) ) ;
    public final void ruleSimpleTypeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:366:2: ( ( ( rule__SimpleTypeCollection__Group__0 ) ) )
            // InternalPersistenceDsl.g:367:2: ( ( rule__SimpleTypeCollection__Group__0 ) )
            {
            // InternalPersistenceDsl.g:367:2: ( ( rule__SimpleTypeCollection__Group__0 ) )
            // InternalPersistenceDsl.g:368:3: ( rule__SimpleTypeCollection__Group__0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGroup()); 
            // InternalPersistenceDsl.g:369:3: ( rule__SimpleTypeCollection__Group__0 )
            // InternalPersistenceDsl.g:369:4: rule__SimpleTypeCollection__Group__0
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


    // $ANTLR start "entryRuleDefVariable"
    // InternalPersistenceDsl.g:378:1: entryRuleDefVariable : ruleDefVariable EOF ;
    public final void entryRuleDefVariable() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:379:1: ( ruleDefVariable EOF )
            // InternalPersistenceDsl.g:380:1: ruleDefVariable EOF
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
    // InternalPersistenceDsl.g:387:1: ruleDefVariable : ( ( rule__DefVariable__Alternatives ) ) ;
    public final void ruleDefVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:391:2: ( ( ( rule__DefVariable__Alternatives ) ) )
            // InternalPersistenceDsl.g:392:2: ( ( rule__DefVariable__Alternatives ) )
            {
            // InternalPersistenceDsl.g:392:2: ( ( rule__DefVariable__Alternatives ) )
            // InternalPersistenceDsl.g:393:3: ( rule__DefVariable__Alternatives )
            {
             before(grammarAccess.getDefVariableAccess().getAlternatives()); 
            // InternalPersistenceDsl.g:394:3: ( rule__DefVariable__Alternatives )
            // InternalPersistenceDsl.g:394:4: rule__DefVariable__Alternatives
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
    // InternalPersistenceDsl.g:403:1: entryRuleDefAllModelTypeVariable : ruleDefAllModelTypeVariable EOF ;
    public final void entryRuleDefAllModelTypeVariable() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:404:1: ( ruleDefAllModelTypeVariable EOF )
            // InternalPersistenceDsl.g:405:1: ruleDefAllModelTypeVariable EOF
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
    // InternalPersistenceDsl.g:412:1: ruleDefAllModelTypeVariable : ( ( rule__DefAllModelTypeVariable__Group__0 ) ) ;
    public final void ruleDefAllModelTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:416:2: ( ( ( rule__DefAllModelTypeVariable__Group__0 ) ) )
            // InternalPersistenceDsl.g:417:2: ( ( rule__DefAllModelTypeVariable__Group__0 ) )
            {
            // InternalPersistenceDsl.g:417:2: ( ( rule__DefAllModelTypeVariable__Group__0 ) )
            // InternalPersistenceDsl.g:418:3: ( rule__DefAllModelTypeVariable__Group__0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getGroup()); 
            // InternalPersistenceDsl.g:419:3: ( rule__DefAllModelTypeVariable__Group__0 )
            // InternalPersistenceDsl.g:419:4: rule__DefAllModelTypeVariable__Group__0
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
    // InternalPersistenceDsl.g:428:1: entryRuleDefSimpleVariable : ruleDefSimpleVariable EOF ;
    public final void entryRuleDefSimpleVariable() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:429:1: ( ruleDefSimpleVariable EOF )
            // InternalPersistenceDsl.g:430:1: ruleDefSimpleVariable EOF
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
    // InternalPersistenceDsl.g:437:1: ruleDefSimpleVariable : ( ( rule__DefSimpleVariable__Group__0 ) ) ;
    public final void ruleDefSimpleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:441:2: ( ( ( rule__DefSimpleVariable__Group__0 ) ) )
            // InternalPersistenceDsl.g:442:2: ( ( rule__DefSimpleVariable__Group__0 ) )
            {
            // InternalPersistenceDsl.g:442:2: ( ( rule__DefSimpleVariable__Group__0 ) )
            // InternalPersistenceDsl.g:443:3: ( rule__DefSimpleVariable__Group__0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getGroup()); 
            // InternalPersistenceDsl.g:444:3: ( rule__DefSimpleVariable__Group__0 )
            // InternalPersistenceDsl.g:444:4: rule__DefSimpleVariable__Group__0
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
    // InternalPersistenceDsl.g:453:1: entryRuleDefCollectionTypeVariable : ruleDefCollectionTypeVariable EOF ;
    public final void entryRuleDefCollectionTypeVariable() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:454:1: ( ruleDefCollectionTypeVariable EOF )
            // InternalPersistenceDsl.g:455:1: ruleDefCollectionTypeVariable EOF
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
    // InternalPersistenceDsl.g:462:1: ruleDefCollectionTypeVariable : ( ( rule__DefCollectionTypeVariable__Alternatives ) ) ;
    public final void ruleDefCollectionTypeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:466:2: ( ( ( rule__DefCollectionTypeVariable__Alternatives ) ) )
            // InternalPersistenceDsl.g:467:2: ( ( rule__DefCollectionTypeVariable__Alternatives ) )
            {
            // InternalPersistenceDsl.g:467:2: ( ( rule__DefCollectionTypeVariable__Alternatives ) )
            // InternalPersistenceDsl.g:468:3: ( rule__DefCollectionTypeVariable__Alternatives )
            {
             before(grammarAccess.getDefCollectionTypeVariableAccess().getAlternatives()); 
            // InternalPersistenceDsl.g:469:3: ( rule__DefCollectionTypeVariable__Alternatives )
            // InternalPersistenceDsl.g:469:4: rule__DefCollectionTypeVariable__Alternatives
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
    // InternalPersistenceDsl.g:478:1: entryRuleDefAllModelTypeCollectionVariable : ruleDefAllModelTypeCollectionVariable EOF ;
    public final void entryRuleDefAllModelTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:479:1: ( ruleDefAllModelTypeCollectionVariable EOF )
            // InternalPersistenceDsl.g:480:1: ruleDefAllModelTypeCollectionVariable EOF
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
    // InternalPersistenceDsl.g:487:1: ruleDefAllModelTypeCollectionVariable : ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefAllModelTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:491:2: ( ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) ) )
            // InternalPersistenceDsl.g:492:2: ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) )
            {
            // InternalPersistenceDsl.g:492:2: ( ( rule__DefAllModelTypeCollectionVariable__Group__0 ) )
            // InternalPersistenceDsl.g:493:3: ( rule__DefAllModelTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getGroup()); 
            // InternalPersistenceDsl.g:494:3: ( rule__DefAllModelTypeCollectionVariable__Group__0 )
            // InternalPersistenceDsl.g:494:4: rule__DefAllModelTypeCollectionVariable__Group__0
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
    // InternalPersistenceDsl.g:503:1: entryRuleDefSimpleTypeCollectionVariable : ruleDefSimpleTypeCollectionVariable EOF ;
    public final void entryRuleDefSimpleTypeCollectionVariable() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:504:1: ( ruleDefSimpleTypeCollectionVariable EOF )
            // InternalPersistenceDsl.g:505:1: ruleDefSimpleTypeCollectionVariable EOF
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
    // InternalPersistenceDsl.g:512:1: ruleDefSimpleTypeCollectionVariable : ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) ) ;
    public final void ruleDefSimpleTypeCollectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:516:2: ( ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) ) )
            // InternalPersistenceDsl.g:517:2: ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) )
            {
            // InternalPersistenceDsl.g:517:2: ( ( rule__DefSimpleTypeCollectionVariable__Group__0 ) )
            // InternalPersistenceDsl.g:518:3: ( rule__DefSimpleTypeCollectionVariable__Group__0 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getGroup()); 
            // InternalPersistenceDsl.g:519:3: ( rule__DefSimpleTypeCollectionVariable__Group__0 )
            // InternalPersistenceDsl.g:519:4: rule__DefSimpleTypeCollectionVariable__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalPersistenceDsl.g:528:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:529:1: ( ruleType EOF )
            // InternalPersistenceDsl.g:530:1: ruleType EOF
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
    // InternalPersistenceDsl.g:537:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:541:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPersistenceDsl.g:542:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPersistenceDsl.g:542:2: ( ( rule__Type__Alternatives ) )
            // InternalPersistenceDsl.g:543:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPersistenceDsl.g:544:3: ( rule__Type__Alternatives )
            // InternalPersistenceDsl.g:544:4: rule__Type__Alternatives
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
    // InternalPersistenceDsl.g:553:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:554:1: ( ruleBasicType EOF )
            // InternalPersistenceDsl.g:555:1: ruleBasicType EOF
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
    // InternalPersistenceDsl.g:562:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:566:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalPersistenceDsl.g:567:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalPersistenceDsl.g:567:2: ( ( rule__BasicType__Alternatives ) )
            // InternalPersistenceDsl.g:568:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalPersistenceDsl.g:569:3: ( rule__BasicType__Alternatives )
            // InternalPersistenceDsl.g:569:4: rule__BasicType__Alternatives
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
    // InternalPersistenceDsl.g:578:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalPersistenceDsl.g:579:1: ( ruleComplexType EOF )
            // InternalPersistenceDsl.g:580:1: ruleComplexType EOF
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
    // InternalPersistenceDsl.g:587:1: ruleComplexType : ( RULE_DATE ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:591:2: ( ( RULE_DATE ) )
            // InternalPersistenceDsl.g:592:2: ( RULE_DATE )
            {
            // InternalPersistenceDsl.g:592:2: ( RULE_DATE )
            // InternalPersistenceDsl.g:593:3: RULE_DATE
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


    // $ANTLR start "rule__FinderMethod__Alternatives"
    // InternalPersistenceDsl.g:602:1: rule__FinderMethod__Alternatives : ( ( ruleMethodEntityReturn ) | ( ruleMethodDtoReturn ) | ( ruleMethodSimpleReturn ) | ( ruleMethodCollectionReturn ) );
    public final void rule__FinderMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:606:1: ( ( ruleMethodEntityReturn ) | ( ruleMethodDtoReturn ) | ( ruleMethodSimpleReturn ) | ( ruleMethodCollectionReturn ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
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
                alt2=3;
                }
                break;
            case RULE_LIST:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPersistenceDsl.g:607:2: ( ruleMethodEntityReturn )
                    {
                    // InternalPersistenceDsl.g:607:2: ( ruleMethodEntityReturn )
                    // InternalPersistenceDsl.g:608:3: ruleMethodEntityReturn
                    {
                     before(grammarAccess.getFinderMethodAccess().getMethodEntityReturnParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodEntityReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderMethodAccess().getMethodEntityReturnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:613:2: ( ruleMethodDtoReturn )
                    {
                    // InternalPersistenceDsl.g:613:2: ( ruleMethodDtoReturn )
                    // InternalPersistenceDsl.g:614:3: ruleMethodDtoReturn
                    {
                     before(grammarAccess.getFinderMethodAccess().getMethodDtoReturnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodDtoReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderMethodAccess().getMethodDtoReturnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:619:2: ( ruleMethodSimpleReturn )
                    {
                    // InternalPersistenceDsl.g:619:2: ( ruleMethodSimpleReturn )
                    // InternalPersistenceDsl.g:620:3: ruleMethodSimpleReturn
                    {
                     before(grammarAccess.getFinderMethodAccess().getMethodSimpleReturnParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodSimpleReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderMethodAccess().getMethodSimpleReturnParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPersistenceDsl.g:625:2: ( ruleMethodCollectionReturn )
                    {
                    // InternalPersistenceDsl.g:625:2: ( ruleMethodCollectionReturn )
                    // InternalPersistenceDsl.g:626:3: ruleMethodCollectionReturn
                    {
                     before(grammarAccess.getFinderMethodAccess().getMethodCollectionReturnParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodCollectionReturn();

                    state._fsp--;

                     after(grammarAccess.getFinderMethodAccess().getMethodCollectionReturnParserRuleCall_3()); 

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
    // $ANTLR end "rule__FinderMethod__Alternatives"


    // $ANTLR start "rule__CollectionReturnType__Alternatives"
    // InternalPersistenceDsl.g:635:1: rule__CollectionReturnType__Alternatives : ( ( ruleEntityReturnTypeCollection ) | ( ruleDtoReturnTypeCollection ) | ( ruleSimpleReturnTypeCollection ) );
    public final void rule__CollectionReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:639:1: ( ( ruleEntityReturnTypeCollection ) | ( ruleDtoReturnTypeCollection ) | ( ruleSimpleReturnTypeCollection ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LIST) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28) ) {
                    switch ( input.LA(3) ) {
                    case RULE_DATE:
                    case RULE_TYPE_INT:
                    case RULE_TYPE_DOUBLE:
                    case RULE_TYPE_FLOAT:
                    case RULE_TYPE_LONG:
                    case RULE_TYPE_CHAR:
                    case RULE_TYPE_STRING:
                    case RULE_TYPE_BOOLEAN:
                        {
                        alt3=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt3=1;
                        }
                        break;
                    case 27:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPersistenceDsl.g:640:2: ( ruleEntityReturnTypeCollection )
                    {
                    // InternalPersistenceDsl.g:640:2: ( ruleEntityReturnTypeCollection )
                    // InternalPersistenceDsl.g:641:3: ruleEntityReturnTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getEntityReturnTypeCollectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityReturnTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getEntityReturnTypeCollectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:646:2: ( ruleDtoReturnTypeCollection )
                    {
                    // InternalPersistenceDsl.g:646:2: ( ruleDtoReturnTypeCollection )
                    // InternalPersistenceDsl.g:647:3: ruleDtoReturnTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getDtoReturnTypeCollectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDtoReturnTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getDtoReturnTypeCollectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:652:2: ( ruleSimpleReturnTypeCollection )
                    {
                    // InternalPersistenceDsl.g:652:2: ( ruleSimpleReturnTypeCollection )
                    // InternalPersistenceDsl.g:653:3: ruleSimpleReturnTypeCollection
                    {
                     before(grammarAccess.getCollectionReturnTypeAccess().getSimpleReturnTypeCollectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleReturnTypeCollection();

                    state._fsp--;

                     after(grammarAccess.getCollectionReturnTypeAccess().getSimpleReturnTypeCollectionParserRuleCall_2()); 

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
    // InternalPersistenceDsl.g:662:1: rule__AllModelTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__AllModelTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:666:1: ( ( RULE_LIST ) | ( RULE_SET ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LIST) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SET) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPersistenceDsl.g:667:2: ( RULE_LIST )
                    {
                    // InternalPersistenceDsl.g:667:2: ( RULE_LIST )
                    // InternalPersistenceDsl.g:668:3: RULE_LIST
                    {
                     before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:673:2: ( RULE_SET )
                    {
                    // InternalPersistenceDsl.g:673:2: ( RULE_SET )
                    // InternalPersistenceDsl.g:674:3: RULE_SET
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


    // $ANTLR start "rule__SimpleTypeCollection__CollectionAlternatives_0_0"
    // InternalPersistenceDsl.g:683:1: rule__SimpleTypeCollection__CollectionAlternatives_0_0 : ( ( RULE_LIST ) | ( RULE_SET ) );
    public final void rule__SimpleTypeCollection__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:687:1: ( ( RULE_LIST ) | ( RULE_SET ) )
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
                    // InternalPersistenceDsl.g:688:2: ( RULE_LIST )
                    {
                    // InternalPersistenceDsl.g:688:2: ( RULE_LIST )
                    // InternalPersistenceDsl.g:689:3: RULE_LIST
                    {
                     before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LIST,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:694:2: ( RULE_SET )
                    {
                    // InternalPersistenceDsl.g:694:2: ( RULE_SET )
                    // InternalPersistenceDsl.g:695:3: RULE_SET
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


    // $ANTLR start "rule__DefVariable__Alternatives"
    // InternalPersistenceDsl.g:704:1: rule__DefVariable__Alternatives : ( ( ruleDefSimpleVariable ) | ( ruleDefAllModelTypeVariable ) | ( ruleDefCollectionTypeVariable ) );
    public final void rule__DefVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:708:1: ( ( ruleDefSimpleVariable ) | ( ruleDefAllModelTypeVariable ) | ( ruleDefCollectionTypeVariable ) )
            int alt6=3;
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
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_LIST:
            case RULE_SET:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPersistenceDsl.g:709:2: ( ruleDefSimpleVariable )
                    {
                    // InternalPersistenceDsl.g:709:2: ( ruleDefSimpleVariable )
                    // InternalPersistenceDsl.g:710:3: ruleDefSimpleVariable
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
                    // InternalPersistenceDsl.g:715:2: ( ruleDefAllModelTypeVariable )
                    {
                    // InternalPersistenceDsl.g:715:2: ( ruleDefAllModelTypeVariable )
                    // InternalPersistenceDsl.g:716:3: ruleDefAllModelTypeVariable
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
                    // InternalPersistenceDsl.g:721:2: ( ruleDefCollectionTypeVariable )
                    {
                    // InternalPersistenceDsl.g:721:2: ( ruleDefCollectionTypeVariable )
                    // InternalPersistenceDsl.g:722:3: ruleDefCollectionTypeVariable
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


    // $ANTLR start "rule__DefCollectionTypeVariable__Alternatives"
    // InternalPersistenceDsl.g:731:1: rule__DefCollectionTypeVariable__Alternatives : ( ( ruleDefAllModelTypeCollectionVariable ) | ( ruleDefSimpleTypeCollectionVariable ) );
    public final void rule__DefCollectionTypeVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:735:1: ( ( ruleDefAllModelTypeCollectionVariable ) | ( ruleDefSimpleTypeCollectionVariable ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LIST) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==28) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_DATE||(LA7_3>=RULE_TYPE_INT && LA7_3<=RULE_TYPE_BOOLEAN)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==RULE_ID) ) {
                        alt7=1;
                    }
                    else {
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

                if ( (LA7_2==28) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_DATE||(LA7_3>=RULE_TYPE_INT && LA7_3<=RULE_TYPE_BOOLEAN)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==RULE_ID) ) {
                        alt7=1;
                    }
                    else {
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
                    // InternalPersistenceDsl.g:736:2: ( ruleDefAllModelTypeCollectionVariable )
                    {
                    // InternalPersistenceDsl.g:736:2: ( ruleDefAllModelTypeCollectionVariable )
                    // InternalPersistenceDsl.g:737:3: ruleDefAllModelTypeCollectionVariable
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
                    // InternalPersistenceDsl.g:742:2: ( ruleDefSimpleTypeCollectionVariable )
                    {
                    // InternalPersistenceDsl.g:742:2: ( ruleDefSimpleTypeCollectionVariable )
                    // InternalPersistenceDsl.g:743:3: ruleDefSimpleTypeCollectionVariable
                    {
                     before(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefSimpleTypeCollectionVariable();

                    state._fsp--;

                     after(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_1()); 

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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPersistenceDsl.g:752:1: rule__Type__Alternatives : ( ( ruleBasicType ) | ( ruleComplexType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:756:1: ( ( ruleBasicType ) | ( ruleComplexType ) )
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
                    // InternalPersistenceDsl.g:757:2: ( ruleBasicType )
                    {
                    // InternalPersistenceDsl.g:757:2: ( ruleBasicType )
                    // InternalPersistenceDsl.g:758:3: ruleBasicType
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
                    // InternalPersistenceDsl.g:763:2: ( ruleComplexType )
                    {
                    // InternalPersistenceDsl.g:763:2: ( ruleComplexType )
                    // InternalPersistenceDsl.g:764:3: ruleComplexType
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
    // InternalPersistenceDsl.g:773:1: rule__BasicType__Alternatives : ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:777:1: ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) )
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
                    // InternalPersistenceDsl.g:778:2: ( RULE_TYPE_INT )
                    {
                    // InternalPersistenceDsl.g:778:2: ( RULE_TYPE_INT )
                    // InternalPersistenceDsl.g:779:3: RULE_TYPE_INT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 
                    match(input,RULE_TYPE_INT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistenceDsl.g:784:2: ( RULE_TYPE_DOUBLE )
                    {
                    // InternalPersistenceDsl.g:784:2: ( RULE_TYPE_DOUBLE )
                    // InternalPersistenceDsl.g:785:3: RULE_TYPE_DOUBLE
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_TYPE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPersistenceDsl.g:790:2: ( RULE_TYPE_FLOAT )
                    {
                    // InternalPersistenceDsl.g:790:2: ( RULE_TYPE_FLOAT )
                    // InternalPersistenceDsl.g:791:3: RULE_TYPE_FLOAT
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 
                    match(input,RULE_TYPE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPersistenceDsl.g:796:2: ( RULE_TYPE_LONG )
                    {
                    // InternalPersistenceDsl.g:796:2: ( RULE_TYPE_LONG )
                    // InternalPersistenceDsl.g:797:3: RULE_TYPE_LONG
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 
                    match(input,RULE_TYPE_LONG,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPersistenceDsl.g:802:2: ( RULE_TYPE_CHAR )
                    {
                    // InternalPersistenceDsl.g:802:2: ( RULE_TYPE_CHAR )
                    // InternalPersistenceDsl.g:803:3: RULE_TYPE_CHAR
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 
                    match(input,RULE_TYPE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPersistenceDsl.g:808:2: ( RULE_TYPE_STRING )
                    {
                    // InternalPersistenceDsl.g:808:2: ( RULE_TYPE_STRING )
                    // InternalPersistenceDsl.g:809:3: RULE_TYPE_STRING
                    {
                     before(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 
                    match(input,RULE_TYPE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPersistenceDsl.g:814:2: ( RULE_TYPE_BOOLEAN )
                    {
                    // InternalPersistenceDsl.g:814:2: ( RULE_TYPE_BOOLEAN )
                    // InternalPersistenceDsl.g:815:3: RULE_TYPE_BOOLEAN
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


    // $ANTLR start "rule__Finder__Group__0"
    // InternalPersistenceDsl.g:824:1: rule__Finder__Group__0 : rule__Finder__Group__0__Impl rule__Finder__Group__1 ;
    public final void rule__Finder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:828:1: ( rule__Finder__Group__0__Impl rule__Finder__Group__1 )
            // InternalPersistenceDsl.g:829:2: rule__Finder__Group__0__Impl rule__Finder__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Finder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Finder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__0"


    // $ANTLR start "rule__Finder__Group__0__Impl"
    // InternalPersistenceDsl.g:836:1: rule__Finder__Group__0__Impl : ( 'Finder' ) ;
    public final void rule__Finder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:840:1: ( ( 'Finder' ) )
            // InternalPersistenceDsl.g:841:1: ( 'Finder' )
            {
            // InternalPersistenceDsl.g:841:1: ( 'Finder' )
            // InternalPersistenceDsl.g:842:2: 'Finder'
            {
             before(grammarAccess.getFinderAccess().getFinderKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFinderAccess().getFinderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__0__Impl"


    // $ANTLR start "rule__Finder__Group__1"
    // InternalPersistenceDsl.g:851:1: rule__Finder__Group__1 : rule__Finder__Group__1__Impl rule__Finder__Group__2 ;
    public final void rule__Finder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:855:1: ( rule__Finder__Group__1__Impl rule__Finder__Group__2 )
            // InternalPersistenceDsl.g:856:2: rule__Finder__Group__1__Impl rule__Finder__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Finder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Finder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__1"


    // $ANTLR start "rule__Finder__Group__1__Impl"
    // InternalPersistenceDsl.g:863:1: rule__Finder__Group__1__Impl : ( ( rule__Finder__NameAssignment_1 ) ) ;
    public final void rule__Finder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:867:1: ( ( ( rule__Finder__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:868:1: ( ( rule__Finder__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:868:1: ( ( rule__Finder__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:869:2: ( rule__Finder__NameAssignment_1 )
            {
             before(grammarAccess.getFinderAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:870:2: ( rule__Finder__NameAssignment_1 )
            // InternalPersistenceDsl.g:870:3: rule__Finder__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Finder__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFinderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__1__Impl"


    // $ANTLR start "rule__Finder__Group__2"
    // InternalPersistenceDsl.g:878:1: rule__Finder__Group__2 : rule__Finder__Group__2__Impl rule__Finder__Group__3 ;
    public final void rule__Finder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:882:1: ( rule__Finder__Group__2__Impl rule__Finder__Group__3 )
            // InternalPersistenceDsl.g:883:2: rule__Finder__Group__2__Impl rule__Finder__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Finder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Finder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__2"


    // $ANTLR start "rule__Finder__Group__2__Impl"
    // InternalPersistenceDsl.g:890:1: rule__Finder__Group__2__Impl : ( '{' ) ;
    public final void rule__Finder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:894:1: ( ( '{' ) )
            // InternalPersistenceDsl.g:895:1: ( '{' )
            {
            // InternalPersistenceDsl.g:895:1: ( '{' )
            // InternalPersistenceDsl.g:896:2: '{'
            {
             before(grammarAccess.getFinderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFinderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__2__Impl"


    // $ANTLR start "rule__Finder__Group__3"
    // InternalPersistenceDsl.g:905:1: rule__Finder__Group__3 : rule__Finder__Group__3__Impl rule__Finder__Group__4 ;
    public final void rule__Finder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:909:1: ( rule__Finder__Group__3__Impl rule__Finder__Group__4 )
            // InternalPersistenceDsl.g:910:2: rule__Finder__Group__3__Impl rule__Finder__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Finder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Finder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__3"


    // $ANTLR start "rule__Finder__Group__3__Impl"
    // InternalPersistenceDsl.g:917:1: rule__Finder__Group__3__Impl : ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) ) ;
    public final void rule__Finder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:921:1: ( ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) ) )
            // InternalPersistenceDsl.g:922:1: ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) )
            {
            // InternalPersistenceDsl.g:922:1: ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) )
            // InternalPersistenceDsl.g:923:2: ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* )
            {
            // InternalPersistenceDsl.g:923:2: ( ( rule__Finder__MethodsAssignment_3 ) )
            // InternalPersistenceDsl.g:924:3: ( rule__Finder__MethodsAssignment_3 )
            {
             before(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 
            // InternalPersistenceDsl.g:925:3: ( rule__Finder__MethodsAssignment_3 )
            // InternalPersistenceDsl.g:925:4: rule__Finder__MethodsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Finder__MethodsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 

            }

            // InternalPersistenceDsl.g:928:2: ( ( rule__Finder__MethodsAssignment_3 )* )
            // InternalPersistenceDsl.g:929:3: ( rule__Finder__MethodsAssignment_3 )*
            {
             before(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 
            // InternalPersistenceDsl.g:930:3: ( rule__Finder__MethodsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_DATE && LA10_0<=RULE_LIST)||(LA10_0>=RULE_TYPE_INT && LA10_0<=RULE_ID)||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPersistenceDsl.g:930:4: rule__Finder__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Finder__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 

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
    // $ANTLR end "rule__Finder__Group__3__Impl"


    // $ANTLR start "rule__Finder__Group__4"
    // InternalPersistenceDsl.g:939:1: rule__Finder__Group__4 : rule__Finder__Group__4__Impl ;
    public final void rule__Finder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:943:1: ( rule__Finder__Group__4__Impl )
            // InternalPersistenceDsl.g:944:2: rule__Finder__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Finder__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__4"


    // $ANTLR start "rule__Finder__Group__4__Impl"
    // InternalPersistenceDsl.g:950:1: rule__Finder__Group__4__Impl : ( '}' ) ;
    public final void rule__Finder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:954:1: ( ( '}' ) )
            // InternalPersistenceDsl.g:955:1: ( '}' )
            {
            // InternalPersistenceDsl.g:955:1: ( '}' )
            // InternalPersistenceDsl.g:956:2: '}'
            {
             before(grammarAccess.getFinderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFinderAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__Group__4__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group__0"
    // InternalPersistenceDsl.g:966:1: rule__MethodSimpleReturn__Group__0 : rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 ;
    public final void rule__MethodSimpleReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:970:1: ( rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 )
            // InternalPersistenceDsl.g:971:2: rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1
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
    // InternalPersistenceDsl.g:978:1: rule__MethodSimpleReturn__Group__0__Impl : ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:982:1: ( ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:983:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:983:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            // InternalPersistenceDsl.g:984:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0()); 
            // InternalPersistenceDsl.g:985:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            // InternalPersistenceDsl.g:985:3: rule__MethodSimpleReturn__ReturnTypeAssignment_0
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
    // InternalPersistenceDsl.g:993:1: rule__MethodSimpleReturn__Group__1 : rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 ;
    public final void rule__MethodSimpleReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:997:1: ( rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 )
            // InternalPersistenceDsl.g:998:2: rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2
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
    // InternalPersistenceDsl.g:1005:1: rule__MethodSimpleReturn__Group__1__Impl : ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1009:1: ( ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1010:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1010:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:1011:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:1012:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            // InternalPersistenceDsl.g:1012:3: rule__MethodSimpleReturn__NameAssignment_1
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
    // InternalPersistenceDsl.g:1020:1: rule__MethodSimpleReturn__Group__2 : rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 ;
    public final void rule__MethodSimpleReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1024:1: ( rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 )
            // InternalPersistenceDsl.g:1025:2: rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalPersistenceDsl.g:1032:1: rule__MethodSimpleReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodSimpleReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1036:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1037:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1037:1: ( '(' )
            // InternalPersistenceDsl.g:1038:2: '('
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1047:1: rule__MethodSimpleReturn__Group__3 : rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 ;
    public final void rule__MethodSimpleReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1051:1: ( rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 )
            // InternalPersistenceDsl.g:1052:2: rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalPersistenceDsl.g:1059:1: rule__MethodSimpleReturn__Group__3__Impl : ( ( rule__MethodSimpleReturn__Group_3__0 )? ) ;
    public final void rule__MethodSimpleReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1063:1: ( ( ( rule__MethodSimpleReturn__Group_3__0 )? ) )
            // InternalPersistenceDsl.g:1064:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            {
            // InternalPersistenceDsl.g:1064:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            // InternalPersistenceDsl.g:1065:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3()); 
            // InternalPersistenceDsl.g:1066:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_DATE && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPersistenceDsl.g:1066:3: rule__MethodSimpleReturn__Group_3__0
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
    // InternalPersistenceDsl.g:1074:1: rule__MethodSimpleReturn__Group__4 : rule__MethodSimpleReturn__Group__4__Impl rule__MethodSimpleReturn__Group__5 ;
    public final void rule__MethodSimpleReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1078:1: ( rule__MethodSimpleReturn__Group__4__Impl rule__MethodSimpleReturn__Group__5 )
            // InternalPersistenceDsl.g:1079:2: rule__MethodSimpleReturn__Group__4__Impl rule__MethodSimpleReturn__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MethodSimpleReturn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__5();

            state._fsp--;


            }

        }
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
    // InternalPersistenceDsl.g:1086:1: rule__MethodSimpleReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodSimpleReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1090:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1091:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1091:1: ( ')' )
            // InternalPersistenceDsl.g:1092:2: ')'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__MethodSimpleReturn__Group__5"
    // InternalPersistenceDsl.g:1101:1: rule__MethodSimpleReturn__Group__5 : rule__MethodSimpleReturn__Group__5__Impl ;
    public final void rule__MethodSimpleReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1105:1: ( rule__MethodSimpleReturn__Group__5__Impl )
            // InternalPersistenceDsl.g:1106:2: rule__MethodSimpleReturn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodSimpleReturn__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__5"


    // $ANTLR start "rule__MethodSimpleReturn__Group__5__Impl"
    // InternalPersistenceDsl.g:1112:1: rule__MethodSimpleReturn__Group__5__Impl : ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? ) ;
    public final void rule__MethodSimpleReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1116:1: ( ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? ) )
            // InternalPersistenceDsl.g:1117:1: ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? )
            {
            // InternalPersistenceDsl.g:1117:1: ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? )
            // InternalPersistenceDsl.g:1118:2: ( rule__MethodSimpleReturn__NullableAssignment_5 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNullableAssignment_5()); 
            // InternalPersistenceDsl.g:1119:2: ( rule__MethodSimpleReturn__NullableAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPersistenceDsl.g:1119:3: rule__MethodSimpleReturn__NullableAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodSimpleReturn__NullableAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodSimpleReturnAccess().getNullableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__Group__5__Impl"


    // $ANTLR start "rule__MethodSimpleReturn__Group_3__0"
    // InternalPersistenceDsl.g:1128:1: rule__MethodSimpleReturn__Group_3__0 : rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 ;
    public final void rule__MethodSimpleReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1132:1: ( rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 )
            // InternalPersistenceDsl.g:1133:2: rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPersistenceDsl.g:1140:1: rule__MethodSimpleReturn__Group_3__0__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1144:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) )
            // InternalPersistenceDsl.g:1145:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            {
            // InternalPersistenceDsl.g:1145:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            // InternalPersistenceDsl.g:1146:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0()); 
            // InternalPersistenceDsl.g:1147:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            // InternalPersistenceDsl.g:1147:3: rule__MethodSimpleReturn__ParametersAssignment_3_0
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
    // InternalPersistenceDsl.g:1155:1: rule__MethodSimpleReturn__Group_3__1 : rule__MethodSimpleReturn__Group_3__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1159:1: ( rule__MethodSimpleReturn__Group_3__1__Impl )
            // InternalPersistenceDsl.g:1160:2: rule__MethodSimpleReturn__Group_3__1__Impl
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
    // InternalPersistenceDsl.g:1166:1: rule__MethodSimpleReturn__Group_3__1__Impl : ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodSimpleReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1170:1: ( ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) )
            // InternalPersistenceDsl.g:1171:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            {
            // InternalPersistenceDsl.g:1171:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            // InternalPersistenceDsl.g:1172:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1()); 
            // InternalPersistenceDsl.g:1173:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1173:3: rule__MethodSimpleReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MethodSimpleReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalPersistenceDsl.g:1182:1: rule__MethodSimpleReturn__Group_3_1__0 : rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 ;
    public final void rule__MethodSimpleReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1186:1: ( rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 )
            // InternalPersistenceDsl.g:1187:2: rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1
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
    // InternalPersistenceDsl.g:1194:1: rule__MethodSimpleReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1198:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:1199:1: ( ',' )
            {
            // InternalPersistenceDsl.g:1199:1: ( ',' )
            // InternalPersistenceDsl.g:1200:2: ','
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1209:1: rule__MethodSimpleReturn__Group_3_1__1 : rule__MethodSimpleReturn__Group_3_1__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1213:1: ( rule__MethodSimpleReturn__Group_3_1__1__Impl )
            // InternalPersistenceDsl.g:1214:2: rule__MethodSimpleReturn__Group_3_1__1__Impl
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
    // InternalPersistenceDsl.g:1220:1: rule__MethodSimpleReturn__Group_3_1__1__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1224:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalPersistenceDsl.g:1225:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalPersistenceDsl.g:1225:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            // InternalPersistenceDsl.g:1226:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalPersistenceDsl.g:1227:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            // InternalPersistenceDsl.g:1227:3: rule__MethodSimpleReturn__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__MethodEntityReturn__Group__0"
    // InternalPersistenceDsl.g:1236:1: rule__MethodEntityReturn__Group__0 : rule__MethodEntityReturn__Group__0__Impl rule__MethodEntityReturn__Group__1 ;
    public final void rule__MethodEntityReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1240:1: ( rule__MethodEntityReturn__Group__0__Impl rule__MethodEntityReturn__Group__1 )
            // InternalPersistenceDsl.g:1241:2: rule__MethodEntityReturn__Group__0__Impl rule__MethodEntityReturn__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MethodEntityReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__0"


    // $ANTLR start "rule__MethodEntityReturn__Group__0__Impl"
    // InternalPersistenceDsl.g:1248:1: rule__MethodEntityReturn__Group__0__Impl : ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodEntityReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1252:1: ( ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:1253:1: ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:1253:1: ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) )
            // InternalPersistenceDsl.g:1254:2: ( rule__MethodEntityReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getReturnTypeAssignment_0()); 
            // InternalPersistenceDsl.g:1255:2: ( rule__MethodEntityReturn__ReturnTypeAssignment_0 )
            // InternalPersistenceDsl.g:1255:3: rule__MethodEntityReturn__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodEntityReturnAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__0__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group__1"
    // InternalPersistenceDsl.g:1263:1: rule__MethodEntityReturn__Group__1 : rule__MethodEntityReturn__Group__1__Impl rule__MethodEntityReturn__Group__2 ;
    public final void rule__MethodEntityReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1267:1: ( rule__MethodEntityReturn__Group__1__Impl rule__MethodEntityReturn__Group__2 )
            // InternalPersistenceDsl.g:1268:2: rule__MethodEntityReturn__Group__1__Impl rule__MethodEntityReturn__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MethodEntityReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__1"


    // $ANTLR start "rule__MethodEntityReturn__Group__1__Impl"
    // InternalPersistenceDsl.g:1275:1: rule__MethodEntityReturn__Group__1__Impl : ( ( rule__MethodEntityReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodEntityReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1279:1: ( ( ( rule__MethodEntityReturn__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1280:1: ( ( rule__MethodEntityReturn__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1280:1: ( ( rule__MethodEntityReturn__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:1281:2: ( rule__MethodEntityReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:1282:2: ( rule__MethodEntityReturn__NameAssignment_1 )
            // InternalPersistenceDsl.g:1282:3: rule__MethodEntityReturn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodEntityReturnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__1__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group__2"
    // InternalPersistenceDsl.g:1290:1: rule__MethodEntityReturn__Group__2 : rule__MethodEntityReturn__Group__2__Impl rule__MethodEntityReturn__Group__3 ;
    public final void rule__MethodEntityReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1294:1: ( rule__MethodEntityReturn__Group__2__Impl rule__MethodEntityReturn__Group__3 )
            // InternalPersistenceDsl.g:1295:2: rule__MethodEntityReturn__Group__2__Impl rule__MethodEntityReturn__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MethodEntityReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__2"


    // $ANTLR start "rule__MethodEntityReturn__Group__2__Impl"
    // InternalPersistenceDsl.g:1302:1: rule__MethodEntityReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodEntityReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1306:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1307:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1307:1: ( '(' )
            // InternalPersistenceDsl.g:1308:2: '('
            {
             before(grammarAccess.getMethodEntityReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodEntityReturnAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__2__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group__3"
    // InternalPersistenceDsl.g:1317:1: rule__MethodEntityReturn__Group__3 : rule__MethodEntityReturn__Group__3__Impl rule__MethodEntityReturn__Group__4 ;
    public final void rule__MethodEntityReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1321:1: ( rule__MethodEntityReturn__Group__3__Impl rule__MethodEntityReturn__Group__4 )
            // InternalPersistenceDsl.g:1322:2: rule__MethodEntityReturn__Group__3__Impl rule__MethodEntityReturn__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MethodEntityReturn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__3"


    // $ANTLR start "rule__MethodEntityReturn__Group__3__Impl"
    // InternalPersistenceDsl.g:1329:1: rule__MethodEntityReturn__Group__3__Impl : ( ( rule__MethodEntityReturn__Group_3__0 )? ) ;
    public final void rule__MethodEntityReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1333:1: ( ( ( rule__MethodEntityReturn__Group_3__0 )? ) )
            // InternalPersistenceDsl.g:1334:1: ( ( rule__MethodEntityReturn__Group_3__0 )? )
            {
            // InternalPersistenceDsl.g:1334:1: ( ( rule__MethodEntityReturn__Group_3__0 )? )
            // InternalPersistenceDsl.g:1335:2: ( rule__MethodEntityReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodEntityReturnAccess().getGroup_3()); 
            // InternalPersistenceDsl.g:1336:2: ( rule__MethodEntityReturn__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_DATE && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPersistenceDsl.g:1336:3: rule__MethodEntityReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodEntityReturn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodEntityReturnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__3__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group__4"
    // InternalPersistenceDsl.g:1344:1: rule__MethodEntityReturn__Group__4 : rule__MethodEntityReturn__Group__4__Impl rule__MethodEntityReturn__Group__5 ;
    public final void rule__MethodEntityReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1348:1: ( rule__MethodEntityReturn__Group__4__Impl rule__MethodEntityReturn__Group__5 )
            // InternalPersistenceDsl.g:1349:2: rule__MethodEntityReturn__Group__4__Impl rule__MethodEntityReturn__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MethodEntityReturn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__4"


    // $ANTLR start "rule__MethodEntityReturn__Group__4__Impl"
    // InternalPersistenceDsl.g:1356:1: rule__MethodEntityReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodEntityReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1360:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1361:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1361:1: ( ')' )
            // InternalPersistenceDsl.g:1362:2: ')'
            {
             before(grammarAccess.getMethodEntityReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodEntityReturnAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__4__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group__5"
    // InternalPersistenceDsl.g:1371:1: rule__MethodEntityReturn__Group__5 : rule__MethodEntityReturn__Group__5__Impl ;
    public final void rule__MethodEntityReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1375:1: ( rule__MethodEntityReturn__Group__5__Impl )
            // InternalPersistenceDsl.g:1376:2: rule__MethodEntityReturn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__5"


    // $ANTLR start "rule__MethodEntityReturn__Group__5__Impl"
    // InternalPersistenceDsl.g:1382:1: rule__MethodEntityReturn__Group__5__Impl : ( ( rule__MethodEntityReturn__NullableAssignment_5 )? ) ;
    public final void rule__MethodEntityReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1386:1: ( ( ( rule__MethodEntityReturn__NullableAssignment_5 )? ) )
            // InternalPersistenceDsl.g:1387:1: ( ( rule__MethodEntityReturn__NullableAssignment_5 )? )
            {
            // InternalPersistenceDsl.g:1387:1: ( ( rule__MethodEntityReturn__NullableAssignment_5 )? )
            // InternalPersistenceDsl.g:1388:2: ( rule__MethodEntityReturn__NullableAssignment_5 )?
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNullableAssignment_5()); 
            // InternalPersistenceDsl.g:1389:2: ( rule__MethodEntityReturn__NullableAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPersistenceDsl.g:1389:3: rule__MethodEntityReturn__NullableAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodEntityReturn__NullableAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodEntityReturnAccess().getNullableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group__5__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group_3__0"
    // InternalPersistenceDsl.g:1398:1: rule__MethodEntityReturn__Group_3__0 : rule__MethodEntityReturn__Group_3__0__Impl rule__MethodEntityReturn__Group_3__1 ;
    public final void rule__MethodEntityReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1402:1: ( rule__MethodEntityReturn__Group_3__0__Impl rule__MethodEntityReturn__Group_3__1 )
            // InternalPersistenceDsl.g:1403:2: rule__MethodEntityReturn__Group_3__0__Impl rule__MethodEntityReturn__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__MethodEntityReturn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3__0"


    // $ANTLR start "rule__MethodEntityReturn__Group_3__0__Impl"
    // InternalPersistenceDsl.g:1410:1: rule__MethodEntityReturn__Group_3__0__Impl : ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodEntityReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1414:1: ( ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) ) )
            // InternalPersistenceDsl.g:1415:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) )
            {
            // InternalPersistenceDsl.g:1415:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) )
            // InternalPersistenceDsl.g:1416:2: ( rule__MethodEntityReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getParametersAssignment_3_0()); 
            // InternalPersistenceDsl.g:1417:2: ( rule__MethodEntityReturn__ParametersAssignment_3_0 )
            // InternalPersistenceDsl.g:1417:3: rule__MethodEntityReturn__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodEntityReturnAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3__0__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group_3__1"
    // InternalPersistenceDsl.g:1425:1: rule__MethodEntityReturn__Group_3__1 : rule__MethodEntityReturn__Group_3__1__Impl ;
    public final void rule__MethodEntityReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1429:1: ( rule__MethodEntityReturn__Group_3__1__Impl )
            // InternalPersistenceDsl.g:1430:2: rule__MethodEntityReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3__1"


    // $ANTLR start "rule__MethodEntityReturn__Group_3__1__Impl"
    // InternalPersistenceDsl.g:1436:1: rule__MethodEntityReturn__Group_3__1__Impl : ( ( rule__MethodEntityReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodEntityReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1440:1: ( ( ( rule__MethodEntityReturn__Group_3_1__0 )* ) )
            // InternalPersistenceDsl.g:1441:1: ( ( rule__MethodEntityReturn__Group_3_1__0 )* )
            {
            // InternalPersistenceDsl.g:1441:1: ( ( rule__MethodEntityReturn__Group_3_1__0 )* )
            // InternalPersistenceDsl.g:1442:2: ( rule__MethodEntityReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodEntityReturnAccess().getGroup_3_1()); 
            // InternalPersistenceDsl.g:1443:2: ( rule__MethodEntityReturn__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1443:3: rule__MethodEntityReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MethodEntityReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMethodEntityReturnAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3__1__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group_3_1__0"
    // InternalPersistenceDsl.g:1452:1: rule__MethodEntityReturn__Group_3_1__0 : rule__MethodEntityReturn__Group_3_1__0__Impl rule__MethodEntityReturn__Group_3_1__1 ;
    public final void rule__MethodEntityReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1456:1: ( rule__MethodEntityReturn__Group_3_1__0__Impl rule__MethodEntityReturn__Group_3_1__1 )
            // InternalPersistenceDsl.g:1457:2: rule__MethodEntityReturn__Group_3_1__0__Impl rule__MethodEntityReturn__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MethodEntityReturn__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3_1__0"


    // $ANTLR start "rule__MethodEntityReturn__Group_3_1__0__Impl"
    // InternalPersistenceDsl.g:1464:1: rule__MethodEntityReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodEntityReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1468:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:1469:1: ( ',' )
            {
            // InternalPersistenceDsl.g:1469:1: ( ',' )
            // InternalPersistenceDsl.g:1470:2: ','
            {
             before(grammarAccess.getMethodEntityReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodEntityReturnAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3_1__0__Impl"


    // $ANTLR start "rule__MethodEntityReturn__Group_3_1__1"
    // InternalPersistenceDsl.g:1479:1: rule__MethodEntityReturn__Group_3_1__1 : rule__MethodEntityReturn__Group_3_1__1__Impl ;
    public final void rule__MethodEntityReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1483:1: ( rule__MethodEntityReturn__Group_3_1__1__Impl )
            // InternalPersistenceDsl.g:1484:2: rule__MethodEntityReturn__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3_1__1"


    // $ANTLR start "rule__MethodEntityReturn__Group_3_1__1__Impl"
    // InternalPersistenceDsl.g:1490:1: rule__MethodEntityReturn__Group_3_1__1__Impl : ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodEntityReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1494:1: ( ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalPersistenceDsl.g:1495:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalPersistenceDsl.g:1495:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) )
            // InternalPersistenceDsl.g:1496:2: ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalPersistenceDsl.g:1497:2: ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 )
            // InternalPersistenceDsl.g:1497:3: rule__MethodEntityReturn__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodEntityReturn__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodEntityReturnAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__Group_3_1__1__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group__0"
    // InternalPersistenceDsl.g:1506:1: rule__MethodDtoReturn__Group__0 : rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 ;
    public final void rule__MethodDtoReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1510:1: ( rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 )
            // InternalPersistenceDsl.g:1511:2: rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1
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
    // InternalPersistenceDsl.g:1518:1: rule__MethodDtoReturn__Group__0__Impl : ( '#' ) ;
    public final void rule__MethodDtoReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1522:1: ( ( '#' ) )
            // InternalPersistenceDsl.g:1523:1: ( '#' )
            {
            // InternalPersistenceDsl.g:1523:1: ( '#' )
            // InternalPersistenceDsl.g:1524:2: '#'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1533:1: rule__MethodDtoReturn__Group__1 : rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 ;
    public final void rule__MethodDtoReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1537:1: ( rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 )
            // InternalPersistenceDsl.g:1538:2: rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2
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
    // InternalPersistenceDsl.g:1545:1: rule__MethodDtoReturn__Group__1__Impl : ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodDtoReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1549:1: ( ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1550:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1550:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            // InternalPersistenceDsl.g:1551:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeAssignment_1()); 
            // InternalPersistenceDsl.g:1552:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            // InternalPersistenceDsl.g:1552:3: rule__MethodDtoReturn__ReturnTypeAssignment_1
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
    // InternalPersistenceDsl.g:1560:1: rule__MethodDtoReturn__Group__2 : rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 ;
    public final void rule__MethodDtoReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1564:1: ( rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 )
            // InternalPersistenceDsl.g:1565:2: rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3
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
    // InternalPersistenceDsl.g:1572:1: rule__MethodDtoReturn__Group__2__Impl : ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) ;
    public final void rule__MethodDtoReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1576:1: ( ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) )
            // InternalPersistenceDsl.g:1577:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:1577:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            // InternalPersistenceDsl.g:1578:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNameAssignment_2()); 
            // InternalPersistenceDsl.g:1579:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            // InternalPersistenceDsl.g:1579:3: rule__MethodDtoReturn__NameAssignment_2
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
    // InternalPersistenceDsl.g:1587:1: rule__MethodDtoReturn__Group__3 : rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 ;
    public final void rule__MethodDtoReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1591:1: ( rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 )
            // InternalPersistenceDsl.g:1592:2: rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalPersistenceDsl.g:1599:1: rule__MethodDtoReturn__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDtoReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1603:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1604:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1604:1: ( '(' )
            // InternalPersistenceDsl.g:1605:2: '('
            {
             before(grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1614:1: rule__MethodDtoReturn__Group__4 : rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 ;
    public final void rule__MethodDtoReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1618:1: ( rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 )
            // InternalPersistenceDsl.g:1619:2: rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalPersistenceDsl.g:1626:1: rule__MethodDtoReturn__Group__4__Impl : ( ( rule__MethodDtoReturn__Group_4__0 )? ) ;
    public final void rule__MethodDtoReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1630:1: ( ( ( rule__MethodDtoReturn__Group_4__0 )? ) )
            // InternalPersistenceDsl.g:1631:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            {
            // InternalPersistenceDsl.g:1631:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            // InternalPersistenceDsl.g:1632:2: ( rule__MethodDtoReturn__Group_4__0 )?
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4()); 
            // InternalPersistenceDsl.g:1633:2: ( rule__MethodDtoReturn__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_DATE && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPersistenceDsl.g:1633:3: rule__MethodDtoReturn__Group_4__0
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
    // InternalPersistenceDsl.g:1641:1: rule__MethodDtoReturn__Group__5 : rule__MethodDtoReturn__Group__5__Impl rule__MethodDtoReturn__Group__6 ;
    public final void rule__MethodDtoReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1645:1: ( rule__MethodDtoReturn__Group__5__Impl rule__MethodDtoReturn__Group__6 )
            // InternalPersistenceDsl.g:1646:2: rule__MethodDtoReturn__Group__5__Impl rule__MethodDtoReturn__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__MethodDtoReturn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__6();

            state._fsp--;


            }

        }
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
    // InternalPersistenceDsl.g:1653:1: rule__MethodDtoReturn__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDtoReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1657:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1658:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1658:1: ( ')' )
            // InternalPersistenceDsl.g:1659:2: ')'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__MethodDtoReturn__Group__6"
    // InternalPersistenceDsl.g:1668:1: rule__MethodDtoReturn__Group__6 : rule__MethodDtoReturn__Group__6__Impl ;
    public final void rule__MethodDtoReturn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1672:1: ( rule__MethodDtoReturn__Group__6__Impl )
            // InternalPersistenceDsl.g:1673:2: rule__MethodDtoReturn__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDtoReturn__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDtoReturn__Group__6"


    // $ANTLR start "rule__MethodDtoReturn__Group__6__Impl"
    // InternalPersistenceDsl.g:1679:1: rule__MethodDtoReturn__Group__6__Impl : ( ( rule__MethodDtoReturn__NullableAssignment_6 )? ) ;
    public final void rule__MethodDtoReturn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1683:1: ( ( ( rule__MethodDtoReturn__NullableAssignment_6 )? ) )
            // InternalPersistenceDsl.g:1684:1: ( ( rule__MethodDtoReturn__NullableAssignment_6 )? )
            {
            // InternalPersistenceDsl.g:1684:1: ( ( rule__MethodDtoReturn__NullableAssignment_6 )? )
            // InternalPersistenceDsl.g:1685:2: ( rule__MethodDtoReturn__NullableAssignment_6 )?
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNullableAssignment_6()); 
            // InternalPersistenceDsl.g:1686:2: ( rule__MethodDtoReturn__NullableAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPersistenceDsl.g:1686:3: rule__MethodDtoReturn__NullableAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDtoReturn__NullableAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDtoReturnAccess().getNullableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDtoReturn__Group__6__Impl"


    // $ANTLR start "rule__MethodDtoReturn__Group_4__0"
    // InternalPersistenceDsl.g:1695:1: rule__MethodDtoReturn__Group_4__0 : rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 ;
    public final void rule__MethodDtoReturn__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1699:1: ( rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 )
            // InternalPersistenceDsl.g:1700:2: rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPersistenceDsl.g:1707:1: rule__MethodDtoReturn__Group_4__0__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) ;
    public final void rule__MethodDtoReturn__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1711:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) )
            // InternalPersistenceDsl.g:1712:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            {
            // InternalPersistenceDsl.g:1712:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            // InternalPersistenceDsl.g:1713:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_0()); 
            // InternalPersistenceDsl.g:1714:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            // InternalPersistenceDsl.g:1714:3: rule__MethodDtoReturn__ParametersAssignment_4_0
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
    // InternalPersistenceDsl.g:1722:1: rule__MethodDtoReturn__Group_4__1 : rule__MethodDtoReturn__Group_4__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1726:1: ( rule__MethodDtoReturn__Group_4__1__Impl )
            // InternalPersistenceDsl.g:1727:2: rule__MethodDtoReturn__Group_4__1__Impl
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
    // InternalPersistenceDsl.g:1733:1: rule__MethodDtoReturn__Group_4__1__Impl : ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) ;
    public final void rule__MethodDtoReturn__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1737:1: ( ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) )
            // InternalPersistenceDsl.g:1738:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            {
            // InternalPersistenceDsl.g:1738:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            // InternalPersistenceDsl.g:1739:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4_1()); 
            // InternalPersistenceDsl.g:1740:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1740:3: rule__MethodDtoReturn__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MethodDtoReturn__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPersistenceDsl.g:1749:1: rule__MethodDtoReturn__Group_4_1__0 : rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 ;
    public final void rule__MethodDtoReturn__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1753:1: ( rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 )
            // InternalPersistenceDsl.g:1754:2: rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPersistenceDsl.g:1761:1: rule__MethodDtoReturn__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MethodDtoReturn__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1765:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:1766:1: ( ',' )
            {
            // InternalPersistenceDsl.g:1766:1: ( ',' )
            // InternalPersistenceDsl.g:1767:2: ','
            {
             before(grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1776:1: rule__MethodDtoReturn__Group_4_1__1 : rule__MethodDtoReturn__Group_4_1__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1780:1: ( rule__MethodDtoReturn__Group_4_1__1__Impl )
            // InternalPersistenceDsl.g:1781:2: rule__MethodDtoReturn__Group_4_1__1__Impl
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
    // InternalPersistenceDsl.g:1787:1: rule__MethodDtoReturn__Group_4_1__1__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__MethodDtoReturn__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1791:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) )
            // InternalPersistenceDsl.g:1792:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            {
            // InternalPersistenceDsl.g:1792:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            // InternalPersistenceDsl.g:1793:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_1_1()); 
            // InternalPersistenceDsl.g:1794:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            // InternalPersistenceDsl.g:1794:3: rule__MethodDtoReturn__ParametersAssignment_4_1_1
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
    // InternalPersistenceDsl.g:1803:1: rule__MethodCollectionReturn__Group__0 : rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 ;
    public final void rule__MethodCollectionReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1807:1: ( rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 )
            // InternalPersistenceDsl.g:1808:2: rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1
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
    // InternalPersistenceDsl.g:1815:1: rule__MethodCollectionReturn__Group__0__Impl : ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1819:1: ( ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:1820:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:1820:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            // InternalPersistenceDsl.g:1821:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0()); 
            // InternalPersistenceDsl.g:1822:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            // InternalPersistenceDsl.g:1822:3: rule__MethodCollectionReturn__ReturnTypeAssignment_0
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
    // InternalPersistenceDsl.g:1830:1: rule__MethodCollectionReturn__Group__1 : rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 ;
    public final void rule__MethodCollectionReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1834:1: ( rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 )
            // InternalPersistenceDsl.g:1835:2: rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2
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
    // InternalPersistenceDsl.g:1842:1: rule__MethodCollectionReturn__Group__1__Impl : ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1846:1: ( ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1847:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1847:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:1848:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:1849:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            // InternalPersistenceDsl.g:1849:3: rule__MethodCollectionReturn__NameAssignment_1
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
    // InternalPersistenceDsl.g:1857:1: rule__MethodCollectionReturn__Group__2 : rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 ;
    public final void rule__MethodCollectionReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1861:1: ( rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 )
            // InternalPersistenceDsl.g:1862:2: rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalPersistenceDsl.g:1869:1: rule__MethodCollectionReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodCollectionReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1873:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1874:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1874:1: ( '(' )
            // InternalPersistenceDsl.g:1875:2: '('
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1884:1: rule__MethodCollectionReturn__Group__3 : rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 ;
    public final void rule__MethodCollectionReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1888:1: ( rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 )
            // InternalPersistenceDsl.g:1889:2: rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalPersistenceDsl.g:1896:1: rule__MethodCollectionReturn__Group__3__Impl : ( ( rule__MethodCollectionReturn__Group_3__0 )? ) ;
    public final void rule__MethodCollectionReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1900:1: ( ( ( rule__MethodCollectionReturn__Group_3__0 )? ) )
            // InternalPersistenceDsl.g:1901:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            {
            // InternalPersistenceDsl.g:1901:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            // InternalPersistenceDsl.g:1902:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3()); 
            // InternalPersistenceDsl.g:1903:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_DATE && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPersistenceDsl.g:1903:3: rule__MethodCollectionReturn__Group_3__0
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
    // InternalPersistenceDsl.g:1911:1: rule__MethodCollectionReturn__Group__4 : rule__MethodCollectionReturn__Group__4__Impl ;
    public final void rule__MethodCollectionReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1915:1: ( rule__MethodCollectionReturn__Group__4__Impl )
            // InternalPersistenceDsl.g:1916:2: rule__MethodCollectionReturn__Group__4__Impl
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
    // InternalPersistenceDsl.g:1922:1: rule__MethodCollectionReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodCollectionReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1926:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1927:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1927:1: ( ')' )
            // InternalPersistenceDsl.g:1928:2: ')'
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1938:1: rule__MethodCollectionReturn__Group_3__0 : rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 ;
    public final void rule__MethodCollectionReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1942:1: ( rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 )
            // InternalPersistenceDsl.g:1943:2: rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPersistenceDsl.g:1950:1: rule__MethodCollectionReturn__Group_3__0__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1954:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) )
            // InternalPersistenceDsl.g:1955:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            {
            // InternalPersistenceDsl.g:1955:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            // InternalPersistenceDsl.g:1956:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0()); 
            // InternalPersistenceDsl.g:1957:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            // InternalPersistenceDsl.g:1957:3: rule__MethodCollectionReturn__ParametersAssignment_3_0
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
    // InternalPersistenceDsl.g:1965:1: rule__MethodCollectionReturn__Group_3__1 : rule__MethodCollectionReturn__Group_3__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1969:1: ( rule__MethodCollectionReturn__Group_3__1__Impl )
            // InternalPersistenceDsl.g:1970:2: rule__MethodCollectionReturn__Group_3__1__Impl
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
    // InternalPersistenceDsl.g:1976:1: rule__MethodCollectionReturn__Group_3__1__Impl : ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodCollectionReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1980:1: ( ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) )
            // InternalPersistenceDsl.g:1981:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            {
            // InternalPersistenceDsl.g:1981:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            // InternalPersistenceDsl.g:1982:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1()); 
            // InternalPersistenceDsl.g:1983:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1983:3: rule__MethodCollectionReturn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MethodCollectionReturn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPersistenceDsl.g:1992:1: rule__MethodCollectionReturn__Group_3_1__0 : rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 ;
    public final void rule__MethodCollectionReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1996:1: ( rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 )
            // InternalPersistenceDsl.g:1997:2: rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1
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
    // InternalPersistenceDsl.g:2004:1: rule__MethodCollectionReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2008:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:2009:1: ( ',' )
            {
            // InternalPersistenceDsl.g:2009:1: ( ',' )
            // InternalPersistenceDsl.g:2010:2: ','
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2019:1: rule__MethodCollectionReturn__Group_3_1__1 : rule__MethodCollectionReturn__Group_3_1__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2023:1: ( rule__MethodCollectionReturn__Group_3_1__1__Impl )
            // InternalPersistenceDsl.g:2024:2: rule__MethodCollectionReturn__Group_3_1__1__Impl
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
    // InternalPersistenceDsl.g:2030:1: rule__MethodCollectionReturn__Group_3_1__1__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2034:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalPersistenceDsl.g:2035:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalPersistenceDsl.g:2035:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            // InternalPersistenceDsl.g:2036:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalPersistenceDsl.g:2037:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            // InternalPersistenceDsl.g:2037:3: rule__MethodCollectionReturn__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__0"
    // InternalPersistenceDsl.g:2046:1: rule__EntityReturnTypeCollection__Group__0 : rule__EntityReturnTypeCollection__Group__0__Impl rule__EntityReturnTypeCollection__Group__1 ;
    public final void rule__EntityReturnTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2050:1: ( rule__EntityReturnTypeCollection__Group__0__Impl rule__EntityReturnTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2051:2: rule__EntityReturnTypeCollection__Group__0__Impl rule__EntityReturnTypeCollection__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EntityReturnTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityReturnTypeCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__0"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__0__Impl"
    // InternalPersistenceDsl.g:2058:1: rule__EntityReturnTypeCollection__Group__0__Impl : ( RULE_LIST ) ;
    public final void rule__EntityReturnTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2062:1: ( ( RULE_LIST ) )
            // InternalPersistenceDsl.g:2063:1: ( RULE_LIST )
            {
            // InternalPersistenceDsl.g:2063:1: ( RULE_LIST )
            // InternalPersistenceDsl.g:2064:2: RULE_LIST
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getLISTTerminalRuleCall_0()); 
            match(input,RULE_LIST,FOLLOW_2); 
             after(grammarAccess.getEntityReturnTypeCollectionAccess().getLISTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__1"
    // InternalPersistenceDsl.g:2073:1: rule__EntityReturnTypeCollection__Group__1 : rule__EntityReturnTypeCollection__Group__1__Impl rule__EntityReturnTypeCollection__Group__2 ;
    public final void rule__EntityReturnTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2077:1: ( rule__EntityReturnTypeCollection__Group__1__Impl rule__EntityReturnTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2078:2: rule__EntityReturnTypeCollection__Group__1__Impl rule__EntityReturnTypeCollection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EntityReturnTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityReturnTypeCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__1"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__1__Impl"
    // InternalPersistenceDsl.g:2085:1: rule__EntityReturnTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__EntityReturnTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2089:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2090:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2090:1: ( '<' )
            // InternalPersistenceDsl.g:2091:2: '<'
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__2"
    // InternalPersistenceDsl.g:2100:1: rule__EntityReturnTypeCollection__Group__2 : rule__EntityReturnTypeCollection__Group__2__Impl rule__EntityReturnTypeCollection__Group__3 ;
    public final void rule__EntityReturnTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2104:1: ( rule__EntityReturnTypeCollection__Group__2__Impl rule__EntityReturnTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2105:2: rule__EntityReturnTypeCollection__Group__2__Impl rule__EntityReturnTypeCollection__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__EntityReturnTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityReturnTypeCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__2"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__2__Impl"
    // InternalPersistenceDsl.g:2112:1: rule__EntityReturnTypeCollection__Group__2__Impl : ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__EntityReturnTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2116:1: ( ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2117:1: ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2117:1: ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2118:2: ( rule__EntityReturnTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2119:2: ( rule__EntityReturnTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2119:3: rule__EntityReturnTypeCollection__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityReturnTypeCollection__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__3"
    // InternalPersistenceDsl.g:2127:1: rule__EntityReturnTypeCollection__Group__3 : rule__EntityReturnTypeCollection__Group__3__Impl ;
    public final void rule__EntityReturnTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2131:1: ( rule__EntityReturnTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2132:2: rule__EntityReturnTypeCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityReturnTypeCollection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__3"


    // $ANTLR start "rule__EntityReturnTypeCollection__Group__3__Impl"
    // InternalPersistenceDsl.g:2138:1: rule__EntityReturnTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__EntityReturnTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2142:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2143:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2143:1: ( '>' )
            // InternalPersistenceDsl.g:2144:2: '>'
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityReturnTypeCollectionAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__0"
    // InternalPersistenceDsl.g:2154:1: rule__DtoReturnTypeCollection__Group__0 : rule__DtoReturnTypeCollection__Group__0__Impl rule__DtoReturnTypeCollection__Group__1 ;
    public final void rule__DtoReturnTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2158:1: ( rule__DtoReturnTypeCollection__Group__0__Impl rule__DtoReturnTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2159:2: rule__DtoReturnTypeCollection__Group__0__Impl rule__DtoReturnTypeCollection__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DtoReturnTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__0"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__0__Impl"
    // InternalPersistenceDsl.g:2166:1: rule__DtoReturnTypeCollection__Group__0__Impl : ( RULE_LIST ) ;
    public final void rule__DtoReturnTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2170:1: ( ( RULE_LIST ) )
            // InternalPersistenceDsl.g:2171:1: ( RULE_LIST )
            {
            // InternalPersistenceDsl.g:2171:1: ( RULE_LIST )
            // InternalPersistenceDsl.g:2172:2: RULE_LIST
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getLISTTerminalRuleCall_0()); 
            match(input,RULE_LIST,FOLLOW_2); 
             after(grammarAccess.getDtoReturnTypeCollectionAccess().getLISTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__1"
    // InternalPersistenceDsl.g:2181:1: rule__DtoReturnTypeCollection__Group__1 : rule__DtoReturnTypeCollection__Group__1__Impl rule__DtoReturnTypeCollection__Group__2 ;
    public final void rule__DtoReturnTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2185:1: ( rule__DtoReturnTypeCollection__Group__1__Impl rule__DtoReturnTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2186:2: rule__DtoReturnTypeCollection__Group__1__Impl rule__DtoReturnTypeCollection__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DtoReturnTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__1"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__1__Impl"
    // InternalPersistenceDsl.g:2193:1: rule__DtoReturnTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__DtoReturnTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2197:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2198:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2198:1: ( '<' )
            // InternalPersistenceDsl.g:2199:2: '<'
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDtoReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__2"
    // InternalPersistenceDsl.g:2208:1: rule__DtoReturnTypeCollection__Group__2 : rule__DtoReturnTypeCollection__Group__2__Impl rule__DtoReturnTypeCollection__Group__3 ;
    public final void rule__DtoReturnTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2212:1: ( rule__DtoReturnTypeCollection__Group__2__Impl rule__DtoReturnTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2213:2: rule__DtoReturnTypeCollection__Group__2__Impl rule__DtoReturnTypeCollection__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DtoReturnTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__2"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__2__Impl"
    // InternalPersistenceDsl.g:2220:1: rule__DtoReturnTypeCollection__Group__2__Impl : ( '#' ) ;
    public final void rule__DtoReturnTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2224:1: ( ( '#' ) )
            // InternalPersistenceDsl.g:2225:1: ( '#' )
            {
            // InternalPersistenceDsl.g:2225:1: ( '#' )
            // InternalPersistenceDsl.g:2226:2: '#'
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getNumberSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDtoReturnTypeCollectionAccess().getNumberSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__3"
    // InternalPersistenceDsl.g:2235:1: rule__DtoReturnTypeCollection__Group__3 : rule__DtoReturnTypeCollection__Group__3__Impl rule__DtoReturnTypeCollection__Group__4 ;
    public final void rule__DtoReturnTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2239:1: ( rule__DtoReturnTypeCollection__Group__3__Impl rule__DtoReturnTypeCollection__Group__4 )
            // InternalPersistenceDsl.g:2240:2: rule__DtoReturnTypeCollection__Group__3__Impl rule__DtoReturnTypeCollection__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DtoReturnTypeCollection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__3"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__3__Impl"
    // InternalPersistenceDsl.g:2247:1: rule__DtoReturnTypeCollection__Group__3__Impl : ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) ) ;
    public final void rule__DtoReturnTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2251:1: ( ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) ) )
            // InternalPersistenceDsl.g:2252:1: ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) )
            {
            // InternalPersistenceDsl.g:2252:1: ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) )
            // InternalPersistenceDsl.g:2253:2: ( rule__DtoReturnTypeCollection__TypeAssignment_3 )
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeAssignment_3()); 
            // InternalPersistenceDsl.g:2254:2: ( rule__DtoReturnTypeCollection__TypeAssignment_3 )
            // InternalPersistenceDsl.g:2254:3: rule__DtoReturnTypeCollection__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__4"
    // InternalPersistenceDsl.g:2262:1: rule__DtoReturnTypeCollection__Group__4 : rule__DtoReturnTypeCollection__Group__4__Impl ;
    public final void rule__DtoReturnTypeCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2266:1: ( rule__DtoReturnTypeCollection__Group__4__Impl )
            // InternalPersistenceDsl.g:2267:2: rule__DtoReturnTypeCollection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtoReturnTypeCollection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__4"


    // $ANTLR start "rule__DtoReturnTypeCollection__Group__4__Impl"
    // InternalPersistenceDsl.g:2273:1: rule__DtoReturnTypeCollection__Group__4__Impl : ( '>' ) ;
    public final void rule__DtoReturnTypeCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2277:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2278:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2278:1: ( '>' )
            // InternalPersistenceDsl.g:2279:2: '>'
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getGreaterThanSignKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDtoReturnTypeCollectionAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__Group__4__Impl"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__0"
    // InternalPersistenceDsl.g:2289:1: rule__SimpleReturnTypeCollection__Group__0 : rule__SimpleReturnTypeCollection__Group__0__Impl rule__SimpleReturnTypeCollection__Group__1 ;
    public final void rule__SimpleReturnTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2293:1: ( rule__SimpleReturnTypeCollection__Group__0__Impl rule__SimpleReturnTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2294:2: rule__SimpleReturnTypeCollection__Group__0__Impl rule__SimpleReturnTypeCollection__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SimpleReturnTypeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleReturnTypeCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__0"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__0__Impl"
    // InternalPersistenceDsl.g:2301:1: rule__SimpleReturnTypeCollection__Group__0__Impl : ( RULE_LIST ) ;
    public final void rule__SimpleReturnTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2305:1: ( ( RULE_LIST ) )
            // InternalPersistenceDsl.g:2306:1: ( RULE_LIST )
            {
            // InternalPersistenceDsl.g:2306:1: ( RULE_LIST )
            // InternalPersistenceDsl.g:2307:2: RULE_LIST
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getLISTTerminalRuleCall_0()); 
            match(input,RULE_LIST,FOLLOW_2); 
             after(grammarAccess.getSimpleReturnTypeCollectionAccess().getLISTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__0__Impl"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__1"
    // InternalPersistenceDsl.g:2316:1: rule__SimpleReturnTypeCollection__Group__1 : rule__SimpleReturnTypeCollection__Group__1__Impl rule__SimpleReturnTypeCollection__Group__2 ;
    public final void rule__SimpleReturnTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2320:1: ( rule__SimpleReturnTypeCollection__Group__1__Impl rule__SimpleReturnTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2321:2: rule__SimpleReturnTypeCollection__Group__1__Impl rule__SimpleReturnTypeCollection__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SimpleReturnTypeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleReturnTypeCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__1"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__1__Impl"
    // InternalPersistenceDsl.g:2328:1: rule__SimpleReturnTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleReturnTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2332:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2333:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2333:1: ( '<' )
            // InternalPersistenceDsl.g:2334:2: '<'
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimpleReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__1__Impl"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__2"
    // InternalPersistenceDsl.g:2343:1: rule__SimpleReturnTypeCollection__Group__2 : rule__SimpleReturnTypeCollection__Group__2__Impl rule__SimpleReturnTypeCollection__Group__3 ;
    public final void rule__SimpleReturnTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2347:1: ( rule__SimpleReturnTypeCollection__Group__2__Impl rule__SimpleReturnTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2348:2: rule__SimpleReturnTypeCollection__Group__2__Impl rule__SimpleReturnTypeCollection__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SimpleReturnTypeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleReturnTypeCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__2"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__2__Impl"
    // InternalPersistenceDsl.g:2355:1: rule__SimpleReturnTypeCollection__Group__2__Impl : ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleReturnTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2359:1: ( ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2360:1: ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2360:1: ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2361:2: ( rule__SimpleReturnTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2362:2: ( rule__SimpleReturnTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2362:3: rule__SimpleReturnTypeCollection__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleReturnTypeCollection__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__2__Impl"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__3"
    // InternalPersistenceDsl.g:2370:1: rule__SimpleReturnTypeCollection__Group__3 : rule__SimpleReturnTypeCollection__Group__3__Impl ;
    public final void rule__SimpleReturnTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2374:1: ( rule__SimpleReturnTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2375:2: rule__SimpleReturnTypeCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleReturnTypeCollection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__3"


    // $ANTLR start "rule__SimpleReturnTypeCollection__Group__3__Impl"
    // InternalPersistenceDsl.g:2381:1: rule__SimpleReturnTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleReturnTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2385:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2386:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2386:1: ( '>' )
            // InternalPersistenceDsl.g:2387:2: '>'
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSimpleReturnTypeCollectionAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__Group__3__Impl"


    // $ANTLR start "rule__AllModelTypeCollection__Group__0"
    // InternalPersistenceDsl.g:2397:1: rule__AllModelTypeCollection__Group__0 : rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 ;
    public final void rule__AllModelTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2401:1: ( rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2402:2: rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPersistenceDsl.g:2409:1: rule__AllModelTypeCollection__Group__0__Impl : ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__AllModelTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2413:1: ( ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2414:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2414:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            // InternalPersistenceDsl.g:2415:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalPersistenceDsl.g:2416:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            // InternalPersistenceDsl.g:2416:3: rule__AllModelTypeCollection__CollectionAssignment_0
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
    // InternalPersistenceDsl.g:2424:1: rule__AllModelTypeCollection__Group__1 : rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 ;
    public final void rule__AllModelTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2428:1: ( rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2429:2: rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2
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
    // InternalPersistenceDsl.g:2436:1: rule__AllModelTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__AllModelTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2440:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2441:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2441:1: ( '<' )
            // InternalPersistenceDsl.g:2442:2: '<'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2451:1: rule__AllModelTypeCollection__Group__2 : rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 ;
    public final void rule__AllModelTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2455:1: ( rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2456:2: rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalPersistenceDsl.g:2463:1: rule__AllModelTypeCollection__Group__2__Impl : ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__AllModelTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2467:1: ( ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2468:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2468:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2469:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2470:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2470:3: rule__AllModelTypeCollection__TypeAssignment_2
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
    // InternalPersistenceDsl.g:2478:1: rule__AllModelTypeCollection__Group__3 : rule__AllModelTypeCollection__Group__3__Impl ;
    public final void rule__AllModelTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2482:1: ( rule__AllModelTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2483:2: rule__AllModelTypeCollection__Group__3__Impl
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
    // InternalPersistenceDsl.g:2489:1: rule__AllModelTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__AllModelTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2493:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2494:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2494:1: ( '>' )
            // InternalPersistenceDsl.g:2495:2: '>'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__SimpleTypeCollection__Group__0"
    // InternalPersistenceDsl.g:2505:1: rule__SimpleTypeCollection__Group__0 : rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 ;
    public final void rule__SimpleTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2509:1: ( rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2510:2: rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPersistenceDsl.g:2517:1: rule__SimpleTypeCollection__Group__0__Impl : ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__SimpleTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2521:1: ( ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2522:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2522:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            // InternalPersistenceDsl.g:2523:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalPersistenceDsl.g:2524:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            // InternalPersistenceDsl.g:2524:3: rule__SimpleTypeCollection__CollectionAssignment_0
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
    // InternalPersistenceDsl.g:2532:1: rule__SimpleTypeCollection__Group__1 : rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 ;
    public final void rule__SimpleTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2536:1: ( rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2537:2: rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPersistenceDsl.g:2544:1: rule__SimpleTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2548:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2549:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2549:1: ( '<' )
            // InternalPersistenceDsl.g:2550:2: '<'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2559:1: rule__SimpleTypeCollection__Group__2 : rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 ;
    public final void rule__SimpleTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2563:1: ( rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2564:2: rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalPersistenceDsl.g:2571:1: rule__SimpleTypeCollection__Group__2__Impl : ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2575:1: ( ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2576:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2576:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2577:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2578:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2578:3: rule__SimpleTypeCollection__TypeAssignment_2
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
    // InternalPersistenceDsl.g:2586:1: rule__SimpleTypeCollection__Group__3 : rule__SimpleTypeCollection__Group__3__Impl ;
    public final void rule__SimpleTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2590:1: ( rule__SimpleTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2591:2: rule__SimpleTypeCollection__Group__3__Impl
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
    // InternalPersistenceDsl.g:2597:1: rule__SimpleTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2601:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2602:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2602:1: ( '>' )
            // InternalPersistenceDsl.g:2603:2: '>'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__DefAllModelTypeVariable__Group__0"
    // InternalPersistenceDsl.g:2613:1: rule__DefAllModelTypeVariable__Group__0 : rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 ;
    public final void rule__DefAllModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2617:1: ( rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 )
            // InternalPersistenceDsl.g:2618:2: rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1
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
    // InternalPersistenceDsl.g:2625:1: rule__DefAllModelTypeVariable__Group__0__Impl : ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2629:1: ( ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2630:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2630:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2631:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2632:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2632:3: rule__DefAllModelTypeVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2640:1: rule__DefAllModelTypeVariable__Group__1 : rule__DefAllModelTypeVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2644:1: ( rule__DefAllModelTypeVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2645:2: rule__DefAllModelTypeVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2651:1: rule__DefAllModelTypeVariable__Group__1__Impl : ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2655:1: ( ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2656:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2656:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2657:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2658:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2658:3: rule__DefAllModelTypeVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2667:1: rule__DefSimpleVariable__Group__0 : rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 ;
    public final void rule__DefSimpleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2671:1: ( rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 )
            // InternalPersistenceDsl.g:2672:2: rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1
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
    // InternalPersistenceDsl.g:2679:1: rule__DefSimpleVariable__Group__0__Impl : ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2683:1: ( ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2684:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2684:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2685:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2686:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2686:3: rule__DefSimpleVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2694:1: rule__DefSimpleVariable__Group__1 : rule__DefSimpleVariable__Group__1__Impl ;
    public final void rule__DefSimpleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2698:1: ( rule__DefSimpleVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2699:2: rule__DefSimpleVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2705:1: rule__DefSimpleVariable__Group__1__Impl : ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2709:1: ( ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2710:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2710:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2711:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2712:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2712:3: rule__DefSimpleVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2721:1: rule__DefAllModelTypeCollectionVariable__Group__0 : rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2725:1: ( rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 )
            // InternalPersistenceDsl.g:2726:2: rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1
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
    // InternalPersistenceDsl.g:2733:1: rule__DefAllModelTypeCollectionVariable__Group__0__Impl : ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2737:1: ( ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2738:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2738:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2739:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2740:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2740:3: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2748:1: rule__DefAllModelTypeCollectionVariable__Group__1 : rule__DefAllModelTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2752:1: ( rule__DefAllModelTypeCollectionVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2753:2: rule__DefAllModelTypeCollectionVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2759:1: rule__DefAllModelTypeCollectionVariable__Group__1__Impl : ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2763:1: ( ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2764:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2764:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2765:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2766:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2766:3: rule__DefAllModelTypeCollectionVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2775:1: rule__DefSimpleTypeCollectionVariable__Group__0 : rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2779:1: ( rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 )
            // InternalPersistenceDsl.g:2780:2: rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1
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
    // InternalPersistenceDsl.g:2787:1: rule__DefSimpleTypeCollectionVariable__Group__0__Impl : ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2791:1: ( ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2792:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2792:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2793:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2794:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2794:3: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2802:1: rule__DefSimpleTypeCollectionVariable__Group__1 : rule__DefSimpleTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2806:1: ( rule__DefSimpleTypeCollectionVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2807:2: rule__DefSimpleTypeCollectionVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2813:1: rule__DefSimpleTypeCollectionVariable__Group__1__Impl : ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2817:1: ( ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2818:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2818:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2819:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2820:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2820:3: rule__DefSimpleTypeCollectionVariable__NameAssignment_1
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


    // $ANTLR start "rule__Model__FinderAssignment"
    // InternalPersistenceDsl.g:2829:1: rule__Model__FinderAssignment : ( ruleFinder ) ;
    public final void rule__Model__FinderAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2833:1: ( ( ruleFinder ) )
            // InternalPersistenceDsl.g:2834:2: ( ruleFinder )
            {
            // InternalPersistenceDsl.g:2834:2: ( ruleFinder )
            // InternalPersistenceDsl.g:2835:3: ruleFinder
            {
             before(grammarAccess.getModelAccess().getFinderFinderParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFinder();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFinderFinderParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FinderAssignment"


    // $ANTLR start "rule__Finder__NameAssignment_1"
    // InternalPersistenceDsl.g:2844:1: rule__Finder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Finder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2848:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2849:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:2849:2: ( RULE_ID )
            // InternalPersistenceDsl.g:2850:3: RULE_ID
            {
             before(grammarAccess.getFinderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFinderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__NameAssignment_1"


    // $ANTLR start "rule__Finder__MethodsAssignment_3"
    // InternalPersistenceDsl.g:2859:1: rule__Finder__MethodsAssignment_3 : ( ruleFinderMethod ) ;
    public final void rule__Finder__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2863:1: ( ( ruleFinderMethod ) )
            // InternalPersistenceDsl.g:2864:2: ( ruleFinderMethod )
            {
            // InternalPersistenceDsl.g:2864:2: ( ruleFinderMethod )
            // InternalPersistenceDsl.g:2865:3: ruleFinderMethod
            {
             before(grammarAccess.getFinderAccess().getMethodsFinderMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFinderMethod();

            state._fsp--;

             after(grammarAccess.getFinderAccess().getMethodsFinderMethodParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Finder__MethodsAssignment_3"


    // $ANTLR start "rule__MethodSimpleReturn__ReturnTypeAssignment_0"
    // InternalPersistenceDsl.g:2874:1: rule__MethodSimpleReturn__ReturnTypeAssignment_0 : ( ruleType ) ;
    public final void rule__MethodSimpleReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2878:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:2879:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:2879:2: ( ruleType )
            // InternalPersistenceDsl.g:2880:3: ruleType
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalPersistenceDsl.g:2889:1: rule__MethodSimpleReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodSimpleReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2893:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2894:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:2894:2: ( RULE_ID )
            // InternalPersistenceDsl.g:2895:3: RULE_ID
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
    // InternalPersistenceDsl.g:2904:1: rule__MethodSimpleReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2908:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:2909:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:2909:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:2910:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:2919:1: rule__MethodSimpleReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2923:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:2924:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:2924:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:2925:3: ruleDefVariable
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


    // $ANTLR start "rule__MethodSimpleReturn__NullableAssignment_5"
    // InternalPersistenceDsl.g:2934:1: rule__MethodSimpleReturn__NullableAssignment_5 : ( ( 'non-null' ) ) ;
    public final void rule__MethodSimpleReturn__NullableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2938:1: ( ( ( 'non-null' ) ) )
            // InternalPersistenceDsl.g:2939:2: ( ( 'non-null' ) )
            {
            // InternalPersistenceDsl.g:2939:2: ( ( 'non-null' ) )
            // InternalPersistenceDsl.g:2940:3: ( 'non-null' )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0()); 
            // InternalPersistenceDsl.g:2941:3: ( 'non-null' )
            // InternalPersistenceDsl.g:2942:4: 'non-null'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0()); 

            }

             after(grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSimpleReturn__NullableAssignment_5"


    // $ANTLR start "rule__MethodEntityReturn__ReturnTypeAssignment_0"
    // InternalPersistenceDsl.g:2953:1: rule__MethodEntityReturn__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodEntityReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2957:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:2958:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:2958:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2959:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityCrossReference_0_0()); 
            // InternalPersistenceDsl.g:2960:3: ( RULE_ID )
            // InternalPersistenceDsl.g:2961:4: RULE_ID
            {
             before(grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__ReturnTypeAssignment_0"


    // $ANTLR start "rule__MethodEntityReturn__NameAssignment_1"
    // InternalPersistenceDsl.g:2972:1: rule__MethodEntityReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodEntityReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2976:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2977:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:2977:2: ( RULE_ID )
            // InternalPersistenceDsl.g:2978:3: RULE_ID
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodEntityReturnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__NameAssignment_1"


    // $ANTLR start "rule__MethodEntityReturn__ParametersAssignment_3_0"
    // InternalPersistenceDsl.g:2987:1: rule__MethodEntityReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodEntityReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2991:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:2992:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:2992:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:2993:3: ruleDefVariable
            {
             before(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__ParametersAssignment_3_0"


    // $ANTLR start "rule__MethodEntityReturn__ParametersAssignment_3_1_1"
    // InternalPersistenceDsl.g:3002:1: rule__MethodEntityReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodEntityReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3006:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3007:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3007:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3008:3: ruleDefVariable
            {
             before(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefVariable();

            state._fsp--;

             after(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__MethodEntityReturn__NullableAssignment_5"
    // InternalPersistenceDsl.g:3017:1: rule__MethodEntityReturn__NullableAssignment_5 : ( ( 'non-null' ) ) ;
    public final void rule__MethodEntityReturn__NullableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3021:1: ( ( ( 'non-null' ) ) )
            // InternalPersistenceDsl.g:3022:2: ( ( 'non-null' ) )
            {
            // InternalPersistenceDsl.g:3022:2: ( ( 'non-null' ) )
            // InternalPersistenceDsl.g:3023:3: ( 'non-null' )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0()); 
            // InternalPersistenceDsl.g:3024:3: ( 'non-null' )
            // InternalPersistenceDsl.g:3025:4: 'non-null'
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0()); 

            }

             after(grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodEntityReturn__NullableAssignment_5"


    // $ANTLR start "rule__MethodDtoReturn__ReturnTypeAssignment_1"
    // InternalPersistenceDsl.g:3036:1: rule__MethodDtoReturn__ReturnTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodDtoReturn__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3040:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3041:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3041:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3042:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0()); 
            // InternalPersistenceDsl.g:3043:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3044:4: RULE_ID
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
    // InternalPersistenceDsl.g:3055:1: rule__MethodDtoReturn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDtoReturn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3059:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3060:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3060:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3061:3: RULE_ID
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
    // InternalPersistenceDsl.g:3070:1: rule__MethodDtoReturn__ParametersAssignment_4_0 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3074:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3075:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3075:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3076:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3085:1: rule__MethodDtoReturn__ParametersAssignment_4_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3089:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3090:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3090:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3091:3: ruleDefVariable
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


    // $ANTLR start "rule__MethodDtoReturn__NullableAssignment_6"
    // InternalPersistenceDsl.g:3100:1: rule__MethodDtoReturn__NullableAssignment_6 : ( ( 'non-null' ) ) ;
    public final void rule__MethodDtoReturn__NullableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3104:1: ( ( ( 'non-null' ) ) )
            // InternalPersistenceDsl.g:3105:2: ( ( 'non-null' ) )
            {
            // InternalPersistenceDsl.g:3105:2: ( ( 'non-null' ) )
            // InternalPersistenceDsl.g:3106:3: ( 'non-null' )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0()); 
            // InternalPersistenceDsl.g:3107:3: ( 'non-null' )
            // InternalPersistenceDsl.g:3108:4: 'non-null'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0()); 

            }

             after(grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDtoReturn__NullableAssignment_6"


    // $ANTLR start "rule__MethodCollectionReturn__ReturnTypeAssignment_0"
    // InternalPersistenceDsl.g:3119:1: rule__MethodCollectionReturn__ReturnTypeAssignment_0 : ( ruleCollectionReturnType ) ;
    public final void rule__MethodCollectionReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3123:1: ( ( ruleCollectionReturnType ) )
            // InternalPersistenceDsl.g:3124:2: ( ruleCollectionReturnType )
            {
            // InternalPersistenceDsl.g:3124:2: ( ruleCollectionReturnType )
            // InternalPersistenceDsl.g:3125:3: ruleCollectionReturnType
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
    // InternalPersistenceDsl.g:3134:1: rule__MethodCollectionReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodCollectionReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3138:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3139:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3139:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3140:3: RULE_ID
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
    // InternalPersistenceDsl.g:3149:1: rule__MethodCollectionReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3153:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3154:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3154:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3155:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3164:1: rule__MethodCollectionReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3168:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3169:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3169:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3170:3: ruleDefVariable
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


    // $ANTLR start "rule__EntityReturnTypeCollection__TypeAssignment_2"
    // InternalPersistenceDsl.g:3179:1: rule__EntityReturnTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReturnTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3183:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3184:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3184:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3185:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityCrossReference_2_0()); 
            // InternalPersistenceDsl.g:3186:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3187:4: RULE_ID
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReturnTypeCollection__TypeAssignment_2"


    // $ANTLR start "rule__DtoReturnTypeCollection__TypeAssignment_3"
    // InternalPersistenceDsl.g:3198:1: rule__DtoReturnTypeCollection__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DtoReturnTypeCollection__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3202:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3203:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3203:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3204:3: ( RULE_ID )
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoCrossReference_3_0()); 
            // InternalPersistenceDsl.g:3205:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3206:4: RULE_ID
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtoReturnTypeCollection__TypeAssignment_3"


    // $ANTLR start "rule__SimpleReturnTypeCollection__TypeAssignment_2"
    // InternalPersistenceDsl.g:3217:1: rule__SimpleReturnTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleReturnTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3221:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:3222:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:3222:2: ( ruleType )
            // InternalPersistenceDsl.g:3223:3: ruleType
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleReturnTypeCollection__TypeAssignment_2"


    // $ANTLR start "rule__AllModelTypeCollection__CollectionAssignment_0"
    // InternalPersistenceDsl.g:3232:1: rule__AllModelTypeCollection__CollectionAssignment_0 : ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__AllModelTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3236:1: ( ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalPersistenceDsl.g:3237:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalPersistenceDsl.g:3237:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalPersistenceDsl.g:3238:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalPersistenceDsl.g:3239:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            // InternalPersistenceDsl.g:3239:4: rule__AllModelTypeCollection__CollectionAlternatives_0_0
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
    // InternalPersistenceDsl.g:3247:1: rule__AllModelTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AllModelTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3251:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3252:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3252:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3253:3: ( RULE_ID )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0()); 
            // InternalPersistenceDsl.g:3254:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3255:4: RULE_ID
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


    // $ANTLR start "rule__SimpleTypeCollection__CollectionAssignment_0"
    // InternalPersistenceDsl.g:3266:1: rule__SimpleTypeCollection__CollectionAssignment_0 : ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__SimpleTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3270:1: ( ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalPersistenceDsl.g:3271:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalPersistenceDsl.g:3271:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalPersistenceDsl.g:3272:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalPersistenceDsl.g:3273:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            // InternalPersistenceDsl.g:3273:4: rule__SimpleTypeCollection__CollectionAlternatives_0_0
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
    // InternalPersistenceDsl.g:3281:1: rule__SimpleTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3285:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:3286:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:3286:2: ( ruleType )
            // InternalPersistenceDsl.g:3287:3: ruleType
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


    // $ANTLR start "rule__DefAllModelTypeVariable__TypeAssignment_0"
    // InternalPersistenceDsl.g:3296:1: rule__DefAllModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefAllModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3300:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3301:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3301:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3302:3: ( RULE_ID )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0()); 
            // InternalPersistenceDsl.g:3303:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3304:4: RULE_ID
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
    // InternalPersistenceDsl.g:3315:1: rule__DefAllModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3319:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3320:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3320:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3321:3: RULE_ID
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
    // InternalPersistenceDsl.g:3330:1: rule__DefSimpleVariable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefSimpleVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3334:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:3335:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:3335:2: ( ruleType )
            // InternalPersistenceDsl.g:3336:3: ruleType
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
    // InternalPersistenceDsl.g:3345:1: rule__DefSimpleVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3349:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3350:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3350:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3351:3: RULE_ID
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
    // InternalPersistenceDsl.g:3360:1: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 : ( ruleAllModelTypeCollection ) ;
    public final void rule__DefAllModelTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3364:1: ( ( ruleAllModelTypeCollection ) )
            // InternalPersistenceDsl.g:3365:2: ( ruleAllModelTypeCollection )
            {
            // InternalPersistenceDsl.g:3365:2: ( ruleAllModelTypeCollection )
            // InternalPersistenceDsl.g:3366:3: ruleAllModelTypeCollection
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
    // InternalPersistenceDsl.g:3375:1: rule__DefAllModelTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3379:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3380:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3380:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3381:3: RULE_ID
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
    // InternalPersistenceDsl.g:3390:1: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 : ( ruleSimpleTypeCollection ) ;
    public final void rule__DefSimpleTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3394:1: ( ( ruleSimpleTypeCollection ) )
            // InternalPersistenceDsl.g:3395:2: ( ruleSimpleTypeCollection )
            {
            // InternalPersistenceDsl.g:3395:2: ( ruleSimpleTypeCollection )
            // InternalPersistenceDsl.g:3396:3: ruleSimpleTypeCollection
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
    // InternalPersistenceDsl.g:3405:1: rule__DefSimpleTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3409:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3410:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3410:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3411:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008007FB0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008007FB2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002007FF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007FF0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003F90L});

}