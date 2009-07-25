package org.xmdl.ida.templates.web.test.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * log4j.xml file for web tests template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebTestLog4jXML extends Log4jXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/test/resources/log4j.xml");
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
