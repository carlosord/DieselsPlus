package uo.diesels.model.generator.dto.util.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import uo.diesels.model.dtoDsl.DefDtoAttribute;
import uo.diesels.model.dtoDsl.DtoEntity;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;

public class DtoEntityClass extends DtoClass {

	private List<DtoVariableDefinition> attributes;

	public DtoEntityClass(DtoEntity d) {
		super(d.getName());
		transformAttributes(d.getAttributes());
	}
	
	private void transformAttributes(List<DefDtoAttribute> variables) {
		this.attributes = new ArrayList<>();
		for (DefDtoAttribute v: variables)
			attributes.add(Transformer.transform(v));
	}

	public void setAttributes(List<DtoVariableDefinition> attributes) {
		this.attributes = attributes;
	}

	@Override
	public List<DtoVariableDefinition> getAttributes() {
		return this.attributes;
	}
	
	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);

		imports.add(ImportConstants.OBJECTS_IMPORT);
		
		for (DtoVariableDefinition v: this.attributes) {
			imports.addAll(v.getVariableImports(project));
		}
		
		return imports;
	}	

}
