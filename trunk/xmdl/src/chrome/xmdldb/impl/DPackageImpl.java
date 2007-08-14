/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;

import chrome.xmdldb.DModel;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;

import java.util.Collection;
import java.util.Iterator;

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
 * An implementation of the model object '<em><b>DPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdldb.impl.DPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DPackageImpl#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DPackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DPackageImpl#getDTables <em>DTables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DPackageImpl extends EObjectImpl implements DPackage {
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
	 * The cached value of the '{@link #getXPackage() <em>XPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPackage()
	 * @generated
	 * @ordered
	 */
	protected XPackage xPackage = null;

	/**
	 * The cached value of the '{@link #getDTables() <em>DTables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTables()
	 * @generated
	 * @ordered
	 */
	protected EList dTables = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public DPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdldbPackage.eINSTANCE.getDPackage();
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
					XmdldbPackage.DPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDTables() {
		if (dTables == null) {
			dTables = new EObjectContainmentWithInverseEList(DTable.class,
					this, XmdldbPackage.DPACKAGE__DTABLES,
					XmdldbPackage.DTABLE__DPACKAGE);
		}
		return dTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage getXPackage() {
		if (xPackage != null && xPackage.eIsProxy()) {
			XPackage oldXPackage = xPackage;
			xPackage = (XPackage) eResolveProxy((InternalEObject) xPackage);
			if (xPackage != oldXPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DPACKAGE__XPACKAGE, oldXPackage,
							xPackage));
			}
		}
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage basicGetXPackage() {
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPackage(XPackage newXPackage) {
		XPackage oldXPackage = xPackage;
		xPackage = newXPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DPACKAGE__XPACKAGE, oldXPackage, xPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DModel getModel() {
		if (eContainerFeatureID != XmdldbPackage.DPACKAGE__MODEL)
			return null;
		return (DModel) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(DModel newModel) {
		if (newModel != eContainer
				|| (eContainerFeatureID != XmdldbPackage.DPACKAGE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						XmdldbPackage.DMODEL__DPACKAGES, DModel.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newModel,
					XmdldbPackage.DPACKAGE__MODEL, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DPACKAGE__MODEL, newModel, newModel));
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
			case XmdldbPackage.DPACKAGE__MODEL:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdldbPackage.DPACKAGE__MODEL, msgs);
			case XmdldbPackage.DPACKAGE__DTABLES:
				return ((InternalEList) getDTables()).basicAdd(otherEnd, msgs);
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
			case XmdldbPackage.DPACKAGE__MODEL:
				return eBasicSetContainer(null, XmdldbPackage.DPACKAGE__MODEL,
						msgs);
			case XmdldbPackage.DPACKAGE__DTABLES:
				return ((InternalEList) getDTables()).basicRemove(otherEnd,
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
			case XmdldbPackage.DPACKAGE__MODEL:
				return eContainer.eInverseRemove(this,
						XmdldbPackage.DMODEL__DPACKAGES, DModel.class, msgs);
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
		case XmdldbPackage.DPACKAGE__NAME:
			return getName();
		case XmdldbPackage.DPACKAGE__XPACKAGE:
			if (resolve)
				return getXPackage();
			return basicGetXPackage();
		case XmdldbPackage.DPACKAGE__MODEL:
			return getModel();
		case XmdldbPackage.DPACKAGE__DTABLES:
			return getDTables();
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
		case XmdldbPackage.DPACKAGE__NAME:
			setName((String) newValue);
			return;
		case XmdldbPackage.DPACKAGE__XPACKAGE:
			setXPackage((XPackage) newValue);
			return;
		case XmdldbPackage.DPACKAGE__MODEL:
			setModel((DModel) newValue);
			return;
		case XmdldbPackage.DPACKAGE__DTABLES:
			getDTables().clear();
			getDTables().addAll((Collection) newValue);
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
		case XmdldbPackage.DPACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdldbPackage.DPACKAGE__XPACKAGE:
			setXPackage((XPackage) null);
			return;
		case XmdldbPackage.DPACKAGE__MODEL:
			setModel((DModel) null);
			return;
		case XmdldbPackage.DPACKAGE__DTABLES:
			getDTables().clear();
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
		case XmdldbPackage.DPACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdldbPackage.DPACKAGE__XPACKAGE:
			return xPackage != null;
		case XmdldbPackage.DPACKAGE__MODEL:
			return getModel() != null;
		case XmdldbPackage.DPACKAGE__DTABLES:
			return dTables != null && !dTables.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DPackageImpl
