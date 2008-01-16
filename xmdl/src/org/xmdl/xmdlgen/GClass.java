/**
 * <copyright>
 * </copyright>
 *
 * $Id: GClass.java,v 1.2 2006/01/17 15:50:54 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen;


import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getXClass <em>XClass</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getGPackage <em>GPackage</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getGAttributes <em>GAttributes</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getDeleteServiceName <em>Delete Service Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getEditServiceName <em>Edit Service Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getSaveServiceName <em>Save Service Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.GClass#getSearchServiceName <em>Search Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass()
 * @model
 * @generated
 */
public interface GClass extends EObject{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>XClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XClass</em>' reference.
	 * @see #setXClass(XClass)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_XClass()
	 * @model required="true"
	 * @generated
	 */
	XClass getXClass();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getXClass <em>XClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XClass</em>' reference.
	 * @see #getXClass()
	 * @generated
	 */
	void setXClass(XClass value);

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
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>GPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdlgen.GPackage#getGClasses <em>GClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPackage</em>' container reference.
	 * @see #setGPackage(GPackage)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_GPackage()
	 * @see org.xmdl.xmdlgen.GPackage#getGClasses
	 * @model opposite="gClasses" required="true" transient="false"
	 * @generated
	 */
	GPackage getGPackage();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getGPackage <em>GPackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPackage</em>' container reference.
	 * @see #getGPackage()
	 * @generated
	 */
	void setGPackage(GPackage value);

	/**
	 * Returns the value of the '<em><b>GAttributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdlgen.GAttribute}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdlgen.GAttribute#getGClass <em>GClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GAttributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GAttributes</em>' containment reference list.
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_GAttributes()
	 * @see org.xmdl.xmdlgen.GAttribute#getGClass
	 * @model opposite="gClass" containment="true" required="true"
	 * @generated
	 */
	EList<GAttribute> getGAttributes();

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
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_Persistent()
	 * @model default="true"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete Service Name</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Service Name</em>' attribute.
	 * @see #setDeleteServiceName(String)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_DeleteServiceName()
	 * @model default="true"
	 * @generated
	 */
	String getDeleteServiceName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getDeleteServiceName <em>Delete Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Service Name</em>' attribute.
	 * @see #getDeleteServiceName()
	 * @generated
	 */
	void setDeleteServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Service Name</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Service Name</em>' attribute.
	 * @see #setEditServiceName(String)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_EditServiceName()
	 * @model default="true"
	 * @generated
	 */
	String getEditServiceName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getEditServiceName <em>Edit Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Service Name</em>' attribute.
	 * @see #getEditServiceName()
	 * @generated
	 */
	void setEditServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Save Service Name</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Service Name</em>' attribute.
	 * @see #setSaveServiceName(String)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_SaveServiceName()
	 * @model default="true"
	 * @generated
	 */
	String getSaveServiceName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getSaveServiceName <em>Save Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Service Name</em>' attribute.
	 * @see #getSaveServiceName()
	 * @generated
	 */
	void setSaveServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Search Service Name</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Service Name</em>' attribute.
	 * @see #setSearchServiceName(String)
	 * @see org.xmdl.xmdlgen.XmdlgenPackage#getGClass_SearchServiceName()
	 * @model default="true"
	 * @generated
	 */
	String getSearchServiceName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlgen.GClass#getSearchServiceName <em>Search Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Service Name</em>' attribute.
	 * @see #getSearchServiceName()
	 * @generated
	 */
	void setSearchServiceName(String value);

} // GClass
