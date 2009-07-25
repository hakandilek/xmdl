package org.xmdl.core.templates.model;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.model.impl.EnumerationTemplateImpl;


public class EnumerationTemplate extends EnumerationTemplateImpl implements
		TemplateConfiguration {

	public String targetFile(Object object) {
		XEnumeration enumeration = (XEnumeration) object;
		StringBuffer buffer = new StringBuffer("src");
		XPackage package1 = enumeration.getXPackage();
		String t = package1.getName().replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/model/");
		buffer.append(enumeration.getName());
		buffer.append(".java");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XEnumeration);
	}

}
