/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdl.XParameter#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdl.XmdlPackage#getXParameter()
 * @model
 * @generated
 */
public interface XParameter extends XBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(XMethod)
	 * @see org.xmdl.xmdl.XmdlPackage#getXParameter_Method()
	 * @see org.xmdl.xmdl.XMethod#getParameters
	 * @model opposite="parameters" required="true"
	 * @generated
	 */
	XMethod getMethod();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XParameter#getMethod <em>Method</em>}' container reference.
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
	 * @see org.xmdl.xmdl.XmdlPackage#getXParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XParameter#getName <em>Name</em>}' attribute.
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
	 * @see org.xmdl.xmdl.XmdlPackage#getXParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	XType getType();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XType value);

} // XParameter
