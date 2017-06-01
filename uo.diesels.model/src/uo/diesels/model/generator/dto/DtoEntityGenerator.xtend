package uo.diesels.model.generator.dto

import java.util.Date
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.dtoDsl.DtoEntity
import uo.diesels.model.generator.dto.util.elements.DtoEntityClass
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils

class DtoEntityGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {
		for (dto : resource.allContents.toIterable.filter(typeof(DtoEntity))) {
			var d = new DtoEntityClass(dto);
			
			// Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(d.compileText);

			// Obtiene el path de la clase
			var dtoPath = String.format(PathConstants.DTO_PATH, project, d.name)

			// Crea el nuevo fichero
			fsa.generateFile(dtoPath, sb.toString);
		}
	}

	def compileText(DtoEntityClass d) {
		'''
			«createPackageDeclaration()»
			
			«createImportDeclarations(d)»
			
			«createClassDeclaration(d)»
				«createSerialVersionDeclaration»
			
				«createAttributeDeclarations(d)»
				
				«createEmptyConstructor(d)»
				
				«createDefaultConstructor(d)»
				
				«createGettersSetters(d)»
				«createHashCodeEquals(d)»
				«createToString(d)»
			}
		'''
	}
	
	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.DTO_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportDeclarations(DtoEntityClass d) {
		'''
			«FOR i: d.getImports(StringUtils.remplaceSlashToDot(project))»
				«i»
			«ENDFOR»
		'''
	}
	
	def createClassDeclaration(DtoEntityClass d) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public class «d.name» implements Serializable {
		'''
	}
	
	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}
	
	def createEmptyConstructor(DtoEntityClass d) {
		'''
			public «d.name»() {}
		'''
	}
	
	def createDefaultConstructor(DtoEntityClass d) {
		'''
			public «d.name»(«FOR v : d.attributes»«v.variableType» «v.variableName»«IF !v.equals(d.attributes.get(d.attributes.size-1))», «ENDIF»«ENDFOR») {
				«FOR v : d.attributes»
					this.«v.variableName» = «v.variableName»;
				«ENDFOR»
			}
		'''
	}
	
	def createAttributeDeclarations(DtoEntityClass d) {
		'''
			«FOR a : d.attributes»
				private «a.variableType» «a.variableName»;
			«ENDFOR»
		'''
	}
	
	def createGettersSetters(DtoEntityClass d) {
		'''
			«FOR a : d.attributes»			
				public «a.variableType» get«StringUtils.toUpperFirst(a.variableName)»() {
					return this.«a.variableName»;
				}
				
			«ENDFOR»			
			«FOR a : d.attributes»				
				public void set«StringUtils.toUpperFirst(a.variableName)»(«a.variableType» «a.variableName») {
					this.«a.variableName» = «a.variableName»;
				}
				
			«ENDFOR»		
		'''
	}
	
	def createHashCodeEquals(DtoEntityClass d) {
		'''
			@Override
			public int hashCode() {
				return Objects.hash(«FOR a : d.attributes»«a.variableName»«IF !a.equals(d.attributes.get(d.attributes.size-1))», «ENDIF»«ENDFOR»);
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				«d.name» other = («d.name») obj;
				return Objects.equals(«FOR a : d.attributes»«a.variableName», other.«a.variableName»«IF !a.equals(d.attributes.get(d.attributes.size-1))») && Objects.equals(«ENDIF»«ENDFOR»);
			}
			
		'''
	}
	
	def createToString(DtoEntityClass d) {
		'''
			@Override
			public String toString() {
				return "«d.name» [«FOR a : d.attributes»«a.variableName»=" + «a.variableName» + "«IF !a.equals(d.attributes.get(d.attributes.size-1))», «ENDIF»«ENDFOR»]";
			}
			
		'''
	}	
	
}