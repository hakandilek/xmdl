/**
 * <copyright>
 * </copyright>
 *
 * $Id: GAttributeImpl.java,v 1.3 2006/01/18 15:35:18 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen.impl;

import chrome.xmdl.XAttribute;

import chrome.xmdlgen.GAttribute;
import chrome.xmdlgen.GClass;
import chrome.xmdlgen.XmdlgenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdlgen.impl.GAttributeImpl#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GAttributeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GAttributeImpl#getGClass <em>GClass</em>}</li>
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
	protected XAttribute xAttribute = null;

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
	protected EClass eStaticClass() {
		return XmdlgenPackage.eINSTANCE.getGAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute getXAttribute() {
		if (xAttribute != null && xAttribute.eIsProxy()) {
			XAttribute oldXAttribute = xAttribute;
			xAttribute = (XAttribute)eResolveProxy((InternalEObject)xAttribute);
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
		return (GClass)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGClass(GClass newGClass) {
		if (newGClass != eContainer || (eContainerFeatureID != XmdlgenPackage.GATTRIBUTE__GCLASS && newGClass != null)) {
			if (EcoreUtil.isAncestor(this, newGClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGClass != null)
				msgs = ((InternalEObject)newGClass).eInverseAdd(this, XmdlgenPackage.GCLASS__GATTRIBUTES, GClass.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newGClass, XmdlgenPackage.GATTRIBUTE__GCLASS, msgs);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case XmdlgenPackage.GATTRIBUTE__GCLASS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, XmdlgenPackage.GATTRIBUTE__GCLASS, msgs);
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
				case XmdlgenPackage.GATTRIBUTE__GCLASS:
					return eBasicSetContainer(null, XmdlgenPackage.GATTRIBUTE__GCLASS, msgs);
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
				case XmdlgenPackage.GATTRIBUTE__GCLASS:
					return eContainer.eInverseRemove(this, XmdlgenPackage.GCLASS__GATTRIBUTES, GClass.class, msgs);
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case XmdlgenPackage.GATTRIBUTE__XATTRIBUTE:
				return xAttribute != null;
			case XmdlgenPackage.GATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlgenPackage.GATTRIBUTE__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
			case XmdlgenPackage.GATTRIBUTE__GCLASS:
				return getGClass() != null;
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
		result.append(", persistent: ");
		result.append(persistent);
		result.append(')');
		return result.toString();
	}

} //GAttributeImpl
