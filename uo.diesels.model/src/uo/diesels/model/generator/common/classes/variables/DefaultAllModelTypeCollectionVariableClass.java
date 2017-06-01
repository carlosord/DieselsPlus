package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.AllModelType;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.ValueType;

public class DefaultAllModelTypeCollectionVariableClass extends DefaultVariableClass {

	protected String collection;
	protected AllModelType type;

	public DefaultAllModelTypeCollectionVariableClass() {}

	public DefaultAllModelTypeCollectionVariableClass(String collection, AllModelType type, String name) {
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

	public AllModelType getType() {
		return type;
	}

	public void setType(AllModelType type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.collection + "<" + this.type.getName() + ">";
	}

	@Override
	public AllModelType getVariableTypeClass() {
		return this.type;
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
		// Tipo de la variable
		if(this.type instanceof Enumerable) {
			imports.add(String.format(ImportConstants.MODEL_ENUM_PACKAGE_IMPORT, project, this.type.getName()));
		} else if(this.type instanceof ValueType) {
			imports.add(String.format(ImportConstants.MODEL_VALUE_TYPE_PACKAGE_IMPORT, project, this.type.getName()));
		} else { // Entity & AssociativeEntity
			imports.add(String.format(ImportConstants.MODEL_PACKAGE_IMPORT, project, this.type.getName()));
		}
		
		return imports;
	}

	@Override
	public String toString() {
		return "DefaultModelTypeCollectionVariableClass [name=" + name + ", type=" + type + ", collection=" + collection
				+ "]";
	}

}
