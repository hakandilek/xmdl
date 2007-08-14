/**
 * <copyright>
 * </copyright>
 *
 * $Id: BPackageImpl.java,v 1.2 2006/01/19 12:21:22 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo.impl;

import chrome.xmdl.XPackage;

import chrome.xmdlbo.BModel;
import chrome.xmdlbo.BPackage;
import chrome.xmdlbo.BService;
import chrome.xmdlbo.XmdlboPackage;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdlbo.impl.BPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlbo.impl.BPackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link chrome.xmdlbo.impl.BPackageImpl#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdlbo.impl.BPackageImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPackageImpl extends EObjectImpl implements BPackage {
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
	 * The cached value of the '{@link #getXPackage() <em>XPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPackage()
	 * @generated
	 * @ordered
	 */
	protected XPackage xPackage = null;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList services = null;


	public BPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlboPackage.eINSTANCE.getBPackage();
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BModel getModel() {
		if (eContainerFeatureID != XmdlboPackage.BPACKAGE__MODEL) return null;
		return (BModel)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(BModel newModel) {
		if (newModel != eContainer || (eContainerFeatureID != XmdlboPackage.BPACKAGE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, XmdlboPackage.BMODEL__BPACKAGES, BModel.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newModel, XmdlboPackage.BPACKAGE__MODEL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BPACKAGE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage getXPackage() {
		if (xPackage != null && xPackage.eIsProxy()) {
			XPackage oldXPackage = xPackage;
			xPackage = (XPackage)eResolveProxy((InternalEObject)xPackage);
			if (xPackage != oldXPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlboPackage.BPACKAGE__XPACKAGE, oldXPackage, xPackage));
			}
		}
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage basicGetXPackage() {
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPackage(XPackage newXPackage) {
		XPackage oldXPackage = xPackage;
		xPackage = newXPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BPACKAGE__XPACKAGE, oldXPackage, xPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList(BService.class, this, XmdlboPackage.BPACKAGE__SERVICES, XmdlboPackage.BSERVICE__BPACKAGE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case XmdlboPackage.BPACKAGE__MODEL:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, XmdlboPackage.BPACKAGE__MODEL, msgs);
				case XmdlboPackage.BPACKAGE__SERVICES:
					return ((InternalEList)getServices()).basicAdd(otherEnd, msgs);
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
				case XmdlboPackage.BPACKAGE__MODEL:
					return eBasicSetContainer(null, XmdlboPackage.BPACKAGE__MODEL, msgs);
				case XmdlboPackage.BPACKAGE__SERVICES:
					return ((InternalEList)getServices()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case XmdlboPackage.BPACKAGE__MODEL:
					return eContainer.eInverseRemove(this, XmdlboPackage.BMODEL__BPACKAGES, BModel.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case XmdlboPackage.BPACKAGE__NAME:
				return getName();
			case XmdlboPackage.BPACKAGE__MODEL:
				return getModel();
			case XmdlboPackage.BPACKAGE__XPACKAGE:
				if (resolve) return getXPackage();
				return basicGetXPackage();
			case XmdlboPackage.BPACKAGE__SERVICES:
				return getServices();
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
			case XmdlboPackage.BPACKAGE__NAME:
				setName((String)newValue);
				return;
			case XmdlboPackage.BPACKAGE__MODEL:
				setModel((BModel)newValue);
				return;
			case XmdlboPackage.BPACKAGE__XPACKAGE:
				setXPackage((XPackage)newValue);
				return;
			case XmdlboPackage.BPACKAGE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection)newValue);
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
			case XmdlboPackage.BPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlboPackage.BPACKAGE__MODEL:
				setModel((BModel)null);
				return;
			case XmdlboPackage.BPACKAGE__XPACKAGE:
				setXPackage((XPackage)null);
				return;
			case XmdlboPackage.BPACKAGE__SERVICES:
				getServices().clear();
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
			case XmdlboPackage.BPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlboPackage.BPACKAGE__MODEL:
				return getModel() != null;
			case XmdlboPackage.BPACKAGE__XPACKAGE:
				return xPackage != null;
			case XmdlboPackage.BPACKAGE__SERVICES:
				return services != null && !services.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //BPackageImpl
