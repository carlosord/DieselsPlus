package uo.diesels.model.generator.model

import java.util.Date
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.AssociativeEntity
import uo.diesels.model.modelDsl.Relation
import uo.diesels.model.modelDsl.SimpleEntity

class EntityLinkKeyGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;
	AssociativeEntity entity;

	new(Resource resource, IFileSystemAccess fsa, String project, AssociativeEntity e) {
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
		var className = entity.name + "Key";
		var keyPath = String.format(PathConstants.MODEL_KEY_PATH, project, className);

		// Crea el nuevo fichero
		fsa.generateFile(keyPath, sb.toString);
	}
	
	def compileText(AssociativeEntity e) {
		var className = e.name + "Key";
		'''
			«createPackageDeclaration()»
			
			«createImportsDeclarations()»
			
			«createClassDeclaration(className)»			
				«createSerialVersionDeclaration»
				
				«createIdsDeclaration(e.relations)»
				
				«createDefaultConstructor(className, e.relations)»
				
				«createHashCodeEquals(className, e.relations)»
			}
		'''		
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.MODEL_KEY_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportsDeclarations() {
		'''
			«String.format(ImportConstants.GENERATED_ANNOTATION_IMPORT)»
			«String.format(ImportConstants.SERIALIZABLE_IMPORT)»
			«String.format(ImportConstants.OBJECTS_IMPORT)»
		'''
	}
	
	def createClassDeclaration(String className) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public class «className» implements Serializable {
		'''
	}
	
	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}
	
	def createIdsDeclaration(EList<Relation> relations) {
		'''
			«FOR r: relations»
				«IF r.type instanceof SimpleEntity»
					Long «r.name»;
				«ELSE»
					«r.type.name»Key «r.name»;
				«ENDIF»
			«ENDFOR»
		'''
	}
	
	def createDefaultConstructor(String className, EList<Relation> relations) {
		'''
			public «className»(«FOR r: relations»«IF r.type instanceof SimpleEntity»Long «r.name»«ELSE»«r.type.name»Key «r.name»«ENDIF»«IF !r.equals(relations.get(relations.size-1 ))», «ENDIF»«ENDFOR») {
				«FOR r: relations»
					this.«r.name» = «r.name»;
				«ENDFOR»
			}
		'''
	}
	
	def createHashCodeEquals(String className, EList<Relation> relations) {
		'''
			@Override
			public int hashCode() {
				return Objects.hash(«FOR r: relations»«r.name»«IF !r.equals(relations.get(relations.size-1))», «ENDIF»«ENDFOR»);
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				«className» other = («className») obj;
				return Objects.equals(«FOR r: relations»«r.name», other.«r.name»«IF !r.equals(relations.get(relations.size-1))») && Objects.equals(«ENDIF»«ENDFOR»);
			}
			
		'''
	}
	
}
