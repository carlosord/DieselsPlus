package uo.diesels.model.generator.persistence.util.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FinderMethodImplementations {

	private static FinderMethodImplementations instance;
	private Map<String, String> implementations;
	
	private FinderMethodImplementations() {
		initializeImplementationsMap();
	}
	
	public static FinderMethodImplementations getInstance() {
		if (instance == null) {
			instance = new FinderMethodImplementations();
		}
		return instance;
	}
	
	private void initializeImplementationsMap() {
		this.implementations = new HashMap<>();
		implementations.put("classImplementation_non-null", "return Jpa.getEntityManager()\n\t.createNamedQuery(\"%s.%s\", %s.class)");
		implementations.put("classImplementation", "return QueryUtils.firstOrNull(\n\tJpa.getEntityManager()\n\t.createNamedQuery(\"%s.%s\", %s.class)");
		implementations.put("simpleImplementation_non-null", "return (%s) Jpa.getEntityManager()\n\t.createNamedQuery(\"%s.%s\")");
		implementations.put("simpleListImplementation_non-null", "return Jpa.getEntityManager()\n\t.createNamedQuery(\"%s.%s\")");
		implementations.put("simpleImplementation", "return (%s) QueryUtils.firstOrNull(\n\tJpa.getEntityManager()\n\t.createNamedQuery(\"%s.%s\")");
		implementations.put("param", "\t.setParameter(%d, %s)");
		implementations.put("resultList", "\t.getResultList()");
		implementations.put("singleResult", "\t.getSingleResult();");
	}
	
	public Map<String, String> getImplementations() {
		return Collections.unmodifiableMap(implementations);
	}
	
}
