package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.AllModelType;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.ValueType;

public class DefaultAllModelTypeVariableClass extends DefaultVariableClass {
	
	protected AllModelType type;
	
	public DefaultAllModelTypeVariableClass() {}

	public DefaultAllModelTypeVariableClass(String name, AllModelType type) {
		super(name);
		this.type = type;
	}

	public AllModelType getType() {
		return type;
	}

	public void setType(AllModelType type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.type.getName();
	}
	
	@Override
	public AllModelType getVariableTypeClass() {
		return this.type;
	}
	
	@Override
	public Set<String> getVariableImports(String project) {
		Set<String> imports = new HashSet<>();
		
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
		return "DefaultAllModelTypeVariableClass [name=" + name + ", type=" + type + "]";
	}

}
