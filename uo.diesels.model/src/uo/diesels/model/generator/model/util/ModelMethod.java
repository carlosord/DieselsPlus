package uo.diesels.model.generator.model.util;

import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.common.DefaultMethod;

public interface ModelMethod extends DefaultMethod {
	
	List<ModelVariableDefinition> getMethodParameters();
	Set<String> getImports(String project);

}
