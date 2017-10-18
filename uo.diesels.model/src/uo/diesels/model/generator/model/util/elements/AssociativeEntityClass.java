package uo.diesels.model.generator.model.util.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.common.elements.DefaultAssociativeEntityClass;
import uo.diesels.model.generator.model.util.ModelElement;
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.classes.variables.LinkVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.SimpleVariableClass;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.model.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.Method;
import uo.diesels.model.modelDsl.Relation;

public class AssociativeEntityClass extends DefaultAssociativeEntityClass implements ModelEntity, ModelElement {
	
	private List<RelationClass> relations;
	private List<ModelVariableDefinition> attributes;
	private List<ModelMethod> methods;
	private boolean abstractClass;
	
	public AssociativeEntityClass(AssociativeEntity ae) {
		super(ae.getName());
		this.abstractClass = isAbstract(ae);
		transformRelations(ae.getRelations());
		transformAttributes(ae.getAttributes());
		transformMethods(ae.getMethods());
	}
	
	private boolean isAbstract(AssociativeEntity se) {
		return !se.getMethods().isEmpty();
	}
	
	private void transformRelations(List<Relation> relations) {
		this.relations = new ArrayList<>();
		for (Relation v: relations)
			this.relations.add(Transformer.transform(v));
	}
	
	private void transformAttributes(List<DefAttribute> variables) {
		this.attributes = new ArrayList<>();
		for (DefAttribute v: variables)
			attributes.add(Transformer.transform(v));
	}
	
	private void transformMethods(List<Method> methods) {
		this.methods = new ArrayList<>();
		for (Method m: methods)
			this.methods.add(Transformer.transform(m));
	}

	public List<RelationClass> getRelations() {
		return relations;
	}

	public void setRelations(List<RelationClass> relations) {
		this.relations = relations;
	}

	public List<ModelVariableDefinition> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ModelVariableDefinition> attributes) {
		this.attributes = attributes;
	}

	public List<ModelMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<ModelMethod> methods) {
		this.methods = methods;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssociativeEntityClass other = (AssociativeEntityClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "AssociativeEntityClass [name=" + name + ", relations=" + relations + ", attributes=" + attributes
				+ ", methods=" + methods + "]";
	}
	
	@Override
	public String getClassName() {
		return abstractClass && isImplementable() ? "Base" + this.name : this.name;
	}
	
	@Override 
	public boolean isAbstractEntity() {
		return this.abstractClass;
	}
	
	@Override 
	public boolean isImplementable() {
		return this.abstractClass;
	}

	@Override
	public String getSuperClassName() {
		return "Base" + this.name;
	}

	@Override
	public List<ModelMethod> getSrcMethods() {
		return this.methods;
	}
	
	@Override
	public String getAnnotations() {
		StringBuilder sb = new StringBuilder();
		if (isAbstractEntity()) {
			sb.append(StringUtils.stringNewLine(
					JPAAnnotations.getInstance().getAnnotations().get("mappedSuperclass")[ANNOTATION]));
		} else {
			sb.append(StringUtils.stringNewLine(
					JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION]));
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION]);
			sb.append("(name = \"T_");
			sb.append(this.name.toUpperCase());
			sb.append("S\"");
			sb.append(", uniqueConstraints = @UniqueConstraint(columnNames = {");
			for (ModelVariableDefinition i: getIdVariables()) {
					sb.append("\"" + i.getVariableName() + "_id\"");
				if (!i.equals(getIdVariables().get(getIdVariables().size()-1)))
					sb.append(", ");
			}
			sb.append(StringUtils.stringNewLine("}))"));
		}
		sb.append(String.format(
				JPAAnnotations.getInstance().getAnnotations().get("idClass")[ANNOTATION], this.name));
		return sb.toString();
	}
	
	@Override
	public String getSrcAnnotations() {
		StringBuilder sb = new StringBuilder();
		sb.append(JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION]);
		sb.append(StringUtils.newLine());
		sb.append(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION]);
		sb.append("(name = \"T_");
		sb.append(this.name.toUpperCase());
		sb.append("S\"");
		sb.append(", uniqueConstraints = @UniqueConstraint(columnNames = {");
		for (ModelVariableDefinition i: getIdVariables()) {
			if (i instanceof LinkVariableClass)
				sb.append("\"" + i.getVariableName() + "_id\"");
			if (!i.equals(getIdVariables().get(getIdVariables().size()-1)))
				sb.append(", ");
		}
		sb.append("}))");
		
		return sb.toString();
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = new HashSet<>();
		
		imports.add(ImportConstants.GENERATED_ANNOTATION_IMPORT);
		imports.add(ImportConstants.SERIALIZABLE_IMPORT);
		
		if (isAbstractEntity()) {
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("mappedSuperclass")[ANNOTATION_IMPORT]);
		} else {
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION_IMPORT]);
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION_IMPORT]);
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("uniqueConstraint")[ANNOTATION_IMPORT]);
		}
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("idClass")[ANNOTATION_IMPORT]);
		imports.add(String.format(ImportConstants.MODEL_KEY_PACKAGE_IMPORT, project, this.name));
		imports.add(ImportConstants.OBJECTS_IMPORT);
		
		//Relaciones
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("id")[ANNOTATION_IMPORT]);
		
		for (ModelVariableDefinition v: this.attributes) {
			imports.addAll(v.getAnnotationImports());
			imports.addAll(v.getVariableImports(project));
		}
		
		for (ModelMethod m: this.methods) {
			imports.addAll(m.getImports(project));
		}
		
		return imports;
	}

	@Override
	public Set<String> getSrcImports(String project) {
		Set<String> imports = new HashSet<>();
		
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION_IMPORT]);
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION_IMPORT]);
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("uniqueConstraint")[ANNOTATION_IMPORT]);
		imports.add(ImportConstants.OBJECTS_IMPORT);
		
		for (ModelMethod m: this.methods) {
			imports.addAll(m.getImports(project));
		}
		
		return imports;
	}
	
	@Override
	public List<ModelVariableDefinition> getIdVariables() {
		List<ModelVariableDefinition> ids = new ArrayList<>();
		for (RelationClass r: this.relations) {
			ids.add(new SimpleVariableClass(r.getName(), r.getType().getEntityName()));
		}
		return ids;
	}

}
