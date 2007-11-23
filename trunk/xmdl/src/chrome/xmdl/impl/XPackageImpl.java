/**
 * <copyright>
 * </copyright>
 *
 * $Id: XPackageImpl.java,v 1.9 2006/02/10 09:32:58 tr001\tr1d2643 Exp $
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import chrome.xmdl.XBase;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.XVisitor;
import chrome.xmdl.XmdlPackage;

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
    protected EList<XClass> classes;

    /**
     * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerations()
     * @generated
     * @ordered
     */
    protected EList<XEnumeration> enumerations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XmdlPackage.Literals.XPACKAGE;
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
        return (XProject) eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProject(XProject newProject,
            NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newProject,
                XmdlPackage.XPACKAGE__PROJECT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProject(XProject newProject) {
        if (newProject != eInternalContainer()
                || (eContainerFeatureID != XmdlPackage.XPACKAGE__PROJECT && newProject != null)) {
            if (EcoreUtil.isAncestor(this, newProject))
                throw new IllegalArgumentException(
                        "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newProject != null)
                msgs = ((InternalEObject) newProject).eInverseAdd(this,
                        XmdlPackage.XPROJECT__PACKAGES, XProject.class, msgs);
            msgs = basicSetProject(newProject, msgs);
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
    public EList<XClass> getClasses() {
        if (classes == null) {
            classes = new EObjectContainmentWithInverseEList<XClass>(
                    XClass.class, this, XmdlPackage.XPACKAGE__CLASSES,
                    XmdlPackage.XCLASS__XPACKAGE);
        }
        return classes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XEnumeration> getEnumerations() {
        if (enumerations == null) {
            enumerations = new EObjectContainmentWithInverseEList<XEnumeration>(
                    XEnumeration.class, this,
                    XmdlPackage.XPACKAGE__ENUMERATIONS,
                    XmdlPackage.XENUMERATION__XPACKAGE);
        }
        return enumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean accept(XVisitor visitor) {
        if (visitor.visitEnter(this)) {
            final List<XClass> children1 = getClasses();
            for (XBase child : children1) {
                if (!child.accept(visitor))
                    break;
            }
            final List<XEnumeration> children2 = getEnumerations();
            for (XBase child : children2) {
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
        case XmdlPackage.XPACKAGE__PROJECT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetProject((XProject) otherEnd, msgs);
        case XmdlPackage.XPACKAGE__CLASSES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getClasses())
                    .basicAdd(otherEnd, msgs);
        case XmdlPackage.XPACKAGE__ENUMERATIONS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getEnumerations())
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
        case XmdlPackage.XPACKAGE__PROJECT:
            return basicSetProject(null, msgs);
        case XmdlPackage.XPACKAGE__CLASSES:
            return ((InternalEList<?>) getClasses())
                    .basicRemove(otherEnd, msgs);
        case XmdlPackage.XPACKAGE__ENUMERATIONS:
            return ((InternalEList<?>) getEnumerations()).basicRemove(otherEnd,
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
        case XmdlPackage.XPACKAGE__PROJECT:
            return eInternalContainer().eInverseRemove(this,
                    XmdlPackage.XPROJECT__PACKAGES, XProject.class, msgs);
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
        case XmdlPackage.XPACKAGE__NAME:
            return getName();
        case XmdlPackage.XPACKAGE__PROJECT:
            return getProject();
        case XmdlPackage.XPACKAGE__CLASSES:
            return getClasses();
        case XmdlPackage.XPACKAGE__ENUMERATIONS:
            return getEnumerations();
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
        case XmdlPackage.XPACKAGE__NAME:
            setName((String) newValue);
            return;
        case XmdlPackage.XPACKAGE__PROJECT:
            setProject((XProject) newValue);
            return;
        case XmdlPackage.XPACKAGE__CLASSES:
            getClasses().clear();
            getClasses().addAll((Collection<? extends XClass>) newValue);
            return;
        case XmdlPackage.XPACKAGE__ENUMERATIONS:
            getEnumerations().clear();
            getEnumerations().addAll(
                    (Collection<? extends XEnumeration>) newValue);
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
        result.append(')');
        return result.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof XPackage) {
            XPackage other = (XPackage) obj;
            String name1 = getName();
            String name2 = other.getName();
            if (name1 == null)
                return name2 == null;
            if (name2 == null)
                return name1 == null;
            return name1.equals(name2);
        }
        return super.equals(obj);
    }

    @Override
    public boolean hasClass(String name) {
        return getClass(name) != null;
    }

    private XClass getClass(String name) {
        for (XClass cls : getClasses()) {
            if (name.equals(cls.getName()))
                return cls;
        }
        return null;
    }

    @Override
    public boolean hasEnumeration(String name) {
        return getEnumeration(name) != null;
    }

    private XEnumeration getEnumeration(String name) {
        for (XEnumeration enm : getEnumerations()) {
            if (name.equals(enm.getName()))
                return enm;
        }
        return null;
    }

} //XPackageImpl
