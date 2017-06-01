/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.businessDsl;

import org.eclipse.emf.common.util.EList;

import uo.diesels.model.persistenceDsl.Finder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finder User Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.businessDsl.FinderUserMethod#getFinder <em>Finder</em>}</li>
 *   <li>{@link uo.diesels.model.businessDsl.FinderUserMethod#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.businessDsl.BusinessDslPackage#getFinderUserMethod()
 * @model
 * @generated
 */
public interface FinderUserMethod extends ServiceMethod
{
  /**
   * Returns the value of the '<em><b>Finder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finder</em>' reference.
   * @see #setFinder(Finder)
   * @see uo.diesels.model.businessDsl.BusinessDslPackage#getFinderUserMethod_Finder()
   * @model
   * @generated
   */
  Finder getFinder();

  /**
   * Sets the value of the '{@link uo.diesels.model.businessDsl.FinderUserMethod#getFinder <em>Finder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finder</em>' reference.
   * @see #getFinder()
   * @generated
   */
  void setFinder(Finder value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link uo.diesels.model.businessDsl.DefVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see uo.diesels.model.businessDsl.BusinessDslPackage#getFinderUserMethod_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<DefVariable> getParameters();

} // FinderUserMethod