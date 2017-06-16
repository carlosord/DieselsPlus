/*
 * generated by Xtext 2.10.0
 */
grammar InternalDtoDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uo.diesels.model.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getDtosAssignment()); }
		(rule__Model__DtosAssignment)*
		{ after(grammarAccess.getModelAccess().getDtosAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDto
entryRuleDto
:
{ before(grammarAccess.getDtoRule()); }
	 ruleDto
{ after(grammarAccess.getDtoRule()); } 
	 EOF 
;

// Rule Dto
ruleDto 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDtoAccess().getAlternatives()); }
		(rule__Dto__Alternatives)
		{ after(grammarAccess.getDtoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDtoEntity
entryRuleDtoEntity
:
{ before(grammarAccess.getDtoEntityRule()); }
	 ruleDtoEntity
{ after(grammarAccess.getDtoEntityRule()); } 
	 EOF 
;

// Rule DtoEntity
ruleDtoEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDtoEntityAccess().getGroup()); }
		(rule__DtoEntity__Group__0)
		{ after(grammarAccess.getDtoEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDtoFor
entryRuleDtoFor
:
{ before(grammarAccess.getDtoForRule()); }
	 ruleDtoFor
{ after(grammarAccess.getDtoForRule()); } 
	 EOF 
;

// Rule DtoFor
ruleDtoFor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDtoForAccess().getGroup()); }
		(rule__DtoFor__Group__0)
		{ after(grammarAccess.getDtoForAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDtoAttribute
entryRuleDefDtoAttribute
:
{ before(grammarAccess.getDefDtoAttributeRule()); }
	 ruleDefDtoAttribute
{ after(grammarAccess.getDefDtoAttributeRule()); } 
	 EOF 
;

// Rule DefDtoAttribute
ruleDefDtoAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDtoAttributeAccess().getAlternatives()); }
		(rule__DefDtoAttribute__Alternatives)
		{ after(grammarAccess.getDefDtoAttributeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDtoSimpleVariable
entryRuleDefDtoSimpleVariable
:
{ before(grammarAccess.getDefDtoSimpleVariableRule()); }
	 ruleDefDtoSimpleVariable
{ after(grammarAccess.getDefDtoSimpleVariableRule()); } 
	 EOF 
;

// Rule DefDtoSimpleVariable
ruleDefDtoSimpleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDtoSimpleVariableAccess().getGroup()); }
		(rule__DefDtoSimpleVariable__Group__0)
		{ after(grammarAccess.getDefDtoSimpleVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDtoModelTypeVariable
entryRuleDefDtoModelTypeVariable
:
{ before(grammarAccess.getDefDtoModelTypeVariableRule()); }
	 ruleDefDtoModelTypeVariable
{ after(grammarAccess.getDefDtoModelTypeVariableRule()); } 
	 EOF 
;

// Rule DefDtoModelTypeVariable
ruleDefDtoModelTypeVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDtoModelTypeVariableAccess().getGroup()); }
		(rule__DefDtoModelTypeVariable__Group__0)
		{ after(grammarAccess.getDefDtoModelTypeVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDtoCollectionTypeAttribute
entryRuleDefDtoCollectionTypeAttribute
:
{ before(grammarAccess.getDefDtoCollectionTypeAttributeRule()); }
	 ruleDefDtoCollectionTypeAttribute
{ after(grammarAccess.getDefDtoCollectionTypeAttributeRule()); } 
	 EOF 
;

// Rule DefDtoCollectionTypeAttribute
ruleDefDtoCollectionTypeAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getAlternatives()); }
		(rule__DefDtoCollectionTypeAttribute__Alternatives)
		{ after(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDtoModelTypeCollectionVariable
entryRuleDefDtoModelTypeCollectionVariable
:
{ before(grammarAccess.getDefDtoModelTypeCollectionVariableRule()); }
	 ruleDefDtoModelTypeCollectionVariable
{ after(grammarAccess.getDefDtoModelTypeCollectionVariableRule()); } 
	 EOF 
;

// Rule DefDtoModelTypeCollectionVariable
ruleDefDtoModelTypeCollectionVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGroup()); }
		(rule__DefDtoModelTypeCollectionVariable__Group__0)
		{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDtoSimpleTypeCollectionVariable
entryRuleDefDtoSimpleTypeCollectionVariable
:
{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule()); }
	 ruleDefDtoSimpleTypeCollectionVariable
{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableRule()); } 
	 EOF 
;

// Rule DefDtoSimpleTypeCollectionVariable
ruleDefDtoSimpleTypeCollectionVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGroup()); }
		(rule__DefDtoSimpleTypeCollectionVariable__Group__0)
		{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBasicType
entryRuleBasicType
:
{ before(grammarAccess.getBasicTypeRule()); }
	 ruleBasicType
{ after(grammarAccess.getBasicTypeRule()); } 
	 EOF 
;

// Rule BasicType
ruleBasicType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBasicTypeAccess().getAlternatives()); }
		(rule__BasicType__Alternatives)
		{ after(grammarAccess.getBasicTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComplexType
entryRuleComplexType
:
{ before(grammarAccess.getComplexTypeRule()); }
	 ruleComplexType
{ after(grammarAccess.getComplexTypeRule()); } 
	 EOF 
;

// Rule ComplexType
ruleComplexType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComplexTypeAccess().getDATETerminalRuleCall()); }
		RULE_DATE
		{ after(grammarAccess.getComplexTypeAccess().getDATETerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dto__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDtoAccess().getDtoEntityParserRuleCall_0()); }
		ruleDtoEntity
		{ after(grammarAccess.getDtoAccess().getDtoEntityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDtoAccess().getDtoForParserRuleCall_1()); }
		ruleDtoFor
		{ after(grammarAccess.getDtoAccess().getDtoForParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoAttribute__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoAttributeAccess().getDefDtoSimpleVariableParserRuleCall_0()); }
		ruleDefDtoSimpleVariable
		{ after(grammarAccess.getDefDtoAttributeAccess().getDefDtoSimpleVariableParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefDtoAttributeAccess().getDefDtoModelTypeVariableParserRuleCall_1()); }
		ruleDefDtoModelTypeVariable
		{ after(grammarAccess.getDefDtoAttributeAccess().getDefDtoModelTypeVariableParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefDtoAttributeAccess().getDefDtoCollectionTypeAttributeParserRuleCall_2()); }
		ruleDefDtoCollectionTypeAttribute
		{ after(grammarAccess.getDefDtoAttributeAccess().getDefDtoCollectionTypeAttributeParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoCollectionTypeAttribute__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoModelTypeCollectionVariableParserRuleCall_0()); }
		ruleDefDtoModelTypeCollectionVariable
		{ after(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoModelTypeCollectionVariableParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoSimpleTypeCollectionVariableParserRuleCall_1()); }
		ruleDefDtoSimpleTypeCollectionVariable
		{ after(grammarAccess.getDefDtoCollectionTypeAttributeAccess().getDefDtoSimpleTypeCollectionVariableParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); }
		RULE_LIST
		{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); }
		RULE_SET
		{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); }
		RULE_LIST
		{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionLISTTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); }
		RULE_SET
		{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionSETTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); }
		ruleBasicType
		{ after(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1()); }
		ruleComplexType
		{ after(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); }
		RULE_TYPE_INT
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_INTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); }
		RULE_TYPE_DOUBLE
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_DOUBLETerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); }
		RULE_TYPE_FLOAT
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_FLOATTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); }
		RULE_TYPE_LONG
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_LONGTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); }
		RULE_TYPE_CHAR
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_CHARTerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); }
		RULE_TYPE_STRING
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_STRINGTerminalRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); }
		RULE_TYPE_BOOLEAN
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_BOOLEANTerminalRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTYPE_BINARYTerminalRuleCall_7()); }
		RULE_TYPE_BINARY
		{ after(grammarAccess.getBasicTypeAccess().getTYPE_BINARYTerminalRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoEntity__Group__0__Impl
	rule__DtoEntity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoEntityAccess().getDtoKeyword_0()); }
	'Dto'
	{ after(grammarAccess.getDtoEntityAccess().getDtoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoEntity__Group__1__Impl
	rule__DtoEntity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoEntityAccess().getNameAssignment_1()); }
	(rule__DtoEntity__NameAssignment_1)
	{ after(grammarAccess.getDtoEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoEntity__Group__2__Impl
	rule__DtoEntity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoEntityAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDtoEntityAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoEntity__Group__3__Impl
	rule__DtoEntity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoEntityAccess().getAttributesAssignment_3()); }
	(rule__DtoEntity__AttributesAssignment_3)*
	{ after(grammarAccess.getDtoEntityAccess().getAttributesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoEntity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoEntityAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getDtoEntityAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DtoFor__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoFor__Group__0__Impl
	rule__DtoFor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoForAccess().getDtoKeyword_0()); }
	'Dto'
	{ after(grammarAccess.getDtoForAccess().getDtoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoFor__Group__1__Impl
	rule__DtoFor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoForAccess().getNameAssignment_1()); }
	(rule__DtoFor__NameAssignment_1)
	{ after(grammarAccess.getDtoForAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoFor__Group__2__Impl
	rule__DtoFor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoForAccess().getForKeyword_2()); }
	'for'
	{ after(grammarAccess.getDtoForAccess().getForKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DtoFor__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDtoForAccess().getEntityAssignment_3()); }
	(rule__DtoFor__EntityAssignment_3)
	{ after(grammarAccess.getDtoForAccess().getEntityAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefDtoSimpleVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleVariable__Group__0__Impl
	rule__DefDtoSimpleVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleVariableAccess().getTypeAssignment_0()); }
	(rule__DefDtoSimpleVariable__TypeAssignment_0)
	{ after(grammarAccess.getDefDtoSimpleVariableAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleVariable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleVariableAccess().getNameAssignment_1()); }
	(rule__DefDtoSimpleVariable__NameAssignment_1)
	{ after(grammarAccess.getDefDtoSimpleVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefDtoModelTypeVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeVariable__Group__0__Impl
	rule__DefDtoModelTypeVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeAssignment_0()); }
	(rule__DefDtoModelTypeVariable__TypeAssignment_0)
	{ after(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeVariable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeVariableAccess().getNameAssignment_1()); }
	(rule__DefDtoModelTypeVariable__NameAssignment_1)
	{ after(grammarAccess.getDefDtoModelTypeVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefDtoModelTypeCollectionVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeCollectionVariable__Group__0__Impl
	rule__DefDtoModelTypeCollectionVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAssignment_0()); }
	(rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0)
	{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeCollectionVariable__Group__1__Impl
	rule__DefDtoModelTypeCollectionVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getLessThanSignKeyword_1()); }
	'<'
	{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getLessThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeCollectionVariable__Group__2__Impl
	rule__DefDtoModelTypeCollectionVariable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeAssignment_2()); }
	(rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2)
	{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeCollectionVariable__Group__3__Impl
	rule__DefDtoModelTypeCollectionVariable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoModelTypeCollectionVariable__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameAssignment_4()); }
	(rule__DefDtoModelTypeCollectionVariable__NameAssignment_4)
	{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefDtoSimpleTypeCollectionVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl
	rule__DefDtoSimpleTypeCollectionVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAssignment_0()); }
	(rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0)
	{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl
	rule__DefDtoSimpleTypeCollectionVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getLessThanSignKeyword_1()); }
	'<'
	{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getLessThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl
	rule__DefDtoSimpleTypeCollectionVariable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeAssignment_2()); }
	(rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2)
	{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl
	rule__DefDtoSimpleTypeCollectionVariable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameAssignment_4()); }
	(rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4)
	{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__DtosAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getDtosDtoParserRuleCall_0()); }
		ruleDto
		{ after(grammarAccess.getModelAccess().getDtosDtoParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDtoEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDtoEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoEntity__AttributesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDtoEntityAccess().getAttributesDefDtoAttributeParserRuleCall_3_0()); }
		ruleDefDtoAttribute
		{ after(grammarAccess.getDtoEntityAccess().getAttributesDefDtoAttributeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDtoForAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDtoForAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DtoFor__EntityAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDtoForAccess().getEntityEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDtoForAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDtoForAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDtoForAccess().getEntityEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleVariable__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoSimpleVariableAccess().getTypeTypeParserRuleCall_0_0()); }
		ruleType
		{ after(grammarAccess.getDefDtoSimpleVariableAccess().getTypeTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoSimpleVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDefDtoSimpleVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeVariable__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0()); }
		(
			{ before(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getDefDtoModelTypeVariableAccess().getTypeModelTypeCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDefDtoModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__CollectionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); }
		(rule__DefDtoModelTypeCollectionVariable__CollectionAlternatives_0_0)
		{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getTypeModelTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoModelTypeCollectionVariable__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getDefDtoModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__CollectionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); }
		(rule__DefDtoSimpleTypeCollectionVariable__CollectionAlternatives_0_0)
		{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getCollectionAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDtoSimpleTypeCollectionVariable__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getDefDtoSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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
