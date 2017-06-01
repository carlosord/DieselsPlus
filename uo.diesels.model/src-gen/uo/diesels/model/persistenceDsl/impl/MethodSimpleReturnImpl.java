/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.persistenceDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uo.diesels.model.persistenceDsl.MethodSimpleReturn;
import uo.diesels.model.persistenceDsl.PersistenceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Simple Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.persistenceDsl.impl.MethodSimpleReturnImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link uo.diesels.model.persistenceDsl.impl.MethodSimpleReturnImpl#getNullable <em>Nullable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSimpleReturnImpl extends FinderMethodImpl implements MethodSimpleReturn
{
  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected static final String NULLABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected String nullable = NULLABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodSimpleReturnImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PersistenceDslPackage.Literals.METHOD_SIMPLE_RETURN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistenceDslPackage.METHOD_SIMPLE_RETURN__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(String newNullable)
  {
    String oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistenceDslPackage.METHOD_SIMPLE_RETURN__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__RETURN_TYPE:
        return getReturnType();
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__NULLABLE:
        return getNullable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__RETURN_TYPE:
        setReturnType((String)newValue);
        return;
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__NULLABLE:
        setNullable((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN__NULLABLE:
        return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (returnType: ");
    result.append(returnType);
    result.append(", nullable: ");
    result.append(nullable);
    result.append(')');
    return result.toString();
  }

} //MethodSimpleReturnImpl
