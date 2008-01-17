package org.xmdl.xmdl.provider;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.xmdl.xmdl.XEnumeration;


public class XEnumerationLiteralPropertyDescriptor extends ItemPropertyDescriptor {

	public final static Logger LOGGER = Logger
			.getLogger(XEnumerationLiteralPropertyDescriptor.class);
	private final XEnumeration enumeration;

	public XEnumerationLiteralPropertyDescriptor(XEnumeration enumeration, AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
		this.enumeration = enumeration;
	}

	@SuppressWarnings("unchecked")
	protected Collection getComboBoxObjects(Object object) {
		Set result = new TreeSet();

//		Collection superObjects = super.getComboBoxObjects(object);
//		result.addAll(superObjects);
		
		List literals = enumeration.getLiterals();		
		result.addAll(literals);

		LOGGER.debug("result = " + result);
		return result;
	}

}
