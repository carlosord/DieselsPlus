package uo.diesels.model.generator.model.util.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultModelTypeVariableClass;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.DefModelTypeVariable;
import uo.diesels.model.modelDsl.Enumerable;

public class ModelTypeVariableClass extends DefaultModelTypeVariableClass implements ModelVariableDefinition {

	private String nullable;

	public ModelTypeVariableClass(DefModelTypeVariable var) {
		super(var.getName(), var.getType());
		this.nullable = var.getNullable();
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	@Override
	public boolean isNullable() {
		return this.nullable != null;
	}

	@Override
	public String getAnnotations() {
		StringBuilder sb = new StringBuilder();
		if (this.type instanceof Enumerable) {
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("enumerated")[ANNOTATION]);
			sb.append(StringUtils.newLine());
			sb.append(String.format(
					JPAAnnotations.getInstance().getAnnotations().get("column")[ANNOTATION],
					this.name, isNullable()));
		} else { // Instance of ValueType
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("embedded")[ANNOTATION]);
		}
		return sb.toString();
	}
	
	@Override
	public Set<String> getAnnotationImports() {
		Set<String> imports = new HashSet<>();
		if (this.type instanceof Enumerable) {
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("enumerated")[ANNOTATION_IMPORT]);
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("column")[ANNOTATION_IMPORT]);
		} else { // Instance of ValueType
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("embedded")[ANNOTATION_IMPORT]);
		}
		return imports;
	}
	
	@Override
	public String isCollectionVariable() {
		return null;
	}

}
