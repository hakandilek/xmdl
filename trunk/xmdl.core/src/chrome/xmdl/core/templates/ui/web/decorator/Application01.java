package chrome.xmdl.core.templates.ui.web.decorator;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.decorator.impl.Application01Impl;

public class Application01 
		extends Application01Impl 
		implements Template{

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XProject xProject = (XProject) object;
		

		buffer.append("decorators/application01.jsp");	
		
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject); 
	}


}
