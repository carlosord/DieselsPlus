package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.ModelType;

public class DefaultModelTypeVariableClass extends DefaultVariableClass {

	protected ModelType type;

	public DefaultModelTypeVariableClass() {}
	
	public DefaultModelTypeVariableClass(String name, ModelType type) {
		super(name);
		this.type = type;
	}

	public ModelType getType() {
		return type;
	}

	public void setType(ModelType type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.getType().getName();
	}
	
	@Override
	public ModelType getVariableTypeClass() {
		return this.type;
	}
	
	@Override
	public Set<String> getVariableImports(String project) {
		Set<String> imports = new HashSet<String>();
		if(this.type instanceof Enumerable) {
			imports.add(String.format(ImportConstants.MODEL_ENUM_PACKAGE_IMPORT, project, this.type.getName()));
		} else { // ValueType
			imports.add(String.format(ImportConstants.MODEL_VALUE_TYPE_PACKAGE_IMPORT, project, this.type.getName()));
		} 
		return imports;
	}

	@Override
	public String toString() {
		return "DefaultModelTypeVariableClass [name=" + name + ", type=" + type + "]";
	}

}
