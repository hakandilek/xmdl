/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenPackage.java,v 1.4 2006/01/18 15:35:19 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen;

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
 * @see chrome.xmdlgen.XmdlgenFactory
 * @model kind="package"
 * @generated
 */
public interface XmdlgenPackage extends EPackage{
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
	String eNAME = "xmdlgen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://chrome/xmdl.gen.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chrome.xmdl.gen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdlgenPackage eINSTANCE = chrome.xmdlgen.impl.XmdlgenPackageImpl.init();

	/**
	 * The meta object id for the '{@link chrome.xmdlgen.impl.GModelImpl <em>GModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdlgen.impl.GModelImpl
	 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGModel()
	 * @generated
	 */
	int GMODEL = 0;

	/**
	 * The feature id for the '<em><b>XProject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__XPROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>XModel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__XMODEL = 2;

	/**
	 * The feature id for the '<em><b>GPackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__GPACKAGES = 3;

	/**
	 * The number of structural features of the '<em>GModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link chrome.xmdlgen.impl.GPackageImpl <em>GPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdlgen.impl.GPackageImpl
	 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGPackage()
	 * @generated
	 */
	int GPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>XPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPACKAGE__XPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>GModel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPACKAGE__GMODEL = 2;

	/**
	 * The feature id for the '<em><b>GClasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPACKAGE__GCLASSES = 3;

	/**
	 * The number of structural features of the '<em>GPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link chrome.xmdlgen.impl.GClassImpl <em>GClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdlgen.impl.GClassImpl
	 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGClass()
	 * @generated
	 */
	int GCLASS = 2;

	/**
	 * The feature id for the '<em><b>XClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__XCLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__NAME = 1;

	/**
	 * The feature id for the '<em><b>GPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__GPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>GAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__GATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__PERSISTENT = 4;

	/**
	 * The feature id for the '<em><b>Delete Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__DELETE_SERVICE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Edit Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__EDIT_SERVICE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Save Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__SAVE_SERVICE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Search Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS__SEARCH_SERVICE_NAME = 8;

	/**
	 * The number of structural features of the '<em>GClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link chrome.xmdlgen.impl.GAttributeImpl <em>GAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdlgen.impl.GAttributeImpl
	 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGAttribute()
	 * @generated
	 */
	int GATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>XAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATTRIBUTE__XATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATTRIBUTE__PERSISTENT = 2;

	/**
	 * The feature id for the '<em><b>GClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATTRIBUTE__GCLASS = 3;

	/**
	 * The number of structural features of the '<em>GAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link chrome.xmdlgen.impl.XMDLGenModelImpl <em>XMDL Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chrome.xmdlgen.impl.XMDLGenModelImpl
	 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getXMDLGenModel()
	 * @generated
	 */
	int XMDL_GEN_MODEL = 4;

	/**
	 * The number of structural features of the '<em>XMDL Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMDL_GEN_MODEL_FEATURE_COUNT = XmdlPackage.XMODEL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link chrome.xmdlgen.GModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GModel</em>'.
	 * @see chrome.xmdlgen.GModel
	 * @generated
	 */
	EClass getGModel();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdlgen.GModel#getXProject <em>XProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XProject</em>'.
	 * @see chrome.xmdlgen.GModel#getXProject()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_XProject();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdlgen.GModel#getName()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GModel#getXModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XModel</em>'.
	 * @see chrome.xmdlgen.GModel#getXModel()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_XModel();

	/**
	 * Returns the meta object for the containment reference list '{@link chrome.xmdlgen.GModel#getGPackages <em>GPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GPackages</em>'.
	 * @see chrome.xmdlgen.GModel#getGPackages()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_GPackages();

	/**
	 * Returns the meta object for class '{@link chrome.xmdlgen.GPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPackage</em>'.
	 * @see chrome.xmdlgen.GPackage
	 * @generated
	 */
	EClass getGPackage();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdlgen.GPackage#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XPackage</em>'.
	 * @see chrome.xmdlgen.GPackage#getXPackage()
	 * @see #getGPackage()
	 * @generated
	 */
	EReference getGPackage_XPackage();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdlgen.GPackage#getName()
	 * @see #getGPackage()
	 * @generated
	 */
	EAttribute getGPackage_Name();

	/**
	 * Returns the meta object for the container reference '{@link chrome.xmdlgen.GPackage#getGModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>GModel</em>'.
	 * @see chrome.xmdlgen.GPackage#getGModel()
	 * @see #getGPackage()
	 * @generated
	 */
	EReference getGPackage_GModel();

	/**
	 * Returns the meta object for the containment reference list '{@link chrome.xmdlgen.GPackage#getGClasses <em>GClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GClasses</em>'.
	 * @see chrome.xmdlgen.GPackage#getGClasses()
	 * @see #getGPackage()
	 * @generated
	 */
	EReference getGPackage_GClasses();

	/**
	 * Returns the meta object for class '{@link chrome.xmdlgen.GClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GClass</em>'.
	 * @see chrome.xmdlgen.GClass
	 * @generated
	 */
	EClass getGClass();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdlgen.GClass#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XClass</em>'.
	 * @see chrome.xmdlgen.GClass#getXClass()
	 * @see #getGClass()
	 * @generated
	 */
	EReference getGClass_XClass();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdlgen.GClass#getName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_Name();

	/**
	 * Returns the meta object for the container reference '{@link chrome.xmdlgen.GClass#getGPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>GPackage</em>'.
	 * @see chrome.xmdlgen.GClass#getGPackage()
	 * @see #getGClass()
	 * @generated
	 */
	EReference getGClass_GPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link chrome.xmdlgen.GClass#getGAttributes <em>GAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GAttributes</em>'.
	 * @see chrome.xmdlgen.GClass#getGAttributes()
	 * @see #getGClass()
	 * @generated
	 */
	EReference getGClass_GAttributes();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GClass#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see chrome.xmdlgen.GClass#isPersistent()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GClass#getDeleteServiceName <em>Delete Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Service Name</em>'.
	 * @see chrome.xmdlgen.GClass#getDeleteServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_DeleteServiceName();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GClass#getEditServiceName <em>Edit Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Service Name</em>'.
	 * @see chrome.xmdlgen.GClass#getEditServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_EditServiceName();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GClass#getSaveServiceName <em>Save Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Service Name</em>'.
	 * @see chrome.xmdlgen.GClass#getSaveServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_SaveServiceName();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GClass#getSearchServiceName <em>Search Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Service Name</em>'.
	 * @see chrome.xmdlgen.GClass#getSearchServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_SearchServiceName();

	/**
	 * Returns the meta object for class '{@link chrome.xmdlgen.GAttribute <em>GAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAttribute</em>'.
	 * @see chrome.xmdlgen.GAttribute
	 * @generated
	 */
	EClass getGAttribute();

	/**
	 * Returns the meta object for the reference '{@link chrome.xmdlgen.GAttribute#getXAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XAttribute</em>'.
	 * @see chrome.xmdlgen.GAttribute#getXAttribute()
	 * @see #getGAttribute()
	 * @generated
	 */
	EReference getGAttribute_XAttribute();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chrome.xmdlgen.GAttribute#getName()
	 * @see #getGAttribute()
	 * @generated
	 */
	EAttribute getGAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link chrome.xmdlgen.GAttribute#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see chrome.xmdlgen.GAttribute#isPersistent()
	 * @see #getGAttribute()
	 * @generated
	 */
	EAttribute getGAttribute_Persistent();

	/**
	 * Returns the meta object for the container reference '{@link chrome.xmdlgen.GAttribute#getGClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>GClass</em>'.
	 * @see chrome.xmdlgen.GAttribute#getGClass()
	 * @see #getGAttribute()
	 * @generated
	 */
	EReference getGAttribute_GClass();

	/**
	 * Returns the meta object for class '{@link chrome.xmdlgen.XMDLGenModel <em>XMDL Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMDL Gen Model</em>'.
	 * @see chrome.xmdlgen.XMDLGenModel
	 * @generated
	 */
	EClass getXMDLGenModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmdlgenFactory getXmdlgenFactory();

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
		 * The meta object literal for the '{@link chrome.xmdlgen.impl.GModelImpl <em>GModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdlgen.impl.GModelImpl
		 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGModel()
		 * @generated
		 */
		EClass GMODEL = eINSTANCE.getGModel();

		/**
		 * The meta object literal for the '<em><b>XProject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__XPROJECT = eINSTANCE.getGModel_XProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMODEL__NAME = eINSTANCE.getGModel_Name();

		/**
		 * The meta object literal for the '<em><b>XModel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMODEL__XMODEL = eINSTANCE.getGModel_XModel();

		/**
		 * The meta object literal for the '<em><b>GPackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__GPACKAGES = eINSTANCE.getGModel_GPackages();

		/**
		 * The meta object literal for the '{@link chrome.xmdlgen.impl.GPackageImpl <em>GPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdlgen.impl.GPackageImpl
		 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGPackage()
		 * @generated
		 */
		EClass GPACKAGE = eINSTANCE.getGPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPACKAGE__NAME = eINSTANCE.getGPackage_Name();

		/**
		 * The meta object literal for the '<em><b>XPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPACKAGE__XPACKAGE = eINSTANCE.getGPackage_XPackage();

		/**
		 * The meta object literal for the '<em><b>GModel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPACKAGE__GMODEL = eINSTANCE.getGPackage_GModel();

		/**
		 * The meta object literal for the '<em><b>GClasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPACKAGE__GCLASSES = eINSTANCE.getGPackage_GClasses();

		/**
		 * The meta object literal for the '{@link chrome.xmdlgen.impl.GClassImpl <em>GClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdlgen.impl.GClassImpl
		 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGClass()
		 * @generated
		 */
		EClass GCLASS = eINSTANCE.getGClass();

		/**
		 * The meta object literal for the '<em><b>XClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCLASS__XCLASS = eINSTANCE.getGClass_XClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLASS__NAME = eINSTANCE.getGClass_Name();

		/**
		 * The meta object literal for the '<em><b>GPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCLASS__GPACKAGE = eINSTANCE.getGClass_GPackage();

		/**
		 * The meta object literal for the '<em><b>GAttributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCLASS__GATTRIBUTES = eINSTANCE.getGClass_GAttributes();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLASS__PERSISTENT = eINSTANCE.getGClass_Persistent();

		/**
		 * The meta object literal for the '<em><b>Delete Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLASS__DELETE_SERVICE_NAME = eINSTANCE.getGClass_DeleteServiceName();

		/**
		 * The meta object literal for the '<em><b>Edit Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLASS__EDIT_SERVICE_NAME = eINSTANCE.getGClass_EditServiceName();

		/**
		 * The meta object literal for the '<em><b>Save Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLASS__SAVE_SERVICE_NAME = eINSTANCE.getGClass_SaveServiceName();

		/**
		 * The meta object literal for the '<em><b>Search Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLASS__SEARCH_SERVICE_NAME = eINSTANCE.getGClass_SearchServiceName();

		/**
		 * The meta object literal for the '{@link chrome.xmdlgen.impl.GAttributeImpl <em>GAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdlgen.impl.GAttributeImpl
		 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getGAttribute()
		 * @generated
		 */
		EClass GATTRIBUTE = eINSTANCE.getGAttribute();

		/**
		 * The meta object literal for the '<em><b>XAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATTRIBUTE__XATTRIBUTE = eINSTANCE.getGAttribute_XAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATTRIBUTE__NAME = eINSTANCE.getGAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATTRIBUTE__PERSISTENT = eINSTANCE.getGAttribute_Persistent();

		/**
		 * The meta object literal for the '<em><b>GClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATTRIBUTE__GCLASS = eINSTANCE.getGAttribute_GClass();

		/**
		 * The meta object literal for the '{@link chrome.xmdlgen.impl.XMDLGenModelImpl <em>XMDL Gen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chrome.xmdlgen.impl.XMDLGenModelImpl
		 * @see chrome.xmdlgen.impl.XmdlgenPackageImpl#getXMDLGenModel()
		 * @generated
		 */
		EClass XMDL_GEN_MODEL = eINSTANCE.getXMDLGenModel();

	}

} //XmdlgenPackage
