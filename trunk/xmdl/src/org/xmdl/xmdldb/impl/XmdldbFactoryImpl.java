/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdldb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.xmdl.xmdldb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdldbFactoryImpl extends EFactoryImpl implements XmdldbFactory {
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
	public static XmdldbFactory init() {
		try {
			XmdldbFactory theXmdldbFactory = (XmdldbFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.xmdl.org/xmdldb.ecore");
			if (theXmdldbFactory != null) {
				return theXmdldbFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmdldbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdldbFactoryImpl() {
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
		case XmdldbPackage.DMODEL:
			return createDModel();
		case XmdldbPackage.DPACKAGE:
			return createDPackage();
		case XmdldbPackage.DTABLE:
			return createDTable();
		case XmdldbPackage.DFIELD:
			return createDField();
		case XmdldbPackage.XMDLDB_MODEL:
			return createXMDLDBModel();
		case XmdldbPackage.DINDEX:
			return createDIndex();
		case XmdldbPackage.DVISITOR_BASE:
			return createDVisitorBase();
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
	public DModel createDModel() {
		DModelImpl dModel = new DModelImpl();
		return dModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPackage createDPackage() {
		DPackageImpl dPackage = new DPackageImpl();
		return dPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTable createDTable() {
		DTableImpl dTable = new DTableImpl();
		return dTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DField createDField() {
		DFieldImpl dField = new DFieldImpl();
		return dField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLDBModel createXMDLDBModel() {
		XMDLDBModelImpl xmdldbModel = new XMDLDBModelImpl();
		return xmdldbModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIndex createDIndex() {
		DIndexImpl dIndex = new DIndexImpl();
		return dIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DVisitorBase createDVisitorBase() {
		DVisitorBaseImpl dVisitorBase = new DVisitorBaseImpl();
		return dVisitorBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdldbPackage getXmdldbPackage() {
		return (XmdldbPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmdldbPackage getPackage() {
		return XmdldbPackage.eINSTANCE;
	}

} //XmdldbFactoryImpl
