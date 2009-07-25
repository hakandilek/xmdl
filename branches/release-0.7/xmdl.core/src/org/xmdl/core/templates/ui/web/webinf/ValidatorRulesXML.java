package org.xmdl.core.templates.ui.web.webinf;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.webinf.impl.ValidatorRulesXMLImpl;


public class ValidatorRulesXML 
		extends ValidatorRulesXMLImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("WEB-INF/");
		buffer.append("validator-rules.xml");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
