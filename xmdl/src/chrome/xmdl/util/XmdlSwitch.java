/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlSwitch.java,v 1.8 2006/02/10 09:32:58 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.util;

import chrome.xmdl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see chrome.xmdl.XmdlPackage
 * @generated
 */
public class XmdlSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlSwitch() {
		if (modelPackage == null) {
			modelPackage = XmdlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					(EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case XmdlPackage.XATTRIBUTE: {
			XAttribute xAttribute = (XAttribute) theEObject;
			Object result = caseXAttribute(xAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XCLASS: {
			XClass xClass = (XClass) theEObject;
			Object result = caseXClass(xClass);
			if (result == null)
				result = caseXBase(xClass);
			if (result == null)
				result = caseXType(xClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XPACKAGE: {
			XPackage xPackage = (XPackage) theEObject;
			Object result = caseXPackage(xPackage);
			if (result == null)
				result = caseXBase(xPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XPROJECT: {
			XProject xProject = (XProject) theEObject;
			Object result = caseXProject(xProject);
			if (result == null)
				result = caseXBase(xProject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XBASE: {
			XBase xBase = (XBase) theEObject;
			Object result = caseXBase(xBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XMETHOD: {
			XMethod xMethod = (XMethod) theEObject;
			Object result = caseXMethod(xMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XPARAMETER: {
			XParameter xParameter = (XParameter) theEObject;
			Object result = caseXParameter(xParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XEXCEPTION: {
			XException xException = (XException) theEObject;
			Object result = caseXException(xException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XTYPE: {
			XType xType = (XType) theEObject;
			Object result = caseXType(xType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XMODEL: {
			XModel xModel = (XModel) theEObject;
			Object result = caseXModel(xModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XENUMERATION: {
			XEnumeration xEnumeration = (XEnumeration) theEObject;
			Object result = caseXEnumeration(xEnumeration);
			if (result == null)
				result = caseXBase(xEnumeration);
			if (result == null)
				result = caseXType(xEnumeration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdlPackage.XENUMERATION_LITERAL: {
			XEnumerationLiteral xEnumerationLiteral = (XEnumerationLiteral) theEObject;
			Object result = caseXEnumerationLiteral(xEnumerationLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXAttribute(XAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXClass(XClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXPackage(XPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XProject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XProject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXProject(XProject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XBase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XBase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXBase(XBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXMethod(XMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXParameter(XParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XException</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XException</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXException(XException object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXType(XType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXModel(XModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXEnumeration(XEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XEnumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XEnumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXEnumerationLiteral(XEnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //XmdlSwitch
