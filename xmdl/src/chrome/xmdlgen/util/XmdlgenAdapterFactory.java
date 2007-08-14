/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenAdapterFactory.java,v 1.2 2006/04/26 07:44:44 tr001\tr1a3571 Exp $
 */
package chrome.xmdlgen.util;

import chrome.xmdl.XModel;

import chrome.xmdlgen.*;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdlgen.XmdlgenPackage
 * @generated
 */
public class XmdlgenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmdlgenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlgenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmdlgenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmdlgenSwitch modelSwitch =
		new XmdlgenSwitch() {
			public Object caseGModel(GModel object) {
				return createGModelAdapter();
			}
			public Object caseGPackage(GPackage object) {
				return createGPackageAdapter();
			}
			public Object caseGClass(GClass object) {
				return createGClassAdapter();
			}
			public Object caseGAttribute(GAttribute object) {
				return createGAttributeAdapter();
			}
			public Object caseXMDLGenModel(XMDLGenModel object) {
				return createXMDLGenModelAdapter();
			}
			public Object caseXModel(XModel object) {
				return createXModelAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlgen.GModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlgen.GModel
	 * @generated
	 */
	public Adapter createGModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlgen.GPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlgen.GPackage
	 * @generated
	 */
	public Adapter createGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlgen.GClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlgen.GClass
	 * @generated
	 */
	public Adapter createGClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlgen.GAttribute <em>GAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlgen.GAttribute
	 * @generated
	 */
	public Adapter createGAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlgen.XMDLGenModel <em>XMDL Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlgen.XMDLGenModel
	 * @generated
	 */
	public Adapter createXMDLGenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XModel
	 * @generated
	 */
	public Adapter createXModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XmdlgenAdapterFactory
