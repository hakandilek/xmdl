package org.xmdl.ida.templates.web.test.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * applicationContext-service.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebApplicationContextServiceXML extends ApplicationContextServiceXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
        "web/src/test/resources/applicationContext-service.xml");
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
