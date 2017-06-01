package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.ModelType;

public class DefaultModelTypeCollectionVariableClass extends DefaultVariableClass {

	protected String collection;
	protected ModelType type;

	public DefaultModelTypeCollectionVariableClass() {
	}

	public DefaultModelTypeCollectionVariableClass(String collection, ModelType type, String name) {
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

	public ModelType getType() {
		return type;
	}

	public void setType(ModelType type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.collection + "<" + this.type.getName() + ">";
	}

	@Override
	public ModelType getVariableTypeClass() {
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
		} else { // ValueType
			imports.add(String.format(ImportConstants.MODEL_VALUE_TYPE_PACKAGE_IMPORT, project, this.type.getName()));
		} 
		return imports;
	}

	@Override
	public String toString() {
		return "DefaultModelTypeCollectionVariableClass [name=" + name + ", type=" + type + ", collection=" + collection
				+ "]";
	}

}
