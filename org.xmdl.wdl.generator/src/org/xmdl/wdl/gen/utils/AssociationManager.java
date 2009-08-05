package org.xmdl.wdl.gen.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Entity;
import org.xmdl.wdl.Model;
import org.xmdl.wdl.Type;

/**
 * This class is used to keep track of associations.
 * 
 * @author Hakan Dilek
 */
public class AssociationManager {

	public static final AssociationManager INSTANCE = new AssociationManager();

	private final Collection<Association> associations = new ArrayList<Association>();

	private final Map<Attribute, Association> associationMap = new HashMap<Attribute, Association>();

	private AssociationManager() {
		super();
	}

	public static AssociationManager getInstance() {
		return INSTANCE;
	}

	private boolean isRegistered(Attribute attribute) {
		return associationMap.containsKey(attribute);
	}

	private void register(Attribute attribute) {
		if (attribute != null && attribute.getMany() != null) {
			Attribute opposite = ExtensionUtils.opposite(attribute);
			if (opposite != null && opposite.getMany() != null) {
				Association association = new Association(attribute, opposite);
				associations.add(association);
				associationMap.put(attribute, association);
				associationMap.put(opposite, association);
			}
		}
	}

	private void reset() {
		associationMap.clear();
		associations.clear();
	}

	/**
	 * @return the associations
	 */
	public Collection<Association> getAssociations() {
		return associations;
	}

	public void initialize(Model model) {
		reset();
		// traverse all attributes in the model and create associations
		List<Type> types = model.getTypes();
		for (Type type : types) {
			if (type instanceof Entity) {
				Entity entity = (Entity) type;
				List<Attribute> attributes = entity.getAttributes();
				for (Attribute attribute : attributes) {
					if (!isRegistered(attribute)) {
						register(attribute);
					}
				}
			}
		}
	}

	public boolean isSide1(Attribute attribute) {
		Association association = association(attribute);
		if (association != null && association.getAttribute1() == attribute) {
			return true;
		}
		return false;
	}

	public Association association(Attribute attribute) {
		Association association = associationMap.get(attribute);
		return association;
	}

}
