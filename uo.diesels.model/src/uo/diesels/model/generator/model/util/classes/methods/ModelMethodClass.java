package uo.diesels.model.generator.model.util.classes.methods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.generator.common.classes.methods.DefaultMethodClass;
import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.util.Transformer;
import uo.diesels.model.modelDsl.DefVariable;

public abstract class ModelMethodClass extends DefaultMethodClass implements ModelMethod {

	protected List<ModelVariableDefinition> parameters;

	public ModelMethodClass() {}
	
	public ModelMethodClass(String name, EList<DefVariable> parameters) {
		super(name);
		transformParameters(parameters);
	}

	private void transformParameters(EList<DefVariable> parameters) {
		this.parameters = new ArrayList<>();
		for (DefVariable v : parameters)
			this.parameters.add(Transformer.transform(v));
	}

	public List<ModelVariableDefinition> getParameters() {
		return parameters;
	}

	public void setParameters(List<ModelVariableDefinition> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public List<ModelVariableDefinition> getMethodParameters() {
		return parameters;
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = new HashSet<>();
		
		// Parámetros
		for (ModelVariableDefinition v: this.parameters) {
			imports.addAll(v.getVariableImports(project));
		}
		
		return imports;
	}

}
