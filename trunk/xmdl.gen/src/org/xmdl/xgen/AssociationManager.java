package org.xmdl.xgen;

import java.util.ArrayList;
import java.util.Collection;

import org.xmdl.xmdl.XAttribute;

/**
 * This class is used to keep track of associations.
 * 
 * @author Hakan Dilek
 */
public class AssociationManager implements GeneratorListener {

	public static final AssociationManager INSTANCE = new AssociationManager();

	private final Collection<XAttribute> associations = new ArrayList<XAttribute>();

	private AssociationManager() {
		super();
	}

	public static AssociationManager getInstance() {
		return INSTANCE;
	}

	public boolean isRegistered(XAttribute attribute) {
		return associations.contains(attribute);
	}

	public void register(XAttribute attribute) {
		if (attribute != null) {
			XAttribute opposite = attribute.getOpposite();
			associations.add(attribute);
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
	public Collection<XAttribute> getAssociations() {
		return associations;
	}

	@Override
	public void fileGenerated(FileGeneratedEvent event) {
	}

	@Override
	public void generationFinished(GenerationFinishedEvent event) {
		reset();
	}

	@Override
	public void generationInitialized(InitializedEvent event) {
	}

	@Override
	public void generationStarted(GenerationStartedEvent event) {
	}
	
}
