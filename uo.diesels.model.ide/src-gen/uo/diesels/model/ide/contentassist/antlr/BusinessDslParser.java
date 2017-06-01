/*
 * generated by Xtext 2.9.0
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
import uo.diesels.model.ide.contentassist.antlr.internal.InternalBusinessDslParser;
import uo.diesels.model.services.BusinessDslGrammarAccess;

public class BusinessDslParser extends AbstractContentAssistParser {

	@Inject
	private BusinessDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBusinessDslParser createParser() {
		InternalBusinessDslParser result = new InternalBusinessDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getServiceMethodAccess().getAlternatives(), "rule__ServiceMethod__Alternatives");
					put(grammarAccess.getJpaMethodAccess().getKeywordAlternatives_3_0(), "rule__JpaMethod__KeywordAlternatives_3_0");
					put(grammarAccess.getFinderUserMethodAccess().getAlternatives_0(), "rule__FinderUserMethod__Alternatives_0");
					put(grammarAccess.getDefVariableAccess().getAlternatives(), "rule__DefVariable__Alternatives");
					put(grammarAccess.getDefCollectionTypeVariableAccess().getAlternatives(), "rule__DefCollectionTypeVariable__Alternatives");
					put(grammarAccess.getCollectionReturnTypeAccess().getAlternatives(), "rule__CollectionReturnType__Alternatives");
					put(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAlternatives_0_0(), "rule__AllModelTypeCollection__CollectionAlternatives_0_0");
					put(grammarAccess.getDtoTypeCollectionAccess().getCollectionAlternatives_0_0(), "rule__DtoTypeCollection__CollectionAlternatives_0_0");
					put(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAlternatives_0_0(), "rule__SimpleTypeCollection__CollectionAlternatives_0_0");
					put(grammarAccess.getSimpleReturnTypeAccess().getAlternatives(), "rule__SimpleReturnType__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getJpaMethodAccess().getGroup(), "rule__JpaMethod__Group__0");
					put(grammarAccess.getFinderUserMethodAccess().getGroup(), "rule__FinderUserMethod__Group__0");
					put(grammarAccess.getFinderUserMethodAccess().getGroup_1(), "rule__FinderUserMethod__Group_1__0");
					put(grammarAccess.getMethodSimpleReturnAccess().getGroup(), "rule__MethodSimpleReturn__Group__0");
					put(grammarAccess.getMethodSimpleReturnAccess().getGroup_3(), "rule__MethodSimpleReturn__Group_3__0");
					put(grammarAccess.getMethodSimpleReturnAccess().getGroup_3_1(), "rule__MethodSimpleReturn__Group_3_1__0");
					put(grammarAccess.getMethodAllModelReturnAccess().getGroup(), "rule__MethodAllModelReturn__Group__0");
					put(grammarAccess.getMethodAllModelReturnAccess().getGroup_3(), "rule__MethodAllModelReturn__Group_3__0");
					put(grammarAccess.getMethodAllModelReturnAccess().getGroup_3_1(), "rule__MethodAllModelReturn__Group_3_1__0");
					put(grammarAccess.getMethodDtoReturnAccess().getGroup(), "rule__MethodDtoReturn__Group__0");
					put(grammarAccess.getMethodDtoReturnAccess().getGroup_4(), "rule__MethodDtoReturn__Group_4__0");
					put(grammarAccess.getMethodDtoReturnAccess().getGroup_4_1(), "rule__MethodDtoReturn__Group_4_1__0");
					put(grammarAccess.getMethodCollectionReturnAccess().getGroup(), "rule__MethodCollectionReturn__Group__0");
					put(grammarAccess.getMethodCollectionReturnAccess().getGroup_3(), "rule__MethodCollectionReturn__Group_3__0");
					put(grammarAccess.getMethodCollectionReturnAccess().getGroup_3_1(), "rule__MethodCollectionReturn__Group_3_1__0");
					put(grammarAccess.getDefAllModelTypeVariableAccess().getGroup(), "rule__DefAllModelTypeVariable__Group__0");
					put(grammarAccess.getDefDtoTypeVariableAccess().getGroup(), "rule__DefDtoTypeVariable__Group__0");
					put(grammarAccess.getDefSimpleVariableAccess().getGroup(), "rule__DefSimpleVariable__Group__0");
					put(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getGroup(), "rule__DefAllModelTypeCollectionVariable__Group__0");
					put(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getGroup(), "rule__DefSimpleTypeCollectionVariable__Group__0");
					put(grammarAccess.getDefDtoTypeCollectionVariableAccess().getGroup(), "rule__DefDtoTypeCollectionVariable__Group__0");
					put(grammarAccess.getAllModelTypeCollectionAccess().getGroup(), "rule__AllModelTypeCollection__Group__0");
					put(grammarAccess.getDtoTypeCollectionAccess().getGroup(), "rule__DtoTypeCollection__Group__0");
					put(grammarAccess.getSimpleTypeCollectionAccess().getGroup(), "rule__SimpleTypeCollection__Group__0");
					put(grammarAccess.getModelAccess().getServicesAssignment(), "rule__Model__ServicesAssignment");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getMethodsAssignment_3(), "rule__Service__MethodsAssignment_3");
					put(grammarAccess.getJpaMethodAccess().getNameAssignment_0(), "rule__JpaMethod__NameAssignment_0");
					put(grammarAccess.getJpaMethodAccess().getKeywordAssignment_3(), "rule__JpaMethod__KeywordAssignment_3");
					put(grammarAccess.getJpaMethodAccess().getEntityAssignment_5(), "rule__JpaMethod__EntityAssignment_5");
					put(grammarAccess.getFinderUserMethodAccess().getKeywordAssignment_1_0(), "rule__FinderUserMethod__KeywordAssignment_1_0");
					put(grammarAccess.getFinderUserMethodAccess().getFinderAssignment_1_2(), "rule__FinderUserMethod__FinderAssignment_1_2");
					put(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeAssignment_0(), "rule__MethodSimpleReturn__ReturnTypeAssignment_0");
					put(grammarAccess.getMethodSimpleReturnAccess().getNameAssignment_1(), "rule__MethodSimpleReturn__NameAssignment_1");
					put(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_0(), "rule__MethodSimpleReturn__ParametersAssignment_3_0");
					put(grammarAccess.getMethodSimpleReturnAccess().getParametersAssignment_3_1_1(), "rule__MethodSimpleReturn__ParametersAssignment_3_1_1");
					put(grammarAccess.getMethodAllModelReturnAccess().getReturnTypeAssignment_0(), "rule__MethodAllModelReturn__ReturnTypeAssignment_0");
					put(grammarAccess.getMethodAllModelReturnAccess().getNameAssignment_1(), "rule__MethodAllModelReturn__NameAssignment_1");
					put(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_0(), "rule__MethodAllModelReturn__ParametersAssignment_3_0");
					put(grammarAccess.getMethodAllModelReturnAccess().getParametersAssignment_3_1_1(), "rule__MethodAllModelReturn__ParametersAssignment_3_1_1");
					put(grammarAccess.getMethodDtoReturnAccess().getReturnTypeAssignment_1(), "rule__MethodDtoReturn__ReturnTypeAssignment_1");
					put(grammarAccess.getMethodDtoReturnAccess().getNameAssignment_2(), "rule__MethodDtoReturn__NameAssignment_2");
					put(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_0(), "rule__MethodDtoReturn__ParametersAssignment_4_0");
					put(grammarAccess.getMethodDtoReturnAccess().getParametersAssignment_4_1_1(), "rule__MethodDtoReturn__ParametersAssignment_4_1_1");
					put(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeAssignment_0(), "rule__MethodCollectionReturn__ReturnTypeAssignment_0");
					put(grammarAccess.getMethodCollectionReturnAccess().getNameAssignment_1(), "rule__MethodCollectionReturn__NameAssignment_1");
					put(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_0(), "rule__MethodCollectionReturn__ParametersAssignment_3_0");
					put(grammarAccess.getMethodCollectionReturnAccess().getParametersAssignment_3_1_1(), "rule__MethodCollectionReturn__ParametersAssignment_3_1_1");
					put(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAssignment_0(), "rule__DefAllModelTypeVariable__TypeAssignment_0");
					put(grammarAccess.getDefAllModelTypeVariableAccess().getNameAssignment_1(), "rule__DefAllModelTypeVariable__NameAssignment_1");
					put(grammarAccess.getDefDtoTypeVariableAccess().getTypeAssignment_1(), "rule__DefDtoTypeVariable__TypeAssignment_1");
					put(grammarAccess.getDefDtoTypeVariableAccess().getNameAssignment_2(), "rule__DefDtoTypeVariable__NameAssignment_2");
					put(grammarAccess.getDefSimpleVariableAccess().getTypeAssignment_0(), "rule__DefSimpleVariable__TypeAssignment_0");
					put(grammarAccess.getDefSimpleVariableAccess().getNameAssignment_1(), "rule__DefSimpleVariable__NameAssignment_1");
					put(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAssignment_0(), "rule__DefAllModelTypeCollectionVariable__TypeAssignment_0");
					put(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameAssignment_1(), "rule__DefAllModelTypeCollectionVariable__NameAssignment_1");
					put(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeAssignment_0(), "rule__DefSimpleTypeCollectionVariable__TypeAssignment_0");
					put(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameAssignment_1(), "rule__DefSimpleTypeCollectionVariable__NameAssignment_1");
					put(grammarAccess.getDefDtoTypeCollectionVariableAccess().getTypeAssignment_0(), "rule__DefDtoTypeCollectionVariable__TypeAssignment_0");
					put(grammarAccess.getDefDtoTypeCollectionVariableAccess().getNameAssignment_1(), "rule__DefDtoTypeCollectionVariable__NameAssignment_1");
					put(grammarAccess.getAllModelTypeCollectionAccess().getCollectionAssignment_0(), "rule__AllModelTypeCollection__CollectionAssignment_0");
					put(grammarAccess.getAllModelTypeCollectionAccess().getTypeAssignment_2(), "rule__AllModelTypeCollection__TypeAssignment_2");
					put(grammarAccess.getDtoTypeCollectionAccess().getCollectionAssignment_0(), "rule__DtoTypeCollection__CollectionAssignment_0");
					put(grammarAccess.getDtoTypeCollectionAccess().getTypeAssignment_3(), "rule__DtoTypeCollection__TypeAssignment_3");
					put(grammarAccess.getSimpleTypeCollectionAccess().getCollectionAssignment_0(), "rule__SimpleTypeCollection__CollectionAssignment_0");
					put(grammarAccess.getSimpleTypeCollectionAccess().getTypeAssignment_2(), "rule__SimpleTypeCollection__TypeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalBusinessDslParser typedParser = (InternalBusinessDslParser) parser;
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

	public BusinessDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BusinessDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
