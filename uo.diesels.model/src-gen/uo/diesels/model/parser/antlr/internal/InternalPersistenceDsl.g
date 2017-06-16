/*
 * generated by Xtext 2.10.0
 */
grammar InternalPersistenceDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uo.diesels.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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
import uo.diesels.model.services.PersistenceDslGrammarAccess;

}

@parser::members {

 	private PersistenceDslGrammarAccess grammarAccess;

    public InternalPersistenceDslParser(TokenStream input, PersistenceDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected PersistenceDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getFinderFinderParserRuleCall_0());
			}
			lv_finder_0_0=ruleFinder
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"finder",
					lv_finder_0_0,
					"uo.diesels.model.PersistenceDsl.Finder");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleFinder
entryRuleFinder returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinderRule()); }
	iv_ruleFinder=ruleFinder
	{ $current=$iv_ruleFinder.current; }
	EOF;

// Rule Finder
ruleFinder returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Finder'
		{
			newLeafNode(otherlv_0, grammarAccess.getFinderAccess().getFinderKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFinderAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFinderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFinderAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFinderAccess().getMethodsFinderMethodParserRuleCall_3_0());
				}
				lv_methods_3_0=ruleFinderMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinderRule());
					}
					add(
						$current,
						"methods",
						lv_methods_3_0,
						"uo.diesels.model.PersistenceDsl.FinderMethod");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getFinderAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleFinderMethod
entryRuleFinderMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinderMethodRule()); }
	iv_ruleFinderMethod=ruleFinderMethod
	{ $current=$iv_ruleFinderMethod.current; }
	EOF;

// Rule FinderMethod
ruleFinderMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodEntityReturnParserRuleCall_0());
		}
		this_MethodEntityReturn_0=ruleMethodEntityReturn
		{
			$current = $this_MethodEntityReturn_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodDtoReturnParserRuleCall_1());
		}
		this_MethodDtoReturn_1=ruleMethodDtoReturn
		{
			$current = $this_MethodDtoReturn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodSimpleReturnParserRuleCall_2());
		}
		this_MethodSimpleReturn_2=ruleMethodSimpleReturn
		{
			$current = $this_MethodSimpleReturn_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFinderMethodAccess().getMethodCollectionReturnParserRuleCall_3());
		}
		this_MethodCollectionReturn_3=ruleMethodCollectionReturn
		{
			$current = $this_MethodCollectionReturn_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMethodSimpleReturn
entryRuleMethodSimpleReturn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodSimpleReturnRule()); }
	iv_ruleMethodSimpleReturn=ruleMethodSimpleReturn
	{ $current=$iv_ruleMethodSimpleReturn.current; }
	EOF;

// Rule MethodSimpleReturn
ruleMethodSimpleReturn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getReturnTypeTypeParserRuleCall_0_0());
				}
				lv_returnType_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
					}
					set(
						$current,
						"returnType",
						lv_returnType_0_0,
						"uo.diesels.model.PersistenceDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodSimpleReturnAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodSimpleReturnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMethodSimpleReturnAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
					}
					lv_parameters_3_0=ruleDefVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"uo.diesels.model.PersistenceDsl.DefVariable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMethodSimpleReturnAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodSimpleReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
						}
						lv_parameters_5_0=ruleDefVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodSimpleReturnRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_5_0,
								"uo.diesels.model.PersistenceDsl.DefVariable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodSimpleReturnAccess().getRightParenthesisKeyword_4());
		}
		(
			(
				lv_nullable_7_0='non-null'
				{
					newLeafNode(lv_nullable_7_0, grammarAccess.getMethodSimpleReturnAccess().getNullableNonNullKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodSimpleReturnRule());
					}
					setWithLastConsumed($current, "nullable", lv_nullable_7_0, "non-null");
				}
			)
		)?
	)
;

// Entry rule entryRuleMethodEntityReturn
entryRuleMethodEntityReturn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodEntityReturnRule()); }
	iv_ruleMethodEntityReturn=ruleMethodEntityReturn
	{ $current=$iv_ruleMethodEntityReturn.current; }
	EOF;

// Rule MethodEntityReturn
ruleMethodEntityReturn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodEntityReturnRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getMethodEntityReturnAccess().getReturnTypeEntityCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodEntityReturnAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodEntityReturnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMethodEntityReturnAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
					}
					lv_parameters_3_0=ruleDefVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodEntityReturnRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"uo.diesels.model.PersistenceDsl.DefVariable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMethodEntityReturnAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodEntityReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
						}
						lv_parameters_5_0=ruleDefVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodEntityReturnRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_5_0,
								"uo.diesels.model.PersistenceDsl.DefVariable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodEntityReturnAccess().getRightParenthesisKeyword_4());
		}
		(
			(
				lv_nullable_7_0='non-null'
				{
					newLeafNode(lv_nullable_7_0, grammarAccess.getMethodEntityReturnAccess().getNullableNonNullKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodEntityReturnRule());
					}
					setWithLastConsumed($current, "nullable", lv_nullable_7_0, "non-null");
				}
			)
		)?
	)
;

// Entry rule entryRuleMethodDtoReturn
entryRuleMethodDtoReturn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodDtoReturnRule()); }
	iv_ruleMethodDtoReturn=ruleMethodDtoReturn
	{ $current=$iv_ruleMethodDtoReturn.current; }
	EOF;

// Rule MethodDtoReturn
ruleMethodDtoReturn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#'
		{
			newLeafNode(otherlv_0, grammarAccess.getMethodDtoReturnAccess().getNumberSignKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodDtoReturnRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getMethodDtoReturnAccess().getReturnTypeDtoCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getMethodDtoReturnAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodDtoReturnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getMethodDtoReturnAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_0_0());
					}
					lv_parameters_4_0=ruleDefVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodDtoReturnRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_4_0,
							"uo.diesels.model.PersistenceDsl.DefVariable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getMethodDtoReturnAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodDtoReturnAccess().getParametersDefVariableParserRuleCall_4_1_1_0());
						}
						lv_parameters_6_0=ruleDefVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodDtoReturnRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_6_0,
								"uo.diesels.model.PersistenceDsl.DefVariable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getMethodDtoReturnAccess().getRightParenthesisKeyword_5());
		}
		(
			(
				lv_nullable_8_0='non-null'
				{
					newLeafNode(lv_nullable_8_0, grammarAccess.getMethodDtoReturnAccess().getNullableNonNullKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodDtoReturnRule());
					}
					setWithLastConsumed($current, "nullable", lv_nullable_8_0, "non-null");
				}
			)
		)?
	)
;

// Entry rule entryRuleMethodCollectionReturn
entryRuleMethodCollectionReturn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodCollectionReturnRule()); }
	iv_ruleMethodCollectionReturn=ruleMethodCollectionReturn
	{ $current=$iv_ruleMethodCollectionReturn.current; }
	EOF;

// Rule MethodCollectionReturn
ruleMethodCollectionReturn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getReturnTypeCollectionReturnTypeParserRuleCall_0_0());
				}
				lv_returnType_0_0=ruleCollectionReturnType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
					}
					set(
						$current,
						"returnType",
						lv_returnType_0_0,
						"uo.diesels.model.PersistenceDsl.CollectionReturnType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodCollectionReturnAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodCollectionReturnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMethodCollectionReturnAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_0_0());
					}
					lv_parameters_3_0=ruleDefVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"uo.diesels.model.PersistenceDsl.DefVariable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMethodCollectionReturnAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodCollectionReturnAccess().getParametersDefVariableParserRuleCall_3_1_1_0());
						}
						lv_parameters_5_0=ruleDefVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodCollectionReturnRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_5_0,
								"uo.diesels.model.PersistenceDsl.DefVariable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodCollectionReturnAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleCollectionReturnType
entryRuleCollectionReturnType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCollectionReturnTypeRule()); }
	iv_ruleCollectionReturnType=ruleCollectionReturnType
	{ $current=$iv_ruleCollectionReturnType.current; }
	EOF;

// Rule CollectionReturnType
ruleCollectionReturnType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getEntityReturnTypeCollectionParserRuleCall_0());
		}
		this_EntityReturnTypeCollection_0=ruleEntityReturnTypeCollection
		{
			$current = $this_EntityReturnTypeCollection_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getDtoReturnTypeCollectionParserRuleCall_1());
		}
		this_DtoReturnTypeCollection_1=ruleDtoReturnTypeCollection
		{
			$current = $this_DtoReturnTypeCollection_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCollectionReturnTypeAccess().getSimpleReturnTypeCollectionParserRuleCall_2());
		}
		this_SimpleReturnTypeCollection_2=ruleSimpleReturnTypeCollection
		{
			$current = $this_SimpleReturnTypeCollection_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntityReturnTypeCollection
entryRuleEntityReturnTypeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityReturnTypeCollectionRule()); }
	iv_ruleEntityReturnTypeCollection=ruleEntityReturnTypeCollection
	{ $current=$iv_ruleEntityReturnTypeCollection.current; }
	EOF;

// Rule EntityReturnTypeCollection
ruleEntityReturnTypeCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LIST_0=RULE_LIST
		{
			newLeafNode(this_LIST_0, grammarAccess.getEntityReturnTypeCollectionAccess().getLISTTerminalRuleCall_0());
		}
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityReturnTypeCollectionAccess().getLessThanSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityReturnTypeCollectionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityReturnTypeCollectionAccess().getGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleDtoReturnTypeCollection
entryRuleDtoReturnTypeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDtoReturnTypeCollectionRule()); }
	iv_ruleDtoReturnTypeCollection=ruleDtoReturnTypeCollection
	{ $current=$iv_ruleDtoReturnTypeCollection.current; }
	EOF;

// Rule DtoReturnTypeCollection
ruleDtoReturnTypeCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LIST_0=RULE_LIST
		{
			newLeafNode(this_LIST_0, grammarAccess.getDtoReturnTypeCollectionAccess().getLISTTerminalRuleCall_0());
		}
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getDtoReturnTypeCollectionAccess().getLessThanSignKeyword_1());
		}
		otherlv_2='#'
		{
			newLeafNode(otherlv_2, grammarAccess.getDtoReturnTypeCollectionAccess().getNumberSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDtoReturnTypeCollectionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoCrossReference_3_0());
				}
			)
		)
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getDtoReturnTypeCollectionAccess().getGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleSimpleReturnTypeCollection
entryRuleSimpleReturnTypeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleReturnTypeCollectionRule()); }
	iv_ruleSimpleReturnTypeCollection=ruleSimpleReturnTypeCollection
	{ $current=$iv_ruleSimpleReturnTypeCollection.current; }
	EOF;

// Rule SimpleReturnTypeCollection
ruleSimpleReturnTypeCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LIST_0=RULE_LIST
		{
			newLeafNode(this_LIST_0, grammarAccess.getSimpleReturnTypeCollectionAccess().getLISTTerminalRuleCall_0());
		}
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getSimpleReturnTypeCollectionAccess().getLessThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSimpleReturnTypeCollectionRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"uo.diesels.model.PersistenceDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getSimpleReturnTypeCollectionAccess().getGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleAllModelTypeCollection
entryRuleAllModelTypeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAllModelTypeCollectionRule()); }
	iv_ruleAllModelTypeCollection=ruleAllModelTypeCollection
	{ $current=$iv_ruleAllModelTypeCollection.current; }
	EOF;

// Rule AllModelTypeCollection
ruleAllModelTypeCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_collection_0_1=RULE_LIST
					{
						newLeafNode(lv_collection_0_1, grammarAccess.getAllModelTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
						}
						setWithLastConsumed(
							$current,
							"collection",
							lv_collection_0_1,
							"uo.diesels.model.PersistenceDsl.LIST");
					}
					    |
					lv_collection_0_2=RULE_SET
					{
						newLeafNode(lv_collection_0_2, grammarAccess.getAllModelTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
						}
						setWithLastConsumed(
							$current,
							"collection",
							lv_collection_0_2,
							"uo.diesels.model.PersistenceDsl.SET");
					}
				)
			)
		)
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getAllModelTypeCollectionAccess().getLessThanSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAllModelTypeCollectionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getAllModelTypeCollectionAccess().getTypeAllModelTypeCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getAllModelTypeCollectionAccess().getGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleSimpleTypeCollection
entryRuleSimpleTypeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleTypeCollectionRule()); }
	iv_ruleSimpleTypeCollection=ruleSimpleTypeCollection
	{ $current=$iv_ruleSimpleTypeCollection.current; }
	EOF;

// Rule SimpleTypeCollection
ruleSimpleTypeCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_collection_0_1=RULE_LIST
					{
						newLeafNode(lv_collection_0_1, grammarAccess.getSimpleTypeCollectionAccess().getCollectionLISTTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
						}
						setWithLastConsumed(
							$current,
							"collection",
							lv_collection_0_1,
							"uo.diesels.model.PersistenceDsl.LIST");
					}
					    |
					lv_collection_0_2=RULE_SET
					{
						newLeafNode(lv_collection_0_2, grammarAccess.getSimpleTypeCollectionAccess().getCollectionSETTerminalRuleCall_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSimpleTypeCollectionRule());
						}
						setWithLastConsumed(
							$current,
							"collection",
							lv_collection_0_2,
							"uo.diesels.model.PersistenceDsl.SET");
					}
				)
			)
		)
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeCollectionAccess().getLessThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSimpleTypeCollectionAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSimpleTypeCollectionRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"uo.diesels.model.PersistenceDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getSimpleTypeCollectionAccess().getGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleDefVariable
entryRuleDefVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefVariableRule()); }
	iv_ruleDefVariable=ruleDefVariable
	{ $current=$iv_ruleDefVariable.current; }
	EOF;

// Rule DefVariable
ruleDefVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDefVariableAccess().getDefSimpleVariableParserRuleCall_0());
		}
		this_DefSimpleVariable_0=ruleDefSimpleVariable
		{
			$current = $this_DefSimpleVariable_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefVariableAccess().getDefAllModelTypeVariableParserRuleCall_1());
		}
		this_DefAllModelTypeVariable_1=ruleDefAllModelTypeVariable
		{
			$current = $this_DefAllModelTypeVariable_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefVariableAccess().getDefCollectionTypeVariableParserRuleCall_2());
		}
		this_DefCollectionTypeVariable_2=ruleDefCollectionTypeVariable
		{
			$current = $this_DefCollectionTypeVariable_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDefAllModelTypeVariable
entryRuleDefAllModelTypeVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefAllModelTypeVariableRule()); }
	iv_ruleDefAllModelTypeVariable=ruleDefAllModelTypeVariable
	{ $current=$iv_ruleDefAllModelTypeVariable.current; }
	EOF;

// Rule DefAllModelTypeVariable
ruleDefAllModelTypeVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefAllModelTypeVariableRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefAllModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefAllModelTypeVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDefSimpleVariable
entryRuleDefSimpleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefSimpleVariableRule()); }
	iv_ruleDefSimpleVariable=ruleDefSimpleVariable
	{ $current=$iv_ruleDefSimpleVariable.current; }
	EOF;

// Rule DefSimpleVariable
ruleDefSimpleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefSimpleVariableRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"uo.diesels.model.PersistenceDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefSimpleVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefSimpleVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDefCollectionTypeVariable
entryRuleDefCollectionTypeVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefCollectionTypeVariableRule()); }
	iv_ruleDefCollectionTypeVariable=ruleDefCollectionTypeVariable
	{ $current=$iv_ruleDefCollectionTypeVariable.current; }
	EOF;

// Rule DefCollectionTypeVariable
ruleDefCollectionTypeVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getDefAllModelTypeCollectionVariableParserRuleCall_0());
		}
		this_DefAllModelTypeCollectionVariable_0=ruleDefAllModelTypeCollectionVariable
		{
			$current = $this_DefAllModelTypeCollectionVariable_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefCollectionTypeVariableAccess().getDefSimpleTypeCollectionVariableParserRuleCall_1());
		}
		this_DefSimpleTypeCollectionVariable_1=ruleDefSimpleTypeCollectionVariable
		{
			$current = $this_DefSimpleTypeCollectionVariable_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDefAllModelTypeCollectionVariable
entryRuleDefAllModelTypeCollectionVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefAllModelTypeCollectionVariableRule()); }
	iv_ruleDefAllModelTypeCollectionVariable=ruleDefAllModelTypeCollectionVariable
	{ $current=$iv_ruleDefAllModelTypeCollectionVariable.current; }
	EOF;

// Rule DefAllModelTypeCollectionVariable
ruleDefAllModelTypeCollectionVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0());
				}
				lv_type_0_0=ruleAllModelTypeCollection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefAllModelTypeCollectionVariableRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"uo.diesels.model.PersistenceDsl.AllModelTypeCollection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefAllModelTypeCollectionVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDefSimpleTypeCollectionVariable
entryRuleDefSimpleTypeCollectionVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefSimpleTypeCollectionVariableRule()); }
	iv_ruleDefSimpleTypeCollectionVariable=ruleDefSimpleTypeCollectionVariable
	{ $current=$iv_ruleDefSimpleTypeCollectionVariable.current; }
	EOF;

// Rule DefSimpleTypeCollectionVariable
ruleDefSimpleTypeCollectionVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0());
				}
				lv_type_0_0=ruleSimpleTypeCollection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefSimpleTypeCollectionVariableRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"uo.diesels.model.PersistenceDsl.SimpleTypeCollection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefSimpleTypeCollectionVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0());
		}
		this_BasicType_0=ruleBasicType
		{
			$current.merge(this_BasicType_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1());
		}
		this_ComplexType_1=ruleComplexType
		{
			$current.merge(this_ComplexType_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBasicType
entryRuleBasicType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	iv_ruleBasicType=ruleBasicType
	{ $current=$iv_ruleBasicType.current.getText(); }
	EOF;

// Rule BasicType
ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TYPE_INT_0=RULE_TYPE_INT
		{
			$current.merge(this_TYPE_INT_0);
		}
		{
			newLeafNode(this_TYPE_INT_0, grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0());
		}
		    |
		this_TYPE_DOUBLE_1=RULE_TYPE_DOUBLE
		{
			$current.merge(this_TYPE_DOUBLE_1);
		}
		{
			newLeafNode(this_TYPE_DOUBLE_1, grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1());
		}
		    |
		this_TYPE_FLOAT_2=RULE_TYPE_FLOAT
		{
			$current.merge(this_TYPE_FLOAT_2);
		}
		{
			newLeafNode(this_TYPE_FLOAT_2, grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2());
		}
		    |
		this_TYPE_LONG_3=RULE_TYPE_LONG
		{
			$current.merge(this_TYPE_LONG_3);
		}
		{
			newLeafNode(this_TYPE_LONG_3, grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3());
		}
		    |
		this_TYPE_CHAR_4=RULE_TYPE_CHAR
		{
			$current.merge(this_TYPE_CHAR_4);
		}
		{
			newLeafNode(this_TYPE_CHAR_4, grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4());
		}
		    |
		this_TYPE_STRING_5=RULE_TYPE_STRING
		{
			$current.merge(this_TYPE_STRING_5);
		}
		{
			newLeafNode(this_TYPE_STRING_5, grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5());
		}
		    |
		this_TYPE_BOOLEAN_6=RULE_TYPE_BOOLEAN
		{
			$current.merge(this_TYPE_BOOLEAN_6);
		}
		{
			newLeafNode(this_TYPE_BOOLEAN_6, grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6());
		}
		    |
		this_TYPE_BINARY_7=RULE_TYPE_BINARY
		{
			$current.merge(this_TYPE_BINARY_7);
		}
		{
			newLeafNode(this_TYPE_BINARY_7, grammarAccess.getBasicTypeAccess().getTYPE_BINARYTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleComplexType
entryRuleComplexType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getComplexTypeRule()); }
	iv_ruleComplexType=ruleComplexType
	{ $current=$iv_ruleComplexType.current.getText(); }
	EOF;

// Rule ComplexType
ruleComplexType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_DATE_0=RULE_DATE
	{
		$current.merge(this_DATE_0);
	}
	{
		newLeafNode(this_DATE_0, grammarAccess.getComplexTypeAccess().getDATETerminalRuleCall());
	}
;

RULE_LIST : 'List';

RULE_SET : 'Set';

RULE_DATE : 'Date';

RULE_TYPE_INT : 'Integer';

RULE_TYPE_LONG : 'Long';

RULE_TYPE_DOUBLE : 'Double';

RULE_TYPE_FLOAT : 'Float';

RULE_TYPE_CHAR : 'Character';

RULE_TYPE_STRING : 'String';

RULE_TYPE_BOOLEAN : 'Boolean';

RULE_TYPE_BINARY : 'Binary';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
