package uo.diesels.model.generator.dto.util.classes;

import java.util.ArrayList;
import java.util.List;

import uo.diesels.model.generator.common.elements.DefaultAssociativeEntityClass;
import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.Link;
import uo.diesels.model.generator.dto.util.util.Transformer;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;

public class AssociativeEntityClass extends DefaultAssociativeEntityClass implements DtoEntity, Link {

	private List<Relation> relations;
	private List<DtoVariableDefinition> attributes;
	
	public AssociativeEntityClass(AssociativeEntity ae) {
		super(ae.getName());
		this.relations = ae.getRelations();
		transformAttributes(ae.getAttributes());
	}
	
	private void transformAttributes(List<DefAttribute> variables) {
		this.attributes = new ArrayList<>();
		for (DefAttribute v: variables)
			attributes.add(Transformer.transform(v));
	}

	public List<Relation> getRelations() {
		return this.relations;
	}

	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}

	public List<DtoVariableDefinition> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<DtoVariableDefinition> attributes) {
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
		AssociativeEntityClass other = (AssociativeEntityClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AssociativeEntityClass [name=" + name + ", relations=" + relations + ", attributes=" + attributes
				+ "]";
	}

	@Override
	public List<DtoVariableDefinition> getAllAttributes() {
		List<DtoVariableDefinition> vars = new ArrayList<>();
		
		for (Relation r: this.relations) {
			if (r.getType() instanceof SimpleEntity) {
				vars.add(new SimpleVariableClass(r.getName() + "Id", "Long"));
			} else { // Instance of AssociativeEntity
				vars.addAll(getRelationIdVariables("",
					new AssociativeEntityClass((AssociativeEntity) r.getType())));
			}
		}
		
		vars.addAll(attributes);
		
		return vars;
	}
	
	@Override
	public String getDtoAssemblerParameters(String entity) {
		StringBuilder sb = new StringBuilder();
		
		for (Relation r: this.relations) {
			if (r.getType() instanceof SimpleEntity) {
				sb.append(StringUtils.toLowerFirst(this.name) + ".get" + StringUtils.toUpperFirst(r.getName()) + "().getId(), ");
			} else { // Instance of AssociativeEntity
				sb.append(getRelationIdVariablesToParameters("",
					new AssociativeEntityClass((AssociativeEntity) r.getType()), r.getName()));
			}
		}
		
		for (DtoVariableDefinition v: this.attributes) {
			sb.append(StringUtils.toLowerFirst(this.name) + ".get" + StringUtils.toUpperFirst(v.getVariableName()) + "(), ");
		}
		
		return sb.toString();
	}
	
	private String getRelationIdVariablesToParameters(String getter, AssociativeEntityClass e, String relationName) {
		StringBuilder sb = new StringBuilder();
		String preName = ".get" + StringUtils.toUpperFirst(relationName) + "()" + getter;
		for (Relation r: e.getRelations()) {
			if (r.getType() instanceof SimpleEntity) {
				sb.append(StringUtils.toLowerFirst(this.name) + preName + ".get" + StringUtils.toUpperFirst(r.getName()) + "().getId(), ");
			} else { // Instance of AssociativeEntity
				sb.append(getRelationIdVariablesToParameters(preName, new AssociativeEntityClass((AssociativeEntity) r.getType()), r.getName()));
			}
		}
		return sb.toString();
	}
	
	public String getRelationIdVariablesToGetters(String getter, AssociativeEntityClass e, String relationName, String entity) {
		StringBuilder sb = new StringBuilder();
		String preName = ".get" + StringUtils.toUpperFirst(relationName) + "()" + getter;
		for (Relation r: e.getRelations()) {
			if (r.getType() instanceof SimpleEntity) {
				sb.append(entity + preName + ".get" + StringUtils.toUpperFirst(r.getName()) + "().getId(), ");
			} else { // Instance of AssociativeEntity
				sb.append(getRelationIdVariablesToGetters(preName, new AssociativeEntityClass((AssociativeEntity) r.getType()), r.getName(), entity));
			}
		}
		return sb.toString();
	}
	
	@Override
	public List<DtoVariableDefinition> getRelationIdVariables(String entityName, AssociativeEntityClass e) {
		String preName = e.getName() + entityName;
		List<DtoVariableDefinition> vars = new ArrayList<>();
		for (Relation r: e.getRelations()) {
			if (r.getType() instanceof SimpleEntity) {
				vars.add(new SimpleVariableClass(StringUtils.toLowerFirst(preName) + StringUtils.toUpperFirst(r.getName()) + "Id", "Long"));
			} else { // Instance of AssociativeEntity
				vars.addAll(getRelationIdVariables(preName, new AssociativeEntityClass((AssociativeEntity) r.getType())));
			}
		}
		return vars;
	}

}
