/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Simple Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.modelDsl.DefSimpleVariable#getNullable <em>Nullable</em>}</li>
 *   <li>{@link uo.diesels.model.modelDsl.DefSimpleVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uo.diesels.model.modelDsl.ModelDslPackage#getDefSimpleVariable()
 * @model
 * @generated
 */
public interface DefSimpleVariable extends DefAttribute, DefVariable, DefIdAttribute
{
  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(String)
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getDefSimpleVariable_Nullable()
   * @model
   * @generated
   */
  String getNullable();

  /**
   * Sets the value of the '{@link uo.diesels.model.modelDsl.DefSimpleVariable#getNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #getNullable()
   * @generated
   */
  void setNullable(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uo.diesels.model.modelDsl.ModelDslPackage#getDefSimpleVariable_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uo.diesels.model.modelDsl.DefSimpleVariable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // DefSimpleVariable
