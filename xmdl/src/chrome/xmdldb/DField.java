/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb;

import org.eclipse.emf.common.util.EList;

import chrome.xmdl.XAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdldb.DField#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link chrome.xmdldb.DField#getDTable <em>DTable</em>}</li>
 *   <li>{@link chrome.xmdldb.DField#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.DField#getLength <em>Length</em>}</li>
 *   <li>{@link chrome.xmdldb.DField#getIndices <em>Indices</em>}</li>
 *   <li>{@link chrome.xmdldb.DField#getForeign <em>Foreign</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdldb.XmdldbPackage#getDField()
 * @model
 * @generated
 */
public interface DField extends Persistable, DBase {
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
	 * @see chrome.xmdldb.XmdldbPackage#getDField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see chrome.xmdldb.XmdldbPackage#getDField_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DField#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>DTable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdldb.DTable#getDFields <em>DFields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTable</em>' container reference.
	 * @see #setDTable(DTable)
	 * @see chrome.xmdldb.XmdldbPackage#getDField_DTable()
	 * @see chrome.xmdldb.DTable#getDFields
	 * @model opposite="dFields" transient="false"
	 * @generated
	 */
	DTable getDTable();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DField#getDTable <em>DTable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTable</em>' container reference.
	 * @see #getDTable()
	 * @generated
	 */
	void setDTable(DTable value);

	/**
	 * Returns the value of the '<em><b>XAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAttribute</em>' reference.
	 * @see #setXAttribute(XAttribute)
	 * @see chrome.xmdldb.XmdldbPackage#getDField_XAttribute()
	 * @model required="true"
	 * @generated
	 */
	XAttribute getXAttribute();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DField#getXAttribute <em>XAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAttribute</em>' reference.
	 * @see #getXAttribute()
	 * @generated
	 */
	void setXAttribute(XAttribute value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' attribute list.
	 * @see chrome.xmdldb.XmdldbPackage#getDField_Indices()
	 * @model default="0"
	 * @generated
	 */
	EList<Integer> getIndices();

	/**
	 * Returns the value of the '<em><b>Foreign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign</em>' reference.
	 * @see #setForeign(DField)
	 * @see chrome.xmdldb.XmdldbPackage#getDField_Foreign()
	 * @model
	 * @generated
	 */
	DField getForeign();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DField#getForeign <em>Foreign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign</em>' reference.
	 * @see #getForeign()
	 * @generated
	 */
	void setForeign(DField value);

	void initialize(XAttribute attribute);

} // DField
