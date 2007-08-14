package chrome.xmdl.core.templates.ui.web.webinf;

import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.webinf.impl.CustomTLDImpl;
import chrome.xmdl.core.templates.ui.web.webinf.impl.MenuConfigXMLImpl;

public class CustomTLD 
		extends CustomTLDImpl 
		implements Template{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		
		XProject project = (XProject) object;
	    XPackage xPackage = (XPackage) project.getPackages().get(0); 


		buffer.append("WEB-INF/");
		buffer.append(project.getName());
		buffer.append("-custom.tld");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
