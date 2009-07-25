package org.xmdl.ida.templates.web.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * ApplicationResources.properties file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationResourcesProperties extends
        ApplicationResourcesPropertiesImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/main/resources/ApplicationResources.properties");
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
