/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdl.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XEnumerationLiteral;
import org.xmdl.xmdl.XmdlFactory;
import org.xmdl.xmdl.XmdlPackage;
import org.xmdl.xmdl.ui.XMDLUIPlugin;

/**
 * This is the item provider adapter for a {@link org.xmdl.xmdl.XEnumeration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XEnumerationItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";
	private Map<String, List<IItemPropertyDescriptor>> propertyDescriptors;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumerationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IItemPropertyDescriptor> getPropertyDescriptorsGen(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addClassNamePropertyDescriptor(object);
			addDefaultLiteralPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (propertyDescriptors == null) {
			propertyDescriptors = new HashMap<String, List<IItemPropertyDescriptor>>();
		}

		XEnumeration xenum = (XEnumeration) object;
		String key = xenum.getClassName();
		List<IItemPropertyDescriptor> list = propertyDescriptors.get(key);
		if (list == null) {
			list = new ArrayList<IItemPropertyDescriptor>();
			list.add(getNamePropertyDescriptor(xenum));
			list.add(getClassNamePropertyDescriptor(xenum));
			list.add(getDefaultLiteralPropertyDescriptor(xenum));
			propertyDescriptors.put(key, list);
		}

		return list;
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

	protected ItemPropertyDescriptor getNamePropertyDescriptor(Object object) {
		return createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XType_name_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XType_name_feature", "_UI_XType_type"),
				XmdlPackage.eINSTANCE.getXType_Name(), true,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null);
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

	protected ItemPropertyDescriptor getClassNamePropertyDescriptor(
			Object object) {
		return createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XType_className_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XType_className_feature", "_UI_XType_type"),
				XmdlPackage.eINSTANCE.getXType_ClassName(), false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null);
	}

	/**
	 * This adds a property descriptor for the Default Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDefaultLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new XEnumerationLiteralPropertyDescriptor(
				((XEnumeration) object),
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XEnumeration_defaultLiteral_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_XEnumeration_defaultLiteral_feature",
						"_UI_XEnumeration_type"), XmdlPackage.eINSTANCE
						.getXEnumeration_DefaultLiteral(), true, null, null,
				null));
	}

	protected ItemPropertyDescriptor getDefaultLiteralPropertyDescriptor(
			Object object) {
		return new XEnumerationLiteralPropertyDescriptor(
				((XEnumeration) object),
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XEnumeration_defaultLiteral_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_XEnumeration_defaultLiteral_feature",
						"_UI_XEnumeration_type"), XmdlPackage.eINSTANCE
						.getXEnumeration_DefaultLiteral(), true, null, null,
				null);
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
			childrenFeatures.add(XmdlPackage.Literals.XENUMERATION__LITERALS);
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
	 * This returns XEnumeration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/XEnumeration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getText(Object object) {
		XEnumeration enumeration = ((XEnumeration) object);
		String label = enumeration.getName();
		XEnumerationLiteral defaultLiteral = enumeration.getDefaultLiteral();
		if (defaultLiteral != null) {
			label += " (" + defaultLiteral + ")";
		}
		return label == null || label.length() == 0 ? getString("_UI_XEnumeration_type")
				: /*getString("_UI_XEnumeration_type") + " " +*/label;
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

		switch (notification.getFeatureID(XEnumeration.class)) {
		case XmdlPackage.XENUMERATION__NAME:
		case XmdlPackage.XENUMERATION__CLASS_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case XmdlPackage.XENUMERATION__LITERALS:
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

		XEnumeration enm = (XEnumeration) object;
		XEnumerationLiteral lit = XmdlFactory.eINSTANCE
				.createXEnumerationLiteral();
		int l = enm.getLiterals().size() + 1;
		String name = "VALUE" + l;
		while (enm.hasLiteral(name)) {
			name = "VALUE" + ++l;
		}
		lit.setName(name);
		newChildDescriptors.add(createChildParameter(
				XmdlPackage.Literals.XENUMERATION__LITERALS, lit));
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
