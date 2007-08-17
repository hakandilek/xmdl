/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.util;

import chrome.xmdl.XModel;

import chrome.xmdldb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdldb.XmdldbPackage
 * @generated
 */
public class XmdldbAdapterFactory extends AdapterFactoryImpl {
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
	protected static XmdldbPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdldbAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmdldbPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmdldbSwitch<Adapter> modelSwitch = new XmdldbSwitch<Adapter>() {
		@Override
		public Adapter caseDModel(DModel object) {
			return createDModelAdapter();
		}

		@Override
		public Adapter caseDPackage(DPackage object) {
			return createDPackageAdapter();
		}

		@Override
		public Adapter caseDTable(DTable object) {
			return createDTableAdapter();
		}

		@Override
		public Adapter caseDField(DField object) {
			return createDFieldAdapter();
		}

		@Override
		public Adapter caseXMDLDBModel(XMDLDBModel object) {
			return createXMDLDBModelAdapter();
		}

		@Override
		public Adapter caseDIndex(DIndex object) {
			return createDIndexAdapter();
		}

		@Override
		public Adapter casePersistable(Persistable object) {
			return createPersistableAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.DModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.DModel
	 * @generated
	 */
	public Adapter createDModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.DPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.DPackage
	 * @generated
	 */
	public Adapter createDPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.DTable <em>DTable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.DTable
	 * @generated
	 */
	public Adapter createDTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.DField <em>DField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.DField
	 * @generated
	 */
	public Adapter createDFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.XMDLDBModel <em>XMDLDB Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.XMDLDBModel
	 * @generated
	 */
	public Adapter createXMDLDBModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.DIndex <em>DIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.DIndex
	 * @generated
	 */
	public Adapter createDIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdldb.Persistable <em>Persistable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdldb.Persistable
	 * @generated
	 */
	public Adapter createPersistableAdapter() {
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

} //XmdldbAdapterFactory
