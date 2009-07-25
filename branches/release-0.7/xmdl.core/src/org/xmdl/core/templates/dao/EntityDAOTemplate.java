package org.xmdl.core.templates.dao;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.dao.impl.EntityDAOTemplateImpl;


public class EntityDAOTemplate 
		extends EntityDAOTemplateImpl
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		XClass class1=(XClass) object;
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = class1.getXPackage();
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/dao/");
		buffer.append(class1.getName());
		buffer.append("DAO.java");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XClass); 
	}


}
