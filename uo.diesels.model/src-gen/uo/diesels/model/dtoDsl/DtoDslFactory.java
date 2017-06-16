/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.dtoDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uo.diesels.model.dtoDsl.DtoDslPackage
 * @generated
 */
public interface DtoDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DtoDslFactory eINSTANCE = uo.diesels.model.dtoDsl.impl.DtoDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Dto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dto</em>'.
   * @generated
   */
  Dto createDto();

  /**
   * Returns a new object of class '<em>Dto Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dto Entity</em>'.
   * @generated
   */
  DtoEntity createDtoEntity();

  /**
   * Returns a new object of class '<em>Dto For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dto For</em>'.
   * @generated
   */
  DtoFor createDtoFor();

  /**
   * Returns a new object of class '<em>Def Dto Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Dto Attribute</em>'.
   * @generated
   */
  DefDtoAttribute createDefDtoAttribute();

  /**
   * Returns a new object of class '<em>Def Dto Simple Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Dto Simple Variable</em>'.
   * @generated
   */
  DefDtoSimpleVariable createDefDtoSimpleVariable();

  /**
   * Returns a new object of class '<em>Def Dto Model Type Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Dto Model Type Variable</em>'.
   * @generated
   */
  DefDtoModelTypeVariable createDefDtoModelTypeVariable();

  /**
   * Returns a new object of class '<em>Def Dto Collection Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Dto Collection Type Attribute</em>'.
   * @generated
   */
  DefDtoCollectionTypeAttribute createDefDtoCollectionTypeAttribute();

  /**
   * Returns a new object of class '<em>Def Dto Model Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Dto Model Type Collection Variable</em>'.
   * @generated
   */
  DefDtoModelTypeCollectionVariable createDefDtoModelTypeCollectionVariable();

  /**
   * Returns a new object of class '<em>Def Dto Simple Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Dto Simple Type Collection Variable</em>'.
   * @generated
   */
  DefDtoSimpleTypeCollectionVariable createDefDtoSimpleTypeCollectionVariable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DtoDslPackage getDtoDslPackage();

} //DtoDslFactory
