/**
 * hd
 *
 * $Id$
 */
package org.xmdl.xmdldb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBase</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.xmdl.xmdldb.XmdldbPackage#getDBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DBase extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean accept(DVisitor visitor);

} // DBase
