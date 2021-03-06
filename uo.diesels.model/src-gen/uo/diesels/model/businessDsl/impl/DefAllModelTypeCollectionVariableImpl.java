/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.businessDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uo.diesels.model.businessDsl.AllModelTypeCollection;
import uo.diesels.model.businessDsl.BusinessDslPackage;
import uo.diesels.model.businessDsl.DefAllModelTypeCollectionVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def All Model Type Collection Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.businessDsl.impl.DefAllModelTypeCollectionVariableImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefAllModelTypeCollectionVariableImpl extends DefCollectionTypeVariableImpl implements DefAllModelTypeCollectionVariable
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AllModelTypeCollection type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefAllModelTypeCollectionVariableImpl()
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
    return BusinessDslPackage.Literals.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllModelTypeCollection getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(AllModelTypeCollection newType, NotificationChain msgs)
  {
    AllModelTypeCollection oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AllModelTypeCollection newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE:
        return getType();
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
      case BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE:
        setType((AllModelTypeCollection)newValue);
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
      case BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE:
        setType((AllModelTypeCollection)null);
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
      case BusinessDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //DefAllModelTypeCollectionVariableImpl
