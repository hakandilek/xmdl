package org.xmdl.core.templates.dao.hbm;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.core.templates.dao.hbm.impl.PackageHBMTemplateImpl;
import org.xmdl.xmdldb.DPackage;


public class PackageHBMTemplate extends PackageHBMTemplateImpl implements
		TemplateConfiguration {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("rsc/");
		DPackage package1 = (DPackage) object;
		String t = package1.getName().replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/model/");
		// buffer.append(class1.getName());
		buffer.append("package.hbm.xml");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof DPackage);
	}

}
