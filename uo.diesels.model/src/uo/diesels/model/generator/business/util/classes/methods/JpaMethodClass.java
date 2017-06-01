package uo.diesels.model.generator.business.util.classes.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import uo.diesels.model.businessDsl.JpaMethod;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.classes.variables.SimpleVariableClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Entity;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;

public class JpaMethodClass extends ServiceMethodClass {
	
	private Entity entity;

	public JpaMethodClass(JpaMethod m) {
		super(m.getName(), m.getKeyword());
		this.entity = m.getEntity();
	}
	
	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	
	public String getEntityName() {
		return this.entity.getName();
	}
	
	@Override
	public Set<String> getImports(String project, String flag, String service) {
		Set<String> imports = super.getImports(project, flag, service);
		
		if (flag.equals("impl"))
			imports.add(String.format(
					ImportConstants.JPA_IMPORT, project));
		
		imports.add(String.format(
				ImportConstants.BUSINESS_EXCEPTION_IMPORT, project));
		
		imports.add(String.format(
				ImportConstants.MODEL_PACKAGE_IMPORT, project, this.entity.getName()));
		
		if ((this.keyword.equals("find") || (this.keyword.equals("delete"))) 
				&& this.entity instanceof AssociativeEntity
				&& flag.equals("impl")) {
			imports.add(String.format(
					ImportConstants.MODEL_KEY_PACKAGE_IMPORT, project, this.entity.getName()));
		}
		
		return imports;
	}
	
	@Override
	public String getMethodReturnType() {
		return this.keyword.equals("find") ? this.entity.getName() : "void";
	}
	
	@Override
	public List<BusinessVariableDefinition> getMethodParameters() {
		List<BusinessVariableDefinition> parameters = new ArrayList<>();
		String keyword = getMethodKeyword();
		if (keyword.equals("find") || keyword.equals("delete")) {
			if (this.entity instanceof SimpleEntity) {
				parameters.add(new SimpleVariableClass("id", "Long"));
			} else {
				for (Relation r: ((AssociativeEntity) this.entity).getRelations()) {
					parameters.add(new SimpleVariableClass(r.getName() + "_id", "Long"));
				}
			}
		} else { //Caso save o update
			parameters.add(new SimpleVariableClass(StringUtils.toLowerFirst(entity.getName()),
					entity.getName()));
		}
		return parameters;
	}

	@Override
	public String getMethodFinderName() {
		return null;
	}

	@Override
	public String parametersToServiceMethod() {
		String parameters = "";
		for (BusinessVariableDefinition v: getMethodParameters()) {
			parameters += v.getVariableName() + ", ";
		}
		return StringUtils.removeLastChar(parameters);
	}

}
