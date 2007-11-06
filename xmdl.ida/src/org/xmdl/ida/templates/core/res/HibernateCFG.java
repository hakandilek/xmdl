package org.xmdl.ida.templates.core.res;

import org.eclipse.emf.common.util.EList;

import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * The Application Constants definition file
 * 
 * @author Hakan Dilek
 *
 */
public class HibernateCFG extends HibernateCFGImpl implements Template {

    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer("core/src/main/resources/hibernate.cfg.xml");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XProject);
    }

}
