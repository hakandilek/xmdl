package chrome.xmdl.core.templates.ui.web.include;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.ui.web.include.impl.TaglibsJSPImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class TaglibsJSP extends TaglibsJSPImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("include/taglibs.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
