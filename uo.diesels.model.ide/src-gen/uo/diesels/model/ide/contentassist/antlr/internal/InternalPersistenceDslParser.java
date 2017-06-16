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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_LIST", "RULE_SET", "RULE_TYPE_INT", "RULE_TYPE_DOUBLE", "RULE_TYPE_FLOAT", "RULE_TYPE_LONG", "RULE_TYPE_CHAR", "RULE_TYPE_STRING", "RULE_TYPE_BOOLEAN", "RULE_TYPE_BINARY", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Finder'", "'{'", "'}'", "'('", "')'", "','", "'#'", "'<'", "'>'", "'non-null'"
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

                if ( (LA1_0==22) ) {
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
            case 28:
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
            case RULE_TYPE_BINARY:
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

                if ( (LA3_1==29) ) {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt3=2;
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
                        alt3=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt3=1;
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
            case RULE_TYPE_BINARY:
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

                if ( (LA7_1==29) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_DATE||(LA7_3>=RULE_TYPE_INT && LA7_3<=RULE_TYPE_BINARY)) ) {
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

                if ( (LA7_2==29) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_DATE||(LA7_3>=RULE_TYPE_INT && LA7_3<=RULE_TYPE_BINARY)) ) {
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

            if ( ((LA8_0>=RULE_TYPE_INT && LA8_0<=RULE_TYPE_BINARY)) ) {
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
    // InternalPersistenceDsl.g:773:1: rule__BasicType__Alternatives : ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:777:1: ( ( RULE_TYPE_INT ) | ( RULE_TYPE_DOUBLE ) | ( RULE_TYPE_FLOAT ) | ( RULE_TYPE_LONG ) | ( RULE_TYPE_CHAR ) | ( RULE_TYPE_STRING ) | ( RULE_TYPE_BOOLEAN ) | ( RULE_TYPE_BINARY ) )
            int alt9=8;
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
            case RULE_TYPE_BINARY:
                {
                alt9=8;
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
                case 8 :
                    // InternalPersistenceDsl.g:820:2: ( RULE_TYPE_BINARY )
                    {
                    // InternalPersistenceDsl.g:820:2: ( RULE_TYPE_BINARY )
                    // InternalPersistenceDsl.g:821:3: RULE_TYPE_BINARY
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


    // $ANTLR start "rule__Finder__Group__0"
    // InternalPersistenceDsl.g:830:1: rule__Finder__Group__0 : rule__Finder__Group__0__Impl rule__Finder__Group__1 ;
    public final void rule__Finder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:834:1: ( rule__Finder__Group__0__Impl rule__Finder__Group__1 )
            // InternalPersistenceDsl.g:835:2: rule__Finder__Group__0__Impl rule__Finder__Group__1
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
    // InternalPersistenceDsl.g:842:1: rule__Finder__Group__0__Impl : ( 'Finder' ) ;
    public final void rule__Finder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:846:1: ( ( 'Finder' ) )
            // InternalPersistenceDsl.g:847:1: ( 'Finder' )
            {
            // InternalPersistenceDsl.g:847:1: ( 'Finder' )
            // InternalPersistenceDsl.g:848:2: 'Finder'
            {
             before(grammarAccess.getFinderAccess().getFinderKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:857:1: rule__Finder__Group__1 : rule__Finder__Group__1__Impl rule__Finder__Group__2 ;
    public final void rule__Finder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:861:1: ( rule__Finder__Group__1__Impl rule__Finder__Group__2 )
            // InternalPersistenceDsl.g:862:2: rule__Finder__Group__1__Impl rule__Finder__Group__2
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
    // InternalPersistenceDsl.g:869:1: rule__Finder__Group__1__Impl : ( ( rule__Finder__NameAssignment_1 ) ) ;
    public final void rule__Finder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:873:1: ( ( ( rule__Finder__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:874:1: ( ( rule__Finder__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:874:1: ( ( rule__Finder__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:875:2: ( rule__Finder__NameAssignment_1 )
            {
             before(grammarAccess.getFinderAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:876:2: ( rule__Finder__NameAssignment_1 )
            // InternalPersistenceDsl.g:876:3: rule__Finder__NameAssignment_1
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
    // InternalPersistenceDsl.g:884:1: rule__Finder__Group__2 : rule__Finder__Group__2__Impl rule__Finder__Group__3 ;
    public final void rule__Finder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:888:1: ( rule__Finder__Group__2__Impl rule__Finder__Group__3 )
            // InternalPersistenceDsl.g:889:2: rule__Finder__Group__2__Impl rule__Finder__Group__3
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
    // InternalPersistenceDsl.g:896:1: rule__Finder__Group__2__Impl : ( '{' ) ;
    public final void rule__Finder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:900:1: ( ( '{' ) )
            // InternalPersistenceDsl.g:901:1: ( '{' )
            {
            // InternalPersistenceDsl.g:901:1: ( '{' )
            // InternalPersistenceDsl.g:902:2: '{'
            {
             before(grammarAccess.getFinderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:911:1: rule__Finder__Group__3 : rule__Finder__Group__3__Impl rule__Finder__Group__4 ;
    public final void rule__Finder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:915:1: ( rule__Finder__Group__3__Impl rule__Finder__Group__4 )
            // InternalPersistenceDsl.g:916:2: rule__Finder__Group__3__Impl rule__Finder__Group__4
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
    // InternalPersistenceDsl.g:923:1: rule__Finder__Group__3__Impl : ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) ) ;
    public final void rule__Finder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:927:1: ( ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) ) )
            // InternalPersistenceDsl.g:928:1: ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) )
            {
            // InternalPersistenceDsl.g:928:1: ( ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* ) )
            // InternalPersistenceDsl.g:929:2: ( ( rule__Finder__MethodsAssignment_3 ) ) ( ( rule__Finder__MethodsAssignment_3 )* )
            {
            // InternalPersistenceDsl.g:929:2: ( ( rule__Finder__MethodsAssignment_3 ) )
            // InternalPersistenceDsl.g:930:3: ( rule__Finder__MethodsAssignment_3 )
            {
             before(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 
            // InternalPersistenceDsl.g:931:3: ( rule__Finder__MethodsAssignment_3 )
            // InternalPersistenceDsl.g:931:4: rule__Finder__MethodsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Finder__MethodsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 

            }

            // InternalPersistenceDsl.g:934:2: ( ( rule__Finder__MethodsAssignment_3 )* )
            // InternalPersistenceDsl.g:935:3: ( rule__Finder__MethodsAssignment_3 )*
            {
             before(grammarAccess.getFinderAccess().getMethodsAssignment_3()); 
            // InternalPersistenceDsl.g:936:3: ( rule__Finder__MethodsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_DATE && LA10_0<=RULE_LIST)||(LA10_0>=RULE_TYPE_INT && LA10_0<=RULE_ID)||LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPersistenceDsl.g:936:4: rule__Finder__MethodsAssignment_3
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
    // InternalPersistenceDsl.g:945:1: rule__Finder__Group__4 : rule__Finder__Group__4__Impl ;
    public final void rule__Finder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:949:1: ( rule__Finder__Group__4__Impl )
            // InternalPersistenceDsl.g:950:2: rule__Finder__Group__4__Impl
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
    // InternalPersistenceDsl.g:956:1: rule__Finder__Group__4__Impl : ( '}' ) ;
    public final void rule__Finder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:960:1: ( ( '}' ) )
            // InternalPersistenceDsl.g:961:1: ( '}' )
            {
            // InternalPersistenceDsl.g:961:1: ( '}' )
            // InternalPersistenceDsl.g:962:2: '}'
            {
             before(grammarAccess.getFinderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:972:1: rule__MethodSimpleReturn__Group__0 : rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 ;
    public final void rule__MethodSimpleReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:976:1: ( rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1 )
            // InternalPersistenceDsl.g:977:2: rule__MethodSimpleReturn__Group__0__Impl rule__MethodSimpleReturn__Group__1
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
    // InternalPersistenceDsl.g:984:1: rule__MethodSimpleReturn__Group__0__Impl : ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:988:1: ( ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:989:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:989:1: ( ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 ) )
            // InternalPersistenceDsl.g:990:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0()); 
            // InternalPersistenceDsl.g:991:2: ( rule__MethodSimpleReturn__ReturnTypeAssignment_0 )
            // InternalPersistenceDsl.g:991:3: rule__MethodSimpleReturn__ReturnTypeAssignment_0
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
    // InternalPersistenceDsl.g:999:1: rule__MethodSimpleReturn__Group__1 : rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 ;
    public final void rule__MethodSimpleReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1003:1: ( rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2 )
            // InternalPersistenceDsl.g:1004:2: rule__MethodSimpleReturn__Group__1__Impl rule__MethodSimpleReturn__Group__2
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
    // InternalPersistenceDsl.g:1011:1: rule__MethodSimpleReturn__Group__1__Impl : ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1015:1: ( ( ( rule__MethodSimpleReturn__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1016:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1016:1: ( ( rule__MethodSimpleReturn__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:1017:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:1018:2: ( rule__MethodSimpleReturn__NameAssignment_1 )
            // InternalPersistenceDsl.g:1018:3: rule__MethodSimpleReturn__NameAssignment_1
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
    // InternalPersistenceDsl.g:1026:1: rule__MethodSimpleReturn__Group__2 : rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 ;
    public final void rule__MethodSimpleReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1030:1: ( rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3 )
            // InternalPersistenceDsl.g:1031:2: rule__MethodSimpleReturn__Group__2__Impl rule__MethodSimpleReturn__Group__3
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
    // InternalPersistenceDsl.g:1038:1: rule__MethodSimpleReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodSimpleReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1042:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1043:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1043:1: ( '(' )
            // InternalPersistenceDsl.g:1044:2: '('
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1053:1: rule__MethodSimpleReturn__Group__3 : rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 ;
    public final void rule__MethodSimpleReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1057:1: ( rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4 )
            // InternalPersistenceDsl.g:1058:2: rule__MethodSimpleReturn__Group__3__Impl rule__MethodSimpleReturn__Group__4
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
    // InternalPersistenceDsl.g:1065:1: rule__MethodSimpleReturn__Group__3__Impl : ( ( rule__MethodSimpleReturn__Group_3__0 )? ) ;
    public final void rule__MethodSimpleReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1069:1: ( ( ( rule__MethodSimpleReturn__Group_3__0 )? ) )
            // InternalPersistenceDsl.g:1070:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            {
            // InternalPersistenceDsl.g:1070:1: ( ( rule__MethodSimpleReturn__Group_3__0 )? )
            // InternalPersistenceDsl.g:1071:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3()); 
            // InternalPersistenceDsl.g:1072:2: ( rule__MethodSimpleReturn__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_DATE && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPersistenceDsl.g:1072:3: rule__MethodSimpleReturn__Group_3__0
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
    // InternalPersistenceDsl.g:1080:1: rule__MethodSimpleReturn__Group__4 : rule__MethodSimpleReturn__Group__4__Impl rule__MethodSimpleReturn__Group__5 ;
    public final void rule__MethodSimpleReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1084:1: ( rule__MethodSimpleReturn__Group__4__Impl rule__MethodSimpleReturn__Group__5 )
            // InternalPersistenceDsl.g:1085:2: rule__MethodSimpleReturn__Group__4__Impl rule__MethodSimpleReturn__Group__5
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
    // InternalPersistenceDsl.g:1092:1: rule__MethodSimpleReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodSimpleReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1096:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1097:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1097:1: ( ')' )
            // InternalPersistenceDsl.g:1098:2: ')'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1107:1: rule__MethodSimpleReturn__Group__5 : rule__MethodSimpleReturn__Group__5__Impl ;
    public final void rule__MethodSimpleReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1111:1: ( rule__MethodSimpleReturn__Group__5__Impl )
            // InternalPersistenceDsl.g:1112:2: rule__MethodSimpleReturn__Group__5__Impl
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
    // InternalPersistenceDsl.g:1118:1: rule__MethodSimpleReturn__Group__5__Impl : ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? ) ;
    public final void rule__MethodSimpleReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1122:1: ( ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? ) )
            // InternalPersistenceDsl.g:1123:1: ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? )
            {
            // InternalPersistenceDsl.g:1123:1: ( ( rule__MethodSimpleReturn__NullableAssignment_5 )? )
            // InternalPersistenceDsl.g:1124:2: ( rule__MethodSimpleReturn__NullableAssignment_5 )?
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNullableAssignment_5()); 
            // InternalPersistenceDsl.g:1125:2: ( rule__MethodSimpleReturn__NullableAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPersistenceDsl.g:1125:3: rule__MethodSimpleReturn__NullableAssignment_5
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
    // InternalPersistenceDsl.g:1134:1: rule__MethodSimpleReturn__Group_3__0 : rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 ;
    public final void rule__MethodSimpleReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1138:1: ( rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1 )
            // InternalPersistenceDsl.g:1139:2: rule__MethodSimpleReturn__Group_3__0__Impl rule__MethodSimpleReturn__Group_3__1
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
    // InternalPersistenceDsl.g:1146:1: rule__MethodSimpleReturn__Group_3__0__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1150:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) ) )
            // InternalPersistenceDsl.g:1151:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            {
            // InternalPersistenceDsl.g:1151:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_0 ) )
            // InternalPersistenceDsl.g:1152:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0()); 
            // InternalPersistenceDsl.g:1153:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_0 )
            // InternalPersistenceDsl.g:1153:3: rule__MethodSimpleReturn__ParametersAssignment_3_0
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
    // InternalPersistenceDsl.g:1161:1: rule__MethodSimpleReturn__Group_3__1 : rule__MethodSimpleReturn__Group_3__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1165:1: ( rule__MethodSimpleReturn__Group_3__1__Impl )
            // InternalPersistenceDsl.g:1166:2: rule__MethodSimpleReturn__Group_3__1__Impl
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
    // InternalPersistenceDsl.g:1172:1: rule__MethodSimpleReturn__Group_3__1__Impl : ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodSimpleReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1176:1: ( ( ( rule__MethodSimpleReturn__Group_3_1__0 )* ) )
            // InternalPersistenceDsl.g:1177:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            {
            // InternalPersistenceDsl.g:1177:1: ( ( rule__MethodSimpleReturn__Group_3_1__0 )* )
            // InternalPersistenceDsl.g:1178:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1()); 
            // InternalPersistenceDsl.g:1179:2: ( rule__MethodSimpleReturn__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1179:3: rule__MethodSimpleReturn__Group_3_1__0
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
    // InternalPersistenceDsl.g:1188:1: rule__MethodSimpleReturn__Group_3_1__0 : rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 ;
    public final void rule__MethodSimpleReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1192:1: ( rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1 )
            // InternalPersistenceDsl.g:1193:2: rule__MethodSimpleReturn__Group_3_1__0__Impl rule__MethodSimpleReturn__Group_3_1__1
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
    // InternalPersistenceDsl.g:1200:1: rule__MethodSimpleReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1204:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:1205:1: ( ',' )
            {
            // InternalPersistenceDsl.g:1205:1: ( ',' )
            // InternalPersistenceDsl.g:1206:2: ','
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1215:1: rule__MethodSimpleReturn__Group_3_1__1 : rule__MethodSimpleReturn__Group_3_1__1__Impl ;
    public final void rule__MethodSimpleReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1219:1: ( rule__MethodSimpleReturn__Group_3_1__1__Impl )
            // InternalPersistenceDsl.g:1220:2: rule__MethodSimpleReturn__Group_3_1__1__Impl
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
    // InternalPersistenceDsl.g:1226:1: rule__MethodSimpleReturn__Group_3_1__1__Impl : ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodSimpleReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1230:1: ( ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalPersistenceDsl.g:1231:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalPersistenceDsl.g:1231:1: ( ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 ) )
            // InternalPersistenceDsl.g:1232:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalPersistenceDsl.g:1233:2: ( rule__MethodSimpleReturn__ParametersAssignment_3_1_1 )
            // InternalPersistenceDsl.g:1233:3: rule__MethodSimpleReturn__ParametersAssignment_3_1_1
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
    // InternalPersistenceDsl.g:1242:1: rule__MethodEntityReturn__Group__0 : rule__MethodEntityReturn__Group__0__Impl rule__MethodEntityReturn__Group__1 ;
    public final void rule__MethodEntityReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1246:1: ( rule__MethodEntityReturn__Group__0__Impl rule__MethodEntityReturn__Group__1 )
            // InternalPersistenceDsl.g:1247:2: rule__MethodEntityReturn__Group__0__Impl rule__MethodEntityReturn__Group__1
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
    // InternalPersistenceDsl.g:1254:1: rule__MethodEntityReturn__Group__0__Impl : ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodEntityReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1258:1: ( ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:1259:1: ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:1259:1: ( ( rule__MethodEntityReturn__ReturnTypeAssignment_0 ) )
            // InternalPersistenceDsl.g:1260:2: ( rule__MethodEntityReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getReturnTypeAssignment_0()); 
            // InternalPersistenceDsl.g:1261:2: ( rule__MethodEntityReturn__ReturnTypeAssignment_0 )
            // InternalPersistenceDsl.g:1261:3: rule__MethodEntityReturn__ReturnTypeAssignment_0
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
    // InternalPersistenceDsl.g:1269:1: rule__MethodEntityReturn__Group__1 : rule__MethodEntityReturn__Group__1__Impl rule__MethodEntityReturn__Group__2 ;
    public final void rule__MethodEntityReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1273:1: ( rule__MethodEntityReturn__Group__1__Impl rule__MethodEntityReturn__Group__2 )
            // InternalPersistenceDsl.g:1274:2: rule__MethodEntityReturn__Group__1__Impl rule__MethodEntityReturn__Group__2
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
    // InternalPersistenceDsl.g:1281:1: rule__MethodEntityReturn__Group__1__Impl : ( ( rule__MethodEntityReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodEntityReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1285:1: ( ( ( rule__MethodEntityReturn__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1286:1: ( ( rule__MethodEntityReturn__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1286:1: ( ( rule__MethodEntityReturn__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:1287:2: ( rule__MethodEntityReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:1288:2: ( rule__MethodEntityReturn__NameAssignment_1 )
            // InternalPersistenceDsl.g:1288:3: rule__MethodEntityReturn__NameAssignment_1
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
    // InternalPersistenceDsl.g:1296:1: rule__MethodEntityReturn__Group__2 : rule__MethodEntityReturn__Group__2__Impl rule__MethodEntityReturn__Group__3 ;
    public final void rule__MethodEntityReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1300:1: ( rule__MethodEntityReturn__Group__2__Impl rule__MethodEntityReturn__Group__3 )
            // InternalPersistenceDsl.g:1301:2: rule__MethodEntityReturn__Group__2__Impl rule__MethodEntityReturn__Group__3
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
    // InternalPersistenceDsl.g:1308:1: rule__MethodEntityReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodEntityReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1312:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1313:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1313:1: ( '(' )
            // InternalPersistenceDsl.g:1314:2: '('
            {
             before(grammarAccess.getMethodEntityReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1323:1: rule__MethodEntityReturn__Group__3 : rule__MethodEntityReturn__Group__3__Impl rule__MethodEntityReturn__Group__4 ;
    public final void rule__MethodEntityReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1327:1: ( rule__MethodEntityReturn__Group__3__Impl rule__MethodEntityReturn__Group__4 )
            // InternalPersistenceDsl.g:1328:2: rule__MethodEntityReturn__Group__3__Impl rule__MethodEntityReturn__Group__4
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
    // InternalPersistenceDsl.g:1335:1: rule__MethodEntityReturn__Group__3__Impl : ( ( rule__MethodEntityReturn__Group_3__0 )? ) ;
    public final void rule__MethodEntityReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1339:1: ( ( ( rule__MethodEntityReturn__Group_3__0 )? ) )
            // InternalPersistenceDsl.g:1340:1: ( ( rule__MethodEntityReturn__Group_3__0 )? )
            {
            // InternalPersistenceDsl.g:1340:1: ( ( rule__MethodEntityReturn__Group_3__0 )? )
            // InternalPersistenceDsl.g:1341:2: ( rule__MethodEntityReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodEntityReturnAccess().getGroup_3()); 
            // InternalPersistenceDsl.g:1342:2: ( rule__MethodEntityReturn__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_DATE && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPersistenceDsl.g:1342:3: rule__MethodEntityReturn__Group_3__0
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
    // InternalPersistenceDsl.g:1350:1: rule__MethodEntityReturn__Group__4 : rule__MethodEntityReturn__Group__4__Impl rule__MethodEntityReturn__Group__5 ;
    public final void rule__MethodEntityReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1354:1: ( rule__MethodEntityReturn__Group__4__Impl rule__MethodEntityReturn__Group__5 )
            // InternalPersistenceDsl.g:1355:2: rule__MethodEntityReturn__Group__4__Impl rule__MethodEntityReturn__Group__5
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
    // InternalPersistenceDsl.g:1362:1: rule__MethodEntityReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodEntityReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1366:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1367:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1367:1: ( ')' )
            // InternalPersistenceDsl.g:1368:2: ')'
            {
             before(grammarAccess.getMethodEntityReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1377:1: rule__MethodEntityReturn__Group__5 : rule__MethodEntityReturn__Group__5__Impl ;
    public final void rule__MethodEntityReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1381:1: ( rule__MethodEntityReturn__Group__5__Impl )
            // InternalPersistenceDsl.g:1382:2: rule__MethodEntityReturn__Group__5__Impl
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
    // InternalPersistenceDsl.g:1388:1: rule__MethodEntityReturn__Group__5__Impl : ( ( rule__MethodEntityReturn__NullableAssignment_5 )? ) ;
    public final void rule__MethodEntityReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1392:1: ( ( ( rule__MethodEntityReturn__NullableAssignment_5 )? ) )
            // InternalPersistenceDsl.g:1393:1: ( ( rule__MethodEntityReturn__NullableAssignment_5 )? )
            {
            // InternalPersistenceDsl.g:1393:1: ( ( rule__MethodEntityReturn__NullableAssignment_5 )? )
            // InternalPersistenceDsl.g:1394:2: ( rule__MethodEntityReturn__NullableAssignment_5 )?
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNullableAssignment_5()); 
            // InternalPersistenceDsl.g:1395:2: ( rule__MethodEntityReturn__NullableAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPersistenceDsl.g:1395:3: rule__MethodEntityReturn__NullableAssignment_5
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
    // InternalPersistenceDsl.g:1404:1: rule__MethodEntityReturn__Group_3__0 : rule__MethodEntityReturn__Group_3__0__Impl rule__MethodEntityReturn__Group_3__1 ;
    public final void rule__MethodEntityReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1408:1: ( rule__MethodEntityReturn__Group_3__0__Impl rule__MethodEntityReturn__Group_3__1 )
            // InternalPersistenceDsl.g:1409:2: rule__MethodEntityReturn__Group_3__0__Impl rule__MethodEntityReturn__Group_3__1
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
    // InternalPersistenceDsl.g:1416:1: rule__MethodEntityReturn__Group_3__0__Impl : ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodEntityReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1420:1: ( ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) ) )
            // InternalPersistenceDsl.g:1421:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) )
            {
            // InternalPersistenceDsl.g:1421:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_0 ) )
            // InternalPersistenceDsl.g:1422:2: ( rule__MethodEntityReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getParametersAssignment_3_0()); 
            // InternalPersistenceDsl.g:1423:2: ( rule__MethodEntityReturn__ParametersAssignment_3_0 )
            // InternalPersistenceDsl.g:1423:3: rule__MethodEntityReturn__ParametersAssignment_3_0
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
    // InternalPersistenceDsl.g:1431:1: rule__MethodEntityReturn__Group_3__1 : rule__MethodEntityReturn__Group_3__1__Impl ;
    public final void rule__MethodEntityReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1435:1: ( rule__MethodEntityReturn__Group_3__1__Impl )
            // InternalPersistenceDsl.g:1436:2: rule__MethodEntityReturn__Group_3__1__Impl
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
    // InternalPersistenceDsl.g:1442:1: rule__MethodEntityReturn__Group_3__1__Impl : ( ( rule__MethodEntityReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodEntityReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1446:1: ( ( ( rule__MethodEntityReturn__Group_3_1__0 )* ) )
            // InternalPersistenceDsl.g:1447:1: ( ( rule__MethodEntityReturn__Group_3_1__0 )* )
            {
            // InternalPersistenceDsl.g:1447:1: ( ( rule__MethodEntityReturn__Group_3_1__0 )* )
            // InternalPersistenceDsl.g:1448:2: ( rule__MethodEntityReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodEntityReturnAccess().getGroup_3_1()); 
            // InternalPersistenceDsl.g:1449:2: ( rule__MethodEntityReturn__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1449:3: rule__MethodEntityReturn__Group_3_1__0
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
    // InternalPersistenceDsl.g:1458:1: rule__MethodEntityReturn__Group_3_1__0 : rule__MethodEntityReturn__Group_3_1__0__Impl rule__MethodEntityReturn__Group_3_1__1 ;
    public final void rule__MethodEntityReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1462:1: ( rule__MethodEntityReturn__Group_3_1__0__Impl rule__MethodEntityReturn__Group_3_1__1 )
            // InternalPersistenceDsl.g:1463:2: rule__MethodEntityReturn__Group_3_1__0__Impl rule__MethodEntityReturn__Group_3_1__1
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
    // InternalPersistenceDsl.g:1470:1: rule__MethodEntityReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodEntityReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1474:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:1475:1: ( ',' )
            {
            // InternalPersistenceDsl.g:1475:1: ( ',' )
            // InternalPersistenceDsl.g:1476:2: ','
            {
             before(grammarAccess.getMethodEntityReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1485:1: rule__MethodEntityReturn__Group_3_1__1 : rule__MethodEntityReturn__Group_3_1__1__Impl ;
    public final void rule__MethodEntityReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1489:1: ( rule__MethodEntityReturn__Group_3_1__1__Impl )
            // InternalPersistenceDsl.g:1490:2: rule__MethodEntityReturn__Group_3_1__1__Impl
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
    // InternalPersistenceDsl.g:1496:1: rule__MethodEntityReturn__Group_3_1__1__Impl : ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodEntityReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1500:1: ( ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalPersistenceDsl.g:1501:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalPersistenceDsl.g:1501:1: ( ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 ) )
            // InternalPersistenceDsl.g:1502:2: ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalPersistenceDsl.g:1503:2: ( rule__MethodEntityReturn__ParametersAssignment_3_1_1 )
            // InternalPersistenceDsl.g:1503:3: rule__MethodEntityReturn__ParametersAssignment_3_1_1
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
    // InternalPersistenceDsl.g:1512:1: rule__MethodDtoReturn__Group__0 : rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 ;
    public final void rule__MethodDtoReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1516:1: ( rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1 )
            // InternalPersistenceDsl.g:1517:2: rule__MethodDtoReturn__Group__0__Impl rule__MethodDtoReturn__Group__1
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
    // InternalPersistenceDsl.g:1524:1: rule__MethodDtoReturn__Group__0__Impl : ( '#' ) ;
    public final void rule__MethodDtoReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1528:1: ( ( '#' ) )
            // InternalPersistenceDsl.g:1529:1: ( '#' )
            {
            // InternalPersistenceDsl.g:1529:1: ( '#' )
            // InternalPersistenceDsl.g:1530:2: '#'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1539:1: rule__MethodDtoReturn__Group__1 : rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 ;
    public final void rule__MethodDtoReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1543:1: ( rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2 )
            // InternalPersistenceDsl.g:1544:2: rule__MethodDtoReturn__Group__1__Impl rule__MethodDtoReturn__Group__2
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
    // InternalPersistenceDsl.g:1551:1: rule__MethodDtoReturn__Group__1__Impl : ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodDtoReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1555:1: ( ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1556:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1556:1: ( ( rule__MethodDtoReturn__ReturnTypeAssignment_1 ) )
            // InternalPersistenceDsl.g:1557:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeAssignment_1()); 
            // InternalPersistenceDsl.g:1558:2: ( rule__MethodDtoReturn__ReturnTypeAssignment_1 )
            // InternalPersistenceDsl.g:1558:3: rule__MethodDtoReturn__ReturnTypeAssignment_1
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
    // InternalPersistenceDsl.g:1566:1: rule__MethodDtoReturn__Group__2 : rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 ;
    public final void rule__MethodDtoReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1570:1: ( rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3 )
            // InternalPersistenceDsl.g:1571:2: rule__MethodDtoReturn__Group__2__Impl rule__MethodDtoReturn__Group__3
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
    // InternalPersistenceDsl.g:1578:1: rule__MethodDtoReturn__Group__2__Impl : ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) ;
    public final void rule__MethodDtoReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1582:1: ( ( ( rule__MethodDtoReturn__NameAssignment_2 ) ) )
            // InternalPersistenceDsl.g:1583:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:1583:1: ( ( rule__MethodDtoReturn__NameAssignment_2 ) )
            // InternalPersistenceDsl.g:1584:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNameAssignment_2()); 
            // InternalPersistenceDsl.g:1585:2: ( rule__MethodDtoReturn__NameAssignment_2 )
            // InternalPersistenceDsl.g:1585:3: rule__MethodDtoReturn__NameAssignment_2
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
    // InternalPersistenceDsl.g:1593:1: rule__MethodDtoReturn__Group__3 : rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 ;
    public final void rule__MethodDtoReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1597:1: ( rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4 )
            // InternalPersistenceDsl.g:1598:2: rule__MethodDtoReturn__Group__3__Impl rule__MethodDtoReturn__Group__4
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
    // InternalPersistenceDsl.g:1605:1: rule__MethodDtoReturn__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDtoReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1609:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1610:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1610:1: ( '(' )
            // InternalPersistenceDsl.g:1611:2: '('
            {
             before(grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1620:1: rule__MethodDtoReturn__Group__4 : rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 ;
    public final void rule__MethodDtoReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1624:1: ( rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5 )
            // InternalPersistenceDsl.g:1625:2: rule__MethodDtoReturn__Group__4__Impl rule__MethodDtoReturn__Group__5
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
    // InternalPersistenceDsl.g:1632:1: rule__MethodDtoReturn__Group__4__Impl : ( ( rule__MethodDtoReturn__Group_4__0 )? ) ;
    public final void rule__MethodDtoReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1636:1: ( ( ( rule__MethodDtoReturn__Group_4__0 )? ) )
            // InternalPersistenceDsl.g:1637:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            {
            // InternalPersistenceDsl.g:1637:1: ( ( rule__MethodDtoReturn__Group_4__0 )? )
            // InternalPersistenceDsl.g:1638:2: ( rule__MethodDtoReturn__Group_4__0 )?
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4()); 
            // InternalPersistenceDsl.g:1639:2: ( rule__MethodDtoReturn__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_DATE && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPersistenceDsl.g:1639:3: rule__MethodDtoReturn__Group_4__0
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
    // InternalPersistenceDsl.g:1647:1: rule__MethodDtoReturn__Group__5 : rule__MethodDtoReturn__Group__5__Impl rule__MethodDtoReturn__Group__6 ;
    public final void rule__MethodDtoReturn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1651:1: ( rule__MethodDtoReturn__Group__5__Impl rule__MethodDtoReturn__Group__6 )
            // InternalPersistenceDsl.g:1652:2: rule__MethodDtoReturn__Group__5__Impl rule__MethodDtoReturn__Group__6
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
    // InternalPersistenceDsl.g:1659:1: rule__MethodDtoReturn__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDtoReturn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1663:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1664:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1664:1: ( ')' )
            // InternalPersistenceDsl.g:1665:2: ')'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1674:1: rule__MethodDtoReturn__Group__6 : rule__MethodDtoReturn__Group__6__Impl ;
    public final void rule__MethodDtoReturn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1678:1: ( rule__MethodDtoReturn__Group__6__Impl )
            // InternalPersistenceDsl.g:1679:2: rule__MethodDtoReturn__Group__6__Impl
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
    // InternalPersistenceDsl.g:1685:1: rule__MethodDtoReturn__Group__6__Impl : ( ( rule__MethodDtoReturn__NullableAssignment_6 )? ) ;
    public final void rule__MethodDtoReturn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1689:1: ( ( ( rule__MethodDtoReturn__NullableAssignment_6 )? ) )
            // InternalPersistenceDsl.g:1690:1: ( ( rule__MethodDtoReturn__NullableAssignment_6 )? )
            {
            // InternalPersistenceDsl.g:1690:1: ( ( rule__MethodDtoReturn__NullableAssignment_6 )? )
            // InternalPersistenceDsl.g:1691:2: ( rule__MethodDtoReturn__NullableAssignment_6 )?
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNullableAssignment_6()); 
            // InternalPersistenceDsl.g:1692:2: ( rule__MethodDtoReturn__NullableAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPersistenceDsl.g:1692:3: rule__MethodDtoReturn__NullableAssignment_6
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
    // InternalPersistenceDsl.g:1701:1: rule__MethodDtoReturn__Group_4__0 : rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 ;
    public final void rule__MethodDtoReturn__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1705:1: ( rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1 )
            // InternalPersistenceDsl.g:1706:2: rule__MethodDtoReturn__Group_4__0__Impl rule__MethodDtoReturn__Group_4__1
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
    // InternalPersistenceDsl.g:1713:1: rule__MethodDtoReturn__Group_4__0__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) ;
    public final void rule__MethodDtoReturn__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1717:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) ) )
            // InternalPersistenceDsl.g:1718:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            {
            // InternalPersistenceDsl.g:1718:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_0 ) )
            // InternalPersistenceDsl.g:1719:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_0()); 
            // InternalPersistenceDsl.g:1720:2: ( rule__MethodDtoReturn__ParametersAssignment_4_0 )
            // InternalPersistenceDsl.g:1720:3: rule__MethodDtoReturn__ParametersAssignment_4_0
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
    // InternalPersistenceDsl.g:1728:1: rule__MethodDtoReturn__Group_4__1 : rule__MethodDtoReturn__Group_4__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1732:1: ( rule__MethodDtoReturn__Group_4__1__Impl )
            // InternalPersistenceDsl.g:1733:2: rule__MethodDtoReturn__Group_4__1__Impl
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
    // InternalPersistenceDsl.g:1739:1: rule__MethodDtoReturn__Group_4__1__Impl : ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) ;
    public final void rule__MethodDtoReturn__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1743:1: ( ( ( rule__MethodDtoReturn__Group_4_1__0 )* ) )
            // InternalPersistenceDsl.g:1744:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            {
            // InternalPersistenceDsl.g:1744:1: ( ( rule__MethodDtoReturn__Group_4_1__0 )* )
            // InternalPersistenceDsl.g:1745:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodDtoReturnAccess().getGroup_4_1()); 
            // InternalPersistenceDsl.g:1746:2: ( rule__MethodDtoReturn__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1746:3: rule__MethodDtoReturn__Group_4_1__0
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
    // InternalPersistenceDsl.g:1755:1: rule__MethodDtoReturn__Group_4_1__0 : rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 ;
    public final void rule__MethodDtoReturn__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1759:1: ( rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1 )
            // InternalPersistenceDsl.g:1760:2: rule__MethodDtoReturn__Group_4_1__0__Impl rule__MethodDtoReturn__Group_4_1__1
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
    // InternalPersistenceDsl.g:1767:1: rule__MethodDtoReturn__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MethodDtoReturn__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1771:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:1772:1: ( ',' )
            {
            // InternalPersistenceDsl.g:1772:1: ( ',' )
            // InternalPersistenceDsl.g:1773:2: ','
            {
             before(grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1782:1: rule__MethodDtoReturn__Group_4_1__1 : rule__MethodDtoReturn__Group_4_1__1__Impl ;
    public final void rule__MethodDtoReturn__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1786:1: ( rule__MethodDtoReturn__Group_4_1__1__Impl )
            // InternalPersistenceDsl.g:1787:2: rule__MethodDtoReturn__Group_4_1__1__Impl
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
    // InternalPersistenceDsl.g:1793:1: rule__MethodDtoReturn__Group_4_1__1__Impl : ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__MethodDtoReturn__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1797:1: ( ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) ) )
            // InternalPersistenceDsl.g:1798:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            {
            // InternalPersistenceDsl.g:1798:1: ( ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 ) )
            // InternalPersistenceDsl.g:1799:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_1_1()); 
            // InternalPersistenceDsl.g:1800:2: ( rule__MethodDtoReturn__ParametersAssignment_4_1_1 )
            // InternalPersistenceDsl.g:1800:3: rule__MethodDtoReturn__ParametersAssignment_4_1_1
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
    // InternalPersistenceDsl.g:1809:1: rule__MethodCollectionReturn__Group__0 : rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 ;
    public final void rule__MethodCollectionReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1813:1: ( rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1 )
            // InternalPersistenceDsl.g:1814:2: rule__MethodCollectionReturn__Group__0__Impl rule__MethodCollectionReturn__Group__1
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
    // InternalPersistenceDsl.g:1821:1: rule__MethodCollectionReturn__Group__0__Impl : ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1825:1: ( ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:1826:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:1826:1: ( ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 ) )
            // InternalPersistenceDsl.g:1827:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0()); 
            // InternalPersistenceDsl.g:1828:2: ( rule__MethodCollectionReturn__ReturnTypeAssignment_0 )
            // InternalPersistenceDsl.g:1828:3: rule__MethodCollectionReturn__ReturnTypeAssignment_0
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
    // InternalPersistenceDsl.g:1836:1: rule__MethodCollectionReturn__Group__1 : rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 ;
    public final void rule__MethodCollectionReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1840:1: ( rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2 )
            // InternalPersistenceDsl.g:1841:2: rule__MethodCollectionReturn__Group__1__Impl rule__MethodCollectionReturn__Group__2
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
    // InternalPersistenceDsl.g:1848:1: rule__MethodCollectionReturn__Group__1__Impl : ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1852:1: ( ( ( rule__MethodCollectionReturn__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:1853:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:1853:1: ( ( rule__MethodCollectionReturn__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:1854:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:1855:2: ( rule__MethodCollectionReturn__NameAssignment_1 )
            // InternalPersistenceDsl.g:1855:3: rule__MethodCollectionReturn__NameAssignment_1
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
    // InternalPersistenceDsl.g:1863:1: rule__MethodCollectionReturn__Group__2 : rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 ;
    public final void rule__MethodCollectionReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1867:1: ( rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3 )
            // InternalPersistenceDsl.g:1868:2: rule__MethodCollectionReturn__Group__2__Impl rule__MethodCollectionReturn__Group__3
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
    // InternalPersistenceDsl.g:1875:1: rule__MethodCollectionReturn__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodCollectionReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1879:1: ( ( '(' ) )
            // InternalPersistenceDsl.g:1880:1: ( '(' )
            {
            // InternalPersistenceDsl.g:1880:1: ( '(' )
            // InternalPersistenceDsl.g:1881:2: '('
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1890:1: rule__MethodCollectionReturn__Group__3 : rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 ;
    public final void rule__MethodCollectionReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1894:1: ( rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4 )
            // InternalPersistenceDsl.g:1895:2: rule__MethodCollectionReturn__Group__3__Impl rule__MethodCollectionReturn__Group__4
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
    // InternalPersistenceDsl.g:1902:1: rule__MethodCollectionReturn__Group__3__Impl : ( ( rule__MethodCollectionReturn__Group_3__0 )? ) ;
    public final void rule__MethodCollectionReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1906:1: ( ( ( rule__MethodCollectionReturn__Group_3__0 )? ) )
            // InternalPersistenceDsl.g:1907:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            {
            // InternalPersistenceDsl.g:1907:1: ( ( rule__MethodCollectionReturn__Group_3__0 )? )
            // InternalPersistenceDsl.g:1908:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3()); 
            // InternalPersistenceDsl.g:1909:2: ( rule__MethodCollectionReturn__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_DATE && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPersistenceDsl.g:1909:3: rule__MethodCollectionReturn__Group_3__0
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
    // InternalPersistenceDsl.g:1917:1: rule__MethodCollectionReturn__Group__4 : rule__MethodCollectionReturn__Group__4__Impl ;
    public final void rule__MethodCollectionReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1921:1: ( rule__MethodCollectionReturn__Group__4__Impl )
            // InternalPersistenceDsl.g:1922:2: rule__MethodCollectionReturn__Group__4__Impl
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
    // InternalPersistenceDsl.g:1928:1: rule__MethodCollectionReturn__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodCollectionReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1932:1: ( ( ')' ) )
            // InternalPersistenceDsl.g:1933:1: ( ')' )
            {
            // InternalPersistenceDsl.g:1933:1: ( ')' )
            // InternalPersistenceDsl.g:1934:2: ')'
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:1944:1: rule__MethodCollectionReturn__Group_3__0 : rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 ;
    public final void rule__MethodCollectionReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1948:1: ( rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1 )
            // InternalPersistenceDsl.g:1949:2: rule__MethodCollectionReturn__Group_3__0__Impl rule__MethodCollectionReturn__Group_3__1
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
    // InternalPersistenceDsl.g:1956:1: rule__MethodCollectionReturn__Group_3__0__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1960:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) ) )
            // InternalPersistenceDsl.g:1961:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            {
            // InternalPersistenceDsl.g:1961:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_0 ) )
            // InternalPersistenceDsl.g:1962:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0()); 
            // InternalPersistenceDsl.g:1963:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_0 )
            // InternalPersistenceDsl.g:1963:3: rule__MethodCollectionReturn__ParametersAssignment_3_0
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
    // InternalPersistenceDsl.g:1971:1: rule__MethodCollectionReturn__Group_3__1 : rule__MethodCollectionReturn__Group_3__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1975:1: ( rule__MethodCollectionReturn__Group_3__1__Impl )
            // InternalPersistenceDsl.g:1976:2: rule__MethodCollectionReturn__Group_3__1__Impl
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
    // InternalPersistenceDsl.g:1982:1: rule__MethodCollectionReturn__Group_3__1__Impl : ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) ;
    public final void rule__MethodCollectionReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:1986:1: ( ( ( rule__MethodCollectionReturn__Group_3_1__0 )* ) )
            // InternalPersistenceDsl.g:1987:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            {
            // InternalPersistenceDsl.g:1987:1: ( ( rule__MethodCollectionReturn__Group_3_1__0 )* )
            // InternalPersistenceDsl.g:1988:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1()); 
            // InternalPersistenceDsl.g:1989:2: ( rule__MethodCollectionReturn__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPersistenceDsl.g:1989:3: rule__MethodCollectionReturn__Group_3_1__0
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
    // InternalPersistenceDsl.g:1998:1: rule__MethodCollectionReturn__Group_3_1__0 : rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 ;
    public final void rule__MethodCollectionReturn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2002:1: ( rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1 )
            // InternalPersistenceDsl.g:2003:2: rule__MethodCollectionReturn__Group_3_1__0__Impl rule__MethodCollectionReturn__Group_3_1__1
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
    // InternalPersistenceDsl.g:2010:1: rule__MethodCollectionReturn__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2014:1: ( ( ',' ) )
            // InternalPersistenceDsl.g:2015:1: ( ',' )
            {
            // InternalPersistenceDsl.g:2015:1: ( ',' )
            // InternalPersistenceDsl.g:2016:2: ','
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2025:1: rule__MethodCollectionReturn__Group_3_1__1 : rule__MethodCollectionReturn__Group_3_1__1__Impl ;
    public final void rule__MethodCollectionReturn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2029:1: ( rule__MethodCollectionReturn__Group_3_1__1__Impl )
            // InternalPersistenceDsl.g:2030:2: rule__MethodCollectionReturn__Group_3_1__1__Impl
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
    // InternalPersistenceDsl.g:2036:1: rule__MethodCollectionReturn__Group_3_1__1__Impl : ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__MethodCollectionReturn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2040:1: ( ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) ) )
            // InternalPersistenceDsl.g:2041:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            {
            // InternalPersistenceDsl.g:2041:1: ( ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 ) )
            // InternalPersistenceDsl.g:2042:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1()); 
            // InternalPersistenceDsl.g:2043:2: ( rule__MethodCollectionReturn__ParametersAssignment_3_1_1 )
            // InternalPersistenceDsl.g:2043:3: rule__MethodCollectionReturn__ParametersAssignment_3_1_1
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
    // InternalPersistenceDsl.g:2052:1: rule__EntityReturnTypeCollection__Group__0 : rule__EntityReturnTypeCollection__Group__0__Impl rule__EntityReturnTypeCollection__Group__1 ;
    public final void rule__EntityReturnTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2056:1: ( rule__EntityReturnTypeCollection__Group__0__Impl rule__EntityReturnTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2057:2: rule__EntityReturnTypeCollection__Group__0__Impl rule__EntityReturnTypeCollection__Group__1
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
    // InternalPersistenceDsl.g:2064:1: rule__EntityReturnTypeCollection__Group__0__Impl : ( RULE_LIST ) ;
    public final void rule__EntityReturnTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2068:1: ( ( RULE_LIST ) )
            // InternalPersistenceDsl.g:2069:1: ( RULE_LIST )
            {
            // InternalPersistenceDsl.g:2069:1: ( RULE_LIST )
            // InternalPersistenceDsl.g:2070:2: RULE_LIST
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
    // InternalPersistenceDsl.g:2079:1: rule__EntityReturnTypeCollection__Group__1 : rule__EntityReturnTypeCollection__Group__1__Impl rule__EntityReturnTypeCollection__Group__2 ;
    public final void rule__EntityReturnTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2083:1: ( rule__EntityReturnTypeCollection__Group__1__Impl rule__EntityReturnTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2084:2: rule__EntityReturnTypeCollection__Group__1__Impl rule__EntityReturnTypeCollection__Group__2
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
    // InternalPersistenceDsl.g:2091:1: rule__EntityReturnTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__EntityReturnTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2095:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2096:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2096:1: ( '<' )
            // InternalPersistenceDsl.g:2097:2: '<'
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2106:1: rule__EntityReturnTypeCollection__Group__2 : rule__EntityReturnTypeCollection__Group__2__Impl rule__EntityReturnTypeCollection__Group__3 ;
    public final void rule__EntityReturnTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2110:1: ( rule__EntityReturnTypeCollection__Group__2__Impl rule__EntityReturnTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2111:2: rule__EntityReturnTypeCollection__Group__2__Impl rule__EntityReturnTypeCollection__Group__3
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
    // InternalPersistenceDsl.g:2118:1: rule__EntityReturnTypeCollection__Group__2__Impl : ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__EntityReturnTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2122:1: ( ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2123:1: ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2123:1: ( ( rule__EntityReturnTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2124:2: ( rule__EntityReturnTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2125:2: ( rule__EntityReturnTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2125:3: rule__EntityReturnTypeCollection__TypeAssignment_2
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
    // InternalPersistenceDsl.g:2133:1: rule__EntityReturnTypeCollection__Group__3 : rule__EntityReturnTypeCollection__Group__3__Impl ;
    public final void rule__EntityReturnTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2137:1: ( rule__EntityReturnTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2138:2: rule__EntityReturnTypeCollection__Group__3__Impl
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
    // InternalPersistenceDsl.g:2144:1: rule__EntityReturnTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__EntityReturnTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2148:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2149:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2149:1: ( '>' )
            // InternalPersistenceDsl.g:2150:2: '>'
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2160:1: rule__DtoReturnTypeCollection__Group__0 : rule__DtoReturnTypeCollection__Group__0__Impl rule__DtoReturnTypeCollection__Group__1 ;
    public final void rule__DtoReturnTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2164:1: ( rule__DtoReturnTypeCollection__Group__0__Impl rule__DtoReturnTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2165:2: rule__DtoReturnTypeCollection__Group__0__Impl rule__DtoReturnTypeCollection__Group__1
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
    // InternalPersistenceDsl.g:2172:1: rule__DtoReturnTypeCollection__Group__0__Impl : ( RULE_LIST ) ;
    public final void rule__DtoReturnTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2176:1: ( ( RULE_LIST ) )
            // InternalPersistenceDsl.g:2177:1: ( RULE_LIST )
            {
            // InternalPersistenceDsl.g:2177:1: ( RULE_LIST )
            // InternalPersistenceDsl.g:2178:2: RULE_LIST
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
    // InternalPersistenceDsl.g:2187:1: rule__DtoReturnTypeCollection__Group__1 : rule__DtoReturnTypeCollection__Group__1__Impl rule__DtoReturnTypeCollection__Group__2 ;
    public final void rule__DtoReturnTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2191:1: ( rule__DtoReturnTypeCollection__Group__1__Impl rule__DtoReturnTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2192:2: rule__DtoReturnTypeCollection__Group__1__Impl rule__DtoReturnTypeCollection__Group__2
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
    // InternalPersistenceDsl.g:2199:1: rule__DtoReturnTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__DtoReturnTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2203:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2204:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2204:1: ( '<' )
            // InternalPersistenceDsl.g:2205:2: '<'
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2214:1: rule__DtoReturnTypeCollection__Group__2 : rule__DtoReturnTypeCollection__Group__2__Impl rule__DtoReturnTypeCollection__Group__3 ;
    public final void rule__DtoReturnTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2218:1: ( rule__DtoReturnTypeCollection__Group__2__Impl rule__DtoReturnTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2219:2: rule__DtoReturnTypeCollection__Group__2__Impl rule__DtoReturnTypeCollection__Group__3
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
    // InternalPersistenceDsl.g:2226:1: rule__DtoReturnTypeCollection__Group__2__Impl : ( '#' ) ;
    public final void rule__DtoReturnTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2230:1: ( ( '#' ) )
            // InternalPersistenceDsl.g:2231:1: ( '#' )
            {
            // InternalPersistenceDsl.g:2231:1: ( '#' )
            // InternalPersistenceDsl.g:2232:2: '#'
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getNumberSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2241:1: rule__DtoReturnTypeCollection__Group__3 : rule__DtoReturnTypeCollection__Group__3__Impl rule__DtoReturnTypeCollection__Group__4 ;
    public final void rule__DtoReturnTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2245:1: ( rule__DtoReturnTypeCollection__Group__3__Impl rule__DtoReturnTypeCollection__Group__4 )
            // InternalPersistenceDsl.g:2246:2: rule__DtoReturnTypeCollection__Group__3__Impl rule__DtoReturnTypeCollection__Group__4
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
    // InternalPersistenceDsl.g:2253:1: rule__DtoReturnTypeCollection__Group__3__Impl : ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) ) ;
    public final void rule__DtoReturnTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2257:1: ( ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) ) )
            // InternalPersistenceDsl.g:2258:1: ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) )
            {
            // InternalPersistenceDsl.g:2258:1: ( ( rule__DtoReturnTypeCollection__TypeAssignment_3 ) )
            // InternalPersistenceDsl.g:2259:2: ( rule__DtoReturnTypeCollection__TypeAssignment_3 )
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeAssignment_3()); 
            // InternalPersistenceDsl.g:2260:2: ( rule__DtoReturnTypeCollection__TypeAssignment_3 )
            // InternalPersistenceDsl.g:2260:3: rule__DtoReturnTypeCollection__TypeAssignment_3
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
    // InternalPersistenceDsl.g:2268:1: rule__DtoReturnTypeCollection__Group__4 : rule__DtoReturnTypeCollection__Group__4__Impl ;
    public final void rule__DtoReturnTypeCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2272:1: ( rule__DtoReturnTypeCollection__Group__4__Impl )
            // InternalPersistenceDsl.g:2273:2: rule__DtoReturnTypeCollection__Group__4__Impl
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
    // InternalPersistenceDsl.g:2279:1: rule__DtoReturnTypeCollection__Group__4__Impl : ( '>' ) ;
    public final void rule__DtoReturnTypeCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2283:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2284:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2284:1: ( '>' )
            // InternalPersistenceDsl.g:2285:2: '>'
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getGreaterThanSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2295:1: rule__SimpleReturnTypeCollection__Group__0 : rule__SimpleReturnTypeCollection__Group__0__Impl rule__SimpleReturnTypeCollection__Group__1 ;
    public final void rule__SimpleReturnTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2299:1: ( rule__SimpleReturnTypeCollection__Group__0__Impl rule__SimpleReturnTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2300:2: rule__SimpleReturnTypeCollection__Group__0__Impl rule__SimpleReturnTypeCollection__Group__1
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
    // InternalPersistenceDsl.g:2307:1: rule__SimpleReturnTypeCollection__Group__0__Impl : ( RULE_LIST ) ;
    public final void rule__SimpleReturnTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2311:1: ( ( RULE_LIST ) )
            // InternalPersistenceDsl.g:2312:1: ( RULE_LIST )
            {
            // InternalPersistenceDsl.g:2312:1: ( RULE_LIST )
            // InternalPersistenceDsl.g:2313:2: RULE_LIST
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
    // InternalPersistenceDsl.g:2322:1: rule__SimpleReturnTypeCollection__Group__1 : rule__SimpleReturnTypeCollection__Group__1__Impl rule__SimpleReturnTypeCollection__Group__2 ;
    public final void rule__SimpleReturnTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2326:1: ( rule__SimpleReturnTypeCollection__Group__1__Impl rule__SimpleReturnTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2327:2: rule__SimpleReturnTypeCollection__Group__1__Impl rule__SimpleReturnTypeCollection__Group__2
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
    // InternalPersistenceDsl.g:2334:1: rule__SimpleReturnTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleReturnTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2338:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2339:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2339:1: ( '<' )
            // InternalPersistenceDsl.g:2340:2: '<'
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2349:1: rule__SimpleReturnTypeCollection__Group__2 : rule__SimpleReturnTypeCollection__Group__2__Impl rule__SimpleReturnTypeCollection__Group__3 ;
    public final void rule__SimpleReturnTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2353:1: ( rule__SimpleReturnTypeCollection__Group__2__Impl rule__SimpleReturnTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2354:2: rule__SimpleReturnTypeCollection__Group__2__Impl rule__SimpleReturnTypeCollection__Group__3
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
    // InternalPersistenceDsl.g:2361:1: rule__SimpleReturnTypeCollection__Group__2__Impl : ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleReturnTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2365:1: ( ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2366:1: ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2366:1: ( ( rule__SimpleReturnTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2367:2: ( rule__SimpleReturnTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2368:2: ( rule__SimpleReturnTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2368:3: rule__SimpleReturnTypeCollection__TypeAssignment_2
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
    // InternalPersistenceDsl.g:2376:1: rule__SimpleReturnTypeCollection__Group__3 : rule__SimpleReturnTypeCollection__Group__3__Impl ;
    public final void rule__SimpleReturnTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2380:1: ( rule__SimpleReturnTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2381:2: rule__SimpleReturnTypeCollection__Group__3__Impl
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
    // InternalPersistenceDsl.g:2387:1: rule__SimpleReturnTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleReturnTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2391:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2392:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2392:1: ( '>' )
            // InternalPersistenceDsl.g:2393:2: '>'
            {
             before(grammarAccess.getSimpleReturnTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2403:1: rule__AllModelTypeCollection__Group__0 : rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 ;
    public final void rule__AllModelTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2407:1: ( rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2408:2: rule__AllModelTypeCollection__Group__0__Impl rule__AllModelTypeCollection__Group__1
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
    // InternalPersistenceDsl.g:2415:1: rule__AllModelTypeCollection__Group__0__Impl : ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__AllModelTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2419:1: ( ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2420:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2420:1: ( ( rule__AllModelTypeCollection__CollectionAssignment_0 ) )
            // InternalPersistenceDsl.g:2421:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalPersistenceDsl.g:2422:2: ( rule__AllModelTypeCollection__CollectionAssignment_0 )
            // InternalPersistenceDsl.g:2422:3: rule__AllModelTypeCollection__CollectionAssignment_0
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
    // InternalPersistenceDsl.g:2430:1: rule__AllModelTypeCollection__Group__1 : rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 ;
    public final void rule__AllModelTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2434:1: ( rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2435:2: rule__AllModelTypeCollection__Group__1__Impl rule__AllModelTypeCollection__Group__2
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
    // InternalPersistenceDsl.g:2442:1: rule__AllModelTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__AllModelTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2446:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2447:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2447:1: ( '<' )
            // InternalPersistenceDsl.g:2448:2: '<'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2457:1: rule__AllModelTypeCollection__Group__2 : rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 ;
    public final void rule__AllModelTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2461:1: ( rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2462:2: rule__AllModelTypeCollection__Group__2__Impl rule__AllModelTypeCollection__Group__3
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
    // InternalPersistenceDsl.g:2469:1: rule__AllModelTypeCollection__Group__2__Impl : ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__AllModelTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2473:1: ( ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2474:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2474:1: ( ( rule__AllModelTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2475:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2476:2: ( rule__AllModelTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2476:3: rule__AllModelTypeCollection__TypeAssignment_2
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
    // InternalPersistenceDsl.g:2484:1: rule__AllModelTypeCollection__Group__3 : rule__AllModelTypeCollection__Group__3__Impl ;
    public final void rule__AllModelTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2488:1: ( rule__AllModelTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2489:2: rule__AllModelTypeCollection__Group__3__Impl
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
    // InternalPersistenceDsl.g:2495:1: rule__AllModelTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__AllModelTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2499:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2500:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2500:1: ( '>' )
            // InternalPersistenceDsl.g:2501:2: '>'
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2511:1: rule__SimpleTypeCollection__Group__0 : rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 ;
    public final void rule__SimpleTypeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2515:1: ( rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1 )
            // InternalPersistenceDsl.g:2516:2: rule__SimpleTypeCollection__Group__0__Impl rule__SimpleTypeCollection__Group__1
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
    // InternalPersistenceDsl.g:2523:1: rule__SimpleTypeCollection__Group__0__Impl : ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) ;
    public final void rule__SimpleTypeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2527:1: ( ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2528:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2528:1: ( ( rule__SimpleTypeCollection__CollectionAssignment_0 ) )
            // InternalPersistenceDsl.g:2529:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0()); 
            // InternalPersistenceDsl.g:2530:2: ( rule__SimpleTypeCollection__CollectionAssignment_0 )
            // InternalPersistenceDsl.g:2530:3: rule__SimpleTypeCollection__CollectionAssignment_0
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
    // InternalPersistenceDsl.g:2538:1: rule__SimpleTypeCollection__Group__1 : rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 ;
    public final void rule__SimpleTypeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2542:1: ( rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2 )
            // InternalPersistenceDsl.g:2543:2: rule__SimpleTypeCollection__Group__1__Impl rule__SimpleTypeCollection__Group__2
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
    // InternalPersistenceDsl.g:2550:1: rule__SimpleTypeCollection__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTypeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2554:1: ( ( '<' ) )
            // InternalPersistenceDsl.g:2555:1: ( '<' )
            {
            // InternalPersistenceDsl.g:2555:1: ( '<' )
            // InternalPersistenceDsl.g:2556:2: '<'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2565:1: rule__SimpleTypeCollection__Group__2 : rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 ;
    public final void rule__SimpleTypeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2569:1: ( rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3 )
            // InternalPersistenceDsl.g:2570:2: rule__SimpleTypeCollection__Group__2__Impl rule__SimpleTypeCollection__Group__3
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
    // InternalPersistenceDsl.g:2577:1: rule__SimpleTypeCollection__Group__2__Impl : ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) ;
    public final void rule__SimpleTypeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2581:1: ( ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) ) )
            // InternalPersistenceDsl.g:2582:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            {
            // InternalPersistenceDsl.g:2582:1: ( ( rule__SimpleTypeCollection__TypeAssignment_2 ) )
            // InternalPersistenceDsl.g:2583:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2()); 
            // InternalPersistenceDsl.g:2584:2: ( rule__SimpleTypeCollection__TypeAssignment_2 )
            // InternalPersistenceDsl.g:2584:3: rule__SimpleTypeCollection__TypeAssignment_2
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
    // InternalPersistenceDsl.g:2592:1: rule__SimpleTypeCollection__Group__3 : rule__SimpleTypeCollection__Group__3__Impl ;
    public final void rule__SimpleTypeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2596:1: ( rule__SimpleTypeCollection__Group__3__Impl )
            // InternalPersistenceDsl.g:2597:2: rule__SimpleTypeCollection__Group__3__Impl
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
    // InternalPersistenceDsl.g:2603:1: rule__SimpleTypeCollection__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTypeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2607:1: ( ( '>' ) )
            // InternalPersistenceDsl.g:2608:1: ( '>' )
            {
            // InternalPersistenceDsl.g:2608:1: ( '>' )
            // InternalPersistenceDsl.g:2609:2: '>'
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2619:1: rule__DefAllModelTypeVariable__Group__0 : rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 ;
    public final void rule__DefAllModelTypeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2623:1: ( rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1 )
            // InternalPersistenceDsl.g:2624:2: rule__DefAllModelTypeVariable__Group__0__Impl rule__DefAllModelTypeVariable__Group__1
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
    // InternalPersistenceDsl.g:2631:1: rule__DefAllModelTypeVariable__Group__0__Impl : ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2635:1: ( ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2636:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2636:1: ( ( rule__DefAllModelTypeVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2637:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2638:2: ( rule__DefAllModelTypeVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2638:3: rule__DefAllModelTypeVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2646:1: rule__DefAllModelTypeVariable__Group__1 : rule__DefAllModelTypeVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2650:1: ( rule__DefAllModelTypeVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2651:2: rule__DefAllModelTypeVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2657:1: rule__DefAllModelTypeVariable__Group__1__Impl : ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2661:1: ( ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2662:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2662:1: ( ( rule__DefAllModelTypeVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2663:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2664:2: ( rule__DefAllModelTypeVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2664:3: rule__DefAllModelTypeVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2673:1: rule__DefSimpleVariable__Group__0 : rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 ;
    public final void rule__DefSimpleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2677:1: ( rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1 )
            // InternalPersistenceDsl.g:2678:2: rule__DefSimpleVariable__Group__0__Impl rule__DefSimpleVariable__Group__1
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
    // InternalPersistenceDsl.g:2685:1: rule__DefSimpleVariable__Group__0__Impl : ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2689:1: ( ( ( rule__DefSimpleVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2690:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2690:1: ( ( rule__DefSimpleVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2691:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2692:2: ( rule__DefSimpleVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2692:3: rule__DefSimpleVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2700:1: rule__DefSimpleVariable__Group__1 : rule__DefSimpleVariable__Group__1__Impl ;
    public final void rule__DefSimpleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2704:1: ( rule__DefSimpleVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2705:2: rule__DefSimpleVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2711:1: rule__DefSimpleVariable__Group__1__Impl : ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2715:1: ( ( ( rule__DefSimpleVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2716:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2716:1: ( ( rule__DefSimpleVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2717:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2718:2: ( rule__DefSimpleVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2718:3: rule__DefSimpleVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2727:1: rule__DefAllModelTypeCollectionVariable__Group__0 : rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2731:1: ( rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1 )
            // InternalPersistenceDsl.g:2732:2: rule__DefAllModelTypeCollectionVariable__Group__0__Impl rule__DefAllModelTypeCollectionVariable__Group__1
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
    // InternalPersistenceDsl.g:2739:1: rule__DefAllModelTypeCollectionVariable__Group__0__Impl : ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2743:1: ( ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2744:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2744:1: ( ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2745:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2746:2: ( rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2746:3: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2754:1: rule__DefAllModelTypeCollectionVariable__Group__1 : rule__DefAllModelTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2758:1: ( rule__DefAllModelTypeCollectionVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2759:2: rule__DefAllModelTypeCollectionVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2765:1: rule__DefAllModelTypeCollectionVariable__Group__1__Impl : ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefAllModelTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2769:1: ( ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2770:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2770:1: ( ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2771:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2772:2: ( rule__DefAllModelTypeCollectionVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2772:3: rule__DefAllModelTypeCollectionVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2781:1: rule__DefSimpleTypeCollectionVariable__Group__0 : rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2785:1: ( rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1 )
            // InternalPersistenceDsl.g:2786:2: rule__DefSimpleTypeCollectionVariable__Group__0__Impl rule__DefSimpleTypeCollectionVariable__Group__1
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
    // InternalPersistenceDsl.g:2793:1: rule__DefSimpleTypeCollectionVariable__Group__0__Impl : ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2797:1: ( ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) ) )
            // InternalPersistenceDsl.g:2798:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            {
            // InternalPersistenceDsl.g:2798:1: ( ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 ) )
            // InternalPersistenceDsl.g:2799:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeAssignment_0()); 
            // InternalPersistenceDsl.g:2800:2: ( rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 )
            // InternalPersistenceDsl.g:2800:3: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0
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
    // InternalPersistenceDsl.g:2808:1: rule__DefSimpleTypeCollectionVariable__Group__1 : rule__DefSimpleTypeCollectionVariable__Group__1__Impl ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2812:1: ( rule__DefSimpleTypeCollectionVariable__Group__1__Impl )
            // InternalPersistenceDsl.g:2813:2: rule__DefSimpleTypeCollectionVariable__Group__1__Impl
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
    // InternalPersistenceDsl.g:2819:1: rule__DefSimpleTypeCollectionVariable__Group__1__Impl : ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) ;
    public final void rule__DefSimpleTypeCollectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2823:1: ( ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) ) )
            // InternalPersistenceDsl.g:2824:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            {
            // InternalPersistenceDsl.g:2824:1: ( ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 ) )
            // InternalPersistenceDsl.g:2825:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameAssignment_1()); 
            // InternalPersistenceDsl.g:2826:2: ( rule__DefSimpleTypeCollectionVariable__NameAssignment_1 )
            // InternalPersistenceDsl.g:2826:3: rule__DefSimpleTypeCollectionVariable__NameAssignment_1
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
    // InternalPersistenceDsl.g:2835:1: rule__Model__FinderAssignment : ( ruleFinder ) ;
    public final void rule__Model__FinderAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2839:1: ( ( ruleFinder ) )
            // InternalPersistenceDsl.g:2840:2: ( ruleFinder )
            {
            // InternalPersistenceDsl.g:2840:2: ( ruleFinder )
            // InternalPersistenceDsl.g:2841:3: ruleFinder
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
    // InternalPersistenceDsl.g:2850:1: rule__Finder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Finder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2854:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2855:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:2855:2: ( RULE_ID )
            // InternalPersistenceDsl.g:2856:3: RULE_ID
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
    // InternalPersistenceDsl.g:2865:1: rule__Finder__MethodsAssignment_3 : ( ruleFinderMethod ) ;
    public final void rule__Finder__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2869:1: ( ( ruleFinderMethod ) )
            // InternalPersistenceDsl.g:2870:2: ( ruleFinderMethod )
            {
            // InternalPersistenceDsl.g:2870:2: ( ruleFinderMethod )
            // InternalPersistenceDsl.g:2871:3: ruleFinderMethod
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
    // InternalPersistenceDsl.g:2880:1: rule__MethodSimpleReturn__ReturnTypeAssignment_0 : ( ruleType ) ;
    public final void rule__MethodSimpleReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2884:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:2885:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:2885:2: ( ruleType )
            // InternalPersistenceDsl.g:2886:3: ruleType
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
    // InternalPersistenceDsl.g:2895:1: rule__MethodSimpleReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodSimpleReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2899:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2900:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:2900:2: ( RULE_ID )
            // InternalPersistenceDsl.g:2901:3: RULE_ID
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
    // InternalPersistenceDsl.g:2910:1: rule__MethodSimpleReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2914:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:2915:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:2915:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:2916:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:2925:1: rule__MethodSimpleReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodSimpleReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2929:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:2930:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:2930:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:2931:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:2940:1: rule__MethodSimpleReturn__NullableAssignment_5 : ( ( 'non-null' ) ) ;
    public final void rule__MethodSimpleReturn__NullableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2944:1: ( ( ( 'non-null' ) ) )
            // InternalPersistenceDsl.g:2945:2: ( ( 'non-null' ) )
            {
            // InternalPersistenceDsl.g:2945:2: ( ( 'non-null' ) )
            // InternalPersistenceDsl.g:2946:3: ( 'non-null' )
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0()); 
            // InternalPersistenceDsl.g:2947:3: ( 'non-null' )
            // InternalPersistenceDsl.g:2948:4: 'non-null'
            {
             before(grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:2959:1: rule__MethodEntityReturn__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodEntityReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2963:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:2964:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:2964:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2965:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityCrossReference_0_0()); 
            // InternalPersistenceDsl.g:2966:3: ( RULE_ID )
            // InternalPersistenceDsl.g:2967:4: RULE_ID
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
    // InternalPersistenceDsl.g:2978:1: rule__MethodEntityReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodEntityReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2982:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:2983:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:2983:2: ( RULE_ID )
            // InternalPersistenceDsl.g:2984:3: RULE_ID
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
    // InternalPersistenceDsl.g:2993:1: rule__MethodEntityReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodEntityReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:2997:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:2998:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:2998:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:2999:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3008:1: rule__MethodEntityReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodEntityReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3012:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3013:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3013:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3014:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3023:1: rule__MethodEntityReturn__NullableAssignment_5 : ( ( 'non-null' ) ) ;
    public final void rule__MethodEntityReturn__NullableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3027:1: ( ( ( 'non-null' ) ) )
            // InternalPersistenceDsl.g:3028:2: ( ( 'non-null' ) )
            {
            // InternalPersistenceDsl.g:3028:2: ( ( 'non-null' ) )
            // InternalPersistenceDsl.g:3029:3: ( 'non-null' )
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0()); 
            // InternalPersistenceDsl.g:3030:3: ( 'non-null' )
            // InternalPersistenceDsl.g:3031:4: 'non-null'
            {
             before(grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:3042:1: rule__MethodDtoReturn__ReturnTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodDtoReturn__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3046:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3047:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3047:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3048:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0()); 
            // InternalPersistenceDsl.g:3049:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3050:4: RULE_ID
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
    // InternalPersistenceDsl.g:3061:1: rule__MethodDtoReturn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDtoReturn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3065:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3066:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3066:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3067:3: RULE_ID
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
    // InternalPersistenceDsl.g:3076:1: rule__MethodDtoReturn__ParametersAssignment_4_0 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3080:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3081:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3081:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3082:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3091:1: rule__MethodDtoReturn__ParametersAssignment_4_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodDtoReturn__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3095:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3096:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3096:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3097:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3106:1: rule__MethodDtoReturn__NullableAssignment_6 : ( ( 'non-null' ) ) ;
    public final void rule__MethodDtoReturn__NullableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3110:1: ( ( ( 'non-null' ) ) )
            // InternalPersistenceDsl.g:3111:2: ( ( 'non-null' ) )
            {
            // InternalPersistenceDsl.g:3111:2: ( ( 'non-null' ) )
            // InternalPersistenceDsl.g:3112:3: ( 'non-null' )
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0()); 
            // InternalPersistenceDsl.g:3113:3: ( 'non-null' )
            // InternalPersistenceDsl.g:3114:4: 'non-null'
            {
             before(grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPersistenceDsl.g:3125:1: rule__MethodCollectionReturn__ReturnTypeAssignment_0 : ( ruleCollectionReturnType ) ;
    public final void rule__MethodCollectionReturn__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3129:1: ( ( ruleCollectionReturnType ) )
            // InternalPersistenceDsl.g:3130:2: ( ruleCollectionReturnType )
            {
            // InternalPersistenceDsl.g:3130:2: ( ruleCollectionReturnType )
            // InternalPersistenceDsl.g:3131:3: ruleCollectionReturnType
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
    // InternalPersistenceDsl.g:3140:1: rule__MethodCollectionReturn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodCollectionReturn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3144:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3145:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3145:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3146:3: RULE_ID
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
    // InternalPersistenceDsl.g:3155:1: rule__MethodCollectionReturn__ParametersAssignment_3_0 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3159:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3160:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3160:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3161:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3170:1: rule__MethodCollectionReturn__ParametersAssignment_3_1_1 : ( ruleDefVariable ) ;
    public final void rule__MethodCollectionReturn__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3174:1: ( ( ruleDefVariable ) )
            // InternalPersistenceDsl.g:3175:2: ( ruleDefVariable )
            {
            // InternalPersistenceDsl.g:3175:2: ( ruleDefVariable )
            // InternalPersistenceDsl.g:3176:3: ruleDefVariable
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
    // InternalPersistenceDsl.g:3185:1: rule__EntityReturnTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReturnTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3189:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3190:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3190:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3191:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityCrossReference_2_0()); 
            // InternalPersistenceDsl.g:3192:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3193:4: RULE_ID
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
    // InternalPersistenceDsl.g:3204:1: rule__DtoReturnTypeCollection__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DtoReturnTypeCollection__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3208:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3209:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3209:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3210:3: ( RULE_ID )
            {
             before(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoCrossReference_3_0()); 
            // InternalPersistenceDsl.g:3211:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3212:4: RULE_ID
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
    // InternalPersistenceDsl.g:3223:1: rule__SimpleReturnTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleReturnTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3227:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:3228:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:3228:2: ( ruleType )
            // InternalPersistenceDsl.g:3229:3: ruleType
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
    // InternalPersistenceDsl.g:3238:1: rule__AllModelTypeCollection__CollectionAssignment_0 : ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__AllModelTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3242:1: ( ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalPersistenceDsl.g:3243:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalPersistenceDsl.g:3243:2: ( ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalPersistenceDsl.g:3244:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalPersistenceDsl.g:3245:3: ( rule__AllModelTypeCollection__CollectionAlternatives_0_0 )
            // InternalPersistenceDsl.g:3245:4: rule__AllModelTypeCollection__CollectionAlternatives_0_0
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
    // InternalPersistenceDsl.g:3253:1: rule__AllModelTypeCollection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AllModelTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3257:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3258:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3258:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3259:3: ( RULE_ID )
            {
             before(grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0()); 
            // InternalPersistenceDsl.g:3260:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3261:4: RULE_ID
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
    // InternalPersistenceDsl.g:3272:1: rule__SimpleTypeCollection__CollectionAssignment_0 : ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) ;
    public final void rule__SimpleTypeCollection__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3276:1: ( ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) ) )
            // InternalPersistenceDsl.g:3277:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            {
            // InternalPersistenceDsl.g:3277:2: ( ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 ) )
            // InternalPersistenceDsl.g:3278:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0()); 
            // InternalPersistenceDsl.g:3279:3: ( rule__SimpleTypeCollection__CollectionAlternatives_0_0 )
            // InternalPersistenceDsl.g:3279:4: rule__SimpleTypeCollection__CollectionAlternatives_0_0
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
    // InternalPersistenceDsl.g:3287:1: rule__SimpleTypeCollection__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleTypeCollection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3291:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:3292:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:3292:2: ( ruleType )
            // InternalPersistenceDsl.g:3293:3: ruleType
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
    // InternalPersistenceDsl.g:3302:1: rule__DefAllModelTypeVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DefAllModelTypeVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3306:1: ( ( ( RULE_ID ) ) )
            // InternalPersistenceDsl.g:3307:2: ( ( RULE_ID ) )
            {
            // InternalPersistenceDsl.g:3307:2: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3308:3: ( RULE_ID )
            {
             before(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0()); 
            // InternalPersistenceDsl.g:3309:3: ( RULE_ID )
            // InternalPersistenceDsl.g:3310:4: RULE_ID
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
    // InternalPersistenceDsl.g:3321:1: rule__DefAllModelTypeVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3325:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3326:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3326:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3327:3: RULE_ID
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
    // InternalPersistenceDsl.g:3336:1: rule__DefSimpleVariable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DefSimpleVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3340:1: ( ( ruleType ) )
            // InternalPersistenceDsl.g:3341:2: ( ruleType )
            {
            // InternalPersistenceDsl.g:3341:2: ( ruleType )
            // InternalPersistenceDsl.g:3342:3: ruleType
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
    // InternalPersistenceDsl.g:3351:1: rule__DefSimpleVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3355:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3356:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3356:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3357:3: RULE_ID
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
    // InternalPersistenceDsl.g:3366:1: rule__DefAllModelTypeCollectionVariable__TypeAssignment_0 : ( ruleAllModelTypeCollection ) ;
    public final void rule__DefAllModelTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3370:1: ( ( ruleAllModelTypeCollection ) )
            // InternalPersistenceDsl.g:3371:2: ( ruleAllModelTypeCollection )
            {
            // InternalPersistenceDsl.g:3371:2: ( ruleAllModelTypeCollection )
            // InternalPersistenceDsl.g:3372:3: ruleAllModelTypeCollection
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
    // InternalPersistenceDsl.g:3381:1: rule__DefAllModelTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefAllModelTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3385:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3386:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3386:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3387:3: RULE_ID
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
    // InternalPersistenceDsl.g:3396:1: rule__DefSimpleTypeCollectionVariable__TypeAssignment_0 : ( ruleSimpleTypeCollection ) ;
    public final void rule__DefSimpleTypeCollectionVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3400:1: ( ( ruleSimpleTypeCollection ) )
            // InternalPersistenceDsl.g:3401:2: ( ruleSimpleTypeCollection )
            {
            // InternalPersistenceDsl.g:3401:2: ( ruleSimpleTypeCollection )
            // InternalPersistenceDsl.g:3402:3: ruleSimpleTypeCollection
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
    // InternalPersistenceDsl.g:3411:1: rule__DefSimpleTypeCollectionVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefSimpleTypeCollectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistenceDsl.g:3415:1: ( ( RULE_ID ) )
            // InternalPersistenceDsl.g:3416:2: ( RULE_ID )
            {
            // InternalPersistenceDsl.g:3416:2: ( RULE_ID )
            // InternalPersistenceDsl.g:3417:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001000FFB0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001000FFB2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000400FFF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000007F90L});

}