package chrome.xmdl.provider;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;

public class XAtrributeAssociationTypePropertyDescriptor extends
		ItemPropertyDescriptor {

	public final static Logger LOGGER = Logger
			.getLogger(XAtrributeAssociationTypePropertyDescriptor.class);

	public XAtrributeAssociationTypePropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		super.setPropertyValue(object, value);
		XAttribute attrib = (XAttribute) object;
		XAssociationType associationType = (XAssociationType) value;
		LOGGER.debug("attrib = " + attrib);
		LOGGER.debug("associationType = " + associationType);

		if (associationType == null || attrib == null) {
			super.setPropertyValue(object, value);
			return;
		}

		XAttribute opposite = attrib.getOpposite();
		LOGGER.debug("opposite = " + opposite);

		if (opposite != null) {
//			EditingDomain editingDomain = getEditingDomain(associationType);
//			LOGGER.debug("editingDomain = " + editingDomain);

			XAssociationType oppositeAscType = associationType.oppositeType();
			LOGGER.debug("oppositeAscType = " + oppositeAscType);

			opposite.setAssociationType(oppositeAscType);
//			if (editingDomain == null) {
//				opposite.setAssociationType(oppositeAscType);
//			} else {
//				opposite.setAssociationType(oppositeAscType);
//
//				CompoundCommand compoundCommand = new CompoundCommand(
//						CompoundCommand.LAST_COMMAND_ALL);
//
//				compoundCommand.append(SetCommand.create(editingDomain,
//						getCommandOwner(opposite), feature, oppositeAscType));
//				
//				editingDomain.getCommandStack().execute(compoundCommand);
//			}

		}
	}

}
