/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb;

import org.eclipse.emf.common.util.EList;

import chrome.xmdl.XClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdldb.DTable#getXClass <em>XClass</em>}</li>
 *   <li>{@link chrome.xmdldb.DTable#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.DTable#getDPackage <em>DPackage</em>}</li>
 *   <li>{@link chrome.xmdldb.DTable#getDFields <em>DFields</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdldb.XmdldbPackage#getDTable()
 * @model
 * @generated
 */
public interface DTable extends Persistable {
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
	 * @see chrome.xmdldb.XmdldbPackage#getDTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>DPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdldb.DPackage#getDTables <em>DTables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DPackage</em>' container reference.
	 * @see #setDPackage(DPackage)
	 * @see chrome.xmdldb.XmdldbPackage#getDTable_DPackage()
	 * @see chrome.xmdldb.DPackage#getDTables
	 * @model opposite="dTables" transient="false"
	 * @generated
	 */
	DPackage getDPackage();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DTable#getDPackage <em>DPackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DPackage</em>' container reference.
	 * @see #getDPackage()
	 * @generated
	 */
	void setDPackage(DPackage value);

	/**
	 * Returns the value of the '<em><b>DFields</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdldb.DField}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdldb.DField#getDTable <em>DTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DFields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DFields</em>' containment reference list.
	 * @see chrome.xmdldb.XmdldbPackage#getDTable_DFields()
	 * @see chrome.xmdldb.DField#getDTable
	 * @model opposite="dTable" containment="true"
	 * @generated
	 */
	EList<DField> getDFields();

	/**
	 * Returns the value of the '<em><b>XClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XClass</em>' reference.
	 * @see #setXClass(XClass)
	 * @see chrome.xmdldb.XmdldbPackage#getDTable_XClass()
	 * @model required="true"
	 * @generated
	 */
	XClass getXClass();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DTable#getXClass <em>XClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XClass</em>' reference.
	 * @see #getXClass()
	 * @generated
	 */
	void setXClass(XClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DIndex> getIndices();

	void initialize(XClass xClass);

} // DTable
