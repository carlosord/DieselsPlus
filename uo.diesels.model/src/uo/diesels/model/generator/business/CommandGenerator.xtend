package uo.diesels.model.generator.business

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.business.util.BusinessMethod
import uo.diesels.model.generator.business.util.elements.ServiceClass
import uo.diesels.model.generator.common.util.TypeCodeTransformation
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.ResourceUtils
import uo.diesels.model.generator.util.StringUtils

class CommandGenerator {

	Resource resource;
	IFileSystemAccess fsa;
	String project;
	ServiceClass service;

	new(Resource resource, IFileSystemAccess fsa, String project, ServiceClass s) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
		this.service = s;
	}

	def compile() {
		for (m : service.methods) {
			if (m.methodKeyword == null) {
				// Crea el codigo de la clase
				var sb = new StringBuilder();
				sb.append(m.compileText);

				// Obtiene el path de la clase
				var commandPath = String.format(PathConstants.SERVICE_BUSINESS_IMPL_COMMAND_PATH, project,
					StringUtils.toLowerFirst(service.name), StringUtils.toUpperFirst(m.methodName) + "Command");

				var path = new Path(
					String.format(PathConstants.SERVICE_BUSINESS_IMPL_COMMAND_PATH_PROJECT, project,
						StringUtils.toLowerFirst(service.name), StringUtils.toUpperFirst(m.methodName) + "Command"));
				if (!ResourcesPlugin.getWorkspace().getRoot()
						.getProject(ResourceUtils.obtainProjectName(resource))
						.getFile(path).exists())
					fsa.generateFile(commandPath, sb.toString);
			}
		}
	}

	def compileText(BusinessMethod m) {
		'''
			«createPackageDeclaration()»
			
			«createImportDeclaration(m)»
			
			«createClassDeclaration(m)»
			
				«IF !m.methodParameters.isEmpty()»
					«createAttributeDeclarations(m)»
					«createDefaultConstructor(m)»
				«ENDIF»			
				«createMethodDeclaration(m)»
			
			}
		'''
	}

	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.SERVICE_BUSINESS_IMPL_COMMAND_PACKAGE,
				StringUtils.remplaceSlashToDot(project), StringUtils.toLowerFirst(service.name)
			)»
		'''
	}

	def createImportDeclaration(BusinessMethod m) {
		'''
			«FOR i : m.getImports(StringUtils.remplaceSlashToDot(project), "src", StringUtils.toLowerFirst(service.name))»
				«i»
			«ENDFOR»
		'''
	}

	def createClassDeclaration(BusinessMethod m) {
		'''
			public class «StringUtils.toUpperFirst(m.methodName)»Command implements Command<«StringUtils.toUpperFirst(m.methodReturnType)»> {
		'''
	}

	def createAttributeDeclarations(BusinessMethod m) {
		'''
			«FOR p : m.methodParameters»
				private «TypeCodeTransformation.instance.getTypeFor(p.variableType)» «p.variableName»;
			«ENDFOR»
			
		'''
	}

	def createDefaultConstructor(BusinessMethod m) {
		'''
			public «StringUtils.toUpperFirst(m.methodName)»Command(«FOR p : m.methodParameters»«TypeCodeTransformation.instance.getTypeFor(p.variableType)» «p.variableName»«IF !p.equals(m.methodParameters.get(m.methodParameters.size-1))», «ENDIF»«ENDFOR») {
				«FOR p : m.methodParameters»
					this.«p.variableName» = «p.variableName»;
				«ENDFOR»
			}
			
		'''
	}

	def createMethodDeclaration(BusinessMethod m) {
		'''
			@Override
			public «StringUtils.toUpperFirst(TypeCodeTransformation.instance.getTypeFor(m.methodReturnType))» execute() throws BusinessException {
				// TODO Auto-generated method stub
				return null;
			}
		'''
	}
}
