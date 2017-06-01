package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;

public class DefaultSimpleTypeCollectionVariableClass extends DefaultVariableClass {
	
	protected String collection;
	protected String type;
	
	public DefaultSimpleTypeCollectionVariableClass() {}

	public DefaultSimpleTypeCollectionVariableClass(String collection, String type, String name) {
		super(name);
		this.collection = collection;
		this.type = type;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.collection + "<" + this.type + ">";
	}

	@Override
	public Object getVariableTypeClass() {
		return null;
	}
	
	@Override
	public Set<String> getVariableImports(String project) {
		Set<String> imports = new HashSet<String>();
		
		// Coleccion de la variable
		if(this.collection.equals("List")) {
			imports.add(ImportConstants.LIST_IMPORT);
		} else if (this.collection.equals("Set")) {
			imports.add(ImportConstants.SET_IMPORT);
		}
		
		return imports;
	}

	@Override
	public String toString() {
		return "DefaultSimpleTypeCollectionVariableClass [name=" + name + ", type=" + type + ", collection="
				+ collection + "]";
	}

}
