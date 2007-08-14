/**
 * <copyright>
 * </copyright>
 *
 * $Id: GModelImpl.java,v 1.2 2006/01/17 15:50:56 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen.impl;

import chrome.xmdl.XProject;

import chrome.xmdlgen.GModel;
import chrome.xmdlgen.GPackage;
import chrome.xmdlgen.XmdlgenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdlgen.impl.GModelImpl#getXProject <em>XProject</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GModelImpl#getXModel <em>XModel</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GModelImpl#getGPackages <em>GPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GModelImpl extends EObjectImpl implements GModel {
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
	protected XProject xProject = null;

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
	 * The cached value of the '{@link #getGPackages() <em>GPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPackages()
	 * @generated
	 * @ordered
	 */
	protected EList gPackages = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlgenPackage.eINSTANCE.getGModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getXProject() {
		if (xProject != null && xProject.eIsProxy()) {
			XProject oldXProject = xProject;
			xProject = (XProject)eResolveProxy((InternalEObject)xProject);
			if (xProject != oldXProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlgenPackage.GMODEL__XPROJECT, oldXProject, xProject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GMODEL__XPROJECT, oldXProject, xProject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GMODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GMODEL__XMODEL, oldXModel, xModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGPackages() {
		if (gPackages == null) {
			gPackages = new EObjectContainmentWithInverseEList(GPackage.class, this, XmdlgenPackage.GMODEL__GPACKAGES, XmdlgenPackage.GPACKAGE__GMODEL);
		}
		return gPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case XmdlgenPackage.GMODEL__GPACKAGES:
					return ((InternalEList)getGPackages()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case XmdlgenPackage.GMODEL__GPACKAGES:
					return ((InternalEList)getGPackages()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				if (resolve) return getXProject();
				return basicGetXProject();
			case XmdlgenPackage.GMODEL__NAME:
				return getName();
			case XmdlgenPackage.GMODEL__XMODEL:
				return getXModel();
			case XmdlgenPackage.GMODEL__GPACKAGES:
				return getGPackages();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				setXProject((XProject)newValue);
				return;
			case XmdlgenPackage.GMODEL__NAME:
				setName((String)newValue);
				return;
			case XmdlgenPackage.GMODEL__XMODEL:
				setXModel((String)newValue);
				return;
			case XmdlgenPackage.GMODEL__GPACKAGES:
				getGPackages().clear();
				getGPackages().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				setXProject((XProject)null);
				return;
			case XmdlgenPackage.GMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GMODEL__XMODEL:
				setXModel(XMODEL_EDEFAULT);
				return;
			case XmdlgenPackage.GMODEL__GPACKAGES:
				getGPackages().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				return xProject != null;
			case XmdlgenPackage.GMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlgenPackage.GMODEL__XMODEL:
				return XMODEL_EDEFAULT == null ? xModel != null : !XMODEL_EDEFAULT.equals(xModel);
			case XmdlgenPackage.GMODEL__GPACKAGES:
				return gPackages != null && !gPackages.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", xModel: ");
		result.append(xModel);
		result.append(')');
		return result.toString();
	}

} //GModelImpl
