/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPackageImpl.java,v 1.2 2006/01/17 15:50:55 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen.impl;

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
import org.xmdl.xmdlgen.GClass;
import org.xmdl.xmdlgen.GModel;
import org.xmdl.xmdlgen.GPackage;
import org.xmdl.xmdlgen.XmdlgenPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.xmdlgen.impl.GPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GPackageImpl#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GPackageImpl#getGModel <em>GModel</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GPackageImpl#getGClasses <em>GClasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GPackageImpl extends EObjectImpl implements GPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

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
	 * The cached value of the '{@link #getGClasses() <em>GClasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<GClass> gClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlgenPackage.Literals.GPACKAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlgenPackage.GPACKAGE__XPACKAGE, oldXPackage, xPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GPACKAGE__XPACKAGE, oldXPackage, xPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GModel getGModel() {
		if (eContainerFeatureID != XmdlgenPackage.GPACKAGE__GMODEL) return null;
		return (GModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGModel(GModel newGModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGModel, XmdlgenPackage.GPACKAGE__GMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGModel(GModel newGModel) {
		if (newGModel != eInternalContainer() || (eContainerFeatureID != XmdlgenPackage.GPACKAGE__GMODEL && newGModel != null)) {
			if (EcoreUtil.isAncestor(this, newGModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGModel != null)
				msgs = ((InternalEObject)newGModel).eInverseAdd(this, XmdlgenPackage.GMODEL__GPACKAGES, GModel.class, msgs);
			msgs = basicSetGModel(newGModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GPACKAGE__GMODEL, newGModel, newGModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GClass> getGClasses() {
		if (gClasses == null) {
			gClasses = new EObjectContainmentWithInverseEList<GClass>(GClass.class, this, XmdlgenPackage.GPACKAGE__GCLASSES, XmdlgenPackage.GCLASS__GPACKAGE);
		}
		return gClasses;
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
			case XmdlgenPackage.GPACKAGE__GMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGModel((GModel)otherEnd, msgs);
			case XmdlgenPackage.GPACKAGE__GCLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGClasses()).basicAdd(otherEnd, msgs);
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
			case XmdlgenPackage.GPACKAGE__GMODEL:
				return basicSetGModel(null, msgs);
			case XmdlgenPackage.GPACKAGE__GCLASSES:
				return ((InternalEList<?>)getGClasses()).basicRemove(otherEnd, msgs);
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
			case XmdlgenPackage.GPACKAGE__GMODEL:
				return eInternalContainer().eInverseRemove(this, XmdlgenPackage.GMODEL__GPACKAGES, GModel.class, msgs);
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
			case XmdlgenPackage.GPACKAGE__NAME:
				return getName();
			case XmdlgenPackage.GPACKAGE__XPACKAGE:
				if (resolve) return getXPackage();
				return basicGetXPackage();
			case XmdlgenPackage.GPACKAGE__GMODEL:
				return getGModel();
			case XmdlgenPackage.GPACKAGE__GCLASSES:
				return getGClasses();
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
			case XmdlgenPackage.GPACKAGE__NAME:
				setName((String)newValue);
				return;
			case XmdlgenPackage.GPACKAGE__XPACKAGE:
				setXPackage((XPackage)newValue);
				return;
			case XmdlgenPackage.GPACKAGE__GMODEL:
				setGModel((GModel)newValue);
				return;
			case XmdlgenPackage.GPACKAGE__GCLASSES:
				getGClasses().clear();
				getGClasses().addAll((Collection<? extends GClass>)newValue);
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
			case XmdlgenPackage.GPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GPACKAGE__XPACKAGE:
				setXPackage((XPackage)null);
				return;
			case XmdlgenPackage.GPACKAGE__GMODEL:
				setGModel((GModel)null);
				return;
			case XmdlgenPackage.GPACKAGE__GCLASSES:
				getGClasses().clear();
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
			case XmdlgenPackage.GPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlgenPackage.GPACKAGE__XPACKAGE:
				return xPackage != null;
			case XmdlgenPackage.GPACKAGE__GMODEL:
				return getGModel() != null;
			case XmdlgenPackage.GPACKAGE__GCLASSES:
				return gClasses != null && !gClasses.isEmpty();
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

} //GPackageImpl
