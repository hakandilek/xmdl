/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb.provider;

import chrome.xmdl.XmdlFactory;
import chrome.xmdl.XmdlPackage;
import chrome.xmdldb.DModel;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdldb.XmdldbPackage;

import chrome.xmdldb.ui.XmdldbEditPlugin;

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
 * This is the item provider adapter for a {@link chrome.xmdldb.DModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DModelItemProvider extends ItemProviderAdapter implements
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
	public DModelItemProvider(AdapterFactory adapterFactory) {
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

			addXProjectPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addXModelPropertyDescriptor(object);
			addDPackagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_DModel_name_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DModel_name_feature", "_UI_DModel_type"),
				XmdldbPackage.eINSTANCE.getDModel_Name(), true,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_DBModelPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the XModel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DModel_xModel_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DModel_xModel_feature", "_UI_DModel_type"),
				XmdldbPackage.eINSTANCE.getDModel_XModel(), true,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BaseModelPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the DPackages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DModel_dPackages_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DModel_dPackages_feature", "_UI_DModel_type"),
				XmdldbPackage.eINSTANCE.getDModel_DPackages(), true, null,
				getString("_UI_DBModelPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the XProject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DModel_xProject_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DModel_xProject_feature", "_UI_DModel_type"),
				XmdldbPackage.eINSTANCE.getDModel_XProject(), false, null,
				getString("_UI_BaseModelPropertyCategory"), null));
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
			childrenFeatures.add(XmdldbPackage.eINSTANCE.getDModel_DPackages());
		}
		return childrenFeatures;
	}

	/**
	 * This returns DModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/DModel");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		String label = ((DModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DModel_type")
				: getString("_UI_DModel_type") + " " + label;
	}

	public String getText(Object object) {
		String label = ((DModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DModel_type")
				: label;
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

		switch (notification.getFeatureID(DModel.class)) {
		case XmdldbPackage.DMODEL__NAME:
		case XmdldbPackage.DMODEL__XMODEL:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case XmdldbPackage.DMODEL__DPACKAGES:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(XmdldbPackage.eINSTANCE
				.getDModel_DPackages(), XmdldbFactory.eINSTANCE
				.createDPackage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return XmdldbEditPlugin.INSTANCE;
	}

}
