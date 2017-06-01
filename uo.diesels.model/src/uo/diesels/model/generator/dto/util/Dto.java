package uo.diesels.model.generator.dto.util;

import java.util.List;
import java.util.Set;

public interface Dto {
	
	String getName();
	List<DtoVariableDefinition> getAttributes();
	Set<String> getImports(String project);

}
