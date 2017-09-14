package uo.diesels.model.generator.business

import java.util.Date
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.businessDsl.Service
import uo.diesels.model.generator.business.util.BusinessMethod
import uo.diesels.model.generator.business.util.classes.methods.JpaMethodClass
import uo.diesels.model.generator.business.util.elements.ServiceClass
import uo.diesels.model.generator.business.util.util.BusinessMethodImplementations
import uo.diesels.model.generator.business.util.util.BusinessUtils
import uo.diesels.model.generator.common.util.TypeCodeTransformation
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.AssociativeEntity

class ServiceImplGenerator {
	
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
			var serviceImplPath = String.format(PathConstants.SERVICE_BUSINESS_IMPL_PATH,
				project, s.implName);
			
			//Crea el nuevo fichero
			fsa.generateFile(serviceImplPath, sb.toString);
			
			if (BusinessUtils.hasUserMethods(s)) {
				var command = new CommandGenerator(resource, fsa, project, s);
				command.compile;
			}
		}
	}
	
	def compileText(ServiceClass s) {
		'''
			«createPackageDeclaration»
			
			«createImportDeclaration(s)»
			
			«createClassDeclaration(s)»
			
				«createMethodDeclaration(s.methods)»
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.SERVICE_BUSINESS_IMPL_PACKAGE,
				StringUtils.remplaceSlashToDot(project)
			)»
		'''
	}
	
	def createImportDeclaration(ServiceClass s) {
		'''
			«FOR i: s.getImports(StringUtils.remplaceSlashToDot(project), "impl")»
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
			public class «s.implName» implements «s.name» {
		'''
	}
	
	def createMethodDeclaration(List<BusinessMethod> methods) {
		'''
			«FOR m: methods»
				@Override
				public «TypeCodeTransformation.instance.types.get(m.methodReturnType)» «m.methodName»(«FOR p: m.methodParameters»«TypeCodeTransformation.instance.types.get(p.variableType)» «p.variableName»«IF (!p.equals(m.methodParameters.get(m.methodParameters.size - 1)))», «ENDIF»«ENDFOR») throws BusinessException {
					«IF m.methodKeyword != null»
						Command<«StringUtils.toUpperFirst(TypeCodeTransformation.instance.types.get(m.methodReturnType))»> c = new Command<«StringUtils.toUpperFirst(TypeCodeTransformation.instance.types.get(m.methodReturnType))»>() {			
							@Override
							public «StringUtils.toUpperFirst(TypeCodeTransformation.instance.types.get(m.methodReturnType))» execute() throws BusinessException {
								«IF m.methodKeyword.equals("delete")»							
									«(m as JpaMethodClass).keyword = "find"»
									«var entity = (m as JpaMethodClass).entity»
									«var entityName = (m as JpaMethodClass).entityName»
									«IF entity instanceof AssociativeEntity»
										«entityName» «StringUtils.toLowerFirst(entityName)» = «String.format(BusinessMethodImplementations.getInstance.getImplementations.get("find"), entityName + ".class", "new " + entityName + "Key(" + m.parametersToServiceMethod + ")")»
									«ELSE»
										«entityName» «StringUtils.toLowerFirst(entityName)» = «String.format(BusinessMethodImplementations.getInstance.getImplementations.get("find"), entityName + ".class", m.parametersToServiceMethod)»
									«ENDIF»
									«(m as JpaMethodClass).keyword = "delete"»
									«String.format(BusinessMethodImplementations.getInstance.getImplementations.get(m.methodKeyword), StringUtils.toLowerFirst((m as JpaMethodClass).entityName))»
								«ENDIF»
								«IF m.methodKeyword.equals("find")»
									«var entity = (m as JpaMethodClass).entity»
									«var entityName = (m as JpaMethodClass).entityName»
									«IF entity instanceof AssociativeEntity»
										return «String.format(BusinessMethodImplementations.getInstance.getImplementations.get("find"), entityName + ".class", "new " + entityName + "Key(" + m.parametersToServiceMethod + ")")»
									«ELSE»
										return «String.format(BusinessMethodImplementations.getInstance.getImplementations.get("find"), entityName + ".class", m.parametersToServiceMethod)»
									«ENDIF»
								«ENDIF»
								«IF (m.methodKeyword.equals("save") || m.methodKeyword.equals("update"))»			
									«String.format(BusinessMethodImplementations.getInstance.getImplementations.get(m.methodKeyword), m.parametersToServiceMethod)»
								«ENDIF»
								«IF (m.methodKeyword.equals("finder"))»
									«IF (!m.methodReturnType.equals("void"))»return «ENDIF»«String.format(BusinessMethodImplementations.getInstance.getImplementations.get(m.methodKeyword), m.methodFinderName, m.methodName, m.parametersToServiceMethod)»
								«ENDIF»
								«IF (m.methodReturnType.equals("void"))»
									return null;
								«ENDIF»
							}
						};
						«IF !m.methodReturnType.equals("void")»return «ENDIF»CommandExecutor.execute(c);
					«ELSE»
						«IF !m.methodReturnType.equals("void")»return «ENDIF»CommandExecutor.execute(new «StringUtils.toUpperFirst(m.methodName)»Command(«m.parametersToServiceMethod»));
					«ENDIF»
				}
				
			«ENDFOR»
		'''
	}
	
}