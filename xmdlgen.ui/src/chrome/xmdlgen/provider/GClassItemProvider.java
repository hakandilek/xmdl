/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdlgen.provider;


import chrome.xmdlgen.GClass;
import chrome.xmdlgen.XmdlgenFactory;
import chrome.xmdlgen.XmdlgenPackage;
import chrome.xmdlgen.ui.XmdlgenEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link chrome.xmdlgen.GClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GClassItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
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
	public GClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addXClassPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addGPackagePropertyDescriptor(object);
			addGAttributesPropertyDescriptor(object);
			addPersistentPropertyDescriptor(object);
			addDeleteServiceNamePropertyDescriptor(object);
			addEditServiceNamePropertyDescriptor(object);
			addSaveServiceNamePropertyDescriptor(object);
			addSearchServiceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the XClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_xClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_xClass_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_XClass(),
				 false,
				 null,
				 getString("_UI_BaseModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_name_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the GPackage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_gPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_gPackage_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_GPackage(),
				 true,
				 null,
				 getString("_UI_GenerationModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the GAttributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_gAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_gAttributes_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_GAttributes(),
				 true,
				 null,
				 getString("_UI_GenerationModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_persistent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_persistent_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_Persistent(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PersistancePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_deleteServiceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_deleteServiceName_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_DeleteServiceName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_editServiceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_editServiceName_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_EditServiceName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Save Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaveServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_saveServiceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_saveServiceName_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_SaveServiceName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GClass_searchServiceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GClass_searchServiceName_feature", "_UI_GClass_type"),
				 XmdlgenPackage.eINSTANCE.getGClass_SearchServiceName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XmdlgenPackage.eINSTANCE.getGClass_GAttributes());
		}
		return childrenFeatures;
	}

	/**
	 * This returns GClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/GClass");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((GClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GClass_type") :
			getString("_UI_GClass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GClass.class)) {
			case XmdlgenPackage.GCLASS__NAME:
			case XmdlgenPackage.GCLASS__PERSISTENT:
			case XmdlgenPackage.GCLASS__DELETE_SERVICE_NAME:
			case XmdlgenPackage.GCLASS__EDIT_SERVICE_NAME:
			case XmdlgenPackage.GCLASS__SAVE_SERVICE_NAME:
			case XmdlgenPackage.GCLASS__SEARCH_SERVICE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmdlgenPackage.GCLASS__GATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(XmdlgenPackage.eINSTANCE.getGClass_GAttributes(),
				 XmdlgenFactory.eINSTANCE.createGAttribute()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return XmdlgenEditPlugin.INSTANCE;
	}

}
