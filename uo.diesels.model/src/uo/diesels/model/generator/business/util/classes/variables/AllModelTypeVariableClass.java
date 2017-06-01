package uo.diesels.model.generator.business.util.classes.variables;

import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeVariableClass;
import uo.diesels.model.businessDsl.DefAllModelTypeVariable;

public class AllModelTypeVariableClass extends DefaultAllModelTypeVariableClass
		implements BusinessVariableDefinition {

	public AllModelTypeVariableClass(DefAllModelTypeVariable var) {
		super(var.getName(), var.getType());
	}

}
