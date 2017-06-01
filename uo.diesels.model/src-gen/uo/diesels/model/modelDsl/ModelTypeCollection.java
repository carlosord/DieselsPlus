/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.modelDsl.ModelTypeCollection#getCollection <em>Collection</em>}</li>
 *   <li>{@link uo.diesels.model.modelDsl.ModelTypeCollection#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.modelDsl.ModelDslPackage#getModelTypeCollection()
 * @model
 * @generated
 */
public interface ModelTypeCollection extends EObject
{
  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(String)
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getModelTypeCollection_Collection()
   * @model
   * @generated
   */
  String getCollection();

  /**
   * Sets the value of the '{@link uo.diesels.model.modelDsl.ModelTypeCollection#getCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #getCollection()
   * @generated
   */
  void setCollection(String value);

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
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getModelTypeCollection_Type()
   * @model
   * @generated
   */
  ModelType getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.modelDsl.ModelTypeCollection#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ModelType value);

} // ModelTypeCollection
