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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
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
    protected EList<XClass> superTypes;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<XAttribute> attributes;

    /**
     * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMethods()
     * @generated
     * @ordered
     */
    protected EList<XMethod> methods;

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
    @Override
    protected EClass eStaticClass() {
        return XmdlPackage.Literals.XCLASS;
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
        return (XPackage) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<XClass> getSuperTypes() {
        if (superTypes == null) {
            superTypes = new EObjectEList<XClass>(XClass.class, this,
                    XmdlPackage.XCLASS__SUPER_TYPES);
        }
        return superTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<XAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentWithInverseEList<XAttribute>(
                    XAttribute.class, this, XmdlPackage.XCLASS__ATTRIBUTES,
                    XmdlPackage.XATTRIBUTE__XCLASS);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<XMethod> getMethods() {
        if (methods == null) {
            methods = new EObjectContainmentWithInverseEList<XMethod>(
                    XMethod.class, this, XmdlPackage.XCLASS__METHODS,
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
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
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
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
    @Override
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

    public int compareTo(XType o) {
        return XTypeHelper.INST.compareTo(this, o);
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
        case XmdlPackage.XCLASS__XPACKAGE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return eBasicSetContainer(otherEnd, XmdlPackage.XCLASS__XPACKAGE,
                    msgs);
        case XmdlPackage.XCLASS__ATTRIBUTES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributes())
                    .basicAdd(otherEnd, msgs);
        case XmdlPackage.XCLASS__METHODS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods())
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
        case XmdlPackage.XCLASS__XPACKAGE:
            return eBasicSetContainer(null, XmdlPackage.XCLASS__XPACKAGE, msgs);
        case XmdlPackage.XCLASS__ATTRIBUTES:
            return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd,
                    msgs);
        case XmdlPackage.XCLASS__METHODS:
            return ((InternalEList<?>) getMethods())
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
        case XmdlPackage.XCLASS__XPACKAGE:
            return eInternalContainer().eInverseRemove(this,
                    XmdlPackage.XPACKAGE__CLASSES, XPackage.class, msgs);
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
        case XmdlPackage.XCLASS__NAME:
            setName((String) newValue);
            return;
        case XmdlPackage.XCLASS__CLASS_NAME:
            setClassName((String) newValue);
            return;
        case XmdlPackage.XCLASS__SUPER_TYPES:
            getSuperTypes().clear();
            getSuperTypes().addAll((Collection<? extends XClass>) newValue);
            return;
        case XmdlPackage.XCLASS__ATTRIBUTES:
            getAttributes().clear();
            getAttributes().addAll((Collection<? extends XAttribute>) newValue);
            return;
        case XmdlPackage.XCLASS__METHODS:
            getMethods().clear();
            getMethods().addAll((Collection<? extends XMethod>) newValue);
            return;
        case XmdlPackage.XCLASS__COMPARABLE:
            setComparable(((Boolean) newValue).booleanValue());
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
        return super.eIsSet(featureID);
    }

    public List<XAttribute> getSimpleAttributes() {
        List<XAttribute> a = getAttributes();
        List<XAttribute> simples = new ArrayList<XAttribute>();
        if (a == null || a.size() == 0)
            return simples;
        for (Iterator<XAttribute> it = a.iterator(); it.hasNext();) {
            XAttribute attrib = (XAttribute) it.next();
            if (!attrib.isReference())
                simples.add(attrib);
        }
        return simples;
    }

    @Override
    public boolean hasAttibute(String name) {
        return getAttribute(name) != null;
    }

    private XAttribute getAttribute(String name) {
        for (XAttribute att : getAttributes()) {
            if (name.equals(att.getName()))
                return att;
        }
        return null;
    }

    @Override
    public boolean hasMethod(String name) {
        List<XMethod> mets = getMethods(name);
        return mets != null && mets.size() > 0;
    }

    private List<XMethod> getMethods(String name) {
        List<XMethod> list = new ArrayList<XMethod>();
        for (XMethod met : getMethods()) {
            if (name.equals(met.getName()))
                list.add(met);
        }
        return list;
    }

} // XClassImpl
