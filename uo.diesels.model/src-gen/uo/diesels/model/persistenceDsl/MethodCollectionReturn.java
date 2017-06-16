/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.persistenceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Collection Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.persistenceDsl.MethodCollectionReturn#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage#getMethodCollectionReturn()
 * @model
 * @generated
 */
public interface MethodCollectionReturn extends FinderMethod
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(CollectionReturnType)
   * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage#getMethodCollectionReturn_ReturnType()
   * @model containment="true"
   * @generated
   */
  CollectionReturnType getReturnType();

  /**
   * Sets the value of the '{@link uo.diesels.model.persistenceDsl.MethodCollectionReturn#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(CollectionReturnType value);

} // MethodCollectionReturn
