package org.xmdl.xgen;

import java.util.HashMap;
import java.util.Map;

public class PlatformRegistry extends HashMap<String, Platform>{

	private static final long serialVersionUID = 1337766415384409362L;

	public PlatformRegistry(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}

	public PlatformRegistry(int initialCapacity) {
		super(initialCapacity);
	}

	public PlatformRegistry() {
		super();
	}

	public PlatformRegistry(Map<String, Platform> m) {
		super(m);
	}

}
