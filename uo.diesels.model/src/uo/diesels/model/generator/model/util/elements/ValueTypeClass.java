package uo.diesels.model.generator.model.util.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.model.util.ModelElement;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.model.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.ValueType;

public class ValueTypeClass implements ModelElement {
	
	public final static int ANNOTATION = 0;
	public final static int ANNOTATION_IMPORT = 1;
	
	private String name;
	private List<ModelVariableDefinition> attributes;
	
	public ValueTypeClass(ValueType v) {
		this.name = v.getName();
		transformAttributes(v.getAttributes());
	}
	
	private void transformAttributes(List<DefAttribute> variables) {
		this.attributes = new ArrayList<>();
		for (DefAttribute v: variables)
			attributes.add(Transformer.transform(v));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ModelVariableDefinition> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ModelVariableDefinition> attributes) {
		this.attributes = attributes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValueTypeClass other = (ValueTypeClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ValueTypeClass [name=" + name + ", attributes=" + attributes + "]";
	}
	
	@Override
	public String getAnnotations() {
		return JPAAnnotations.getInstance().getAnnotations().get("embeddable")[ANNOTATION];
	}
	
	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = new HashSet<>();
		
		imports.add(ImportConstants.GENERATED_ANNOTATION_IMPORT);
		imports.add(ImportConstants.SERIALIZABLE_IMPORT);

		imports.add(JPAAnnotations.getInstance().getAnnotations().get("embeddable")[ANNOTATION_IMPORT]);
		imports.add(ImportConstants.OBJECTS_IMPORT);
		
		for (ModelVariableDefinition v: this.attributes) {
			imports.addAll(v.getAnnotationImports());
			imports.addAll(v.getVariableImports(project));
		}
		
		return imports;
	}

}
