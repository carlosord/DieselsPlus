package uo.diesels.model.generator.model.util.classes.methods;

import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeCollectionVariableClass;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.modelDsl.AllModelTypeCollection;
import uo.diesels.model.modelDsl.CollectionReturnType;
import uo.diesels.model.modelDsl.MethodCollectionReturn;
import uo.diesels.model.modelDsl.SimpleTypeCollection;

public class MethodCollectionReturnClass extends ModelMethodClass {
	
	private CollectionReturnType returnType;

	public MethodCollectionReturnClass(MethodCollectionReturn m) {
		super(m.getName(), m.getParameters());
		this.returnType = m.getReturnType();
	}

	public CollectionReturnType getReturnType() {
		return returnType;
	}

	public void setReturnType(CollectionReturnType returnType) {
		this.returnType = returnType;
	}

	@Override
	public String getMethodReturnType() {
		String ret;
		if (this.returnType instanceof AllModelTypeCollection) {
			AllModelTypeCollection returnVar = (AllModelTypeCollection) this.returnType;
			ret = returnVar.getCollection() + "<" + returnVar.getType().getName() + ">";
		} else { // Instancia de SimpleTypeCollection
			SimpleTypeCollection returnVar = (SimpleTypeCollection) this.returnType;
			ret = returnVar.getCollection() + "<" + returnVar.getType() + ">";
		}
		return ret;
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);
		
		// Retorno		
		if (this.returnType instanceof AllModelTypeCollection) {
			AllModelTypeCollection returnVar = (AllModelTypeCollection) this.returnType;
			DefaultAllModelTypeCollectionVariableClass var =
					new DefaultAllModelTypeCollectionVariableClass(returnVar.getCollection(),
							returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		} else { // Instancia de SimpleTypeCollection
			SimpleTypeCollection returnVar = (SimpleTypeCollection) this.returnType;
			DefaultSimpleTypeCollectionVariableClass var =
					new DefaultSimpleTypeCollectionVariableClass(returnVar.getCollection(),
							returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		}
		
		return imports;
	}

}
