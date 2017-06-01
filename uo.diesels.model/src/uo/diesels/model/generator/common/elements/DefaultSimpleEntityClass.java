package uo.diesels.model.generator.common.elements;

import uo.diesels.model.generator.common.DefaultEntity;

public class DefaultSimpleEntityClass extends DefaultEntityClass implements DefaultEntity {
	
	protected DefaultSimpleEntityClass superClass;
	
	public DefaultSimpleEntityClass() {}
	
	public DefaultSimpleEntityClass(String name, DefaultSimpleEntityClass superClass) {
		super(name);
		this.superClass = superClass;
	}

	public DefaultSimpleEntityClass getSuperClass() {
		return superClass;
	}

	public void setSuperClass(DefaultSimpleEntityClass superClass) {
		this.superClass = superClass;
	}

}
