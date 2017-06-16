/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.modelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Collection Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.modelDsl.DefCollectionTypeVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.modelDsl.ModelDslPackage#getDefCollectionTypeVariable()
 * @model
 * @generated
 */
public interface DefCollectionTypeVariable extends DefVariable
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
   * @see #setType(CollectionReturnType)
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getDefCollectionTypeVariable_Type()
   * @model containment="true"
   * @generated
   */
  CollectionReturnType getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.modelDsl.DefCollectionTypeVariable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(CollectionReturnType value);

} // DefCollectionTypeVariable
