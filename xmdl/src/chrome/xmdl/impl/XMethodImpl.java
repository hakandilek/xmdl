/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl.impl;

import chrome.xmdl.XClass;
import chrome.xmdl.XException;
import chrome.xmdl.XMethod;
import chrome.xmdl.XParameter;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlPackage;

import chrome.xmdl.*;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdl.impl.XMethodImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XMethodImpl#getXClass <em>XClass</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XMethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XMethodImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMethodImpl extends EObjectImpl implements XMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected XType type = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters = null;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList exceptions = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlPackage.eINSTANCE.getXMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XMETHOD__INDEX, oldIndex, index));
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
					XmdlPackage.XMETHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getXClass() {
		if (eContainerFeatureID != XmdlPackage.XMETHOD__XCLASS)
			return null;
		return (XClass) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXClass(XClass newXClass) {
		if (newXClass != eContainer
				|| (eContainerFeatureID != XmdlPackage.XMETHOD__XCLASS && newXClass != null)) {
			if (EcoreUtil.isAncestor(this, newXClass))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXClass != null)
				msgs = ((InternalEObject) newXClass).eInverseAdd(this,
						XmdlPackage.XCLASS__METHODS, XClass.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newXClass,
					XmdlPackage.XMETHOD__XCLASS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XMETHOD__XCLASS, newXClass, newXClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XType getType() {
		if (type != null && type.eIsProxy()) {
			XType oldType = type;
			type = (XType) eResolveProxy((InternalEObject) type);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdlPackage.XMETHOD__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(XType newType) {
		XType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XMETHOD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList(
					XParameter.class, this, XmdlPackage.XMETHOD__PARAMETERS,
					XmdlPackage.XPARAMETER__METHOD);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectContainmentEList(XException.class, this,
					XmdlPackage.XMETHOD__EXCEPTIONS);
		}
		return exceptions;
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
			case XmdlPackage.XMETHOD__XCLASS:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdlPackage.XMETHOD__XCLASS, msgs);
			case XmdlPackage.XMETHOD__PARAMETERS:
				return ((InternalEList) getParameters()).basicAdd(otherEnd,
						msgs);
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
			case XmdlPackage.XMETHOD__XCLASS:
				return eBasicSetContainer(null, XmdlPackage.XMETHOD__XCLASS,
						msgs);
			case XmdlPackage.XMETHOD__PARAMETERS:
				return ((InternalEList) getParameters()).basicRemove(otherEnd,
						msgs);
			case XmdlPackage.XMETHOD__EXCEPTIONS:
				return ((InternalEList) getExceptions()).basicRemove(otherEnd,
						msgs);
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
			case XmdlPackage.XMETHOD__XCLASS:
				return eContainer.eInverseRemove(this,
						XmdlPackage.XCLASS__METHODS, XClass.class, msgs);
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
		case XmdlPackage.XMETHOD__INDEX:
			return getIndex();
		case XmdlPackage.XMETHOD__NAME:
			return getName();
		case XmdlPackage.XMETHOD__XCLASS:
			return getXClass();
		case XmdlPackage.XMETHOD__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case XmdlPackage.XMETHOD__PARAMETERS:
			return getParameters();
		case XmdlPackage.XMETHOD__EXCEPTIONS:
			return getExceptions();
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
		case XmdlPackage.XMETHOD__INDEX:
			setIndex((String) newValue);
			return;
		case XmdlPackage.XMETHOD__NAME:
			setName((String) newValue);
			return;
		case XmdlPackage.XMETHOD__XCLASS:
			setXClass((XClass) newValue);
			return;
		case XmdlPackage.XMETHOD__TYPE:
			setType((XType) newValue);
			return;
		case XmdlPackage.XMETHOD__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection) newValue);
			return;
		case XmdlPackage.XMETHOD__EXCEPTIONS:
			getExceptions().clear();
			getExceptions().addAll((Collection) newValue);
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
		case XmdlPackage.XMETHOD__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case XmdlPackage.XMETHOD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdlPackage.XMETHOD__XCLASS:
			setXClass((XClass) null);
			return;
		case XmdlPackage.XMETHOD__TYPE:
			setType((XType) null);
			return;
		case XmdlPackage.XMETHOD__PARAMETERS:
			getParameters().clear();
			return;
		case XmdlPackage.XMETHOD__EXCEPTIONS:
			getExceptions().clear();
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
		case XmdlPackage.XMETHOD__INDEX:
			return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT
					.equals(index);
		case XmdlPackage.XMETHOD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdlPackage.XMETHOD__XCLASS:
			return getXClass() != null;
		case XmdlPackage.XMETHOD__TYPE:
			return type != null;
		case XmdlPackage.XMETHOD__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case XmdlPackage.XMETHOD__EXCEPTIONS:
			return exceptions != null && !exceptions.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //XMethodImpl
