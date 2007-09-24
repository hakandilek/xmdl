/**
 * <copyright>
 * </copyright>
 *
 * $Id: BPackage.java,v 1.2 2006/01/19 12:21:21 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo;

import chrome.xmdl.XPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdlbo.BPackage#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlbo.BPackage#getModel <em>Model</em>}</li>
 *   <li>{@link chrome.xmdlbo.BPackage#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdlbo.BPackage#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdlbo.XmdlboPackage#getBPackage()
 * @model
 * @generated
 */
public interface BPackage extends EObject{
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
	 * @see chrome.xmdlbo.XmdlboPackage#getBPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlbo.BModel#getBPackages <em>BPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(BModel)
	 * @see chrome.xmdlbo.XmdlboPackage#getBPackage_Model()
	 * @see chrome.xmdlbo.BModel#getBPackages
	 * @model opposite="bPackages" required="true" transient="false"
	 * @generated
	 */
	BModel getModel();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BPackage#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(BModel value);

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
	 * @see chrome.xmdlbo.XmdlboPackage#getBPackage_XPackage()
	 * @model required="true"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BPackage#getXPackage <em>XPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPackage</em>' reference.
	 * @see #getXPackage()
	 * @generated
	 */
	void setXPackage(XPackage value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdlbo.BService}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlbo.BService#getBPackage <em>BPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see chrome.xmdlbo.XmdlboPackage#getBPackage_Services()
	 * @see chrome.xmdlbo.BService#getBPackage
	 * @model opposite="bPackage" containment="true"
	 * @generated
	 */
	EList<BService> getServices();

} // BPackage
