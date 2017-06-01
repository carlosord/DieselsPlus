package uo.diesels.model.generator.common.classes.variables;

import uo.diesels.model.generator.common.DefaultVariableDefinition;

public abstract class DefaultVariableClass implements DefaultVariableDefinition {
	
	public final static int ANNOTATION = 0;
	public final static int ANNOTATION_IMPORT = 1;
	
	protected String name;
	
	public DefaultVariableClass() {}
	
	public DefaultVariableClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DefaultVariableClass other = (DefaultVariableClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String getVariableName() {
		return this.name;
	}

}
