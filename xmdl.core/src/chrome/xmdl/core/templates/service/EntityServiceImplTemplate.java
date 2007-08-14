package chrome.xmdl.core.templates.service;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.service.impl.EntityServiceImplTemplateImpl;
import chrome.xmdl.core.templates.service.impl.EntityServiceTemplateImpl;

public class EntityServiceImplTemplate extends EntityServiceImplTemplateImpl implements Template {

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
