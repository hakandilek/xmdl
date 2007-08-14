/**
 * <copyright>
 * </copyright>
 *
 * $Id: GModel.java,v 1.2 2006/01/17 15:50:54 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen;

import chrome.xmdl.XProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdlgen.GModel#getXProject <em>XProject</em>}</li>
 *   <li>{@link chrome.xmdlgen.GModel#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.GModel#getXModel <em>XModel</em>}</li>
 *   <li>{@link chrome.xmdlgen.GModel#getGPackages <em>GPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdlgen.XmdlgenPackage#getGModel()
 * @model
 * @generated
 */
public interface GModel extends EObject{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

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
	 * @see chrome.xmdlgen.XmdlgenPackage#getGModel_XProject()
	 * @model required="true"
	 * @generated
	 */
	XProject getXProject();

	/**
	 * Sets the value of the '{@link chrome.xmdlgen.GModel#getXProject <em>XProject</em>}' reference.
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
	 * @see chrome.xmdlgen.XmdlgenPackage#getGModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdlgen.GModel#getName <em>Name</em>}' attribute.
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
	 * @see chrome.xmdlgen.XmdlgenPackage#getGModel_XModel()
	 * @model required="true"
	 * @generated
	 */
	String getXModel();

	/**
	 * Sets the value of the '{@link chrome.xmdlgen.GModel#getXModel <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XModel</em>' attribute.
	 * @see #getXModel()
	 * @generated
	 */
	void setXModel(String value);

	/**
	 * Returns the value of the '<em><b>GPackages</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdlgen.GPackage}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlgen.GPackage#getGModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPackages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPackages</em>' containment reference list.
	 * @see chrome.xmdlgen.XmdlgenPackage#getGModel_GPackages()
	 * @see chrome.xmdlgen.GPackage#getGModel
	 * @model type="chrome.xmdlgen.GPackage" opposite="gModel" containment="true"
	 * @generated
	 */
	EList getGPackages();

} // GModel
