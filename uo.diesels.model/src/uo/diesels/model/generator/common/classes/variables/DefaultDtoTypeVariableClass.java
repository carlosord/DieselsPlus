package uo.diesels.model.generator.common.classes.variables;

import java.util.HashSet;
import java.util.Set;

import uo.diesels.model.dtoDsl.Dto;
import uo.diesels.model.generator.util.ImportConstants;

public class DefaultDtoTypeVariableClass extends DefaultVariableClass {
	
	protected Dto type;
	
	public DefaultDtoTypeVariableClass() {}
	
	public DefaultDtoTypeVariableClass(String name, Dto type) {
		super(name);
		this.type = type;
	}

	public Dto getType() {
		return type;
	}

	public void setType(Dto type) {
		this.type = type;
	}

	@Override
	public String getVariableType() {
		return this.type.getName();
	}

	@Override
	public Object getVariableTypeClass() {
		return this.type;
	}

	@Override
	public Set<String> getVariableImports(String project) {
		Set<String> imports = new HashSet<String>();
		
		imports.add(String.format(
				ImportConstants.DTO_PACKAGE_IMPORT, project, this.type.getName()));
		
		return imports;
	}

}
