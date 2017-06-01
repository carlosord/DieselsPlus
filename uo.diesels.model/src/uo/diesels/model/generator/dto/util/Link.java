package uo.diesels.model.generator.dto.util;

import java.util.List;

import uo.diesels.model.generator.dto.util.classes.AssociativeEntityClass;

public interface Link {
	
	List<DtoVariableDefinition> getRelationIdVariables(String entityName, AssociativeEntityClass e);

}
