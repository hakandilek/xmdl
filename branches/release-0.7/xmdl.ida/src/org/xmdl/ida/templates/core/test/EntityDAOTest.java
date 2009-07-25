package org.xmdl.ida.templates.core.test;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XPackage;


/**
 * Entity DAO Test template file
 * 
 * @author Hakan Dilek
 * 
 */
public class EntityDAOTest extends EntityDAOTestImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		XClass c = (XClass) object;
		XPackage p = c.getXPackage();
		StringBuffer buffer = new StringBuffer("core/src/test/java/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		buffer.append(path);
		buffer.append("/dao/");
		buffer.append(XMDLClassHelper.INSTANCE.getCapName(c));
		buffer.append("DAOTest.java");
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
