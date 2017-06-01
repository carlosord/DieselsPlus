/**
 * generated by Xtext 2.9.0
 */
package uo.diesels.model.dtoDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uo.diesels.model.dtoDsl.DtoDslFactory
 * @model kind="package"
 * @generated
 */
public interface DtoDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dtoDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.diesels.uo/model/DtoDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dtoDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DtoDslPackage eINSTANCE = uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl.init();

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.ModelImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Dtos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DTOS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DtoImpl <em>Dto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DtoImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDto()
   * @generated
   */
  int DTO = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO__NAME = 0;

  /**
   * The number of structural features of the '<em>Dto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DtoEntityImpl <em>Dto Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DtoEntityImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDtoEntity()
   * @generated
   */
  int DTO_ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_ENTITY__NAME = DTO__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_ENTITY__ATTRIBUTES = DTO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dto Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_ENTITY_FEATURE_COUNT = DTO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DtoForImpl <em>Dto For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DtoForImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDtoFor()
   * @generated
   */
  int DTO_FOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_FOR__NAME = DTO__NAME;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_FOR__ENTITY = DTO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dto For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_FOR_FEATURE_COUNT = DTO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoAttributeImpl <em>Def Dto Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DefDtoAttributeImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoAttribute()
   * @generated
   */
  int DEF_DTO_ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Def Dto Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoSimpleVariableImpl <em>Def Dto Simple Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DefDtoSimpleVariableImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoSimpleVariable()
   * @generated
   */
  int DEF_DTO_SIMPLE_VARIABLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_VARIABLE__NAME = DEF_DTO_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_VARIABLE__TYPE = DEF_DTO_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Dto Simple Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_VARIABLE_FEATURE_COUNT = DEF_DTO_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoModelTypeVariableImpl <em>Def Dto Model Type Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DefDtoModelTypeVariableImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoModelTypeVariable()
   * @generated
   */
  int DEF_DTO_MODEL_TYPE_VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_VARIABLE__NAME = DEF_DTO_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_VARIABLE__TYPE = DEF_DTO_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Dto Model Type Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_VARIABLE_FEATURE_COUNT = DEF_DTO_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoCollectionTypeAttributeImpl <em>Def Dto Collection Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DefDtoCollectionTypeAttributeImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoCollectionTypeAttribute()
   * @generated
   */
  int DEF_DTO_COLLECTION_TYPE_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__NAME = DEF_DTO_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION = DEF_DTO_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Dto Collection Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_COLLECTION_TYPE_ATTRIBUTE_FEATURE_COUNT = DEF_DTO_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoModelTypeCollectionVariableImpl <em>Def Dto Model Type Collection Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DefDtoModelTypeCollectionVariableImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoModelTypeCollectionVariable()
   * @generated
   */
  int DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE__NAME = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE__COLLECTION = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE__TYPE = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Dto Model Type Collection Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE_FEATURE_COUNT = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoSimpleTypeCollectionVariableImpl <em>Def Dto Simple Type Collection Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uo.diesels.model.dtoDsl.impl.DefDtoSimpleTypeCollectionVariableImpl
   * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoSimpleTypeCollectionVariable()
   * @generated
   */
  int DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE__NAME = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE__COLLECTION = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE__TYPE = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Dto Simple Type Collection Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE_FEATURE_COUNT = DEF_DTO_COLLECTION_TYPE_ATTRIBUTE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uo.diesels.model.dtoDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link uo.diesels.model.dtoDsl.Model#getDtos <em>Dtos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dtos</em>'.
   * @see uo.diesels.model.dtoDsl.Model#getDtos()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Dtos();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.Dto <em>Dto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dto</em>'.
   * @see uo.diesels.model.dtoDsl.Dto
   * @generated
   */
  EClass getDto();

  /**
   * Returns the meta object for the attribute '{@link uo.diesels.model.dtoDsl.Dto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uo.diesels.model.dtoDsl.Dto#getName()
   * @see #getDto()
   * @generated
   */
  EAttribute getDto_Name();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DtoEntity <em>Dto Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dto Entity</em>'.
   * @see uo.diesels.model.dtoDsl.DtoEntity
   * @generated
   */
  EClass getDtoEntity();

  /**
   * Returns the meta object for the containment reference list '{@link uo.diesels.model.dtoDsl.DtoEntity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see uo.diesels.model.dtoDsl.DtoEntity#getAttributes()
   * @see #getDtoEntity()
   * @generated
   */
  EReference getDtoEntity_Attributes();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DtoFor <em>Dto For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dto For</em>'.
   * @see uo.diesels.model.dtoDsl.DtoFor
   * @generated
   */
  EClass getDtoFor();

  /**
   * Returns the meta object for the reference '{@link uo.diesels.model.dtoDsl.DtoFor#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see uo.diesels.model.dtoDsl.DtoFor#getEntity()
   * @see #getDtoFor()
   * @generated
   */
  EReference getDtoFor_Entity();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DefDtoAttribute <em>Def Dto Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Dto Attribute</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoAttribute
   * @generated
   */
  EClass getDefDtoAttribute();

  /**
   * Returns the meta object for the attribute '{@link uo.diesels.model.dtoDsl.DefDtoAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoAttribute#getName()
   * @see #getDefDtoAttribute()
   * @generated
   */
  EAttribute getDefDtoAttribute_Name();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DefDtoSimpleVariable <em>Def Dto Simple Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Dto Simple Variable</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoSimpleVariable
   * @generated
   */
  EClass getDefDtoSimpleVariable();

  /**
   * Returns the meta object for the attribute '{@link uo.diesels.model.dtoDsl.DefDtoSimpleVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoSimpleVariable#getType()
   * @see #getDefDtoSimpleVariable()
   * @generated
   */
  EAttribute getDefDtoSimpleVariable_Type();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DefDtoModelTypeVariable <em>Def Dto Model Type Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Dto Model Type Variable</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoModelTypeVariable
   * @generated
   */
  EClass getDefDtoModelTypeVariable();

  /**
   * Returns the meta object for the reference '{@link uo.diesels.model.dtoDsl.DefDtoModelTypeVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoModelTypeVariable#getType()
   * @see #getDefDtoModelTypeVariable()
   * @generated
   */
  EReference getDefDtoModelTypeVariable_Type();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DefDtoCollectionTypeAttribute <em>Def Dto Collection Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Dto Collection Type Attribute</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoCollectionTypeAttribute
   * @generated
   */
  EClass getDefDtoCollectionTypeAttribute();

  /**
   * Returns the meta object for the attribute '{@link uo.diesels.model.dtoDsl.DefDtoCollectionTypeAttribute#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoCollectionTypeAttribute#getCollection()
   * @see #getDefDtoCollectionTypeAttribute()
   * @generated
   */
  EAttribute getDefDtoCollectionTypeAttribute_Collection();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable <em>Def Dto Model Type Collection Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Dto Model Type Collection Variable</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable
   * @generated
   */
  EClass getDefDtoModelTypeCollectionVariable();

  /**
   * Returns the meta object for the reference '{@link uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoModelTypeCollectionVariable#getType()
   * @see #getDefDtoModelTypeCollectionVariable()
   * @generated
   */
  EReference getDefDtoModelTypeCollectionVariable_Type();

  /**
   * Returns the meta object for class '{@link uo.diesels.model.dtoDsl.DefDtoSimpleTypeCollectionVariable <em>Def Dto Simple Type Collection Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Dto Simple Type Collection Variable</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoSimpleTypeCollectionVariable
   * @generated
   */
  EClass getDefDtoSimpleTypeCollectionVariable();

  /**
   * Returns the meta object for the attribute '{@link uo.diesels.model.dtoDsl.DefDtoSimpleTypeCollectionVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uo.diesels.model.dtoDsl.DefDtoSimpleTypeCollectionVariable#getType()
   * @see #getDefDtoSimpleTypeCollectionVariable()
   * @generated
   */
  EAttribute getDefDtoSimpleTypeCollectionVariable_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DtoDslFactory getDtoDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.ModelImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Dtos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DTOS = eINSTANCE.getModel_Dtos();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DtoImpl <em>Dto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DtoImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDto()
     * @generated
     */
    EClass DTO = eINSTANCE.getDto();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DTO__NAME = eINSTANCE.getDto_Name();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DtoEntityImpl <em>Dto Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DtoEntityImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDtoEntity()
     * @generated
     */
    EClass DTO_ENTITY = eINSTANCE.getDtoEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTO_ENTITY__ATTRIBUTES = eINSTANCE.getDtoEntity_Attributes();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DtoForImpl <em>Dto For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DtoForImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDtoFor()
     * @generated
     */
    EClass DTO_FOR = eINSTANCE.getDtoFor();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTO_FOR__ENTITY = eINSTANCE.getDtoFor_Entity();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoAttributeImpl <em>Def Dto Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DefDtoAttributeImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoAttribute()
     * @generated
     */
    EClass DEF_DTO_ATTRIBUTE = eINSTANCE.getDefDtoAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_DTO_ATTRIBUTE__NAME = eINSTANCE.getDefDtoAttribute_Name();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoSimpleVariableImpl <em>Def Dto Simple Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DefDtoSimpleVariableImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoSimpleVariable()
     * @generated
     */
    EClass DEF_DTO_SIMPLE_VARIABLE = eINSTANCE.getDefDtoSimpleVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_DTO_SIMPLE_VARIABLE__TYPE = eINSTANCE.getDefDtoSimpleVariable_Type();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoModelTypeVariableImpl <em>Def Dto Model Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DefDtoModelTypeVariableImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoModelTypeVariable()
     * @generated
     */
    EClass DEF_DTO_MODEL_TYPE_VARIABLE = eINSTANCE.getDefDtoModelTypeVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_DTO_MODEL_TYPE_VARIABLE__TYPE = eINSTANCE.getDefDtoModelTypeVariable_Type();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoCollectionTypeAttributeImpl <em>Def Dto Collection Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DefDtoCollectionTypeAttributeImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoCollectionTypeAttribute()
     * @generated
     */
    EClass DEF_DTO_COLLECTION_TYPE_ATTRIBUTE = eINSTANCE.getDefDtoCollectionTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_DTO_COLLECTION_TYPE_ATTRIBUTE__COLLECTION = eINSTANCE.getDefDtoCollectionTypeAttribute_Collection();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoModelTypeCollectionVariableImpl <em>Def Dto Model Type Collection Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DefDtoModelTypeCollectionVariableImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoModelTypeCollectionVariable()
     * @generated
     */
    EClass DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE = eINSTANCE.getDefDtoModelTypeCollectionVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_DTO_MODEL_TYPE_COLLECTION_VARIABLE__TYPE = eINSTANCE.getDefDtoModelTypeCollectionVariable_Type();

    /**
     * The meta object literal for the '{@link uo.diesels.model.dtoDsl.impl.DefDtoSimpleTypeCollectionVariableImpl <em>Def Dto Simple Type Collection Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uo.diesels.model.dtoDsl.impl.DefDtoSimpleTypeCollectionVariableImpl
     * @see uo.diesels.model.dtoDsl.impl.DtoDslPackageImpl#getDefDtoSimpleTypeCollectionVariable()
     * @generated
     */
    EClass DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE = eINSTANCE.getDefDtoSimpleTypeCollectionVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_DTO_SIMPLE_TYPE_COLLECTION_VARIABLE__TYPE = eINSTANCE.getDefDtoSimpleTypeCollectionVariable_Type();

  }

} //DtoDslPackage
