package chrome.xmdl.core.templates.context;

import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.context.impl.DatabasePropertiesImpl;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

public class DatabaseProperties extends DatabasePropertiesImpl implements Template {

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
