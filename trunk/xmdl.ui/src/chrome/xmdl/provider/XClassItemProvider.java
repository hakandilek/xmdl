/**
 * <copyright>
 * </copyright>
 *
 * $Id: XClassItemProvider.java,v 1.8 2006/03/30 12:42:49 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.provider;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XMethod;
import chrome.xmdl.XmdlFactory;
import chrome.xmdl.XmdlPackage;
import chrome.xmdl.XmdlTypes;

import chrome.xmdl.ui.XMDLUIPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link chrome.xmdl.XClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XClassItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "hd";

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XClassItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addNamePropertyDescriptor(object);
            addClassNamePropertyDescriptor(object);
            addComparablePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Class Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClassNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_XType_className_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_XType_className_feature", "_UI_XType_type"),
                XmdlPackage.Literals.XTYPE__CLASS_NAME, false, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Comparable feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addComparablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_XClass_comparable_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_XClass_comparable_feature", "_UI_XClass_type"),
                XmdlPackage.Literals.XCLASS__COMPARABLE, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_XType_name_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_XType_name_feature", "_UI_XType_type"),
                XmdlPackage.Literals.XTYPE__NAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(
            Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(XmdlPackage.Literals.XCLASS__SUPER_TYPES);
            childrenFeatures.add(XmdlPackage.Literals.XCLASS__ATTRIBUTES);
            childrenFeatures.add(XmdlPackage.Literals.XCLASS__METHODS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns XClass.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/XClass"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public String getText(Object object) {
        XClass xClass = (XClass) object;
        String name = xClass.getName();
        return name == null || name.length() == 0 ? getString("_UI_XClass_type")
                : name /*+ " <" + xClass.getClassName() + ">"*/;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(XClass.class)) {
        case XmdlPackage.XCLASS__NAME:
        case XmdlPackage.XCLASS__CLASS_NAME:
        case XmdlPackage.XCLASS__COMPARABLE:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case XmdlPackage.XCLASS__SUPER_TYPES:
        case XmdlPackage.XCLASS__ATTRIBUTES:
        case XmdlPackage.XCLASS__METHODS:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    protected void collectNewChildDescriptors(
            Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        XClass cls = (XClass) object;
        XAttribute att = XmdlFactory.eINSTANCE.createXAttribute();
        int a = cls.getAttributes().size() + 1;
        String name = "attribute" + a;
        while (cls.hasAttibute(name)) {
            name = "attribute" + ++a;
        }
        att.setName(name);
        att.setType(XmdlTypes.JAVA_STRING);
        newChildDescriptors.add(createChildParameter(
                XmdlPackage.Literals.XCLASS__ATTRIBUTES, att));

        XMethod met = XmdlFactory.eINSTANCE.createXMethod();
        int m = cls.getMethods().size() + 1;
        name = "method" + m;
        while (cls.hasMethod(name)) {
            name = "method" + ++m;
        }
        met.setName(name);
        newChildDescriptors.add(createChildParameter(
                XmdlPackage.Literals.XCLASS__METHODS, met));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return XMDLUIPlugin.INSTANCE;
    }

}
