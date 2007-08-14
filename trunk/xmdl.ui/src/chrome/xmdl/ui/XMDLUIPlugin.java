/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMDLUIPlugin.java,v 1.12 2006/02/27 07:21:37 tr001\tr1d2643 Exp $
 */
package chrome.xmdl.ui;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Xmdl editor plugin. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public final class XMDLUIPlugin extends EMFPlugin {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "hd";

	private static final Logger LOGGER = Logger.getLogger(XMDLUIPlugin.class);

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final XMDLUIPlugin INSTANCE = new XMDLUIPlugin();

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
	 * @generated NOT
	 */
	public XMDLUIPlugin() {
		super(new ResourceLocator[] { GenModelEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE, });
		LOGGER.info("XMDLUIPlugin()");
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

			Platforms platforms = Platforms.INST;
			LOGGER.info("Platforms = " + platforms);

		}

		protected void log(Throwable error, String message, int level) {
			String throwableMessage = error.getLocalizedMessage();
			if (throwableMessage != null) {
				if (message != null)
					message += " : " + throwableMessage;
				else
					message = throwableMessage;
			}
			if (message == null)
				message = error.getClass().getName();
			Status status = new Status(level, getBundle().getSymbolicName(), 0,
					message, error);
			log(status);
			LOGGER.warn(message, error);
		}

		public void logError(Throwable throwable, String message) {
			log(throwable, message, IStatus.ERROR);
		}

		public void logWarning(Throwable throwable, String message) {
			log(throwable, message, IStatus.WARNING);
		}

		public void logInfo(Throwable throwable, String message) {
			log(throwable, message, IStatus.INFO);
		}

	}

}
