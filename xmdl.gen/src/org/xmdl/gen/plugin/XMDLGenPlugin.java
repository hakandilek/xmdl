/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.gen.plugin;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Xmdl editor plugin. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public final class XMDLGenPlugin extends EMFPlugin {

	/** the logger */
	private static final Logger LOGGER = Logger.getLogger(XMDLGenPlugin.class);

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final XMDLGenPlugin INSTANCE = new XMDLGenPlugin();

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMDLGenPlugin() {
		super(new ResourceLocator[] {
		// JETTemplatesUIPlugin.INSTANCE,
				// MappingPlugin.INSTANCE,
				// GenModelEditPlugin.INSTANCE,
				// EcoreEditPlugin.INSTANCE,
				});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the singleton instance.
	 * @generated
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}

		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);

			try {
				PropertyConfigurator.configure(Thread.currentThread()
						.getContextClassLoader()
						.getResource("log4j.properties"));
			} catch (Throwable e) {
				e.printStackTrace();
				BasicConfigurator.configure();
			}

			LOGGER.info("Logger activated");

			ExtensionPlatform[] extensions = ExtensionPlatformFactory
					.loadExtensions();
			LOGGER.info("Loaded Platforms : ");
			for (ExtensionPlatform ep : extensions) {
				LOGGER.info("platform = " + ep);
			}

		}

	}

}
