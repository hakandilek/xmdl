/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XException</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdl.XException#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdl.XmdlPackage#getXException()
 * @model
 * @generated
 */
public interface XException extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' attribute.
	 * The default value is <code>"java.lang.Exception"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' attribute.
	 * @see #setJavaClass(Class)
	 * @see chrome.xmdl.XmdlPackage#getXException_JavaClass()
	 * @model default="java.lang.Exception" required="true"
	 * @generated
	 */
	Class<?> getJavaClass();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XException#getJavaClass <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' attribute.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(Class<?> value);

} // XException
