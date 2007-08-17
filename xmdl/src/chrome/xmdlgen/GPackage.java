/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPackage.java,v 1.2 2006/01/17 15:50:54 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen;

import chrome.xmdl.XPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chrome.xmdlgen.GPackage#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.GPackage#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdlgen.GPackage#getGModel <em>GModel</em>}</li>
 *   <li>{@link chrome.xmdlgen.GPackage#getGClasses <em>GClasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see chrome.xmdlgen.XmdlgenPackage#getGPackage()
 * @model
 * @generated
 */
public interface GPackage extends EObject{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

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
	 * @see chrome.xmdlgen.XmdlgenPackage#getGPackage_XPackage()
	 * @model required="true"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Sets the value of the '{@link chrome.xmdlgen.GPackage#getXPackage <em>XPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPackage</em>' reference.
	 * @see #getXPackage()
	 * @generated
	 */
	void setXPackage(XPackage value);

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
	 * @see chrome.xmdlgen.XmdlgenPackage#getGPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdlgen.GPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>GModel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlgen.GModel#getGPackages <em>GPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GModel</em>' container reference.
	 * @see #setGModel(GModel)
	 * @see chrome.xmdlgen.XmdlgenPackage#getGPackage_GModel()
	 * @see chrome.xmdlgen.GModel#getGPackages
	 * @model opposite="gPackages" required="true" transient="false"
	 * @generated
	 */
	GModel getGModel();

	/**
	 * Sets the value of the '{@link chrome.xmdlgen.GPackage#getGModel <em>GModel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GModel</em>' container reference.
	 * @see #getGModel()
	 * @generated
	 */
	void setGModel(GModel value);

	/**
	 * Returns the value of the '<em><b>GClasses</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdlgen.GClass}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdlgen.GClass#getGPackage <em>GPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GClasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GClasses</em>' containment reference list.
	 * @see chrome.xmdlgen.XmdlgenPackage#getGPackage_GClasses()
	 * @see chrome.xmdlgen.GClass#getGPackage
	 * @model opposite="gPackage" containment="true" required="true"
	 * @generated
	 */
	EList<GClass> getGClasses();

} // GPackage
