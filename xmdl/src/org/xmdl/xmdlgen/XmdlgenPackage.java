/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenPackage.java,v 1.4 2006/01/18 15:35:19 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.xmdl.xmdl.XmdlPackage;

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
 * @see org.xmdl.xmdlgen.XmdlgenFactory
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
	String eNS_URI = "http://www.xmdl.org/xmdlgen.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.xmdl.xmdlgen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdlgenPackage eINSTANCE = org.xmdl.xmdlgen.impl.XmdlgenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlgen.impl.GModelImpl <em>GModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlgen.impl.GModelImpl
	 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGModel()
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
	 * The meta object id for the '{@link org.xmdl.xmdlgen.impl.GPackageImpl <em>GPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlgen.impl.GPackageImpl
	 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGPackage()
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
	 * The meta object id for the '{@link org.xmdl.xmdlgen.impl.GClassImpl <em>GClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlgen.impl.GClassImpl
	 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGClass()
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
	 * The meta object id for the '{@link org.xmdl.xmdlgen.impl.GAttributeImpl <em>GAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlgen.impl.GAttributeImpl
	 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGAttribute()
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
	 * The meta object id for the '{@link org.xmdl.xmdlgen.impl.XMDLGenModelImpl <em>XMDL Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlgen.impl.XMDLGenModelImpl
	 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getXMDLGenModel()
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
	 * Returns the meta object for class '{@link org.xmdl.xmdlgen.GModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GModel</em>'.
	 * @see org.xmdl.xmdlgen.GModel
	 * @generated
	 */
	EClass getGModel();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlgen.GModel#getXProject <em>XProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XProject</em>'.
	 * @see org.xmdl.xmdlgen.GModel#getXProject()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_XProject();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlgen.GModel#getName()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GModel#getXModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XModel</em>'.
	 * @see org.xmdl.xmdlgen.GModel#getXModel()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_XModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlgen.GModel#getGPackages <em>GPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GPackages</em>'.
	 * @see org.xmdl.xmdlgen.GModel#getGPackages()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_GPackages();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlgen.GPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPackage</em>'.
	 * @see org.xmdl.xmdlgen.GPackage
	 * @generated
	 */
	EClass getGPackage();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlgen.GPackage#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XPackage</em>'.
	 * @see org.xmdl.xmdlgen.GPackage#getXPackage()
	 * @see #getGPackage()
	 * @generated
	 */
	EReference getGPackage_XPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlgen.GPackage#getName()
	 * @see #getGPackage()
	 * @generated
	 */
	EAttribute getGPackage_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlgen.GPackage#getGModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>GModel</em>'.
	 * @see org.xmdl.xmdlgen.GPackage#getGModel()
	 * @see #getGPackage()
	 * @generated
	 */
	EReference getGPackage_GModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlgen.GPackage#getGClasses <em>GClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GClasses</em>'.
	 * @see org.xmdl.xmdlgen.GPackage#getGClasses()
	 * @see #getGPackage()
	 * @generated
	 */
	EReference getGPackage_GClasses();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlgen.GClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GClass</em>'.
	 * @see org.xmdl.xmdlgen.GClass
	 * @generated
	 */
	EClass getGClass();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlgen.GClass#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XClass</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getXClass()
	 * @see #getGClass()
	 * @generated
	 */
	EReference getGClass_XClass();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlgen.GClass#getGPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>GPackage</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getGPackage()
	 * @see #getGClass()
	 * @generated
	 */
	EReference getGClass_GPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlgen.GClass#getGAttributes <em>GAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GAttributes</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getGAttributes()
	 * @see #getGClass()
	 * @generated
	 */
	EReference getGClass_GAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GClass#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.xmdl.xmdlgen.GClass#isPersistent()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GClass#getDeleteServiceName <em>Delete Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Service Name</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getDeleteServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_DeleteServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GClass#getEditServiceName <em>Edit Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Service Name</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getEditServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_EditServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GClass#getSaveServiceName <em>Save Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Service Name</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getSaveServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_SaveServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GClass#getSearchServiceName <em>Search Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Service Name</em>'.
	 * @see org.xmdl.xmdlgen.GClass#getSearchServiceName()
	 * @see #getGClass()
	 * @generated
	 */
	EAttribute getGClass_SearchServiceName();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlgen.GAttribute <em>GAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAttribute</em>'.
	 * @see org.xmdl.xmdlgen.GAttribute
	 * @generated
	 */
	EClass getGAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlgen.GAttribute#getXAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XAttribute</em>'.
	 * @see org.xmdl.xmdlgen.GAttribute#getXAttribute()
	 * @see #getGAttribute()
	 * @generated
	 */
	EReference getGAttribute_XAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlgen.GAttribute#getName()
	 * @see #getGAttribute()
	 * @generated
	 */
	EAttribute getGAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlgen.GAttribute#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.xmdl.xmdlgen.GAttribute#isPersistent()
	 * @see #getGAttribute()
	 * @generated
	 */
	EAttribute getGAttribute_Persistent();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlgen.GAttribute#getGClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>GClass</em>'.
	 * @see org.xmdl.xmdlgen.GAttribute#getGClass()
	 * @see #getGAttribute()
	 * @generated
	 */
	EReference getGAttribute_GClass();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlgen.XMDLGenModel <em>XMDL Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMDL Gen Model</em>'.
	 * @see org.xmdl.xmdlgen.XMDLGenModel
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
		 * The meta object literal for the '{@link org.xmdl.xmdlgen.impl.GModelImpl <em>GModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlgen.impl.GModelImpl
		 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGModel()
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
		 * The meta object literal for the '{@link org.xmdl.xmdlgen.impl.GPackageImpl <em>GPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlgen.impl.GPackageImpl
		 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGPackage()
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
		 * The meta object literal for the '{@link org.xmdl.xmdlgen.impl.GClassImpl <em>GClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlgen.impl.GClassImpl
		 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGClass()
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
		 * The meta object literal for the '{@link org.xmdl.xmdlgen.impl.GAttributeImpl <em>GAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlgen.impl.GAttributeImpl
		 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getGAttribute()
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
		 * The meta object literal for the '{@link org.xmdl.xmdlgen.impl.XMDLGenModelImpl <em>XMDL Gen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlgen.impl.XMDLGenModelImpl
		 * @see org.xmdl.xmdlgen.impl.XmdlgenPackageImpl#getXMDLGenModel()
		 * @generated
		 */
		EClass XMDL_GEN_MODEL = eINSTANCE.getXMDLGenModel();

	}

} //XmdlgenPackage
