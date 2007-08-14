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
 * A representation of the model object '<em><b>XType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdl.XType#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.XType#getClassName <em>Class Name</em>}</li>
 *   <li>{@link chrome.xmdl.XType#getXPackage <em>XPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdl.XmdlPackage#getXType()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface XType extends EObject, Comparable {
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
	 * @see chrome.xmdl.XmdlPackage#getXType_Name()
	 * @model id="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #isSetClassName()
	 * @see #unsetClassName()
	 * @see #setClassName(String)
	 * @see chrome.xmdl.XmdlPackage#getXType_ClassName()
	 * @model unsettable="true" volatile="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XType#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #isSetClassName()
	 * @see #unsetClassName()
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Unsets the value of the '{@link chrome.xmdl.XType#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassName()
	 * @see #getClassName()
	 * @see #setClassName(String)
	 * @generated
	 */
	void unsetClassName();

	/**
	 * Returns whether the value of the '{@link chrome.xmdl.XType#getClassName <em>Class Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Name</em>' attribute is set.
	 * @see #unsetClassName()
	 * @see #getClassName()
	 * @see #setClassName(String)
	 * @generated
	 */
	boolean isSetClassName();

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
	 * @see chrome.xmdl.XmdlPackage#getXType_XPackage()
	 * @model required="true" derived="true"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isComparable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isBasic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" oRequired="true"
	 * @generated
	 */
	int compareTo(Object o);

} // XType
