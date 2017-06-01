package uo.diesels.model.generator.dto.util.classes;

import uo.diesels.model.dtoDsl.DefDtoModelTypeVariable;
import uo.diesels.model.generator.common.classes.variables.DefaultModelTypeVariableClass;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.modelDsl.DefModelTypeVariable;

public class ModelTypeVariableClass extends DefaultModelTypeVariableClass implements DtoVariableDefinition {

	public ModelTypeVariableClass(DefDtoModelTypeVariable var) {
		super(var.getName(), var.getType());
	}
	
	public ModelTypeVariableClass(DefModelTypeVariable var) {
		super(var.getName(), var.getType());
	}
	
}
