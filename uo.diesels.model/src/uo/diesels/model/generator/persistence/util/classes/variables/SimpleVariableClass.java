package uo.diesels.model.generator.persistence.util.classes.variables;

import uo.diesels.model.persistenceDsl.DefSimpleVariable;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleVariableClass;

public class SimpleVariableClass extends DefaultSimpleVariableClass implements PersistenceVariableDefinition {

	public SimpleVariableClass(DefSimpleVariable var) {
		super(var.getName(), var.getType());
	}

	public SimpleVariableClass(String name, String type) {
		super(name, type);
	}

}
