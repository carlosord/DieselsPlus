package uo.diesels.model.generator.persistence.util.classes.methods;

import java.util.Set;

import uo.diesels.model.dtoDsl.Dto;
import uo.diesels.model.generator.persistence.util.util.FinderMethodImplementations;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.persistenceDsl.MethodDtoReturn;

public class MethodDtoReturnClass extends FinderMethodClass {
	
	private Dto returnType;
	private String nullable;

	public MethodDtoReturnClass() {}
	
	public MethodDtoReturnClass(MethodDtoReturn m) {
		super(m.getName(), m.getParameters());
		this.returnType = m.getReturnType();
		this.nullable = m.getNullable();
	}

	public Dto getReturnType() {
		return returnType;
	}

	public void setReturnType(Dto returnType) {
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
		return this.returnType.getName();
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);

		if (isNullable())
			imports.add(String.format(ImportConstants.QUERY_UTILS_IMPORT, project));

		// Retorno
		imports.add(String.format(
				ImportConstants.DTO_PACKAGE_IMPORT, project, this.returnType.getName()));	

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
					FinderMethodImplementations.getInstance().getImplementations().get("classImplementation"),
					finder, this.name, this.returnType.getName());
		} else {
			implementation = String.format(
					FinderMethodImplementations.getInstance().getImplementations().get("classImplementation_non-null"),
					finder, this.name, this.returnType.getName());
		}
		return implementation;
	}

}
