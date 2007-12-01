package chrome.xmdl.core.templates.ui.web.include;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.include.impl.HeaderJSPImpl;

public class HeaderJSP extends HeaderJSPImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("include/header.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}