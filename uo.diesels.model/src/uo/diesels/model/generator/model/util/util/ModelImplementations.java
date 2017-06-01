package uo.diesels.model.generator.model.util.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ModelImplementations {

	private static ModelImplementations instance;
	private Map<String, String> implementations;
	
	private ModelImplementations() {
		initializeImplementationsMap();
	}
	
	public static ModelImplementations getInstance() {
		if (instance == null) {
			instance = new ModelImplementations();
		}
		return instance;
	}
	
	private void initializeImplementationsMap() {
		this.implementations = new HashMap<>();
		implementations.put("List", " = new ArrayList<>()");
		implementations.put("Set", " = new HashSet<>()");
	}
	
	public Map<String, String> getImplementations() {
		return Collections.unmodifiableMap(implementations);
	}
	
}
