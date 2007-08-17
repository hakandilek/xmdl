/**
 * <copyright>
 * </copyright>
 *
 * $Id: GClassImpl.java,v 1.2 2006/01/17 15:50:55 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen.impl;

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
import chrome.xmdlgen.GAttribute;
import chrome.xmdlgen.GClass;
import chrome.xmdlgen.GPackage;
import chrome.xmdlgen.XmdlgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getXClass <em>XClass</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getGPackage <em>GPackage</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getGAttributes <em>GAttributes</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getDeleteServiceName <em>Delete Service Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getEditServiceName <em>Edit Service Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getSaveServiceName <em>Save Service Name</em>}</li>
 *   <li>{@link chrome.xmdlgen.impl.GClassImpl#getSearchServiceName <em>Search Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GClassImpl extends EObjectImpl implements GClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached value of the '{@link #getXClass() <em>XClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXClass()
	 * @generated
	 * @ordered
	 */
	protected XClass xClass;

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
	 * The cached value of the '{@link #getGAttributes() <em>GAttributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<GAttribute> gAttributes;

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
	 * The default value of the '{@link #getDeleteServiceName() <em>Delete Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DELETE_SERVICE_NAME_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getDeleteServiceName() <em>Delete Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteServiceName()
	 * @generated
	 * @ordered
	 */
	protected String deleteServiceName = DELETE_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditServiceName() <em>Edit Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_SERVICE_NAME_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getEditServiceName() <em>Edit Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditServiceName()
	 * @generated
	 * @ordered
	 */
	protected String editServiceName = EDIT_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveServiceName() <em>Save Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVE_SERVICE_NAME_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getSaveServiceName() <em>Save Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveServiceName()
	 * @generated
	 * @ordered
	 */
	protected String saveServiceName = SAVE_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchServiceName() <em>Search Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_SERVICE_NAME_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getSearchServiceName() <em>Search Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchServiceName()
	 * @generated
	 * @ordered
	 */
	protected String searchServiceName = SEARCH_SERVICE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public GClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlgenPackage.Literals.GCLASS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlgenPackage.GCLASS__XCLASS, oldXClass, xClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__XCLASS, oldXClass, xClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPackage getGPackage() {
		if (eContainerFeatureID != XmdlgenPackage.GCLASS__GPACKAGE) return null;
		return (GPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPackage(GPackage newGPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGPackage, XmdlgenPackage.GCLASS__GPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPackage(GPackage newGPackage) {
		if (newGPackage != eInternalContainer() || (eContainerFeatureID != XmdlgenPackage.GCLASS__GPACKAGE && newGPackage != null)) {
			if (EcoreUtil.isAncestor(this, newGPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGPackage != null)
				msgs = ((InternalEObject)newGPackage).eInverseAdd(this, XmdlgenPackage.GPACKAGE__GCLASSES, GPackage.class, msgs);
			msgs = basicSetGPackage(newGPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__GPACKAGE, newGPackage, newGPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GAttribute> getGAttributes() {
		if (gAttributes == null) {
			gAttributes = new EObjectContainmentWithInverseEList<GAttribute>(GAttribute.class, this, XmdlgenPackage.GCLASS__GATTRIBUTES, XmdlgenPackage.GATTRIBUTE__GCLASS);
		}
		return gAttributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeleteServiceName() {
		return deleteServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteServiceName(String newDeleteServiceName) {
		String oldDeleteServiceName = deleteServiceName;
		deleteServiceName = newDeleteServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__DELETE_SERVICE_NAME, oldDeleteServiceName, deleteServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditServiceName() {
		return editServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditServiceName(String newEditServiceName) {
		String oldEditServiceName = editServiceName;
		editServiceName = newEditServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__EDIT_SERVICE_NAME, oldEditServiceName, editServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSaveServiceName() {
		return saveServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveServiceName(String newSaveServiceName) {
		String oldSaveServiceName = saveServiceName;
		saveServiceName = newSaveServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__SAVE_SERVICE_NAME, oldSaveServiceName, saveServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchServiceName() {
		return searchServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchServiceName(String newSearchServiceName) {
		String oldSearchServiceName = searchServiceName;
		searchServiceName = newSearchServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GCLASS__SEARCH_SERVICE_NAME, oldSearchServiceName, searchServiceName));
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
			case XmdlgenPackage.GCLASS__GPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGPackage((GPackage)otherEnd, msgs);
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGAttributes()).basicAdd(otherEnd, msgs);
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
			case XmdlgenPackage.GCLASS__GPACKAGE:
				return basicSetGPackage(null, msgs);
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				return ((InternalEList<?>)getGAttributes()).basicRemove(otherEnd, msgs);
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
			case XmdlgenPackage.GCLASS__GPACKAGE:
				return eInternalContainer().eInverseRemove(this, XmdlgenPackage.GPACKAGE__GCLASSES, GPackage.class, msgs);
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
			case XmdlgenPackage.GCLASS__XCLASS:
				if (resolve) return getXClass();
				return basicGetXClass();
			case XmdlgenPackage.GCLASS__NAME:
				return getName();
			case XmdlgenPackage.GCLASS__GPACKAGE:
				return getGPackage();
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				return getGAttributes();
			case XmdlgenPackage.GCLASS__PERSISTENT:
				return isPersistent() ? Boolean.TRUE : Boolean.FALSE;
			case XmdlgenPackage.GCLASS__DELETE_SERVICE_NAME:
				return getDeleteServiceName();
			case XmdlgenPackage.GCLASS__EDIT_SERVICE_NAME:
				return getEditServiceName();
			case XmdlgenPackage.GCLASS__SAVE_SERVICE_NAME:
				return getSaveServiceName();
			case XmdlgenPackage.GCLASS__SEARCH_SERVICE_NAME:
				return getSearchServiceName();
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
			case XmdlgenPackage.GCLASS__XCLASS:
				setXClass((XClass)newValue);
				return;
			case XmdlgenPackage.GCLASS__NAME:
				setName((String)newValue);
				return;
			case XmdlgenPackage.GCLASS__GPACKAGE:
				setGPackage((GPackage)newValue);
				return;
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				getGAttributes().clear();
				getGAttributes().addAll((Collection<? extends GAttribute>)newValue);
				return;
			case XmdlgenPackage.GCLASS__PERSISTENT:
				setPersistent(((Boolean)newValue).booleanValue());
				return;
			case XmdlgenPackage.GCLASS__DELETE_SERVICE_NAME:
				setDeleteServiceName((String)newValue);
				return;
			case XmdlgenPackage.GCLASS__EDIT_SERVICE_NAME:
				setEditServiceName((String)newValue);
				return;
			case XmdlgenPackage.GCLASS__SAVE_SERVICE_NAME:
				setSaveServiceName((String)newValue);
				return;
			case XmdlgenPackage.GCLASS__SEARCH_SERVICE_NAME:
				setSearchServiceName((String)newValue);
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
			case XmdlgenPackage.GCLASS__XCLASS:
				setXClass((XClass)null);
				return;
			case XmdlgenPackage.GCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GCLASS__GPACKAGE:
				setGPackage((GPackage)null);
				return;
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				getGAttributes().clear();
				return;
			case XmdlgenPackage.GCLASS__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case XmdlgenPackage.GCLASS__DELETE_SERVICE_NAME:
				setDeleteServiceName(DELETE_SERVICE_NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GCLASS__EDIT_SERVICE_NAME:
				setEditServiceName(EDIT_SERVICE_NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GCLASS__SAVE_SERVICE_NAME:
				setSaveServiceName(SAVE_SERVICE_NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GCLASS__SEARCH_SERVICE_NAME:
				setSearchServiceName(SEARCH_SERVICE_NAME_EDEFAULT);
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
			case XmdlgenPackage.GCLASS__XCLASS:
				return xClass != null;
			case XmdlgenPackage.GCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlgenPackage.GCLASS__GPACKAGE:
				return getGPackage() != null;
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				return gAttributes != null && !gAttributes.isEmpty();
			case XmdlgenPackage.GCLASS__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
			case XmdlgenPackage.GCLASS__DELETE_SERVICE_NAME:
				return DELETE_SERVICE_NAME_EDEFAULT == null ? deleteServiceName != null : !DELETE_SERVICE_NAME_EDEFAULT.equals(deleteServiceName);
			case XmdlgenPackage.GCLASS__EDIT_SERVICE_NAME:
				return EDIT_SERVICE_NAME_EDEFAULT == null ? editServiceName != null : !EDIT_SERVICE_NAME_EDEFAULT.equals(editServiceName);
			case XmdlgenPackage.GCLASS__SAVE_SERVICE_NAME:
				return SAVE_SERVICE_NAME_EDEFAULT == null ? saveServiceName != null : !SAVE_SERVICE_NAME_EDEFAULT.equals(saveServiceName);
			case XmdlgenPackage.GCLASS__SEARCH_SERVICE_NAME:
				return SEARCH_SERVICE_NAME_EDEFAULT == null ? searchServiceName != null : !SEARCH_SERVICE_NAME_EDEFAULT.equals(searchServiceName);
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
		result.append(", deleteServiceName: ");
		result.append(deleteServiceName);
		result.append(", editServiceName: ");
		result.append(editServiceName);
		result.append(", saveServiceName: ");
		result.append(saveServiceName);
		result.append(", searchServiceName: ");
		result.append(searchServiceName);
		result.append(')');
		return result.toString();
	}

} //GClassImpl
