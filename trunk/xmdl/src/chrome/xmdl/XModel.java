/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import chrome.xmdl.init.Initializer;

/**
 * <!-- begin-user-doc --> 
 * A representation of the model object '<em><b>XModel</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see chrome.xmdl.XmdlPackage#getXModel()
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

    EObject loadRoot(XProject project, Resource resource);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model required="true"
     * @generated
     */
    String name();

    Initializer getInitializer();

} // XModel
