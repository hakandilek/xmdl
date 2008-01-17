package org.xmdl.xmdl.provider;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;


public class XAtrributeTypePropertyDescriptor extends ItemPropertyDescriptor {

	public final static Logger LOGGER = Logger
			.getLogger(XAtrributeTypePropertyDescriptor.class);

	public XAtrributeTypePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
	}

	@SuppressWarnings("unchecked")
	protected Collection getComboBoxObjects(Object object) {
		Set result = new TreeSet();

		Collection<?> superObjects = super.getComboBoxObjects(object);
		for (Object o : superObjects) {
			if (o instanceof XType) {
				XType type = (XType) o;
				// contents of superObjects is null sometimes,
				// check this
				if (type != null)
					result.add(type);
			}
		}

		// result.addAll(superObjects);
		LOGGER.debug("Before register. result = " + result);

		Collection<XType> types = XmdlTypes.getRegisteredTypes();
		result.addAll(types);

		// Filter unappripriate types.
		result.remove(XmdlTypes.VOID);

		LOGGER.debug("After register. result = " + result);

		return result;
	}

}
