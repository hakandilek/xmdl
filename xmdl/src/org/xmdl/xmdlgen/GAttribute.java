/**
 * <copyright>
 * </copyright>
 *
 * $Id: GAttribute.java,v 1.3 2006/01/18 15:35:19 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen;


import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdlgen.GAttribute#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GAttribute#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GAttribute#getGClass <em>GClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGAttribute()
 * @model
 * @generated
 */
public interface GAttribute extends EObject{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>XAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAttribute</em>' reference.
	 * @see #setXAttribute(XAttribute)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGAttribute_XAttribute()
	 * @model required="true"
	 * @generated
	 */
	XAttribute getXAttribute();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GAttribute#getXAttribute <em>XAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAttribute</em>' reference.
	 * @see #getXAttribute()
	 * @generated
	 */
	void setXAttribute(XAttribute value);

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
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGAttribute_Persistent()
	 * @model default="true"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GAttribute#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>GClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdlgen.GClass#getGAttributes <em>GAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GClass</em>' container reference.
	 * @see #setGClass(GClass)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGAttribute_GClass()
	 * @see org.xmdl.xmdlgen.GClass#getGAttributes
	 * @model opposite="gAttributes" required="true" transient="false"
	 * @generated
	 */
	GClass getGClass();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GAttribute#getGClass <em>GClass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GClass</em>' container reference.
	 * @see #getGClass()
	 * @generated
	 */
	void setGClass(GClass value);

} // GAttribute
