package org.xmdl.ida.templates.core.model;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XPackage;


/**
 * The model bean search template file
 * 
 * @author Hakan Dilek
 *
 */
public class EntitySearch extends EntitySearchImpl implements Template {

    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        XPackage pkg = cls.getXPackage();
        StringBuffer buffer = new StringBuffer("core/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/model/search/");
        buffer.append(cls.getName());
        buffer.append("Search.java");
        return buffer.toString();
    }

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
