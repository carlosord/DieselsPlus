package uo.diesels.model.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uo.diesels.model.generator.model.AssociationsGenerator
import uo.diesels.model.generator.model.EntityGenerator
import uo.diesels.model.generator.model.EntityLinkGenerator
import uo.diesels.model.generator.model.EnumGenerator
import uo.diesels.model.generator.model.ValueTypeGenerator
import uo.diesels.model.generator.util.ResourceUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ModelDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var project = ResourceUtils.obtainGroupArtifactName(resource);
        
		generateEnumerables(resource, fsa, project);
		generateValueTypes(resource, fsa, project);
		generateEntities(resource, fsa, project);
		generateEntityLinks(resource, fsa, project);
		generateAssociations(resource, fsa, project);
	}
	
	def generateEnumerables(Resource resource, IFileSystemAccess2 fsa, String project) {
		var enumGenerator = new EnumGenerator(resource, fsa, project);
		enumGenerator.compile();
	}
	
	def generateValueTypes(Resource resource, IFileSystemAccess2 fsa, String project) {
		var valueTypeGenerator = new ValueTypeGenerator(resource, fsa, project);
		valueTypeGenerator.compile();
	}
	
	def generateEntities(Resource resource, IFileSystemAccess2 fsa, String project) {
		var entityGenerator = new EntityGenerator(resource, fsa, project);
		entityGenerator.compile();
	}
	
	def generateEntityLinks(Resource resource, IFileSystemAccess2 fsa, String project) {
		var entityLinkGenerator = new EntityLinkGenerator(resource, fsa, project);
		entityLinkGenerator.compile();
	}
	
	def generateAssociations(Resource resource, IFileSystemAccess2 fsa, String project) {
		var associationsGenerator = new AssociationsGenerator(resource, fsa, project);
		associationsGenerator.compile();
	}
	
}
