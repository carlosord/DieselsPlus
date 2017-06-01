package uo.diesels.model.generator.model.util.elements;

import java.util.ArrayList;
import java.util.List;

import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.util.Transformer;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleLink;

public class SimpleLinkClass {
	
	private String name;
	private List<RelationClass> relations;
	
	public SimpleLinkClass(SimpleLink sl) {
		this.name = sl.getName();
		transformRelations(sl.getRelations());
	}
	
	private void transformRelations(List<Relation> relations) {
		this.relations = new ArrayList<>();
		for (Relation r: relations)
			this.relations.add(Transformer.transform(r));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RelationClass> getRelations() {
		return relations;
	}

	public void setRelations(List<RelationClass> relations) {
		this.relations = relations;
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
		SimpleLinkClass other = (SimpleLinkClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LinkClass [name=" + name + ", relations=" + relations + "]";
	}

}
