/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.businessDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uo.diesels.model.businessDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uo.diesels.model.businessDsl.BusinessDslPackage
 * @generated
 */
public class BusinessDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BusinessDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BusinessDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessDslSwitch<Adapter> modelSwitch =
    new BusinessDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseServiceMethod(ServiceMethod object)
      {
        return createServiceMethodAdapter();
      }
      @Override
      public Adapter caseJpaMethod(JpaMethod object)
      {
        return createJpaMethodAdapter();
      }
      @Override
      public Adapter caseFinderUserMethod(FinderUserMethod object)
      {
        return createFinderUserMethodAdapter();
      }
      @Override
      public Adapter caseMethodSimpleReturn(MethodSimpleReturn object)
      {
        return createMethodSimpleReturnAdapter();
      }
      @Override
      public Adapter caseMethodAllModelReturn(MethodAllModelReturn object)
      {
        return createMethodAllModelReturnAdapter();
      }
      @Override
      public Adapter caseMethodDtoReturn(MethodDtoReturn object)
      {
        return createMethodDtoReturnAdapter();
      }
      @Override
      public Adapter caseMethodCollectionReturn(MethodCollectionReturn object)
      {
        return createMethodCollectionReturnAdapter();
      }
      @Override
      public Adapter caseDefVariable(DefVariable object)
      {
        return createDefVariableAdapter();
      }
      @Override
      public Adapter caseDefAllModelTypeVariable(DefAllModelTypeVariable object)
      {
        return createDefAllModelTypeVariableAdapter();
      }
      @Override
      public Adapter caseDefDtoTypeVariable(DefDtoTypeVariable object)
      {
        return createDefDtoTypeVariableAdapter();
      }
      @Override
      public Adapter caseDefSimpleVariable(DefSimpleVariable object)
      {
        return createDefSimpleVariableAdapter();
      }
      @Override
      public Adapter caseDefCollectionTypeVariable(DefCollectionTypeVariable object)
      {
        return createDefCollectionTypeVariableAdapter();
      }
      @Override
      public Adapter caseDefAllModelTypeCollectionVariable(DefAllModelTypeCollectionVariable object)
      {
        return createDefAllModelTypeCollectionVariableAdapter();
      }
      @Override
      public Adapter caseDefSimpleTypeCollectionVariable(DefSimpleTypeCollectionVariable object)
      {
        return createDefSimpleTypeCollectionVariableAdapter();
      }
      @Override
      public Adapter caseDefDtoTypeCollectionVariable(DefDtoTypeCollectionVariable object)
      {
        return createDefDtoTypeCollectionVariableAdapter();
      }
      @Override
      public Adapter caseCollectionReturnType(CollectionReturnType object)
      {
        return createCollectionReturnTypeAdapter();
      }
      @Override
      public Adapter caseAllModelTypeCollection(AllModelTypeCollection object)
      {
        return createAllModelTypeCollectionAdapter();
      }
      @Override
      public Adapter caseDtoTypeCollection(DtoTypeCollection object)
      {
        return createDtoTypeCollectionAdapter();
      }
      @Override
      public Adapter caseSimpleTypeCollection(SimpleTypeCollection object)
      {
        return createSimpleTypeCollectionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.ServiceMethod <em>Service Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.ServiceMethod
   * @generated
   */
  public Adapter createServiceMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.JpaMethod <em>Jpa Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.JpaMethod
   * @generated
   */
  public Adapter createJpaMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.FinderUserMethod <em>Finder User Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.FinderUserMethod
   * @generated
   */
  public Adapter createFinderUserMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.MethodSimpleReturn <em>Method Simple Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.MethodSimpleReturn
   * @generated
   */
  public Adapter createMethodSimpleReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.MethodAllModelReturn <em>Method All Model Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.MethodAllModelReturn
   * @generated
   */
  public Adapter createMethodAllModelReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.MethodDtoReturn <em>Method Dto Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.MethodDtoReturn
   * @generated
   */
  public Adapter createMethodDtoReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.MethodCollectionReturn <em>Method Collection Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.MethodCollectionReturn
   * @generated
   */
  public Adapter createMethodCollectionReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefVariable <em>Def Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefVariable
   * @generated
   */
  public Adapter createDefVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefAllModelTypeVariable <em>Def All Model Type Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefAllModelTypeVariable
   * @generated
   */
  public Adapter createDefAllModelTypeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefDtoTypeVariable <em>Def Dto Type Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefDtoTypeVariable
   * @generated
   */
  public Adapter createDefDtoTypeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefSimpleVariable <em>Def Simple Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefSimpleVariable
   * @generated
   */
  public Adapter createDefSimpleVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefCollectionTypeVariable <em>Def Collection Type Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefCollectionTypeVariable
   * @generated
   */
  public Adapter createDefCollectionTypeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefAllModelTypeCollectionVariable <em>Def All Model Type Collection Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefAllModelTypeCollectionVariable
   * @generated
   */
  public Adapter createDefAllModelTypeCollectionVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefSimpleTypeCollectionVariable <em>Def Simple Type Collection Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefSimpleTypeCollectionVariable
   * @generated
   */
  public Adapter createDefSimpleTypeCollectionVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DefDtoTypeCollectionVariable <em>Def Dto Type Collection Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DefDtoTypeCollectionVariable
   * @generated
   */
  public Adapter createDefDtoTypeCollectionVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.CollectionReturnType <em>Collection Return Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.CollectionReturnType
   * @generated
   */
  public Adapter createCollectionReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.AllModelTypeCollection <em>All Model Type Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.AllModelTypeCollection
   * @generated
   */
  public Adapter createAllModelTypeCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.DtoTypeCollection <em>Dto Type Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.DtoTypeCollection
   * @generated
   */
  public Adapter createDtoTypeCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uo.diesels.model.businessDsl.SimpleTypeCollection <em>Simple Type Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uo.diesels.model.businessDsl.SimpleTypeCollection
   * @generated
   */
  public Adapter createSimpleTypeCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BusinessDslAdapterFactory