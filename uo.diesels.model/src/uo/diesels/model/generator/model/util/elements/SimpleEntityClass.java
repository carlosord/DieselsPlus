package uo.diesels.model.generator.model.util.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.generator.common.elements.DefaultSimpleEntityClass;
import uo.diesels.model.generator.model.util.ModelElement;
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.model.util.util.ModelUtils;
import uo.diesels.model.generator.model.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.DefIdAttribute;
import uo.diesels.model.modelDsl.Link;
import uo.diesels.model.modelDsl.Method;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;
import uo.diesels.model.modelDsl.SimpleLink;
import uo.diesels.model.modelDsl.ValueType;

public class SimpleEntityClass extends DefaultSimpleEntityClass implements ModelEntity, ModelElement {

	private String implementation;
	private boolean abstractClass;
	private List<ModelVariableDefinition> primaryKey;
	private List<ModelVariableDefinition> attributes;
	private List<ModelMethod> methods;
	private boolean isSuperClass;

	public SimpleEntityClass(SimpleEntity se, boolean isSuperClass) {
		super(se.getName(), se.getSuperClass() != null ? new SimpleEntityClass(se.getSuperClass(), true) : null);
		this.abstractClass = isAbstract(se);
		this.implementation = se.getImplementation();
		transformIdVariables(se.getAttributesId());
		transformAttributes(se.getAttributes());
		transformMethods(se.getMethods());
		this.isSuperClass = isSuperClass;
	}

	private boolean isAbstract(SimpleEntity se) {
		return !se.getMethods().isEmpty() || (se.getSuperClass() != null && isAbstract(se.getSuperClass())
				&& !((SimpleEntityClass) this.superClass).isImplementable());
	}

	private void transformIdVariables(List<DefIdAttribute> variables) {
		this.primaryKey = new ArrayList<>();
		for (DefIdAttribute v : variables)
			this.primaryKey.add(Transformer.transform(v));
	}

	private void transformAttributes(List<DefAttribute> variables) {
		this.attributes = new ArrayList<>();
		for (DefAttribute v : variables)
			attributes.add(Transformer.transform(v));
	}

	private void transformMethods(List<Method> metodos) {
		this.methods = new ArrayList<>();
		for (Method m : metodos) {
			methods.add(Transformer.transform(m));
		}
	}

	public String getImplementation() {
		return implementation;
	}

	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}

	public List<ModelVariableDefinition> getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(List<ModelVariableDefinition> primaryKey) {
		this.primaryKey = primaryKey;
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

	public boolean isAbstractClass() {
		return abstractClass;
	}
	
	private List<ModelVariableDefinition> getAllVariables() {
		List<ModelVariableDefinition> allVariables = new ArrayList<>();
		allVariables.addAll(this.primaryKey);
		allVariables.addAll(this.attributes);
		
		return allVariables;
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
		SimpleEntityClass other = (SimpleEntityClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimpleEntityClass [name=" + name + ", superClass=" + superClass + ", primaryKey=" + primaryKey
				+ ", attributes=" + attributes + ", methods=" + methods + ", implementation=" + implementation
				+ ", abstractClass=" + abstractClass + "]";
	}

	@Override
	public SimpleEntityClass getSuperClass() {
		return (SimpleEntityClass) this.superClass;
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
		return this.implementation == null && this.abstractClass;
	}

	@Override
	public String getSuperClassName() {
		return "Base" + this.name;
	}

	@Override
	public List<ModelMethod> getSrcMethods() {
		List<ModelMethod> methods = new ArrayList<>();
		if (this.superClass != null && !getSuperClass().isImplementable()) {
			methods.addAll(getSuperClass().getSrcMethods());
		}
		methods.addAll(this.methods);
		return methods;
	}

	@Override
	public String getAnnotations() {
		StringBuilder sb = new StringBuilder();
		if (isAbstractEntity()) {
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("mappedSuperclass")[ANNOTATION]);
		} else {
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION]);
			if (this.isSuperClass) {
				sb.append(StringUtils.newLine());
				sb.append(JPAAnnotations.getInstance().getAnnotations().get("inheritance")[ANNOTATION]);
			}
			sb.append(StringUtils.newLine());
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION]);
			sb.append("(name = \"T_");
			sb.append(this.name.toUpperCase());
			sb.append("S\"");
			if (!this.primaryKey.isEmpty()) {
				sb.append(", uniqueConstraints = @UniqueConstraint(columnNames = {");
					for (ModelVariableDefinition i : getIdVariables()) {
					if (i.getVariableTypeClass() instanceof Link) {
						List<RelationClass> l = null;
						if (i.getVariableTypeClass() instanceof AssociativeEntity) {
							sb.append(StringUtils.removeLastChar(getAssociativeEntityIds(i.getVariableName(), "", ((AssociativeEntity) i.getVariableTypeClass()).getRelations())));
						} else {
							l = (new SimpleLinkClass((SimpleLink) i.getVariableTypeClass())).getRelations();
							if (this.superClass != null && 
									ModelUtils.containsEntityOrSuperClass(l,
											(SimpleEntityClass) this.superClass) != null) {
								sb.append("\"" + i.getVariableName() + "_unique_constraint_id\"");
							} else {
								sb.append("\"" + i.getVariableName() + "_id\"");
							}
						}
					} else if (i.getVariableTypeClass() instanceof ValueType) {
							if (ModelUtils.containsOtherValueTypeLike(getAllVariables(), i)) {
								sb.append(StringUtils.removeLastChar(ModelUtils.getAttributeOverrideAttributes(
										new ValueTypeClass((ValueType) i.getVariableTypeClass()), i.getVariableName() + "_")));
							} else {
								ValueTypeClass value = new ValueTypeClass((ValueType) i.getVariableTypeClass());
								for (ModelVariableDefinition v: value.getAttributes()) {
									sb.append("\"" + v.getVariableName() + "\"");
									if (!v.equals(value.getAttributes().
											get(value.getAttributes().size() - 1)))
										sb.append(", ");
								}
							}
					} else {
						sb.append("\"" + i.getVariableName() + "\"");
					} if (!i.equals(getIdVariables().get(getIdVariables().size() - 1)))
						sb.append(", ");
				}
				sb.append("})");
			}
			sb.append(")");
		}
		return sb.toString();
	}

	private String getAssociativeEntityIds(String entity, String name, EList<Relation> l) {
		StringBuilder sb = new StringBuilder();
		for (Relation r: l) {
			if (r.getType() instanceof AssociativeEntity) {
				getAssociativeEntityIds(entity, r.getType().getName() + "_", ((AssociativeEntity) r.getType()).getRelations());
			} else {
				if (this.superClass != null && 
						ModelUtils.containsEntityOrSuperClass(l,
								(SimpleEntityClass) this.superClass) != null) {
					sb.append("\"" + entity + "_unique_constraint_" + name +
								StringUtils.toLowerFirst(r.getType().getName()) + "_id\"");
				} else {
					sb.append("\"" + name +  
								StringUtils.toLowerFirst(r.getType().getName()) + "_id\"");
				}
				sb.append(", ");
			}
		}
		
		return sb.toString();
	}

	@Override
	public String getSrcAnnotations() {
		StringBuilder sb = new StringBuilder();
		sb.append(JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION]);
		if (this.isSuperClass) {
			sb.append(StringUtils.newLine());
			sb.append(JPAAnnotations.getInstance().getAnnotations().get("inheritance")[ANNOTATION]);
		}
		sb.append(StringUtils.newLine());
		sb.append(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION]);
		sb.append("(name = \"T_");
		sb.append(this.name.toUpperCase());
		sb.append("S\"");
		if (!this.primaryKey.isEmpty()) {
			sb.append(", uniqueConstraints = @UniqueConstraint(columnNames = {");
			for (ModelVariableDefinition i : getIdVariables()) {
				if (i.getVariableTypeClass() instanceof Link) {
					List<RelationClass> l = null;
					if (i.getVariableTypeClass() instanceof AssociativeEntity) {
						sb.append(StringUtils.removeLastChar(getAssociativeEntityIds(i.getVariableName(), "", ((AssociativeEntity) i.getVariableTypeClass()).getRelations())));
					} else {
						l = (new SimpleLinkClass((SimpleLink) i.getVariableTypeClass())).getRelations();
						if (this.superClass != null && 
								ModelUtils.containsEntityOrSuperClass(l,
										(SimpleEntityClass) this.superClass) != null) {
							sb.append("\"" + i.getVariableName() + "_unique_constraint_id\"");
						} else {
							sb.append("\"" + i.getVariableName() + "_id\"");
						}
					}
				} else if (i.getVariableTypeClass() instanceof ValueType) {
						if (ModelUtils.containsOtherValueTypeLike(getAllVariables(), i)) {
							sb.append(StringUtils.removeLastChar(ModelUtils.getAttributeOverrideAttributes(
									new ValueTypeClass((ValueType) i.getVariableTypeClass()), i.getVariableName() + "_")));
						} else {
							ValueTypeClass value = new ValueTypeClass((ValueType) i.getVariableTypeClass());
							for (ModelVariableDefinition v: value.getAttributes()) {
								sb.append("\"" + v.getVariableName() + "\"");
								if (!v.equals(value.getAttributes().
										get(value.getAttributes().size() - 1)))
									sb.append(", ");
							}
						}
				} else {
					sb.append("\"" + i.getVariableName() + "\"");
				} if (!i.equals(getIdVariables().get(getIdVariables().size() - 1)))
					sb.append(", ");
			}
			sb.append("})");
		}
		sb.append(")");

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
			if (!this.primaryKey.isEmpty())
				imports.add(JPAAnnotations.getInstance().getAnnotations().get("uniqueConstraint")[ANNOTATION_IMPORT]);
			if (this.isSuperClass) {
				imports.add(JPAAnnotations.getInstance().getAnnotations().get("inheritance")[ANNOTATION_IMPORT]);
				imports.add(JPAAnnotations.getInstance().getAnnotations().get("inheritanceType")[ANNOTATION_IMPORT]);
			}
		}

		if (!this.getIdVariables().isEmpty())
			imports.add(ImportConstants.OBJECTS_IMPORT);

		for (ModelVariableDefinition v : this.primaryKey) {
			imports.addAll(v.getAnnotationImports());
			imports.addAll(v.getVariableImports(project));
		}

		for (ModelVariableDefinition v : this.attributes) {
			imports.addAll(v.getAnnotationImports());
			imports.addAll(v.getVariableImports(project));
		}

		for (ModelMethod m : this.methods) {
			imports.addAll(m.getImports(project));
		}

		return imports;
	}

	@Override
	public Set<String> getSrcImports(String project) {
		Set<String> imports = new HashSet<>();

		imports.add(JPAAnnotations.getInstance().getAnnotations().get("entity")[ANNOTATION_IMPORT]);
		imports.add(JPAAnnotations.getInstance().getAnnotations().get("table")[ANNOTATION_IMPORT]);
		if (!this.primaryKey.isEmpty())
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("uniqueConstraint")[ANNOTATION_IMPORT]);
		if (this.isSuperClass) {
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("inheritance")[ANNOTATION_IMPORT]);
			imports.add(JPAAnnotations.getInstance().getAnnotations().get("inheritanceType")[ANNOTATION_IMPORT]);
		}

		if (!this.getIdVariables().isEmpty()) {
			imports.add(ImportConstants.OBJECTS_IMPORT);
			for (ModelVariableDefinition v: this.getIdVariables()) {
				imports.addAll(v.getVariableImports(project));
			}
		}

		for (ModelMethod m : this.methods) {
			imports.addAll(m.getImports(project));
		}

		return imports;
	}

	@Override
	public List<ModelVariableDefinition> getIdVariables() {
		if (this.primaryKey.isEmpty()) {
			return this.getSuperClass() != null ? this.getSuperClass().getIdVariables()
					: new ArrayList<ModelVariableDefinition>();
		} else {
			return this.primaryKey;
		}
	}

	public List<ModelVariableDefinition> getIdVariablesWithoutLink() {
		List<ModelVariableDefinition> ids = new ArrayList<>();
		for (ModelVariableDefinition v : this.primaryKey) {
			if (!(v.getVariableTypeClass() instanceof SimpleLink))
				ids.add(v);
		}
		if (ids.isEmpty() && this.getSuperClass() != null)
			ids.addAll(this.getSuperClass().getIdVariables());

		return ids;
	}

}
