package uo.diesels.model.generator.model.util.classes.methods;

import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.AllModelType;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.MethodAllModelReturn;
import uo.diesels.model.modelDsl.ValueType;

public class MethodAllModelReturnClass extends ModelMethodClass {

	private AllModelType returnType;

	public MethodAllModelReturnClass(MethodAllModelReturn m) {
		super(m.getName(), m.getParameters());
		this.returnType = m.getReturnType();
	}

	public AllModelType getReturnType() {
		return returnType;
	}

	public void setReturnType(AllModelType returnType) {
		this.returnType = returnType;
	}

	@Override
	public String getMethodReturnType() {
		return this.returnType.getName();
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);
		
		// Retorno
		// Tipo de la variable
		if (this.returnType instanceof Enumerable) {
			imports.add(String.format(
					ImportConstants.MODEL_ENUM_PACKAGE_IMPORT,
					project, this.returnType.getName()));
		} else if (this.returnType instanceof ValueType) {
			imports.add(String.format(
					ImportConstants.MODEL_VALUE_TYPE_PACKAGE_IMPORT,
					project, this.returnType.getName()));
		} // Entity & AssociativeEntity estan en el mismo paquete y no requieren import

		return imports;
	}
	
}
