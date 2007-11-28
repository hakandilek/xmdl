package chrome.xmdl.core.templates.service;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.service.impl.AbstractEntityServiceTemplateImpl;

/**
 * NOT USED Since 0.4.2 * 
 * @author hd
 */
public class AbstractEntityService
		extends AbstractEntityServiceTemplateImpl
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		XClass class1=(XClass) object;
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = class1.getXPackage();
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/bo/impl/Abstract");
		buffer.append(class1.getName());
		buffer.append("Service.java");
		return buffer.toString();
	}
	public boolean accept(Object object) {
//		return (object instanceof XClass); 
		return false;
	}


}
