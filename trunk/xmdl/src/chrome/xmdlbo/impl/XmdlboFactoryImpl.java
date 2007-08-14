/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlboFactoryImpl.java,v 1.2 2006/01/19 12:21:22 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo.impl;

import chrome.xmdlbo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlboFactoryImpl extends EFactoryImpl implements XmdlboFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlboFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmdlboPackage.BMODEL: return createBModel();
			case XmdlboPackage.XMDLBO_MODEL: return createXMDLBOModel();
			case XmdlboPackage.BPACKAGE: return createBPackage();
			case XmdlboPackage.BSERVICE: return createBService();
			case XmdlboPackage.BPARAMETER: return createBParameter();
			case XmdlboPackage.BMETHOD: return createBMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XmdlboPackage.BPARAMETER_NATURE: {
				BParameterNature result = BParameterNature.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XmdlboPackage.BPARAMETER_NATURE:
				return instanceValue == null ? null : instanceValue.toString();
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BModel createBModel() {
		BModelImpl bModel = new BModelImpl();
		return bModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLBOModel createXMDLBOModel() {
		XMDLBOModelImpl xmdlboModel = new XMDLBOModelImpl();
		return xmdlboModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPackage createBPackage() {
		BPackageImpl bPackage = new BPackageImpl();
		return bPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BService createBService() {
		BServiceImpl bService = new BServiceImpl();
		return bService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameter createBParameter() {
		BParameterImpl bParameter = new BParameterImpl();
		return bParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMethod createBMethod() {
		BMethodImpl bMethod = new BMethodImpl();
		return bMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlboPackage getXmdlboPackage() {
		return (XmdlboPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static XmdlboPackage getPackage() {
		return XmdlboPackage.eINSTANCE;
	}

} //XmdlboFactoryImpl
