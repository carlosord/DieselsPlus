/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.dtoDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uo.diesels.model.dtoDsl.*;

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
 * @see uo.diesels.model.dtoDsl.DtoDslPackage
 * @generated
 */
public class DtoDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DtoDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DtoDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DtoDslPackage.eINSTANCE;
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
      case DtoDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DTO:
      {
        Dto dto = (Dto)theEObject;
        T result = caseDto(dto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DTO_ENTITY:
      {
        DtoEntity dtoEntity = (DtoEntity)theEObject;
        T result = caseDtoEntity(dtoEntity);
        if (result == null) result = caseDto(dtoEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DTO_FOR:
      {
        DtoFor dtoFor = (DtoFor)theEObject;
        T result = caseDtoFor(dtoFor);
        if (result == null) result = caseDto(dtoFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DEF_DTO_ATTRIBUTE:
      {
        DefDtoAttribute defDtoAttribute = (DefDtoAttribute)theEObject;
        T result = caseDefDtoAttribute(defDtoAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DEF_DTO_SIMPLE_VARIABLE:
      {
        DefDtoSimpleVariable defDtoSimpleVariable = (DefDtoSimpleVariable)theEObject;
        T result = caseDefDtoSimpleVariable(defDtoSimpleVariable);
        if (result == null) result = caseDefDtoAttribute(defDtoSimpleVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DEF_DTO_MODEL_TYPE_VARIABLE:
      {
        DefDtoModelTypeVariable defDtoModelTypeVariable = (DefDtoModelTypeVariable)theEObject;
        T result = caseDefDtoModelTypeVariable(defDtoModelTypeVariable);
        if (result == null) result = caseDefDtoAttribute(defDtoModelTypeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DEF_DTO_COLLECTION_TYPE_ATTRIBUTE:
      {
        DefDtoCollectionTypeAttribute defDtoCollectionTypeAttribute = (DefDtoCollectionTypeAttribute)theEObject;
        T result = caseDefDtoCollectionTypeAttribute(defDtoCollectionTypeAttribute);
        if (result == null) result = caseDefDtoAttribute(defDtoCollectionTypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE:
      {
        DefDtoModelTypeCollectionVariable defDtoModelTypeCollectionVariable = (DefDtoModelTypeCollectionVariable)theEObject;
        T result = caseDefDtoModelTypeCollectionVariable(defDtoModelTypeCollectionVariable);
        if (result == null) result = caseDefDtoCollectionTypeAttribute(defDtoModelTypeCollectionVariable);
        if (result == null) result = caseDefDtoAttribute(defDtoModelTypeCollectionVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DtoDslPackage.DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE:
      {
        DefDtoSimpleTypeCollectionVariable defDtoSimpleTypeCollectionVariable = (DefDtoSimpleTypeCollectionVariable)theEObject;
        T result = caseDefDtoSimpleTypeCollectionVariable(defDtoSimpleTypeCollectionVariable);
        if (result == null) result = caseDefDtoCollectionTypeAttribute(defDtoSimpleTypeCollectionVariable);
        if (result == null) result = caseDefDtoAttribute(defDtoSimpleTypeCollectionVariable);
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
   * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDto(Dto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dto Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dto Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDtoEntity(DtoEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dto For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dto For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDtoFor(DtoFor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Dto Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Dto Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDtoAttribute(DefDtoAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Dto Simple Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Dto Simple Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDtoSimpleVariable(DefDtoSimpleVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Dto Model Type Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Dto Model Type Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDtoModelTypeVariable(DefDtoModelTypeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Dto Collection Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Dto Collection Type Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDtoCollectionTypeAttribute(DefDtoCollectionTypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Dto Model Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Dto Model Type Collection Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDtoModelTypeCollectionVariable(DefDtoModelTypeCollectionVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Dto Simple Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Dto Simple Type Collection Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDtoSimpleTypeCollectionVariable(DefDtoSimpleTypeCollectionVariable object)
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

} //DtoDslSwitch
