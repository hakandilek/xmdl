package org.xmdl.ida.templates.web.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;


/**
 * mail.properties file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class StrutsEntityXML extends StrutsEntityXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        StringBuffer buffer = new StringBuffer("web/src/main/resources/struts-");
        buffer.append(cls.getName());
        buffer.append(".xml");
        return buffer.toString();
    }

    @Override
    public boolean accept(Object object) {
        return (object instanceof XClass);
    }

    @Override
    public String parameterName() {
        return "class";
    }

}
