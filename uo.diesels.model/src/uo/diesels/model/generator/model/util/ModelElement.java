package uo.diesels.model.generator.model.util;

import java.util.Set;

public interface ModelElement {
	
	String getAnnotations();
	Set<String> getImports(String project);

}
