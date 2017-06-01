/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.modelDsl.Enumerable#getEnums <em>Enums</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.modelDsl.ModelDslPackage#getEnumerable()
 * @model
 * @generated
 */
public interface Enumerable extends ModelType
{
  /**
   * Returns the value of the '<em><b>Enums</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' attribute list.
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getEnumerable_Enums()
   * @model unique="false"
   * @generated
   */
  EList<String> getEnums();

} // Enumerable