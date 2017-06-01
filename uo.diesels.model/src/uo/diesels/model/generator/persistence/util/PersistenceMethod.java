package uo.diesels.model.generator.persistence.util;

import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.common.DefaultMethod;

public interface PersistenceMethod extends DefaultMethod {
	
	Set<String> getImports(String project);
	String getImplementation(String finder);
	List<PersistenceVariableDefinition> getMethodParameters();
	boolean isNullable();

}
