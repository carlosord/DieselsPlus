package uo.diesels.model.generator.dto

import java.util.ArrayList
import java.util.Date
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.dtoDsl.DtoFor
import uo.diesels.model.generator.dto.util.elements.DtoForClass
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils

class DtoAssemblerGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {			
		// Crea el codigo de la clase
		var sb = new StringBuilder();
		sb.append(compileText);

		// Obtiene el path de la clase
		var entityPath = String.format(PathConstants.DTO_PATH, project, "BaseDtoAssembler");

		// Crea el nuevo fichero
		fsa.generateFile(entityPath, sb.toString);
	}

	def compileText() {
		var dtos = new ArrayList<DtoForClass>();
		for (dto : resource.allContents.toIterable.filter(typeof(DtoFor))) {
			dtos.add(new DtoForClass(dto));
		}
		'''
			«createPackageDeclaration()»
			
			«createImportDeclarations(dtos)»
			
			«createClassDeclaration()»
				
				«createMethods(dtos)»
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.DTO_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportDeclarations(List<DtoForClass> dtos) {
		'''
			«ImportConstants.GENERATED_ANNOTATION_IMPORT»
			«FOR d: dtos»
				«String.format(ImportConstants.DTO_PACKAGE_IMPORT,
					StringUtils.remplaceSlashToDot(project), d.name)»
				«String.format(ImportConstants.MODEL_PACKAGE_IMPORT,
					StringUtils.remplaceSlashToDot(project), d.entity.entityName)»
			«ENDFOR»
		'''
	}
	
	def createClassDeclaration() {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public class BaseDtoAssembler {
		'''
	}
	
	def createDefaultConstructor(DtoForClass d) {
		'''
			public «d.name»(«FOR v : d.attributes»«v.variableType» «v.variableName»«IF !v.equals(d.attributes.get(d.attributes.size-1))», «ENDIF»«ENDFOR») {
			«FOR v : d.attributes»
				this.«v.variableName» = «v.variableName»;
			«ENDFOR»
			}
		'''
	}
	
	def createMethods(List<DtoForClass> dtos) {
		'''
			«FOR d: dtos»
				public static «d.name» fromEntity(«d.entity.entityName» «StringUtils.toLowerFirst(d.entity.entityName)») {
					return new «d.name»(«StringUtils.removeLastChar(d.entity.getDtoAssemblerParameters(StringUtils.toLowerFirst(d.entity.entityName)))»);
				}
				
			«ENDFOR»
		'''
	}
	
}