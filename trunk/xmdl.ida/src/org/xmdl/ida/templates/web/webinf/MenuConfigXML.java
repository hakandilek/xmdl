package org.xmdl.ida.templates.web.webinf;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * menu-config.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class MenuConfigXML extends MenuConfigXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
        "web/src/main/webapp/WEB-INF/menu-config.xml");
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
