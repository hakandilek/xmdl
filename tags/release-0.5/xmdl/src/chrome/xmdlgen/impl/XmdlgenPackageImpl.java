/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenPackageImpl.java,v 1.4 2006/01/26 14:15:32 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import chrome.xmdl.XmdlPackage;
import chrome.xmdlgen.GAttribute;
import chrome.xmdlgen.GClass;
import chrome.xmdlgen.GModel;
import chrome.xmdlgen.GPackage;
import chrome.xmdlgen.XMDLGenModel;
import chrome.xmdlgen.XmdlgenFactory;
import chrome.xmdlgen.XmdlgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlgenPackageImpl extends EPackageImpl implements XmdlgenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmdlGenModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see chrome.xmdlgen.XmdlgenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmdlgenPackageImpl() {
		super(eNS_URI, XmdlgenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmdlgenPackage init() {
		if (isInited) return (XmdlgenPackage)EPackage.Registry.INSTANCE.getEPackage(XmdlgenPackage.eNS_URI);

		// Obtain or create and register package
		XmdlgenPackageImpl theXmdlgenPackage = (XmdlgenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof XmdlgenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new XmdlgenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XmdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmdlgenPackage.createPackageContents();

		// Initialize created meta-data
		theXmdlgenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmdlgenPackage.freeze();

		return theXmdlgenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGModel() {
		return gModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGModel_XProject() {
		return (EReference)gModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGModel_Name() {
		return (EAttribute)gModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGModel_XModel() {
		return (EAttribute)gModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGModel_GPackages() {
		return (EReference)gModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPackage() {
		return gPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPackage_Name() {
		return (EAttribute)gPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPackage_XPackage() {
		return (EReference)gPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPackage_GModel() {
		return (EReference)gPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPackage_GClasses() {
		return (EReference)gPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGClass() {
		return gClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGClass_XClass() {
		return (EReference)gClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGClass_Name() {
		return (EAttribute)gClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGClass_GPackage() {
		return (EReference)gClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGClass_GAttributes() {
		return (EReference)gClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGClass_Persistent() {
		return (EAttribute)gClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGClass_DeleteServiceName() {
		return (EAttribute)gClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGClass_EditServiceName() {
		return (EAttribute)gClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGClass_SaveServiceName() {
		return (EAttribute)gClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGClass_SearchServiceName() {
		return (EAttribute)gClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGAttribute() {
		return gAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGAttribute_XAttribute() {
		return (EReference)gAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGAttribute_Name() {
		return (EAttribute)gAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGAttribute_Persistent() {
		return (EAttribute)gAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGAttribute_GClass() {
		return (EReference)gAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMDLGenModel() {
		return xmdlGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlgenFactory getXmdlgenFactory() {
		return (XmdlgenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gModelEClass = createEClass(GMODEL);
		createEReference(gModelEClass, GMODEL__XPROJECT);
		createEAttribute(gModelEClass, GMODEL__NAME);
		createEAttribute(gModelEClass, GMODEL__XMODEL);
		createEReference(gModelEClass, GMODEL__GPACKAGES);

		gPackageEClass = createEClass(GPACKAGE);
		createEAttribute(gPackageEClass, GPACKAGE__NAME);
		createEReference(gPackageEClass, GPACKAGE__XPACKAGE);
		createEReference(gPackageEClass, GPACKAGE__GMODEL);
		createEReference(gPackageEClass, GPACKAGE__GCLASSES);

		gClassEClass = createEClass(GCLASS);
		createEReference(gClassEClass, GCLASS__XCLASS);
		createEAttribute(gClassEClass, GCLASS__NAME);
		createEReference(gClassEClass, GCLASS__GPACKAGE);
		createEReference(gClassEClass, GCLASS__GATTRIBUTES);
		createEAttribute(gClassEClass, GCLASS__PERSISTENT);
		createEAttribute(gClassEClass, GCLASS__DELETE_SERVICE_NAME);
		createEAttribute(gClassEClass, GCLASS__EDIT_SERVICE_NAME);
		createEAttribute(gClassEClass, GCLASS__SAVE_SERVICE_NAME);
		createEAttribute(gClassEClass, GCLASS__SEARCH_SERVICE_NAME);

		gAttributeEClass = createEClass(GATTRIBUTE);
		createEReference(gAttributeEClass, GATTRIBUTE__XATTRIBUTE);
		createEAttribute(gAttributeEClass, GATTRIBUTE__NAME);
		createEAttribute(gAttributeEClass, GATTRIBUTE__PERSISTENT);
		createEReference(gAttributeEClass, GATTRIBUTE__GCLASS);

		xmdlGenModelEClass = createEClass(XMDL_GEN_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XmdlPackage theXmdlPackage = (XmdlPackage)EPackage.Registry.INSTANCE.getEPackage(XmdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmdlGenModelEClass.getESuperTypes().add(theXmdlPackage.getXModel());

		// Initialize classes and features; add operations and parameters
		initEClass(gModelEClass, GModel.class, "GModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGModel_XProject(), theXmdlPackage.getXProject(), null, "xProject", null, 1, 1, GModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, GModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGModel_XModel(), ecorePackage.getEString(), "xModel", null, 1, 1, GModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGModel_GPackages(), this.getGPackage(), this.getGPackage_GModel(), "gPackages", null, 0, -1, GModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gPackageEClass, GPackage.class, "GPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, GPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPackage_XPackage(), theXmdlPackage.getXPackage(), null, "xPackage", null, 1, 1, GPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPackage_GModel(), this.getGModel(), this.getGModel_GPackages(), "gModel", null, 1, 1, GPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPackage_GClasses(), this.getGClass(), this.getGClass_GPackage(), "gClasses", null, 1, -1, GPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gClassEClass, GClass.class, "GClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGClass_XClass(), theXmdlPackage.getXClass(), null, "xClass", null, 1, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGClass_GPackage(), this.getGPackage(), this.getGPackage_GClasses(), "gPackage", null, 1, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGClass_GAttributes(), this.getGAttribute(), this.getGAttribute_GClass(), "gAttributes", null, 1, -1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGClass_Persistent(), ecorePackage.getEBoolean(), "persistent", "true", 0, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGClass_DeleteServiceName(), ecorePackage.getEString(), "deleteServiceName", "true", 0, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGClass_EditServiceName(), ecorePackage.getEString(), "editServiceName", "true", 0, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGClass_SaveServiceName(), ecorePackage.getEString(), "saveServiceName", "true", 0, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGClass_SearchServiceName(), ecorePackage.getEString(), "searchServiceName", "true", 0, 1, GClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gAttributeEClass, GAttribute.class, "GAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGAttribute_XAttribute(), theXmdlPackage.getXAttribute(), null, "xAttribute", null, 1, 1, GAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, GAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGAttribute_Persistent(), ecorePackage.getEBoolean(), "persistent", "true", 0, 1, GAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGAttribute_GClass(), this.getGClass(), this.getGClass_GAttributes(), "gClass", null, 1, 1, GAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmdlGenModelEClass, XMDLGenModel.class, "XMDLGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XmdlgenPackageImpl
