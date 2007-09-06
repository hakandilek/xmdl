/**
 * <copyright>
 * </copyright>
 *
 * $Id: XPackage.java,v 1.8 2006/03/20 10:02:48 tr001\tr1c3822 Exp $
 */
package chrome.xmdl;

import org.eclipse.emf.common.util.EList;

/**
 * @model
 */
public interface XPackage extends XBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * @model
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model transient="true"
	 */
	XProject getProject();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XPackage#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(XProject value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdl.XClass}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XClass#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see chrome.xmdl.XmdlPackage#getXPackage_Classes()
	 * @see chrome.xmdl.XClass#getXPackage
	 * @model opposite="xPackage" containment="true"
	 * @generated
	 */
	EList<XClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdl.XEnumeration}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XEnumeration#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see chrome.xmdl.XmdlPackage#getXPackage_Enumerations()
	 * @see chrome.xmdl.XEnumeration#getXPackage
	 * @model opposite="xPackage" containment="true"
	 * @generated
	 */
	EList<XEnumeration> getEnumerations();

    boolean hasClass(String name);

    boolean hasEnumeration(String name);

} // XPackage
