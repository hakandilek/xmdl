package org.xmdl.core.templates.test.dao;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.test.dao.impl.DAOTestTemplateImpl;


public class DAOTestTemplate extends DAOTestTemplateImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XClass class1 = (XClass) object;
		StringBuffer buffer = new StringBuffer("test/src");
		XPackage package1 = class1.getXPackage();
		String t = package1.getName().replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/dao/");
		buffer.append(class1.getName());
		buffer.append("DAOTest.java");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
