/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdldb.DModel;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>DModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdldb.impl.DModelImpl#getXProject <em>XProject</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DModelImpl#getXModel <em>XModel</em>}</li>
 *   <li>{@link chrome.xmdldb.impl.DModelImpl#getDPackages <em>DPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DModelImpl extends EObjectImpl implements DModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached value of the '{@link #getXProject() <em>XProject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXProject()
	 * @generated
	 * @ordered
	 */
	protected XProject xProject = null;

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
	 * The default value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected static final String XMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected String xModel = XMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDPackages() <em>DPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPackages()
	 * @generated
	 * @ordered
	 */
	protected EList dPackages = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public DModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdldbPackage.eINSTANCE.getDModel();
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
					XmdldbPackage.DMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXModel() {
		return xModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXModel(String newXModel) {
		String oldXModel = xModel;
		xModel = newXModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DMODEL__XMODEL, oldXModel, xModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDPackages() {
		if (dPackages == null) {
			dPackages = new EObjectContainmentWithInverseEList(DPackage.class,
					this, XmdldbPackage.DMODEL__DPACKAGES,
					XmdldbPackage.DPACKAGE__MODEL);
		}
		return dPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getXProject() {
		if (xProject != null && xProject.eIsProxy()) {
			XProject oldXProject = xProject;
			xProject = (XProject) eResolveProxy((InternalEObject) xProject);
			if (xProject != oldXProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XmdldbPackage.DMODEL__XPROJECT, oldXProject,
							xProject));
			}
		}
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject basicGetXProject() {
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXProject(XProject newXProject) {
		XProject oldXProject = xProject;
		xProject = newXProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdldbPackage.DMODEL__XPROJECT, oldXProject, xProject));
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
			case XmdldbPackage.DMODEL__DPACKAGES:
				return ((InternalEList) getDPackages())
						.basicAdd(otherEnd, msgs);
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
			case XmdldbPackage.DMODEL__DPACKAGES:
				return ((InternalEList) getDPackages()).basicRemove(otherEnd,
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdldbPackage.DMODEL__XPROJECT:
			if (resolve)
				return getXProject();
			return basicGetXProject();
		case XmdldbPackage.DMODEL__NAME:
			return getName();
		case XmdldbPackage.DMODEL__XMODEL:
			return getXModel();
		case XmdldbPackage.DMODEL__DPACKAGES:
			return getDPackages();
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
		case XmdldbPackage.DMODEL__XPROJECT:
			setXProject((XProject) newValue);
			return;
		case XmdldbPackage.DMODEL__NAME:
			setName((String) newValue);
			return;
		case XmdldbPackage.DMODEL__XMODEL:
			setXModel((String) newValue);
			return;
		case XmdldbPackage.DMODEL__DPACKAGES:
			getDPackages().clear();
			getDPackages().addAll((Collection) newValue);
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
		case XmdldbPackage.DMODEL__XPROJECT:
			setXProject((XProject) null);
			return;
		case XmdldbPackage.DMODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdldbPackage.DMODEL__XMODEL:
			setXModel(XMODEL_EDEFAULT);
			return;
		case XmdldbPackage.DMODEL__DPACKAGES:
			getDPackages().clear();
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
		case XmdldbPackage.DMODEL__XPROJECT:
			return xProject != null;
		case XmdldbPackage.DMODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdldbPackage.DMODEL__XMODEL:
			return XMODEL_EDEFAULT == null ? xModel != null : !XMODEL_EDEFAULT
					.equals(xModel);
		case XmdldbPackage.DMODEL__DPACKAGES:
			return dPackages != null && !dPackages.isEmpty();
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
		result.append(", xModel: ");
		result.append(xModel);
		result.append(')');
		return result.toString();
	}

} // DModelImpl
