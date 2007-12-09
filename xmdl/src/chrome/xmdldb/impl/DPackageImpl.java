/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import java.util.Collection;
import java.util.List;

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

import chrome.xmdl.XPackage;
import chrome.xmdldb.DBase;
import chrome.xmdldb.DModel;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;
import chrome.xmdldb.DVisitor;
import chrome.xmdldb.XmdldbPackage;

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
	protected XPackage xPackage;

	/**
	 * The cached value of the '{@link #getDTables() <em>DTables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTables()
	 * @generated
	 * @ordered
	 */
	protected EList<DTable> dTables;

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
	@Override
	protected EClass eStaticClass() {
		return XmdldbPackage.Literals.DPACKAGE;
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
	public EList<DTable> getDTables() {
		if (dTables == null) {
			dTables = new EObjectContainmentWithInverseEList<DTable>(
					DTable.class, this, XmdldbPackage.DPACKAGE__DTABLES,
					XmdldbPackage.DTABLE__DPACKAGE);
		}
		return dTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean accept(DVisitor visitor) {
		if (visitor.visitEnter(this)) {
			final List<DTable> children1 = getDTables();
			for (DBase child : children1) {
				if (!child.accept(visitor))
					break;
			}
		}
		final boolean result = visitor.visitLeave(this);
		return result;
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
		case XmdldbPackage.DPACKAGE__MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModel((DModel) otherEnd, msgs);
		case XmdldbPackage.DPACKAGE__DTABLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDTables())
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
		case XmdldbPackage.DPACKAGE__MODEL:
			return basicSetModel(null, msgs);
		case XmdldbPackage.DPACKAGE__DTABLES:
			return ((InternalEList<?>) getDTables())
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
		case XmdldbPackage.DPACKAGE__MODEL:
			return eInternalContainer().eInverseRemove(this,
					XmdldbPackage.DMODEL__DPACKAGES, DModel.class, msgs);
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
			getDTables().addAll((Collection<? extends DTable>) newValue);
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
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage getXPackage() {
		if (xPackage != null && xPackage.eIsProxy()) {
			InternalEObject oldXPackage = (InternalEObject) xPackage;
			xPackage = (XPackage) eResolveProxy(oldXPackage);
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
		return (DModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(DModel newModel,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModel,
				XmdldbPackage.DPACKAGE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(DModel newModel) {
		if (newModel != eInternalContainer()
				|| (eContainerFeatureID != XmdldbPackage.DPACKAGE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						XmdldbPackage.DMODEL__DPACKAGES, DModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
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
	@Override
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
