package org.xmdl.ida.templates.web.test.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * applicationContext-dao.xml file for web tests template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextDAOXML extends ApplicationContextDAOXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/test/resources/applicationContext-dao.xml");
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
