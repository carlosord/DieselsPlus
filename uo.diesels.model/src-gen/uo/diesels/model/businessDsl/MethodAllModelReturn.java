/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.businessDsl;

import uo.diesels.model.modelDsl.AllModelType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method All Model Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.businessDsl.MethodAllModelReturn#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.businessDsl.BusinessDslPackage#getMethodAllModelReturn()
 * @model
 * @generated
 */
public interface MethodAllModelReturn extends FinderUserMethod
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' reference.
   * @see #setReturnType(AllModelType)
   * @see uo.diesels.model.businessDsl.BusinessDslPackage#getMethodAllModelReturn_ReturnType()
   * @model
   * @generated
   */
  AllModelType getReturnType();

  /**
   * Sets the value of the '{@link uo.diesels.model.businessDsl.MethodAllModelReturn#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(AllModelType value);

} // MethodAllModelReturn
