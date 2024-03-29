/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdl.XMethod#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XMethod#getXClass <em>XClass</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XMethod#getType <em>Type</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xmdl.xmdl.XMethod#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdl.XmdlPackage#getXMethod()
 * @model
 * @generated
 */
public interface XMethod extends XBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.xmdl.xmdl.XmdlPackage#getXMethod_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XMethod#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

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
	 * @see org.xmdl.xmdl.XmdlPackage#getXMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>XClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XClass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XClass</em>' container reference.
	 * @see #setXClass(XClass)
	 * @see org.xmdl.xmdl.XmdlPackage#getXMethod_XClass()
	 * @see org.xmdl.xmdl.XClass#getMethods
	 * @model opposite="methods" required="true"
	 * @generated
	 */
	XClass getXClass();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XMethod#getXClass <em>XClass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XClass</em>' container reference.
	 * @see #getXClass()
	 * @generated
	 */
	void setXClass(XClass value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(XType)
	 * @see org.xmdl.xmdl.XmdlPackage#getXMethod_Type()
	 * @model required="true"
	 * @generated
	 */
	XType getType();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XMethod#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdl.XParameter}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.xmdl.xmdl.XmdlPackage#getXMethod_Parameters()
	 * @see org.xmdl.xmdl.XParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<XParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdl.XException}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see org.xmdl.xmdl.XmdlPackage#getXMethod_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<XException> getExceptions();

	boolean hasParameter(String name);

} // XMethod
