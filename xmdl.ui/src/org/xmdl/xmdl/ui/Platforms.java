package org.xmdl.xmdl.ui;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.xmdl.gen.plugin.ExtensionPlatform;
import org.xmdl.gen.plugin.ExtensionPlatformFactory;
import org.xmdl.xgen.Platform;
import org.xmdl.xgen.PlatformRegistry;


public class Platforms extends PlatformRegistry {

	private final static Logger LOGGER = Logger.getLogger(Platforms.class);
	
	public static final Platforms INST = new Platforms();
	
	private static final long serialVersionUID = 918042425117776580L;
	
	protected Platforms() {
		super();
		initialize();
	}

	protected void initialize() {
		try {
			ExtensionPlatform[] extensions = ExtensionPlatformFactory.loadExtensions();
			for (int i = 0; i < extensions.length; i++) {
				Platform p = extensions[i];
				String msg = "Registering platform : " + p;
				LOGGER.debug(msg);
				put(p.name(), p);
			}
		} catch (CoreException e) {
			LOGGER.error("exception initializing platforms", e);
		}
	}

}
