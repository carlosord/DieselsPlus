package uo.diesels.model.generator.model

import java.util.Date
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.Enumerable

class EnumGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}
	
	def compile() {
		for (i : resource.allContents.toIterable.filter(typeof(Enumerable))) {
			//Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(i.compileText);
			
			//Obtiene el path de la clase
			var enumPath = String.format(PathConstants.MODEL_ENUM_PATH, project, i.name)
			
			//Crea el nuevo fichero
			fsa.generateFile(enumPath, sb.toString);
		}
	}

	def compileText(Enumerable e) {
		'''
			«createPackageDeclaration()»
			
			«createImportDeclarations()»
			
			«createClassDeclaration(e.name)»
				«createEnumeratedValues(e.enums)»
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.MODEL_ENUM_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportDeclarations() {
		'''
			«ImportConstants.GENERATED_ANNOTATION_IMPORT»
		'''
	}
	
	def createClassDeclaration(String className) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public enum «className» {
		'''
	}
	
	def createEnumeratedValues(EList<String> enumerables) {
		'''
		    «FOR e: enumerables»
				«e.toString»«IF(!enumerables.get(enumerables.length-1).equals(e))»,«ENDIF»
			«ENDFOR»
		'''
	}
	
}