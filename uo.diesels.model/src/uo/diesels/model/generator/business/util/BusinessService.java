package uo.diesels.model.generator.business.util;

import java.util.Set;

public interface BusinessService {
	
	String getImplName();
	Set<String> getImports(String project, String flag);
	Set<String> getSrcImports(String project, String flag);

}
