package uo.diesels.model.generator.dto.util.classes;

import java.util.ArrayList;
import java.util.List;

import uo.diesels.model.generator.common.elements.DefaultSimpleEntityClass;
import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.util.Transformer;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.DefIdAttribute;
import uo.diesels.model.modelDsl.SimpleEntity;


public class SimpleEntityClass extends DefaultSimpleEntityClass implements DtoEntity {

	private List<DtoVariableDefinition> primaryKey;
	private List<DtoVariableDefinition> attributes;
	
	public SimpleEntityClass(SimpleEntity se) {
		super(se.getName(), se.getSuperClass() != null ? 
				new SimpleEntityClass(se.getSuperClass()) : null);
		transformIdAttributes(se.getAttributesId());
		transformAttributes(se.getAttributes());
	}
	
	private void transformIdAttributes(List<DefIdAttribute> variables) {
		this.primaryKey = new ArrayList<>();
		for (DefIdAttribute v: variables)
			this.primaryKey.add(Transformer.transform(v));
	}
	
	private void transformAttributes(List<DefAttribute> variables) {
		this.attributes = new ArrayList<>();
		for (DefAttribute v: variables)
			attributes.add(Transformer.transform(v));
	}

	public List<DtoVariableDefinition> getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(List<DtoVariableDefinition> primaryKey) {
		this.primaryKey = primaryKey;
	}

	public List<DtoVariableDefinition> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<DtoVariableDefinition> attributes) {
		this.attributes = attributes;
	}
	
	public SimpleEntityClass getSuperClass() {
		return (SimpleEntityClass) superClass;
	}

	@Override
	public List<DtoVariableDefinition> getAllAttributes() {
		List<DtoVariableDefinition> vars = new ArrayList<>();
		
		if (this.superClass != null)
			vars.addAll(getSuperClass().getAllAttributes());
		else
			vars.add(new SimpleVariableClass("id", "Long"));
		
		for (DtoVariableDefinition v: this.primaryKey) {
			if (v instanceof LinkVariableClass) {
				vars.addAll(((LinkVariableClass) v).getVariables());
			} else {
				vars.add(v);
			}
		}
		
		vars.addAll(this.attributes);
		
		return vars;
	}
	
	@Override
	public String getDtoAssemblerParameters(String entity) {
		StringBuilder sb = new StringBuilder();
		
		if (this.superClass != null)
			sb.append(getSuperClass().getDtoAssemblerParameters(entity));
		else
			sb.append(entity + ".getId(), ");
		
		for (DtoVariableDefinition v: this.primaryKey) {
			if (v instanceof LinkVariableClass) {
				sb.append(((LinkVariableClass) v).getVariablesToAssembler(entity, v.getVariableName()));
			} else {
				sb.append(entity + ".get" + StringUtils.toUpperFirst(v.getVariableName()) + "(), ");
			}
		}
		
		for (DtoVariableDefinition v: this.attributes) {
			sb.append(entity + ".get" + StringUtils.toUpperFirst(v.getVariableName()) + "(), ");
		}
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "SimpleEntityClass [name=" + name + ", superClass=" + superClass + ", primaryKey=" + primaryKey
				+ ", attributes=" + attributes + "]";
	}

}
