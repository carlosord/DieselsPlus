package uo.diesels.model.generator.dto.util.classes;

import uo.diesels.model.dtoDsl.DefDtoSimpleTypeCollectionVariable;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;

public class SimpleTypeCollectionVariableClass extends DefaultSimpleTypeCollectionVariableClass implements DtoVariableDefinition {

	public SimpleTypeCollectionVariableClass(DefDtoSimpleTypeCollectionVariable s) {
		super(s.getCollection(), s.getType(), s.getName());
	}

}
