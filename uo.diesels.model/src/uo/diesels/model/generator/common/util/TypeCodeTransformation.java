package uo.diesels.model.generator.common.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TypeCodeTransformation {
	
	private static TypeCodeTransformation instance;
	private Map<String, String> types;
	
	private TypeCodeTransformation() {
		initializeTypesMap();
	}
	
	public static TypeCodeTransformation getInstance() {
		if (instance == null) {
			instance = new TypeCodeTransformation();
		}
		return instance;
	}
	
	private void initializeTypesMap() {
		this.types = new HashMap<>();
		types.put("Integer", "Integer");
		types.put("Long", "Long");
		types.put("Double", "Double");
		types.put("Float", "Float");
		types.put("Character", "Character");
		types.put("Boolean", "Boolean");
		types.put("Binary", "byte[]");
	}
	
	public String getTypeFor(String type) {
		String t = types.get(type);
		return t != null ? t : type;
	}
	
	public Map<String, String> getTypes() {
		return Collections.unmodifiableMap(types);
	}

}
