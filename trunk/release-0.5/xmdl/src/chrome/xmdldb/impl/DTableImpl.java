/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdldb.DField;
import chrome.xmdldb.DIndex;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;

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
	protected XClass xClass;

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
	protected EList<DField> dFields;

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
	@Override
	protected EClass eStaticClass() {
		return XmdldbPackage.Literals.DTABLE;
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
		return (DPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPackage(DPackage newDPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDPackage,
				XmdldbPackage.DTABLE__DPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDPackage(DPackage newDPackage) {
		if (newDPackage != eInternalContainer()
				|| (eContainerFeatureID != XmdldbPackage.DTABLE__DPACKAGE && newDPackage != null)) {
			if (EcoreUtil.isAncestor(this, newDPackage))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDPackage != null)
				msgs = ((InternalEObject) newDPackage).eInverseAdd(this,
						XmdldbPackage.DPACKAGE__DTABLES, DPackage.class, msgs);
			msgs = basicSetDPackage(newDPackage, msgs);
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
	public EList<DField> getDFields() {
		if (dFields == null) {
			dFields = new EObjectContainmentWithInverseEList<DField>(
					DField.class, this, XmdldbPackage.DTABLE__DFIELDS,
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
			InternalEObject oldXClass = (InternalEObject) xClass;
			xClass = (XClass) eResolveProxy(oldXClass);
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
	public EList<DIndex> getIndices() {
		EList<DIndex> list = new BasicEList<DIndex>();

		Map<Integer, List<DField>> idxMap = new HashMap<Integer, List<DField>>();

		List<DField> fields = getDFields();
		for (int i = 0; i < fields.size(); i++) {
			DField field = fields.get(i);
			List<Integer> indices = field.getIndices();
			for (int j = 0; j < indices.size(); i++) {
				Integer index = (Integer) indices.get(j);
				List<DField> l = idxMap.get(index);
				if (l == null) {
					l = new ArrayList<DField>();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XmdldbPackage.DTABLE__DPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDPackage((DPackage) otherEnd, msgs);
		case XmdldbPackage.DTABLE__DFIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDFields())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XmdldbPackage.DTABLE__DPACKAGE:
			return basicSetDPackage(null, msgs);
		case XmdldbPackage.DTABLE__DFIELDS:
			return ((InternalEList<?>) getDFields())
					.basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case XmdldbPackage.DTABLE__DPACKAGE:
			return eInternalContainer().eInverseRemove(this,
					XmdldbPackage.DPACKAGE__DTABLES, DPackage.class, msgs);
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
			getDFields().addAll((Collection<? extends DField>) newValue);
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
		return super.eIsSet(featureID);
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
	@Override
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
		for (Iterator<XAttribute> it = xClass.getAttributes().iterator(); it
				.hasNext();) {
			XAttribute xAttribute = (XAttribute) it.next();

			DField foundField = null;

			EList<DField> dFields = getDFields();
			for (Iterator<DField> it2 = dFields.iterator(); it2.hasNext();) {
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
