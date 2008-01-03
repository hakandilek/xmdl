package org.xmdl.ida.templates.web.rsc;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * struts.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ActionValidationXML extends ActionValidationXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        XPackage pkg = cls.getXPackage();
        StringBuffer buffer = new StringBuffer(
        "web/src/main/resources/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/webapp/action/");
        buffer.append(cls.getName());
        buffer.append("Action-validation.xml");
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
