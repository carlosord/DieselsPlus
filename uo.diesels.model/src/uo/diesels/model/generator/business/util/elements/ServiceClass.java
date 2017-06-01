package uo.diesels.model.generator.business.util.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uo.diesels.model.businessDsl.Service;
import uo.diesels.model.businessDsl.ServiceMethod;
import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.business.util.BusinessService;
import uo.diesels.model.generator.business.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.StringUtils;

public class ServiceClass implements BusinessService {
	
	private String name;
	private List<BusinessMethod> methods;

	public ServiceClass(Service s) {
		this.name = s.getName();
		this.methods = transform(s.getMethods());
	}

	private List<BusinessMethod> transform(List<ServiceMethod> methods) {
		List<BusinessMethod> serviceMethods = new ArrayList<>();
		for (ServiceMethod m: methods) {
			serviceMethods.add(Transformer.transform(m));
		}
		return serviceMethods;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BusinessMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<BusinessMethod> methods) {
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
		ServiceClass other = (ServiceClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServiceInterfaceClass [name=" + name + ", methods=" + methods + "]";
	}
	
	public String getImplName() {
		return this.name + "Impl"; 
	}
	
	@Override
	public Set<String> getImports(String project, String flag) {
		Set<String> imports = new HashSet<>();
		
		imports.add(ImportConstants.GENERATED_ANNOTATION_IMPORT);
		
		for (BusinessMethod m: this.methods) {
			imports.addAll(m.getImports(project, flag, StringUtils.toLowerFirst(this.name)));
		}
		
		if (flag.equals("impl"))
			imports.add(String.format(ImportConstants.SERVICE_INTERFACE_IMPORT,
					StringUtils.remplaceSlashToDot(project), this.name));
		
		return imports;
	}
	
	@Override
	public Set<String> getSrcImports(String project, String flag) {
		Set<String> imports = new HashSet<>();
		
		for (BusinessMethod m: this.methods) {
			if (m.getMethodKeyword() == null)
				imports.addAll(m.getImports(project, flag, StringUtils.toLowerFirst(this.name)));
		}
		
		return imports;
	}

}
