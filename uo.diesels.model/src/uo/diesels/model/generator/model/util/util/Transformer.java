package uo.diesels.model.generator.model.util.util;

import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.classes.methods.MethodAllModelReturnClass;
import uo.diesels.model.generator.model.util.classes.methods.MethodCollectionReturnClass;
import uo.diesels.model.generator.model.util.classes.methods.MethodSimpleReturnClass;
import uo.diesels.model.generator.model.util.classes.variables.AllModelTypeVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.LinkVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.SimpleVariableClass;
import uo.diesels.model.modelDsl.DefAllModelTypeVariable;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.DefIdAttribute;
import uo.diesels.model.modelDsl.DefLinkVariable;
import uo.diesels.model.modelDsl.DefModelModelTypeCollectionVariable;
import uo.diesels.model.modelDsl.DefModelSimpleTypeCollectionVariable;
import uo.diesels.model.modelDsl.DefModelTypeVariable;
import uo.diesels.model.modelDsl.DefSimpleVariable;
import uo.diesels.model.modelDsl.DefVariable;
import uo.diesels.model.modelDsl.Method;
import uo.diesels.model.modelDsl.MethodAllModelReturn;
import uo.diesels.model.modelDsl.MethodCollectionReturn;
import uo.diesels.model.modelDsl.MethodSimpleReturn;
import uo.diesels.model.modelDsl.Relation;

public class Transformer {

	public static ModelVariableDefinition transform(DefIdAttribute var) {
		if (var instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) var);
		if (var instanceof DefModelTypeVariable)
			return transform((DefModelTypeVariable) var);
		if (var instanceof DefLinkVariable)
			return transform((DefLinkVariable) var);
		return null;
	}

	public static ModelVariableDefinition transform(DefAttribute var) {
		if (var instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) var);
		if (var instanceof DefModelTypeVariable)
			return transform((DefModelTypeVariable) var);
		if (var instanceof DefModelModelTypeCollectionVariable)
			return transform((DefModelModelTypeCollectionVariable) var);
		if (var instanceof DefModelSimpleTypeCollectionVariable)
			return transform((DefModelSimpleTypeCollectionVariable) var);
		return null;
	}
	
	public static ModelVariableDefinition transform(DefVariable var) {
		if (var instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) var);
		if (var instanceof DefModelTypeVariable)
			return transform((DefModelTypeVariable) var);
		if (var instanceof DefAllModelTypeVariable)
			return transform((DefAllModelTypeVariable) var);
		return null;
	}
	
	public static ModelMethod transform(Method m) {
		if (m instanceof MethodSimpleReturn)
			return transform((MethodSimpleReturn) m);
		if (m instanceof MethodAllModelReturn)
			return transform((MethodAllModelReturn) m);
		if (m instanceof MethodCollectionReturn)
			return transform((MethodCollectionReturn) m);
		return null;
	}
	
	public static ModelMethod transform(MethodSimpleReturn var) {
		return new MethodSimpleReturnClass(var);
	}
	
	public static ModelMethod transform(MethodAllModelReturn var) {
		return new MethodAllModelReturnClass(var);
	}
	
	public static ModelMethod transform(MethodCollectionReturn var) {
		return new MethodCollectionReturnClass(var);
	}

	public static ModelVariableDefinition transform(DefSimpleVariable var) {
		return new SimpleVariableClass(var);
	}

	public static ModelVariableDefinition transform(DefModelTypeVariable var) {
		return new ModelTypeVariableClass(var);
	}
	
	public static ModelVariableDefinition transform(DefAllModelTypeVariable var) {
		return new AllModelTypeVariableClass(var);
	}

	public static ModelVariableDefinition transform(DefLinkVariable var) {
		return new LinkVariableClass(var);
	}
	
	public static ModelVariableDefinition transform(DefModelModelTypeCollectionVariable var) {
		return new ModelTypeCollectionVariableClass(var);
	}
	
	public static ModelVariableDefinition transform(DefModelSimpleTypeCollectionVariable var) {
		return new SimpleTypeCollectionVariableClass(var);
	}

	public static RelationClass transform(Relation var) {
		return new RelationClass(var);
	}

}
