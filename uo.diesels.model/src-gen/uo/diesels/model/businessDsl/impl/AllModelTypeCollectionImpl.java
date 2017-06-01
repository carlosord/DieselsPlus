/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.businessDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uo.diesels.model.businessDsl.AllModelTypeCollection;
import uo.diesels.model.businessDsl.BusinessDslPackage;

import uo.diesels.model.modelDsl.AllModelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Model Type Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.businessDsl.impl.AllModelTypeCollectionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllModelTypeCollectionImpl extends CollectionReturnTypeImpl implements AllModelTypeCollection
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AllModelType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllModelTypeCollectionImpl()
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
    return BusinessDslPackage.Literals.ALL_MODEL_TYPE_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllModelType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (AllModelType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDslPackage.ALL_MODEL_TYPE_COLLECTION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllModelType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AllModelType newType)
  {
    AllModelType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BusinessDslPackage.ALL_MODEL_TYPE_COLLECTION__TYPE, oldType, type));
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
      case BusinessDslPackage.ALL_MODEL_TYPE_COLLECTION__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case BusinessDslPackage.ALL_MODEL_TYPE_COLLECTION__TYPE:
        setType((AllModelType)newValue);
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
      case BusinessDslPackage.ALL_MODEL_TYPE_COLLECTION__TYPE:
        setType((AllModelType)null);
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
      case BusinessDslPackage.ALL_MODEL_TYPE_COLLECTION__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //AllModelTypeCollectionImpl
