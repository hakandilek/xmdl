/**
 * <copyright>
 * </copyright>
 *
 * $Id: XAttributeItemProvider.java,v 1.9 2006/03/30 12:31:37 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.provider;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XmdlPackage;

import chrome.xmdl.*;

import chrome.xmdl.ui.XMDLUIPlugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link chrome.xmdl.XAttribute} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class XAttributeItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	
	private final static Logger LOGGER = Logger
			.getLogger(XAttributeItemProvider.class);
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
	public List getPropertyDescriptors(Object object) {
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
				XmdlPackage.eINSTANCE.getXAttribute_Name(), true,
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
								"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
								.getXAttribute_Length(), true,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
						"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
						.getXAttribute_DefaultValue(), true,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
								"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
								.getXAttribute_XClass(), false, null,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * @generated
	 * @param object
	 */
	@SuppressWarnings("unchecked")
	protected void addTypePropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_XAttribute_type_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_XAttribute_type_feature", "_UI_XAttribute_type"),
				XmdlPackage.eINSTANCE.getXAttribute_Type(), true, null,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
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
	@SuppressWarnings("unchecked")
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
						"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
						.getXAttribute_AssociationType(), true,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
						"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
						.getXAttribute_AssociationBehaviour(), true,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
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
						"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
						.getXAttribute_Opposite(), true, null,
				getString("_UI_ReferencePropertyCategory"), null));
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
						"_UI_XAttribute_type"), XmdlPackage.eINSTANCE
						.getXAttribute_Navigable(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				getString("_UI_ReferencePropertyCategory"), null));
	}

	/**
	 * This returns XAttribute.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public Object getImage(Object object) {
		if (object instanceof XAttribute) {
			XAttribute attrib = (XAttribute) object;
			if (attrib.isReference())
			    return getComposedImage(object, getResourceLocator().getImage("full/obj16/XReference"));
			if (attrib.getType() instanceof XEnumeration)
				return getResourceLocator().getImage(
						"full/obj16/XReferenceEnum");
		}
		return getResourceLocator().getImage("full/obj16/XAttribute");
	}

	/**
	 * Used to compose two images together 
	 * _hd
	 * @param object
	 * @param image
	 * @return
	 */
	private Object getComposedImage(Object object, Object image) {
		XAttribute attrib = (XAttribute) object;
		XAssociationType ascType = attrib.getAssociationType();
	    Collection images = new ArrayList();
	    images.add(image);
	    String imageName = "full/obj16/XReference";

	    String name = ascType.getName();
	    LOGGER.debug("name = " + name);
	    
	    imageName += name;	    
	    LOGGER.debug("imageName = " + imageName);
	    
	    images.add(getResourceLocator().getImage(imageName));
	    
	    return new ComposedImage(images) {	    	
	        public List getDrawPoints(Size size) {
	        	
	        	List result = super.getDrawPoints(size);
	        	if (result.size() > 1) {
	        		((Point)result.get(0)).y = -2;	          
	        	}
	        	return result;
	        	
	        }	       
	    };
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
		if (attribute.isReference() && opposite!= null) {
			String oppName = opposite.getName();
			String oppClass = opposite.getXClass().getName();
			label += " -> " + oppClass + "." + oppName;			
		}
		return label == null || label.length() <= 1 ? getString("_UI_XAttribute_type")
				: label;
	}

	/**
	 * @generated
	 */
	public String getTextGen(Object object) {
		String label = ((XAttribute) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_XAttribute_type")
				: getString("_UI_XAttribute_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
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
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return XMDLUIPlugin.INSTANCE;
	}

}
