package uo.diesels.model.generator.business.util.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BusinessMethodImplementations {

	private static BusinessMethodImplementations instance;
	private Map<String, String> implementations;
	
	private BusinessMethodImplementations() {
		initializeImplementationsMap();
	}
	
	public static BusinessMethodImplementations getInstance() {
		if (instance == null) {
			instance = new BusinessMethodImplementations();
		}
		return instance;
	}
	
	private void initializeImplementationsMap() {
		this.implementations = new HashMap<>();
		implementations.put("save", "Jpa.getEntityManager().persist(%s);");
		implementations.put("update", "Jpa.getEntityManager().merge(%s);");
		implementations.put("delete", "Jpa.getEntityManager().remove(%s);");
		implementations.put("find", "Jpa.getEntityManager().find(%s, %s);");
		
		implementations.put("finder", "%s.%s(%s);");
	}
	
	public Map<String, String> getImplementations() {
		return Collections.unmodifiableMap(implementations);
	}
	
}
