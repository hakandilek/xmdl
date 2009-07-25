package org.xmdl.ida.templates.web.test;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XPackage;


/**
 * Entity Action test case for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class EntityActionTest extends EntityActionTestImpl implements Template {

    @Override
    public String targetFile(Object object) {
        XClass c = (XClass) object;
        XPackage pkg = c.getXPackage();
        StringBuffer buffer = new StringBuffer("web/src/test/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/webapp/action/");
        buffer.append(XMDLClassHelper.INSTANCE.getCapName(c));
        buffer.append("ActionTest.java");
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
