/*
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uo.diesels.model.generator.dto.DtoAssemblerGenerator
import uo.diesels.model.generator.dto.DtoEntityGenerator
import uo.diesels.model.generator.dto.DtoForGenerator
import uo.diesels.model.generator.dto.DtoSrcAssemblerGenerator
import uo.diesels.model.generator.util.ResourceUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DtoDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var project = ResourceUtils.obtainGroupArtifactName(resource);
		
		generateDtoForGenerator(resource, fsa, project);
		generateDtoEntityGenerator(resource, fsa, project);
		generateAssemblerGenerator(resource, fsa, project);
		generateSrcAssemblerGenerator(resource, fsa, project);
	}
	
	def generateDtoEntityGenerator(Resource resource, IFileSystemAccess2 fsa, String project) {
		var dtoEntityGenerator = new DtoEntityGenerator(resource, fsa, project);
		dtoEntityGenerator.compile();
	}
	
	def generateDtoForGenerator(Resource resource, IFileSystemAccess2 fsa, String project) {
		var dtoForGenerator = new DtoForGenerator(resource, fsa, project);
		dtoForGenerator.compile();
	}
	
	def generateAssemblerGenerator(Resource resource, IFileSystemAccess2 fsa, String project) {
		var dtoAssemblerGenerator = new DtoAssemblerGenerator(resource, fsa, project);
		dtoAssemblerGenerator.compile();
	}
	
	def generateSrcAssemblerGenerator(Resource resource, IFileSystemAccess2 fsa, String project) {
		var dtoAssemblerSrcGenerator = new DtoSrcAssemblerGenerator(resource, fsa, project);
		dtoAssemblerSrcGenerator.compile();
	}
	
}
