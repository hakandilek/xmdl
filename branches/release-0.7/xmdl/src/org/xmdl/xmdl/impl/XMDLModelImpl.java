/**
 * hd
 *
 * $Id$
 */
package org.xmdl.xmdl.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xmdl.XMDLModel;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.XmdlPackage;
import org.xmdl.xmdl.init.Initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMDL Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XMDLModelImpl extends EObjectImpl implements XMDLModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/** the initializer */
	private Initializer initializer = new XMDLInitializer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlPackage.Literals.XMDL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
	public URI path(URI modelURI) {
		URI uri = modelURI.trimFileExtension().appendFileExtension("xmdl");
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
	public EObject createRoot(XProject project, URI uri) {
		//this method does not make sense
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
	public EObject loadRoot(XProject project, Resource resource) {
		resource.getContents();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
	public String name() {
		return "xmdl";
	}

	@Override
	public Initializer getInitializer() {
		return initializer;
	}

	class XMDLInitializer extends Initializer {
		//nothing to initialize
	}
} //XMDLModelImpl
