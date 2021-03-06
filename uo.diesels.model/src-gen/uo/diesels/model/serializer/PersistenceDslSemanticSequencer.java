/*
 * generated by Xtext 2.10.0
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
import uo.diesels.model.persistenceDsl.AllModelTypeCollection;
import uo.diesels.model.persistenceDsl.DefAllModelTypeCollectionVariable;
import uo.diesels.model.persistenceDsl.DefAllModelTypeVariable;
import uo.diesels.model.persistenceDsl.DefSimpleTypeCollectionVariable;
import uo.diesels.model.persistenceDsl.DefSimpleVariable;
import uo.diesels.model.persistenceDsl.DtoReturnTypeCollection;
import uo.diesels.model.persistenceDsl.EntityReturnTypeCollection;
import uo.diesels.model.persistenceDsl.Finder;
import uo.diesels.model.persistenceDsl.MethodCollectionReturn;
import uo.diesels.model.persistenceDsl.MethodDtoReturn;
import uo.diesels.model.persistenceDsl.MethodEntityReturn;
import uo.diesels.model.persistenceDsl.MethodSimpleReturn;
import uo.diesels.model.persistenceDsl.Model;
import uo.diesels.model.persistenceDsl.PersistenceDslPackage;
import uo.diesels.model.persistenceDsl.SimpleReturnTypeCollection;
import uo.diesels.model.persistenceDsl.SimpleTypeCollection;
import uo.diesels.model.services.PersistenceDslGrammarAccess;

@SuppressWarnings("all")
public class PersistenceDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PersistenceDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PersistenceDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PersistenceDslPackage.ALL_MODEL_TYPE_COLLECTION:
				sequence_AllModelTypeCollection(context, (AllModelTypeCollection) semanticObject); 
				return; 
			case PersistenceDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE:
				sequence_DefAllModelTypeCollectionVariable(context, (DefAllModelTypeCollectionVariable) semanticObject); 
				return; 
			case PersistenceDslPackage.DEF_ALL_MODEL_TYPE_VARIABLE:
				sequence_DefAllModelTypeVariable(context, (DefAllModelTypeVariable) semanticObject); 
				return; 
			case PersistenceDslPackage.DEF_SIMPLE_TYPE_COLLECTION_VARIABLE:
				sequence_DefSimpleTypeCollectionVariable(context, (DefSimpleTypeCollectionVariable) semanticObject); 
				return; 
			case PersistenceDslPackage.DEF_SIMPLE_VARIABLE:
				sequence_DefSimpleVariable(context, (DefSimpleVariable) semanticObject); 
				return; 
			case PersistenceDslPackage.DTO_RETURN_TYPE_COLLECTION:
				sequence_DtoReturnTypeCollection(context, (DtoReturnTypeCollection) semanticObject); 
				return; 
			case PersistenceDslPackage.ENTITY_RETURN_TYPE_COLLECTION:
				sequence_EntityReturnTypeCollection(context, (EntityReturnTypeCollection) semanticObject); 
				return; 
			case PersistenceDslPackage.FINDER:
				sequence_Finder(context, (Finder) semanticObject); 
				return; 
			case PersistenceDslPackage.METHOD_COLLECTION_RETURN:
				sequence_MethodCollectionReturn(context, (MethodCollectionReturn) semanticObject); 
				return; 
			case PersistenceDslPackage.METHOD_DTO_RETURN:
				sequence_MethodDtoReturn(context, (MethodDtoReturn) semanticObject); 
				return; 
			case PersistenceDslPackage.METHOD_ENTITY_RETURN:
				sequence_MethodEntityReturn(context, (MethodEntityReturn) semanticObject); 
				return; 
			case PersistenceDslPackage.METHOD_SIMPLE_RETURN:
				sequence_MethodSimpleReturn(context, (MethodSimpleReturn) semanticObject); 
				return; 
			case PersistenceDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PersistenceDslPackage.SIMPLE_RETURN_TYPE_COLLECTION:
				sequence_SimpleReturnTypeCollection(context, (SimpleReturnTypeCollection) semanticObject); 
				return; 
			case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION:
				sequence_SimpleTypeCollection(context, (SimpleTypeCollection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AllModelTypeCollection returns AllModelTypeCollection
	 *
	 * Constraint:
	 *     ((collection=LIST | collection=SET) type=[AllModelType|ID])
	 */
	protected void sequence_AllModelTypeCollection(ISerializationContext context, AllModelTypeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefVariable returns DefAllModelTypeCollectionVariable
	 *     DefCollectionTypeVariable returns DefAllModelTypeCollectionVariable
	 *     DefAllModelTypeCollectionVariable returns DefAllModelTypeCollectionVariable
	 *
	 * Constraint:
	 *     (type=AllModelTypeCollection name=ID)
	 */
	protected void sequence_DefAllModelTypeCollectionVariable(ISerializationContext context, DefAllModelTypeCollectionVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getTypeAllModelTypeCollectionParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefAllModelTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_ALL_MODEL_TYPE_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_ALL_MODEL_TYPE_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefAllModelTypeVariableAccess().getTypeAllModelTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefAllModelTypeVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefVariable returns DefSimpleTypeCollectionVariable
	 *     DefCollectionTypeVariable returns DefSimpleTypeCollectionVariable
	 *     DefSimpleTypeCollectionVariable returns DefSimpleTypeCollectionVariable
	 *
	 * Constraint:
	 *     (type=SimpleTypeCollection name=ID)
	 */
	protected void sequence_DefSimpleTypeCollectionVariable(ISerializationContext context, DefSimpleTypeCollectionVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_SIMPLE_TYPE_COLLECTION_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_SIMPLE_TYPE_COLLECTION_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getTypeSimpleTypeCollectionParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefSimpleTypeCollectionVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefVariable returns DefSimpleVariable
	 *     DefSimpleVariable returns DefSimpleVariable
	 *
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_DefSimpleVariable(ISerializationContext context, DefSimpleVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_SIMPLE_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_SIMPLE_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DEF_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefSimpleVariableAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefSimpleVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CollectionReturnType returns DtoReturnTypeCollection
	 *     DtoReturnTypeCollection returns DtoReturnTypeCollection
	 *
	 * Constraint:
	 *     type=[Dto|ID]
	 */
	protected void sequence_DtoReturnTypeCollection(ISerializationContext context, DtoReturnTypeCollection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.DTO_RETURN_TYPE_COLLECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.DTO_RETURN_TYPE_COLLECTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDtoReturnTypeCollectionAccess().getTypeDtoIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CollectionReturnType returns EntityReturnTypeCollection
	 *     EntityReturnTypeCollection returns EntityReturnTypeCollection
	 *
	 * Constraint:
	 *     type=[Entity|ID]
	 */
	protected void sequence_EntityReturnTypeCollection(ISerializationContext context, EntityReturnTypeCollection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.ENTITY_RETURN_TYPE_COLLECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.ENTITY_RETURN_TYPE_COLLECTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityReturnTypeCollectionAccess().getTypeEntityIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Finder returns Finder
	 *
	 * Constraint:
	 *     (name=ID methods+=FinderMethod+)
	 */
	protected void sequence_Finder(ISerializationContext context, Finder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FinderMethod returns MethodCollectionReturn
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
	 *     FinderMethod returns MethodDtoReturn
	 *     MethodDtoReturn returns MethodDtoReturn
	 *
	 * Constraint:
	 *     (returnType=[Dto|ID] name=ID (parameters+=DefVariable parameters+=DefVariable*)? nullable='non-null'?)
	 */
	protected void sequence_MethodDtoReturn(ISerializationContext context, MethodDtoReturn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FinderMethod returns MethodEntityReturn
	 *     MethodEntityReturn returns MethodEntityReturn
	 *
	 * Constraint:
	 *     (returnType=[Entity|ID] name=ID (parameters+=DefVariable parameters+=DefVariable*)? nullable='non-null'?)
	 */
	protected void sequence_MethodEntityReturn(ISerializationContext context, MethodEntityReturn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FinderMethod returns MethodSimpleReturn
	 *     MethodSimpleReturn returns MethodSimpleReturn
	 *
	 * Constraint:
	 *     (returnType=Type name=ID (parameters+=DefVariable parameters+=DefVariable*)? nullable='non-null'?)
	 */
	protected void sequence_MethodSimpleReturn(ISerializationContext context, MethodSimpleReturn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     finder+=Finder+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CollectionReturnType returns SimpleReturnTypeCollection
	 *     SimpleReturnTypeCollection returns SimpleReturnTypeCollection
	 *
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_SimpleReturnTypeCollection(ISerializationContext context, SimpleReturnTypeCollection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PersistenceDslPackage.Literals.SIMPLE_RETURN_TYPE_COLLECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersistenceDslPackage.Literals.SIMPLE_RETURN_TYPE_COLLECTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleReturnTypeCollectionAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimpleTypeCollection returns SimpleTypeCollection
	 *
	 * Constraint:
	 *     ((collection=LIST | collection=SET) type=Type)
	 */
	protected void sequence_SimpleTypeCollection(ISerializationContext context, SimpleTypeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
