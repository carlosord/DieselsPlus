package uo.diesels.model.generator.model.util;

import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.common.DefaultEntity;

public interface ModelEntity extends DefaultEntity {

	String getClassName();
	boolean isAbstractEntity();
	boolean isImplementable();
	String getSuperClassName();
	List<ModelMethod> getSrcMethods();
	String getSrcAnnotations();
	Set<String> getSrcImports(String project);
	List<ModelVariableDefinition> getIdVariables();
	
}
