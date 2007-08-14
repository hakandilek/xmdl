/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdl.XEnumeration#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdl.XEnumeration#getLiterals <em>Literals</em>}</li>
 *   <li>{@link chrome.xmdl.XEnumeration#getDefaultLiteral <em>Default Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdl.XmdlPackage#getXEnumeration()
 * @model
 * @generated
 */
public interface XEnumeration extends XBase, XType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>XPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XPackage#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPackage</em>' container reference.
	 * @see chrome.xmdl.XmdlPackage#getXEnumeration_XPackage()
	 * @see chrome.xmdl.XPackage#getEnumerations
	 * @model opposite="enumerations" required="true" changeable="false"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdl.XEnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XEnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see chrome.xmdl.XmdlPackage#getXEnumeration_Literals()
	 * @see chrome.xmdl.XEnumerationLiteral#getEnumeration
	 * @model type="chrome.xmdl.XEnumerationLiteral" opposite="enumeration" containment="true"
	 * @generated
	 */
	EList getLiterals();

	/**
	 * Returns the value of the '<em><b>Default Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Literal</em>' reference.
	 * @see #setDefaultLiteral(XEnumerationLiteral)
	 * @see chrome.xmdl.XmdlPackage#getXEnumeration_DefaultLiteral()
	 * @model required="true"
	 * @generated
	 */
	XEnumerationLiteral getDefaultLiteral();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XEnumeration#getDefaultLiteral <em>Default Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Literal</em>' reference.
	 * @see #getDefaultLiteral()
	 * @generated
	 */
	void setDefaultLiteral(XEnumerationLiteral value);

} // XEnumeration
