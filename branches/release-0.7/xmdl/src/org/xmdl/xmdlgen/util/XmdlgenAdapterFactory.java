/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenAdapterFactory.java,v 1.2 2006/04/26 07:44:44 tr001\tr1a3571 Exp $
 */
package org.xmdl.xmdlgen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XModel;
import org.xmdl.xmdlgen.GAttribute;
import org.xmdl.xmdlgen.GClass;
import org.xmdl.xmdlgen.GModel;
import org.xmdl.xmdlgen.GPackage;
import org.xmdl.xmdlgen.XMDLGenModel;
import org.xmdl.xmdlgen.XmdlgenPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xmdl.xmdlgen.XmdlgenPackage
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
	@Override
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
	protected XmdlgenSwitch<Adapter> modelSwitch =
		new XmdlgenSwitch<Adapter>() {
			@Override
			public Adapter caseGModel(GModel object) {
				return createGModelAdapter();
			}
			@Override
			public Adapter caseGPackage(GPackage object) {
				return createGPackageAdapter();
			}
			@Override
			public Adapter caseGClass(GClass object) {
				return createGClassAdapter();
			}
			@Override
			public Adapter caseGAttribute(GAttribute object) {
				return createGAttributeAdapter();
			}
			@Override
			public Adapter caseXMDLGenModel(XMDLGenModel object) {
				return createXMDLGenModelAdapter();
			}
			@Override
			public Adapter caseXModel(XModel object) {
				return createXModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xmdl.xmdlgen.GModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdl.xmdlgen.GModel
	 * @generated
	 */
	public Adapter createGModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdl.xmdlgen.GPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdl.xmdlgen.GPackage
	 * @generated
	 */
	public Adapter createGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdl.xmdlgen.GClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdl.xmdlgen.GClass
	 * @generated
	 */
	public Adapter createGClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdl.xmdlgen.GAttribute <em>GAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdl.xmdlgen.GAttribute
	 * @generated
	 */
	public Adapter createGAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdl.xmdlgen.XMDLGenModel <em>XMDL Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdl.xmdlgen.XMDLGenModel
	 * @generated
	 */
	public Adapter createXMDLGenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdl.xmdl.XModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdl.xmdl.XModel
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
