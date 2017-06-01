package uo.diesels.model.generator.business.util.util;

import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.business.util.elements.ServiceClass;

public class BusinessUtils {

	public static boolean hasUserMethods(ServiceClass s) {
		for (BusinessMethod m: s.getMethods()) {
			if (m.getMethodKeyword() == null) {
				return true;
			}
		}
		return false;
	}
	
}
