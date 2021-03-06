package uo.diesels.model.generator.model

import java.util.ArrayList
import java.util.Date
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.common.util.TypeCodeTransformation
import uo.diesels.model.generator.model.util.classes.RelationClass
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass
import uo.diesels.model.generator.model.util.elements.ValueTypeClass
import uo.diesels.model.generator.model.util.util.JPAAnnotations
import uo.diesels.model.generator.model.util.util.ModelUtils
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.AssociativeEntity
import uo.diesels.model.modelDsl.SimpleLink
import uo.diesels.model.modelDsl.ValueType

class EntityLinkGenerator {

	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {
		for (associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))) {
			var e = new AssociativeEntityClass(associativeEntity);

			// Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(e.compileText);

			// Obtiene el path de la clase
			var entityPath = String.format(PathConstants.MODEL_MODEL_PATH, project, e.className)

			// Crea la clave artificial
			var entityLinkKeyGenerator = new EntityLinkKeyGenerator(resource, fsa, project, associativeEntity);
			entityLinkKeyGenerator.compile();

			// Crea el nuevo fichero
			fsa.generateFile(entityPath, sb.toString);
			
			if (e.implementable) {
				var src = new EntitySrcGenerator(resource, fsa, project, e);
				src.compile;
			}
		}
	}

	def compileText(AssociativeEntityClass e) {
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
			�createPackageDeclaration()�
			
			�createImportsDeclarations(e)�
			
			�createClassDeclaration(e)�
				�createSerialVersionDeclaration�
				
				�createAssociativeMaintenanceAttributeDeclarations(e)�
				
				�createAttributteDeclarations(e)�
				
				�createMaintenanceAttributteDeclarations(e)�
				
				�createEmptyConstructor(e)�
				
				�IF !e.isAbstractEntity�				
					�createDefaultConstructor(e)�
				�ENDIF�			
				�createGettersSetters(e)�
				�createHashCodeEquals(e)�
				�createToString(e)�
				�createMethods(e)�
				
				�createEntityLinkMaintenanceRelations(e)�
				�createMaintenanceOneRelations(oneRelations)�
				�createMaintenanceManyRelations(manyRelations)�
				�createAssociativeMaintenanceRelations(associativeEntities, e)�
			}
		'''
	}

	def createPackageDeclaration() {
		'''
			�String.format(PackageConstants.MODEL_PACKAGE, StringUtils.remplaceSlashToDot(project))�
		'''
	}
	
	def createImportsDeclarations(AssociativeEntityClass e) {
		var imports = new HashSet<String>(e.getImports(StringUtils.remplaceSlashToDot(project)));
		for (v: e.attributes) {
			if (v.variableTypeClass instanceof ValueType) {
				if (ModelUtils.containsOtherValueTypeLike(e.attributes, v) || v.nullable) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(1));
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("attributeOverride").get(1));
				}
			}
		}
		for (link : resource.allContents.toIterable.filter(typeof(SimpleLink))) {
			var l = new SimpleLinkClass(link);
			if (ModelUtils.isReflexiveRelation(l.getRelations) && ModelUtils.containsEntity(l.getRelations, e) != null) {
				var r1 = l.getRelations.get(0);
				var r2 = l.getRelations.get(1);
				if (r1.multiplicity.contains("one")) {
					if (r2.multiplicity.contains("one")) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(2));
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
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(2));
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
				if (ModelUtils.containsEntity(l.getRelations, e) != null) {
					var thisRel = ModelUtils.containsEntity(l.getRelations, e);
					var otherRel = ModelUtils.getOtherRelationFromLink(l.getRelations, e);
					if (otherRel.isNavigable) {
						if (thisRel.multiplicity.contains("one")) {
							if (otherRel.multiplicity.contains("one")) {
								imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(2));
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
		}
		for (associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))) {
			var l = new AssociativeEntityClass(associativeEntity);
			if (ModelUtils.isReflexiveRelation(l.getRelations) && ModelUtils.containsEntity(l.getRelations, e) != null) {
				var r1 = l.getRelations.get(0);
				var r2 = l.getRelations.get(1);
				if (r2.multiplicity.contains("one")) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(2));
				} else {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
					imports.add(ImportConstants.SET_IMPORT);
					imports.add(ImportConstants.HASHSET_IMPORT);
				}
				if (r1.multiplicity.contains("one")) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(2));
				} else {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
					imports.add(ImportConstants.SET_IMPORT);
					imports.add(ImportConstants.HASHSET_IMPORT);
				}
			} else {
				if (ModelUtils.containsEntity(l.getRelations, e) != null) {
					var otherRel = ModelUtils.getOtherRelationFromLink(l.relations, e);
					if (otherRel.multiplicity.contains("one")) {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(2));
					} else {
						imports.add(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(1));
						imports.add(ImportConstants.SET_IMPORT);
						imports.add(ImportConstants.HASHSET_IMPORT);
					}
				}
			}
		}
		'''
			�FOR i: imports�
				�i�
			�ENDFOR�
		'''
	}

	def createClassDeclaration(AssociativeEntityClass e) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "�(new Date()).toString�"
			)
			�e.annotations�
			public�IF e.abstractEntity� abstract�ENDIF� class �e.className� implements Serializable {
		'''
	}
	
	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}

	def createAssociativeMaintenanceAttributeDeclarations(AssociativeEntityClass e) {
		'''	
			�FOR r: e.relations�
				�JPAAnnotations.getInstance.getAnnotations.get("id").get(0)�
				�IF (r.multiplicity.contains("one"))�
					�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r.optional)�
				�ELSE�
					�String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), r.optional)�
				�ENDIF�
				private �r.type.className� �r.name�;
			�ENDFOR�
		'''
	}

	def createAttributteDeclarations(AssociativeEntityClass e) {
		'''
			�FOR v : e.attributes�
				�v.annotations�		
				�IF(v.variableTypeClass instanceof ValueType)�
					�IF ModelUtils.containsOtherValueTypeLike(e.attributes, v)�
						�JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)�( {
							�StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
									new ValueTypeClass(v.variableTypeClass as ValueType), "", v.variableName + "_",
									v.nullable, false))�
						} )
					�ELSE�
						�IF v.nullable�
							�JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)�( {
								�StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
									new ValueTypeClass(v.variableTypeClass as ValueType), "", "", true, true))�
							} )
						�ENDIF�
					�ENDIF�
				�ENDIF�
				private �TypeCodeTransformation.instance.getTypeFor(v.variableType)� �v.variableName��v.collectionVariable�;
			�ENDFOR�
		'''
	}
	
	def createMaintenanceAttributteDeclarations(AssociativeEntityClass e) {
		'''
			�FOR link : resource.allContents.toIterable.filter(typeof(SimpleLink))�
				�var l = new SimpleLinkClass(link)�
				�IF ModelUtils.isReflexiveRelation(l.getRelations) && ModelUtils.containsEntity(l.getRelations, e) != null�
					�var r1 = l.getRelations.get(0)�
					�var r2 = l.getRelations.get(1)�
					�IF (r1.multiplicity.contains("one"))�
						�IF (r2.multiplicity.contains("one"))�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(1), r1.name, r2.optional)�
							private �r2.type.entityName� �r2.name�;
						�ELSE�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r1.name)�
							private Set<�r2.type.entityName�> �r2.name� = new HashSet<>();
						�ENDIF�
					�ELSE�
						�IF (r2.multiplicity.contains("one"))�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), r2.optional)�
							private �r2.type.entityName� �r2.name�;
						�ELSE�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(1), r1.name)�
							private Set<�r2.type.entityName�> �r2.name� = new HashSet<>();
						�ENDIF�
					�ENDIF�
					�IF (r2.multiplicity.contains("one"))�
						�IF (r1.multiplicity.contains("one"))�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r1.optional)�
							private �r1.type.entityName� �r1.name�;
						�ELSE�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r2.name)�
							private Set<�r1.type.entityName�> �r1.name� = new HashSet<>();
						�ENDIF�
					�ELSE�
						�IF (r1.multiplicity.contains("one"))�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), r1.optional)�
							private �r1.type.entityName� �r1.name�;
						�ELSE�
							�JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(0)�
							private Set<�r1.type.entityName�> �r1.name� = new HashSet<>();
						�ENDIF�
					�ENDIF�
				�ELSE�
					�var thisRel = ModelUtils.containsEntity(l.getRelations, e)�
					�IF thisRel != null�
						�var otherRel = ModelUtils.getOtherRelationFromLink(l.getRelations, e)�
						�IF (otherRel.isNavigable)�
							�IF (thisRel.multiplicity.contains("one"))�
								�IF (otherRel.multiplicity.contains("one"))�
									�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), otherRel.optional)�
									private �otherRel.type.entityName� �otherRel.name�;
								�ELSE�
									�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), thisRel.name)�
									private Set<�otherRel.type.entityName�> �otherRel.name� = new HashSet<>();
								�ENDIF�
							�ELSE�
								�IF (otherRel.multiplicity.contains("one"))�
									�String.format(JPAAnnotations.getInstance.getAnnotations.get("manytoone").get(0), otherRel.optional)�
									private �otherRel.type.entityName� �otherRel.name�;
								�ELSE�
									�IF (thisRel.equals(l.getRelations.get(0)))�
										�String.format(JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(1), thisRel.name)�
									�ELSE�
										�JPAAnnotations.getInstance.getAnnotations.get("manytomany").get(0)�
									�ENDIF�
									private Set<�otherRel.type.entityName�> �otherRel.name� = new HashSet<>();
								�ENDIF�
							�ENDIF�
						�ENDIF�
					�ENDIF�
				�ENDIF�
			�ENDFOR�			
			�FOR associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))�
				�var l = new AssociativeEntityClass(associativeEntity)�
				�IF ModelUtils.isReflexiveRelation(l.getRelations) && ModelUtils.containsEntity(l.getRelations, e) != null�
					�var r1 = l.getRelations.get(0)�
					�var r2 = l.getRelations.get(1)�
					�IF (r2.multiplicity.contains("one"))�
						�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r2.optional)�
						private �l.name� �r2.name�;
					�ELSE�
						�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r1.name)�
						private Set<�l.name�> �r2.name� = new HashSet<>();
					�ENDIF�
					�IF (r1.multiplicity.contains("one"))�
						�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), r1.optional)�
						private �l.name� �r1.name�;
					�ELSE�
						�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), r2.name)�
						private Set<�l.name�> �r1.name� = new HashSet<>();
					�ENDIF�
				�ELSE�
					�var thisRel = ModelUtils.containsEntity(l.relations, e)�
					�var className = l.name�
					�IF thisRel != null�
						�var otherRel = ModelUtils.getOtherRelationFromLink(l.relations, e)�
						�IF (otherRel.multiplicity.contains("one"))�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetoone").get(0), otherRel.optional)�
							private �className� �otherRel.name�;
						�ELSE�
							�String.format(JPAAnnotations.getInstance.getAnnotations.get("onetomany").get(0), thisRel.name)�
							private Set<�className�> �otherRel.name� = new HashSet<>();
						�ENDIF�
					�ENDIF�
				�ENDIF�
			�ENDFOR�
		'''
	}

	def createEmptyConstructor(AssociativeEntityClass e) {
		'''
			�e.className�() {}
		'''
	}

	def createDefaultConstructor(AssociativeEntityClass e) {
		var r1 = e.relations.get(0);
		var r2 = e.relations.get(1);
		'''
			public �e.name�(�r1.type.entityName� �r1.name�, �r2.type.entityName� �r2.name�) {
				Associations.�e.name�Link.link(�r1.name�, �r2.name�, this);
			}
						
		'''
	}

	def createGettersSetters(AssociativeEntityClass e) {
		'''		
			�FOR v : e.attributes�			
				�IF !(v instanceof ModelTypeCollectionVariableClass) && !(v instanceof SimpleTypeCollectionVariableClass) �
					public �TypeCodeTransformation.instance.getTypeFor(v.variableType)� get�StringUtils.toUpperFirst(v.variableName)�() {
						return this.�v.variableName�;
					}
							
					public void set�StringUtils.toUpperFirst(v.variableName)�(�TypeCodeTransformation.instance.getTypeFor(v.variableType)� �v.variableName�) {
						this.�v.variableName� = �v.variableName�;
					}
					
				�ELSE�
					�var paramType = ModelUtils.getCollectionType(v.variableType)�
					�var param = StringUtils.toLowerFirst(ModelUtils.getCollectionType(v.variableType))�
					public void add�StringUtils.toUpperFirst(v.variableName)�(�paramType� �param�) {
						this.�v.variableName�.add(�param�);
					}
					
					public void remove�StringUtils.toUpperFirst(v.variableName)�(�paramType� �param�) {
						this.�v.variableName�.remove(�param�);
					}
					
					public �ModelUtils.getCollection(v.variableType)�<�paramType�> get�StringUtils.toUpperFirst(v.variableName)�() {
						return �ModelUtils.getCollectionInitialize(v.variableType)�(�v.variableName�);
					}
					
				�ENDIF�
			�ENDFOR�		
		'''
	}

	def createHashCodeEquals(AssociativeEntityClass e) {
		'''
			@Override
			public int hashCode() {
				return Objects.hash(�FOR r : e.relations��r.name��IF !r.equals(e.relations.get(e.relations.size-1))�, �ENDIF��ENDFOR�);
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				�e.className� other = (�e.className�) obj;
				return Objects.equals(�FOR r : e.relations��r.name�, other.�r.name��IF !r.equals(e.relations.get(e.relations.size-1))�) && Objects.equals(�ENDIF��ENDFOR�);
			}
			
		'''
	}

	def createToString(AssociativeEntityClass e) {
		'''
			@Override
			public String toString() {
				return "�e.className� [�FOR r : e.relations��r.name�=" + �r.name� + "�IF !r.equals(e.relations.get(e.relations.size-1)) || !e.attributes.isEmpty()�, �ENDIF��ENDFOR��FOR v : e.attributes��v.variableName�=" + �v.variableName� + "�IF !v.equals(e.attributes.get(e.attributes.size-1))�, �ENDIF��ENDFOR�]";
			}		
		'''
	}

	def createMethods(AssociativeEntityClass e) {
		'''
			�FOR m : e.methods�
				public abstract �TypeCodeTransformation.instance.getTypeFor(m.methodReturnType)� �m.methodName�(�FOR p : m.methodParameters��TypeCodeTransformation.instance.getTypeFor(p.variableType)� �p.variableName��IF !p.equals(m.methodParameters.get(m.methodParameters.size-1))�, �ENDIF��ENDFOR�);
			�ENDFOR�			
		'''
	}

	def createEntityLinkMaintenanceRelations(AssociativeEntityClass e) {
		'''
			�FOR r : e.relations�
				void _set�StringUtils.toUpperFirst(r.name)�(�StringUtils.toUpperFirst(r.type.entityName)� �r.name�) {
					this.�r.name� = �r.name�;
				}
				
				public �StringUtils.toUpperFirst(r.type.entityName)� get�StringUtils.toUpperFirst(r.name)�() {
					return this.�r.name�;
				}
				
			�ENDFOR�
		'''
	}

	def createMaintenanceOneRelations(List<RelationClass> oneRelations) {
		'''
			�FOR r : oneRelations�
				void _set�StringUtils.toUpperFirst(r.name)�(�r.type.entityName� �r.name�) {
					this.�r.name� = �r.name�;
				}
				
				public �r.type.entityName� get�StringUtils.toUpperFirst(r.name)�() {
					return this.�r.name�;
				}
				
			�ENDFOR�
		'''
	}

	def createMaintenanceManyRelations(List<RelationClass> manyRelations) {
		'''
			�FOR r : manyRelations�
				Set<�r.type.entityName�> _get�StringUtils.toUpperFirst(r.name)�() {
					return this.�r.name�;
				}
				
				public Set<�r.type.entityName�> get�StringUtils.toUpperFirst(r.name)�() {
					return new HashSet<>(�r.name�);
				}
				
			�ENDFOR�
		'''
	}
	
	def createAssociativeMaintenanceRelations(List<AssociativeEntityClass> associativeEntities,
				AssociativeEntityClass e) {
				'''
					�FOR l : associativeEntities�
						�IF ModelUtils.isReflexiveRelation(l.getRelations) && ModelUtils.containsEntity(l.getRelations, e) != null�
							�var r1 = l.getRelations.get(0)�
							�var r2 = l.getRelations.get(1)�
							�var className = l.className�
							�IF (r1.multiplicity.contains("one"))�
								void _set�StringUtils.toUpperFirst(r1.name)�(�className� �r1.name�) {
									this.�r1.name� = �r1.name�;
								}
								
								public �className� get�StringUtils.toUpperFirst(r1.name)�() {
									return this.�r1.name�;
								}
								
							�ELSE�
								Set<�className�> _get�StringUtils.toUpperFirst(r1.name)�() {
									return this.�r1.name�;
								}
								
								public Set<�className�> get�StringUtils.toUpperFirst(r1.name)�() {
									return new HashSet<>(�r1.name�);
								}
								
							�ENDIF�
							�IF (r2.multiplicity.contains("one"))�
								void _set�StringUtils.toUpperFirst(r2.name)�(�className� �r2.name�) {
									this.�r2.name� = �r2.name�;
								}
								
								public �className� get�StringUtils.toUpperFirst(r2.name)�() {
									return this.�r2.name�;
								}
								
							�ELSE�
								Set<�className�> _get�StringUtils.toUpperFirst(r2.name)�() {
									return this.�r2.name�;
								}
								
								public Set<�className�> get�StringUtils.toUpperFirst(r2.name)�() {
									return new HashSet<>(�r2.name�);
								}
								
							�ENDIF�
						�ELSE�
							�IF ModelUtils.containsEntity(l.getRelations, e) != null�
								�var otherRel = ModelUtils.getOtherRelationFromLink(l.relations, e)�
								�var className = l.name�
								�IF (otherRel.multiplicity.contains("one"))�
									void _set�StringUtils.toUpperFirst(otherRel.name)�(�className� �otherRel.name�) {
										this.�otherRel.name� = �otherRel.name�;
									}
									
									public �className� get�StringUtils.toUpperFirst(otherRel.name)�() {
										return this.�otherRel.name�;
									}
									
								�ELSE�
									Set<�className�> _get�StringUtils.toUpperFirst(otherRel.name)�() {
										return this.�otherRel.name�;
									}
									
									public Set<�className�> get�StringUtils.toUpperFirst(otherRel.name)�() {
										return new HashSet<>(�otherRel.name�);
									}
									
								�ENDIF�
							�ENDIF�
						�ENDIF�								
					�ENDFOR�
				'''
			}

}
