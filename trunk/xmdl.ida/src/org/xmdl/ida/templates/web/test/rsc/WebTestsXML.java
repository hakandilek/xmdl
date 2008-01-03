package org.xmdl.ida.templates.web.test.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * web-tests.xml file for web tests template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebTestsXML extends WebTestsXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/test/resources/web-tests.xml");
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
