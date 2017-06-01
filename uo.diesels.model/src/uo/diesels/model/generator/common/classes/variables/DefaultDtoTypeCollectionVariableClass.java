package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.dtoDsl.Dto;
import uo.diesels.model.generator.util.ImportConstants;

public class DefaultDtoTypeCollectionVariableClass extends DefaultVariableClass {
	
	protected String collection;
	protected Dto type;
	
	public DefaultDtoTypeCollectionVariableClass() {}
	
	public DefaultDtoTypeCollectionVariableClass(String collection, Dto type, String name) {
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

	public Dto getType() {
		return type;
	}

	public void setType(Dto type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.collection + "<" + this.type.getName() + ">";
	}

	@Override
	public Dto getVariableTypeClass() {
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
		imports.add(String.format(
				ImportConstants.DTO_PACKAGE_IMPORT, project, this.type.getName()));

		return imports;
	}

}
