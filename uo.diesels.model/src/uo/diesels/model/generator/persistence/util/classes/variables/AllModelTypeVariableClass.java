package uo.diesels.model.generator.persistence.util.classes.variables;

import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeVariableClass;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.persistenceDsl.DefAllModelTypeVariable;

public class AllModelTypeVariableClass extends DefaultAllModelTypeVariableClass implements PersistenceVariableDefinition {

	public AllModelTypeVariableClass(DefAllModelTypeVariable var) {
		super(var.getName(), var.getType());
	}

}
