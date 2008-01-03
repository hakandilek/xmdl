package org.xmdl.ida.templates.web.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * log4j.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebMainLog4jXML extends Log4jXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/main/resources/log4j.xml");
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
