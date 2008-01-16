package org.xmdl.ida.templates.web.test;

import java.util.List;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;


/**
 * Startup listener test case for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class StartupListenerTest extends StartupListenerTestImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XProject prj = (XProject) object;
        List<XPackage> pkgs = (prj).getPackages();
        XPackage pkg = pkgs.get(0);
        StringBuffer buffer = new StringBuffer("web/src/test/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/webapp/listener/StartupListenerTest.java");
        return buffer.toString();
    }

    @Override
    public boolean accept(Object object) {
        if (object instanceof XProject) {
            XProject project = (XProject) object;
            return (project.getPackages().size() > 0);
        }
        return false;
    }

    @Override
    public String parameterName() {
        return "project";
    }

}
