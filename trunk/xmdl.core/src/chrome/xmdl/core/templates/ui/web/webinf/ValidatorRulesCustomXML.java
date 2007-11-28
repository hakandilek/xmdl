package chrome.xmdl.core.templates.ui.web.webinf;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.webinf.impl.ValidatorRulesCustomXMLImpl;

public class ValidatorRulesCustomXML 
		extends ValidatorRulesCustomXMLImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("WEB-INF/");
		buffer.append("validator-rules-custom.xml");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
