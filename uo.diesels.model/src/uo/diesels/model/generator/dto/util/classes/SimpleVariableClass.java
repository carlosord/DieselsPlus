package uo.diesels.model.generator.dto.util.classes;

import uo.diesels.model.dtoDsl.DefDtoSimpleVariable;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleVariableClass;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.modelDsl.DefSimpleVariable;

public class SimpleVariableClass extends DefaultSimpleVariableClass implements DtoVariableDefinition {

	public SimpleVariableClass(DefDtoSimpleVariable var) {
		super(var.getName(), var.getType());
	}
	
	public SimpleVariableClass(DefSimpleVariable var) {
		super(var.getName(), var.getType());
	}
	
	public SimpleVariableClass(String name, String type) {
		super(name, type);
	}

}
