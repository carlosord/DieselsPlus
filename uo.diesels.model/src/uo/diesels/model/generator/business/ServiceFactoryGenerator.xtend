package uo.diesels.model.generator.business

import java.util.ArrayList
import java.util.Date
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.businessDsl.Service
import uo.diesels.model.generator.business.util.elements.ServiceClass
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.StringUtils

class ServiceFactoryGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}
	
	def compile() {			
		//Crea el codigo de la clase
		var sb = new StringBuilder();
		sb.append(compileText);
		
		//Obtiene el path de la clase
		var infrastrucutePath = String.format(PackageConstants.INFRASTRUCTURE_PATH, 
			project, "ServiceFactory");
		
		//Crea el nuevo fichero
		fsa.generateFile(infrastrucutePath, sb.toString);
	}
	
	def compileText() {
		var servicios = new ArrayList<ServiceClass>();
		for (service : resource.allContents.toIterable.filter(typeof(Service))) {
			servicios.add(new ServiceClass(service));
		}
		'''
			«createPackageDeclaration»
			
			«createImportDeclaration(servicios)»
			
			«createClassDeclaration()»
			
				«createMethods(servicios)»
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.INFRASTRUCTURE_PACKAGE,
				StringUtils.remplaceSlashToDot(project)
			)»
		'''
	}
	
	def createImportDeclaration(List<ServiceClass> servicios) {
		'''
			«ImportConstants.GENERATED_ANNOTATION_IMPORT»
			«FOR s: servicios»
				«String.format(ImportConstants.SERVICE_INTERFACE_IMPORT,
					StringUtils.remplaceSlashToDot(project), s.name
				)»
				«String.format(ImportConstants.SERVICE_IMPL_IMPORT,
					StringUtils.remplaceSlashToDot(project), s.name + "Impl"
				)»
			«ENDFOR»
		'''
	}
	
	def createClassDeclaration() {
		'''
			@Generated (
				value = "DieselsCodeGenerator",
				comments = "Generated service factory class",
				date = "«(new Date()).toString»"
			)
			public class ServiceFactory {
		'''
	}
	
	def createMethods(List<ServiceClass> servicios) {
		'''
			«FOR s: servicios»
				public «s.name» create«s.name»() {
					return new «s.name»Impl();
				}
				
			«ENDFOR»
		'''
	}
	
}