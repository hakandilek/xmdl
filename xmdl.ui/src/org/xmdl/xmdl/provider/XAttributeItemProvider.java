/**
 * <copyright>
 * </copyright>
 *
 * $Id: XAttributeItemProvider.java,v 1.9 2006/03/30 12:31:37 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlPackage;
import org.xmdl.xmdl.ui.XMDLUIPlugin;

/**
 * This is the item provider adapter for a {@link org.xmdl.xmdl.XAttribute} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class XAttributeItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XAttributeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addXClassPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addAssociationTypePropertyDescriptor(object);
			addAssociationBehaviourPropertyDescriptor(object);
			addOppositePropertyDescriptor(object);
			addNavigablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_name_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_name_feature", "_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Length feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_XAttribute_length_feature"), getString(
								"_UI_PropertyDescriptor_description",
								"_UI_XAttribute_length_feature",
								"_UI_XAttribute_type"),
						XmdlPackage.Literals.XATTRIBUTE__LENGTH, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_defaultValue_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_defaultValue_feature",
						"_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__DEFAULT_VALUE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the XClass feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addXClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_XAttribute_xClass_feature"), getString(
								"_UI_PropertyDescriptor_description",
								"_UI_XAttribute_xClass_feature",
								"_UI_XAttribute_type"),
						XmdlPackage.Literals.XATTRIBUTE__XCLASS, false, false,
						false, null, getString("_UI_BasicPropertyCategory"),
						null));
	}

	/**
	 * @generated
	 * @param object
	 */
	protected void addTypePropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_type_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_type_feature", "_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__TYPE, true, false, false,
				null, getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new XAtrributeTypePropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_type_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_type_feature", "_UI_XAttribute_type"),
				XmdlPackage.eINSTANCE.getXAttribute_Type(), true, null,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Association Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addAssociationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new XAtrributeAssociationTypePropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_XAttribute_associationType_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_XAttribute_associationType_feature",
								"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
								.getXAttribute_AssociationType(), true,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Association Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAssociationTypePropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_associationType_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_associationType_feature",
						"_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__ASSOCIATION_TYPE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Association Behaviour feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationBehaviourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_associationBehaviour_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_XAttribute_associationBehaviour_feature",
						"_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__ASSOCIATION_BEHAVIOUR, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new XAtrributeOppositePropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_opposite_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_opposite_feature",
						"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
						.getXAttribute_Opposite(), true, null,
				getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * @generated
	 * @param object
	 */
	protected void addOppositePropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_opposite_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_opposite_feature",
						"_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__OPPOSITE, true, false, false,
				null, getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Navigable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavigablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_navigable_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_navigable_feature",
						"_UI_XAttribute_type"),
				XmdlPackage.Literals.XATTRIBUTE__NAVIGABLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This returns XAttribute.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		XAttribute attrib = (XAttribute) object;
		if (attrib.isReference())
			return overlayImage(object, getResourceLocator().getImage(
					"full/obj16/XAttributeReference"));
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/XAttribute"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 */
	public String getText(Object object) {
		XAttribute attribute = ((XAttribute) object);
		String name = attribute.getName();
		XType type = attribute.getType();
		String typeName = type == null ? null : type.getName();
		String label = typeName + " " + name;
		XAttribute opposite = attribute.getOpposite();
		if (attribute.isReference() && opposite != null) {
			String oppName = opposite.getName();
			String oppClass = opposite.getXClass().getName();
			label += " -> " + oppClass + "." + oppName;
		}
		return label == null || label.length() <= 1 ? getString("_UI_XAttribute_type")
				: label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(XAttribute.class)) {
		case XmdlPackage.XATTRIBUTE__NAME:
		case XmdlPackage.XATTRIBUTE__LENGTH:
		case XmdlPackage.XATTRIBUTE__DEFAULT_VALUE:
		case XmdlPackage.XATTRIBUTE__ASSOCIATION_TYPE:
		case XmdlPackage.XATTRIBUTE__ASSOCIATION_BEHAVIOUR:
		case XmdlPackage.XATTRIBUTE__NAVIGABLE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XMDLUIPlugin.INSTANCE;
	}

}
