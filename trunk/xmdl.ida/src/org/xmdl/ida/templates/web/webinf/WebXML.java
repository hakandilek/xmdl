package org.xmdl.ida.templates.web.webinf;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * web.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebXML extends WebXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/main/webapp/WEB-INF/web.xml");
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
