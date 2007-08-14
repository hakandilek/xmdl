/**
 * <copyright>
 * </copyright>
 *
 * $Id: BServiceImpl.java,v 1.3 2006/01/26 14:15:31 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo.impl;

import chrome.xmdl.XClass;

import chrome.xmdlbo.BMethod;
import chrome.xmdlbo.BPackage;
import chrome.xmdlbo.BParameter;
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
 * An implementation of the model object '<em><b>BService</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdlbo.impl.BServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlbo.impl.BServiceImpl#getBPackage <em>BPackage</em>}</li>
 *   <li>{@link chrome.xmdlbo.impl.BServiceImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link chrome.xmdlbo.impl.BServiceImpl#getXClass <em>XClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BServiceImpl extends EObjectImpl implements BService {
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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods = null;

	/**
	 * The cached value of the '{@link #getXClass() <em>XClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXClass()
	 * @generated
	 * @ordered
	 */
	protected XClass xClass = null;


	public BServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlboPackage.eINSTANCE.getBService();
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPackage getBPackage() {
		if (eContainerFeatureID != XmdlboPackage.BSERVICE__BPACKAGE) return null;
		return (BPackage)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPackage(BPackage newBPackage) {
		if (newBPackage != eContainer || (eContainerFeatureID != XmdlboPackage.BSERVICE__BPACKAGE && newBPackage != null)) {
			if (EcoreUtil.isAncestor(this, newBPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBPackage != null)
				msgs = ((InternalEObject)newBPackage).eInverseAdd(this, XmdlboPackage.BPACKAGE__SERVICES, BPackage.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newBPackage, XmdlboPackage.BSERVICE__BPACKAGE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BSERVICE__BPACKAGE, newBPackage, newBPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList(BMethod.class, this, XmdlboPackage.BSERVICE__METHODS, XmdlboPackage.BMETHOD__SERVICE);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getXClass() {
		if (xClass != null && xClass.eIsProxy()) {
			XClass oldXClass = xClass;
			xClass = (XClass)eResolveProxy((InternalEObject)xClass);
			if (xClass != oldXClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlboPackage.BSERVICE__XCLASS, oldXClass, xClass));
			}
		}
		return xClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass basicGetXClass() {
		return xClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXClass(XClass newXClass) {
		XClass oldXClass = xClass;
		xClass = newXClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BSERVICE__XCLASS, oldXClass, xClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case XmdlboPackage.BSERVICE__BPACKAGE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, XmdlboPackage.BSERVICE__BPACKAGE, msgs);
				case XmdlboPackage.BSERVICE__METHODS:
					return ((InternalEList)getMethods()).basicAdd(otherEnd, msgs);
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
				case XmdlboPackage.BSERVICE__BPACKAGE:
					return eBasicSetContainer(null, XmdlboPackage.BSERVICE__BPACKAGE, msgs);
				case XmdlboPackage.BSERVICE__METHODS:
					return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
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
				case XmdlboPackage.BSERVICE__BPACKAGE:
					return eContainer.eInverseRemove(this, XmdlboPackage.BPACKAGE__SERVICES, BPackage.class, msgs);
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
			case XmdlboPackage.BSERVICE__NAME:
				return getName();
			case XmdlboPackage.BSERVICE__BPACKAGE:
				return getBPackage();
			case XmdlboPackage.BSERVICE__METHODS:
				return getMethods();
			case XmdlboPackage.BSERVICE__XCLASS:
				if (resolve) return getXClass();
				return basicGetXClass();
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
			case XmdlboPackage.BSERVICE__NAME:
				setName((String)newValue);
				return;
			case XmdlboPackage.BSERVICE__BPACKAGE:
				setBPackage((BPackage)newValue);
				return;
			case XmdlboPackage.BSERVICE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case XmdlboPackage.BSERVICE__XCLASS:
				setXClass((XClass)newValue);
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
			case XmdlboPackage.BSERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlboPackage.BSERVICE__BPACKAGE:
				setBPackage((BPackage)null);
				return;
			case XmdlboPackage.BSERVICE__METHODS:
				getMethods().clear();
				return;
			case XmdlboPackage.BSERVICE__XCLASS:
				setXClass((XClass)null);
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
			case XmdlboPackage.BSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlboPackage.BSERVICE__BPACKAGE:
				return getBPackage() != null;
			case XmdlboPackage.BSERVICE__METHODS:
				return methods != null && !methods.isEmpty();
			case XmdlboPackage.BSERVICE__XCLASS:
				return xClass != null;
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

} //BServiceImpl
