package org.xmdl.ida.templates.web.webinf;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * applicationContext-hibernate.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextHibernateXML extends ApplicationContextHibernateXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
        "web/src/main/webapp/WEB-INF/applicationContext-hibernate.xml");
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
