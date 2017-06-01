package uo.diesels.model.generator.model.util.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultLinkVariableClass;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.modelDsl.DefLinkVariable;

public class LinkVariableClass extends DefaultLinkVariableClass implements ModelVariableDefinition {

	public LinkVariableClass(DefLinkVariable var) {
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
		return new HashSet<>();
	}
	
	@Override
	public String isCollectionVariable() {
		return null;
	}

}
