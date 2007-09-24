package chrome.xmdl.core.templates.dao.hbm;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.dao.hbm.impl.EntityHBMTemplatePartImpl;

public class EntityHBMTemplatePart 
			extends EntityHBMTemplatePartImpl 
			implements Template{

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
		buffer.append(".hbm.xml");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XClass); 
	}


}
