package uo.diesels.model.generator.business.util.classes.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.businessDsl.DefVariable;
import uo.diesels.model.businessDsl.MethodDtoReturn;
import uo.diesels.model.dtoDsl.Dto;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.persistenceDsl.Finder;

public class FinderUserMethodDtoReturnClass extends ServiceMethodClass {

	private Dto returnType;
	private List<BusinessVariableDefinition> parameters;
	private Finder finder;

	public FinderUserMethodDtoReturnClass() {
	}

	public FinderUserMethodDtoReturnClass(MethodDtoReturn m) {
		super(m.getName(), m.getKeyword());
		this.returnType = m.getReturnType();
		this.finder = m.getFinder();
		transformParameters(m.getParameters());
	}

	private void transformParameters(EList<DefVariable> parameters) {
		this.parameters = new ArrayList<>();
		for (DefVariable p : parameters) {
			this.parameters.add(Transformer.transform(p));
		}
	}

	public Dto getReturnType() {
		return returnType;
	}

	public void setReturnType(Dto returnType) {
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

		imports.add(String.format(ImportConstants.BUSINESS_EXCEPTION_IMPORT, project));
		
		if (flag.equals("impl") && this.keyword == null)
			imports.add(String.format(ImportConstants.SERVICE_IMPL_COMMAND_IMPORT,
					project, service, StringUtils.toUpperFirst(this.name) + "Command"));

		if (flag.equals("src")) 
			imports.add(String.format(ImportConstants.SERVICE_COMMAND_IMPORT, project));
		
		// Retorno
		imports.add(String.format(ImportConstants.DTO_PACKAGE_IMPORT, project, this.returnType.getName()));

		// Parámetros
		for (BusinessVariableDefinition v : this.parameters) {
			imports.addAll(v.getVariableImports(project));
		}

		// Finder
		if (this.finder != null && flag.equals("impl")) {
			imports.add(String.format(ImportConstants.FINDER_PERSISTENCE_PACKAGE_IMPORT, project,
					this.finder.getName()));
		}

		return imports;
	}

	@Override
	public String getMethodReturnType() {
		return this.returnType.getName();
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
		for (BusinessVariableDefinition v : this.parameters) {
			parameters += v.getVariableName() + ", ";
		}
		return StringUtils.removeLastChar(parameters);
	}

}
