package org.xmdl.ida.templates.web.jsp;

import chrome.xmdl.XClass;
import chrome.xmdl.xgen.Template;

/**
 * <entity>Form.jsp file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class EntityFormJSP extends EntityFormJSPImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        StringBuffer buffer = new StringBuffer(
        "web/src/main/webapp/WEB-INF/pages/");
        buffer.append(cls.getName());
        buffer.append("Form.jsp");
        return buffer.toString();
    }

    @Override
    public boolean accept(Object object) {
        return object instanceof XClass;
    }

    @Override
    public String parameterName() {
        return "class";
    }

}
