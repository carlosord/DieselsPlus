package uo.diesels.model.generator.business.util;

import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.common.DefaultMethod;

public interface BusinessMethod extends DefaultMethod {
	
	Set<String> getImports(String project, String flag, String service);
	List<BusinessVariableDefinition> getMethodParameters();
	String getMethodKeyword();
	String getMethodFinderName();
	String parametersToServiceMethod();

}
