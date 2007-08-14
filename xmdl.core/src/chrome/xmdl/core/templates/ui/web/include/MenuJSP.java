package chrome.xmdl.core.templates.ui.web.include;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.include.impl.HeaderJSPImpl;
import chrome.xmdl.core.templates.ui.web.include.impl.HomeJSPImpl;
import chrome.xmdl.core.templates.ui.web.include.impl.MenuJSPImpl;

public class MenuJSP extends MenuJSPImpl implements Template {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XProject xProject = (XProject) object;
		

		buffer.append("include/menu.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
