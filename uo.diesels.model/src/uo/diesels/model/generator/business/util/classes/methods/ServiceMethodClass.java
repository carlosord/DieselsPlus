package uo.diesels.model.generator.business.util.classes.methods;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.common.classes.methods.DefaultMethodClass;
import uo.diesels.model.generator.util.ImportConstants;

public abstract class ServiceMethodClass extends DefaultMethodClass implements BusinessMethod {

	protected String keyword;

	public ServiceMethodClass() {}

	public ServiceMethodClass(String name, String keyword) {
		super(name);
		this.keyword = keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getKeyword() {
		return keyword;
	}

	@Override
	public String getMethodKeyword() {
		return this.keyword;
	}

	@Override
	public Set<String> getImports(String project, String flag, String service) {
		Set<String> imports = new HashSet<>();
		
		if (this.keyword != null && flag.equals("impl"))
			imports.add(String.format(ImportConstants.SERVICE_COMMAND_IMPORT, project));

		return imports;
	}

}
