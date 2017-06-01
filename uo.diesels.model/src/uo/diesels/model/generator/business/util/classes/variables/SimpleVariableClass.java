package uo.diesels.model.generator.business.util.classes.variables;

import uo.diesels.model.businessDsl.DefSimpleVariable;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleVariableClass;

public class SimpleVariableClass extends DefaultSimpleVariableClass implements BusinessVariableDefinition {

	public SimpleVariableClass(DefSimpleVariable var) {
		super(var.getName(), var.getType());
	}

	public SimpleVariableClass(String name, String type) {
		super(name, type);
	}

}
