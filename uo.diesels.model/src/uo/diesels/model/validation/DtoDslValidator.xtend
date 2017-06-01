/*
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.validation

import org.eclipse.xtext.validation.Check
import uo.diesels.model.dtoDsl.Dto
import uo.diesels.model.dtoDsl.DtoDslPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DtoDslValidator extends AbstractDtoDslValidator {
	
  	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkDtoStartsWithCapital(Dto dto) {
		if (!Character.isUpperCase(dto.name.charAt(0))) {
			warning('Name should start with a capital', 
					DtoDslPackage.Literals.DTO__NAME,
					INVALID_NAME)
		}
	}
	
}
