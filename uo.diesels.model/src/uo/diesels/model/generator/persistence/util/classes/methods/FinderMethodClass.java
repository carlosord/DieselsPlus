package uo.diesels.model.generator.persistence.util.classes.methods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.generator.common.classes.methods.DefaultMethodClass;
import uo.diesels.model.generator.persistence.util.PersistenceMethod;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.generator.persistence.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.persistenceDsl.DefVariable;

public abstract class FinderMethodClass extends DefaultMethodClass implements PersistenceMethod {
	
	protected List<PersistenceVariableDefinition> parameters;
	
	public FinderMethodClass() {}
	
	public FinderMethodClass(String name, EList<DefVariable> parameters) {
		super(name);
		transformParameters(parameters);
	}
	
	private void transformParameters(EList<DefVariable> parameters) {
		this.parameters = new ArrayList<>();
		for(DefVariable p: parameters) {
			this.parameters.add(Transformer.transform(p));
		}
	}

	public List<PersistenceVariableDefinition> getParameters() {
		return parameters;
	}

	public void setParameters(List<PersistenceVariableDefinition> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public List<PersistenceVariableDefinition> getMethodParameters() {
		return this.parameters;
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = new HashSet<>();
		
		imports.add(String.format(ImportConstants.JPA_IMPORT, project));
		
		// Parámetros
		for (PersistenceVariableDefinition v: this.parameters) {
			imports.addAll(v.getVariableImports(project));
		}
		
		return imports;
	}

}
