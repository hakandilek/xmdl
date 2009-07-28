package org.xmdl.wdl.gen.utils;

import java.util.ArrayList;
import java.util.Collection;

import org.xmdl.wdl.Attribute;

/**
 * This class is used to keep track of associations.
 * 
 * @author Hakan Dilek
 */
public class AssociationManager {

	public static final AssociationManager INSTANCE = new AssociationManager();

	private final Collection<Attribute> associations = new ArrayList<Attribute>();

	private AssociationManager() {
		super();
	}

	public static AssociationManager getInstance() {
		return INSTANCE;
	}

	public boolean isRegistered(Attribute attribute) {
		return associations.contains(attribute);
	}

	public void register(Attribute attribute) {
		if (attribute != null) {
			associations.add(attribute);
			Attribute opposite = ExtensionUtils.opposite(attribute);
			if (opposite != null)
				associations.add(opposite);
		}
	}

	public void reset() {
		associations.clear();
	}

	/**
	 * @return the associations
	 */
	public Collection<Attribute> getAssociations() {
		return associations;
	}

}
