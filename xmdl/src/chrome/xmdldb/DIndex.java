/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIndex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdldb.DIndex#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.DIndex#isUnique <em>Unique</em>}</li>
 *   <li>{@link chrome.xmdldb.DIndex#getDTable <em>DTable</em>}</li>
 *   <li>{@link chrome.xmdldb.DIndex#getDfields <em>Dfields</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdldb.XmdldbPackage#getDIndex()
 * @model
 * @generated
 */
public interface DIndex extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see chrome.xmdldb.XmdldbPackage#getDIndex_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DIndex#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see chrome.xmdldb.XmdldbPackage#getDIndex_Unique()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DIndex#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>DTable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTable</em>' reference.
	 * @see #setDTable(DTable)
	 * @see chrome.xmdldb.XmdldbPackage#getDIndex_DTable()
	 * @model required="true"
	 * @generated
	 */
	DTable getDTable();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DIndex#getDTable <em>DTable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTable</em>' reference.
	 * @see #getDTable()
	 * @generated
	 */
	void setDTable(DTable value);

	/**
	 * Returns the value of the '<em><b>Dfields</b></em>' reference list.
	 * The list contents are of type {@link chrome.xmdldb.DField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dfields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dfields</em>' reference list.
	 * @see chrome.xmdldb.XmdldbPackage#getDIndex_Dfields()
	 * @model type="chrome.xmdldb.DField"
	 * @generated
	 */
	EList getDfields();

} // DIndex
