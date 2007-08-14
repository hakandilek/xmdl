/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import chrome.xmdl.XAttribute;

import chrome.xmdldb.DField;
import chrome.xmdldb.DTable;
import chrome.xmdldb.XmdldbPackage;

import java.util.Collection;
import java.util.Locale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#getDTable <em>DTable</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#getLength <em>Length</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DFieldImpl#getForeign <em>Foreign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DFieldImpl extends EObjectImpl implements DField {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList indices = null;

	/**
	 * The cached value of the '{@link #getForeign() <em>Foreign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeign()
	 * @generated
	 * @ordered
	 */
	protected DField foreign = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public DFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdldbPackage.eINSTANCE.getDField();
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DFIELD__PERSISTENT, oldPersistent, persistent));
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
					XmdldbPackage.DFIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DFIELD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTable getDTable() {
		if (eContainerFeatureID != XmdldbPackage.DFIELD__DTABLE)
			return null;
		return (DTable) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTable(DTable newDTable) {
		if (newDTable != eContainer
				|| (eContainerFeatureID != XmdldbPackage.DFIELD__DTABLE && newDTable != null)) {
			if (EcoreUtil.isAncestor(this, newDTable))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDTable != null)
				msgs = ((InternalEObject) newDTable).eInverseAdd(this,
						XmdldbPackage.DTABLE__DFIELDS, DTable.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newDTable,
					XmdldbPackage.DFIELD__DTABLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DFIELD__DTABLE, newDTable, newDTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute getXAttribute() {
		if (xAttribute != null && xAttribute.eIsProxy()) {
			XAttribute oldXAttribute = xAttribute;
			xAttribute = (XAttribute) eResolveProxy((InternalEObject) xAttribute);
			if (xAttribute != oldXAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DFIELD__XATTRIBUTE, oldXAttribute,
							xAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DFIELD__XATTRIBUTE, oldXAttribute, xAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIndices() {
		if (indices == null) {
			indices = new EDataTypeUniqueEList(Integer.class, this,
					XmdldbPackage.DFIELD__INDICES);
		}
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DField getForeign() {
		if (foreign != null && foreign.eIsProxy()) {
			DField oldForeign = foreign;
			foreign = (DField) eResolveProxy((InternalEObject) foreign);
			if (foreign != oldForeign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DFIELD__FOREIGN, oldForeign, foreign));
			}
		}
		return foreign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DField basicGetForeign() {
		return foreign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeign(DField newForeign) {
		DField oldForeign = foreign;
		foreign = newForeign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DFIELD__FOREIGN, oldForeign, foreign));
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
			case XmdldbPackage.DFIELD__DTABLE:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdldbPackage.DFIELD__DTABLE, msgs);
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
			case XmdldbPackage.DFIELD__DTABLE:
				return eBasicSetContainer(null, XmdldbPackage.DFIELD__DTABLE,
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
			case XmdldbPackage.DFIELD__DTABLE:
				return eContainer.eInverseRemove(this,
						XmdldbPackage.DTABLE__DFIELDS, DTable.class, msgs);
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
		case XmdldbPackage.DFIELD__PERSISTENT:
			return isPersistent() ? Boolean.TRUE : Boolean.FALSE;
		case XmdldbPackage.DFIELD__XATTRIBUTE:
			if (resolve)
				return getXAttribute();
			return basicGetXAttribute();
		case XmdldbPackage.DFIELD__DTABLE:
			return getDTable();
		case XmdldbPackage.DFIELD__NAME:
			return getName();
		case XmdldbPackage.DFIELD__LENGTH:
			return new Integer(getLength());
		case XmdldbPackage.DFIELD__INDICES:
			return getIndices();
		case XmdldbPackage.DFIELD__FOREIGN:
			if (resolve)
				return getForeign();
			return basicGetForeign();
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
		case XmdldbPackage.DFIELD__PERSISTENT:
			setPersistent(((Boolean) newValue).booleanValue());
			return;
		case XmdldbPackage.DFIELD__XATTRIBUTE:
			setXAttribute((XAttribute) newValue);
			return;
		case XmdldbPackage.DFIELD__DTABLE:
			setDTable((DTable) newValue);
			return;
		case XmdldbPackage.DFIELD__NAME:
			setName((String) newValue);
			return;
		case XmdldbPackage.DFIELD__LENGTH:
			setLength(((Integer) newValue).intValue());
			return;
		case XmdldbPackage.DFIELD__INDICES:
			getIndices().clear();
			getIndices().addAll((Collection) newValue);
			return;
		case XmdldbPackage.DFIELD__FOREIGN:
			setForeign((DField) newValue);
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
		case XmdldbPackage.DFIELD__PERSISTENT:
			setPersistent(PERSISTENT_EDEFAULT);
			return;
		case XmdldbPackage.DFIELD__XATTRIBUTE:
			setXAttribute((XAttribute) null);
			return;
		case XmdldbPackage.DFIELD__DTABLE:
			setDTable((DTable) null);
			return;
		case XmdldbPackage.DFIELD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdldbPackage.DFIELD__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case XmdldbPackage.DFIELD__INDICES:
			getIndices().clear();
			return;
		case XmdldbPackage.DFIELD__FOREIGN:
			setForeign((DField) null);
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
		case XmdldbPackage.DFIELD__PERSISTENT:
			return persistent != PERSISTENT_EDEFAULT;
		case XmdldbPackage.DFIELD__XATTRIBUTE:
			return xAttribute != null;
		case XmdldbPackage.DFIELD__DTABLE:
			return getDTable() != null;
		case XmdldbPackage.DFIELD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdldbPackage.DFIELD__LENGTH:
			return length != LENGTH_EDEFAULT;
		case XmdldbPackage.DFIELD__INDICES:
			return indices != null && !indices.isEmpty();
		case XmdldbPackage.DFIELD__FOREIGN:
			return foreign != null;
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
		result.append(" (persistent: ");
		result.append(persistent);
		result.append(", name: ");
		result.append(name);
		result.append(", length: ");
		result.append(length);
		result.append(", indices: ");
		result.append(indices);
		result.append(')');
		return result.toString();
	}

	public void initialize(XAttribute xAttribute) {
		boolean different = !xAttribute.equals(getXAttribute());
		if (different) {
			setXAttribute(xAttribute);
			setName(xAttribute.getName().toUpperCase(Locale.ENGLISH));
			setLength(xAttribute.getLength());
		}

	}

} //DFieldImpl
