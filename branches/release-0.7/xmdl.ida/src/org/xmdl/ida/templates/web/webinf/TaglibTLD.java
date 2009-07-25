package org.xmdl.ida.templates.web.webinf;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * <project-name>.tld file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class TaglibTLD extends TaglibTLDImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XProject prj = (XProject) object;
        StringBuffer buffer = new StringBuffer("web/src/main/webapp/WEB-INF/");
        buffer.append(prj.getName());
        buffer.append(".tld");
        return buffer.toString();
    }

    @Override
    public boolean accept(Object object) {
        return object instanceof XProject;
    }

    @Override
    public String parameterName() {
        return "project";
    }

}
