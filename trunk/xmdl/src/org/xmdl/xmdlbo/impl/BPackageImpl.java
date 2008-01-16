/**
 * <copyright>
 * </copyright>
 *
 * $Id: BPackageImpl.java,v 1.2 2006/01/19 12:21:22 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlbo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdlbo.BModel;
import org.xmdl.xmdlbo.BPackage;
import org.xmdl.xmdlbo.BService;
import org.xmdl.xmdlbo.XmdlboPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.xmdlbo.impl.BPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.impl.BPackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.impl.BPackageImpl#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.impl.BPackageImpl#getServices <em>Services</em>}</li>
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
	protected XPackage xPackage;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<BService> services;


	public BPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlboPackage.Literals.BPACKAGE;
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
		return (BModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(BModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, XmdlboPackage.BPACKAGE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(BModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID != XmdlboPackage.BPACKAGE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, XmdlboPackage.BMODEL__BPACKAGES, BModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
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
			InternalEObject oldXPackage = (InternalEObject)xPackage;
			xPackage = (XPackage)eResolveProxy(oldXPackage);
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
	public EList<BService> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<BService>(BService.class, this, XmdlboPackage.BPACKAGE__SERVICES, XmdlboPackage.BSERVICE__BPACKAGE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlboPackage.BPACKAGE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((BModel)otherEnd, msgs);
			case XmdlboPackage.BPACKAGE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlboPackage.BPACKAGE__MODEL:
				return basicSetModel(null, msgs);
			case XmdlboPackage.BPACKAGE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case XmdlboPackage.BPACKAGE__MODEL:
				return eInternalContainer().eInverseRemove(this, XmdlboPackage.BMODEL__BPACKAGES, BModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
				getServices().addAll((Collection<? extends BService>)newValue);
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
			case XmdlboPackage.BPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlboPackage.BPACKAGE__MODEL:
				return getModel() != null;
			case XmdlboPackage.BPACKAGE__XPACKAGE:
				return xPackage != null;
			case XmdlboPackage.BPACKAGE__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BPackageImpl
