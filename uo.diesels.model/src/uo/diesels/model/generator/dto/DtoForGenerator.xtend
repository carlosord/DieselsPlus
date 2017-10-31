package uo.diesels.model.generator.dto

import java.util.Date
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.dtoDsl.DtoFor
import uo.diesels.model.generator.common.util.TypeCodeTransformation
import uo.diesels.model.generator.dto.util.elements.DtoForClass
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils

class DtoForGenerator {
	
	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {
		for (dto : resource.allContents.toIterable.filter(typeof(DtoFor))) {
			var d = new DtoForClass(dto);
			
			// Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(d.compileText);

			// Obtiene el path de la clase
			var entityPath = String.format(PathConstants.DTO_PATH, project, d.name)

			// Crea el nuevo fichero
			fsa.generateFile(entityPath, sb.toString);
		}
	}

	def compileText(DtoForClass d) {
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
	
	def createImportDeclarations(DtoForClass d) {
		'''
			«FOR i: d.getImports(StringUtils.remplaceSlashToDot(project))»
				«i»
			«ENDFOR»
		'''
	}
	
	def createClassDeclaration(DtoForClass d) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			public class «d.name» implements Serializable {
		'''
	}
	
	def createEmptyConstructor(DtoForClass d) {
		'''
			public «d.name»() {}
		'''
	}
	
	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}
	
	def createDefaultConstructor(DtoForClass d) {
		'''
			public «d.name»(«FOR v : d.attributes»«TypeCodeTransformation.instance.getTypeFor(v.variableType)» «v.variableName»«IF !v.equals(d.attributes.get(d.attributes.size-1))», «ENDIF»«ENDFOR») {
				«FOR v : d.attributes»
					this.«v.variableName» = «v.variableName»;
				«ENDFOR»
			}
		'''
	}
	
	def createAttributeDeclarations(DtoForClass d) {
		'''
			«FOR a : d.attributes»
				private «TypeCodeTransformation.instance.getTypeFor(a.variableType)» «a.variableName»;
			«ENDFOR»
		'''
	}
	
	def createGettersSetters(DtoForClass d) {
		'''
			«FOR a : d.attributes»			
				public «TypeCodeTransformation.instance.getTypeFor(a.variableType)» get«StringUtils.toUpperFirst(a.variableName)»() {
					return this.«a.variableName»;
				}
				
			«ENDFOR»			
			«FOR a : d.attributes»				
				public void set«StringUtils.toUpperFirst(a.variableName)»(«TypeCodeTransformation.instance.getTypeFor(a.variableType)» «a.variableName») {
					this.«a.variableName» = «a.variableName»;
				}
				
			«ENDFOR»
		'''
	}
	
	def createHashCodeEquals(DtoForClass d) {
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
	
	def createToString(DtoForClass d) {
		'''
			@Override
			public String toString() {
				return "«d.name» [«FOR a : d.attributes»«a.variableName»=" + «a.variableName» + "«IF !a.equals(d.attributes.get(d.attributes.size-1))», «ENDIF»«ENDFOR»]";
			}
			
		'''
	}
	
}