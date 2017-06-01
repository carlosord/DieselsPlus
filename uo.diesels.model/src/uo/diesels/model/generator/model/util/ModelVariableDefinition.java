package uo.diesels.model.generator.model.util;

import java.util.Set;

import uo.diesels.model.generator.common.DefaultVariableDefinition;

public interface ModelVariableDefinition extends DefaultVariableDefinition {

	boolean isNullable();
	String getAnnotations();
	Set<String> getAnnotationImports();
	String isCollectionVariable();

}
