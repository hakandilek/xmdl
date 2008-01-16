package org.xmdl.ida.templates.core.test;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
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
		return (object instanceof XPackage);
	}

	@Override
	public String parameterName() {
		return "package";
	}


}
