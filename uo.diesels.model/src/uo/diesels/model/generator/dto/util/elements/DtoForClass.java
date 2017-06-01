package uo.diesels.model.generator.dto.util.elements;

import java.util.List;
import java.util.Set;

import uo.diesels.model.dtoDsl.DtoFor;
import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.classes.AssociativeEntityClass;
import uo.diesels.model.generator.dto.util.classes.SimpleEntityClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.SimpleEntity;

public class DtoForClass extends DtoClass {

	private DtoEntity entity;

	public DtoForClass(DtoFor d) {
		super(d.getName());
		if (d.getEntity() instanceof SimpleEntity)
			this.entity = new SimpleEntityClass((SimpleEntity) d.getEntity());
		else
			this.entity = new AssociativeEntityClass((AssociativeEntity) d.getEntity());
	}

	public DtoEntity getEntity() {
		return entity;
	}

	public void setEntity(DtoEntity entity) {
		this.entity = entity;
	}

	@Override
	public List<DtoVariableDefinition> getAttributes() {
		return this.entity.getAllAttributes();
	}
	
	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = super.getImports(project);

		imports.add(ImportConstants.OBJECTS_IMPORT);
		
		for (DtoVariableDefinition v: this.entity.getAllAttributes()) {
			imports.addAll(v.getVariableImports(project));
		}
		
		return imports;
	}

}
