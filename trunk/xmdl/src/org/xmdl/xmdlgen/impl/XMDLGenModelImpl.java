/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMDLGenModelImpl.java,v 1.2 2006/01/18 11:07:32 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen.impl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.init.Initializer;
import org.xmdl.xmdldb.DModel;
import org.xmdl.xmdlgen.GModel;
import org.xmdl.xmdlgen.XMDLGenModel;
import org.xmdl.xmdlgen.XmdlgenFactory;
import org.xmdl.xmdlgen.XmdlgenPackage;
import org.xmdl.xmdlgen.init.XMDLGenInitializer;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMDL Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XMDLGenModelImpl extends EObjectImpl implements XMDLGenModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";
	private XMDLGenInitializer initializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMDLGenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlgenPackage.Literals.XMDL_GEN_MODEL;
	}

	/**
	 * @model
	 */
	public URI path(URI modelURI) {
		URI uri = modelURI.trimFileExtension().appendFileExtension("xmdlgen");
		return uri;
	}

	/**
	 * @model
	 */
	public EObject createRoot(XProject project, URI uri) {
		GModel model = XmdlgenFactory.eINSTANCE.createGModel();
		model.setXModel(uri.toString());
		return model;
	}

	/**
	 * @model
	 */
	public EObject loadRoot(XProject project, Resource resource) {
		List<EObject> contents = resource.getContents();
		for (Iterator<EObject> it = contents.iterator(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (element instanceof DModel) {
				GModel model = (GModel) element;
				return model;
			}
		}
		return null;
	}

	/**
	 * @model
	 */
	public String name() {
		return "xmdlgen";
	}

	/**
	 * @model
	 */
	public Initializer getInitializer() {
		if (initializer == null) {
			initializer = new XMDLGenInitializer();
		}
		return initializer;
	}
} //XMDLGenModelImpl
