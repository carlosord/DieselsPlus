package uo.diesels.model.generator.common.elements;

import uo.diesels.model.generator.common.DefaultEntity;

public class DefaultEntityClass implements DefaultEntity {
	
	public final static int ANNOTATION = 0;
	public final static int ANNOTATION_IMPORT = 1;
	
	protected String name;
	
	public DefaultEntityClass() {}
	
	public DefaultEntityClass(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getEntityName() {
		return this.name;
	}

}
