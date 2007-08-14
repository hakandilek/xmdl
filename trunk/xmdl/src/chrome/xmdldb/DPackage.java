/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb;

import chrome.xmdl.XPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdldb.DPackage#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.DPackage#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdldb.DPackage#getModel <em>Model</em>}</li>
 *   <li>{@link chrome.xmdldb.DPackage#getDTables <em>DTables</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdldb.XmdldbPackage#getDPackage()
 * @model
 * @generated
 */
public interface DPackage extends EObject {
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
	 * @see chrome.xmdldb.XmdldbPackage#getDPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>DTables</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdldb.DTable}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdldb.DTable#getDPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTables</em>' containment reference list.
	 * @see chrome.xmdldb.XmdldbPackage#getDPackage_DTables()
	 * @see chrome.xmdldb.DTable#getDPackage
	 * @model type="chrome.xmdldb.DTable" opposite="dPackage" containment="true"
	 * @generated
	 */
	EList getDTables();

	/**
	 * Returns the value of the '<em><b>XPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPackage</em>' reference.
	 * @see #setXPackage(XPackage)
	 * @see chrome.xmdldb.XmdldbPackage#getDPackage_XPackage()
	 * @model required="true"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DPackage#getXPackage <em>XPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPackage</em>' reference.
	 * @see #getXPackage()
	 * @generated
	 */
	void setXPackage(XPackage value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdldb.DModel#getDPackages <em>DPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(DModel)
	 * @see chrome.xmdldb.XmdldbPackage#getDPackage_Model()
	 * @see chrome.xmdldb.DModel#getDPackages
	 * @model opposite="dPackages" required="true"
	 * @generated
	 */
	DModel getModel();

	/**
	 * Sets the value of the '{@link chrome.xmdldb.DPackage#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(DModel value);

} // DPackage
