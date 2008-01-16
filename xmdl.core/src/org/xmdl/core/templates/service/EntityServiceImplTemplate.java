package org.xmdl.core.templates.service;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.service.impl.EntityServiceImplTemplateImpl;


public class EntityServiceImplTemplate extends EntityServiceImplTemplateImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XClass class1=(XClass) object;
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = class1.getXPackage();
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/bo/impl/");
		buffer.append(class1.getName());
		buffer.append("ServiceImpl.java");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
