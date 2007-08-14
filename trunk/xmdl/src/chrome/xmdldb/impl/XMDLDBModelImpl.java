/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import java.util.Iterator;
import java.util.List;

import chrome.xmdl.XProject;
import chrome.xmdl.init.Initializer;

import chrome.xmdldb.DModel;
import chrome.xmdldb.XMDLDBModel;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;
import chrome.xmdldb.init.XMDLDBInitializer;

import org.eclipse.core.runtime.IPath;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>XMDLDB Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XMDLDBModelImpl extends EObjectImpl implements XMDLDBModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	private Initializer initializer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected XMDLDBModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdldbPackage.eINSTANCE.getXMDLDBModel();
	}

	//	/**
	//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	//	 */
	//	public IPath path(IPath modelPath) {
	//		IPath path = modelPath.removeFileExtension().addFileExtension("xmdldb");
	//		return path;
	//	}

	/**
	 * @model
	 */
	public EObject createRoot(XProject project, URI uri) {
		DModel dModel = XmdldbFactory.eINSTANCE.createDModel();
		dModel.setXModel(uri.toString());
		return dModel;
	}

	/**
	 * @model
	 */
	public URI path(URI modelURI) {
		URI uri = modelURI.trimFileExtension().appendFileExtension("xmdldb");
		return uri;
	}

	/**
	 * @model
	 */
	public EObject loadRoot(XProject project, Resource resource) {
		List contents = resource.getContents();
		for (Iterator it = contents.iterator(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (element instanceof DModel) {
				DModel model = (DModel) element;
				return model;
			}
		}
		return null;
	}

	/**
	 * @model
	 */
	public Initializer getInitializer() {
		if (initializer == null) {
			initializer = new XMDLDBInitializer();
		}
		return initializer;
	}

	/**
	 * @model
	 */
	public String name() {
		return "xmdldb";
	}

} // XMDLDBModelImpl
