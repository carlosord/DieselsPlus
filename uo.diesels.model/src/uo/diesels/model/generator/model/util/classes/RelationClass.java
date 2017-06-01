package uo.diesels.model.generator.model.util.classes;

import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.RelationDefinition;
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleEntityClass;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Entity;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;

public class RelationClass implements RelationDefinition {
	
	private String name;
	private ModelEntity type;
	private String navigable;
	private String multiplicity;

	public RelationClass(Relation var) {
		this.name = var.getName();
		transformType(var.getType());
		this.navigable = var.getNavigable();
		this.multiplicity = var.getMultiplicity();
	}
	
	private void transformType(Entity se) {
		if (se instanceof SimpleEntity)
			this.type = new SimpleEntityClass((SimpleEntity) se, false);
		if (se instanceof AssociativeEntity)
			this.type = new AssociativeEntityClass((AssociativeEntity) se);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ModelEntity getType() {
		return type;
	}

	public void setType(ModelEntity type) {
		this.type = type;
	}

	public String getNavigable() {
		return navigable;
	}

	public void setNavigable(String navigable) {
		this.navigable = navigable;
	}

	public String getMultiplicity() {
		return multiplicity;
	}

	public void setMultiplicity(String multiplicity) {
		this.multiplicity = multiplicity;
	}

	@Override
	public boolean isNavigable() {
		return (this.navigable == null || this.navigable.equals("navigable"));
	}
	
	@Override
	public boolean isOptional() {
		return !this.multiplicity.equals("one-one");
	}

}
