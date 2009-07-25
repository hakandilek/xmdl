/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlboPackage.java,v 1.4 2006/01/26 14:15:31 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlbo;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.xmdl.xmdlbo.XmdlboFactory
 * @model kind="package"
 * @generated
 */
public interface XmdlboPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmdlbo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xmdl.org/xmdlbo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.xmdl.bo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdlboPackage eINSTANCE = org.xmdl.xmdlbo.impl.XmdlboPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.impl.BModelImpl <em>BModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.impl.BModelImpl
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBModel()
	 * @generated
	 */
	int BMODEL = 0;

	/**
	 * The feature id for the '<em><b>XProject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODEL__XPROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>XModel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODEL__XMODEL = 2;

	/**
	 * The feature id for the '<em><b>BPackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODEL__BPACKAGES = 3;

	/**
	 * The number of structural features of the '<em>BModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.impl.XMDLBOModelImpl <em>XMDLBO Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.impl.XMDLBOModelImpl
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getXMDLBOModel()
	 * @generated
	 */
	int XMDLBO_MODEL = 1;

	/**
	 * The number of structural features of the '<em>XMDLBO Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMDLBO_MODEL_FEATURE_COUNT = XmdlPackage.XMODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.impl.BPackageImpl <em>BPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.impl.BPackageImpl
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBPackage()
	 * @generated
	 */
	int BPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPACKAGE__MODEL = 1;

	/**
	 * The feature id for the '<em><b>XPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPACKAGE__XPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPACKAGE__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>BPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.impl.BServiceImpl <em>BService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.impl.BServiceImpl
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBService()
	 * @generated
	 */
	int BSERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>BPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSERVICE__BPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSERVICE__METHODS = 2;

	/**
	 * The feature id for the '<em><b>XClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSERVICE__XCLASS = 3;

	/**
	 * The number of structural features of the '<em>BService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSERVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.impl.BParameterImpl <em>BParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.impl.BParameterImpl
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBParameter()
	 * @generated
	 */
	int BPARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__NATURE = 2;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__CONSTANT = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__METHOD = 4;

	/**
	 * The number of structural features of the '<em>BParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.impl.BMethodImpl <em>BMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.impl.BMethodImpl
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBMethod()
	 * @generated
	 */
	int BMETHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMETHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMETHOD__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMETHOD__SERVICE = 2;

	/**
	 * The number of structural features of the '<em>BMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMETHOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdlbo.BParameterNature <em>BParameter Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdlbo.BParameterNature
	 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBParameterNature()
	 * @generated
	 */
	int BPARAMETER_NATURE = 6;


	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlbo.BModel <em>BModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BModel</em>'.
	 * @see org.xmdl.xmdlbo.BModel
	 * @generated
	 */
	EClass getBModel();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlbo.BModel#getXProject <em>XProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XProject</em>'.
	 * @see org.xmdl.xmdlbo.BModel#getXProject()
	 * @see #getBModel()
	 * @generated
	 */
	EReference getBModel_XProject();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlbo.BModel#getName()
	 * @see #getBModel()
	 * @generated
	 */
	EAttribute getBModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BModel#getXModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XModel</em>'.
	 * @see org.xmdl.xmdlbo.BModel#getXModel()
	 * @see #getBModel()
	 * @generated
	 */
	EAttribute getBModel_XModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlbo.BModel#getBPackages <em>BPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BPackages</em>'.
	 * @see org.xmdl.xmdlbo.BModel#getBPackages()
	 * @see #getBModel()
	 * @generated
	 */
	EReference getBModel_BPackages();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlbo.XMDLBOModel <em>XMDLBO Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMDLBO Model</em>'.
	 * @see org.xmdl.xmdlbo.XMDLBOModel
	 * @generated
	 */
	EClass getXMDLBOModel();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlbo.BPackage <em>BPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPackage</em>'.
	 * @see org.xmdl.xmdlbo.BPackage
	 * @generated
	 */
	EClass getBPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlbo.BPackage#getName()
	 * @see #getBPackage()
	 * @generated
	 */
	EAttribute getBPackage_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlbo.BPackage#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.xmdl.xmdlbo.BPackage#getModel()
	 * @see #getBPackage()
	 * @generated
	 */
	EReference getBPackage_Model();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlbo.BPackage#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XPackage</em>'.
	 * @see org.xmdl.xmdlbo.BPackage#getXPackage()
	 * @see #getBPackage()
	 * @generated
	 */
	EReference getBPackage_XPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlbo.BPackage#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.xmdl.xmdlbo.BPackage#getServices()
	 * @see #getBPackage()
	 * @generated
	 */
	EReference getBPackage_Services();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlbo.BService <em>BService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BService</em>'.
	 * @see org.xmdl.xmdlbo.BService
	 * @generated
	 */
	EClass getBService();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlbo.BService#getName()
	 * @see #getBService()
	 * @generated
	 */
	EAttribute getBService_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlbo.BService#getBPackage <em>BPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BPackage</em>'.
	 * @see org.xmdl.xmdlbo.BService#getBPackage()
	 * @see #getBService()
	 * @generated
	 */
	EReference getBService_BPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlbo.BService#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.xmdl.xmdlbo.BService#getMethods()
	 * @see #getBService()
	 * @generated
	 */
	EReference getBService_Methods();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlbo.BService#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XClass</em>'.
	 * @see org.xmdl.xmdlbo.BService#getXClass()
	 * @see #getBService()
	 * @generated
	 */
	EReference getBService_XClass();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlbo.BParameter <em>BParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameter</em>'.
	 * @see org.xmdl.xmdlbo.BParameter
	 * @generated
	 */
	EClass getBParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlbo.BParameter#getName()
	 * @see #getBParameter()
	 * @generated
	 */
	EAttribute getBParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdlbo.BParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xmdl.xmdlbo.BParameter#getType()
	 * @see #getBParameter()
	 * @generated
	 */
	EReference getBParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BParameter#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.xmdl.xmdlbo.BParameter#getNature()
	 * @see #getBParameter()
	 * @generated
	 */
	EAttribute getBParameter_Nature();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BParameter#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.xmdl.xmdlbo.BParameter#isConstant()
	 * @see #getBParameter()
	 * @generated
	 */
	EAttribute getBParameter_Constant();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlbo.BParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.xmdl.xmdlbo.BParameter#getMethod()
	 * @see #getBParameter()
	 * @generated
	 */
	EReference getBParameter_Method();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdlbo.BMethod <em>BMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BMethod</em>'.
	 * @see org.xmdl.xmdlbo.BMethod
	 * @generated
	 */
	EClass getBMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdlbo.BMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdlbo.BMethod#getName()
	 * @see #getBMethod()
	 * @generated
	 */
	EAttribute getBMethod_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdlbo.BMethod#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see org.xmdl.xmdlbo.BMethod#getService()
	 * @see #getBMethod()
	 * @generated
	 */
	EReference getBMethod_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdlbo.BMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.xmdl.xmdlbo.BMethod#getParameters()
	 * @see #getBMethod()
	 * @generated
	 */
	EReference getBMethod_Parameters();

	/**
	 * Returns the meta object for enum '{@link org.xmdl.xmdlbo.BParameterNature <em>BParameter Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BParameter Nature</em>'.
	 * @see org.xmdl.xmdlbo.BParameterNature
	 * @generated
	 */
	EEnum getBParameterNature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmdlboFactory getXmdlboFactory();

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
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.impl.BModelImpl <em>BModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.impl.BModelImpl
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBModel()
		 * @generated
		 */
		EClass BMODEL = eINSTANCE.getBModel();

		/**
		 * The meta object literal for the '<em><b>XProject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMODEL__XPROJECT = eINSTANCE.getBModel_XProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BMODEL__NAME = eINSTANCE.getBModel_Name();

		/**
		 * The meta object literal for the '<em><b>XModel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BMODEL__XMODEL = eINSTANCE.getBModel_XModel();

		/**
		 * The meta object literal for the '<em><b>BPackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMODEL__BPACKAGES = eINSTANCE.getBModel_BPackages();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.impl.XMDLBOModelImpl <em>XMDLBO Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.impl.XMDLBOModelImpl
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getXMDLBOModel()
		 * @generated
		 */
		EClass XMDLBO_MODEL = eINSTANCE.getXMDLBOModel();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.impl.BPackageImpl <em>BPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.impl.BPackageImpl
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBPackage()
		 * @generated
		 */
		EClass BPACKAGE = eINSTANCE.getBPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPACKAGE__NAME = eINSTANCE.getBPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPACKAGE__MODEL = eINSTANCE.getBPackage_Model();

		/**
		 * The meta object literal for the '<em><b>XPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPACKAGE__XPACKAGE = eINSTANCE.getBPackage_XPackage();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPACKAGE__SERVICES = eINSTANCE.getBPackage_Services();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.impl.BServiceImpl <em>BService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.impl.BServiceImpl
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBService()
		 * @generated
		 */
		EClass BSERVICE = eINSTANCE.getBService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSERVICE__NAME = eINSTANCE.getBService_Name();

		/**
		 * The meta object literal for the '<em><b>BPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSERVICE__BPACKAGE = eINSTANCE.getBService_BPackage();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSERVICE__METHODS = eINSTANCE.getBService_Methods();

		/**
		 * The meta object literal for the '<em><b>XClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSERVICE__XCLASS = eINSTANCE.getBService_XClass();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.impl.BParameterImpl <em>BParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.impl.BParameterImpl
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBParameter()
		 * @generated
		 */
		EClass BPARAMETER = eINSTANCE.getBParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER__NAME = eINSTANCE.getBParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER__TYPE = eINSTANCE.getBParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER__NATURE = eINSTANCE.getBParameter_Nature();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER__CONSTANT = eINSTANCE.getBParameter_Constant();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER__METHOD = eINSTANCE.getBParameter_Method();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.impl.BMethodImpl <em>BMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.impl.BMethodImpl
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBMethod()
		 * @generated
		 */
		EClass BMETHOD = eINSTANCE.getBMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BMETHOD__NAME = eINSTANCE.getBMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMETHOD__PARAMETERS = eINSTANCE.getBMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMETHOD__SERVICE = eINSTANCE.getBMethod_Service();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdlbo.BParameterNature <em>BParameter Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdlbo.BParameterNature
		 * @see org.xmdl.xmdlbo.impl.XmdlboPackageImpl#getBParameterNature()
		 * @generated
		 */
		EEnum BPARAMETER_NATURE = eINSTANCE.getBParameterNature();

	}

} //XmdlboPackage
