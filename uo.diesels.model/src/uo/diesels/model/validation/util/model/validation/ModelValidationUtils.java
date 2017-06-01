package uo.diesels.model.validation.util.model.validation;

import java.util.List;

import uo.diesels.model.modelDsl.SimpleEntity;

public class ModelValidationUtils {
	
	public static boolean entityHasId(SimpleEntity entity) {
		return !(entity.getAttributesId().isEmpty() &&
				(entity.getSuperClass() == null || !entityHasId(entity.getSuperClass())));
	}
	
	public static boolean entityIsSuperClass(List<SimpleEntity> entities, String entityName) {
		for (SimpleEntity e: entities) {
			if (e.getSuperClass() != null && e.getSuperClass().getName().equals(entityName)) {
				return true;
			}
		}
		return false;
	}

	public static boolean entityHasUniqueId(SimpleEntity entity) {
	  	return !(!entity.getAttributesId().isEmpty() && 
	  			(entity.getSuperClass() != null && entityHasId(entity.getSuperClass())));
	}

}
