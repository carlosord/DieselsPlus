package uo.diesels.model.generator.dto

import java.io.File
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.dtoDsl.DtoFor
import uo.diesels.model.generator.dto.util.elements.DtoForClass
import uo.diesels.model.generator.util.ImportConstants
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.ResourceUtils
import uo.diesels.model.generator.util.StringUtils

class DtoSrcAssemblerGenerator {
	
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
		var dtoAssemblerPath = String.format(PathConstants.DTO_SRC_PATH, project, "DtoAssembler");

		// Intenta borrar el fichero, en caso de que exista para crear uno nuevo
		var fichero = new File(dtoAssemblerPath);
		fichero.delete();

		var path = new Path(String.format(PathConstants.DTO_SRC_PATH_PROJECT, project, "DtoAssembler"));
		if (!ResourcesPlugin.getWorkspace().getRoot().getProject(ResourceUtils.obtainProjectName(resource))
				.getFile(path).exists())
			fsa.generateFile(dtoAssemblerPath, sb.toString);
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
			public class DtoAssembler extends BaseDtoAssembler {
		'''
	}
	
	def createMethods(List<DtoForClass> dtos) {
		'''
			«FOR d: dtos»
				public static «d.entity.entityName» toEntity(«d.name» «StringUtils.toLowerFirst(d.name)») {
					// TODO Auto-generated method stub
					return null;
				}
				
			«ENDFOR»
		'''
	}
	
}