package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Link;
import uo.diesels.model.modelDsl.SimpleLink;

public class DefaultLinkVariableClass extends DefaultVariableClass {

	protected Link type;
	
	public DefaultLinkVariableClass() {}

	public DefaultLinkVariableClass(String name, Link type) {
		super(name);
		this.type = type;
	}

	public Link getType() {
		return type;
	}

	public void setType(Link type) {
		this.type = type;
	}
	
	@Override
	public String getVariableType() {
		String name = "";
		if (this.type instanceof SimpleLink) {
			name = ((SimpleLink) this.type).getName();
		} else {
			name = ((AssociativeEntity) this.type).getName();
		}
		return name;
	}
	
	@Override
	public Object getVariableTypeClass() {
		return this.type;
	}
	
	@Override
	public Set<String> getVariableImports(String project) {
		return new HashSet<String>();
	}

	@Override
	public String toString() {
		return "DefaultLinkVariableClass [name=" + name + ", type=" + type + "]";
	}

}
