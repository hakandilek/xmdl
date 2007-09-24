package chrome.xmdl.plugin;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import chrome.xmdl.XmdlTypes;

/**
 * Bundle activator (plugin definition) for XMDL Model plugin. Make Initializations in this class.
 * 
 * @author Hakan Dilek
 *
 */
public class XMDLModelPlugin extends Plugin {

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        XmdlTypes.init("");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        super.stop(context);
    }

}
