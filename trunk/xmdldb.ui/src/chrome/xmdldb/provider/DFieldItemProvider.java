/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.provider;

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

import chrome.xmdl.XAttribute;
import chrome.xmdl.XType;
import chrome.xmdldb.DField;
import chrome.xmdldb.XmdldbPackage;
import chrome.xmdldb.ui.XmdldbEditPlugin;

/**
 * This is the item provider adapter for a {@link chrome.xmdldb.DField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DFieldItemProvider extends ItemProviderAdapter implements
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
	public DFieldItemProvider(AdapterFactory adapterFactory) {
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

			addPersistentPropertyDescriptor(object);
			addXAttributePropertyDescriptor(object);
			addDTablePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addIndicesPropertyDescriptor(object);
			addForeignPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Persistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Persistable_persistent_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Persistable_persistent_feature",
						"_UI_Persistable_type"),
				XmdldbPackage.Literals.PERSISTABLE__PERSISTENT, true, false,
				false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the XAttribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DField_xAttribute_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DField_xAttribute_feature", "_UI_DField_type"),
				XmdldbPackage.Literals.DFIELD__XATTRIBUTE, false, false, false,
				null, getString("_UI_BaseModelPropertyCategory"), null));
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
				getString("_UI_DField_name_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DField_name_feature", "_UI_DField_type"),
				XmdldbPackage.Literals.DFIELD__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_DBModelPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DField_length_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DField_length_feature", "_UI_DField_type"),
				XmdldbPackage.Literals.DFIELD__LENGTH, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				getString("_UI_DBModelPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Indices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DField_indices_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DField_indices_feature", "_UI_DField_type"),
				XmdldbPackage.Literals.DFIELD__INDICES, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				getString("_UI_DBModelPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Foreign feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForeignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DField_foreign_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DField_foreign_feature", "_UI_DField_type"),
				XmdldbPackage.Literals.DFIELD__FOREIGN, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the DTable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DField_dTable_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DField_dTable_feature", "_UI_DField_type"),
				XmdldbPackage.Literals.DFIELD__DTABLE, false, false, false,
				null, getString("_UI_DBModelPropertyCategory"), null));
	}

	/**
	 * This returns DField.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DField"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		String label = ((DField) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DField_type")
				: getString("_UI_DField_type") + " " + label;
	}

	public String getText(Object object) {
		DField field = ((DField) object);
		String name = field.getName();
		XAttribute attribute = field.getXAttribute();
		XType type = attribute.getType();
		String typeName = type == null ? null : type.getName();
		String label = name + " : " + typeName;
		return label == null || label.length() <= 3 ? getString("_UI_DField_type")
				: label;
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

		switch (notification.getFeatureID(DField.class)) {
		case XmdldbPackage.DFIELD__PERSISTENT:
		case XmdldbPackage.DFIELD__NAME:
		case XmdldbPackage.DFIELD__LENGTH:
		case XmdldbPackage.DFIELD__INDICES:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XmdldbEditPlugin.INSTANCE;
	}

}
