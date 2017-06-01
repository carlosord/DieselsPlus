package uo.diesels.model.generator.persistence.util.util;

import uo.diesels.model.generator.persistence.util.PersistenceMethod;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.generator.persistence.util.classes.methods.MethodCollectionReturnClass;
import uo.diesels.model.generator.persistence.util.classes.methods.MethodDtoReturnClass;
import uo.diesels.model.generator.persistence.util.classes.methods.MethodEntityReturnClass;
import uo.diesels.model.generator.persistence.util.classes.methods.MethodSimpleReturnClass;
import uo.diesels.model.generator.persistence.util.classes.variables.AllModelTypeCollectionVariableClass;
import uo.diesels.model.generator.persistence.util.classes.variables.AllModelTypeVariableClass;
import uo.diesels.model.generator.persistence.util.classes.variables.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.persistence.util.classes.variables.SimpleVariableClass;
import uo.diesels.model.persistenceDsl.DefAllModelTypeCollectionVariable;
import uo.diesels.model.persistenceDsl.DefAllModelTypeVariable;
import uo.diesels.model.persistenceDsl.DefSimpleTypeCollectionVariable;
import uo.diesels.model.persistenceDsl.DefSimpleVariable;
import uo.diesels.model.persistenceDsl.DefVariable;
import uo.diesels.model.persistenceDsl.FinderMethod;
import uo.diesels.model.persistenceDsl.MethodCollectionReturn;
import uo.diesels.model.persistenceDsl.MethodDtoReturn;
import uo.diesels.model.persistenceDsl.MethodEntityReturn;
import uo.diesels.model.persistenceDsl.MethodSimpleReturn;

public class Transformer {

	public static PersistenceMethod transform(FinderMethod m) {
		if (m instanceof MethodSimpleReturn) 
			return transform((MethodSimpleReturn) m);
		if (m instanceof MethodEntityReturn) 
			return transform((MethodEntityReturn) m);
		if (m instanceof MethodDtoReturn) 
			return transform((MethodDtoReturn) m);
		if (m instanceof MethodCollectionReturn)
			return transform((MethodCollectionReturn) m);
		return null;
	}
	
	public static PersistenceVariableDefinition transform(DefVariable v) {
		if (v instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) v);
		if (v instanceof DefAllModelTypeVariable)
			return transform((DefAllModelTypeVariable) v);
		if (v instanceof DefAllModelTypeCollectionVariable)
			return transform((DefAllModelTypeCollectionVariable) v);
		if (v instanceof DefSimpleTypeCollectionVariable)
			return transform((DefSimpleTypeCollectionVariable) v);
		return null;
	}
	
	public static PersistenceMethod transform(MethodSimpleReturn m) {
		return new MethodSimpleReturnClass(m);
	}
	
	public static PersistenceMethod transform(MethodEntityReturn m) {
		return new MethodEntityReturnClass(m);
	}
	
	public static PersistenceMethod transform(MethodDtoReturn m) {
		return new MethodDtoReturnClass(m);
	}
	
	public static PersistenceMethod transform(MethodCollectionReturn m) {
		return new MethodCollectionReturnClass(m);
	}
	
	public static PersistenceVariableDefinition transform(DefSimpleVariable v) {
		return new SimpleVariableClass(v);
	}
	
	public static PersistenceVariableDefinition transform(DefAllModelTypeVariable v) {
		return new AllModelTypeVariableClass(v);
	}
	
	public static PersistenceVariableDefinition transform(DefAllModelTypeCollectionVariable v) {
		return new AllModelTypeCollectionVariableClass(v);
	}
	
	public static PersistenceVariableDefinition transform(DefSimpleTypeCollectionVariable v) {
		return new SimpleTypeCollectionVariableClass(v);
	}
	
}
