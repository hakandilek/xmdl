package org.xmdl.xmdl.plugin;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleContext;
import org.xmdl.xmdl.XmdlPackage;
import org.xmdl.xmdl.XmdlTypes;
import org.xmdl.xmdlbo.XmdlboPackage;
import org.xmdl.xmdldb.XmdldbPackage;
import org.xmdl.xmdlgen.XmdlgenPackage;


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
        XmdlTypes.getInstance();
        
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmdl",
                new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmdldb",
                new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmdlbo",
                new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmdlgen",
                new XMIResourceFactoryImpl());

        XmdlPackage.eINSTANCE.eClass();
        XmdldbPackage.eINSTANCE.eClass();
        XmdlboPackage.eINSTANCE.eClass();
        XmdlgenPackage.eINSTANCE.eClass();

    }

    @Override
    public void stop(BundleContext context) throws Exception {
        super.stop(context);
    }

}
