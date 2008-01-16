/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlFactoryImpl.java,v 1.8 2006/02/10 09:32:58 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl.impl;

import org.eclipse.core.runtime.IPath;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xmdl.*;

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
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmdlFactory init() {
		try {
			XmdlFactory theXmdlFactory = (XmdlFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.xmdl.org/xmdl.ecore");
			if (theXmdlFactory != null) {
				return theXmdlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmdlFactoryImpl();
	}

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
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case XmdlPackage.XPROJECT:
			return createXProject();
		case XmdlPackage.XPACKAGE:
			return createXPackage();
		case XmdlPackage.XCLASS:
			return createXClass();
		case XmdlPackage.XENUMERATION:
			return createXEnumeration();
		case XmdlPackage.XENUMERATION_LITERAL:
			return createXEnumerationLiteral();
		case XmdlPackage.XATTRIBUTE:
			return createXAttribute();
		case XmdlPackage.XMETHOD:
			return createXMethod();
		case XmdlPackage.XPARAMETER:
			return createXParameter();
		case XmdlPackage.XEXCEPTION:
			return createXException();
		case XmdlPackage.XVISITOR_BASE:
			return createXVisitorBase();
		case XmdlPackage.XMDL_MODEL:
			return createXMDLModel();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case XmdlPackage.XASSOCIATION_TYPE:
			return createXAssociationTypeFromString(eDataType, initialValue);
		case XmdlPackage.XASSOCIATION_BEHAVIOUR:
			return createXAssociationBehaviourFromString(eDataType,
					initialValue);
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
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case XmdlPackage.XASSOCIATION_TYPE:
			return convertXAssociationTypeToString(eDataType, instanceValue);
		case XmdlPackage.XASSOCIATION_BEHAVIOUR:
			return convertXAssociationBehaviourToString(eDataType,
					instanceValue);
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
	public XVisitorBase createXVisitorBase() {
		XVisitorBaseImpl xVisitorBase = new XVisitorBaseImpl();
		return xVisitorBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLModel createXMDLModel() {
		XMDLModelImpl xmdlModel = new XMDLModelImpl();
		return xmdlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAssociationType createXAssociationTypeFromString(
			EDataType eDataType, String initialValue) {
		XAssociationType result = XAssociationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXAssociationTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAssociationBehaviour createXAssociationBehaviourFromString(
			EDataType eDataType, String initialValue) {
		XAssociationBehaviour result = XAssociationBehaviour.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXAssociationBehaviourToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	@SuppressWarnings("unchecked")
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
	@Deprecated
	public static XmdlPackage getPackage() {
		return XmdlPackage.eINSTANCE;
	}

} //XmdlFactoryImpl
