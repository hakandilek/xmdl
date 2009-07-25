/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdldb.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdldb.DBase;
import org.xmdl.xmdldb.DModel;
import org.xmdl.xmdldb.DPackage;
import org.xmdl.xmdldb.DVisitor;
import org.xmdl.xmdldb.XmdldbPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>DModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.xmdldb.impl.DModelImpl#getXProject <em>XProject</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.impl.DModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.impl.DModelImpl#getXModel <em>XModel</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.impl.DModelImpl#getDPackages <em>DPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DModelImpl extends EObjectImpl implements DModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached value of the '{@link #getXProject() <em>XProject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXProject()
	 * @generated
	 * @ordered
	 */
	protected XProject xProject;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected static final String XMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected String xModel = XMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDPackages() <em>DPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DPackage> dPackages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public DModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdldbPackage.Literals.DMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXModel() {
		return xModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXModel(String newXModel) {
		String oldXModel = xModel;
		xModel = newXModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DMODEL__XMODEL, oldXModel, xModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPackage> getDPackages() {
		if (dPackages == null) {
			dPackages = new EObjectContainmentWithInverseEList<DPackage>(
					DPackage.class, this, XmdldbPackage.DMODEL__DPACKAGES,
					XmdldbPackage.DPACKAGE__MODEL);
		}
		return dPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean accept(DVisitor visitor) {
		if (visitor.visitEnter(this)) {
			final List<DPackage> children1 = getDPackages();
			for (DBase child : children1) {
				if (!child.accept(visitor))
					break;
			}
		}
		final boolean result = visitor.visitLeave(this);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XmdldbPackage.DMODEL__DPACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDPackages())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XmdldbPackage.DMODEL__DPACKAGES:
			return ((InternalEList<?>) getDPackages()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmdldbPackage.DMODEL__XPROJECT:
			if (resolve)
				return getXProject();
			return basicGetXProject();
		case XmdldbPackage.DMODEL__NAME:
			return getName();
		case XmdldbPackage.DMODEL__XMODEL:
			return getXModel();
		case XmdldbPackage.DMODEL__DPACKAGES:
			return getDPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmdldbPackage.DMODEL__XPROJECT:
			setXProject((XProject) newValue);
			return;
		case XmdldbPackage.DMODEL__NAME:
			setName((String) newValue);
			return;
		case XmdldbPackage.DMODEL__XMODEL:
			setXModel((String) newValue);
			return;
		case XmdldbPackage.DMODEL__DPACKAGES:
			getDPackages().clear();
			getDPackages().addAll((Collection<? extends DPackage>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XmdldbPackage.DMODEL__XPROJECT:
			setXProject((XProject) null);
			return;
		case XmdldbPackage.DMODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdldbPackage.DMODEL__XMODEL:
			setXModel(XMODEL_EDEFAULT);
			return;
		case XmdldbPackage.DMODEL__DPACKAGES:
			getDPackages().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XmdldbPackage.DMODEL__XPROJECT:
			return xProject != null;
		case XmdldbPackage.DMODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdldbPackage.DMODEL__XMODEL:
			return XMODEL_EDEFAULT == null ? xModel != null : !XMODEL_EDEFAULT
					.equals(xModel);
		case XmdldbPackage.DMODEL__DPACKAGES:
			return dPackages != null && !dPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getXProject() {
		if (xProject != null && xProject.eIsProxy()) {
			InternalEObject oldXProject = (InternalEObject) xProject;
			xProject = (XProject) eResolveProxy(oldXProject);
			if (xProject != oldXProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DMODEL__XPROJECT, oldXProject,
							xProject));
			}
		}
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject basicGetXProject() {
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXProject(XProject newXProject) {
		XProject oldXProject = xProject;
		xProject = newXProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DMODEL__XPROJECT, oldXProject, xProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", xModel: ");
		result.append(xModel);
		result.append(')');
		return result.toString();
	}

} // DModelImpl
