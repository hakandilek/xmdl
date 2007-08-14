/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlFactoryImpl.java,v 1.8 2006/02/10 09:32:58 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.impl;

import chrome.xmdl.*;

import org.eclipse.core.runtime.IPath;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlFactoryImpl extends EFactoryImpl implements XmdlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case XmdlPackage.XATTRIBUTE:
			return createXAttribute();
		case XmdlPackage.XCLASS:
			return createXClass();
		case XmdlPackage.XPACKAGE:
			return createXPackage();
		case XmdlPackage.XPROJECT:
			return createXProject();
		case XmdlPackage.XMETHOD:
			return createXMethod();
		case XmdlPackage.XPARAMETER:
			return createXParameter();
		case XmdlPackage.XEXCEPTION:
			return createXException();
		case XmdlPackage.XENUMERATION:
			return createXEnumeration();
		case XmdlPackage.XENUMERATION_LITERAL:
			return createXEnumerationLiteral();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case XmdlPackage.XASSOCIATION_TYPE: {
			XAssociationType result = XAssociationType.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException("The value '" + initialValue
						+ "' is not a valid enumerator of '"
						+ eDataType.getName() + "'");
			return result;
		}
		case XmdlPackage.XASSOCIATION_BEHAVIOUR: {
			XAssociationBehaviour result = XAssociationBehaviour
					.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException("The value '" + initialValue
						+ "' is not a valid enumerator of '"
						+ eDataType.getName() + "'");
			return result;
		}
		case XmdlPackage.IPATH:
			return createIPathFromString(eDataType, initialValue);
		case XmdlPackage.URI:
			return createURIFromString(eDataType, initialValue);
		case XmdlPackage.RESOURCE:
			return createResourceFromString(eDataType, initialValue);
		case XmdlPackage.COMPARABLE:
			return createComparableFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case XmdlPackage.XASSOCIATION_TYPE:
			return instanceValue == null ? null : instanceValue.toString();
		case XmdlPackage.XASSOCIATION_BEHAVIOUR:
			return instanceValue == null ? null : instanceValue.toString();
		case XmdlPackage.IPATH:
			return convertIPathToString(eDataType, instanceValue);
		case XmdlPackage.URI:
			return convertURIToString(eDataType, instanceValue);
		case XmdlPackage.RESOURCE:
			return convertResourceToString(eDataType, instanceValue);
		case XmdlPackage.COMPARABLE:
			return convertComparableToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute createXAttribute() {
		XAttributeImpl xAttribute = new XAttributeImpl();
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass createXClass() {
		XClassImpl xClass = new XClassImpl();
		return xClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage createXPackage() {
		XPackageImpl xPackage = new XPackageImpl();
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject createXProject() {
		XProjectImpl xProject = new XProjectImpl();
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMethod createXMethod() {
		XMethodImpl xMethod = new XMethodImpl();
		return xMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParameter createXParameter() {
		XParameterImpl xParameter = new XParameterImpl();
		return xParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XException createXException() {
		XExceptionImpl xException = new XExceptionImpl();
		return xException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumeration createXEnumeration() {
		XEnumerationImpl xEnumeration = new XEnumerationImpl();
		return xEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumerationLiteral createXEnumerationLiteral() {
		XEnumerationLiteralImpl xEnumerationLiteral = new XEnumerationLiteralImpl();
		return xEnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath createIPathFromString(EDataType eDataType, String initialValue) {
		return (IPath) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPathToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceFromString(EDataType eDataType,
			String initialValue) {
		return (Resource) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable createComparableFromString(EDataType eDataType,
			String initialValue) {
		return (Comparable) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparableToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlPackage getXmdlPackage() {
		return (XmdlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static XmdlPackage getPackage() {
		return XmdlPackage.eINSTANCE;
	}

} //XmdlFactoryImpl
