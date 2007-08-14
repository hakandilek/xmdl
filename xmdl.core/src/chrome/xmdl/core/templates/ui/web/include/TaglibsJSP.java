package chrome.xmdl.core.templates.ui.web.include;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.include.impl.HeaderJSPImpl;
import chrome.xmdl.core.templates.ui.web.include.impl.HomeJSPImpl;
import chrome.xmdl.core.templates.ui.web.include.impl.TaglibsJSPImpl;

public class TaglibsJSP extends TaglibsJSPImpl implements Template {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XProject xProject = (XProject) object;

		buffer.append("include/taglibs.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
