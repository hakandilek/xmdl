/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;

import chrome.xmdldb.DField;
import chrome.xmdldb.DIndex;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DelegatingEList;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>DTable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdldb.impl.DTableImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DTableImpl#getXClass <em>XClass</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DTableImpl#getDPackage <em>DPackage</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DTableImpl#getDFields <em>DFields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DTableImpl extends EObjectImpl implements DTable {
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
	 * The cached value of the '{@link #getXClass() <em>XClass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXClass()
	 * @generated
	 * @ordered
	 */
	protected XClass xClass = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDFields() <em>DFields</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDFields()
	 * @generated
	 * @ordered
	 */
	protected EList dFields = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public DTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdldbPackage.eINSTANCE.getDTable();
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
					XmdldbPackage.DTABLE__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DTABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DPackage getDPackage() {
		if (eContainerFeatureID != XmdldbPackage.DTABLE__DPACKAGE)
			return null;
		return (DPackage) eContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDPackage(DPackage newDPackage) {
		if (newDPackage != eContainer
				|| (eContainerFeatureID != XmdldbPackage.DTABLE__DPACKAGE && newDPackage != null)) {
			if (EcoreUtil.isAncestor(this, newDPackage))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDPackage != null)
				msgs = ((InternalEObject) newDPackage).eInverseAdd(this,
						XmdldbPackage.DPACKAGE__DTABLES, DPackage.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newDPackage,
					XmdldbPackage.DTABLE__DPACKAGE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DTABLE__DPACKAGE, newDPackage, newDPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDFields() {
		if (dFields == null) {
			dFields = new EObjectContainmentWithInverseEList(DField.class,
					this, XmdldbPackage.DTABLE__DFIELDS,
					XmdldbPackage.DFIELD__DTABLE);
		}
		return dFields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getXClass() {
		if (xClass != null && xClass.eIsProxy()) {
			XClass oldXClass = xClass;
			xClass = (XClass) eResolveProxy((InternalEObject) xClass);
			if (xClass != oldXClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DTABLE__XCLASS, oldXClass, xClass));
			}
		}
		return xClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XClass basicGetXClass() {
		return xClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setXClass(XClass newXClass) {
		XClass oldXClass = xClass;
		xClass = newXClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DTABLE__XCLASS, oldXClass, xClass));
	}

	/**
	 */
	public EList getIndices() {
		EList list = new BasicEList();

		Map<Integer, List> idxMap = new HashMap();

		List<DField> fields = getDFields();
		for (int i = 0; i < fields.size(); i++) {
			DField field = fields.get(i);
			EList indices = field.getIndices();
			for (int j = 0; j < indices.size(); i++) {
				Integer index = (Integer) indices.get(j);
				List l = idxMap.get(index);
				if (l == null) {
					l = new ArrayList();
					idxMap.put(index, l);
				}
			}
		}

		Set<Integer> keys = idxMap.keySet();
		for (Iterator<Integer> it = keys.iterator(); it.hasNext();) {
			Integer key = it.next();

			List<DField> idxFields = idxMap.get(key);
			DIndex index = XmdldbFactory.eINSTANCE.createDIndex();
			index.setDTable(this);
			index.setName("IDX_" + fieldsAsString());
			index.setUnique(true);// revise this
			index.getDfields().addAll(idxFields);
			list.add(index);
		}
		return list;
	}

	private String fieldsAsString() {
		StringBuffer sb = new StringBuffer();
		List<DField> fields = getDFields();
		for (int i = 0; i < fields.size(); i++) {
			DField field = fields.get(i);
			sb.append(field.getName());
			if (i < fields.size() - 1) {
				sb.append("_");
			}
		}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case XmdldbPackage.DTABLE__DPACKAGE:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdldbPackage.DTABLE__DPACKAGE, msgs);
			case XmdldbPackage.DTABLE__DFIELDS:
				return ((InternalEList) getDFields()).basicAdd(otherEnd, msgs);
			default:
				return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case XmdldbPackage.DTABLE__DPACKAGE:
				return eBasicSetContainer(null, XmdldbPackage.DTABLE__DPACKAGE,
						msgs);
			case XmdldbPackage.DTABLE__DFIELDS:
				return ((InternalEList) getDFields()).basicRemove(otherEnd,
						msgs);
			default:
				return eDynamicInverseRemove(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
			case XmdldbPackage.DTABLE__DPACKAGE:
				return eContainer.eInverseRemove(this,
						XmdldbPackage.DPACKAGE__DTABLES, DPackage.class, msgs);
			default:
				return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
				- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdldbPackage.DTABLE__PERSISTENT:
			return isPersistent() ? Boolean.TRUE : Boolean.FALSE;
		case XmdldbPackage.DTABLE__XCLASS:
			if (resolve)
				return getXClass();
			return basicGetXClass();
		case XmdldbPackage.DTABLE__NAME:
			return getName();
		case XmdldbPackage.DTABLE__DPACKAGE:
			return getDPackage();
		case XmdldbPackage.DTABLE__DFIELDS:
			return getDFields();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdldbPackage.DTABLE__PERSISTENT:
			setPersistent(((Boolean) newValue).booleanValue());
			return;
		case XmdldbPackage.DTABLE__XCLASS:
			setXClass((XClass) newValue);
			return;
		case XmdldbPackage.DTABLE__NAME:
			setName((String) newValue);
			return;
		case XmdldbPackage.DTABLE__DPACKAGE:
			setDPackage((DPackage) newValue);
			return;
		case XmdldbPackage.DTABLE__DFIELDS:
			getDFields().clear();
			getDFields().addAll((Collection) newValue);
			return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdldbPackage.DTABLE__PERSISTENT:
			setPersistent(PERSISTENT_EDEFAULT);
			return;
		case XmdldbPackage.DTABLE__XCLASS:
			setXClass((XClass) null);
			return;
		case XmdldbPackage.DTABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdldbPackage.DTABLE__DPACKAGE:
			setDPackage((DPackage) null);
			return;
		case XmdldbPackage.DTABLE__DFIELDS:
			getDFields().clear();
			return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdldbPackage.DTABLE__PERSISTENT:
			return persistent != PERSISTENT_EDEFAULT;
		case XmdldbPackage.DTABLE__XCLASS:
			return xClass != null;
		case XmdldbPackage.DTABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdldbPackage.DTABLE__DPACKAGE:
			return getDPackage() != null;
		case XmdldbPackage.DTABLE__DFIELDS:
			return dFields != null && !dFields.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(')');
		return result.toString();
	}

	public void initialize(XClass xClass) {
		boolean different = xClass != getXClass();
		if (different) {
			setXClass(xClass);
		}

		setName("TBL_" + xClass.getName().toUpperCase(Locale.ENGLISH));

		// Attribute Loop
		for (Iterator it = xClass.getAttributes().iterator(); it.hasNext();) {
			XAttribute xAttribute = (XAttribute) it.next();

			DField foundField = null;

			EList dFields = getDFields();
			for (Iterator it2 = dFields.iterator(); it2.hasNext();) {
				DField dField = (DField) it2.next();
				if (xAttribute.equals(dField.getXAttribute())) {
					foundField = dField;
					break;
				}
			}

			if (foundField == null) {
				foundField = XmdldbFactory.eINSTANCE.createDField();
				dFields.add(foundField);
			}
			foundField.initialize(xAttribute);
		}

	}

} // DTableImpl
