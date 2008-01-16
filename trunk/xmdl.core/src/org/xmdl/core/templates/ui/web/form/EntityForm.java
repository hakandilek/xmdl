package org.xmdl.core.templates.ui.web.form;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.ui.web.form.impl.EntityFormImpl;


public class EntityForm 
		extends EntityFormImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		XClass class1=(XClass) object;
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = class1.getXPackage();
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/ui/web/form/");
		buffer.append(class1.getName());
		buffer.append("Form.java");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XClass); 
	}


}
