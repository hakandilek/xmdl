package org.xmdl.core.templates.ui.web;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.ui.web.impl.ConstantsImpl;


public class Constants 
		extends ConstantsImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = (XPackage) object;
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/ui/web/action/");
		
		buffer.append("Constants.java");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XPackage); 
	}


}
