package chrome.xmdl.core.templates.ui.web.webinf;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.ui.web.webinf.impl.WebXMLImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class WebXML 
		extends WebXMLImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("WEB-INF/");
		buffer.append("web.xml");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
