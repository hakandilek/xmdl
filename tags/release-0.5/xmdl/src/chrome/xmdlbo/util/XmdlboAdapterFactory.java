/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlboAdapterFactory.java,v 1.2 2006/01/19 12:21:23 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo.util;

import chrome.xmdl.XModel;

import chrome.xmdlbo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdlbo.XmdlboPackage
 * @generated
 */
public class XmdlboAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmdlboPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlboAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmdlboPackage.eINSTANCE;
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
	protected XmdlboSwitch<Adapter> modelSwitch =
		new XmdlboSwitch<Adapter>() {
			@Override
			public Adapter caseBModel(BModel object) {
				return createBModelAdapter();
			}
			@Override
			public Adapter caseXMDLBOModel(XMDLBOModel object) {
				return createXMDLBOModelAdapter();
			}
			@Override
			public Adapter caseBPackage(BPackage object) {
				return createBPackageAdapter();
			}
			@Override
			public Adapter caseBService(BService object) {
				return createBServiceAdapter();
			}
			@Override
			public Adapter caseBParameter(BParameter object) {
				return createBParameterAdapter();
			}
			@Override
			public Adapter caseBMethod(BMethod object) {
				return createBMethodAdapter();
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
	 * Creates a new adapter for an object of class '{@link chrome.xmdlbo.BModel <em>BModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlbo.BModel
	 * @generated
	 */
	public Adapter createBModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlbo.XMDLBOModel <em>XMDLBO Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlbo.XMDLBOModel
	 * @generated
	 */
	public Adapter createXMDLBOModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlbo.BPackage <em>BPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlbo.BPackage
	 * @generated
	 */
	public Adapter createBPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlbo.BService <em>BService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlbo.BService
	 * @generated
	 */
	public Adapter createBServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlbo.BParameter <em>BParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlbo.BParameter
	 * @generated
	 */
	public Adapter createBParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdlbo.BMethod <em>BMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdlbo.BMethod
	 * @generated
	 */
	public Adapter createBMethodAdapter() {
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

} //XmdlboAdapterFactory
