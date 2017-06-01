package uo.diesels.model.generator.persistence.util.classes.methods;

import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeCollectionVariableClass;
import uo.diesels.model.generator.common.classes.variables.DefaultDtoTypeCollectionVariableClass;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.persistence.util.util.FinderMethodImplementations;
import uo.diesels.model.persistenceDsl.CollectionReturnType;
import uo.diesels.model.persistenceDsl.DtoReturnTypeCollection;
import uo.diesels.model.persistenceDsl.EntityReturnTypeCollection;
import uo.diesels.model.persistenceDsl.MethodCollectionReturn;
import uo.diesels.model.persistenceDsl.SimpleReturnTypeCollection;

public class MethodCollectionReturnClass extends FinderMethodClass {
	
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
		if (this.returnType instanceof EntityReturnTypeCollection) {
			EntityReturnTypeCollection returnVar = (EntityReturnTypeCollection) this.returnType;
			ret = "List<" + returnVar.getType().getName() + ">";
		} else if (this.returnType instanceof DtoReturnTypeCollection) {
			DtoReturnTypeCollection returnVar = (DtoReturnTypeCollection) this.returnType;
			ret = "List<" + returnVar.getType().getName() + ">";
		} else { // Instancia de SimpleTypeCollection
			SimpleReturnTypeCollection returnVar = (SimpleReturnTypeCollection) this.returnType;
			ret = "List<" + returnVar.getType() + ">";
		}
		return ret;
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);
		
		// Retorno		
		if (this.returnType instanceof EntityReturnTypeCollection) {
			EntityReturnTypeCollection returnVar = (EntityReturnTypeCollection) this.returnType;
			DefaultAllModelTypeCollectionVariableClass var =
					new DefaultAllModelTypeCollectionVariableClass("List", returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		} else if (this.returnType instanceof DtoReturnTypeCollection) {
			DtoReturnTypeCollection returnVar = (DtoReturnTypeCollection) this.returnType;
			DefaultDtoTypeCollectionVariableClass var =
					new DefaultDtoTypeCollectionVariableClass("List", returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		} else { // Instancia de SimpleTypeCollection
			SimpleReturnTypeCollection returnVar = (SimpleReturnTypeCollection) this.returnType;
			DefaultSimpleTypeCollectionVariableClass var =
					new DefaultSimpleTypeCollectionVariableClass("List", returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		}
		
		return imports;
	}

	@Override
	public boolean isNullable() {
		return true; // En realidad es false pero asi se ahorran complicaciones en la plantilla
	}

	@Override
	public String getImplementation(String finder) {
		String implementation = "";
		if (this.returnType instanceof EntityReturnTypeCollection) {
			implementation = String.format(FinderMethodImplementations.getInstance().getImplementations()
					.get("classImplementation_non-null"), finder, this.name,
					((EntityReturnTypeCollection) this.returnType).getType().getName());
		} else if (this.returnType instanceof DtoReturnTypeCollection) {
			implementation = String.format(FinderMethodImplementations.getInstance().getImplementations()
					.get("classImplementation_non-null"), finder, this.name,
					((DtoReturnTypeCollection) this.returnType).getType().getName());
		} else { // Instancia de SimpleTypeCollection
			implementation = String.format(FinderMethodImplementations.getInstance().getImplementations()
					.get("simpleListImplementation_non-null"), finder, this.name);
		}
		return implementation;
	}

}
