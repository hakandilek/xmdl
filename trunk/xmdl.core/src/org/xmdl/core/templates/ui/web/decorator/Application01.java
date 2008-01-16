package org.xmdl.core.templates.ui.web.decorator;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.decorator.impl.Application01Impl;


public class Application01 
		extends Application01Impl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("decorators/application01.jsp");	
		
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
