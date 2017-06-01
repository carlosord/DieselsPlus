package uo.diesels.model.generator.model.util.classes.variables;

import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeVariableClass;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.modelDsl.DefAllModelTypeVariable;

public class AllModelTypeVariableClass extends DefaultAllModelTypeVariableClass implements ModelVariableDefinition {

	public AllModelTypeVariableClass(DefAllModelTypeVariable var) {
		super(var.getName(), var.getType());
	}

	@Override
	public boolean isNullable() {
		return false;
	}

	@Override
	public String getAnnotations() {
		return null;
	}

	@Override
	public Set<String> getAnnotationImports() {
		return null;
	}
	
	@Override
	public String isCollectionVariable() {
		return null;
	}

}
