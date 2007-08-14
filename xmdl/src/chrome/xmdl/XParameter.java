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
 * A representation of the model object '<em><b>XParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdl.XParameter#getMethod <em>Method</em>}</li>
 *   <li>{@link chrome.xmdl.XParameter#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.XParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdl.XmdlPackage#getXParameter()
 * @model
 * @generated
 */
public interface XParameter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(XMethod)
	 * @see chrome.xmdl.XmdlPackage#getXParameter_Method()
	 * @see chrome.xmdl.XMethod#getParameters
	 * @model opposite="parameters" required="true"
	 * @generated
	 */
	XMethod getMethod();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XParameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(XMethod value);

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
	 * @see chrome.xmdl.XmdlPackage#getXParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(XType)
	 * @see chrome.xmdl.XmdlPackage#getXParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	XType getType();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XType value);

} // XParameter
