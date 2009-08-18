/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.xmdl.wdl.WdlFactory
 * @model kind="package"
 * @generated
 */
public interface WdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xmdl.org/WDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WdlPackage eINSTANCE = org.xmdl.wdl.impl.WdlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.ModelImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROJECT = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 1;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__QUERIES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.ProjectImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__BASE_PACKAGE = 1;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.TypeImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.SimpleTypeImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Mapped Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__MAPPED_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.JAVAIDImpl <em>JAVAID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.JAVAIDImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getJAVAID()
   * @generated
   */
  int JAVAID = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVAID__NAME = 0;

  /**
   * The number of structural features of the '<em>JAVAID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVAID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.EntityImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_ENTITY = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.EmbedImpl <em>Embed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.EmbedImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getEmbed()
   * @generated
   */
  int EMBED = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED__SUPER_ENTITY = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Embed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.AttributeImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MANY_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.EnumerationImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LITERALS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.EnumerationLiteralImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Ordinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__ORDINAL = 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.QueryImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Filters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__FILTERS = 3;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__MAX = 4;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__OFFSET = 5;

  /**
   * The feature id for the '<em><b>Orders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__ORDERS = 6;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.QueryParameterImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryParameter()
   * @generated
   */
  int QUERY_PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Query Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.QueryFilterImpl <em>Query Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.QueryFilterImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryFilter()
   * @generated
   */
  int QUERY_FILTER = 12;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FILTER__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FILTER__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FILTER__VALUE = 2;

  /**
   * The number of structural features of the '<em>Query Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FILTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.impl.QueryOrderImpl <em>Query Order</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.impl.QueryOrderImpl
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryOrder()
   * @generated
   */
  int QUERY_ORDER = 13;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ORDER__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ORDER__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ORDER__TYPE = 2;

  /**
   * The number of structural features of the '<em>Query Order</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ORDER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.AttributeManyReference <em>Attribute Many Reference</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.AttributeManyReference
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getAttributeManyReference()
   * @generated
   */
  int ATTRIBUTE_MANY_REFERENCE = 14;

  /**
   * The meta object id for the '{@link org.xmdl.wdl.QueryOrderType <em>Query Order Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xmdl.wdl.QueryOrderType
   * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryOrderType()
   * @generated
   */
  int QUERY_ORDER_TYPE = 15;


  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xmdl.wdl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xmdl.wdl.Model#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see org.xmdl.wdl.Model#getProject()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Project();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xmdl.wdl.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Model#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see org.xmdl.wdl.Model#getQueries()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Queries();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.xmdl.wdl.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Project#getBasePackage <em>Base Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Package</em>'.
   * @see org.xmdl.wdl.Project#getBasePackage()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_BasePackage();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xmdl.wdl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see org.xmdl.wdl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the containment reference '{@link org.xmdl.wdl.SimpleType#getMappedType <em>Mapped Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped Type</em>'.
   * @see org.xmdl.wdl.SimpleType#getMappedType()
   * @see #getSimpleType()
   * @generated
   */
  EReference getSimpleType_MappedType();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.JAVAID <em>JAVAID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JAVAID</em>'.
   * @see org.xmdl.wdl.JAVAID
   * @generated
   */
  EClass getJAVAID();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.JAVAID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.JAVAID#getName()
   * @see #getJAVAID()
   * @generated
   */
  EAttribute getJAVAID_Name();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xmdl.wdl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.Entity#getSuperEntity <em>Super Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Entity</em>'.
   * @see org.xmdl.wdl.Entity#getSuperEntity()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xmdl.wdl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Embed <em>Embed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embed</em>'.
   * @see org.xmdl.wdl.Embed
   * @generated
   */
  EClass getEmbed();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.Embed#getSuperEntity <em>Super Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Entity</em>'.
   * @see org.xmdl.wdl.Embed#getSuperEntity()
   * @see #getEmbed()
   * @generated
   */
  EReference getEmbed_SuperEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Embed#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xmdl.wdl.Embed#getAttributes()
   * @see #getEmbed()
   * @generated
   */
  EReference getEmbed_Attributes();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xmdl.wdl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xmdl.wdl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Attribute#getManyReference <em>Many Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many Reference</em>'.
   * @see org.xmdl.wdl.Attribute#getManyReference()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_ManyReference();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.xmdl.wdl.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Enumeration#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.xmdl.wdl.Enumeration#getLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Literals();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see org.xmdl.wdl.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.EnumerationLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.EnumerationLiteral#getName()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.EnumerationLiteral#getOrdinal <em>Ordinal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordinal</em>'.
   * @see org.xmdl.wdl.EnumerationLiteral#getOrdinal()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Ordinal();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.xmdl.wdl.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Query#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.Query#getName()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xmdl.wdl.Query#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Entities</em>'.
   * @see org.xmdl.wdl.Query#getEntities()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Query#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xmdl.wdl.Query#getParameters()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Query#getFilters <em>Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filters</em>'.
   * @see org.xmdl.wdl.Query#getFilters()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Filters();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Query#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.xmdl.wdl.Query#getMax()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Max();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.Query#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see org.xmdl.wdl.Query#getOffset()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Offset();

  /**
   * Returns the meta object for the containment reference list '{@link org.xmdl.wdl.Query#getOrders <em>Orders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orders</em>'.
   * @see org.xmdl.wdl.Query#getOrders()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Orders();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.QueryParameter <em>Query Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Parameter</em>'.
   * @see org.xmdl.wdl.QueryParameter
   * @generated
   */
  EClass getQueryParameter();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.QueryParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xmdl.wdl.QueryParameter#getType()
   * @see #getQueryParameter()
   * @generated
   */
  EReference getQueryParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.QueryParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xmdl.wdl.QueryParameter#getName()
   * @see #getQueryParameter()
   * @generated
   */
  EAttribute getQueryParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.QueryFilter <em>Query Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Filter</em>'.
   * @see org.xmdl.wdl.QueryFilter
   * @generated
   */
  EClass getQueryFilter();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.QueryFilter#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.xmdl.wdl.QueryFilter#getEntity()
   * @see #getQueryFilter()
   * @generated
   */
  EReference getQueryFilter_Entity();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.QueryFilter#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.xmdl.wdl.QueryFilter#getAttribute()
   * @see #getQueryFilter()
   * @generated
   */
  EReference getQueryFilter_Attribute();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.QueryFilter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.xmdl.wdl.QueryFilter#getValue()
   * @see #getQueryFilter()
   * @generated
   */
  EReference getQueryFilter_Value();

  /**
   * Returns the meta object for class '{@link org.xmdl.wdl.QueryOrder <em>Query Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Order</em>'.
   * @see org.xmdl.wdl.QueryOrder
   * @generated
   */
  EClass getQueryOrder();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.QueryOrder#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.xmdl.wdl.QueryOrder#getEntity()
   * @see #getQueryOrder()
   * @generated
   */
  EReference getQueryOrder_Entity();

  /**
   * Returns the meta object for the reference '{@link org.xmdl.wdl.QueryOrder#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.xmdl.wdl.QueryOrder#getAttribute()
   * @see #getQueryOrder()
   * @generated
   */
  EReference getQueryOrder_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.xmdl.wdl.QueryOrder#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xmdl.wdl.QueryOrder#getType()
   * @see #getQueryOrder()
   * @generated
   */
  EAttribute getQueryOrder_Type();

  /**
   * Returns the meta object for enum '{@link org.xmdl.wdl.AttributeManyReference <em>Attribute Many Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Many Reference</em>'.
   * @see org.xmdl.wdl.AttributeManyReference
   * @generated
   */
  EEnum getAttributeManyReference();

  /**
   * Returns the meta object for enum '{@link org.xmdl.wdl.QueryOrderType <em>Query Order Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Query Order Type</em>'.
   * @see org.xmdl.wdl.QueryOrderType
   * @generated
   */
  EEnum getQueryOrderType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WdlFactory getWdlFactory();

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
     * The meta object literal for the '{@link org.xmdl.wdl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.ModelImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROJECT = eINSTANCE.getModel_Project();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__QUERIES = eINSTANCE.getModel_Queries();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.ProjectImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__BASE_PACKAGE = eINSTANCE.getProject_BasePackage();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.TypeImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.SimpleTypeImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Mapped Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__MAPPED_TYPE = eINSTANCE.getSimpleType_MappedType();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.JAVAIDImpl <em>JAVAID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.JAVAIDImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getJAVAID()
     * @generated
     */
    EClass JAVAID = eINSTANCE.getJAVAID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVAID__NAME = eINSTANCE.getJAVAID_Name();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.EntityImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_ENTITY = eINSTANCE.getEntity_SuperEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.EmbedImpl <em>Embed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.EmbedImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getEmbed()
     * @generated
     */
    EClass EMBED = eINSTANCE.getEmbed();

    /**
     * The meta object literal for the '<em><b>Super Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBED__SUPER_ENTITY = eINSTANCE.getEmbed_SuperEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBED__ATTRIBUTES = eINSTANCE.getEmbed_Attributes();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.AttributeImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Many Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MANY_REFERENCE = eINSTANCE.getAttribute_ManyReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.EnumerationImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.EnumerationLiteralImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__ORDINAL = eINSTANCE.getEnumerationLiteral_Ordinal();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.QueryImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__ENTITIES = eINSTANCE.getQuery_Entities();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__PARAMETERS = eINSTANCE.getQuery_Parameters();

    /**
     * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__FILTERS = eINSTANCE.getQuery_Filters();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__MAX = eINSTANCE.getQuery_Max();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__OFFSET = eINSTANCE.getQuery_Offset();

    /**
     * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__ORDERS = eINSTANCE.getQuery_Orders();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.QueryParameterImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryParameter()
     * @generated
     */
    EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_PARAMETER__TYPE = eINSTANCE.getQueryParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_PARAMETER__NAME = eINSTANCE.getQueryParameter_Name();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.QueryFilterImpl <em>Query Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.QueryFilterImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryFilter()
     * @generated
     */
    EClass QUERY_FILTER = eINSTANCE.getQueryFilter();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_FILTER__ENTITY = eINSTANCE.getQueryFilter_Entity();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_FILTER__ATTRIBUTE = eINSTANCE.getQueryFilter_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_FILTER__VALUE = eINSTANCE.getQueryFilter_Value();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.impl.QueryOrderImpl <em>Query Order</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.impl.QueryOrderImpl
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryOrder()
     * @generated
     */
    EClass QUERY_ORDER = eINSTANCE.getQueryOrder();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ORDER__ENTITY = eINSTANCE.getQueryOrder_Entity();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ORDER__ATTRIBUTE = eINSTANCE.getQueryOrder_Attribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_ORDER__TYPE = eINSTANCE.getQueryOrder_Type();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.AttributeManyReference <em>Attribute Many Reference</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.AttributeManyReference
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getAttributeManyReference()
     * @generated
     */
    EEnum ATTRIBUTE_MANY_REFERENCE = eINSTANCE.getAttributeManyReference();

    /**
     * The meta object literal for the '{@link org.xmdl.wdl.QueryOrderType <em>Query Order Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xmdl.wdl.QueryOrderType
     * @see org.xmdl.wdl.impl.WdlPackageImpl#getQueryOrderType()
     * @generated
     */
    EEnum QUERY_ORDER_TYPE = eINSTANCE.getQueryOrderType();

  }

} //WdlPackage
