/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.persistenceDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uo.diesels.model.persistenceDsl.PersistenceDslPackage;
import uo.diesels.model.persistenceDsl.SimpleTypeCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.persistenceDsl.impl.SimpleTypeCollectionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link uo.diesels.model.persistenceDsl.impl.SimpleTypeCollectionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypeCollectionImpl extends MinimalEObjectImpl.Container implements SimpleTypeCollection
{
  /**
   * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected static final String COLLECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected String collection = COLLECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleTypeCollectionImpl()
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
    return PersistenceDslPackage.Literals.SIMPLE_TYPE_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(String newCollection)
  {
    String oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__COLLECTION, oldCollection, collection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__TYPE, oldType, type));
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
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__COLLECTION:
        return getCollection();
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__TYPE:
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
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__COLLECTION:
        setCollection((String)newValue);
        return;
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__TYPE:
        setType((String)newValue);
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
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__TYPE:
        setType(TYPE_EDEFAULT);
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
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__COLLECTION:
        return COLLECTION_EDEFAULT == null ? collection != null : !COLLECTION_EDEFAULT.equals(collection);
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(" (collection: ");
    result.append(collection);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //SimpleTypeCollectionImpl
