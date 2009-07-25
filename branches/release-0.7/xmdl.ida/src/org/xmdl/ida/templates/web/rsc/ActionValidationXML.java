package org.xmdl.ida.templates.web.rsc;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XPackage;


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
		if (object instanceof XClass) {
			XClass cls = (XClass) object;
			XClassBehavior behavior = cls.getBehavior();
			return XClassBehavior.PERSISTED == behavior;
		} else
			return false;
    }

    @Override
    public String parameterName() {
        return "class";
    }

}
