package org.xmdl.ida.templates.web.action;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;


/**
 * Entity Action for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class EntityAction extends EntityActionImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XClass c = (XClass) object;
        XPackage pkg = c.getXPackage();
        StringBuffer buffer = new StringBuffer("web/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/webapp/action/");
        buffer.append(XMDLClassHelper.INSTANCE.getCapName(c));
        buffer.append("Action.java");
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
