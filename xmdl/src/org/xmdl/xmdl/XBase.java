/**
 * <copyright>
 * </copyright>
 *
 * $Id: XBase.java,v 1.4 2006/01/18 11:07:30 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBase</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.xmdl.xmdl.XmdlPackage#getXBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface XBase extends EObject {
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
	boolean accept(XVisitor visitor);

} // XBase
