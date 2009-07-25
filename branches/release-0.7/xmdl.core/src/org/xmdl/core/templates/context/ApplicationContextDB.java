package org.xmdl.core.templates.context;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.context.impl.ApplicationContextDBImpl;


public class ApplicationContextDB extends ApplicationContextDBImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XPackage p = (XPackage) object;
		StringBuffer buffer = new StringBuffer("rsc/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		buffer.append(path);
		buffer.append("/");
		buffer.append("applicationContext-db.xml");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XPackage);
	}

}
