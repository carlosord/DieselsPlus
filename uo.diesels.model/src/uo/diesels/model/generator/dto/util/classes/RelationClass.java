package uo.diesels.model.generator.dto.util.classes;

import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;

public class RelationClass {
	
	private String name;
	private DtoEntity type;

	public RelationClass(Relation var) {
		this.name = var.getName();
		transformType(var.getType());
	}
	
	private void transformType(uo.diesels.model.modelDsl.Entity se) {
		if (se instanceof SimpleEntity) {
			this.type = new SimpleEntityClass((SimpleEntity) se);
		} else { // Instancia de AssociativeEntity)
			this.type = new AssociativeEntityClass((AssociativeEntity) se);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DtoEntity getType() {
		return type;
	}

	public void setType(DtoEntity type) {
		this.type = type;
	}

}
