/**
 * generated by Xtext 2.10.0
 */
package uo.diesels.model.persistenceDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uo.diesels.model.persistenceDsl.PersistenceDslPackage
 * @generated
 */
public interface PersistenceDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersistenceDslFactory eINSTANCE = uo.diesels.model.persistenceDsl.impl.PersistenceDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Finder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Finder</em>'.
   * @generated
   */
  Finder createFinder();

  /**
   * Returns a new object of class '<em>Finder Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Finder Method</em>'.
   * @generated
   */
  FinderMethod createFinderMethod();

  /**
   * Returns a new object of class '<em>Method Simple Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Simple Return</em>'.
   * @generated
   */
  MethodSimpleReturn createMethodSimpleReturn();

  /**
   * Returns a new object of class '<em>Method Entity Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Entity Return</em>'.
   * @generated
   */
  MethodEntityReturn createMethodEntityReturn();

  /**
   * Returns a new object of class '<em>Method Dto Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Dto Return</em>'.
   * @generated
   */
  MethodDtoReturn createMethodDtoReturn();

  /**
   * Returns a new object of class '<em>Method Collection Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Collection Return</em>'.
   * @generated
   */
  MethodCollectionReturn createMethodCollectionReturn();

  /**
   * Returns a new object of class '<em>Collection Return Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Return Type</em>'.
   * @generated
   */
  CollectionReturnType createCollectionReturnType();

  /**
   * Returns a new object of class '<em>Entity Return Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Return Type Collection</em>'.
   * @generated
   */
  EntityReturnTypeCollection createEntityReturnTypeCollection();

  /**
   * Returns a new object of class '<em>Dto Return Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dto Return Type Collection</em>'.
   * @generated
   */
  DtoReturnTypeCollection createDtoReturnTypeCollection();

  /**
   * Returns a new object of class '<em>Simple Return Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Return Type Collection</em>'.
   * @generated
   */
  SimpleReturnTypeCollection createSimpleReturnTypeCollection();

  /**
   * Returns a new object of class '<em>All Model Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Model Type Collection</em>'.
   * @generated
   */
  AllModelTypeCollection createAllModelTypeCollection();

  /**
   * Returns a new object of class '<em>Simple Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type Collection</em>'.
   * @generated
   */
  SimpleTypeCollection createSimpleTypeCollection();

  /**
   * Returns a new object of class '<em>Def Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Variable</em>'.
   * @generated
   */
  DefVariable createDefVariable();

  /**
   * Returns a new object of class '<em>Def All Model Type Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def All Model Type Variable</em>'.
   * @generated
   */
  DefAllModelTypeVariable createDefAllModelTypeVariable();

  /**
   * Returns a new object of class '<em>Def Simple Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Simple Variable</em>'.
   * @generated
   */
  DefSimpleVariable createDefSimpleVariable();

  /**
   * Returns a new object of class '<em>Def Collection Type Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Collection Type Variable</em>'.
   * @generated
   */
  DefCollectionTypeVariable createDefCollectionTypeVariable();

  /**
   * Returns a new object of class '<em>Def All Model Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def All Model Type Collection Variable</em>'.
   * @generated
   */
  DefAllModelTypeCollectionVariable createDefAllModelTypeCollectionVariable();

  /**
   * Returns a new object of class '<em>Def Simple Type Collection Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Simple Type Collection Variable</em>'.
   * @generated
   */
  DefSimpleTypeCollectionVariable createDefSimpleTypeCollectionVariable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PersistenceDslPackage getPersistenceDslPackage();

} //PersistenceDslFactory
