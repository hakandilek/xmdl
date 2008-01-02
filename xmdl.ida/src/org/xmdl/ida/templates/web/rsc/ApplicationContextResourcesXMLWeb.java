package org.xmdl.ida.templates.web.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * applicationContext-resources.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextResourcesXMLWeb extends
        ApplicationContextResourcesXMLWebImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/main/resources/applicationContext-resources.xml");
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
