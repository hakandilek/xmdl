/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlAdapterFactory.java,v 1.7 2006/02/10 09:32:58 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.util;

import chrome.xmdl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdl.XmdlPackage
 * @generated
 */
public class XmdlAdapterFactory extends AdapterFactoryImpl {
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
	protected static XmdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmdlPackage.eINSTANCE;
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
	protected XmdlSwitch<Adapter> modelSwitch = new XmdlSwitch<Adapter>() {
		@Override
		public Adapter caseXProject(XProject object) {
			return createXProjectAdapter();
		}

		@Override
		public Adapter caseXPackage(XPackage object) {
			return createXPackageAdapter();
		}

		@Override
		public Adapter caseXClass(XClass object) {
			return createXClassAdapter();
		}

		@Override
		public Adapter caseXEnumeration(XEnumeration object) {
			return createXEnumerationAdapter();
		}

		@Override
		public Adapter caseXEnumerationLiteral(XEnumerationLiteral object) {
			return createXEnumerationLiteralAdapter();
		}

		@Override
		public Adapter caseXAttribute(XAttribute object) {
			return createXAttributeAdapter();
		}

		@Override
		public Adapter caseXMethod(XMethod object) {
			return createXMethodAdapter();
		}

		@Override
		public Adapter caseXParameter(XParameter object) {
			return createXParameterAdapter();
		}

		@Override
		public Adapter caseXBase(XBase object) {
			return createXBaseAdapter();
		}

		@Override
		public Adapter caseXType(XType object) {
			return createXTypeAdapter();
		}

		@Override
		public Adapter caseXException(XException object) {
			return createXExceptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XAttribute
	 * @generated
	 */
	public Adapter createXAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XClass
	 * @generated
	 */
	public Adapter createXClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XPackage
	 * @generated
	 */
	public Adapter createXPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XProject <em>XProject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XProject
	 * @generated
	 */
	public Adapter createXProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XBase <em>XBase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XBase
	 * @generated
	 */
	public Adapter createXBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XMethod <em>XMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XMethod
	 * @generated
	 */
	public Adapter createXMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XParameter <em>XParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XParameter
	 * @generated
	 */
	public Adapter createXParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XException <em>XException</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XException
	 * @generated
	 */
	public Adapter createXExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XType <em>XType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XType
	 * @generated
	 */
	public Adapter createXTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XEnumeration <em>XEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XEnumeration
	 * @generated
	 */
	public Adapter createXEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link chrome.xmdl.XEnumerationLiteral <em>XEnumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see chrome.xmdl.XEnumerationLiteral
	 * @generated
	 */
	public Adapter createXEnumerationLiteralAdapter() {
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

} //XmdlAdapterFactory
