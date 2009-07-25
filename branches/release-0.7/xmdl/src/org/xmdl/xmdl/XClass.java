/**
 * <copyright>
 * </copyright>
 *
 * $Id: XClass.java,v 1.10 2006/03/30 12:42:50 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl;

import org.eclipse.emf.common.util.EList;
import java.util.List;

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
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPackage</em>' container reference.
	 * @see org.xmdl.xmdl.XmdlPackage#getXClass_XPackage()
	 * @see org.xmdl.xmdl.XPackage#getClasses
	 * @model opposite="classes" required="true" changeable="false"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link org.xmdl.xmdl.XClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see org.xmdl.xmdl.XmdlPackage#getXClass_SuperTypes()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XClass> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdl.XAttribute}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XAttribute#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.xmdl.xmdl.XmdlPackage#getXClass_Attributes()
	 * @see org.xmdl.xmdl.XAttribute#getXClass
	 * @model opposite="xClass" containment="true"
	 * @generated
	 */
	EList<XAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdl.XMethod}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XMethod#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.xmdl.xmdl.XmdlPackage#getXClass_Methods()
	 * @see org.xmdl.xmdl.XMethod#getXClass
	 * @model opposite="xClass" containment="true"
	 * @generated
	 */
	EList<XMethod> getMethods();

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
	 * @see org.xmdl.xmdl.XmdlPackage#getXClass_Comparable()
	 * @model
	 * @generated
	 */
	boolean isComparable();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XClass#isComparable <em>Comparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparable</em>' attribute.
	 * @see #isComparable()
	 * @generated
	 */
	void setComparable(boolean value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The default value is <code>"PERSISTED"</code>.
	 * The literals are from the enumeration {@link org.xmdl.xmdl.XClassBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see org.xmdl.xmdl.XClassBehavior
	 * @see #setBehavior(XClassBehavior)
	 * @see org.xmdl.xmdl.XmdlPackage#getXClass_Behavior()
	 * @model default="PERSISTED"
	 * @generated
	 */
	XClassBehavior getBehavior();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XClass#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see org.xmdl.xmdl.XClassBehavior
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(XClassBehavior value);

	List<XAttribute> getSimpleAttributes();

	boolean hasAttribute(String name);

	boolean hasMethod(String name);

} // XClass
