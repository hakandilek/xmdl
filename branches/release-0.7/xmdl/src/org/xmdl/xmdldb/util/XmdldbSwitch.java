/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdldb.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XModel;
import org.xmdl.xmdldb.*;

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
 * @see org.xmdl.xmdldb.XmdldbPackage
 * @generated
 */
public class XmdldbSwitch<T> {
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
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
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
		case XmdldbPackage.DMODEL: {
			DModel dModel = (DModel) theEObject;
			T result = caseDModel(dModel);
			if (result == null)
				result = caseDBase(dModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DPACKAGE: {
			DPackage dPackage = (DPackage) theEObject;
			T result = caseDPackage(dPackage);
			if (result == null)
				result = caseDBase(dPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DTABLE: {
			DTable dTable = (DTable) theEObject;
			T result = caseDTable(dTable);
			if (result == null)
				result = casePersistable(dTable);
			if (result == null)
				result = caseDBase(dTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DFIELD: {
			DField dField = (DField) theEObject;
			T result = caseDField(dField);
			if (result == null)
				result = casePersistable(dField);
			if (result == null)
				result = caseDBase(dField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.XMDLDB_MODEL: {
			XMDLDBModel xmdldbModel = (XMDLDBModel) theEObject;
			T result = caseXMDLDBModel(xmdldbModel);
			if (result == null)
				result = caseXModel(xmdldbModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DINDEX: {
			DIndex dIndex = (DIndex) theEObject;
			T result = caseDIndex(dIndex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.PERSISTABLE: {
			Persistable persistable = (Persistable) theEObject;
			T result = casePersistable(persistable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DBASE: {
			DBase dBase = (DBase) theEObject;
			T result = caseDBase(dBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DVISITOR: {
			DVisitor dVisitor = (DVisitor) theEObject;
			T result = caseDVisitor(dVisitor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmdldbPackage.DVISITOR_BASE: {
			DVisitorBase dVisitorBase = (DVisitorBase) theEObject;
			T result = caseDVisitorBase(dVisitorBase);
			if (result == null)
				result = caseDVisitor(dVisitorBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDModel(DModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPackage(DPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTable(DTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDField(DField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMDLDB Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMDLDB Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMDLDBModel(XMDLDBModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIndex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIndex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIndex(DIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistable(Persistable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DVisitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DVisitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDVisitor(DVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DVisitor Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DVisitor Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDVisitorBase(DVisitorBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBase(DBase object) {
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

} //XmdldbSwitch
