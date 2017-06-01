/*
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uo.diesels.model.modelDsl.AllModelTypeCollection;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.DefAllModelTypeVariable;
import uo.diesels.model.modelDsl.DefCollectionTypeVariable;
import uo.diesels.model.modelDsl.DefLinkVariable;
import uo.diesels.model.modelDsl.DefModelModelTypeCollectionVariable;
import uo.diesels.model.modelDsl.DefModelSimpleTypeCollectionVariable;
import uo.diesels.model.modelDsl.DefModelTypeVariable;
import uo.diesels.model.modelDsl.DefSimpleVariable;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.MethodAllModelReturn;
import uo.diesels.model.modelDsl.MethodCollectionReturn;
import uo.diesels.model.modelDsl.MethodSimpleReturn;
import uo.diesels.model.modelDsl.Model;
import uo.diesels.model.modelDsl.ModelDslPackage;
import uo.diesels.model.modelDsl.ModelTypeCollection;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;
import uo.diesels.model.modelDsl.SimpleLink;
import uo.diesels.model.modelDsl.SimpleTypeCollection;
import uo.diesels.model.modelDsl.ValueType;
import uo.diesels.model.services.ModelDslGrammarAccess;

@SuppressWarnings("all")
public class ModelDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ModelDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelDslPackage.ALL_MODEL_TYPE_COLLECTION:
				sequence_AllModelTypeCollection(context, (AllModelTypeCollection) semanticObject); 
				return; 
			case ModelDslPackage.ASSOCIATIVE_ENTITY:
				sequence_AssociativeEntity(context, (AssociativeEntity) semanticObject); 
				return; 
			case ModelDslPackage.DEF_ALL_MODEL_TYPE_VARIABLE:
				sequence_DefAllModelTypeVariable(context, (DefAllModelTypeVariable) semanticObject); 
				return; 
			case ModelDslPackage.DEF_COLLECTION_TYPE_VARIABLE:
				sequence_DefCollectionTypeVariable(context, (DefCollectionTypeVariable) semanticObject); 
				return; 
			case ModelDslPackage.DEF_LINK_VARIABLE:
				sequence_DefLinkVariable(context, (DefLinkVariable) semanticObject); 
				return; 
			case ModelDslPackage.DEF_MODEL_MODEL_TYPE_COLLECTION_VARIABLE:
				sequence_DefModelModelTypeCollectionVariable(context, (DefModelModelTypeCollectionVariable) semanticObject); 
				return; 
			case ModelDslPackage.DEF_MODEL_SIMPLE_TYPE_COLLECTION_VARIABLE:
				sequence_DefModelSimpleTypeCollectionVariable(context, (DefModelSimpleTypeCollectionVariable) semanticObject); 
				return; 
			case ModelDslPackage.DEF_MODEL_TYPE_VARIABLE:
				if (rule == grammarAccess.getDefAttributeRule()) {
					sequence_DefAttribute_DefModelTypeVariable(context, (DefModelTypeVariable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDefIdAttributeRule()
						|| rule == grammarAccess.getDefModelTypeVariableRule()) {
					sequence_DefModelTypeVariable(context, (DefModelTypeVariable) semanticObject); 
					return; 
				}
				else break;
			case ModelDslPackage.DEF_SIMPLE_VARIABLE:
				if (rule == grammarAccess.getDefAttributeRule()) {
					sequence_DefAttribute_DefSimpleVariable(context, (DefSimpleVariable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDefVariableRule()
						|| rule == grammarAccess.getDefIdAttributeRule()
						|| rule == grammarAccess.getDefSimpleVariableRule()) {
					sequence_DefSimpleVariable(context, (DefSimpleVariable) semanticObject); 
					return; 
				}
				else break;
			case ModelDslPackage.ENUMERABLE:
				sequence_Enumerable(context, (Enumerable) semanticObject); 
				return; 
			case ModelDslPackage.METHOD_ALL_MODEL_RETURN:
				sequence_MethodAllModelReturn(context, (MethodAllModelReturn) semanticObject); 
				return; 
			case ModelDslPackage.METHOD_COLLECTION_RETURN:
				sequence_MethodCollectionReturn(context, (MethodCollectionReturn) semanticObject); 
				return; 
			case ModelDslPackage.METHOD_SIMPLE_RETURN:
				sequence_MethodSimpleReturn(context, (MethodSimpleReturn) semanticObject); 
				return; 
			case ModelDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ModelDslPackage.MODEL_TYPE_COLLECTION:
				sequence_ModelTypeCollection(context, (ModelTypeCollection) semanticObject); 
				return; 
			case ModelDslPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case ModelDslPackage.SIMPLE_ENTITY:
				sequence_SimpleEntity(context, (SimpleEntity) semanticObject); 
				return; 
			case ModelDslPackage.SIMPLE_LINK:
				sequence_SimpleLink(context, (SimpleLink) semanticObject); 
				return; 
			case ModelDslPackage.SIMPLE_TYPE_COLLECTION:
				sequence_SimpleTypeCollection(context, (SimpleTypeCollection) semanticObject); 
				return; 
			case ModelDslPackage.VALUE_TYPE:
				sequence_ValueType(context, (ValueType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AllModelTypeCollection returns AllModelTypeCollection
	 *     CollectionReturnType returns AllModelTypeCollection
	 *
	 * Constraint:
	 *     ((collection=LIST | collection=SET) type=[AllModelType|ID])
	 */
	protected void sequence_AllModelTypeCollection(ISerializationContext context, AllModelTypeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns AssociativeEntity
	 *     AllModelType returns AssociativeEntity
	 *     Entity returns AssociativeEntity
	 *     Link returns AssociativeEntity
	 *     AssociativeEntity returns AssociativeEntity
	 *
	 * Constraint:
	 *     (name=ID relations+=Relation relations+=Relation attributes+=DefAttribute* methods+=Method*)
	 */
	protected void sequence_AssociativeEntity(ISerializationContext context, AssociativeEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefVariable returns DefAllModelTypeVariable
	 *     DefAllModelTypeVariable returns DefAllModelTypeVariable
	 *
	 * Constraint:
	 *     (type=[AllModelType|ID] name=ID)
	 */
	protected void sequence_DefAllModelTypeVariable(ISerializationContext context, DefAllModelTypeVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_ALL_MODEL_TYPE_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_ALL_MODEL_TYPE_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefAllModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefAttribute returns DefModelTypeVariable
	 *
	 * Constraint:
	 *     (type=[ModelType|ID] name=ID (nullable='nullable' | nullable='non-nullable')?)
	 */
	protected void sequence_DefAttribute_DefModelTypeVariable(ISerializationContext context, DefModelTypeVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefAttribute returns DefSimpleVariable
	 *
	 * Constraint:
	 *     (type=Type name=ID (nullable='nullable' | nullable='non-nullable')?)
	 */
	protected void sequence_DefAttribute_DefSimpleVariable(ISerializationContext context, DefSimpleVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefVariable returns DefCollectionTypeVariable
	 *     DefCollectionTypeVariable returns DefCollectionTypeVariable
	 *
	 * Constraint:
	 *     ((type=AllModelTypeCollection name=ID) | (type=SimpleTypeCollection name=ID))
	 */
	protected void sequence_DefCollectionTypeVariable(ISerializationContext context, DefCollectionTypeVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefIdAttribute returns DefLinkVariable
	 *     DefLinkVariable returns DefLinkVariable
	 *
	 * Constraint:
	 *     (type=[Link|ID] name=ID)
	 */
	protected void sequence_DefLinkVariable(ISerializationContext context, DefLinkVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_LINK_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_LINK_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_LINK_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_LINK_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefLinkVariableAccess().getTypeLinkIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefLinkVariableAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefAttribute returns DefModelModelTypeCollectionVariable
	 *     DefCollectionTypeAttribute returns DefModelModelTypeCollectionVariable
	 *     DefModelModelTypeCollectionVariable returns DefModelModelTypeCollectionVariable
	 *
	 * Constraint:
	 *     (type=ModelTypeCollection name=ID)
	 */
	protected void sequence_DefModelModelTypeCollectionVariable(ISerializationContext context, DefModelModelTypeCollectionVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_MODEL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_MODEL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_COLLECTION_TYPE_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_COLLECTION_TYPE_ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getTypeModelTypeCollectionParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefModelModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefAttribute returns DefModelSimpleTypeCollectionVariable
	 *     DefCollectionTypeAttribute returns DefModelSimpleTypeCollectionVariable
	 *     DefModelSimpleTypeCollectionVariable returns DefModelSimpleTypeCollectionVariable
	 *
	 * Constraint:
	 *     (type=SimpleTypeCollection name=ID)
	 */
	protected void sequence_DefModelSimpleTypeCollectionVariable(ISerializationContext context, DefModelSimpleTypeCollectionVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_MODEL_SIMPLE_TYPE_COLLECTION_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_MODEL_SIMPLE_TYPE_COLLECTION_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_COLLECTION_TYPE_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_COLLECTION_TYPE_ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefModelSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefIdAttribute returns DefModelTypeVariable
	 *     DefModelTypeVariable returns DefModelTypeVariable
	 *
	 * Constraint:
	 *     (type=[ModelType|ID] name=ID)
	 */
	protected void sequence_DefModelTypeVariable(ISerializationContext context, DefModelTypeVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_MODEL_TYPE_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_MODEL_TYPE_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_MODEL_TYPE_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_MODEL_TYPE_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefModelTypeVariableAccess().getTypeModelTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefVariable returns DefSimpleVariable
	 *     DefIdAttribute returns DefSimpleVariable
	 *     DefSimpleVariable returns DefSimpleVariable
	 *
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_DefSimpleVariable(ISerializationContext context, DefSimpleVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_SIMPLE_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_SIMPLE_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ModelDslPackage.Literals.DEF_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelDslPackage.Literals.DEF_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefSimpleVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Enumerable
	 *     AllModelType returns Enumerable
	 *     ModelType returns Enumerable
	 *     Enumerable returns Enumerable
	 *
	 * Constraint:
	 *     (name=ID enums+=ENUMERATE+)
	 */
	protected void sequence_Enumerable(ISerializationContext context, Enumerable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns MethodAllModelReturn
	 *     MethodAllModelReturn returns MethodAllModelReturn
	 *
	 * Constraint:
	 *     (returnType=[AllModelType|ID] name=ID (parameters+=DefVariable parameters+=DefVariable*)?)
	 */
	protected void sequence_MethodAllModelReturn(ISerializationContext context, MethodAllModelReturn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns MethodCollectionReturn
	 *     MethodCollectionReturn returns MethodCollectionReturn
	 *
	 * Constraint:
	 *     (returnType=CollectionReturnType name=ID (parameters+=DefVariable parameters+=DefVariable*)?)
	 */
	protected void sequence_MethodCollectionReturn(ISerializationContext context, MethodCollectionReturn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns MethodSimpleReturn
	 *     MethodSimpleReturn returns MethodSimpleReturn
	 *
	 * Constraint:
	 *     (returnType=SimpleReturnType name=ID (parameters+=DefVariable parameters+=DefVariable*)?)
	 */
	protected void sequence_MethodSimpleReturn(ISerializationContext context, MethodSimpleReturn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelTypeCollection returns ModelTypeCollection
	 *
	 * Constraint:
	 *     ((collection=LIST | collection=SET) type=[ModelType|ID])
	 */
	protected void sequence_ModelTypeCollection(ISerializationContext context, ModelTypeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Element+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (multiplicity=Multiplicity type=[Entity|ID] name=ID (navigable='navigable' | navigable='non-navigable')?)
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SimpleEntity
	 *     AllModelType returns SimpleEntity
	 *     Entity returns SimpleEntity
	 *     SimpleEntity returns SimpleEntity
	 *
	 * Constraint:
	 *     (
	 *         implementation='abstract'? 
	 *         name=ID 
	 *         superClass=[SimpleEntity|ID]? 
	 *         attributesId+=DefIdAttribute* 
	 *         attributes+=DefAttribute* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_SimpleEntity(ISerializationContext context, SimpleEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SimpleLink
	 *     Link returns SimpleLink
	 *     SimpleLink returns SimpleLink
	 *
	 * Constraint:
	 *     (name=ID relations+=Relation relations+=Relation)
	 */
	protected void sequence_SimpleLink(ISerializationContext context, SimpleLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleTypeCollection returns SimpleTypeCollection
	 *     CollectionReturnType returns SimpleTypeCollection
	 *
	 * Constraint:
	 *     ((collection=LIST | collection=SET) type=Type)
	 */
	protected void sequence_SimpleTypeCollection(ISerializationContext context, SimpleTypeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ValueType
	 *     AllModelType returns ValueType
	 *     ModelType returns ValueType
	 *     ValueType returns ValueType
	 *
	 * Constraint:
	 *     (name=ID attributes+=DefAttribute+)
	 */
	protected void sequence_ValueType(ISerializationContext context, ValueType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
