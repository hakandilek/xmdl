package org.xmdl.core.templates.model;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.model.impl.EntitySearchTemplateImpl;


public class EntitySearchTemplate 
		extends EntitySearchTemplateImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		XClass class1=(XClass) object;
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = class1.getXPackage();
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/model/");
		buffer.append(class1.getName());
		buffer.append("Search.java");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XClass); 
	}


}
