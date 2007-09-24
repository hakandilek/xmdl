package chrome.xmdl.core.templates.dao;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.core.templates.dao.impl.EntityDAOTemplateImpl;
import chrome.xmdl.xgen.Template;

public class EntityDAOTemplate 
		extends EntityDAOTemplateImpl
		implements Template{

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
