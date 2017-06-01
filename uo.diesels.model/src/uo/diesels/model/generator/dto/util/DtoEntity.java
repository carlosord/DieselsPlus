package uo.diesels.model.generator.dto.util;

import java.util.List;

import uo.diesels.model.generator.common.DefaultEntity;

public interface DtoEntity extends DefaultEntity {
	
	List<DtoVariableDefinition> getAllAttributes();
	String getDtoAssemblerParameters(String entity);

}
