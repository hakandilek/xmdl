package org.xmdl.ida.templates.project;

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
public class Constants extends ConstantsImpl implements Template {

    public String targetFile(Object object) {
        XProject prj = (XProject) object;
        EList<XPackage> packages = prj.getPackages();
        XPackage package1 = packages.get(0);
        StringBuffer buffer = new StringBuffer("core/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(package1));

        buffer.append("ApplicationConstants.java");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XProject);
    }

}
