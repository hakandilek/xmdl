package org.xmdl.ida.templates.web.rsc;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;


/**
 * struts.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class EntityValidationXML extends EntityValidationXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        XPackage pkg = cls.getXPackage();
        StringBuffer buffer = new StringBuffer(
        "web/src/main/resources/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/model/");
        buffer.append(cls.getName());
        buffer.append("-validation.xml");
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
