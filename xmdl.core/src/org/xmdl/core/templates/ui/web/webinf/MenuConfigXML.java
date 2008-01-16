package org.xmdl.core.templates.ui.web.webinf;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.webinf.impl.MenuConfigXMLImpl;


public class MenuConfigXML 
		extends MenuConfigXMLImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("WEB-INF/");
		buffer.append("menu-config.xml");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
