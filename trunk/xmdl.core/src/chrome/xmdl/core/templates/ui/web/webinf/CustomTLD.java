package chrome.xmdl.core.templates.ui.web.webinf;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.ui.web.webinf.impl.CustomTLDImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class CustomTLD 
		extends CustomTLDImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		
		StringBuffer buffer = new StringBuffer("web/");		
		XProject project = (XProject) object;


		buffer.append("WEB-INF/");
		buffer.append(project.getName());
		buffer.append("-custom.tld");

		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
