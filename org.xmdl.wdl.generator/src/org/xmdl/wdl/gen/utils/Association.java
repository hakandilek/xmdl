package org.xmdl.wdl.gen.utils;

import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Entity;

public class Association {

	private final Attribute attribute1;
	private final Attribute attribute2;

	public Association(Attribute attribute1, Attribute attribute2) {
		super();
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}

	public Attribute getAttribute1() {
		return attribute1;
	}

	public Attribute getAttribute2() {
		return attribute2;
	}

	public Entity getEntity1() {
		Entity entity = null;
		if (attribute1 != null)
			entity = (Entity) attribute1.eContainer();
		return entity;
	}

	public Entity getEntity2() {
		Entity entity = null;
		if (attribute2 != null)
			entity = (Entity) attribute2.eContainer();
		return entity;
	}

}
