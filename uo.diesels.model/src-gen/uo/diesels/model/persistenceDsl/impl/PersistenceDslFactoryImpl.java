/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.persistenceDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uo.diesels.model.persistenceDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceDslFactoryImpl extends EFactoryImpl implements PersistenceDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PersistenceDslFactory init()
  {
    try
    {
      PersistenceDslFactory thePersistenceDslFactory = (PersistenceDslFactory)EPackage.Registry.INSTANCE.getEFactory(PersistenceDslPackage.eNS_URI);
      if (thePersistenceDslFactory != null)
      {
        return thePersistenceDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PersistenceDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersistenceDslFactoryImpl()
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
      case PersistenceDslPackage.MODEL: return createModel();
      case PersistenceDslPackage.FINDER: return createFinder();
      case PersistenceDslPackage.FINDER_METHOD: return createFinderMethod();
      case PersistenceDslPackage.METHOD_SIMPLE_RETURN: return createMethodSimpleReturn();
      case PersistenceDslPackage.METHOD_ENTITY_RETURN: return createMethodEntityReturn();
      case PersistenceDslPackage.METHOD_DTO_RETURN: return createMethodDtoReturn();
      case PersistenceDslPackage.METHOD_COLLECTION_RETURN: return createMethodCollectionReturn();
      case PersistenceDslPackage.COLLECTION_RETURN_TYPE: return createCollectionReturnType();
      case PersistenceDslPackage.ENTITY_RETURN_TYPE_COLLECTION: return createEntityReturnTypeCollection();
      case PersistenceDslPackage.DTO_RETURN_TYPE_COLLECTION: return createDtoReturnTypeCollection();
      case PersistenceDslPackage.SIMPLE_RETURN_TYPE_COLLECTION: return createSimpleReturnTypeCollection();
      case PersistenceDslPackage.ALL_MODEL_TYPE_COLLECTION: return createAllModelTypeCollection();
      case PersistenceDslPackage.SIMPLE_TYPE_COLLECTION: return createSimpleTypeCollection();
      case PersistenceDslPackage.DEF_VARIABLE: return createDefVariable();
      case PersistenceDslPackage.DEF_ALL_MODEL_TYPE_VARIABLE: return createDefAllModelTypeVariable();
      case PersistenceDslPackage.DEF_SIMPLE_VARIABLE: return createDefSimpleVariable();
      case PersistenceDslPackage.DEF_COLLECTION_TYPE_VARIABLE: return createDefCollectionTypeVariable();
      case PersistenceDslPackage.DEF_ALL_MODEL_TYPE_COLLECTION_VARIABLE: return createDefAllModelTypeCollectionVariable();
      case PersistenceDslPackage.DEF_SIMPLE_TYPE_COLLECTION_VARIABLE: return createDefSimpleTypeCollectionVariable();
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
  public Finder createFinder()
  {
    FinderImpl finder = new FinderImpl();
    return finder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinderMethod createFinderMethod()
  {
    FinderMethodImpl finderMethod = new FinderMethodImpl();
    return finderMethod;
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
  public MethodEntityReturn createMethodEntityReturn()
  {
    MethodEntityReturnImpl methodEntityReturn = new MethodEntityReturnImpl();
    return methodEntityReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDtoReturn createMethodDtoReturn()
  {
    MethodDtoReturnImpl methodDtoReturn = new MethodDtoReturnImpl();
    return methodDtoReturn;
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
  public EntityReturnTypeCollection createEntityReturnTypeCollection()
  {
    EntityReturnTypeCollectionImpl entityReturnTypeCollection = new EntityReturnTypeCollectionImpl();
    return entityReturnTypeCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DtoReturnTypeCollection createDtoReturnTypeCollection()
  {
    DtoReturnTypeCollectionImpl dtoReturnTypeCollection = new DtoReturnTypeCollectionImpl();
    return dtoReturnTypeCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleReturnTypeCollection createSimpleReturnTypeCollection()
  {
    SimpleReturnTypeCollectionImpl simpleReturnTypeCollection = new SimpleReturnTypeCollectionImpl();
    return simpleReturnTypeCollection;
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
  public DefAllModelTypeCollectionVariable createDefAllModelTypeCollectionVariable()
  {
    DefAllModelTypeCollectionVariableImpl defAllModelTypeCollectionVariable = new DefAllModelTypeCollectionVariableImpl();
    return defAllModelTypeCollectionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefSimpleTypeCollectionVariable createDefSimpleTypeCollectionVariable()
  {
    DefSimpleTypeCollectionVariableImpl defSimpleTypeCollectionVariable = new DefSimpleTypeCollectionVariableImpl();
    return defSimpleTypeCollectionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersistenceDslPackage getPersistenceDslPackage()
  {
    return (PersistenceDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PersistenceDslPackage getPackage()
  {
    return PersistenceDslPackage.eINSTANCE;
  }

} //PersistenceDslFactoryImpl
