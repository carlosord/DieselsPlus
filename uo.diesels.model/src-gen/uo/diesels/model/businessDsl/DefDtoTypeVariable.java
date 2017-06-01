/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.businessDsl;

import uo.diesels.model.dtoDsl.Dto;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Dto Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.businessDsl.DefDtoTypeVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.businessDsl.BusinessDslPackage#getDefDtoTypeVariable()
 * @model
 * @generated
 */
public interface DefDtoTypeVariable extends DefVariable
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Dto)
   * @see uo.diesels.model.businessDsl.BusinessDslPackage#getDefDtoTypeVariable_Type()
   * @model
   * @generated
   */
  Dto getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.businessDsl.DefDtoTypeVariable#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Dto value);

} // DefDtoTypeVariable