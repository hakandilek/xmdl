package org.xmdl.ida.templates.web.jsp;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * taglibs.jsp file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class TaglibsJSP extends TaglibsJSPImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/main/webapp/common/taglibs.jsp");
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
