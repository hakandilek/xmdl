/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlboPackageImpl.java,v 1.4 2006/01/26 14:15:32 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlbo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.xmdl.xmdl.XmdlPackage;
import org.xmdl.xmdlbo.BMethod;
import org.xmdl.xmdlbo.BModel;
import org.xmdl.xmdlbo.BPackage;
import org.xmdl.xmdlbo.BParameter;
import org.xmdl.xmdlbo.BParameterNature;
import org.xmdl.xmdlbo.BService;
import org.xmdl.xmdlbo.XMDLBOModel;
import org.xmdl.xmdlbo.XmdlboFactory;
import org.xmdl.xmdlbo.XmdlboPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlboPackageImpl extends EPackageImpl implements XmdlboPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmdlboModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bParameterNatureEEnum = null;

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
	 * @see org.xmdl.xmdlbo.XmdlboPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmdlboPackageImpl() {
		super(eNS_URI, XmdlboFactory.eINSTANCE);
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
	public static XmdlboPackage init() {
		if (isInited) return (XmdlboPackage)EPackage.Registry.INSTANCE.getEPackage(XmdlboPackage.eNS_URI);

		// Obtain or create and register package
		XmdlboPackageImpl theXmdlboPackage = (XmdlboPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof XmdlboPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new XmdlboPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XmdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmdlboPackage.createPackageContents();

		// Initialize created meta-data
		theXmdlboPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmdlboPackage.freeze();

		return theXmdlboPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBModel() {
		return bModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBModel_XProject() {
		return (EReference)bModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBModel_Name() {
		return (EAttribute)bModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBModel_XModel() {
		return (EAttribute)bModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBModel_BPackages() {
		return (EReference)bModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMDLBOModel() {
		return xmdlboModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPackage() {
		return bPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPackage_Name() {
		return (EAttribute)bPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPackage_Model() {
		return (EReference)bPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPackage_XPackage() {
		return (EReference)bPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPackage_Services() {
		return (EReference)bPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBService() {
		return bServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBService_Name() {
		return (EAttribute)bServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBService_BPackage() {
		return (EReference)bServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBService_Methods() {
		return (EReference)bServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBService_XClass() {
		return (EReference)bServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBParameter() {
		return bParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBParameter_Name() {
		return (EAttribute)bParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBParameter_Type() {
		return (EReference)bParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBParameter_Nature() {
		return (EAttribute)bParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBParameter_Constant() {
		return (EAttribute)bParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBParameter_Method() {
		return (EReference)bParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBMethod() {
		return bMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBMethod_Name() {
		return (EAttribute)bMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBMethod_Service() {
		return (EReference)bMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBMethod_Parameters() {
		return (EReference)bMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBParameterNature() {
		return bParameterNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlboFactory getXmdlboFactory() {
		return (XmdlboFactory)getEFactoryInstance();
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
		bModelEClass = createEClass(BMODEL);
		createEReference(bModelEClass, BMODEL__XPROJECT);
		createEAttribute(bModelEClass, BMODEL__NAME);
		createEAttribute(bModelEClass, BMODEL__XMODEL);
		createEReference(bModelEClass, BMODEL__BPACKAGES);

		xmdlboModelEClass = createEClass(XMDLBO_MODEL);

		bPackageEClass = createEClass(BPACKAGE);
		createEAttribute(bPackageEClass, BPACKAGE__NAME);
		createEReference(bPackageEClass, BPACKAGE__MODEL);
		createEReference(bPackageEClass, BPACKAGE__XPACKAGE);
		createEReference(bPackageEClass, BPACKAGE__SERVICES);

		bServiceEClass = createEClass(BSERVICE);
		createEAttribute(bServiceEClass, BSERVICE__NAME);
		createEReference(bServiceEClass, BSERVICE__BPACKAGE);
		createEReference(bServiceEClass, BSERVICE__METHODS);
		createEReference(bServiceEClass, BSERVICE__XCLASS);

		bParameterEClass = createEClass(BPARAMETER);
		createEAttribute(bParameterEClass, BPARAMETER__NAME);
		createEReference(bParameterEClass, BPARAMETER__TYPE);
		createEAttribute(bParameterEClass, BPARAMETER__NATURE);
		createEAttribute(bParameterEClass, BPARAMETER__CONSTANT);
		createEReference(bParameterEClass, BPARAMETER__METHOD);

		bMethodEClass = createEClass(BMETHOD);
		createEAttribute(bMethodEClass, BMETHOD__NAME);
		createEReference(bMethodEClass, BMETHOD__PARAMETERS);
		createEReference(bMethodEClass, BMETHOD__SERVICE);

		// Create enums
		bParameterNatureEEnum = createEEnum(BPARAMETER_NATURE);
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
		xmdlboModelEClass.getESuperTypes().add(theXmdlPackage.getXModel());

		// Initialize classes and features; add operations and parameters
		initEClass(bModelEClass, BModel.class, "BModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBModel_XProject(), theXmdlPackage.getXProject(), null, "xProject", null, 0, 1, BModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, BModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBModel_XModel(), ecorePackage.getEString(), "xModel", null, 1, 1, BModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBModel_BPackages(), this.getBPackage(), this.getBPackage_Model(), "bPackages", null, 0, -1, BModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmdlboModelEClass, XMDLBOModel.class, "XMDLBOModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bPackageEClass, BPackage.class, "BPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, BPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPackage_Model(), this.getBModel(), this.getBModel_BPackages(), "model", null, 1, 1, BPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPackage_XPackage(), theXmdlPackage.getXPackage(), null, "xPackage", null, 1, 1, BPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPackage_Services(), this.getBService(), this.getBService_BPackage(), "services", null, 0, -1, BPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bServiceEClass, BService.class, "BService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBService_Name(), ecorePackage.getEString(), "name", null, 1, 1, BService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBService_BPackage(), this.getBPackage(), this.getBPackage_Services(), "bPackage", null, 0, 1, BService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBService_Methods(), this.getBMethod(), this.getBMethod_Service(), "methods", null, 0, -1, BService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBService_XClass(), theXmdlPackage.getXClass(), null, "xClass", null, 1, 1, BService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bParameterEClass, BParameter.class, "BParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBParameter_Type(), theXmdlPackage.getXType(), null, "type", null, 1, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBParameter_Nature(), this.getBParameterNature(), "nature", null, 0, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBParameter_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBParameter_Method(), this.getBMethod(), this.getBMethod_Parameters(), "method", null, 1, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bMethodEClass, BMethod.class, "BMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, BMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBMethod_Parameters(), this.getBParameter(), this.getBParameter_Method(), "parameters", null, 0, -1, BMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBMethod_Service(), this.getBService(), this.getBService_Methods(), "service", null, 0, 1, BMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bParameterNatureEEnum, BParameterNature.class, "BParameterNature");
		addEEnumLiteral(bParameterNatureEEnum, BParameterNature.IN_LITERAL);
		addEEnumLiteral(bParameterNatureEEnum, BParameterNature.OUT_LITERAL);
		addEEnumLiteral(bParameterNatureEEnum, BParameterNature.IN_OUT_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //XmdlboPackageImpl
