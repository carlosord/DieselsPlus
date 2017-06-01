package uo.diesels.model.generator.business.util.util;

import uo.diesels.model.businessDsl.DefAllModelTypeCollectionVariable;
import uo.diesels.model.businessDsl.DefAllModelTypeVariable;
import uo.diesels.model.businessDsl.DefDtoTypeCollectionVariable;
import uo.diesels.model.businessDsl.DefDtoTypeVariable;
import uo.diesels.model.businessDsl.DefSimpleTypeCollectionVariable;
import uo.diesels.model.businessDsl.DefSimpleVariable;
import uo.diesels.model.businessDsl.DefVariable;
import uo.diesels.model.businessDsl.JpaMethod;
import uo.diesels.model.businessDsl.MethodAllModelReturn;
import uo.diesels.model.businessDsl.MethodCollectionReturn;
import uo.diesels.model.businessDsl.MethodDtoReturn;
import uo.diesels.model.businessDsl.MethodSimpleReturn;
import uo.diesels.model.businessDsl.ServiceMethod;
import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.classes.methods.FinderUserMethodAllModelReturnClass;
import uo.diesels.model.generator.business.util.classes.methods.FinderUserMethodCollectionReturnClass;
import uo.diesels.model.generator.business.util.classes.methods.FinderUserMethodDtoReturnClass;
import uo.diesels.model.generator.business.util.classes.methods.FinderUserMethodSimpleReturnClass;
import uo.diesels.model.generator.business.util.classes.methods.JpaMethodClass;
import uo.diesels.model.generator.business.util.classes.variables.AllModelTypeCollectionVariableClass;
import uo.diesels.model.generator.business.util.classes.variables.AllModelTypeVariableClass;
import uo.diesels.model.generator.business.util.classes.variables.DtoTypeCollectionVariableClass;
import uo.diesels.model.generator.business.util.classes.variables.DtoTypeVariableClass;
import uo.diesels.model.generator.business.util.classes.variables.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.business.util.classes.variables.SimpleVariableClass;

public class Transformer {

	public static BusinessMethod transform(ServiceMethod m) {
		if (m instanceof JpaMethod)
			return transform((JpaMethod) m);
		if (m instanceof MethodSimpleReturn) 
			return transform((MethodSimpleReturn) m);
		if (m instanceof MethodAllModelReturn) 
			return transform((MethodAllModelReturn) m);
		if (m instanceof MethodDtoReturn) 
			return transform((MethodDtoReturn) m);
		if (m instanceof MethodCollectionReturn)
			return transform((MethodCollectionReturn) m);
		return null;
	}
	
	public static BusinessVariableDefinition transform(DefVariable v) {
		if (v instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) v);
		if (v instanceof DefAllModelTypeVariable)
			return transform((DefAllModelTypeVariable) v);
		if (v instanceof DefDtoTypeVariable)
			return transform((DefDtoTypeVariable) v);
		if (v instanceof DefAllModelTypeCollectionVariable)
			return transform((DefAllModelTypeCollectionVariable) v);
		if (v instanceof DefDtoTypeCollectionVariable)
			return transform((DefDtoTypeCollectionVariable) v);
		if (v instanceof DefSimpleTypeCollectionVariable)
			return transform((DefSimpleTypeCollectionVariable) v);
		return null;
	}
	
	public static BusinessMethod transform(JpaMethod m) {
		return new JpaMethodClass(m);
	}
	
	public static BusinessMethod transform(MethodSimpleReturn m) {
		return new FinderUserMethodSimpleReturnClass(m);
	}
	
	public static BusinessMethod transform(MethodAllModelReturn m) {
		return new FinderUserMethodAllModelReturnClass(m);
	}
	
	public static BusinessMethod transform(MethodDtoReturn m) {
		return new FinderUserMethodDtoReturnClass(m);
	}
	
	public static BusinessMethod transform(MethodCollectionReturn m) {
		return new FinderUserMethodCollectionReturnClass(m);
	}
	
	public static BusinessVariableDefinition transform(DefSimpleVariable v) {
		return new SimpleVariableClass(v);
	}
	
	public static BusinessVariableDefinition transform(DefAllModelTypeVariable v) {
		return new AllModelTypeVariableClass(v);
	}
	
	public static BusinessVariableDefinition transform(DefDtoTypeVariable v) {
		return new DtoTypeVariableClass(v);
	}
	
	public static BusinessVariableDefinition transform(DefAllModelTypeCollectionVariable v) {
		return new AllModelTypeCollectionVariableClass(v);
	}
	
	public static BusinessVariableDefinition transform(DefDtoTypeCollectionVariable v) {
		return new DtoTypeCollectionVariableClass(v);
	}
	
	public static BusinessVariableDefinition transform(DefSimpleTypeCollectionVariable v) {
		return new SimpleTypeCollectionVariableClass(v);
	}
	
}
