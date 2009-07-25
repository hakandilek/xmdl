package org.xmdl.ida.templates.web.site;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * site.xml file for tapestry template file
 * 
 * @author Hakan Dilek
 * 
 */
public class SiteXML extends SiteXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/site/site.xml");
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
