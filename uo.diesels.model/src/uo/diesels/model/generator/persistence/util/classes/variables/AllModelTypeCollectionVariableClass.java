package uo.diesels.model.generator.persistence.util.classes.variables;

import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeCollectionVariableClass;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.persistenceDsl.DefAllModelTypeCollectionVariable;

public class AllModelTypeCollectionVariableClass extends DefaultAllModelTypeCollectionVariableClass
		implements PersistenceVariableDefinition {

	public AllModelTypeCollectionVariableClass(DefAllModelTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}

}
