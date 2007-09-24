/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenFactoryImpl.java,v 1.1 2006/01/16 11:34:34 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen.impl;

import chrome.xmdlgen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlgenFactoryImpl extends EFactoryImpl implements XmdlgenFactory {
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
	public static XmdlgenFactory init() {
		try {
			XmdlgenFactory theXmdlgenFactory = (XmdlgenFactory)EPackage.Registry.INSTANCE.getEFactory("http://chrome/xmdl.gen.ecore"); 
			if (theXmdlgenFactory != null) {
				return theXmdlgenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmdlgenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlgenFactoryImpl() {
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
			case XmdlgenPackage.GMODEL: return createGModel();
			case XmdlgenPackage.GPACKAGE: return createGPackage();
			case XmdlgenPackage.GCLASS: return createGClass();
			case XmdlgenPackage.GATTRIBUTE: return createGAttribute();
			case XmdlgenPackage.XMDL_GEN_MODEL: return createXMDLGenModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GModel createGModel() {
		GModelImpl gModel = new GModelImpl();
		return gModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPackage createGPackage() {
		GPackageImpl gPackage = new GPackageImpl();
		return gPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GClass createGClass() {
		GClassImpl gClass = new GClassImpl();
		return gClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAttribute createGAttribute() {
		GAttributeImpl gAttribute = new GAttributeImpl();
		return gAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLGenModel createXMDLGenModel() {
		XMDLGenModelImpl xmdlGenModel = new XMDLGenModelImpl();
		return xmdlGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlgenPackage getXmdlgenPackage() {
		return (XmdlgenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmdlgenPackage getPackage() {
		return XmdlgenPackage.eINSTANCE;
	}

} //XmdlgenFactoryImpl
