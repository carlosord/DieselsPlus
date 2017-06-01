package uo.diesels.model.generator.common;

import java.util.Set;

public interface DefaultVariableDefinition {
	
	String getVariableName();
	String getVariableType();
	Object getVariableTypeClass();
	Set<String> getVariableImports(String project);

}
