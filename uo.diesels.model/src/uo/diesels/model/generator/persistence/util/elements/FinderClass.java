package uo.diesels.model.generator.persistence.util.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uo.diesels.model.generator.persistence.util.PersistenceFinder;
import uo.diesels.model.generator.persistence.util.PersistenceMethod;
import uo.diesels.model.generator.persistence.util.util.Transformer;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.persistenceDsl.Finder;
import uo.diesels.model.persistenceDsl.FinderMethod;

public class FinderClass implements PersistenceFinder {

	private String name;
	private List<PersistenceMethod> methods;

	public FinderClass(Finder f) {
		this.name = f.getName();
		this.methods = transform(f.getMethods());
	}
	
	private List<PersistenceMethod> transform(List<FinderMethod> methods) {
		List<PersistenceMethod> finderMethods = new ArrayList<>();
		for (FinderMethod m: methods) {
			finderMethods.add(Transformer.transform(m));
		}
		return finderMethods;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PersistenceMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<PersistenceMethod> methods) {
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
		FinderClass other = (FinderClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FinderClass [name=" + name + ", methods=" + methods + "]";
	}

	@Override
	public Set<String> getImports(String project) {
		Set<String> imports = new HashSet<>();
		
		imports.add(ImportConstants.GENERATED_ANNOTATION_IMPORT);
		
		for (PersistenceMethod m: this.methods)
			imports.addAll(m.getImports(project));
		
		return imports;
	}

}
