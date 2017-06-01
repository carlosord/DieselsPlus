package uo.diesels.model.generator.model.util.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.util.ModelImplementations;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.DefModelSimpleTypeCollectionVariable;

public class SimpleTypeCollectionVariableClass extends DefaultSimpleTypeCollectionVariableClass implements ModelVariableDefinition {
	
	public SimpleTypeCollectionVariableClass(DefModelSimpleTypeCollectionVariable var) {
		super(var.getType().getCollection(), var.getType().getType(), var.getName());
	}

	@Override
	public boolean isNullable() {
		return false;
	}

	@Override
	public String getAnnotations() {
		return JPAAnnotations.getInstance().getAnnotations().get("elementCollection")[ANNOTATION];
	}

	@Override
	public Set<String> getAnnotationImports() {
		Set<String> imports = new HashSet<String>();
		
		// Coleccion de la variable, inicialización solo en este caso
		if(this.collection.equals("List")) {
			imports.add(ImportConstants.ARRAYLIST_IMPORT);
		} else if (this.collection.equals("Set")) {
			imports.add(ImportConstants.HASHSET_IMPORT);
		}
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("elementCollection")[ANNOTATION_IMPORT]);

		return imports;
	}
	
	@Override
	public String isCollectionVariable() {
		return ModelImplementations.getInstance().getImplementations().get(this.collection);
	}

}
