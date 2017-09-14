package uo.diesels.model.generator.model

import java.util.Date
import java.util.HashSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import uo.diesels.model.generator.common.util.TypeCodeTransformation
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass
import uo.diesels.model.generator.model.util.elements.ValueTypeClass
import uo.diesels.model.generator.model.util.util.JPAAnnotations
import uo.diesels.model.generator.model.util.util.ModelUtils
import uo.diesels.model.generator.util.PackageConstants
import uo.diesels.model.generator.util.PathConstants
import uo.diesels.model.generator.util.StringUtils
import uo.diesels.model.modelDsl.ValueType

class ValueTypeGenerator {

	Resource resource;
	IFileSystemAccess fsa;
	String project;

	new(Resource resource, IFileSystemAccess fsa, String project) {
		this.resource = resource;
		this.fsa = fsa;
		this.project = project;
	}

	def compile() {
		for (valueType : resource.allContents.toIterable.filter(typeof(ValueType))) {
			var v = new ValueTypeClass(valueType);
			// Crea el codigo de la clase
			var sb = new StringBuilder();
			sb.append(v.compileText);

			// Obtiene el path de la clase
			var valueTypePath = String.format(PathConstants.MODEL_VALUE_TYPE_PATH, project, v.name)

			// Crea el nuevo fichero
			fsa.generateFile(valueTypePath, sb.toString);
		}
	}

	def compileText(ValueTypeClass v) '''
		«createPackageDeclaration()»
			
		«createImportsDeclarations(v)»
			
		«createClassDeclaration(v)»
			«createSerialVersionDeclaration»
		
			«createAtributteDeclarations(v)»
			
			«createEmptyConstructor(v)»
			
			«createDefaultConstructor(v)»
			
			«createGettersSetters(v)»
			«createHashCodeEquals(v)»
			«createToString(v)»
		}
	'''

	def createPackageDeclaration() {
		'''
			«String.format(PackageConstants.MODEL_VALUE_TYPE_PACKAGE, StringUtils.remplaceSlashToDot(project))»
		'''
	}
	
	def createImportsDeclarations(ValueTypeClass value) {
		var imports = new HashSet<String>(value.getImports(StringUtils.remplaceSlashToDot(project)));
		for (v: value.attributes) {
			if (v.variableTypeClass instanceof ValueType) {
				if (ModelUtils.containsOtherValueTypeLike(value.attributes, v) || v.nullable) {
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(1));
					imports.add(JPAAnnotations.getInstance.getAnnotations.get("attributeOverride").get(1));
				}
			}
		}
		'''
			«FOR i: imports»
				«i»
			«ENDFOR»
		'''
	}

	def createClassDeclaration(ValueTypeClass v) {
		'''
			@Generated(
				value = "DieselsCodeGenerator",
				comments = "Generated business service class",
				date = "«(new Date()).toString»"
			)
			«v.annotations»
			public class «v.name» implements Serializable {
		'''
	}
	
	def createSerialVersionDeclaration() {
		'''
			private static final long serialVersionUID = 1L;
		'''
	}

	def createAtributteDeclarations(ValueTypeClass value) {
		'''			
			«FOR v: value.attributes»
				«v.annotations»
				«IF(v.variableTypeClass instanceof ValueType)»
					«IF ModelUtils.containsOtherValueTypeLike(value.attributes, v)»
						«JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)»( {
							«StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
								new ValueTypeClass(v.variableTypeClass as ValueType), "", v.variableName + "_",
								v.nullable, false))»
						} )
					«ELSE»
						«IF v.nullable»
							«JPAAnnotations.getInstance.getAnnotations.get("attributeOverrides").get(0)»( {
								«StringUtils.removeLastChar(ModelUtils.putAttributeOverrideAnnotation(
									new ValueTypeClass(v.variableTypeClass as ValueType), "", "", true, true))»
							} )
						«ENDIF»
					«ENDIF»
				«ENDIF»
				private «TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName»;
			«ENDFOR»	
		'''
	}

	def createEmptyConstructor(ValueTypeClass v) {
		'''
			public «v.name»() {}
		'''
	}
	
	def createDefaultConstructor(ValueTypeClass value) {
		'''
			public «value.name»(«FOR v : value.attributes»«TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName»«IF !v.equals(value.attributes.get(value.attributes.size-1))», «ENDIF»«ENDFOR») {
				«FOR v : value.attributes»
					«IF !(v instanceof ModelTypeCollectionVariableClass) && !(v instanceof SimpleTypeCollectionVariableClass)»
						this.«v.variableName» = «v.variableName»;
					«ELSE»
						this.«v.variableName» = «ModelUtils.getCollectionInitialize(v.variableType)»(«v.variableName»);
					«ENDIF»
				«ENDFOR»
			}
		'''
	}

	def createGettersSetters(ValueTypeClass value) {
		'''
			«FOR v : value.attributes»			
				public «TypeCodeTransformation.instance.types.get(v.variableType)» get«StringUtils.toUpperFirst(v.variableName)»() {
					return this.«v.variableName»;
				}
				
			«ENDFOR»			
			«FOR v : value.attributes»				
				public void set«StringUtils.toUpperFirst(v.variableName)»(«TypeCodeTransformation.instance.types.get(v.variableType)» «v.variableName») {
					this.«v.variableName» = «v.variableName»;
				}
				
			«ENDFOR»		
		'''
	}

	def createHashCodeEquals(ValueTypeClass value) {
		'''
			@Override
			public int hashCode() {
				return Objects.hash(«FOR v : value.attributes»«v.variableName»«IF !v.equals(value.attributes.get(value.attributes.size-1))», «ENDIF»«ENDFOR»);
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				«value.name» other = («value.name») obj;
				return Objects.equals(«FOR v : value.attributes»«v.variableName», other.«v.variableName»«IF !v.equals(value.attributes.get(value.attributes.size-1))») && Objects.equals(«ENDIF»«ENDFOR»);
			}
			
		'''
	}

	def createToString(ValueTypeClass value) {
		'''
			@Override
			public String toString() {
				return "«value.name» [«FOR v : value.attributes»«v.variableName»=" + «v.variableName» + "«IF !v.equals(value.attributes.get(value.attributes.size-1))», «ENDIF»«ENDFOR»]";
			}
			
		'''
	}

}
