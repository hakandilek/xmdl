package org.xmdl.core.templates.ui.web.taglib;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.taglib.impl.SampleTagImpl;


public class SampleTag extends SampleTagImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XProject project = (XProject) object;
		StringBuffer buffer = new StringBuffer("src");
		XPackage package1 = (XPackage) project.getPackages().get(0);
		String t = package1.getName().replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/ui/web/taglib/SampleTag.java");
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
