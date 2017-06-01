package uo.diesels.model.generator.business.util.classes.variables;

import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.businessDsl.DefSimpleTypeCollectionVariable;

public class SimpleTypeCollectionVariableClass extends DefaultSimpleTypeCollectionVariableClass implements BusinessVariableDefinition {
	
	public SimpleTypeCollectionVariableClass(DefSimpleTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}

}
