/**
 * <copyright>
 * </copyright>
 *
 * $Id: BServiceImpl.java,v 1.3 2006/01/26 14:15:31 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo.impl;

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

import chrome.xmdl.XClass;
import chrome.xmdlbo.BMethod;
import chrome.xmdlbo.BPackage;
import chrome.xmdlbo.BService;
import chrome.xmdlbo.XmdlboPackage;

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
	protected EList<BMethod> methods;

	/**
	 * The cached value of the '{@link #getXClass() <em>XClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXClass()
	 * @generated
	 * @ordered
	 */
	protected XClass xClass;


	public BServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlboPackage.Literals.BSERVICE;
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
		return (BPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPackage(BPackage newBPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBPackage, XmdlboPackage.BSERVICE__BPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPackage(BPackage newBPackage) {
		if (newBPackage != eInternalContainer() || (eContainerFeatureID != XmdlboPackage.BSERVICE__BPACKAGE && newBPackage != null)) {
			if (EcoreUtil.isAncestor(this, newBPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBPackage != null)
				msgs = ((InternalEObject)newBPackage).eInverseAdd(this, XmdlboPackage.BPACKAGE__SERVICES, BPackage.class, msgs);
			msgs = basicSetBPackage(newBPackage, msgs);
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
	public EList<BMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<BMethod>(BMethod.class, this, XmdlboPackage.BSERVICE__METHODS, XmdlboPackage.BMETHOD__SERVICE);
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
			InternalEObject oldXClass = (InternalEObject)xClass;
			xClass = (XClass)eResolveProxy(oldXClass);
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
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlboPackage.BSERVICE__BPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBPackage((BPackage)otherEnd, msgs);
			case XmdlboPackage.BSERVICE__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
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
			case XmdlboPackage.BSERVICE__BPACKAGE:
				return basicSetBPackage(null, msgs);
			case XmdlboPackage.BSERVICE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case XmdlboPackage.BSERVICE__BPACKAGE:
				return eInternalContainer().eInverseRemove(this, XmdlboPackage.BPACKAGE__SERVICES, BPackage.class, msgs);
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
			case XmdlboPackage.BSERVICE__NAME:
				setName((String)newValue);
				return;
			case XmdlboPackage.BSERVICE__BPACKAGE:
				setBPackage((BPackage)newValue);
				return;
			case XmdlboPackage.BSERVICE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends BMethod>)newValue);
				return;
			case XmdlboPackage.BSERVICE__XCLASS:
				setXClass((XClass)newValue);
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
			case XmdlboPackage.BSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlboPackage.BSERVICE__BPACKAGE:
				return getBPackage() != null;
			case XmdlboPackage.BSERVICE__METHODS:
				return methods != null && !methods.isEmpty();
			case XmdlboPackage.BSERVICE__XCLASS:
				return xClass != null;
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

} //BServiceImpl
