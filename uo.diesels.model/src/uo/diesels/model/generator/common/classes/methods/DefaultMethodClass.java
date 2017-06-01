package uo.diesels.model.generator.common.classes.methods;

import uo.diesels.model.generator.common.DefaultMethod;

public abstract class DefaultMethodClass implements DefaultMethod {
	
	protected String name;
	
	public DefaultMethodClass() {}
	
	public DefaultMethodClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getMethodName() {
		return this.name;
	}

}
