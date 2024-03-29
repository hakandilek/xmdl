/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenSwitch.java,v 1.1 2006/01/16 11:34:42 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen.util;


import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xmdl.xmdlgen.XmdlgenPackage
 * @generated
 */
public class XmdlgenSwitch<T> {
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
	protected static XmdlgenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlgenSwitch() {
		if (modelPackage == null) {
			modelPackage = XmdlgenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmdlgenPackage.GMODEL: {
				GModel gModel = (GModel)theEObject;
				T result = caseGModel(gModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmdlgenPackage.GPACKAGE: {
				GPackage gPackage = (GPackage)theEObject;
				T result = caseGPackage(gPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmdlgenPackage.GCLASS: {
				GClass gClass = (GClass)theEObject;
				T result = caseGClass(gClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmdlgenPackage.GATTRIBUTE: {
				GAttribute gAttribute = (GAttribute)theEObject;
				T result = caseGAttribute(gAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmdlgenPackage.XMDL_GEN_MODEL: {
				XMDLGenModel xmdlGenModel = (XMDLGenModel)theEObject;
				T result = caseXMDLGenModel(xmdlGenModel);
				if (result == null) result = caseXModel(xmdlGenModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGModel(GModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPackage(GPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGClass(GClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGAttribute(GAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMDL Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMDL Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMDLGenModel(XMDLGenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXModel(XModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //XmdlgenSwitch
