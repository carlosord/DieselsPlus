/*
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uo.diesels.model.parser.antlr.internal.InternalBusinessDslParser;
import uo.diesels.model.services.BusinessDslGrammarAccess;

public class BusinessDslParser extends AbstractAntlrParser {

	@Inject
	private BusinessDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBusinessDslParser createParser(XtextTokenStream stream) {
		return new InternalBusinessDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public BusinessDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BusinessDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}