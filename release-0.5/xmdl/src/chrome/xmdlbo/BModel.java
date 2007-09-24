/**
 * <copyright>
 * </copyright>
 *
 * $Id: BModel.java,v 1.3 2006/01/19 12:21:21 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo;

import chrome.xmdl.XProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdlbo.BModel#getXProject <em>XProject</em>}</li>
 *   <li>{@link chrome.xmdlbo.BModel#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlbo.BModel#getXModel <em>XModel</em>}</li>
 *   <li>{@link chrome.xmdlbo.BModel#getBPackages <em>BPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdlbo.XmdlboPackage#getBModel()
 * @model
 * @generated
 */
public interface BModel extends EObject{
	/**
	 * Returns the value of the '<em><b>XProject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XProject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XProject</em>' reference.
	 * @see #setXProject(XProject)
	 * @see chrome.xmdlbo.XmdlboPackage#getBModel_XProject()
	 * @model
	 * @generated
	 */
	XProject getXProject();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BModel#getXProject <em>XProject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XProject</em>' reference.
	 * @see #getXProject()
	 * @generated
	 */
	void setXProject(XProject value);

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
	 * @see chrome.xmdlbo.XmdlboPackage#getBModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>XModel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XModel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XModel</em>' attribute.
	 * @see #setXModel(String)
	 * @see chrome.xmdlbo.XmdlboPackage#getBModel_XModel()
	 * @model required="true"
	 * @generated
	 */
	String getXModel();

	/**
	 * Sets the value of the '{@link chrome.xmdlbo.BModel#getXModel <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XModel</em>' attribute.
	 * @see #getXModel()
	 * @generated
	 */
	void setXModel(String value);

	/**
	 * Returns the value of the '<em><b>BPackages</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdlbo.BPackage}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlbo.BPackage#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPackages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPackages</em>' containment reference list.
	 * @see chrome.xmdlbo.XmdlboPackage#getBModel_BPackages()
	 * @see chrome.xmdlbo.BPackage#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<BPackage> getBPackages();

} // BModel
