/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xmdl.init.Initializer;

/**
 * <!-- begin-user-doc --> 
 * A representation of the model object '<em><b>XModel</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.xmdl.xmdl.XmdlPackage#getXModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface XModel extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * @model
	 * @generated
	 */
	URI path(URI modelURI);

	/**
	 * @model
	 * @generated
	 */
	EObject createRoot(XProject project, URI uri);

	Object loadRoot(XProject project, Resource resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String name();

	Initializer getInitializer();

} // XModel
