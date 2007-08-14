/**
 * <copyright>
 * </copyright>
 *
 * $Id: XClassImpl.java,v 1.14 2006/03/30 12:42:50 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.impl;

import java.util.ArrayList;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XMethod;
import chrome.xmdl.XPackage;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>XClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link chrome.xmdl.impl.XClassImpl#getName <em>Name</em>}</li>
 * <li>{@link chrome.xmdl.impl.XClassImpl#getClassName <em>Class Name</em>}</li>
 * <li>{@link chrome.xmdl.impl.XClassImpl#getXPackage <em>XPackage</em>}</li>
 * <li>{@link chrome.xmdl.impl.XClassImpl#getSuperTypes <em>Super Types</em>}</li>
 * <li>{@link chrome.xmdl.impl.XClassImpl#getAttributes <em>Attributes</em>}</li>
 * <li>{@link chrome.xmdl.impl.XClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 * 
 * 
 */
public class XClassImpl extends EObjectImpl implements XClass {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

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
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList superTypes = null;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList attributes = null;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods = null;

	/**
	 * The default value of the '{@link #isComparable() <em>Comparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComparable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComparable() <em>Comparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComparable()
	 * @generated
	 * @ordered
	 */
	protected boolean comparable = COMPARABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected XClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlPackage.eINSTANCE.getXClass();
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
					XmdlPackage.XCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public String getClassName() {
		return XTypeHelper.INST.getClassName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setClassName(String newClassName) {
		XTypeHelper.INST.setClassName(this, newClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetClassName() {
		XTypeHelper.INST.unsetClassName(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetClassName() {
		return XTypeHelper.INST.isSetClassName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage getXPackage() {
		if (eContainerFeatureID != XmdlPackage.XCLASS__XPACKAGE)
			return null;
		return (XPackage) eContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectEList(XClass.class, this,
					XmdlPackage.XCLASS__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList(
					XAttribute.class, this, XmdlPackage.XCLASS__ATTRIBUTES,
					XmdlPackage.XATTRIBUTE__XCLASS);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList(XMethod.class,
					this, XmdlPackage.XCLASS__METHODS,
					XmdlPackage.XMETHOD__XCLASS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComparable() {
		return comparable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparable(boolean newComparable) {
		boolean oldComparable = comparable;
		comparable = newComparable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmdlPackage.XCLASS__COMPARABLE, oldComparable, comparable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isPrimitive() {
		return XTypeHelper.INST.isPrimitive(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isBasic() {
		return XTypeHelper.INST.isBasic(this);
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
			case XmdlPackage.XCLASS__XPACKAGE:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						XmdlPackage.XCLASS__XPACKAGE, msgs);
			case XmdlPackage.XCLASS__ATTRIBUTES:
				return ((InternalEList) getAttributes()).basicAdd(otherEnd,
						msgs);
			case XmdlPackage.XCLASS__METHODS:
				return ((InternalEList) getMethods()).basicAdd(otherEnd, msgs);
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
			case XmdlPackage.XCLASS__XPACKAGE:
				return eBasicSetContainer(null, XmdlPackage.XCLASS__XPACKAGE,
						msgs);
			case XmdlPackage.XCLASS__ATTRIBUTES:
				return ((InternalEList) getAttributes()).basicRemove(otherEnd,
						msgs);
			case XmdlPackage.XCLASS__METHODS:
				return ((InternalEList) getMethods()).basicRemove(otherEnd,
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
			case XmdlPackage.XCLASS__XPACKAGE:
				return eContainer.eInverseRemove(this,
						XmdlPackage.XPACKAGE__CLASSES, XPackage.class, msgs);
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
		case XmdlPackage.XCLASS__NAME:
			return getName();
		case XmdlPackage.XCLASS__CLASS_NAME:
			return getClassName();
		case XmdlPackage.XCLASS__XPACKAGE:
			return getXPackage();
		case XmdlPackage.XCLASS__SUPER_TYPES:
			return getSuperTypes();
		case XmdlPackage.XCLASS__ATTRIBUTES:
			return getAttributes();
		case XmdlPackage.XCLASS__METHODS:
			return getMethods();
		case XmdlPackage.XCLASS__COMPARABLE:
			return isComparable() ? Boolean.TRUE : Boolean.FALSE;
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case XmdlPackage.XCLASS__NAME:
			setName((String) newValue);
			return;
		case XmdlPackage.XCLASS__CLASS_NAME:
			setClassName((String) newValue);
			return;
		case XmdlPackage.XCLASS__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection) newValue);
			return;
		case XmdlPackage.XCLASS__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection) newValue);
			return;
		case XmdlPackage.XCLASS__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection) newValue);
			return;
		case XmdlPackage.XCLASS__COMPARABLE:
			setComparable(((Boolean) newValue).booleanValue());
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
		case XmdlPackage.XCLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case XmdlPackage.XCLASS__CLASS_NAME:
			unsetClassName();
			return;
		case XmdlPackage.XCLASS__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		case XmdlPackage.XCLASS__ATTRIBUTES:
			getAttributes().clear();
			return;
		case XmdlPackage.XCLASS__METHODS:
			getMethods().clear();
			return;
		case XmdlPackage.XCLASS__COMPARABLE:
			setComparable(COMPARABLE_EDEFAULT);
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
		case XmdlPackage.XCLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case XmdlPackage.XCLASS__CLASS_NAME:
			return isSetClassName();
		case XmdlPackage.XCLASS__XPACKAGE:
			return getXPackage() != null;
		case XmdlPackage.XCLASS__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		case XmdlPackage.XCLASS__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case XmdlPackage.XCLASS__METHODS:
			return methods != null && !methods.isEmpty();
		case XmdlPackage.XCLASS__COMPARABLE:
			return comparable != COMPARABLE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == XType.class) {
			switch (derivedFeatureID) {
			case XmdlPackage.XCLASS__NAME:
				return XmdlPackage.XTYPE__NAME;
			case XmdlPackage.XCLASS__CLASS_NAME:
				return XmdlPackage.XTYPE__CLASS_NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == XType.class) {
			switch (baseFeatureID) {
			case XmdlPackage.XTYPE__NAME:
				return XmdlPackage.XCLASS__NAME;
			case XmdlPackage.XTYPE__CLASS_NAME:
				return XmdlPackage.XCLASS__CLASS_NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", comparable: ");
		result.append(comparable);
		result.append(')');
		return result.toString();
	}

	public boolean equals(Object obj) {
		if (obj instanceof XType) {
			XType type = (XType) obj;
			return getClassName().equals(type.getClassName());
		}
		return super.equals(obj);
	}

	public int hashCode() {
		String s = getClassName();
		if (s == null)
			return super.hashCode();
		else
			return s.hashCode();
	}

	public int compareTo(Object o) {
		return XTypeHelper.INST.compareTo(this, o);
	}

	public List<XAttribute> getSimpleAttributes() {
		List a = getAttributes();
		List<XAttribute> simples = new ArrayList<XAttribute>();
		if (a == null || a.size() == 0)
			return simples;
		for (Iterator it = a.iterator(); it.hasNext();) {
			XAttribute attrib = (XAttribute) it.next();
			if (!attrib.isReference())
				simples.add(attrib);
		}
		return simples;
	}

} // XClassImpl
