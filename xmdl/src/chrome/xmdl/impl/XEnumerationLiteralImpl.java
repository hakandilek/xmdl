/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl.impl;

import chrome.xmdl.XEnumeration;
import chrome.xmdl.XEnumerationLiteral;
import chrome.xmdl.XmdlPackage;

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
 * An implementation of the model object '<em><b>XEnumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdl.impl.XEnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XEnumerationLiteralImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XEnumerationLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XEnumerationLiteralImpl extends EObjectImpl implements
		XEnumerationLiteral {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XEnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlPackage.eINSTANCE.getXEnumerationLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumeration getEnumeration() {
		if (eContainerFeatureID != XmdlPackage.XENUMERATION_LITERAL__ENUMERATION)
			return null;
		return (XEnumeration) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(XEnumeration newEnumeration) {
		if (newEnumeration != eContainer
				|| (eContainerFeatureID != XmdlPackage.XENUMERATION_LITERAL__ENUMERATION && newEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newEnumeration))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject) newEnumeration).eInverseAdd(this,
						XmdlPackage.XENUMERATION__LITERALS, XEnumeration.class,
						msgs);
			msgs = eBasicSetContainer((InternalEObject) newEnumeration,
					XmdlPackage.XENUMERATION_LITERAL__ENUMERATION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XENUMERATION_LITERAL__ENUMERATION,
					newEnumeration, newEnumeration));
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
					XmdlPackage.XENUMERATION_LITERAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XENUMERATION_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdlPackage.XENUMERATION_LITERAL__ENUMERATION, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
				return eBasicSetContainer(null,
						XmdlPackage.XENUMERATION_LITERAL__ENUMERATION, msgs);
			default:
				return eDynamicInverseRemove(otherEnd, featureID, baseClass,
						msgs);
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
			case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
				return eContainer.eInverseRemove(this,
						XmdlPackage.XENUMERATION__LITERALS, XEnumeration.class,
						msgs);
			default:
				return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
				- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
			return getEnumeration();
		case XmdlPackage.XENUMERATION_LITERAL__NAME:
			return getName();
		case XmdlPackage.XENUMERATION_LITERAL__VALUE:
			return new Integer(getValue());
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
		case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
			setEnumeration((XEnumeration) newValue);
			return;
		case XmdlPackage.XENUMERATION_LITERAL__NAME:
			setName((String) newValue);
			return;
		case XmdlPackage.XENUMERATION_LITERAL__VALUE:
			setValue(((Integer) newValue).intValue());
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
		case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
			setEnumeration((XEnumeration) null);
			return;
		case XmdlPackage.XENUMERATION_LITERAL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdlPackage.XENUMERATION_LITERAL__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case XmdlPackage.XENUMERATION_LITERAL__ENUMERATION:
			return getEnumeration() != null;
		case XmdlPackage.XENUMERATION_LITERAL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdlPackage.XENUMERATION_LITERAL__VALUE:
			return value != VALUE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer();
		result.append(name);
		result.append(" : ");
		result.append(value);
		return result.toString();
	}

	/**
	 * @generated
	 * @return
	 */
	public String toStringGen() {
		return name;		
	}

	public int compareTo(Object o) {
		if (o != null && o instanceof XEnumerationLiteral) {
			XEnumerationLiteral other = (XEnumerationLiteral) o;
			int value2 = other.getValue();
			return getValue() - value2;
		}
		return 0;
	}

} //XEnumerationLiteralImpl
