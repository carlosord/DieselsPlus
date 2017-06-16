package uo.diesels.model.generator.model.util.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultSimpleVariableClass;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.DefSimpleVariable;

public class SimpleVariableClass extends DefaultSimpleVariableClass implements ModelVariableDefinition {

	private String nullable;
	
	public SimpleVariableClass(String name, String type) {
		super(name, type);
	}

	public SimpleVariableClass(DefSimpleVariable var) {
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
		if (this.type.equals("Date")) {
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("temporal")[ANNOTATION]);
			sb.append(StringUtils.newLine());
		} else if (this.type.equals("Byte[]")) {
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("lob")[ANNOTATION]);
			sb.append(StringUtils.newLine());
		}
		sb.append(String.format(JPAAnnotations.getInstance().getAnnotations()
				.get("column")[ANNOTATION], this.name, isNullable()));
		return sb.toString();
	}

	@Override
	public Set<String> getAnnotationImports() {
		Set<String> imports = new HashSet<String>();
		if (this.type.equals("Date")) {
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("temporal")[ANNOTATION_IMPORT]);
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("temporalType")[ANNOTATION_IMPORT]);
		} else if (this.type.equals("Byte[]")) {
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("lob")[ANNOTATION_IMPORT]);
		}
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("column")[ANNOTATION_IMPORT]);

		return imports;
	}

	@Override
	public String isCollectionVariable() {
		return null;
	}

}
