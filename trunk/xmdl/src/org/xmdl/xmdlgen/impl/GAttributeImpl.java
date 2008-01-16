/**
 * <copyright>
 * </copyright>
 *
 * $Id: GAttributeImpl.java,v 1.3 2006/01/18 15:35:18 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdlgen.GAttribute;
import org.xmdl.xmdlgen.GClass;
import org.xmdl.xmdlgen.XmdlgenPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.xmdlgen.impl.GAttributeImpl#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GAttributeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GAttributeImpl#getGClass <em>GClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GAttributeImpl extends EObjectImpl implements GAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached value of the '{@link #getXAttribute() <em>XAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAttribute()
	 * @generated
	 * @ordered
	 */
	protected XAttribute xAttribute;

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
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public GAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlgenPackage.Literals.GATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute getXAttribute() {
		if (xAttribute != null && xAttribute.eIsProxy()) {
			InternalEObject oldXAttribute = (InternalEObject)xAttribute;
			xAttribute = (XAttribute)eResolveProxy(oldXAttribute);
			if (xAttribute != oldXAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlgenPackage.GATTRIBUTE__XATTRIBUTE, oldXAttribute, xAttribute));
			}
		}
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute basicGetXAttribute() {
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAttribute(XAttribute newXAttribute) {
		XAttribute oldXAttribute = xAttribute;
		xAttribute = newXAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GATTRIBUTE__XATTRIBUTE, oldXAttribute, xAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GATTRIBUTE__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GClass getGClass() {
		if (eContainerFeatureID != XmdlgenPackage.GATTRIBUTE__GCLASS) return null;
		return (GClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGClass(GClass newGClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGClass, XmdlgenPackage.GATTRIBUTE__GCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGClass(GClass newGClass) {
		if (newGClass != eInternalContainer() || (eContainerFeatureID != XmdlgenPackage.GATTRIBUTE__GCLASS && newGClass != null)) {
			if (EcoreUtil.isAncestor(this, newGClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGClass != null)
				msgs = ((InternalEObject)newGClass).eInverseAdd(this, XmdlgenPackage.GCLASS__GATTRIBUTES, GClass.class, msgs);
			msgs = basicSetGClass(newGClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GATTRIBUTE__GCLASS, newGClass, newGClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGClass((GClass)otherEnd, msgs);
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
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				return basicSetGClass(null, msgs);
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
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				return eInternalContainer().eInverseRemove(this, XmdlgenPackage.GCLASS__GATTRIBUTES, GClass.class, msgs);
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
			case XmdlgenPackage.GATTRIBUTE__XATTRIBUTE:
				if (resolve) return getXAttribute();
				return basicGetXAttribute();
			case XmdlgenPackage.GATTRIBUTE__NAME:
				return getName();
			case XmdlgenPackage.GATTRIBUTE__PERSISTENT:
				return isPersistent() ? Boolean.TRUE : Boolean.FALSE;
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				return getGClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmdlgenPackage.GATTRIBUTE__XATTRIBUTE:
				setXAttribute((XAttribute)newValue);
				return;
			case XmdlgenPackage.GATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case XmdlgenPackage.GATTRIBUTE__PERSISTENT:
				setPersistent(((Boolean)newValue).booleanValue());
				return;
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				setGClass((GClass)newValue);
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
			case XmdlgenPackage.GATTRIBUTE__XATTRIBUTE:
				setXAttribute((XAttribute)null);
				return;
			case XmdlgenPackage.GATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GATTRIBUTE__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				setGClass((GClass)null);
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
			case XmdlgenPackage.GATTRIBUTE__XATTRIBUTE:
				return xAttribute != null;
			case XmdlgenPackage.GATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlgenPackage.GATTRIBUTE__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				return getGClass() != null;
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
		result.append(", persistent: ");
		result.append(persistent);
		result.append(')');
		return result.toString();
	}

} //GAttributeImpl
