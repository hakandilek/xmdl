package org.xmdl.core.templates.service;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.service.impl.SampleListenerTemplateImpl;


public class SampleListenerTemplate extends SampleListenerTemplateImpl
		implements TemplateConfiguration {

	public String targetFile(Object object) {
		XProject project = (XProject) object;
		StringBuffer buffer = new StringBuffer("src");
		XPackage package1 = (XPackage) project.getPackages().get(0);
		String name = package1.getName();
		String t = name == null ? "null" : name.replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/bo/");
		buffer.append("SampleListener.java");
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
