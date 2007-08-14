/**
 * <copyright>
 * </copyright>
 *
 * $Id: XPackageImpl.java,v 1.9 2006/02/10 09:32:58 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.impl;

import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.XmdlPackage;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdl.impl.XPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XPackageImpl#getProject <em>Project</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XPackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XPackageImpl#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XPackageImpl extends EObjectImpl implements XPackage {
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
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList classes = null;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList enumerations = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlPackage.eINSTANCE.getXPackage();
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
					XmdlPackage.XPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getProject() {
		if (eContainerFeatureID != XmdlPackage.XPACKAGE__PROJECT)
			return null;
		return (XProject) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(XProject newProject) {
		if (newProject != eContainer
				|| (eContainerFeatureID != XmdlPackage.XPACKAGE__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject) newProject).eInverseAdd(this,
						XmdlPackage.XPROJECT__PACKAGES, XProject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProject,
					XmdlPackage.XPACKAGE__PROJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XPACKAGE__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList(XClass.class,
					this, XmdlPackage.XPACKAGE__CLASSES,
					XmdlPackage.XCLASS__XPACKAGE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentWithInverseEList(
					XEnumeration.class, this,
					XmdlPackage.XPACKAGE__ENUMERATIONS,
					XmdlPackage.XENUMERATION__XPACKAGE);
		}
		return enumerations;
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
			case XmdlPackage.XPACKAGE__PROJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdlPackage.XPACKAGE__PROJECT, msgs);
			case XmdlPackage.XPACKAGE__CLASSES:
				return ((InternalEList) getClasses()).basicAdd(otherEnd, msgs);
			case XmdlPackage.XPACKAGE__ENUMERATIONS:
				return ((InternalEList) getEnumerations()).basicAdd(otherEnd,
						msgs);
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
			case XmdlPackage.XPACKAGE__PROJECT:
				return eBasicSetContainer(null, XmdlPackage.XPACKAGE__PROJECT,
						msgs);
			case XmdlPackage.XPACKAGE__CLASSES:
				return ((InternalEList) getClasses()).basicRemove(otherEnd,
						msgs);
			case XmdlPackage.XPACKAGE__ENUMERATIONS:
				return ((InternalEList) getEnumerations()).basicRemove(
						otherEnd, msgs);
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
			case XmdlPackage.XPACKAGE__PROJECT:
				return eContainer.eInverseRemove(this,
						XmdlPackage.XPROJECT__PACKAGES, XProject.class, msgs);
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
		case XmdlPackage.XPACKAGE__NAME:
			return getName();
		case XmdlPackage.XPACKAGE__PROJECT:
			return getProject();
		case XmdlPackage.XPACKAGE__CLASSES:
			return getClasses();
		case XmdlPackage.XPACKAGE__ENUMERATIONS:
			return getEnumerations();
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
		case XmdlPackage.XPACKAGE__NAME:
			setName((String) newValue);
			return;
		case XmdlPackage.XPACKAGE__PROJECT:
			setProject((XProject) newValue);
			return;
		case XmdlPackage.XPACKAGE__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection) newValue);
			return;
		case XmdlPackage.XPACKAGE__ENUMERATIONS:
			getEnumerations().clear();
			getEnumerations().addAll((Collection) newValue);
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
		case XmdlPackage.XPACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdlPackage.XPACKAGE__PROJECT:
			setProject((XProject) null);
			return;
		case XmdlPackage.XPACKAGE__CLASSES:
			getClasses().clear();
			return;
		case XmdlPackage.XPACKAGE__ENUMERATIONS:
			getEnumerations().clear();
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
		case XmdlPackage.XPACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdlPackage.XPACKAGE__PROJECT:
			return getProject() != null;
		case XmdlPackage.XPACKAGE__CLASSES:
			return classes != null && !classes.isEmpty();
		case XmdlPackage.XPACKAGE__ENUMERATIONS:
			return enumerations != null && !enumerations.isEmpty();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof XPackage) {
			XPackage other = (XPackage) obj;
			String name1 = getName();
			String name2 = other.getName();
			if (name1 == null) return name2 == null;
			if (name2 == null) return name1 == null;
			return name1.equals(name2);
		}
		return super.equals(obj);
	}

} //XPackageImpl
