/**
 * <copyright>
 * </copyright>
 *
 * $Id: XClass.java,v 1.10 2006/03/30 12:42:50 tr001\tr1d2643 Exp $
 */
package chrome.xmdl;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * @model
 */
public interface XClass extends XBase, XType {
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
	 * Returns the value of the '<em><b>XPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPackage</em>' container reference.
	 * @see chrome.xmdl.XmdlPackage#getXClass_XPackage()
	 * @see chrome.xmdl.XPackage#getClasses
	 * @model opposite="classes" required="true" changeable="false"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link chrome.xmdl.XClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see chrome.xmdl.XmdlPackage#getXClass_SuperTypes()
	 * @model type="chrome.xmdl.XClass" resolveProxies="false"
	 * @generated
	 */
	EList getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdl.XAttribute}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XAttribute#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see chrome.xmdl.XmdlPackage#getXClass_Attributes()
	 * @see chrome.xmdl.XAttribute#getXClass
	 * @model type="chrome.xmdl.XAttribute" opposite="xClass" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link chrome.xmdl.XMethod}.
	 * It is bidirectional and its opposite is '{@link chrome.xmdl.XMethod#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see chrome.xmdl.XmdlPackage#getXClass_Methods()
	 * @see chrome.xmdl.XMethod#getXClass
	 * @model type="chrome.xmdl.XMethod" opposite="xClass" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getMethods();

	/**
	 * Returns the value of the '<em><b>Comparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparable</em>' attribute.
	 * @see #setComparable(boolean)
	 * @see chrome.xmdl.XmdlPackage#getXClass_Comparable()
	 * @model
	 * @generated
	 */
	boolean isComparable();

	/**
	 * Sets the value of the '{@link chrome.xmdl.XClass#isComparable <em>Comparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparable</em>' attribute.
	 * @see #isComparable()
	 * @generated
	 */
	void setComparable(boolean value);

	List<XAttribute> getSimpleAttributes();

} // XClass
