/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import chrome.xmdldb.DField;
import chrome.xmdldb.DIndex;
import chrome.xmdldb.DTable;
import chrome.xmdldb.XmdldbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DIndex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdldb.impl.DIndexImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DIndexImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DIndexImpl#getDTable <em>DTable</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DIndexImpl#getDfields <em>Dfields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DIndexImpl extends EObjectImpl implements DIndex {
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
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDTable() <em>DTable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTable()
	 * @generated
	 * @ordered
	 */
	protected DTable dTable;

	/**
	 * The cached value of the '{@link #getDfields() <em>Dfields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDfields()
	 * @generated
	 * @ordered
	 */
	protected EList<DField> dfields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public DIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdldbPackage.Literals.DINDEX;
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
					XmdldbPackage.DINDEX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DINDEX__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTable getDTable() {
		if (dTable != null && dTable.eIsProxy()) {
			InternalEObject oldDTable = (InternalEObject) dTable;
			dTable = (DTable) eResolveProxy(oldDTable);
			if (dTable != oldDTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DINDEX__DTABLE, oldDTable, dTable));
			}
		}
		return dTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTable basicGetDTable() {
		return dTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTable(DTable newDTable) {
		DTable oldDTable = dTable;
		dTable = newDTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DINDEX__DTABLE, oldDTable, dTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DField> getDfields() {
		if (dfields == null) {
			dfields = new EObjectResolvingEList<DField>(DField.class, this,
					XmdldbPackage.DINDEX__DFIELDS);
		}
		return dfields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmdldbPackage.DINDEX__NAME:
			return getName();
		case XmdldbPackage.DINDEX__UNIQUE:
			return isUnique() ? Boolean.TRUE : Boolean.FALSE;
		case XmdldbPackage.DINDEX__DTABLE:
			if (resolve)
				return getDTable();
			return basicGetDTable();
		case XmdldbPackage.DINDEX__DFIELDS:
			return getDfields();
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
		case XmdldbPackage.DINDEX__NAME:
			setName((String) newValue);
			return;
		case XmdldbPackage.DINDEX__UNIQUE:
			setUnique(((Boolean) newValue).booleanValue());
			return;
		case XmdldbPackage.DINDEX__DTABLE:
			setDTable((DTable) newValue);
			return;
		case XmdldbPackage.DINDEX__DFIELDS:
			getDfields().clear();
			getDfields().addAll((Collection<? extends DField>) newValue);
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
		case XmdldbPackage.DINDEX__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdldbPackage.DINDEX__UNIQUE:
			setUnique(UNIQUE_EDEFAULT);
			return;
		case XmdldbPackage.DINDEX__DTABLE:
			setDTable((DTable) null);
			return;
		case XmdldbPackage.DINDEX__DFIELDS:
			getDfields().clear();
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
		case XmdldbPackage.DINDEX__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdldbPackage.DINDEX__UNIQUE:
			return unique != UNIQUE_EDEFAULT;
		case XmdldbPackage.DINDEX__DTABLE:
			return dTable != null;
		case XmdldbPackage.DINDEX__DFIELDS:
			return dfields != null && !dfields.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //DIndexImpl
