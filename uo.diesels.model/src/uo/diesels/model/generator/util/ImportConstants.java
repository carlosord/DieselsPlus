package uo.diesels.model.generator.util;

public class ImportConstants {
	
	// Imports del modelo
	public static final String MODEL_ENUM_PACKAGE_IMPORT = "import %s.model.enums.%s;";
	public static final String MODEL_VALUE_TYPE_PACKAGE_IMPORT = "import %s.model.valueTypes.%s;";
	public static final String MODEL_KEY_PACKAGE_IMPORT = "import %s.model.keys.%sKey;";
	public static final String MODEL_PACKAGE_IMPORT = "import %s.model.%s;";
	
	// Imports del negocio
	public static final String SERVICE_INTERFACE_IMPORT = "import %s.business.%s;";
	public static final String SERVICE_IMPL_IMPORT = "import %s.business.impl.%s;";
	public static final String SERVICE_COMMAND_IMPORT = "import %s.business.impl.Command;";
	public static final String SERVICE_IMPL_COMMAND_IMPORT = "import %s.business.impl.%s.%s;";
	public static final String BUSINESS_EXCEPTION_IMPORT = "import %s.model.exception.BusinessException;";
	
	// Imports de persistencia
	public static final String FINDER_PERSISTENCE_PACKAGE_IMPORT = "import %s.persistence.%s;";
	public static final String JPA_IMPORT = "import %s.persistence.util.Jpa;";
	public static final String QUERY_UTILS_IMPORT = "import %s.persistence.util.QueryUtils;";
	
	// Imports de los DTOs
	public static final String DTO_PACKAGE_IMPORT = "import %s.dto.%s;";
	
	// Otros imports	
	//HashCode y Equals
	public static final String OBJECTS_IMPORT = "import java.util.Objects;";
	
	//List, Map y Set
	public static final String LIST_IMPORT = "import java.util.List;";
	public static final String ARRAYLIST_IMPORT = "import java.util.ArrayList;";
		
	public static final String SET_IMPORT = "import java.util.Set;";
	public static final String HASHSET_IMPORT = "import java.util.HashSet;";
	
	//Date
	public static final String DATE_IMPORT = "import java.util.Date;";
	
	//Serializable
	public static final String SERIALIZABLE_IMPORT = "import java.io.Serializable;";
	
	//Generated
	public static final String GENERATED_ANNOTATION_IMPORT = "import javax.annotation.Generated;";

}
