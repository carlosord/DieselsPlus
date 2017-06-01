/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.modelDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uo.diesels.model.modelDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelDslFactoryImpl extends EFactoryImpl implements ModelDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelDslFactory init()
  {
    try
    {
      ModelDslFactory theModelDslFactory = (ModelDslFactory)EPackage.Registry.INSTANCE.getEFactory(ModelDslPackage.eNS_URI);
      if (theModelDslFactory != null)
      {
        return theModelDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelDslPackage.MODEL: return createModel();
      case ModelDslPackage.ELEMENT: return createElement();
      case ModelDslPackage.ALL_MODEL_TYPE: return createAllModelType();
      case ModelDslPackage.ENTITY: return createEntity();
      case ModelDslPackage.MODEL_TYPE: return createModelType();
      case ModelDslPackage.LINK: return createLink();
      case ModelDslPackage.SIMPLE_ENTITY: return createSimpleEntity();
      case ModelDslPackage.ASSOCIATIVE_ENTITY: return createAssociativeEntity();
      case ModelDslPackage.VALUE_TYPE: return createValueType();
      case ModelDslPackage.ENUMERABLE: return createEnumerable();
      case ModelDslPackage.SIMPLE_LINK: return createSimpleLink();
      case ModelDslPackage.RELATION: return createRelation();
      case ModelDslPackage.DEF_ATTRIBUTE: return createDefAttribute();
      case ModelDslPackage.DEF_VARIABLE: return createDefVariable();
      case ModelDslPackage.DEF_ID_ATTRIBUTE: return createDefIdAttribute();
      case ModelDslPackage.DEF_ALL_MODEL_TYPE_VARIABLE: return createDefAllModelTypeVariable();
      case ModelDslPackage.DEF_SIMPLE_VARIABLE: return createDefSimpleVariable();
      case ModelDslPackage.DEF_MODEL_TYPE_VARIABLE: return createDefModelTypeVariable();
      case ModelDslPackage.DEF_COLLECTION_TYPE_ATTRIBUTE: return createDefCollectionTypeAttribute();
      case ModelDslPackage.DEF_COLLECTION_TYPE_VARIABLE: return createDefCollectionTypeVariable();
      case ModelDslPackage.DEF_MODEL_MODEL_TYPE_COLLECTION_VARIABLE: return createDefModelModelTypeCollectionVariable();
      case ModelDslPackage.DEF_MODEL_SIMPLE_TYPE_COLLECTION_VARIABLE: return createDefModelSimpleTypeCollectionVariable();
      case ModelDslPackage.DEF_LINK_VARIABLE: return createDefLinkVariable();
      case ModelDslPackage.METHOD: return createMethod();
      case ModelDslPackage.METHOD_SIMPLE_RETURN: return createMethodSimpleReturn();
      case ModelDslPackage.METHOD_COLLECTION_RETURN: return createMethodCollectionReturn();
      case ModelDslPackage.METHOD_ALL_MODEL_RETURN: return createMethodAllModelReturn();
      case ModelDslPackage.ALL_MODEL_TYPE_COLLECTION: return createAllModelTypeCollection();
      case ModelDslPackage.MODEL_TYPE_COLLECTION: return createModelTypeCollection();
      case ModelDslPackage.SIMPLE_TYPE_COLLECTION: return createSimpleTypeCollection();
      case ModelDslPackage.COLLECTION_RETURN_TYPE: return createCollectionReturnType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllModelType createAllModelType()
  {
    AllModelTypeImpl allModelType = new AllModelTypeImpl();
    return allModelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType createModelType()
  {
    ModelTypeImpl modelType = new ModelTypeImpl();
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleEntity createSimpleEntity()
  {
    SimpleEntityImpl simpleEntity = new SimpleEntityImpl();
    return simpleEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssociativeEntity createAssociativeEntity()
  {
    AssociativeEntityImpl associativeEntity = new AssociativeEntityImpl();
    return associativeEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType createValueType()
  {
    ValueTypeImpl valueType = new ValueTypeImpl();
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumerable createEnumerable()
  {
    EnumerableImpl enumerable = new EnumerableImpl();
    return enumerable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLink createSimpleLink()
  {
    SimpleLinkImpl simpleLink = new SimpleLinkImpl();
    return simpleLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefAttribute createDefAttribute()
  {
    DefAttributeImpl defAttribute = new DefAttributeImpl();
    return defAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefVariable createDefVariable()
  {
    DefVariableImpl defVariable = new DefVariableImpl();
    return defVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefIdAttribute createDefIdAttribute()
  {
    DefIdAttributeImpl defIdAttribute = new DefIdAttributeImpl();
    return defIdAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefAllModelTypeVariable createDefAllModelTypeVariable()
  {
    DefAllModelTypeVariableImpl defAllModelTypeVariable = new DefAllModelTypeVariableImpl();
    return defAllModelTypeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefSimpleVariable createDefSimpleVariable()
  {
    DefSimpleVariableImpl defSimpleVariable = new DefSimpleVariableImpl();
    return defSimpleVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefModelTypeVariable createDefModelTypeVariable()
  {
    DefModelTypeVariableImpl defModelTypeVariable = new DefModelTypeVariableImpl();
    return defModelTypeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefCollectionTypeAttribute createDefCollectionTypeAttribute()
  {
    DefCollectionTypeAttributeImpl defCollectionTypeAttribute = new DefCollectionTypeAttributeImpl();
    return defCollectionTypeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefCollectionTypeVariable createDefCollectionTypeVariable()
  {
    DefCollectionTypeVariableImpl defCollectionTypeVariable = new DefCollectionTypeVariableImpl();
    return defCollectionTypeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefModelModelTypeCollectionVariable createDefModelModelTypeCollectionVariable()
  {
    DefModelModelTypeCollectionVariableImpl defModelModelTypeCollectionVariable = new DefModelModelTypeCollectionVariableImpl();
    return defModelModelTypeCollectionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefModelSimpleTypeCollectionVariable createDefModelSimpleTypeCollectionVariable()
  {
    DefModelSimpleTypeCollectionVariableImpl defModelSimpleTypeCollectionVariable = new DefModelSimpleTypeCollectionVariableImpl();
    return defModelSimpleTypeCollectionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefLinkVariable createDefLinkVariable()
  {
    DefLinkVariableImpl defLinkVariable = new DefLinkVariableImpl();
    return defLinkVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodSimpleReturn createMethodSimpleReturn()
  {
    MethodSimpleReturnImpl methodSimpleReturn = new MethodSimpleReturnImpl();
    return methodSimpleReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCollectionReturn createMethodCollectionReturn()
  {
    MethodCollectionReturnImpl methodCollectionReturn = new MethodCollectionReturnImpl();
    return methodCollectionReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodAllModelReturn createMethodAllModelReturn()
  {
    MethodAllModelReturnImpl methodAllModelReturn = new MethodAllModelReturnImpl();
    return methodAllModelReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllModelTypeCollection createAllModelTypeCollection()
  {
    AllModelTypeCollectionImpl allModelTypeCollection = new AllModelTypeCollectionImpl();
    return allModelTypeCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelTypeCollection createModelTypeCollection()
  {
    ModelTypeCollectionImpl modelTypeCollection = new ModelTypeCollectionImpl();
    return modelTypeCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleTypeCollection createSimpleTypeCollection()
  {
    SimpleTypeCollectionImpl simpleTypeCollection = new SimpleTypeCollectionImpl();
    return simpleTypeCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionReturnType createCollectionReturnType()
  {
    CollectionReturnTypeImpl collectionReturnType = new CollectionReturnTypeImpl();
    return collectionReturnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslPackage getModelDslPackage()
  {
    return (ModelDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelDslPackage getPackage()
  {
    return ModelDslPackage.eINSTANCE;
  }

} //ModelDslFactoryImpl
