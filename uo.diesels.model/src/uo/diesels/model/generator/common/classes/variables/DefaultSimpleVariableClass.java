package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;

public class DefaultSimpleVariableClass extends DefaultVariableClass {

	protected String type;
	
	public DefaultSimpleVariableClass() {}
	
	public DefaultSimpleVariableClass(String name, String type) {
		super(name);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.type;
	}
	
	@Override
	public Object getVariableTypeClass() {
		return null;
	}
	
	@Override
	public Set<String> getVariableImports(String project) {
		Set<String> imports = new HashSet<>();
		
		if (this.type.equals("Date")) {
			imports.add(ImportConstants.DATE_IMPORT);
		}
		
		return imports;
	}

	@Override
	public String toString() {
		return "DefaultSimpleVariableClass [name=" + name + ", type=" + type + "]";
	}

}
