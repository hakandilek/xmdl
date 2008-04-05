/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.ida.plugin;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;


/**
 * This is the central singleton for the IDA platform plugin.
 */
public final class XMDLIDAPlugin extends EMFPlugin {
	
	/** the logger */
	private static final Logger LOGGER= Logger.getLogger(XMDLIDAPlugin.class);  
	
	/**
	 * Keep track of the singleton.
	 */
	public static final XMDLIDAPlugin INSTANCE = new XMDLIDAPlugin();

	/**
	 * Keep track of the singleton.
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 */
	public XMDLIDAPlugin() {
		super
		  (new ResourceLocator [] {
		   });
        initClassLoader();
        LOGGER.info("XMDLIDAPlugin()");
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 */
		public Implementation() {
			
			super();

			// Remember the static instance.
			plugin = this;
		}

		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);

			initClassLoader();

            LOGGER.info("Class loader initialized");

			LOGGER.info("Plugin startup completed");
		}

		@Override
		public void stop(BundleContext context) throws Exception {
			super.stop(context);
			LOGGER.info("Plugin stoped");
		}
	}

    private static void initClassLoader() {
        try {
            Thread.currentThread()
                    .getContextClassLoader().getResource("META-INF/MANIFEST.MF");
        } catch (Throwable e) {
            e.printStackTrace();
            BasicConfigurator.configure();
        }
    }

}
