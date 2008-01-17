package org.xmdl.gen.plugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.xmdl.xgen.Platform;


public class ExtensionPlatformFactory {

	public static final String POINT_ID = "org.xmdl.gen.register";

	private static final String ATT_NAME = "name";

	private static final String ATT_VERSION = "version";

	private static final String ATT_CLASS = "class";

	private static ExtensionPlatform[] platforms;

	static public ExtensionPlatform[] loadExtensions() throws CoreException {
		if (platforms == null) {
			IExtensionRegistry registry = org.eclipse.core.runtime.Platform
					.getExtensionRegistry();
			IExtensionPoint extensionPoint = registry
					.getExtensionPoint(POINT_ID);
			IConfigurationElement points[] = extensionPoint
					.getConfigurationElements();
			platforms = new ExtensionPlatform[points.length];
			for (int i = 0; i < points.length; i++) {
				platforms[i] = createPlatform(points[i]);
			}
		}
		return platforms;
	}

	private static ExtensionPlatform createPlatform(
			IConfigurationElement element) throws CoreException {
		String name = element.getAttribute(ATT_NAME);
		String version = element.getAttribute(ATT_VERSION);
		Object object = element.createExecutableExtension(ATT_CLASS);
		if (object == null || !(object instanceof Platform)) {
			return null;
		}
		Platform p = (Platform) object;
		ExtensionPlatform platform = new ExtensionPlatform(name, version, p);
		return platform;
	}

}
