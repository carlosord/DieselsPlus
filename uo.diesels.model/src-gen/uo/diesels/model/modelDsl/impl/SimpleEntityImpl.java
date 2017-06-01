/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uo.diesels.model.modelDsl.DefIdAttribute;
import uo.diesels.model.modelDsl.ModelDslPackage;
import uo.diesels.model.modelDsl.SimpleEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uo.diesels.model.modelDsl.impl.SimpleEntityImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link uo.diesels.model.modelDsl.impl.SimpleEntityImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uo.diesels.model.modelDsl.impl.SimpleEntityImpl#getAttributesId <em>Attributes Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleEntityImpl extends EntityImpl implements SimpleEntity
{
  /**
   * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected static final String IMPLEMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected String implementation = IMPLEMENTATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClass()
   * @generated
   * @ordered
   */
  protected SimpleEntity superClass;

  /**
   * The cached value of the '{@link #getAttributesId() <em>Attributes Id</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributesId()
   * @generated
   * @ordered
   */
  protected EList<DefIdAttribute> attributesId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleEntityImpl()
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
    return ModelDslPackage.Literals.SIMPLE_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplementation()
  {
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementation(String newImplementation)
  {
    String oldImplementation = implementation;
    implementation = newImplementation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.SIMPLE_ENTITY__IMPLEMENTATION, oldImplementation, implementation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleEntity getSuperClass()
  {
    if (superClass != null && superClass.eIsProxy())
    {
      InternalEObject oldSuperClass = (InternalEObject)superClass;
      superClass = (SimpleEntity)eResolveProxy(oldSuperClass);
      if (superClass != oldSuperClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelDslPackage.SIMPLE_ENTITY__SUPER_CLASS, oldSuperClass, superClass));
      }
    }
    return superClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleEntity basicGetSuperClass()
  {
    return superClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperClass(SimpleEntity newSuperClass)
  {
    SimpleEntity oldSuperClass = superClass;
    superClass = newSuperClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.SIMPLE_ENTITY__SUPER_CLASS, oldSuperClass, superClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefIdAttribute> getAttributesId()
  {
    if (attributesId == null)
    {
      attributesId = new EObjectContainmentEList<DefIdAttribute>(DefIdAttribute.class, this, ModelDslPackage.SIMPLE_ENTITY__ATTRIBUTES_ID);
    }
    return attributesId;
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
      case ModelDslPackage.SIMPLE_ENTITY__ATTRIBUTES_ID:
        return ((InternalEList<?>)getAttributesId()).basicRemove(otherEnd, msgs);
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
      case ModelDslPackage.SIMPLE_ENTITY__IMPLEMENTATION:
        return getImplementation();
      case ModelDslPackage.SIMPLE_ENTITY__SUPER_CLASS:
        if (resolve) return getSuperClass();
        return basicGetSuperClass();
      case ModelDslPackage.SIMPLE_ENTITY__ATTRIBUTES_ID:
        return getAttributesId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelDslPackage.SIMPLE_ENTITY__IMPLEMENTATION:
        setImplementation((String)newValue);
        return;
      case ModelDslPackage.SIMPLE_ENTITY__SUPER_CLASS:
        setSuperClass((SimpleEntity)newValue);
        return;
      case ModelDslPackage.SIMPLE_ENTITY__ATTRIBUTES_ID:
        getAttributesId().clear();
        getAttributesId().addAll((Collection<? extends DefIdAttribute>)newValue);
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
      case ModelDslPackage.SIMPLE_ENTITY__IMPLEMENTATION:
        setImplementation(IMPLEMENTATION_EDEFAULT);
        return;
      case ModelDslPackage.SIMPLE_ENTITY__SUPER_CLASS:
        setSuperClass((SimpleEntity)null);
        return;
      case ModelDslPackage.SIMPLE_ENTITY__ATTRIBUTES_ID:
        getAttributesId().clear();
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
      case ModelDslPackage.SIMPLE_ENTITY__IMPLEMENTATION:
        return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
      case ModelDslPackage.SIMPLE_ENTITY__SUPER_CLASS:
        return superClass != null;
      case ModelDslPackage.SIMPLE_ENTITY__ATTRIBUTES_ID:
        return attributesId != null && !attributesId.isEmpty();
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
    result.append(" (implementation: ");
    result.append(implementation);
    result.append(')');
    return result.toString();
  }

} //SimpleEntityImpl
