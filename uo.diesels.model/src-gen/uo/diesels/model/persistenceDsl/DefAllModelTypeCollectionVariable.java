/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.persistenceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def All Model Type Collection Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.persistenceDsl.DefAllModelTypeCollectionVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage#getDefAllModelTypeCollectionVariable()
 * @model
 * @generated
 */
public interface DefAllModelTypeCollectionVariable extends DefCollectionTypeVariable
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
   * @see #setType(AllModelTypeCollection)
   * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage#getDefAllModelTypeCollectionVariable_Type()
   * @model containment="true"
   * @generated
   */
  AllModelTypeCollection getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.persistenceDsl.DefAllModelTypeCollectionVariable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AllModelTypeCollection value);

} // DefAllModelTypeCollectionVariable
