package chrome.xmdl.core.templates.dao;

import org.apache.log4j.Logger;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.core.templates.dao.impl.EntityDAOImplTemplateImpl;
import chrome.xmdl.xgen.Template;

public class EntityDAOImplTemplate 
			extends EntityDAOImplTemplateImpl 
			implements Template{
	public static final Logger LOGGER=Logger.getLogger(EntityDAOImplTemplate.class);
	
	public String targetFile(Object object) {
		XClass class1=(XClass) object;
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = class1.getXPackage();
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/dao/impl/");
		buffer.append(class1.getName());
		buffer.append("DAOImpl.java");
		LOGGER.debug("tfile:"+buffer.toString());
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass); 
	}


}
