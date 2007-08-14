/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl.core.plugin;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.EMFPlugin; 
import org.eclipse.emf.common.util.ResourceLocator;


/**
 * This is the central singleton for the Xmdl editor plugin.
 * <!-- begin-user-doc --> 
 * <!-- end-user-doc -->
 * @generated
 */
public final class XMDLCorePlugin extends EMFPlugin {
	private static final Logger LOGGER= Logger.getLogger(XMDLCorePlugin.class);  
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XMDLCorePlugin INSTANCE = new XMDLCorePlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLCorePlugin() {
		super
		  (new ResourceLocator [] {
//		     JETTemplatesUIPlugin.INSTANCE,
//		     MappingPlugin.INSTANCE,
//		     GenModelEditPlugin.INSTANCE,
//		     EcoreEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
