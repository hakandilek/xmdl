package org.xmdl.ida.templates.core.test;

import java.util.List;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XPackage;


/**
 * Hibernate configuration template file
 * 
 * @author Hakan Dilek
 * 
 */
public class HibernateConfigurationTest extends HibernateConfigurationTestImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		XPackage p = (XPackage) object;
		StringBuffer buffer = new StringBuffer("core/src/test/java/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		buffer.append(path);
		buffer.append("/dao/hibernate/HibernateConfigurationTest.java");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		if (object instanceof XPackage) {
			XPackage pack = (XPackage) object;
			List<XClass> classes = pack.getClasses();
			for (XClass cls : classes) {
				if (XClassBehavior.EMBEDDABLE == cls.getBehavior())
					return true;
			}
		}
		return false;
	}

	@Override
	public String parameterName() {
		return "package";
	}


}
