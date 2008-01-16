package org.xmdl.core.templates.context;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.context.impl.DatabasePropertiesImpl;


public class DatabaseProperties extends DatabasePropertiesImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XProject project =(XProject) object;
		XPackage p = (XPackage) project.getPackages().get(0);
		StringBuffer buffer= new StringBuffer("rsc/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		//buffer.append(p.getName());
		buffer.append(path);
		buffer.append("/");
		buffer.append("database.properties");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		if (object instanceof XProject) {
			XProject project = (XProject) object;
			return project.getPackages().size() > 0;
		}
		return false;
	}

}
