/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uo.diesels.model.modelDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uo.diesels.model.modelDsl.ModelDslPackage
 * @generated
 */
public class ModelDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModelDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ModelDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ModelDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ALL_MODEL_TYPE:
      {
        AllModelType allModelType = (AllModelType)theEObject;
        T result = caseAllModelType(allModelType);
        if (result == null) result = caseElement(allModelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseAllModelType(entity);
        if (result == null) result = caseElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.MODEL_TYPE:
      {
        ModelType modelType = (ModelType)theEObject;
        T result = caseModelType(modelType);
        if (result == null) result = caseAllModelType(modelType);
        if (result == null) result = caseElement(modelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.SIMPLE_ENTITY:
      {
        SimpleEntity simpleEntity = (SimpleEntity)theEObject;
        T result = caseSimpleEntity(simpleEntity);
        if (result == null) result = caseEntity(simpleEntity);
        if (result == null) result = caseAllModelType(simpleEntity);
        if (result == null) result = caseElement(simpleEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ASSOCIATIVE_ENTITY:
      {
        AssociativeEntity associativeEntity = (AssociativeEntity)theEObject;
        T result = caseAssociativeEntity(associativeEntity);
        if (result == null) result = caseEntity(associativeEntity);
        if (result == null) result = caseLink(associativeEntity);
        if (result == null) result = caseAllModelType(associativeEntity);
        if (result == null) result = caseElement(associativeEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.VALUE_TYPE:
      {
        ValueType valueType = (ValueType)theEObject;
        T result = caseValueType(valueType);
        if (result == null) result = caseModelType(valueType);
        if (result == null) result = caseAllModelType(valueType);
        if (result == null) result = caseElement(valueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ENUMERABLE:
      {
        Enumerable enumerable = (Enumerable)theEObject;
        T result = caseEnumerable(enumerable);
        if (result == null) result = caseModelType(enumerable);
        if (result == null) result = caseAllModelType(enumerable);
        if (result == null) result = caseElement(enumerable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.SIMPLE_LINK:
      {
        SimpleLink simpleLink = (SimpleLink)theEObject;
        T result = caseSimpleLink(simpleLink);
        if (result == null) result = caseElement(simpleLink);
        if (result == null) result = caseLink(simpleLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_ATTRIBUTE:
      {
        DefAttribute defAttribute = (DefAttribute)theEObject;
        T result = caseDefAttribute(defAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_VARIABLE:
      {
        DefVariable defVariable = (DefVariable)theEObject;
        T result = caseDefVariable(defVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_ID_ATTRIBUTE:
      {
        DefIdAttribute defIdAttribute = (DefIdAttribute)theEObject;
        T result = caseDefIdAttribute(defIdAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_ALL_MODEL_TYPE_VARIABLE:
      {
        DefAllModelTypeVariable defAllModelTypeVariable = (DefAllModelTypeVariable)theEObject;
        T result = caseDefAllModelTypeVariable(defAllModelTypeVariable);
        if (result == null) result = caseDefVariable(defAllModelTypeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_SIMPLE_VARIABLE:
      {
        DefSimpleVariable defSimpleVariable = (DefSimpleVariable)theEObject;
        T result = caseDefSimpleVariable(defSimpleVariable);
        if (result == null) result = caseDefAttribute(defSimpleVariable);
        if (result == null) result = caseDefVariable(defSimpleVariable);
        if (result == null) result = caseDefIdAttribute(defSimpleVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_MODEL_TYPE_VARIABLE:
      {
        DefModelTypeVariable defModelTypeVariable = (DefModelTypeVariable)theEObject;
        T result = caseDefModelTypeVariable(defModelTypeVariable);
        if (result == null) result = caseDefAttribute(defModelTypeVariable);
        if (result == null) result = caseDefIdAttribute(defModelTypeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_COLLECTION_TYPE_ATTRIBUTE:
      {
        DefCollectionTypeAttribute defCollectionTypeAttribute = (DefCollectionTypeAttribute)theEObject;
        T result = caseDefCollectionTypeAttribute(defCollectionTypeAttribute);
        if (result == null) result = caseDefAttribute(defCollectionTypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_COLLECTION_TYPE_VARIABLE:
      {
        DefCollectionTypeVariable defCollectionTypeVariable = (DefCollectionTypeVariable)theEObject;
        T result = caseDefCollectionTypeVariable(defCollectionTypeVariable);
        if (result == null) result = caseDefVariable(defCollectionTypeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_MODEL_MODEL_TYPE_COLLECTION_VARIABLE:
      {
        DefModelModelTypeCollectionVariable defModelModelTypeCollectionVariable = (DefModelModelTypeCollectionVariable)theEObject;
        T result = caseDefModelModelTypeCollectionVariable(defModelModelTypeCollectionVariable);
        if (result == null) result = caseDefCollectionTypeAttribute(defModelModelTypeCollectionVariable);
        if (result == null) result = caseDefAttribute(defModelModelTypeCollectionVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_MODEL_SIMPLE_TYPE_COLLECTION_VARIABLE:
      {
        DefModelSimpleTypeCollectionVariable defModelSimpleTypeCollectionVariable = (DefModelSimpleTypeCollectionVariable)theEObject;
        T result = caseDefModelSimpleTypeCollectionVariable(defModelSimpleTypeCollectionVariable);
        if (result == null) result = caseDefCollectionTypeAttribute(defModelSimpleTypeCollectionVariable);
        if (result == null) result = caseDefAttribute(defModelSimpleTypeCollectionVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DEF_LINK_VARIABLE:
      {
        DefLinkVariable defLinkVariable = (DefLinkVariable)theEObject;
        T result = caseDefLinkVariable(defLinkVariable);
        if (result == null) result = caseDefIdAttribute(defLinkVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.METHOD_SIMPLE_RETURN:
      {
        MethodSimpleReturn methodSimpleReturn = (MethodSimpleReturn)theEObject;
        T result = caseMethodSimpleReturn(methodSimpleReturn);
        if (result == null) result = caseMethod(methodSimpleReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.METHOD_COLLECTION_RETURN:
      {
        MethodCollectionReturn methodCollectionReturn = (MethodCollectionReturn)theEObject;
        T result = caseMethodCollectionReturn(methodCollectionReturn);
        if (result == null) result = caseMethod(methodCollectionReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.METHOD_ALL_MODEL_RETURN:
      {
        MethodAllModelReturn methodAllModelReturn = (MethodAllModelReturn)theEObject;
        T result = caseMethodAllModelReturn(methodAllModelReturn);
        if (result == null) result = caseMethod(methodAllModelReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ALL_MODEL_TYPE_COLLECTION:
      {
        AllModelTypeCollection allModelTypeCollection = (AllModelTypeCollection)theEObject;
        T result = caseAllModelTypeCollection(allModelTypeCollection);
        if (result == null) result = caseCollectionReturnType(allModelTypeCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.MODEL_TYPE_COLLECTION:
      {
        ModelTypeCollection modelTypeCollection = (ModelTypeCollection)theEObject;
        T result = caseModelTypeCollection(modelTypeCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.SIMPLE_TYPE_COLLECTION:
      {
        SimpleTypeCollection simpleTypeCollection = (SimpleTypeCollection)theEObject;
        T result = caseSimpleTypeCollection(simpleTypeCollection);
        if (result == null) result = caseCollectionReturnType(simpleTypeCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.COLLECTION_RETURN_TYPE:
      {
        CollectionReturnType collectionReturnType = (CollectionReturnType)theEObject;
        T result = caseCollectionReturnType(collectionReturnType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Model Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllModelType(AllModelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelType(ModelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleEntity(SimpleEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Associative Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Associative Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociativeEntity(AssociativeEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueType(ValueType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumerable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumerable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerable(Enumerable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleLink(SimpleLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefAttribute(DefAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefVariable(DefVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Id Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Id Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefIdAttribute(DefIdAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def All Model Type Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def All Model Type Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefAllModelTypeVariable(DefAllModelTypeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Simple Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Simple Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefSimpleVariable(DefSimpleVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Model Type Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Model Type Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefModelTypeVariable(DefModelTypeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Collection Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Collection Type Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefCollectionTypeAttribute(DefCollectionTypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Collection Type Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Collection Type Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefCollectionTypeVariable(DefCollectionTypeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Model Model Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Model Model Type Collection Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefModelModelTypeCollectionVariable(DefModelModelTypeCollectionVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Model Simple Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Model Simple Type Collection Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefModelSimpleTypeCollectionVariable(DefModelSimpleTypeCollectionVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Link Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Link Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefLinkVariable(DefLinkVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Simple Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Simple Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodSimpleReturn(MethodSimpleReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Collection Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Collection Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodCollectionReturn(MethodCollectionReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method All Model Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method All Model Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodAllModelReturn(MethodAllModelReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Model Type Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Model Type Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllModelTypeCollection(AllModelTypeCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Type Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Type Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelTypeCollection(ModelTypeCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleTypeCollection(SimpleTypeCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Return Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Return Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionReturnType(CollectionReturnType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ModelDslSwitch