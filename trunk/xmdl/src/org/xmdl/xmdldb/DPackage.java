/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdldb;

import org.eclipse.emf.common.util.EList;
import org.xmdl.xmdl.XPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdldb.DPackage#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.DPackage#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.DPackage#getModel <em>Model</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.DPackage#getDTables <em>DTables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdldb.XmdldbPackage#getDPackage()
 * @model
 * @generated
 */
public interface DPackage extends DBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

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
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdldb.DPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>DTables</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdldb.DTable}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdldb.DTable#getDPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTables</em>' containment reference list.
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDPackage_DTables()
	 * @see org.xmdl.xmdldb.DTable#getDPackage
	 * @model opposite="dPackage" containment="true"
	 * @generated
	 */
	EList<DTable> getDTables();

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
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDPackage_XPackage()
	 * @model required="true"
	 * @generated
	 */
	XPackage getXPackage();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdldb.DPackage#getXPackage <em>XPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPackage</em>' reference.
	 * @see #getXPackage()
	 * @generated
	 */
	void setXPackage(XPackage value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdldb.DModel#getDPackages <em>DPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(DModel)
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDPackage_Model()
	 * @see org.xmdl.xmdldb.DModel#getDPackages
	 * @model opposite="dPackages" required="true" transient="false"
	 * @generated
	 */
	DModel getModel();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdldb.DPackage#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(DModel value);

} // DPackage
