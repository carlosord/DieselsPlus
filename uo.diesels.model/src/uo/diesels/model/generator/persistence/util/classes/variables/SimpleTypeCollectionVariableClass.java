package uo.diesels.model.generator.persistence.util.classes.variables;

import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.persistenceDsl.DefSimpleTypeCollectionVariable;

public class SimpleTypeCollectionVariableClass extends DefaultSimpleTypeCollectionVariableClass
		implements PersistenceVariableDefinition {

	public SimpleTypeCollectionVariableClass(DefSimpleTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}

}
