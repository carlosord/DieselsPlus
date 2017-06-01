package uo.diesels.model.generator.persistence.util.classes.methods;

import java.util.Set;

import uo.diesels.model.generator.persistence.util.util.FinderMethodImplementations;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.Entity;
import uo.diesels.model.persistenceDsl.MethodEntityReturn;

public class MethodEntityReturnClass extends FinderMethodClass {

	private Entity returnType;
	private String nullable;

	public MethodEntityReturnClass(MethodEntityReturn m) {
		super(m.getName(), m.getParameters());
		this.returnType = m.getReturnType();
		this.nullable = m.getNullable();
	}

	public Entity getReturnType() {
		return returnType;
	}

	public void setReturnType(Entity returnType) {
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
				ImportConstants.MODEL_PACKAGE_IMPORT, project, this.returnType.getName()));	

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
