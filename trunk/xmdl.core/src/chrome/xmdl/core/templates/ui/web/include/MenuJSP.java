package chrome.xmdl.core.templates.ui.web.include;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.ui.web.include.impl.MenuJSPImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class MenuJSP extends MenuJSPImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("include/menu.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
