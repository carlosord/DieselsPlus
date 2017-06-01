package uo.diesels.model.generator.business.util.classes.variables;

import uo.diesels.model.businessDsl.DefAllModelTypeCollectionVariable;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeCollectionVariableClass;

public class AllModelTypeCollectionVariableClass extends DefaultAllModelTypeCollectionVariableClass implements BusinessVariableDefinition {

	public AllModelTypeCollectionVariableClass(DefAllModelTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}

}
