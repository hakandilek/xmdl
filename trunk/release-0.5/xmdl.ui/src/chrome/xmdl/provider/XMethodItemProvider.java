/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl.provider;

import chrome.xmdl.XException;
import chrome.xmdl.XMethod;
import chrome.xmdl.XParameter;
import chrome.xmdl.XmdlFactory;
import chrome.xmdl.XmdlPackage;
import chrome.xmdl.XmdlTypes;

import chrome.xmdl.*;

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
 * This is the item provider adapter for a {@link chrome.xmdl.XMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XMethodItemProvider extends ItemProviderAdapter implements
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
	public XMethodItemProvider(AdapterFactory adapterFactory) {
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

			addIndexPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XMethod_index_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XMethod_index_feature", "_UI_XMethod_type"),
				XmdlPackage.Literals.XMETHOD__INDEX, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_XMethod_name_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XMethod_name_feature", "_UI_XMethod_type"),
				XmdlPackage.Literals.XMETHOD__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XMethod_type_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XMethod_type_feature", "_UI_XMethod_type"),
				XmdlPackage.Literals.XMETHOD__TYPE, true, false, false, null,
				null, null));
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
			childrenFeatures.add(XmdlPackage.Literals.XMETHOD__PARAMETERS);
			childrenFeatures.add(XmdlPackage.Literals.XMETHOD__EXCEPTIONS);
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
	 * This returns XMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/XMethod"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		String label = ((XMethod) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_XMethod_type")
				: getString("_UI_XMethod_type") + " " + label;
	}

	public String getText(Object object) {
		XMethod method = ((XMethod) object);
		String label = method.getName();
		XType type = method.getType();
		if (type == null) 
		    type = XmdlTypes.VOID;
		List<XParameter> parameters = method.getParameters();
		StringBuffer sb = new StringBuffer("(");
		for (int i = 0; i < parameters.size(); i++) {
			XParameter param = (XParameter) parameters.get(i);
			XType pType = param.getType();
			sb.append(pType.getName()).append(" ").append(param.getName());
			if (i != parameters.size() - 1)
				sb.append(", ");
		}
        sb.append(")");
		String params = sb.toString();
		return label == null || label.length() == 0 ? getString("_UI_XMethod_type")
				+ params
				: type.getName() + " " + label + params;
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

		switch (notification.getFeatureID(XMethod.class)) {
		case XmdlPackage.XMETHOD__INDEX:
		case XmdlPackage.XMETHOD__NAME:
		case XmdlPackage.XMETHOD__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case XmdlPackage.XMETHOD__PARAMETERS:
		case XmdlPackage.XMETHOD__EXCEPTIONS:
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

		XMethod met = (XMethod) object;
        XParameter par = XmdlFactory.eINSTANCE.createXParameter();
        int p = met.getParameters().size() + 1;
        String name = "param" + p;
        while(met.hasParameter(name)){
            name = "param" + ++p;
        }
        par.setName(name);
        par.setType(XmdlTypes.JAVA_STRING);
        newChildDescriptors.add(createChildParameter(
                XmdlPackage.Literals.XMETHOD__PARAMETERS, par));

        XException exc = XmdlFactory.eINSTANCE.createXException();
        exc.setJavaClass(Exception.class);
        newChildDescriptors.add(createChildParameter(
                XmdlPackage.Literals.XMETHOD__EXCEPTIONS, exc));
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
