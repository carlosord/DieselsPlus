package uo.diesels.model.generator.persistence.util.classes.methods;

import java.util.Set;

import uo.diesels.model.generator.persistence.util.util.FinderMethodImplementations;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.persistenceDsl.MethodSimpleReturn;

public class MethodSimpleReturnClass extends FinderMethodClass {
	
	private String returnType;
	private String nullable;
	
	public MethodSimpleReturnClass(MethodSimpleReturn m) {
		super(m.getName(), m.getParameters());
		this.returnType = m.getReturnType();
		this.nullable = m.getNullable();
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	@Override
	public String getMethodReturnType() {
		return this.returnType;
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);
				
		if (isNullable())
			imports.add(String.format(ImportConstants.QUERY_UTILS_IMPORT, project));		
		
		return imports;
	}

	@Override
	public boolean isNullable() {
		return this.nullable == null;
	}

	@Override
	public String getImplementation(String finder) {
		String implementation = "";
		if (isNullable()) {
			implementation = String.format(
					FinderMethodImplementations.getInstance().getImplementations().get("simpleImplementation"),
					this.returnType, finder, this.name);
		} else {
			implementation = String.format(
					FinderMethodImplementations.getInstance().getImplementations().get("simpleImplementation_non-null"),
					this.returnType, finder, this.name);
		}
		return implementation;
	}

}
