package uo.diesels.model.generator.dto.util.util;

import uo.diesels.model.dtoDsl.DefDtoAttribute;
import uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable;
import uo.diesels.model.dtoDsl.DefDtoModelTypeVariable;
import uo.diesels.model.dtoDsl.DefDtoSimpleTypeCollectionVariable;
import uo.diesels.model.dtoDsl.DefDtoSimpleVariable;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.classes.LinkVariableClass;
import uo.diesels.model.generator.dto.util.classes.ModelTypeCollectionVariableClass;
import uo.diesels.model.generator.dto.util.classes.ModelTypeVariableClass;
import uo.diesels.model.generator.dto.util.classes.RelationClass;
import uo.diesels.model.generator.dto.util.classes.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.dto.util.classes.SimpleVariableClass;
import uo.diesels.model.modelDsl.DefAttribute;
import uo.diesels.model.modelDsl.DefIdAttribute;
import uo.diesels.model.modelDsl.DefLinkVariable;
import uo.diesels.model.modelDsl.DefModelModelTypeCollectionVariable;
import uo.diesels.model.modelDsl.DefModelSimpleTypeCollectionVariable;
import uo.diesels.model.modelDsl.DefModelTypeVariable;
import uo.diesels.model.modelDsl.DefSimpleVariable;
import uo.diesels.model.modelDsl.Relation;

public class Transformer {

	public static DtoVariableDefinition transform(DefIdAttribute var) {
		if (var instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) var);
		if (var instanceof DefModelTypeVariable)
			return transform((DefModelTypeVariable) var);
		if (var instanceof DefLinkVariable)
			return transform((DefLinkVariable) var);
		return null;
	}

	public static DtoVariableDefinition transform(DefAttribute var) {
		if (var instanceof DefSimpleVariable)
			return transform((DefSimpleVariable) var);
		if (var instanceof DefModelTypeVariable)
			return transform((DefModelTypeVariable) var);
		if (var instanceof DefModelModelTypeCollectionVariable)
			return transform((DefModelModelTypeCollectionVariable) var);
		if (var instanceof DefModelSimpleTypeCollectionVariable)
			return transform((DefModelSimpleTypeCollectionVariable) var);
		return null;
	}
	
	public static DtoVariableDefinition transform(DefDtoAttribute var) {
		if (var instanceof DefDtoSimpleVariable)
			return transform((DefDtoSimpleVariable) var);
		if (var instanceof DefDtoModelTypeVariable)
			return transform((DefDtoModelTypeVariable) var);
		if (var instanceof DefDtoModelTypeCollectionVariable)
			return transform((DefDtoModelTypeCollectionVariable) var);
		if (var instanceof DefDtoSimpleTypeCollectionVariable)
			return transform((DefDtoSimpleTypeCollectionVariable) var);
		return null;
	}

	public static DtoVariableDefinition transform(DefDtoSimpleVariable var) {
		return new SimpleVariableClass(var);
	}

	public static DtoVariableDefinition transform(DefDtoModelTypeVariable var) {
		return new ModelTypeVariableClass(var);
	}
	
	public static DtoVariableDefinition transform(DefDtoSimpleTypeCollectionVariable var) {
		return new SimpleTypeCollectionVariableClass(var);
	}
	
	public static DtoVariableDefinition transform(DefDtoModelTypeCollectionVariable var) {
		return new ModelTypeCollectionVariableClass(var);
	}
	
	public static DtoVariableDefinition transform(DefModelModelTypeCollectionVariable var) {
		return new ModelTypeCollectionVariableClass(var);
	}
	
	public static DtoVariableDefinition transform(DefSimpleVariable var) {
		return new SimpleVariableClass(var);
	}

	public static DtoVariableDefinition transform(DefModelTypeVariable var) {
		return new ModelTypeVariableClass(var);
	}

	public static DtoVariableDefinition transform(DefLinkVariable var) {
		return new LinkVariableClass(var);
	}
	
	public static RelationClass transform(Relation var) {
		return new RelationClass(var);
	}

}
