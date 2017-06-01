package uo.diesels.model.generator.dto.util.classes;

import uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable;
import uo.diesels.model.generator.common.classes.variables.DefaultModelTypeCollectionVariableClass;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.modelDsl.DefModelModelTypeCollectionVariable;

public class ModelTypeCollectionVariableClass extends DefaultModelTypeCollectionVariableClass implements DtoVariableDefinition {

	public ModelTypeCollectionVariableClass(DefDtoModelTypeCollectionVariable var) {
		super(var.getCollection(), var.getType(), var.getName());
	}

	public ModelTypeCollectionVariableClass(DefModelModelTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}
	
}
