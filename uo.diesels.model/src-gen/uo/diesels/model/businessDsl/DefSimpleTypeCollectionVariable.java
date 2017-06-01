/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.businessDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Simple Type Collection Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.businessDsl.DefSimpleTypeCollectionVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.businessDsl.BusinessDslPackage#getDefSimpleTypeCollectionVariable()
 * @model
 * @generated
 */
public interface DefSimpleTypeCollectionVariable extends DefCollectionTypeVariable
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(SimpleTypeCollection)
   * @see uo.diesels.model.businessDsl.BusinessDslPackage#getDefSimpleTypeCollectionVariable_Type()
   * @model containment="true"
   * @generated
   */
  SimpleTypeCollection getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.businessDsl.DefSimpleTypeCollectionVariable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(SimpleTypeCollection value);

} // DefSimpleTypeCollectionVariable
