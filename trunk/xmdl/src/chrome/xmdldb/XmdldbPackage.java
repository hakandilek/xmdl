/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb;

import chrome.xmdl.XmdlPackage;

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
 * @see chrome.xmdldb.XmdldbFactory
 * @model kind="package"
 * @generated
 */
public interface XmdldbPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmdldb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xmdl.org/xmdldb.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.xmdl.db";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdldbPackage eINSTANCE = chrome.xmdldb.impl.XmdldbPackageImpl.init();

	/**
	 * The meta object id for the '{@link chrome.xmdldb.DBase <em>DBase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.DBase
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDBase()
	 * @generated
	 */
	int DBASE = 7;

	/**
	 * The number of structural features of the '<em>DBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.DModelImpl <em>DModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.DModelImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDModel()
	 * @generated
	 */
	int DMODEL = 0;

	/**
	 * The feature id for the '<em><b>XProject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__XPROJECT = DBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__NAME = DBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XModel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__XMODEL = DBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DPackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__DPACKAGES = DBASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL_FEATURE_COUNT = DBASE_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DModel</em>'.
	 * @see chrome.xmdldb.DModel
	 * @generated
	 */
	EClass getDModel();

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.DPackageImpl <em>DPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.DPackageImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDPackage()
	 * @generated
	 */
	int DPACKAGE = 1;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.DTableImpl <em>DTable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.DTableImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDTable()
	 * @generated
	 */
	int DTABLE = 2;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.DFieldImpl <em>DField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.DFieldImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDField()
	 * @generated
	 */
	int DFIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__NAME = DBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__XPACKAGE = DBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__MODEL = DBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DTables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__DTABLES = DBASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE_FEATURE_COUNT = DBASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.Persistable <em>Persistable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.Persistable
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getPersistable()
	 * @generated
	 */
	int PERSISTABLE = 6;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE__PERSISTENT = 0;

	/**
	 * The number of structural features of the '<em>Persistable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__PERSISTENT = PERSISTABLE__PERSISTENT;

	/**
	 * The feature id for the '<em><b>XClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__XCLASS = PERSISTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__NAME = PERSISTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__DPACKAGE = PERSISTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DFields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__DFIELDS = PERSISTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DTable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FEATURE_COUNT = PERSISTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__PERSISTENT = PERSISTABLE__PERSISTENT;

	/**
	 * The feature id for the '<em><b>XAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__XATTRIBUTE = PERSISTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DTable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__DTABLE = PERSISTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__NAME = PERSISTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__LENGTH = PERSISTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__INDICES = PERSISTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Foreign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD__FOREIGN = PERSISTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>DField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIELD_FEATURE_COUNT = PERSISTABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.XMDLDBModelImpl <em>XMDLDB Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.XMDLDBModelImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getXMDLDBModel()
	 * @generated
	 */
	int XMDLDB_MODEL = 4;

	/**
	 * The number of structural features of the '<em>XMDLDB Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMDLDB_MODEL_FEATURE_COUNT = XmdlPackage.XMODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.DIndexImpl <em>DIndex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.DIndexImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDIndex()
	 * @generated
	 */
	int DINDEX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__UNIQUE = 1;

	/**
	 * The feature id for the '<em><b>DTable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__DTABLE = 2;

	/**
	 * The feature id for the '<em><b>Dfields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__DFIELDS = 3;

	/**
	 * The number of structural features of the '<em>DIndex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.DVisitor <em>DVisitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.DVisitor
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDVisitor()
	 * @generated
	 */
	int DVISITOR = 8;

	/**
	 * The number of structural features of the '<em>DVisitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link chrome.xmdldb.impl.DVisitorBaseImpl <em>DVisitor Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdldb.impl.DVisitorBaseImpl
	 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDVisitorBase()
	 * @generated
	 */
	int DVISITOR_BASE = 9;

	/**
	 * The number of structural features of the '<em>DVisitor Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVISITOR_BASE_FEATURE_COUNT = DVISITOR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdldb.DModel#getName()
	 * @see #getDModel()
	 * @generated
	 */
	EAttribute getDModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DModel#getXModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XModel</em>'.
	 * @see chrome.xmdldb.DModel#getXModel()
	 * @see #getDModel()
	 * @generated
	 */
	EAttribute getDModel_XModel();

	/**
	 * Returns the meta object for the containment reference list '{@link chrome.xmdldb.DModel#getDPackages <em>DPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DPackages</em>'.
	 * @see chrome.xmdldb.DModel#getDPackages()
	 * @see #getDModel()
	 * @generated
	 */
	EReference getDModel_DPackages();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdldb.DModel#getXProject <em>XProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XProject</em>'.
	 * @see chrome.xmdldb.DModel#getXProject()
	 * @see #getDModel()
	 * @generated
	 */
	EReference getDModel_XProject();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPackage</em>'.
	 * @see chrome.xmdldb.DPackage
	 * @generated
	 */
	EClass getDPackage();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdldb.DPackage#getName()
	 * @see #getDPackage()
	 * @generated
	 */
	EAttribute getDPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link chrome.xmdldb.DPackage#getDTables <em>DTables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DTables</em>'.
	 * @see chrome.xmdldb.DPackage#getDTables()
	 * @see #getDPackage()
	 * @generated
	 */
	EReference getDPackage_DTables();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdldb.DPackage#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XPackage</em>'.
	 * @see chrome.xmdldb.DPackage#getXPackage()
	 * @see #getDPackage()
	 * @generated
	 */
	EReference getDPackage_XPackage();

	/**
	 * Returns the meta object for the container reference '{@link chrome.xmdldb.DPackage#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see chrome.xmdldb.DPackage#getModel()
	 * @see #getDPackage()
	 * @generated
	 */
	EReference getDPackage_Model();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DTable <em>DTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTable</em>'.
	 * @see chrome.xmdldb.DTable
	 * @generated
	 */
	EClass getDTable();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdldb.DTable#getName()
	 * @see #getDTable()
	 * @generated
	 */
	EAttribute getDTable_Name();

	/**
	 * Returns the meta object for the container reference '{@link chrome.xmdldb.DTable#getDPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>DPackage</em>'.
	 * @see chrome.xmdldb.DTable#getDPackage()
	 * @see #getDTable()
	 * @generated
	 */
	EReference getDTable_DPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link chrome.xmdldb.DTable#getDFields <em>DFields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DFields</em>'.
	 * @see chrome.xmdldb.DTable#getDFields()
	 * @see #getDTable()
	 * @generated
	 */
	EReference getDTable_DFields();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdldb.DTable#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XClass</em>'.
	 * @see chrome.xmdldb.DTable#getXClass()
	 * @see #getDTable()
	 * @generated
	 */
	EReference getDTable_XClass();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DField <em>DField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DField</em>'.
	 * @see chrome.xmdldb.DField
	 * @generated
	 */
	EClass getDField();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdldb.DField#getName()
	 * @see #getDField()
	 * @generated
	 */
	EAttribute getDField_Name();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DField#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see chrome.xmdldb.DField#getLength()
	 * @see #getDField()
	 * @generated
	 */
	EAttribute getDField_Length();

	/**
	 * Returns the meta object for the container reference '{@link chrome.xmdldb.DField#getDTable <em>DTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>DTable</em>'.
	 * @see chrome.xmdldb.DField#getDTable()
	 * @see #getDField()
	 * @generated
	 */
	EReference getDField_DTable();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdldb.DField#getXAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XAttribute</em>'.
	 * @see chrome.xmdldb.DField#getXAttribute()
	 * @see #getDField()
	 * @generated
	 */
	EReference getDField_XAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link chrome.xmdldb.DField#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Indices</em>'.
	 * @see chrome.xmdldb.DField#getIndices()
	 * @see #getDField()
	 * @generated
	 */
	EAttribute getDField_Indices();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdldb.DField#getForeign <em>Foreign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign</em>'.
	 * @see chrome.xmdldb.DField#getForeign()
	 * @see #getDField()
	 * @generated
	 */
	EReference getDField_Foreign();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.XMDLDBModel <em>XMDLDB Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMDLDB Model</em>'.
	 * @see chrome.xmdldb.XMDLDBModel
	 * @generated
	 */
	EClass getXMDLDBModel();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DIndex <em>DIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIndex</em>'.
	 * @see chrome.xmdldb.DIndex
	 * @generated
	 */
	EClass getDIndex();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdldb.DIndex#getName()
	 * @see #getDIndex()
	 * @generated
	 */
	EAttribute getDIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.DIndex#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see chrome.xmdldb.DIndex#isUnique()
	 * @see #getDIndex()
	 * @generated
	 */
	EAttribute getDIndex_Unique();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdldb.DIndex#getDTable <em>DTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DTable</em>'.
	 * @see chrome.xmdldb.DIndex#getDTable()
	 * @see #getDIndex()
	 * @generated
	 */
	EReference getDIndex_DTable();

	/**
	 * Returns the meta object for the reference list '{@link chrome.xmdldb.DIndex#getDfields <em>Dfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dfields</em>'.
	 * @see chrome.xmdldb.DIndex#getDfields()
	 * @see #getDIndex()
	 * @generated
	 */
	EReference getDIndex_Dfields();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.Persistable <em>Persistable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistable</em>'.
	 * @see chrome.xmdldb.Persistable
	 * @generated
	 */
	EClass getPersistable();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdldb.Persistable#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see chrome.xmdldb.Persistable#isPersistent()
	 * @see #getPersistable()
	 * @generated
	 */
	EAttribute getPersistable_Persistent();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DVisitor <em>DVisitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DVisitor</em>'.
	 * @see chrome.xmdldb.DVisitor
	 * @generated
	 */
	EClass getDVisitor();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DVisitorBase <em>DVisitor Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DVisitor Base</em>'.
	 * @see chrome.xmdldb.DVisitorBase
	 * @generated
	 */
	EClass getDVisitorBase();

	/**
	 * Returns the meta object for class '{@link chrome.xmdldb.DBase <em>DBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBase</em>'.
	 * @see chrome.xmdldb.DBase
	 * @generated
	 */
	EClass getDBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmdldbFactory getXmdldbFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.DModelImpl <em>DModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.DModelImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDModel()
		 * @generated
		 */
		EClass DMODEL = eINSTANCE.getDModel();

		/**
		 * The meta object literal for the '<em><b>XProject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMODEL__XPROJECT = eINSTANCE.getDModel_XProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMODEL__NAME = eINSTANCE.getDModel_Name();

		/**
		 * The meta object literal for the '<em><b>XModel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMODEL__XMODEL = eINSTANCE.getDModel_XModel();

		/**
		 * The meta object literal for the '<em><b>DPackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMODEL__DPACKAGES = eINSTANCE.getDModel_DPackages();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.DPackageImpl <em>DPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.DPackageImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDPackage()
		 * @generated
		 */
		EClass DPACKAGE = eINSTANCE.getDPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPACKAGE__NAME = eINSTANCE.getDPackage_Name();

		/**
		 * The meta object literal for the '<em><b>XPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPACKAGE__XPACKAGE = eINSTANCE.getDPackage_XPackage();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPACKAGE__MODEL = eINSTANCE.getDPackage_Model();

		/**
		 * The meta object literal for the '<em><b>DTables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPACKAGE__DTABLES = eINSTANCE.getDPackage_DTables();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.DTableImpl <em>DTable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.DTableImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDTable()
		 * @generated
		 */
		EClass DTABLE = eINSTANCE.getDTable();

		/**
		 * The meta object literal for the '<em><b>XClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTABLE__XCLASS = eINSTANCE.getDTable_XClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTABLE__NAME = eINSTANCE.getDTable_Name();

		/**
		 * The meta object literal for the '<em><b>DPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTABLE__DPACKAGE = eINSTANCE.getDTable_DPackage();

		/**
		 * The meta object literal for the '<em><b>DFields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTABLE__DFIELDS = eINSTANCE.getDTable_DFields();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.DFieldImpl <em>DField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.DFieldImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDField()
		 * @generated
		 */
		EClass DFIELD = eINSTANCE.getDField();

		/**
		 * The meta object literal for the '<em><b>XAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFIELD__XATTRIBUTE = eINSTANCE.getDField_XAttribute();

		/**
		 * The meta object literal for the '<em><b>DTable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFIELD__DTABLE = eINSTANCE.getDField_DTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFIELD__NAME = eINSTANCE.getDField_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFIELD__LENGTH = eINSTANCE.getDField_Length();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFIELD__INDICES = eINSTANCE.getDField_Indices();

		/**
		 * The meta object literal for the '<em><b>Foreign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFIELD__FOREIGN = eINSTANCE.getDField_Foreign();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.XMDLDBModelImpl <em>XMDLDB Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.XMDLDBModelImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getXMDLDBModel()
		 * @generated
		 */
		EClass XMDLDB_MODEL = eINSTANCE.getXMDLDBModel();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.DIndexImpl <em>DIndex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.DIndexImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDIndex()
		 * @generated
		 */
		EClass DINDEX = eINSTANCE.getDIndex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINDEX__NAME = eINSTANCE.getDIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINDEX__UNIQUE = eINSTANCE.getDIndex_Unique();

		/**
		 * The meta object literal for the '<em><b>DTable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINDEX__DTABLE = eINSTANCE.getDIndex_DTable();

		/**
		 * The meta object literal for the '<em><b>Dfields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINDEX__DFIELDS = eINSTANCE.getDIndex_Dfields();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.Persistable <em>Persistable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.Persistable
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getPersistable()
		 * @generated
		 */
		EClass PERSISTABLE = eINSTANCE.getPersistable();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTABLE__PERSISTENT = eINSTANCE
				.getPersistable_Persistent();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.DVisitor <em>DVisitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.DVisitor
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDVisitor()
		 * @generated
		 */
		EClass DVISITOR = eINSTANCE.getDVisitor();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.impl.DVisitorBaseImpl <em>DVisitor Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.impl.DVisitorBaseImpl
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDVisitorBase()
		 * @generated
		 */
		EClass DVISITOR_BASE = eINSTANCE.getDVisitorBase();

		/**
		 * The meta object literal for the '{@link chrome.xmdldb.DBase <em>DBase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdldb.DBase
		 * @see chrome.xmdldb.impl.XmdldbPackageImpl#getDBase()
		 * @generated
		 */
		EClass DBASE = eINSTANCE.getDBase();

	}

} //XmdldbPackage
