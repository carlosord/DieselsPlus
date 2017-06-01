package uo.diesels.model.generator.model.util.classes.methods;

import java.util.Set;

import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.MethodSimpleReturn;

public class MethodSimpleReturnClass extends ModelMethodClass {
	
	private String returnType;
	
	public MethodSimpleReturnClass(MethodSimpleReturn m) {
		super(m.getName(), m.getParameters());
		this.returnType = m.getReturnType();
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	@Override
	public String getMethodReturnType() {
		return this.returnType;
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);
		
		if (this.returnType.equals("Date"))
			imports.add(ImportConstants.DATE_IMPORT);
		
		return imports;		
	}

}
