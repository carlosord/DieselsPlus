package uo.diesels.model.generator.model.util.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JPAAnnotations {
	
	private static JPAAnnotations instance;
	private Map<String, String[]> annotations;
	
	private JPAAnnotations() {
		initializeAnnotationsMap();
	}
	
	public static JPAAnnotations getInstance() {
		if (instance == null) {
			instance = new JPAAnnotations();
		}
		return instance;
	}
	
	private void initializeAnnotationsMap() {
		this.annotations = new HashMap<>();
		annotations.put("embeddable", new String[] {"@Embeddable", "import javax.persistence.Embeddable;"});
		annotations.put("embedded", new String[] {"@Embedded", "import javax.persistence.Embedded;"});
		annotations.put("enumerated", new String[] {"@Enumerated", "import javax.persistence.Enumerated;"});
		annotations.put("entity", new String[] {"@Entity", "import javax.persistence.Entity;"});
		annotations.put("mappedSuperclass", new String[] {"@MappedSuperclass", "import javax.persistence.MappedSuperclass;"});
		annotations.put("table", new String[] {"@Table", "import javax.persistence.Table;"});
		annotations.put("idClass", new String[] {"@IdClass(%sKey.class)", "import javax.persistence.IdClass;"});
		annotations.put("id", new String[] {"@Id", "import javax.persistence.Id;"});
		annotations.put("column", new String[] {"@Column(name = \"%s\", nullable = %s)", "import javax.persistence.Column;"});
		annotations.put("elementCollection", new String[] {"@ElementCollection", "import javax.persistence.ElementCollection;"});
		annotations.put("uniqueConstraint", new String[] {"@UniqueConstraint", "import javax.persistence.UniqueConstraint;"});
		annotations.put("inheritance", new String[] {"@Inheritance(strategy = InheritanceType.JOINED)", "import javax.persistence.Inheritance;"});
		annotations.put("inheritanceType", new String[] {"", "import javax.persistence.InheritanceType;"});
		annotations.put("lob", new String[] {"@Lob", "import javax.persistence.Lob;"});
		
		annotations.put("temporal", new String[] {"@Temporal(value = TemporalType.TIMESTAMP)", "import javax.persistence.Temporal;"});
		annotations.put("temporalType", new String[] {"", "import javax.persistence.TemporalType;"});
		
		annotations.put("manytomany", new String[] {"@ManyToMany", "@ManyToMany(mappedBy = \"%s\")", "import javax.persistence.ManyToMany;"});
		annotations.put("manytoone", new String[] {"@ManyToOne(optional = %s)", "import javax.persistence.ManyToOne;"});
		annotations.put("onetoone", new String[] {"@OneToOne(optional = %s)", "import javax.persistence.OneToOne;"});
		annotations.put("onetomany", new String[] {"@OneToMany(mappedBy = \"%s\")", "import javax.persistence.OneToMany;"});
		
		annotations.put("attributeOverrides", new String[] {"@AttributeOverrides", "import javax.persistence.AttributeOverrides;"});
		annotations.put("attributeOverride", new String[] {"@AttributeOverride(name = \"%s\", column = @Column(name = \"%s\", nullable = %s))", "import javax.persistence.AttributeOverride;"});
	}
	
	public Map<String, String[]> getAnnotations() {
		return Collections.unmodifiableMap(annotations);
	}

}
