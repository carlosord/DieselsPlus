package uo.diesels.model.generator.model

import java.util.ArrayList
import java.util.Date
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.model.util.ModelVariableDefinition
import uo.diesels.model.generator.model.util.classes.RelationClass
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass
import uo.diesels.model.generator.model.util.elements.SimpleEntityClass
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass
import uo.diesels.model.generator.model.util.elements.ValueTypeClass
import uo.diesels.model.generator.model.util.util.JPAAnnotations
import uo.diesels.model.generator.model.util.util.ModelUtils
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.AssociativeEntity
import uo.diesels.model.modelDsl.Link
import uo.diesels.model.modelDsl.SimpleEntity
import uo.diesels.model.modelDsl.SimpleLink
import uo.diesels.model.modelDsl.ValueType
import uo.diesels.model.generator.common.util.TypeCodeTransformation

class EntityGenerator {

	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {
		for (ent : resource.allContents.toIterable.filter(typeof(SimpleEntity))) {
			var e = new SimpleEntityClass(ent, isSuperclassEntity(ent.name));

			// Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(e.compileText);

			// Obtiene el path de la clase
			var entityPath = String.format(PathConstants.MODEL_MODEL_PATH, project, e.className)

			// Crea el nuevo fichero
			fsa.generateFile(entityPath, sb.toString);

			if (e.implementable) {
				var src = new EntitySrcGenerator(resource, fsa, project, e);
				src.compile;
			}
		}
	}

	def compileText(SimpleEntityClass e) {
		var oneRelations = new ArrayList<RelationClass>();
		var manyRelations = new ArrayList<RelationClass>();
		var associativeEntities = new ArrayList<AssociativeEntityClass>();

		// Busca asociaciones simples donde este involucrada esta entidad
		for (link : resource.allContents.toIterable.filter(typeof(SimpleLink))) {
			var l = new SimpleLinkClass(link);
			if (ModelUtils.containsEntity(l.getRelations, e) != null) {
				var r = ModelUtils.getOtherRelationFromLink(l.getRelations, e);
				if (r == null) { // Es una relacion reflexiva
					for (rel: l.getRelations) {
						if (rel.multiplicity.contains("one")) {
							oneRelations.add(rel);
						} else { // Si son "many"
							manyRelations.add(rel);
						}
					}
				}
				if (r != null && r.isNavigable) {
					if (r.multiplicity.contains("one")) {
						oneRelations.add(r);
					} else { // Si son "many"
						manyRelations.add(r);
					}
				}
			}
		}

		// Busca entidades asociativas donde este involucrada esta entidad
		for (associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))) {
			var l = new AssociativeEntityClass(associativeEntity);
			var thisRel = ModelUtils.containsEntity(l.relations, e);
			if (thisRel != null) {
				if (thisRel.isNavigable) {
					associativeEntities.add(l);
				}
			}
		}
		'''
			«createPackageDeclaration»
			
			«createImportsDeclarations(e)»
			
			«createClassDeclaration(e)»			
				«createSerialVersionDeclaration»
				
				«createAttributteDeclarations(e)»
				«createMaintenanceAttributteDeclarations(e)»
				
				«createEmptyConstructor(e)»
				
				«IF !e.isAbstractClass && !e.idVariables.isEmpty»	
					«createDefaultConstructor(e)»
				«ELSE»
					«IF !e.idVariablesWithoutLink.isEmpty»
						«createDefaultConstructorForAbstracClass(e)»
					«ENDIF»
				«ENDIF»				
				«createGettersSetters(e)»
				«IF !e.idVariables.isEmpty»
					«createHashCodeEquals(e)»
				«ENDIF»
				«createToString(e)»
				«createMethods(e)»
				
				«createMaintenanceOneRelations(oneRelations)»
				«createMaintenanceManyRelations(manyRelations)»
				«createAssociativeMaintenanceRelations(associativeEntities, e)»
			}
		'''
	}

	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.MODEL_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}

	def createImportsDeclarations(SimpleEntityClass e) {
		var imports = new HashSet<String>(e.getImports(StringUtils.remplaceSlashToDot(project)));
		var attributes = new ArrayList<ModelVariableDefinition>();
		attributes.addAll(e.primaryKey);
		attributes.addAll(e.attributes);
		for (v : attributes) {
			if (v.variableTypeClass instanceof ValueType) {
				if (ModelUtils.containsOtherValueTypeLike(e.attributes, v) || v.nullable) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(1));
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("attributeOverride").get(1));
				}
			}
		}
		for (link : resource.allContents.toIterable.filter(typeof(SimpleLink))) {
			var l = new SimpleLinkClass(link);
			if (ModelUtils.isReflexiveRelation(l.getRelations, e) && ModelUtils.containsEntity(l.getRelations, e) != null){
				var r1 = l.getRelations.get(0);
				var r2 = l.getRelations.get(1);
				if (r1.multiplicity.contains("one")) {
					if (r2.multiplicity.contains("one")) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1));
					} else {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
						imports.add(ImportConstants.SET_IMPORT);
						imports.add(ImportConstants.HASHSET_IMPORT);
					}
				} else {
					if (r2.multiplicity.contains("one")) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(1));
					} else {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(2));
						imports.add(ImportConstants.SET_IMPORT);
						imports.add(ImportConstants.HASHSET_IMPORT);
					}
				}
				if (r2.multiplicity.contains("one")) {
					if (r1.multiplicity.contains("one")) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1));
					} else {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
						imports.add(ImportConstants.SET_IMPORT);
						imports.add(ImportConstants.HASHSET_IMPORT);
					}
				} else {
					if (r1.multiplicity.contains("one")) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(1));
					} else {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(2));
						imports.add(ImportConstants.SET_IMPORT);
						imports.add(ImportConstants.HASHSET_IMPORT);
					}
				}
			} else {
				var thisRel = ModelUtils.containsEntity(l.getRelations, e);
				var otherRel = ModelUtils.getOtherRelationFromLink(l.getRelations, e);
				if (thisRel != null && otherRel != null && otherRel.isNavigable) {
					if (thisRel.multiplicity.contains("one")) {
						if (otherRel.multiplicity.contains("one")) {
							imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1));
						} else {
							imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
							imports.add(ImportConstants.SET_IMPORT);
							imports.add(ImportConstants.HASHSET_IMPORT);
						}
					} else {
						if (otherRel.multiplicity.contains("one")) {
							imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(1));
						} else {
							imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(2));
							imports.add(ImportConstants.SET_IMPORT);
							imports.add(ImportConstants.HASHSET_IMPORT);
						}
					}
				}
			}
		}
		for (associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))) {
			var l = new AssociativeEntityClass(associativeEntity);
			if (ModelUtils.isReflexiveRelation(l.getRelations, e) && ModelUtils.containsEntity(l.getRelations, e) != null) {
				var r1 = l.getRelations.get(0);
				var r2 = l.getRelations.get(1);
				if (r2.multiplicity.contains("one")) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1));
				} else {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
					imports.add(ImportConstants.SET_IMPORT);
					imports.add(ImportConstants.HASHSET_IMPORT);
				}
				if (r1.multiplicity.contains("one")) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1));
				} else {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
					imports.add(ImportConstants.SET_IMPORT);
					imports.add(ImportConstants.HASHSET_IMPORT);
				}
			} else {
				var otherRel = ModelUtils.getOtherRelationFromLink(l.relations, e);
				if (otherRel.multiplicity.contains("one")) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1));
				} else {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
					imports.add(ImportConstants.SET_IMPORT);
					imports.add(ImportConstants.HASHSET_IMPORT);
				}
			}
		}
		for (v : e.idVariables) {
			imports.addAll(v.getVariableImports(StringUtils.remplaceSlashToDot(project)));
		}
		// En caso concreto de que la id sea un enlace declarado en su padre
		for (v : e.primaryKey) {
			if ((v.variableTypeClass instanceof Link) && e.superClass != null) {
				if (v.variableTypeClass instanceof AssociativeEntity) {
					var l = (new AssociativeEntityClass(v.variableTypeClass as AssociativeEntity)).relations;
					if (ModelUtils.containsEntityOrSuperClass(l, e.superClass) != null) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(1));
					}
				} else {
					var l = (new SimpleLinkClass(v.variableTypeClass as SimpleLink)).relations;
					if (ModelUtils.containsEntityOrSuperClass(l, e.superClass) != null) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(1));
					}
				}
			}
		}
		'''
			«FOR i : imports»
				«i»
			«ENDFOR»			
		'''
	}

	def createClassDeclaration(
		SimpleEntityClass e) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			«e.annotations»
			public«IF e.abstractEntity» abstract«ENDIF» class «e.className» extends «IF e.superClass != null»«e.superClass.name»«ELSE»BaseEntity«ENDIF» implements Serializable {
		'''
	}

	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}

	def createAttributteDeclarations(SimpleEntityClass e) {
		var allVariables = new ArrayList<ModelVariableDefinition>();
		allVariables.addAll(e.attributes);
		allVariables.addAll(e.primaryKey);
		'''
			«FOR v : e.primaryKey»
				«v.annotations»
				«IF !(v.variableTypeClass instanceof Link)»
					«IF(v.variableTypeClass instanceof ValueType)»
						«IF ModelUtils.containsOtherValueTypeLike(allVariables, v)»
							«JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)»( {
								«StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
										new ValueTypeClass(v.variableTypeClass as ValueType), "", v.variableName + "_",
										v.nullable, false))»
							} )
						«ELSE»
							«IF v.nullable»
								«JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)»( {
									«StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
										new ValueTypeClass(v.variableTypeClass as ValueType), "", "", true, true))»
								} )
							«ENDIF»
						«ENDIF»
					«ENDIF»
					private «TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName»;
				«ENDIF»
			«ENDFOR»
			«FOR v : e.attributes»
				«v.annotations»
				«IF v.variableTypeClass instanceof ValueType»
					«IF ModelUtils.containsOtherValueTypeLike(allVariables, v)»
						«JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)»( {
							«StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
								new ValueTypeClass(v.variableTypeClass as ValueType), "", v.variableName + "_", v.nullable, false))»
							} )
					«ELSE»
						«IF v.nullable»
							«JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)»( {
								«StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
									new ValueTypeClass(v.variableTypeClass as ValueType), "", "", true, true))»
							} )
						«ENDIF»
					«ENDIF»
				«ENDIF»
				private «TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName»«v.collectionVariable»;
			«ENDFOR»
			«««			En caso concreto de que la id sea un enlace declarado en su padre
			«FOR v : e.primaryKey»
				«IF (v.variableTypeClass instanceof Link) && e.superClass != null»
					«IF v.variableTypeClass instanceof AssociativeEntity»
						«var l = (new AssociativeEntityClass(v.variableTypeClass as AssociativeEntity)).relations»
						«var rel = ModelUtils.containsEntityOrSuperClass(l, e.superClass)»
						«IF rel != null»
							// Extra column for unique constraint over an inherited attribute
							@ManyToOne (optional = false) private «v.variableType» «v.variableName»_unique_constraint;
						«ENDIF»
					«ELSE»
						«var l = (new SimpleLinkClass(v.variableTypeClass as SimpleLink)).relations»
						«var rel = ModelUtils.containsEntityOrSuperClass(l, e.superClass)»
						«IF rel != null»
							«var otherRel = ModelUtils.getOtherRelationFromLink(l, rel.type)»
							// Extra column for unique constraint over an inherited attribute
							@ManyToOne (optional = false) private «otherRel.type.className» «v.variableName»_unique_constraint;
						«ENDIF»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		'''
	}

	def createMaintenanceAttributteDeclarations(SimpleEntityClass e) {
		'''
			«FOR link : resource.allContents.toIterable.filter(typeof(SimpleLink))»
				«var l = new SimpleLinkClass(link)»
				«IF ModelUtils.isReflexiveRelation(l.getRelations, e) && ModelUtils.containsEntity(l.getRelations, e) != null»
					«var r1 = l.getRelations.get(0)»
					«var r2 = l.getRelations.get(1)»
					«IF (r1.multiplicity.contains("one"))»
						«IF (r2.multiplicity.contains("one"))»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r2.optional)»
							private «r2.type.entityName» «r2.name»;
						«ELSE»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r1.name)»
							private Set<«r2.type.entityName»> «r2.name» = new HashSet<>();
						«ENDIF»
					«ELSE»
						«IF (r2.multiplicity.contains("one"))»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), r2.optional)»
							private «r2.type.entityName» «r2.name»;
						«ELSE»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(1), r1.name)»
							private Set<«r2.type.entityName»> «r2.name» = new HashSet<>();
						«ENDIF»
					«ENDIF»
					«IF (r2.multiplicity.contains("one"))»
						«IF (r1.multiplicity.contains("one"))»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r1.optional)»
							private «r1.type.entityName» «r1.name»;
						«ELSE»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r2.name)»
							private Set<«r1.type.entityName»> «r1.name» = new HashSet<>();
						«ENDIF»
					«ELSE»
						«IF (r1.multiplicity.contains("one"))»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), r1.optional)»
							private «r1.type.entityName» «r1.name»;
						«ELSE»
							«JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(0)»
							private Set<«r1.type.entityName»> «r1.name» = new HashSet<>();
						«ENDIF»
					«ENDIF»
				«ELSE»
					«var thisRel = ModelUtils.containsEntity(l.getRelations, e)»
					«IF thisRel != null»
						«var otherRel = ModelUtils.getOtherRelationFromLink(l.getRelations, e)»
						«IF (otherRel.isNavigable)»
							«IF (thisRel.multiplicity.contains("one"))»
								«IF (otherRel.multiplicity.contains("one"))»
									«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), otherRel.optional)»
									private «otherRel.type.entityName» «otherRel.name»;
								«ELSE»
									«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), thisRel.name)»
									private Set<«otherRel.type.entityName»> «otherRel.name» = new HashSet<>();
								«ENDIF»
							«ELSE»
								«IF (otherRel.multiplicity.contains("one"))»
									«String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), otherRel.optional)»
									private «otherRel.type.entityName» «otherRel.name»;
								«ELSE»
									«IF (thisRel.equals(l.getRelations.get(0)))»
										«String.format(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(1), thisRel.name)»
									«ELSE»
										«JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(0)»
									«ENDIF»
									private Set<«otherRel.type.entityName»> «otherRel.name» = new HashSet<>();
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDIF»
				«ENDIF»
			«ENDFOR»			
			«FOR associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))»
				«var l = new AssociativeEntityClass(associativeEntity)»
				«IF ModelUtils.isReflexiveRelation(l.getRelations, e) && ModelUtils.containsEntity(l.getRelations, e) != null»
					«var r1 = l.getRelations.get(0)»
					«var r2 = l.getRelations.get(1)»
					«IF (r2.multiplicity.contains("one"))»
						«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r2.optional)»
						private «r2.type.entityName» «r2.name»;
					«ELSE»
						«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r1.name)»
						private Set<«r2.type.entityName»> «r2.name» = new HashSet<>();
					«ENDIF»
					«IF (r1.multiplicity.contains("one"))»
						«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r1.optional)»
						private «r1.type.entityName» «r1.name»;
					«ELSE»
						«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r2.name)»
						private Set<«r1.type.entityName»> «r1.name» = new HashSet<>();
					«ENDIF»
				«ELSE»
					«var thisRel = ModelUtils.containsEntity(l.relations, e)»
					«var className = l.name»
					«IF thisRel != null»
						«var otherRel = ModelUtils.getOtherRelationFromLink(l.relations, e)»
						«IF (otherRel.multiplicity.contains("one"))»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), otherRel.optional)»
							private «className» «StringUtils.toLowerFirst(className)»;
						«ELSE»
							«String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), thisRel.name)»
							private Set<«className»> «StringUtils.toLowerFirst(className)» = new HashSet<>();
						«ENDIF»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		'''
	}

	def createEmptyConstructor(SimpleEntityClass e) {
		'''
			«e.className»() {}
		'''
	}

	def createDefaultConstructor(SimpleEntityClass e) {
		var superClassIds = new ArrayList<ModelVariableDefinition>();
		if (e.superClass != null) {
			superClassIds.addAll(ModelUtils.getIdsFromSuperclass(e));
		}
		var allIds = e.
			idVariables;
		'''
			public «e.className»(«FOR v : allIds»«IF v.variableTypeClass instanceof SimpleLink»«var a = getTypeFromRelationName(v.variableType, v.variableName)»«a.type.entityName» «a.name»«ELSE»«TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName»«ENDIF»«IF !v.equals(allIds.get(allIds.size-1))», «ENDIF»«ENDFOR») {
				super(«FOR i : superClassIds»«i.variableName»«IF !i.equals(superClassIds.get(superClassIds.size-1))», «ENDIF»«ENDFOR»);
			«««				En caso concreto de que la id sea un enlace declarado en su padre
				«FOR v : e.primaryKey»
				«IF (v.variableTypeClass instanceof Link) && e.superClass != null»
					«IF v.variableTypeClass instanceof AssociativeEntity»
						«var l = (new AssociativeEntityClass(v.variableTypeClass as AssociativeEntity)).relations»
						«IF ModelUtils.containsEntityOrSuperClass(l, e.superClass) != null»
							this.«v.variableName»_unique_constraint = «v.variableName»;
						«ENDIF»
					«ELSE»
						«var l = (new SimpleLinkClass(v.variableTypeClass as SimpleLink)).relations»
						«IF ModelUtils.containsEntityOrSuperClass(l, e.superClass) != null»
							this.«v.variableName»_unique_constraint = «v.variableName»;
						«ENDIF»
					«ENDIF»
				«ENDIF»
				«ENDFOR»
				«FOR v : e.primaryKey»
				«IF v.variableTypeClass instanceof SimpleLink»
					«var l = new SimpleLinkClass(v.variableTypeClass as SimpleLink)»
					«var thisRel = ModelUtils.containsEntityOrSuperClass(l.getRelations, e)»
					«IF thisRel != null»
						«IF thisRel.equals(l.getRelations.get(0))»
							Associations.«l.getName».link(this, «v.variableName»);
						«ELSE»
							Associations.«l.getName».link(«v.variableName», this);
						«ENDIF»
					«ENDIF»
				«ELSE»
					«IF !(v.variableTypeClass instanceof AssociativeEntity)»
						this.«v.variableName» = «v.variableName»;
					«ENDIF»
				«ENDIF»
				«ENDFOR»
			}
			
		'''
	}

	def createDefaultConstructorForAbstracClass(SimpleEntityClass e) {
		var superClassIds = new ArrayList<ModelVariableDefinition>();
		if (e.superClass != null) {
			superClassIds.addAll(ModelUtils.getIdsFromSuperclass(e));
		}
		var allIds = e.
			idVariablesWithoutLink;
		'''
			public «e.className»(«FOR v : allIds»«IF v.variableTypeClass instanceof SimpleLink»«var a = getTypeFromRelationName(v.variableType, v.variableName)»«a.type.entityName» «a.name»«ELSE»«v.variableType» «v.variableName»«ENDIF»«IF !v.equals(allIds.get(allIds.size-1))», «ENDIF»«ENDFOR») {
				super(«FOR i : superClassIds»«i.variableName»«IF !i.equals(superClassIds.get(superClassIds.size-1))», «ENDIF»«ENDFOR»);
				«FOR v : e.primaryKey»
				«IF !(v.variableTypeClass instanceof SimpleLink) && !(v.variableTypeClass instanceof AssociativeEntity)»
					this.«v.variableName» = «v.variableName»;
				«ENDIF»
				«ENDFOR»
			}
			
		'''
	}

	def createGettersSetters(
		SimpleEntityClass e) {
		'''
			«FOR p : e.primaryKey»
				«IF(!(p.variableTypeClass instanceof Link))»		
					public «TypeCodeTransformation.instance.types.get(p.variableType)» get«StringUtils.toUpperFirst(p.variableName)»() {
						return this.«p.variableName»;
					}
					
				«ENDIF»	
			«ENDFOR»
			«FOR v : e.attributes»			
				«IF !(v instanceof ModelTypeCollectionVariableClass) && !(v instanceof SimpleTypeCollectionVariableClass) »
					public «TypeCodeTransformation.instance.types.get(v.variableType)» get«StringUtils.toUpperFirst(v.variableName)»() {
						return this.«v.variableName»;
					}
							
					public void set«StringUtils.toUpperFirst(v.variableName)»(«TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName») {
						this.«v.variableName» = «v.variableName»;
					}
					
				«ELSE»
					«var paramType = ModelUtils.getCollectionType(v.variableType)»
					«var param = StringUtils.toLowerFirst(ModelUtils.getCollectionType(v.variableType))»
					public void add«StringUtils.toUpperFirst(v.variableName)»(«paramType» «param») {
						this.«v.variableName».add(«param»);
					}
					
					public void remove«StringUtils.toUpperFirst(v.variableName)»(«paramType» «param») {
						this.«v.variableName».remove(«param»);
					}
					
					public «ModelUtils.getCollection(v.variableType)»<«paramType»> get«StringUtils.toUpperFirst(v.variableName)»() {
						return «ModelUtils.getCollectionInitialize(v.variableType)»(«v.variableName»);
					}
					
				«ENDIF»				
			«ENDFOR»		
		'''
	}

	def createHashCodeEquals(
		SimpleEntityClass e) {
		'''
			@Override
			public int hashCode() {
				return Objects.hash(«FOR i : e.idVariables»this.get«StringUtils.toUpperFirst(i.variableName)»()«IF !i.equals(e.idVariables.get(e.idVariables.size-1))», «ENDIF»«ENDFOR»);
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				«e.className» other = («e.className») obj;
				return Objects.equals(«FOR i : e.idVariables»this.get«StringUtils.toUpperFirst(i.variableName)»(), other.get«StringUtils.toUpperFirst(i.variableName)»()«IF !i.equals(e.idVariables.get(e.idVariables.size-1))») && Objects.equals(«ENDIF»«ENDFOR»);
			}
			
		'''
	}

	def createToString(SimpleEntityClass e) {
		var vars = new ArrayList<ModelVariableDefinition>();
		vars.addAll(e.primaryKey);
		vars.addAll(
			e.
				attributes);
				'''
					@Override
					public String toString() {
						return "«e.className» [«FOR v : vars»«v.variableName»=" + this.get«StringUtils.toUpperFirst(v.variableName)»() + "«IF !v.equals(vars.get(vars.size-1))», «ENDIF»«ENDFOR»]";
					}
					
				'''
			}

			def createMethods(SimpleEntityClass e) {
				'''
					«FOR m : e.methods»
						public abstract «TypeCodeTransformation.instance.types.get(m.methodReturnType)» «m.methodName»(«FOR p : m.methodParameters»«TypeCodeTransformation.instance.types.get(p.variableType)» «p.variableName»«IF !p.equals(m.methodParameters.get(m.methodParameters.size-1))», «ENDIF»«ENDFOR»);
					«ENDFOR»			
				'''
			}

			def createMaintenanceOneRelations(List<RelationClass> oneRelations) {
				'''
					«FOR r : oneRelations»
						void _set«StringUtils.toUpperFirst(r.name)»(«r.type.entityName» «r.name») {
							this.«r.name» = «r.name»;
						}
						
						public «r.type.entityName» get«StringUtils.toUpperFirst(r.name)»() {
							return this.«r.name»;
						}
						
					«ENDFOR»
				'''
			}

			def createMaintenanceManyRelations(List<RelationClass> manyRelations) {
				'''
					«FOR r : manyRelations»
						Set<«r.type.entityName»> _get«StringUtils.toUpperFirst(r.name)»() {
							return this.«r.name»;
						}
						
						public Set<«r.type.entityName»> get«StringUtils.toUpperFirst(r.name)»() {
							return new HashSet<>(«r.name»);
						}
						
					«ENDFOR»
				'''
			}

			def createAssociativeMaintenanceRelations(List<AssociativeEntityClass> associativeEntities,
				SimpleEntityClass e) {
				'''
					«FOR l : associativeEntities»
«««						«IF ModelUtils.isReflexiveRelation(l.getRelations, e) && ModelUtils.containsEntity(l.getRelations, e) != null»
«««							«var r1 = l.getRelations.get(0)»
«««							«var r2 = l.getRelations.get(1)»
«««							«var className = l.className»
«««							«IF (r1.multiplicity.contains("one"))»
«««								void _set«className»(«className» «StringUtils.toLowerFirst(className)») {
«««									this.«StringUtils.toLowerFirst(className)» = «StringUtils.toLowerFirst(className)»;
«««								}
«««								
«««								public «className» get«className»() {
«««									return this.«StringUtils.toLowerFirst(className)»;
«««								}
«««								
«««							«ELSE»
«««								Set<«className»> _get«className»() {
«««									return this.«StringUtils.toLowerFirst(className)»;
«««								}
«««								
«««								public Set<«className»> get«className»() {
«««									return new HashSet<>(«StringUtils.toLowerFirst(className)»);
«««								}
«««								
«««							«ENDIF»
«««							«IF (r2.multiplicity.contains("one"))»
«««							«ELSE»
«««							«ENDIF»
«««						«ELSE»
							«var otherRel = ModelUtils.getOtherRelationFromLink(l.relations, e).multiplicity»
							«var className = l.name»
							«IF (otherRel.contains("one"))»
								void _set«className»(«className» «StringUtils.toLowerFirst(className)») {
									this.«StringUtils.toLowerFirst(className)» = «StringUtils.toLowerFirst(className)»;
								}
								
								public «className» get«className»() {
									return this.«StringUtils.toLowerFirst(className)»;
								}
								
							«ELSE»
								Set<«className»> _get«className»() {
									return this.«StringUtils.toLowerFirst(className)»;
								}
								
								public Set<«className»> get«className»() {
									return new HashSet<>(«StringUtils.toLowerFirst(className)»);
								}
								
							«ENDIF»
«««						«ENDIF»								
					«ENDFOR»
				'''
			}

			/* Métodos de apoyo */
			def getTypeFromRelationName(String linkName, String relationName) {
				for (l : resource.allContents.toIterable.filter(typeof(SimpleLink))) {
					var link = new SimpleLinkClass(l);
					if (link.getName.equals(linkName)) {
						for (r : link.getRelations) {
							if (r.name.equals(relationName)) {
								return r;
							}
						}
					}
				}
			}

			def isSuperclassEntity(String entity) {
				for (e : resource.allContents.toIterable.filter(typeof(SimpleEntity))) {
					if (e.superClass != null && e.superClass.name.equals(entity)) {
						return true;
					}
				}
				return false;
			}

		}
		