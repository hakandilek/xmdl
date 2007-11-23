/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import chrome.xmdl.XBase;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XEnumerationLiteral;
import chrome.xmdl.XPackage;
import chrome.xmdl.XType;
import chrome.xmdl.XVisitor;
import chrome.xmdl.XmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XEnumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chrome.xmdl.impl.XEnumerationImpl#getName <em>Name</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XEnumerationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XEnumerationImpl#getXPackage <em>XPackage</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XEnumerationImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link chrome.xmdl.impl.XEnumerationImpl#getDefaultLiteral <em>Default Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XEnumerationImpl extends EObjectImpl implements XEnumeration {
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
     * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassName()
     * @generated
     * @ordered
     */
    protected static final String CLASS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLiterals()
     * @generated
     * @ordered
     */
    protected EList<XEnumerationLiteral> literals;

    /**
     * The cached value of the '{@link #getDefaultLiteral() <em>Default Literal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultLiteral()
     * @generated
     * @ordered
     */
    protected XEnumerationLiteral defaultLiteral;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XEnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XmdlPackage.Literals.XENUMERATION;
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
                    XmdlPackage.XENUMERATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
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
        if (eContainerFeatureID != XmdlPackage.XENUMERATION__XPACKAGE)
            return null;
        return (XPackage) eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XEnumerationLiteral> getLiterals() {
        if (literals == null) {
            literals = new EObjectContainmentWithInverseEList<XEnumerationLiteral>(
                    XEnumerationLiteral.class, this,
                    XmdlPackage.XENUMERATION__LITERALS,
                    XmdlPackage.XENUMERATION_LITERAL__ENUMERATION);
        }
        return literals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XEnumerationLiteral getDefaultLiteral() {
        if (defaultLiteral != null && defaultLiteral.eIsProxy()) {
            InternalEObject oldDefaultLiteral = (InternalEObject) defaultLiteral;
            defaultLiteral = (XEnumerationLiteral) eResolveProxy(oldDefaultLiteral);
            if (defaultLiteral != oldDefaultLiteral) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            XmdlPackage.XENUMERATION__DEFAULT_LITERAL,
                            oldDefaultLiteral, defaultLiteral));
            }
        }
        return defaultLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XEnumerationLiteral basicGetDefaultLiteral() {
        return defaultLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultLiteral(XEnumerationLiteral newDefaultLiteral) {
        XEnumerationLiteral oldDefaultLiteral = defaultLiteral;
        defaultLiteral = newDefaultLiteral;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    XmdlPackage.XENUMERATION__DEFAULT_LITERAL,
                    oldDefaultLiteral, defaultLiteral));
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
     * @generated NOT
     */
    public int compareTo(XType o) {
        return XTypeHelper.INST.compareTo(this, o);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isComparable() {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean accept(XVisitor visitor) {
        if (visitor.visitEnter(this)) {
            final List<XEnumerationLiteral> children1 = getLiterals();
            for (XBase child : children1) {
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
        case XmdlPackage.XENUMERATION__XPACKAGE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return eBasicSetContainer(otherEnd,
                    XmdlPackage.XENUMERATION__XPACKAGE, msgs);
        case XmdlPackage.XENUMERATION__LITERALS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLiterals())
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
        case XmdlPackage.XENUMERATION__XPACKAGE:
            return eBasicSetContainer(null, XmdlPackage.XENUMERATION__XPACKAGE,
                    msgs);
        case XmdlPackage.XENUMERATION__LITERALS:
            return ((InternalEList<?>) getLiterals()).basicRemove(otherEnd,
                    msgs);
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
        case XmdlPackage.XENUMERATION__XPACKAGE:
            return eInternalContainer().eInverseRemove(this,
                    XmdlPackage.XPACKAGE__ENUMERATIONS, XPackage.class, msgs);
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
        case XmdlPackage.XENUMERATION__NAME:
            return getName();
        case XmdlPackage.XENUMERATION__CLASS_NAME:
            return getClassName();
        case XmdlPackage.XENUMERATION__XPACKAGE:
            return getXPackage();
        case XmdlPackage.XENUMERATION__LITERALS:
            return getLiterals();
        case XmdlPackage.XENUMERATION__DEFAULT_LITERAL:
            if (resolve)
                return getDefaultLiteral();
            return basicGetDefaultLiteral();
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
        case XmdlPackage.XENUMERATION__NAME:
            setName((String) newValue);
            return;
        case XmdlPackage.XENUMERATION__CLASS_NAME:
            setClassName((String) newValue);
            return;
        case XmdlPackage.XENUMERATION__LITERALS:
            getLiterals().clear();
            getLiterals().addAll(
                    (Collection<? extends XEnumerationLiteral>) newValue);
            return;
        case XmdlPackage.XENUMERATION__DEFAULT_LITERAL:
            setDefaultLiteral((XEnumerationLiteral) newValue);
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
        case XmdlPackage.XENUMERATION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case XmdlPackage.XENUMERATION__CLASS_NAME:
            unsetClassName();
            return;
        case XmdlPackage.XENUMERATION__LITERALS:
            getLiterals().clear();
            return;
        case XmdlPackage.XENUMERATION__DEFAULT_LITERAL:
            setDefaultLiteral((XEnumerationLiteral) null);
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
        case XmdlPackage.XENUMERATION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        case XmdlPackage.XENUMERATION__CLASS_NAME:
            return isSetClassName();
        case XmdlPackage.XENUMERATION__XPACKAGE:
            return getXPackage() != null;
        case XmdlPackage.XENUMERATION__LITERALS:
            return literals != null && !literals.isEmpty();
        case XmdlPackage.XENUMERATION__DEFAULT_LITERAL:
            return defaultLiteral != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == XType.class) {
            switch (derivedFeatureID) {
            case XmdlPackage.XENUMERATION__NAME:
                return XmdlPackage.XTYPE__NAME;
            case XmdlPackage.XENUMERATION__CLASS_NAME:
                return XmdlPackage.XTYPE__CLASS_NAME;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == XType.class) {
            switch (baseFeatureID) {
            case XmdlPackage.XTYPE__NAME:
                return XmdlPackage.XENUMERATION__NAME;
            case XmdlPackage.XTYPE__CLASS_NAME:
                return XmdlPackage.XENUMERATION__CLASS_NAME;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

    @Override
    public boolean hasLiteral(String name) {
        return getLiteral(name) != null;
    }

    private XEnumerationLiteral getLiteral(String name) {
        for (XEnumerationLiteral lit : getLiterals()) {
            if (name.equals(lit.getName()))
                return lit;
        }
        return null;
    }

} //XEnumerationImpl
