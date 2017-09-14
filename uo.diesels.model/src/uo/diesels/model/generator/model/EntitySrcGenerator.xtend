package uo.diesels.model.generator.model

import java.util.ArrayList
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.common.util.TypeCodeTransformation
import uo.diesels.model.generator.model.util.ModelEntity
import uo.diesels.model.generator.model.util.ModelVariableDefinition
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass
import uo.diesels.model.generator.model.util.elements.SimpleEntityClass
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass
import uo.diesels.model.generator.model.util.util.ModelUtils
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.ResourceUtils
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.SimpleLink

class EntitySrcGenerator {

	Resource resource;
	IFileSystemAccess fsa;
	String project;
	ModelEntity entity;

	new(Resource resource, IFileSystemAccess fsa, String project, ModelEntity e) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
		this.entity = e;
	}

	def compile() {
		// Crea el codigo de la clase
		var sb = new StringBuilder();
		sb.append(entity.compileText);

		// Obtiene el path de la clase
		var entityPath = String.format(PathConstants.MODEL_SRC_PATH, project, entity.entityName)

		var path = new Path(String.format(PathConstants.MODEL_SRC_PATH_PROJECT, project, entity.entityName));
		if (!ResourcesPlugin.getWorkspace().getRoot().getProject(ResourceUtils.obtainProjectName(resource))
				.getFile(path).exists())
			fsa.generateFile(entityPath, sb.toString);
	}

	def compileText(ModelEntity e) {
		'''
			«createPackageDeclaration()»
				
			«createImportsDeclarations(e)»
				
			«createClassDeclaration(e)»
				«createSerialVersionDeclaration»
				
				«createEmptyConstructor(e)»
				
				«IF e instanceof SimpleEntityClass»
					«IF !e.idVariables.isEmpty»
						«createDefaultConstructor(e)»
					«ENDIF»
				«ELSE»
					«createDefaultConstructor(e as AssociativeEntityClass)»
				«ENDIF»			
				«createMethods(e)»				
				«IF e instanceof SimpleEntityClass»
					«IF !e.idVariables.isEmpty»
						«createHashCodeEquals(e)»
					«ENDIF»
				«ELSE»
					«createHashCodeEquals(e as AssociativeEntityClass)»
				«ENDIF»
				«IF e instanceof SimpleEntityClass»
					«IF !e.idVariables.isEmpty»
						«createToString(e)»
					«ENDIF»
				«ELSE»
					«createToString(e as AssociativeEntityClass)»
				«ENDIF»
			}
		'''
	}

	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.MODEL_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}

	def createDefaultConstructor(SimpleEntityClass e) {
		var allIds = e.
			idVariables;
		'''
			public «e.name»(«FOR v : allIds»«IF v.variableTypeClass instanceof SimpleLink»«var a = getTypeFromRelationName(v.variableType, v.variableName)»«a.type.entityName» «a.name»«ELSE»«v.variableType» «v.variableName»«ENDIF»«IF !v.equals(allIds.get(allIds.size-1))», «ENDIF»«ENDFOR») {
				super(«FOR i : e.idVariablesWithoutLink»«i.variableName»«IF !i.equals(e.idVariablesWithoutLink.get(e.idVariablesWithoutLink.size-1))», «ENDIF»«ENDFOR»);
				«FOR v : e.primaryKey»
				«IF v.variableTypeClass instanceof SimpleLink»
					«var l = new SimpleLinkClass(v.variableTypeClass as SimpleLink)»
					«var thisRel = ModelUtils.containsEntity(l.getRelations, e)»
					«IF thisRel != null»
						«IF thisRel.equals(l.getRelations.get(0))»
							Associations.«l.getName».link(this, «v.variableName»);
						«ELSE»
							Associations.«l.getName».link(«v.variableName», this);
						«ENDIF»
					«ENDIF»
				«ENDIF»
				«ENDFOR»
			}
					
		'''
	}

	def createDefaultConstructor(AssociativeEntityClass e) {
		var r1 = e.relations.get(0);
		var r2 = e.relations.get(1);
		'''
			public «e.name»(«r1.type.entityName» «r1.name», «r2.type.entityName» «r2.name») {
				Associations.«e.name»Link.link(«r1.name», «r2.name», this);
			}
			
		'''
	}

	def createImportsDeclarations(ModelEntity e) {
		'''
			«FOR i : e.getSrcImports(StringUtils.remplaceSlashToDot(project))»
				«i»
			«ENDFOR»
		'''
	}

	def createClassDeclaration(ModelEntity e) {
		'''
			«e.srcAnnotations»
			public class «e.entityName» extends «e.superClassName» {
		'''
	}

	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}

	def createEmptyConstructor(ModelEntity e) {
		'''
			«e.entityName»() {}
		'''
	}

	def createMethods(ModelEntity e) {
		'''
			«FOR m : e.srcMethods»
				public «TypeCodeTransformation.instance.types.get(m.methodReturnType)» «m.methodName»(«FOR p : m.methodParameters»«TypeCodeTransformation.instance.types.get(p.variableType)» «p.variableName»«IF !p.equals(m.methodParameters.get(m.methodParameters.size-1))», «ENDIF»«ENDFOR») {
					// TODO Auto-generated method stub
				«IF !m.methodReturnType.equals("void")»	return null;«ENDIF»
				}
				
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
				«e.name» other = («e.name») obj;
				return Objects.equals(«FOR i : e.idVariables»this.get«StringUtils.toUpperFirst(i.variableName)»(), other.get«StringUtils.toUpperFirst(i.variableName)»()«IF !i.equals(e.idVariables.get(e.idVariables.size-1))») && Objects.equals(«ENDIF»«ENDFOR»);
			}
			
		'''
	}

	def createHashCodeEquals(
		AssociativeEntityClass e) {
		'''
			@Override
			public int hashCode() {
				return Objects.hash(«FOR r : e.relations»this.get«StringUtils.toUpperFirst(r.name)»()«IF !r.equals(e.relations.get(e.relations.size-1))», «ENDIF»«ENDFOR»);
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				«e.name» other = («e.name») obj;
				return Objects.equals(«FOR r : e.relations»this.get«StringUtils.toUpperFirst(r.name)»(), other.get«StringUtils.toUpperFirst(r.name)»()«IF !r.equals(e.relations.get(e.relations.size-1))») && Objects.equals(«ENDIF»«ENDFOR»);
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
						return "«e.name» [«FOR v : vars»«v.variableName»=" + this.get«StringUtils.toUpperFirst(v.variableName)»() + "«IF !v.equals(vars.get(vars.size-1))», «ENDIF»«ENDFOR»]";
					}
					
				'''
			}

			def createToString(
				AssociativeEntityClass e) {
				'''
					@Override
					public String toString() {
						return "«e.name» [«FOR r : e.relations»«r.name»=" + this.get«StringUtils.toUpperFirst(r.name)»() + "«IF !r.equals(e.relations.get(e.relations.size-1)) || !e.attributes.isEmpty()», «ENDIF»«ENDFOR»«FOR v : e.attributes»«v.variableName»=" + get«StringUtils.toUpperFirst(v.variableName)»() + "«IF !v.equals(e.attributes.get(e.attributes.size-1))», «ENDIF»«ENDFOR»]";
					}		
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
		}
		