/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.util;

import chrome.xmdl.XModel;

import chrome.xmdldb.*;

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
 * @see chrome.xmdldb.XmdldbPackage
 * @generated
 */
public class XmdldbSwitch {
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
	protected static XmdldbPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdldbSwitch() {
		if (modelPackage == null) {
			modelPackage = XmdldbPackage.eINSTANCE;
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
		case XmdldbPackage.DMODEL: {
			DModel dModel = (DModel) theEObject;
			Object result = caseDModel(dModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DPACKAGE: {
			DPackage dPackage = (DPackage) theEObject;
			Object result = caseDPackage(dPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DTABLE: {
			DTable dTable = (DTable) theEObject;
			Object result = caseDTable(dTable);
			if (result == null)
				result = casePersistable(dTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DFIELD: {
			DField dField = (DField) theEObject;
			Object result = caseDField(dField);
			if (result == null)
				result = casePersistable(dField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.XMDLDB_MODEL: {
			XMDLDBModel xmdldbModel = (XMDLDBModel) theEObject;
			Object result = caseXMDLDBModel(xmdldbModel);
			if (result == null)
				result = caseXModel(xmdldbModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DINDEX: {
			DIndex dIndex = (DIndex) theEObject;
			Object result = caseDIndex(dIndex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.PERSISTABLE: {
			Persistable persistable = (Persistable) theEObject;
			Object result = casePersistable(persistable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>DModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>DModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDModel(DModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>DPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>DPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDPackage(DPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>DTable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>DTable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDTable(DTable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>DField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>DField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDField(DField object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XMDLDB Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XMDLDB Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXMDLDBModel(XMDLDBModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>DIndex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>DIndex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDIndex(DIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Persistable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Persistable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePersistable(Persistable object) {
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

} //XmdldbSwitch
