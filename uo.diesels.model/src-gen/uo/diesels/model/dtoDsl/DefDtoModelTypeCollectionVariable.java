/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.dtoDsl;

import uo.diesels.model.modelDsl.ModelType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Dto Model Type Collection Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.dtoDsl.DtoDslPackage#getDefDtoModelTypeCollectionVariable()
 * @model
 * @generated
 */
public interface DefDtoModelTypeCollectionVariable extends DefDtoCollectionTypeAttribute
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
   * @see #setType(ModelType)
   * @see uo.diesels.model.dtoDsl.DtoDslPackage#getDefDtoModelTypeCollectionVariable_Type()
   * @model
   * @generated
   */
  ModelType getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ModelType value);

} // DefDtoModelTypeCollectionVariable
