package uo.diesels.model.generator.dto.util.elements;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.generator.dto.util.Dto;
import uo.diesels.model.generator.util.ImportConstants;

public abstract class DtoClass implements Dto {
	
	protected String name;

	public DtoClass() {}
	
	public DtoClass(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = new HashSet<>();
		
		imports.add(ImportConstants.GENERATED_ANNOTATION_IMPORT);
		imports.add(ImportConstants.SERIALIZABLE_IMPORT);
		imports.add(ImportConstants.OBJECTS_IMPORT);
		
		return imports;
	}

}
