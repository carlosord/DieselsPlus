/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.persistenceDsl;

import uo.diesels.model.modelDsl.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Return Type Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.persistenceDsl.EntityReturnTypeCollection#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage#getEntityReturnTypeCollection()
 * @model
 * @generated
 */
public interface EntityReturnTypeCollection extends CollectionReturnType
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
   * @see #setType(Entity)
   * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage#getEntityReturnTypeCollection_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.persistenceDsl.EntityReturnTypeCollection#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

} // EntityReturnTypeCollection
