/**
 * <copyright>
 * </copyright>
 *
 * $Id: XAttributeImpl.java,v 1.17 2006/03/06 13:59:49 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import chrome.xmdl.XAssociationBehaviour;
import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XType;
import chrome.xmdl.XVisitor;
import chrome.xmdl.XmdlPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>XAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getXClass <em>XClass</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getAssociationBehaviour <em>Association Behaviour</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XAttributeImpl#isNavigable <em>Navigable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XAttributeImpl extends EObjectImpl implements XAttribute {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = 15;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected int length = LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final Object DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected Object defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected XType type;

    /**
     * The default value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssociationType()
     * @generated
     * @ordered
     */
    protected static final XAssociationType ASSOCIATION_TYPE_EDEFAULT = XAssociationType.ONE_TO_ONE_LITERAL;

    /**
     * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssociationType()
     * @generated
     * @ordered
     */
    protected XAssociationType associationType = ASSOCIATION_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getAssociationBehaviour() <em>Association Behaviour</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssociationBehaviour()
     * @generated
     * @ordered
     */
    protected static final XAssociationBehaviour ASSOCIATION_BEHAVIOUR_EDEFAULT = XAssociationBehaviour.AGGREGATION_LITERAL;

    /**
     * The cached value of the '{@link #getAssociationBehaviour() <em>Association Behaviour</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssociationBehaviour()
     * @generated
     * @ordered
     */
    protected XAssociationBehaviour associationBehaviour = ASSOCIATION_BEHAVIOUR_EDEFAULT;

    /**
     * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOpposite()
     * @generated
     * @ordered
     */
    protected XAttribute opposite;

    /**
     * The default value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isNavigable()
     * @generated
     * @ordered
     */
    protected static final boolean NAVIGABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isNavigable()
     * @generated
     * @ordered
     */
    protected boolean navigable = NAVIGABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XmdlPackage.Literals.XATTRIBUTE;
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
                    XmdlPackage.XATTRIBUTE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(Object newDefaultValue) {
        Object oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__DEFAULT_VALUE, oldDefaultValue,
                    defaultValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XClass getXClass() {
        if (eContainerFeatureID != XmdlPackage.XATTRIBUTE__XCLASS)
            return null;
        return (XClass) eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXClass(XClass newXClass,
            NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newXClass,
                XmdlPackage.XATTRIBUTE__XCLASS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setXClass(XClass newXClass) {
        if (newXClass != eInternalContainer()
                || (eContainerFeatureID != XmdlPackage.XATTRIBUTE__XCLASS && newXClass != null)) {
            if (EcoreUtil.isAncestor(this, newXClass))
                throw new IllegalArgumentException(
                        "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newXClass != null)
                msgs = ((InternalEObject) newXClass).eInverseAdd(this,
                        XmdlPackage.XCLASS__ATTRIBUTES, XClass.class, msgs);
            msgs = basicSetXClass(newXClass, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__XCLASS, newXClass, newXClass));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject) type;
            type = (XType) eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            XmdlPackage.XATTRIBUTE__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType(XType newType) {
        XType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XAssociationType getAssociationType() {
        return associationType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAssociationType(XAssociationType newAssociationType) {
        XAssociationType oldAssociationType = associationType;
        associationType = newAssociationType == null ? ASSOCIATION_TYPE_EDEFAULT
                : newAssociationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__ASSOCIATION_TYPE,
                    oldAssociationType, associationType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XAssociationBehaviour getAssociationBehaviour() {
        return associationBehaviour;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAssociationBehaviour(
            XAssociationBehaviour newAssociationBehaviour) {
        XAssociationBehaviour oldAssociationBehaviour = associationBehaviour;
        associationBehaviour = newAssociationBehaviour == null ? ASSOCIATION_BEHAVIOUR_EDEFAULT
                : newAssociationBehaviour;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__ASSOCIATION_BEHAVIOUR,
                    oldAssociationBehaviour, associationBehaviour));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XAttribute getOpposite() {
        if (opposite != null && opposite.eIsProxy()) {
            InternalEObject oldOpposite = (InternalEObject) opposite;
            opposite = (XAttribute) eResolveProxy(oldOpposite);
            if (opposite != oldOpposite) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            XmdlPackage.XATTRIBUTE__OPPOSITE, oldOpposite,
                            opposite));
            }
        }
        return opposite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XAttribute basicGetOpposite() {
        return opposite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOpposite(XAttribute newOpposite) {
        XAttribute oldOpposite = opposite;
        opposite = newOpposite;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__OPPOSITE, oldOpposite, opposite));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isNavigable() {
        return navigable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNavigable(boolean newNavigable) {
        boolean oldNavigable = navigable;
        navigable = newNavigable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XATTRIBUTE__NAVIGABLE, oldNavigable, navigable));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public boolean isReference() {
        XType type = getType();
        return type != null && !type.isBasic()
                && !(type instanceof XEnumeration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean accept(XVisitor visitor) {
        final boolean result = visitor.visit(this);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
        switch (featureID) {
        case XmdlPackage.XATTRIBUTE__XCLASS:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetXClass((XClass) otherEnd, msgs);
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
        case XmdlPackage.XATTRIBUTE__XCLASS:
            return basicSetXClass(null, msgs);
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
        case XmdlPackage.XATTRIBUTE__XCLASS:
            return eInternalContainer().eInverseRemove(this,
                    XmdlPackage.XCLASS__ATTRIBUTES, XClass.class, msgs);
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
        case XmdlPackage.XATTRIBUTE__NAME:
            return getName();
        case XmdlPackage.XATTRIBUTE__LENGTH:
            return new Integer(getLength());
        case XmdlPackage.XATTRIBUTE__DEFAULT_VALUE:
            return getDefaultValue();
        case XmdlPackage.XATTRIBUTE__XCLASS:
            return getXClass();
        case XmdlPackage.XATTRIBUTE__TYPE:
            if (resolve)
                return getType();
            return basicGetType();
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_TYPE:
            return getAssociationType();
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_BEHAVIOUR:
            return getAssociationBehaviour();
        case XmdlPackage.XATTRIBUTE__OPPOSITE:
            if (resolve)
                return getOpposite();
            return basicGetOpposite();
        case XmdlPackage.XATTRIBUTE__NAVIGABLE:
            return isNavigable() ? Boolean.TRUE : Boolean.FALSE;
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case XmdlPackage.XATTRIBUTE__NAME:
            setName((String) newValue);
            return;
        case XmdlPackage.XATTRIBUTE__LENGTH:
            setLength(((Integer) newValue).intValue());
            return;
        case XmdlPackage.XATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue(newValue);
            return;
        case XmdlPackage.XATTRIBUTE__XCLASS:
            setXClass((XClass) newValue);
            return;
        case XmdlPackage.XATTRIBUTE__TYPE:
            setType((XType) newValue);
            return;
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_TYPE:
            setAssociationType((XAssociationType) newValue);
            return;
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_BEHAVIOUR:
            setAssociationBehaviour((XAssociationBehaviour) newValue);
            return;
        case XmdlPackage.XATTRIBUTE__OPPOSITE:
            setOpposite((XAttribute) newValue);
            return;
        case XmdlPackage.XATTRIBUTE__NAVIGABLE:
            setNavigable(((Boolean) newValue).booleanValue());
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
        case XmdlPackage.XATTRIBUTE__NAME:
            setName(NAME_EDEFAULT);
            return;
        case XmdlPackage.XATTRIBUTE__LENGTH:
            setLength(LENGTH_EDEFAULT);
            return;
        case XmdlPackage.XATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue(DEFAULT_VALUE_EDEFAULT);
            return;
        case XmdlPackage.XATTRIBUTE__XCLASS:
            setXClass((XClass) null);
            return;
        case XmdlPackage.XATTRIBUTE__TYPE:
            setType((XType) null);
            return;
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_TYPE:
            setAssociationType(ASSOCIATION_TYPE_EDEFAULT);
            return;
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_BEHAVIOUR:
            setAssociationBehaviour(ASSOCIATION_BEHAVIOUR_EDEFAULT);
            return;
        case XmdlPackage.XATTRIBUTE__OPPOSITE:
            setOpposite((XAttribute) null);
            return;
        case XmdlPackage.XATTRIBUTE__NAVIGABLE:
            setNavigable(NAVIGABLE_EDEFAULT);
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
        case XmdlPackage.XATTRIBUTE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        case XmdlPackage.XATTRIBUTE__LENGTH:
            return length != LENGTH_EDEFAULT;
        case XmdlPackage.XATTRIBUTE__DEFAULT_VALUE:
            return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null
                    : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
        case XmdlPackage.XATTRIBUTE__XCLASS:
            return getXClass() != null;
        case XmdlPackage.XATTRIBUTE__TYPE:
            return type != null;
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_TYPE:
            return associationType != ASSOCIATION_TYPE_EDEFAULT;
        case XmdlPackage.XATTRIBUTE__ASSOCIATION_BEHAVIOUR:
            return associationBehaviour != ASSOCIATION_BEHAVIOUR_EDEFAULT;
        case XmdlPackage.XATTRIBUTE__OPPOSITE:
            return opposite != null;
        case XmdlPackage.XATTRIBUTE__NAVIGABLE:
            return navigable != NAVIGABLE_EDEFAULT;
        }
        return super.eIsSet(featureID);
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
        result.append(", length: ");
        result.append(length);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", associationType: ");
        result.append(associationType);
        result.append(", associationBehaviour: ");
        result.append(associationBehaviour);
        result.append(", navigable: ");
        result.append(navigable);
        result.append(')');
        return result.toString();
    }

    public int compareTo(Object o) {
        if (o instanceof XAttribute) {
            XAttribute other = (XAttribute) o;
            String name = getName();
            if (name != null) {
                name.compareTo(other.getName());
            }
        }
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof XAttribute) {
            XAttribute other = (XAttribute) obj;
            XClass class1 = getXClass();
            XClass class2 = other.getXClass();
            String name1 = getName();
            String name2 = other.getName();

            if (class1 != null && class2 != null && name1 != null
                    && name2 != null) {
                return class1.equals(class2) && name1.equals(name2);
            }
        }

        return super.equals(obj);
    }

} // XAttributeImpl
