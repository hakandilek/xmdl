package org.xmdl.core.templates.ui.web.webinf;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.webinf.impl.ValidationXMLImpl;


public class ValidationXML 
		extends ValidationXMLImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("WEB-INF/");
		buffer.append("validation.xml");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
