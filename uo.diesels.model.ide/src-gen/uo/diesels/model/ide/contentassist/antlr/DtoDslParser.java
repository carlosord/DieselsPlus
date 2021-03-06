/*
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import uo.diesels.model.ide.contentassist.antlr.internal.InternalDtoDslParser;
import uo.diesels.model.services.DtoDslGrammarAccess;

public class DtoDslParser extends AbstractContentAssistParser {

	@Inject
	private DtoDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDtoDslParser createParser() {
		InternalDtoDslParser result = new InternalDtoDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDtoAccess().getAlternatives(), "rule__Dto__Alternatives");
					put(grammarAccess.getDefDtoAttributeAccess().getAlternatives(), "rule__DefDtoAttribute__Alternatives");
					put(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getAlternatives(), "rule__DefDtoCollectionTypeAttribute__Alternatives");
					put(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAlternatives_0_0(), "rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0");
					put(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAlternatives_0_0(), "rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getDtoEntityAccess().getGroup(), "rule__DtoEntity__Group__0");
					put(grammarAccess.getDtoForAccess().getGroup(), "rule__DtoFor__Group__0");
					put(grammarAccess.getDefDtoSimpleVariableAccess().getGroup(), "rule__DefDtoSimpleVariable__Group__0");
					put(grammarAccess.getDefDtoModelTypeVariableAccess().getGroup(), "rule__DefDtoModelTypeVariable__Group__0");
					put(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGroup(), "rule__DefDtoModelTypeCollectionVariable__Group__0");
					put(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGroup(), "rule__DefDtoSimpleTypeCollectionVariable__Group__0");
					put(grammarAccess.getModelAccess().getDtosAssignment(), "rule__Model__DtosAssignment");
					put(grammarAccess.getDtoEntityAccess().getNameAssignment_1(), "rule__DtoEntity__NameAssignment_1");
					put(grammarAccess.getDtoEntityAccess().getAttributesAssignment_3(), "rule__DtoEntity__AttributesAssignment_3");
					put(grammarAccess.getDtoForAccess().getNameAssignment_1(), "rule__DtoFor__NameAssignment_1");
					put(grammarAccess.getDtoForAccess().getEntityAssignment_3(), "rule__DtoFor__EntityAssignment_3");
					put(grammarAccess.getDefDtoSimpleVariableAccess().getTypeAssignment_0(), "rule__DefDtoSimpleVariable__TypeAssignment_0");
					put(grammarAccess.getDefDtoSimpleVariableAccess().getNameAssignment_1(), "rule__DefDtoSimpleVariable__NameAssignment_1");
					put(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeAssignment_0(), "rule__DefDtoModelTypeVariable__TypeAssignment_0");
					put(grammarAccess.getDefDtoModelTypeVariableAccess().getNameAssignment_1(), "rule__DefDtoModelTypeVariable__NameAssignment_1");
					put(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAssignment_0(), "rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0");
					put(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeAssignment_2(), "rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2");
					put(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameAssignment_4(), "rule__DefDtoModelTypeCollectionVariable__NameAssignment_4");
					put(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAssignment_0(), "rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0");
					put(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeAssignment_2(), "rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2");
					put(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameAssignment_4(), "rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDtoDslParser typedParser = (InternalDtoDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DtoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DtoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
