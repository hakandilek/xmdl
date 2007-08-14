package chrome.xmdl.core.templates.ui.web.webinf;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.webinf.impl.WebXMLImpl;

public class WebXML 
		extends WebXMLImpl 
		implements Template{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		
		XProject project = (XProject) object;

		buffer.append("WEB-INF/");
		buffer.append("web.xml");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
