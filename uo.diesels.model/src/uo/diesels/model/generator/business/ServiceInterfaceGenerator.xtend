package uo.diesels.model.generator.business

import java.util.Date
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.businessDsl.Service
import uo.diesels.model.generator.business.util.elements.ServiceClass
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils

class ServiceInterfaceGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}
	
	def compile() {
		for (service : resource.allContents.toIterable.filter(typeof(Service))) {
			var s = new ServiceClass(service);
			//Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(s.compileText);
			
			//Obtiene el path de la clase
			var serviceInterfacePath = String.format(PathConstants.SERVICE_BUSINESS_PATH,
				project, s.name);
			
			//Crea el nuevo fichero
			fsa.generateFile(serviceInterfacePath, sb.toString);
		}
	}
	
	def compileText(ServiceClass s) {
		'''
			«createPackageDeclaration»
			
			«createImportDeclaration(s)»
			
			«createClassDeclaration(s)»
			
				«createMethodDeclaration(s)»
			
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.SERVICE_BUSINESS_PACKAGE,
				StringUtils.remplaceSlashToDot(project)
			)»
		'''
	}
	
	def createImportDeclaration(ServiceClass s) {
		'''
			«FOR i: s.getImports(StringUtils.remplaceSlashToDot(project), "interface")»
				«i»
			«ENDFOR»
		'''
	}
	
	def createClassDeclaration(ServiceClass s) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public interface «s.name» {
		'''
	}
	
	def createMethodDeclaration(ServiceClass s) {
		'''
			«FOR m: s.methods»
				public «m.methodReturnType» «m.methodName»(«FOR p: m.methodParameters»«p.variableType» «p.variableName»«IF (!p.equals(m.methodParameters.get(m.methodParameters.size - 1)))», «ENDIF»«ENDFOR») throws BusinessException;
			«ENDFOR»
		'''
	}
	
}