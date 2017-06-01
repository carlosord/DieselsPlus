/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.modelDsl.SimpleLink#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.modelDsl.ModelDslPackage#getSimpleLink()
 * @model
 * @generated
 */
public interface SimpleLink extends Element, Link
{
  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link uo.diesels.model.modelDsl.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getSimpleLink_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelations();

} // SimpleLink