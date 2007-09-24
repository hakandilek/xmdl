/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdlbo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdlbo.BMethod#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlbo.BMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link chrome.xmdlbo.BMethod#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdlbo.XmdlboPackage#getBMethod()
 * @model
 * @generated
 */
public interface BMethod extends EObject{
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
	 * @see chrome.xmdlbo.XmdlboPackage#getBMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdlbo.BParameter}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlbo.BParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see chrome.xmdlbo.XmdlboPackage#getBMethod_Parameters()
	 * @see chrome.xmdlbo.BParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<BParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlbo.BService#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(BService)
	 * @see chrome.xmdlbo.XmdlboPackage#getBMethod_Service()
	 * @see chrome.xmdlbo.BService#getMethods
	 * @model opposite="methods" transient="false"
	 * @generated
	 */
	BService getService();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BMethod#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(BService value);


} // BMethod
