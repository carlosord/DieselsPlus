package uo.diesels.model.generator.business.util.classes.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.businessDsl.AllModelTypeCollection;
import uo.diesels.model.businessDsl.CollectionReturnType;
import uo.diesels.model.businessDsl.DefVariable;
import uo.diesels.model.businessDsl.DtoTypeCollection;
import uo.diesels.model.businessDsl.MethodCollectionReturn;
import uo.diesels.model.businessDsl.SimpleTypeCollection;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.util.Transformer;
import uo.diesels.model.generator.common.classes.variables.DefaultAllModelTypeCollectionVariableClass;
import uo.diesels.model.generator.common.classes.variables.DefaultDtoTypeCollectionVariableClass;
import uo.diesels.model.generator.common.classes.variables.DefaultSimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.persistenceDsl.Finder;

public class FinderUserMethodCollectionReturnClass extends ServiceMethodClass {

	private CollectionReturnType returnType;
	private List<BusinessVariableDefinition> parameters;
	private Finder finder;

	public FinderUserMethodCollectionReturnClass(MethodCollectionReturn m) {
		super(m.getName(), m.getKeyword());
		this.returnType = m.getReturnType();
		this.finder = m.getFinder();
		transformParameters(m.getParameters());
	}
	
	private void transformParameters(EList<DefVariable> parameters) {
		this.parameters = new ArrayList<>();
		for (DefVariable p: parameters) {
			this.parameters.add(Transformer.transform(p));
		}
	}

	public CollectionReturnType getReturnType() {
		return returnType;
	}

	public void setReturnType(CollectionReturnType returnType) {
		this.returnType = returnType;
	}

	public List<BusinessVariableDefinition> getParameters() {
		return parameters;
	}

	public void setParameters(List<BusinessVariableDefinition> parameters) {
		this.parameters = parameters;
	}

	public Finder getFinder() {
		return finder;
	}

	public void setFinder(Finder finder) {
		this.finder = finder;
	}

	@Override
	public Set<String> getImports(String project, String flag, String service) {
		Set<String> imports = super.getImports(project, flag, service);
		
		imports.add(String.format(
				ImportConstants.BUSINESS_EXCEPTION_IMPORT, project));
		
		if (flag.equals("impl") && this.keyword == null)
			imports.add(String.format(ImportConstants.SERVICE_IMPL_COMMAND_IMPORT,
					project, service, StringUtils.toUpperFirst(this.name) + "Command"));
		
		if (flag.equals("src")) 
			imports.add(String.format(ImportConstants.SERVICE_COMMAND_IMPORT, project));
		
		// Retorno
		if (this.returnType instanceof AllModelTypeCollection) {
			AllModelTypeCollection returnVar = (AllModelTypeCollection) this.returnType;
			DefaultAllModelTypeCollectionVariableClass var =
					new DefaultAllModelTypeCollectionVariableClass(returnVar.getCollection(),
							returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		} else if (this.returnType instanceof DtoTypeCollection) {
			DtoTypeCollection returnVar = (DtoTypeCollection) this.returnType;
			DefaultDtoTypeCollectionVariableClass var =
					new DefaultDtoTypeCollectionVariableClass("List", returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		} else { // Instancia de SimpleTypeCollection
			SimpleTypeCollection returnVar = (SimpleTypeCollection) this.returnType;
			DefaultSimpleTypeCollectionVariableClass var =
					new DefaultSimpleTypeCollectionVariableClass(returnVar.getCollection(),
							returnVar.getType(), "");
			imports.addAll(var.getVariableImports(project));
		}
		
		// Parámetros
		for (BusinessVariableDefinition v: this.parameters) {
			imports.addAll(v.getVariableImports(project));
		}
		
		// Finder
		if (this.finder != null && flag.equals("impl")) {
			imports.add(String.format(ImportConstants.FINDER_PERSISTENCE_PACKAGE_IMPORT, project, this.finder.getName()));
		}
		
		return imports;
	}
	
	@Override
	public String getMethodReturnType() {
		String ret;
		if (this.returnType instanceof AllModelTypeCollection) {
			AllModelTypeCollection returnVar = (AllModelTypeCollection) this.returnType;
			ret = returnVar.getCollection() + "<" + returnVar.getType().getName() + ">";
		} else if (this.returnType instanceof DtoTypeCollection) {
			DtoTypeCollection returnVar = (DtoTypeCollection) this.returnType;
			ret = "List<" + returnVar.getType().getName() + ">";
		} else { // Instancia de SimpleTypeCollection
			SimpleTypeCollection returnVar = (SimpleTypeCollection) this.returnType;
			ret = returnVar.getCollection() + "<" + returnVar.getType() + ">";
		}
		return ret;
	}
	
	@Override
	public String getMethodFinderName() {
		return this.finder.getName();
	}

	@Override
	public List<BusinessVariableDefinition> getMethodParameters() {
		return this.parameters;
	}
	
	@Override
	public String parametersToServiceMethod() {
		String parameters = "";
		for (BusinessVariableDefinition v: this.parameters) {
			parameters += v.getVariableName() + ", ";
		}
		return StringUtils.removeLastChar(parameters);
	}

}
