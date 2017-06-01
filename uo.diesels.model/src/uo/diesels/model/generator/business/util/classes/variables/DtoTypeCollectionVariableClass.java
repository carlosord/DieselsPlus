package uo.diesels.model.generator.business.util.classes.variables;

import uo.diesels.model.businessDsl.DefDtoTypeCollectionVariable;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultDtoTypeCollectionVariableClass;

public class DtoTypeCollectionVariableClass extends DefaultDtoTypeCollectionVariableClass
		implements BusinessVariableDefinition {

	public DtoTypeCollectionVariableClass(DefDtoTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}

}
