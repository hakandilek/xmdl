package chrome.xmdl.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XType;

public class XAtrributeOppositePropertyDescriptor extends
		ItemPropertyDescriptor {

	public final static Logger LOGGER = Logger
			.getLogger(XAtrributeOppositePropertyDescriptor.class);

	public XAtrributeOppositePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
	}

	@SuppressWarnings("unchecked")
	protected Collection getComboBoxObjects(Object object) {
		XAttribute attrib = (XAttribute) object;
		XClass container = attrib.getXClass();
		LOGGER.debug("attrib = " + attrib);
		LOGGER.debug("container = " + container);

		XClass type = (XClass) attrib.getType();
		List<XAttribute> allAttribs = type.getAttributes();
		LOGGER.debug("allAttribs = " + allAttribs);

		Collection result = new ArrayList();

		result.add(null);

		if (container != null) {
			for (XAttribute candidate : allAttribs) {
				XType candType = candidate.getType();
				if (candType != null && candType.equals(container)) {
					LOGGER.debug("adding  candidate = " + candidate);
					result.add(candidate);
				} else {
					LOGGER.debug("skiping candidate = " + candidate);
				}
			}
		}

		LOGGER.debug("result = " + result);
		return result;
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		XAttribute attrib = (XAttribute) object;
		XAttribute opposite = (XAttribute) value;
		LOGGER.debug("attrib = " + attrib);
		LOGGER.debug("opposite = " + opposite);

		if (opposite == null || attrib == null) {
			super.setPropertyValue(object, value);
			return;
		}
		
		EditingDomain editingDomain = getEditingDomain(opposite);
		LOGGER.debug("editingDomain = " + editingDomain);

		if (editingDomain == null) {
			XAttribute oldOpposite = attrib.getOpposite();
			if (oldOpposite != null) {
				oldOpposite.setOpposite(null);
			}
			if (opposite != null) {
				XAttribute oldOppositeOpposite = opposite.getOpposite();
				if (oldOppositeOpposite != null) {
					oldOppositeOpposite.setOpposite(null);
				}
				opposite.setOpposite(attrib);
			}
			attrib.setOpposite(opposite);
		} else {
			CompoundCommand compoundCommand = new CompoundCommand(
					CompoundCommand.LAST_COMMAND_ALL);
			XAttribute oldOpposite = attrib.getOpposite();
			if (oldOpposite != null) {
				compoundCommand.append(SetCommand.create(editingDomain,
						getCommandOwner(oldOpposite), feature, null));
			}
			if (opposite != null) {
				XAttribute oldOppositeOpposite = opposite.getOpposite();
				if (oldOppositeOpposite != null) {
					compoundCommand.append(SetCommand
							.create(editingDomain,
									getCommandOwner(oldOppositeOpposite),
									feature, null));
				}
				compoundCommand.append(SetCommand.create(editingDomain,
						getCommandOwner(opposite), feature, attrib));
			}
			compoundCommand.append(SetCommand.create(editingDomain,
					getCommandOwner(attrib), feature, opposite));
			editingDomain.getCommandStack().execute(compoundCommand);
		}

	}

}
