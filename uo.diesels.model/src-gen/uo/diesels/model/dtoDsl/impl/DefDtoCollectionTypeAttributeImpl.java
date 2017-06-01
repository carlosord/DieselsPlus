/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.dtoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uo.diesels.model.dtoDsl.DefDtoCollectionTypeAttribute;
import uo.diesels.model.dtoDsl.DtoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Dto Collection Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.dtoDsl.impl.DefDtoCollectionTypeAttributeImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefDtoCollectionTypeAttributeImpl extends DefDtoAttributeImpl implements DefDtoCollectionTypeAttribute
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefDtoCollectionTypeAttributeImpl()
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
    return DtoDslPackage.Literals.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DtoDslPackage.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION, oldCollection, collection));
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
      case DtoDslPackage.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION:
        return getCollection();
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
      case DtoDslPackage.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION:
        setCollection((String)newValue);
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
      case DtoDslPackage.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
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
      case DtoDslPackage.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION:
        return COLLECTION_EDEFAULT == null ? collection != null : !COLLECTION_EDEFAULT.equals(collection);
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
    result.append(')');
    return result.toString();
  }

} //DefDtoCollectionTypeAttributeImpl
