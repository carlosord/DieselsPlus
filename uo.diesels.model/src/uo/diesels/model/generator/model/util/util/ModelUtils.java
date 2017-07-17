package uo.diesels.model.generator.model.util.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.generator.common.classes.variables.DefaultVariableClass;
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.elements.SimpleEntityClass;
import uo.diesels.model.generator.model.util.elements.ValueTypeClass;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.Enumerable;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.ValueType;

public class ModelUtils {

	public static boolean containsEnumerables(List<ModelVariableDefinition> variables) {
		for (ModelVariableDefinition v : variables) {
			if (v.getVariableTypeClass() instanceof Enumerable) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsValueTypes(List<ModelVariableDefinition> variables) {
		for (ModelVariableDefinition v : variables) {
			if (v.getVariableTypeClass() instanceof ValueType) {
				return true;
			}
		}
		return false;
	}
	
	public static RelationClass containsEntity(List<RelationClass> relations, ModelEntity e) {
		for (RelationClass r: relations) {
			if (r.getType().equals(e)) {
				return r;
			}
		}
		return null;
	}
	
	public static RelationClass containsEntityOrSuperClass(List<RelationClass> relations, SimpleEntityClass e) {
		for (RelationClass r: relations) {
			for (ModelEntity ent: getAllClassesFor(e)) {
				if (r.getType().equals(ent)) {
					return r;
				}
			}
		}
		return null;
	}
	
	public static Relation containsEntityOrSuperClass(EList<Relation> relations, SimpleEntityClass e) {
		for (Relation r: relations) {
			for (ModelEntity ent: getAllClassesFor(e)) {
				if (r.getType().getName().equals(ent.getEntityName())) {
					return r;
				}
			}
		}
		return null;
	}
	
	public static List<SimpleEntityClass> getAllClassesFor(SimpleEntityClass e) {
		List<SimpleEntityClass> entities = new ArrayList<>();
		entities.add(e);
		if (e.getSuperClass() != null)
			entities.addAll(getAllClassesFor(e.getSuperClass()));
		
		return entities;
	}
	
	public static RelationClass getOtherRelationFromLink(List<RelationClass> relations, ModelEntity e) {
		for (RelationClass r: relations) {
			if (!r.getType().equals(e)) {
				return r;
			}
		}
		return null;
	}

	public static boolean containsOtherValueTypeLike(List<ModelVariableDefinition> variables,
			ModelVariableDefinition value) {
		for (ModelVariableDefinition v : variables) {
			if (v.getVariableTypeClass() instanceof ValueType) {
				if (!v.equals(value) && v.getVariableType().equals(value.getVariableType())) {
					return true;
				}
			}
		}
		return false;
	}

	public static String putAttributeOverrideAnnotation(ValueTypeClass valueType, String attr,
			String col, boolean nullable, boolean id) {
		String result = "";
		List<ModelVariableDefinition> vars = valueType.getAttributes();
		for (ModelVariableDefinition a : vars) {
			if (a.getVariableTypeClass() instanceof ValueType) {
				String attrStarted = attr + a.getVariableName() + ".";
				String colStarted = col + a.getVariableName() + "_";
				result += putAttributeOverrideAnnotation(new ValueTypeClass((ValueType) a.getVariableTypeClass()), attrStarted, colStarted,
						nullable || a.isNullable(), id);
			} else {
				result += String.format(
						JPAAnnotations.getInstance().getAnnotations()
								.get("attributeOverride")[DefaultVariableClass.ANNOTATION],
						attr + a.getVariableName(), col + a.getVariableName(),
						(id ? false : nullable || a.isNullable())) + StringUtils.stringNewLine(",");
			}
		}
		return result;
	}
	
	public static String getAttributeOverrideAttributes(ValueTypeClass valueType, String col) {
		String result = "";
		List<ModelVariableDefinition> vars = valueType.getAttributes();
		for (ModelVariableDefinition a : vars) {
			if (a.getVariableTypeClass() instanceof ValueType) {
				String colStarted = col + a.getVariableName() + "_";
				result += getAttributeOverrideAttributes(new ValueTypeClass((ValueType) a.getVariableTypeClass()), colStarted);
			} else {
				result += "\"" +  col + a.getVariableName() + "\"" + ", ";
			}
		}
		return result;
	}
	
	public static String getCollectionType(String collection) {
		String type = collection;
        String pattern = ".*\\<(.*)\\>.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(collection);
        
        if (m.matches()) {
            type = m.group(1);
        }
        
        return type;
	}
	
	public static String getCollection(String collection) {
		String type = collection;
        String pattern = "(.*)\\<.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(collection);
        
        if (m.matches()) {
            type = m.group(1);
        }
        
        return type;
	}
	
	public static String getCollectionInitialize(String collection) {
		String type = collection;
        String pattern = "(.*)\\<.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(collection);
        
        if (m.matches()) {
            type = m.group(1);
        }
        
        if (type.equals("List"))
        	return " new ArrayList<>";
        else // type equals Set
        	return "new HashSet<>";
	}
	
	public static List<ModelVariableDefinition> getIdsFromSuperclass(SimpleEntityClass e) {
		List<ModelVariableDefinition> ids = new ArrayList<>();
		if (e.getSuperClass() != null) {
			ids.addAll(e.getSuperClass().getPrimaryKey());
			ids.addAll(getIdsFromSuperclass(e.getSuperClass()));
		}
		return ids;
	}

	public static boolean isReflexiveRelation(List<RelationClass> relations, SimpleEntityClass e) {
	  	return relations.get(0).getType().getClassName().equals(relations.get(1).getType().getClassName());
	}
	
}
