package uo.diesels.model.generator.business.util.classes.variables;

import uo.diesels.model.businessDsl.DefDtoTypeVariable;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.common.classes.variables.DefaultDtoTypeVariableClass;

public class DtoTypeVariableClass extends DefaultDtoTypeVariableClass implements BusinessVariableDefinition {

	public DtoTypeVariableClass(DefDtoTypeVariable var) {
		super(var.getName(), var.getType());
	}

}
