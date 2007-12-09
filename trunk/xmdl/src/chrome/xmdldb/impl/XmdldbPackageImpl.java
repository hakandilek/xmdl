/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import chrome.xmdl.XmdlPackage;
import chrome.xmdldb.DBase;
import chrome.xmdldb.DField;
import chrome.xmdldb.DIndex;
import chrome.xmdldb.DModel;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;
import chrome.xmdldb.DVisitor;
import chrome.xmdldb.DVisitorBase;
import chrome.xmdldb.Persistable;
import chrome.xmdldb.XMDLDBModel;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdldbPackageImpl extends EPackageImpl implements XmdldbPackage {
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
	private EClass dModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmdldbModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dVisitorBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBaseEClass = null;

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
	 * @see chrome.xmdldb.XmdldbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmdldbPackageImpl() {
		super(eNS_URI, XmdldbFactory.eINSTANCE);
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
	public static XmdldbPackage init() {
		if (isInited)
			return (XmdldbPackage) EPackage.Registry.INSTANCE
					.getEPackage(XmdldbPackage.eNS_URI);

		// Obtain or create and register package
		XmdldbPackageImpl theXmdldbPackage = (XmdldbPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof XmdldbPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new XmdldbPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XmdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmdldbPackage.createPackageContents();

		// Initialize created meta-data
		theXmdldbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmdldbPackage.freeze();

		return theXmdldbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDModel() {
		return dModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDModel_Name() {
		return (EAttribute) dModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDModel_XModel() {
		return (EAttribute) dModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDModel_DPackages() {
		return (EReference) dModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDModel_XProject() {
		return (EReference) dModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPackage() {
		return dPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPackage_Name() {
		return (EAttribute) dPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPackage_DTables() {
		return (EReference) dPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPackage_XPackage() {
		return (EReference) dPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPackage_Model() {
		return (EReference) dPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTable() {
		return dTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTable_Name() {
		return (EAttribute) dTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTable_DPackage() {
		return (EReference) dTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTable_DFields() {
		return (EReference) dTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTable_XClass() {
		return (EReference) dTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDField() {
		return dFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDField_Name() {
		return (EAttribute) dFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDField_Length() {
		return (EAttribute) dFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDField_DTable() {
		return (EReference) dFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDField_XAttribute() {
		return (EReference) dFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDField_Indices() {
		return (EAttribute) dFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDField_Foreign() {
		return (EReference) dFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMDLDBModel() {
		return xmdldbModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDIndex() {
		return dIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIndex_Name() {
		return (EAttribute) dIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIndex_Unique() {
		return (EAttribute) dIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDIndex_DTable() {
		return (EReference) dIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDIndex_Dfields() {
		return (EReference) dIndexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistable() {
		return persistableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistable_Persistent() {
		return (EAttribute) persistableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDVisitor() {
		return dVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDVisitorBase() {
		return dVisitorBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBase() {
		return dBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdldbFactory getXmdldbFactory() {
		return (XmdldbFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dModelEClass = createEClass(DMODEL);
		createEReference(dModelEClass, DMODEL__XPROJECT);
		createEAttribute(dModelEClass, DMODEL__NAME);
		createEAttribute(dModelEClass, DMODEL__XMODEL);
		createEReference(dModelEClass, DMODEL__DPACKAGES);

		dPackageEClass = createEClass(DPACKAGE);
		createEAttribute(dPackageEClass, DPACKAGE__NAME);
		createEReference(dPackageEClass, DPACKAGE__XPACKAGE);
		createEReference(dPackageEClass, DPACKAGE__MODEL);
		createEReference(dPackageEClass, DPACKAGE__DTABLES);

		dTableEClass = createEClass(DTABLE);
		createEReference(dTableEClass, DTABLE__XCLASS);
		createEAttribute(dTableEClass, DTABLE__NAME);
		createEReference(dTableEClass, DTABLE__DPACKAGE);
		createEReference(dTableEClass, DTABLE__DFIELDS);

		dFieldEClass = createEClass(DFIELD);
		createEReference(dFieldEClass, DFIELD__XATTRIBUTE);
		createEReference(dFieldEClass, DFIELD__DTABLE);
		createEAttribute(dFieldEClass, DFIELD__NAME);
		createEAttribute(dFieldEClass, DFIELD__LENGTH);
		createEAttribute(dFieldEClass, DFIELD__INDICES);
		createEReference(dFieldEClass, DFIELD__FOREIGN);

		xmdldbModelEClass = createEClass(XMDLDB_MODEL);

		dIndexEClass = createEClass(DINDEX);
		createEAttribute(dIndexEClass, DINDEX__NAME);
		createEAttribute(dIndexEClass, DINDEX__UNIQUE);
		createEReference(dIndexEClass, DINDEX__DTABLE);
		createEReference(dIndexEClass, DINDEX__DFIELDS);

		persistableEClass = createEClass(PERSISTABLE);
		createEAttribute(persistableEClass, PERSISTABLE__PERSISTENT);

		dBaseEClass = createEClass(DBASE);

		dVisitorEClass = createEClass(DVISITOR);

		dVisitorBaseEClass = createEClass(DVISITOR_BASE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XmdlPackage theXmdlPackage = (XmdlPackage) EPackage.Registry.INSTANCE
				.getEPackage(XmdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dModelEClass.getESuperTypes().add(this.getDBase());
		dPackageEClass.getESuperTypes().add(this.getDBase());
		dTableEClass.getESuperTypes().add(this.getPersistable());
		dTableEClass.getESuperTypes().add(this.getDBase());
		dFieldEClass.getESuperTypes().add(this.getPersistable());
		dFieldEClass.getESuperTypes().add(this.getDBase());
		xmdldbModelEClass.getESuperTypes().add(theXmdlPackage.getXModel());
		dVisitorBaseEClass.getESuperTypes().add(this.getDVisitor());

		// Initialize classes and features; add operations and parameters
		initEClass(dModelEClass, DModel.class, "DModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDModel_XProject(), theXmdlPackage.getXProject(),
				null, "xProject", null, 0, 1, DModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDModel_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, DModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDModel_XModel(), ecorePackage.getEString(), "xModel",
				null, 1, 1, DModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDModel_DPackages(), this.getDPackage(), this
				.getDPackage_Model(), "dPackages", null, 0, -1, DModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dPackageEClass, DPackage.class, "DPackage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDPackage_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, DPackage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDPackage_XPackage(), theXmdlPackage.getXPackage(),
				null, "xPackage", null, 1, 1, DPackage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPackage_Model(), this.getDModel(), this
				.getDModel_DPackages(), "model", null, 1, 1, DPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDPackage_DTables(), this.getDTable(), this
				.getDTable_DPackage(), "dTables", null, 0, -1, DPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dTableEClass, DTable.class, "DTable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTable_XClass(), theXmdlPackage.getXClass(), null,
				"xClass", null, 1, 1, DTable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTable_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDTable_DPackage(), this.getDPackage(), this
				.getDPackage_DTables(), "dPackage", null, 0, 1, DTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDTable_DFields(), this.getDField(), this
				.getDField_DTable(), "dFields", null, 0, -1, DTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(dTableEClass, this.getDIndex(), "getIndices", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(dFieldEClass, DField.class, "DField", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDField_XAttribute(), theXmdlPackage.getXAttribute(),
				null, "xAttribute", null, 1, 1, DField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDField_DTable(), this.getDTable(), this
				.getDTable_DFields(), "dTable", null, 0, 1, DField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDField_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, DField.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDField_Length(), ecorePackage.getEInt(), "length",
				null, 0, 1, DField.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDField_Indices(), ecorePackage.getEInt(), "indices",
				"0", 0, -1, DField.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDField_Foreign(), this.getDField(), null, "foreign",
				null, 0, 1, DField.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmdldbModelEClass, XMDLDBModel.class, "XMDLDBModel",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dIndexEClass, DIndex.class, "DIndex", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDIndex_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, DIndex.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDIndex_Unique(), ecorePackage.getEBoolean(),
				"unique", "true", 1, 1, DIndex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDIndex_DTable(), this.getDTable(), null, "dTable",
				null, 1, 1, DIndex.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDIndex_Dfields(), this.getDField(), null, "dfields",
				null, 0, -1, DIndex.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistableEClass, Persistable.class, "Persistable",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistable_Persistent(), ecorePackage.getEBoolean(),
				"persistent", "true", 1, 1, Persistable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dBaseEClass, DBase.class, "DBase", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(dBaseEClass, ecorePackage.getEBoolean(),
				"accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDVisitor(), "visitor", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(dVisitorEClass, DVisitor.class, "DVisitor", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDModel(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDModel(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDPackage(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDPackage(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTable(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTable(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dVisitorEClass, ecorePackage.getEBoolean(), "visit",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDField(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dVisitorBaseEClass, DVisitorBase.class, "DVisitorBase",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XmdldbPackageImpl
