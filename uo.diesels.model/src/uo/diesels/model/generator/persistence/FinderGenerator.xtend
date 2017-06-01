package uo.diesels.model.generator.persistence

import java.util.Date
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.persistence.util.classes.methods.MethodCollectionReturnClass
import uo.diesels.model.generator.persistence.util.classes.methods.MethodSimpleReturnClass
import uo.diesels.model.generator.persistence.util.elements.FinderClass
import uo.diesels.model.generator.persistence.util.util.FinderMethodImplementations
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.persistenceDsl.Finder
import uo.diesels.model.persistenceDsl.SimpleReturnTypeCollection

class FinderGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}
	
	def compile() {
		for (finder : resource.allContents.toIterable.filter(typeof(Finder))) {
			var f = new FinderClass(finder);
			//Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(f.compileText);
			
			//Obtiene el path de la clase
			var finderPath = String.format(PathConstants.FINDER_PERSISTENCE_PATH, project, f.name);
			
			//Crea el nuevo fichero
			fsa.generateFile(finderPath, sb.toString);
		}
	}
	
	def compileText(FinderClass f) {
		'''
			«createPackageDeclaration»
			
			«createImportDeclaration(f)»
			
			«createClassDeclaration(f)»
			
				«createMethodDeclaration(f)»
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.FINDER_PERSISTENCE_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportDeclaration(FinderClass f) {
		'''
			«FOR i: f.getImports(StringUtils.remplaceSlashToDot(project))»
				«i»
			«ENDFOR»
		'''
	}
	
	def createClassDeclaration(FinderClass f) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public class «f.name» {
		'''
	}
	
	def createMethodDeclaration(FinderClass f) {
		'''
			«FOR m: f.methods»
				«IF ((m instanceof MethodCollectionReturnClass && 
					(m as MethodCollectionReturnClass).returnType instanceof SimpleReturnTypeCollection)
					 || m instanceof MethodSimpleReturnClass) && m.nullable»
					@SuppressWarnings("unchecked")
				«ENDIF»
				public static «m.methodReturnType» «m.methodName»(«FOR p: m.methodParameters»«p.variableType» «p.variableName»«IF (!p.equals(m.methodParameters.get(m.methodParameters.size - 1)))», «ENDIF»«ENDFOR») {
					«m.getImplementation(f.name)»
					«var cont = 1»
					«FOR p: m.methodParameters»
						«String.format(FinderMethodImplementations.getInstance.getImplementations.get("param"), cont++, p.variableName)»
					«ENDFOR»
					«IF (!m.nullable)»
						«FinderMethodImplementations.getInstance.getImplementations.get("singleResult")»
					«ELSE»
						«FinderMethodImplementations.getInstance.getImplementations.get("resultList")»«IF !(m instanceof MethodCollectionReturnClass)»)«ENDIF»;
					«ENDIF»
				}
				
			«ENDFOR»
		'''
	}
	
}