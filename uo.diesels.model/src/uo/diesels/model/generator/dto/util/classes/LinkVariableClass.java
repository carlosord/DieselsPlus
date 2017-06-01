package uo.diesels.model.generator.dto.util.classes;

import java.util.ArrayList;
import java.util.List;

import uo.diesels.model.generator.common.classes.variables.DefaultLinkVariableClass;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.DefLinkVariable;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;
import uo.diesels.model.modelDsl.SimpleLink;

public class LinkVariableClass extends DefaultLinkVariableClass implements DtoVariableDefinition {

	private DtoEntity entity;

	public LinkVariableClass(DefLinkVariable var) {
		super(var.getName(), var.getType());
		transformEntity();
	}

	private void transformEntity() {
		List<Relation> relations;
		if (this.type instanceof AssociativeEntity) {
			relations = ((AssociativeEntity) this.type).getRelations();
		} else {
			relations = ((SimpleLink) this.type).getRelations();
		}

		for (Relation r : relations) {
			if (r.getName().equals(this.name)) {
				if (r.getType() instanceof SimpleEntity) {
					this.entity = new SimpleEntityClass((SimpleEntity) r.getType());
				}
			}
		}

		if (this.entity == null) {
			this.entity = new AssociativeEntityClass((AssociativeEntity) this.type);
		}
	}

	public List<DtoVariableDefinition> getVariables() {
		List<DtoVariableDefinition> vars = new ArrayList<>();
		if (this.entity instanceof AssociativeEntityClass) {
			vars.addAll(((AssociativeEntityClass) this.entity).getRelationIdVariables("",
					(AssociativeEntityClass) this.entity));
		} else {
			vars.add(new SimpleVariableClass(this.name, "Long"));
		}
		return vars;
	}
	
	public String getVariablesToAssembler(String entity, String variableName) {
		StringBuilder sb = new StringBuilder();
		
		if (this.entity instanceof AssociativeEntityClass) {
			sb.append(((AssociativeEntityClass) this.entity).getRelationIdVariablesToGetters("",
					(AssociativeEntityClass) this.entity, this.name, entity));
		} else {
			sb.append(entity + ".get" + StringUtils.toUpperFirst(variableName) + "().getId(), ");
		}
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "LinkVariableClass [name=" + name + ", type=" + type + ", entity=" + entity + "]";
	}

}
