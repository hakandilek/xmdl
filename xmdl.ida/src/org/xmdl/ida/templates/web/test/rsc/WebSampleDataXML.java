package org.xmdl.ida.templates.web.test.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * sample-data.xml file for web tests template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebSampleDataXML extends WebSampleDataXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/test/resources/sample-data.xml");
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
