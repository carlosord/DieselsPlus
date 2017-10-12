package uo.diesels.model.generator.model

import java.util.Date
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.model.util.classes.RelationClass
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.AssociativeEntity
import uo.diesels.model.modelDsl.SimpleLink

class AssociationsGenerator {

	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {
		var sb = new StringBuilder();
		sb.append(createPackageDeclaration);
		sb.append(StringUtils.newLine());
		sb.append(createImportDeclarations);
		sb.append(StringUtils.newLine());
		sb.append(createClassDeclaration);
		sb.append(StringUtils.newLine());
		// Para recorrer los enlaces binarios
		for (link : resource.allContents.toIterable.filter(typeof(SimpleLink))) {
			var l = new SimpleLinkClass(link);
			// Crea el codigo de cada enlace
			sb.append("\t" + l.createBinaryRelation);	
		}
		// Para recorrer las clases asociativas
		for (associativeEntity : resource.allContents.toIterable.filter(typeof(AssociativeEntity))) {
			var e = new AssociativeEntityClass(associativeEntity);
			// Crea el codigo de cada asociacion
			sb.append("\t" + e.createAssociativeBinaryRelation);
		}
		sb.append("}");
		// Obtiene el path de la clase
		var associationsPath = String.format(PathConstants.MODEL_ASSOCIATIONS_CLASS_PATH, project);

		// Crea el nuevo fichero
		fsa.generateFile(associationsPath, sb.toString);
	}

	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.MODEL_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportDeclarations() {
		'''
			«String.format(ImportConstants.GENERATED_ANNOTATION_IMPORT)»
		'''
	}

	def createClassDeclaration() {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public class Associations {
		'''
	}

	def createBinaryRelation(SimpleLinkClass e) {
		'''
			public static class «e.getName» {
				    «createBinaryLinkMethod(e.getRelations)»
				
				    «createBinaryUnlinkMethod(e.getRelations)»
				}
				
		'''
	}
	
	//Por defecto poner siempre las "one" primero
	def createBinaryLinkMethod(List<RelationClass> relations) {
		var r1 = relations.get(0);
		var r2 = relations.get(1);
		'''
			public static void link(«FOR r: relations»«r.type.entityName» «r.name»«IF !r.equals(relations.get(relations.size-1))», «ENDIF»«ENDFOR») {
				«IF (r1.isNavigable)»
					«IF (r1.multiplicity.contains("one"))»
						«r2.name»._set«StringUtils.toUpperFirst(r1.name)»(«StringUtils.toLowerFirst(r1.name)»);					
					«ELSE»
						«r2.name»._get«StringUtils.toUpperFirst(r1.name)»().add(«StringUtils.toLowerFirst(r1.name)»);
					«ENDIF»
				«ENDIF»
				«IF (r2.isNavigable)»
					«IF (r2.multiplicity.contains("one"))»
						«r1.name»._set«StringUtils.toUpperFirst(r2.name)»(«StringUtils.toLowerFirst(r2.name)»);
					«ELSE»
						«r1.name»._get«StringUtils.toUpperFirst(r2.name)»().add(«StringUtils.toLowerFirst(r2.name)»);
					«ENDIF»
				«ENDIF»
			}
		'''
	}
	
	def createBinaryUnlinkMethod(List<RelationClass> relations) {
		var r1 = relations.get(0);
		var r2 = relations.get(1);
		'''
			public static void unlink(«FOR r: relations»«r.type.entityName» «r.name»«IF !r.equals(relations.get(relations.size-1))», «ENDIF»«ENDFOR») {
				«IF (r2.isNavigable)»
					«IF (r2.multiplicity.equals("many") || r2.multiplicity.equals("one-many"))»
						«r1.name»._get«StringUtils.toUpperFirst(r2.name)»().remove(«StringUtils.toLowerFirst(r2.name)»);
					«ELSE»
						«r1.name»._set«StringUtils.toUpperFirst(r2.name)»(null);
					«ENDIF»
				«ENDIF»
				«IF (r1.isNavigable)»
					«IF (r1.multiplicity.equals("many") || r1.multiplicity.equals("one-many"))»
						«r2.name»._get«StringUtils.toUpperFirst(r1.name)»().remove(«StringUtils.toLowerFirst(r1.name)»);
					«ELSE»
						«r2.name»._set«StringUtils.toUpperFirst(r1.name)»(null);
					«ENDIF»
				«ENDIF»
			}
		'''
	}
	
	/* Para relaciones establecidas por clases asociativas */
	def createAssociativeBinaryRelation(AssociativeEntityClass e) {
		'''
			public static class «e.name + "Link"» {
				    «createAssociativeBinaryLinkMethod(e.relations, e.name)»
				
				    «createAssociativeBinaryUnlinkMethod(e.relations, e.name)»
				}
				
		'''
	}
	
	//Por defecto poner siempre las "one" primero
	def createAssociativeBinaryLinkMethod(List<RelationClass> relations, String className) {
		var r1 = relations.get(0);
		var r2 = relations.get(1);
		'''
			public static void link(«FOR r: relations»«r.type.entityName» «r.name», «ENDFOR»«className» «StringUtils.toLowerFirst(className)») {
				«StringUtils.toLowerFirst(className)»._set«StringUtils.toUpperFirst(r1.name)»(«r1.name»);
				«StringUtils.toLowerFirst(className)»._set«StringUtils.toUpperFirst(r2.name)»(«r2.name»);
				«IF (r2.multiplicity.contains("one"))»
					«r1.name»._set«StringUtils.toUpperFirst(r2.name)»(«StringUtils.toLowerFirst(className)»);					
				«ELSE»
					«r1.name»._get«StringUtils.toUpperFirst(r2.name)»().add(«StringUtils.toLowerFirst(className)»);
				«ENDIF»
				«IF (r1.multiplicity.contains("one"))»
					«r2.name»._set«StringUtils.toUpperFirst(r1.name)»(«StringUtils.toLowerFirst(className)»);
				«ELSE»
					«r2.name»._get«StringUtils.toUpperFirst(r1.name)»().add(«StringUtils.toLowerFirst(className)»);
				«ENDIF»
			}
		'''
	}
	
	def createAssociativeBinaryUnlinkMethod(List<RelationClass> relations, String className) {
		var r1 = relations.get(0);
		var r2 = relations.get(1);
		'''
			public static void unlink(«FOR r: relations»«r.type.entityName» «r.name», «ENDFOR»«className» «StringUtils.toLowerFirst(className)») {
				«IF (r2.multiplicity.equals("many") || r2.multiplicity.equals("one-many"))»
					«r1.name»._get«StringUtils.toUpperFirst(r2.name)»().remove(«StringUtils.toLowerFirst(className)»);
				«ELSE»
					«r1.name»._set«StringUtils.toUpperFirst(r2.name)»(null);
				«ENDIF»
				«IF (r1.multiplicity.equals("many") || r1.multiplicity.equals("one-many"))»
					«r2.name»._get«StringUtils.toUpperFirst(r1.name)»().remove(«StringUtils.toLowerFirst(className)»);
				«ELSE»
					«r2.name»._set«StringUtils.toUpperFirst(r1.name)»(null);
				«ENDIF»
				«StringUtils.toLowerFirst(className)»._set«StringUtils.toUpperFirst(r1.name)»(null);
				«StringUtils.toLowerFirst(className)»._set«StringUtils.toUpperFirst(r2.name)»(null);
			}
		'''
	}

}
