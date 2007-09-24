package chrome.xmdl.core.templates.ui.web;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.impl.StrutsLayoutImpl;

public class StrutsLayout 
		extends StrutsLayoutImpl 
		implements Template{

	public String targetFile(Object object) {
		StringBuffer buffer= new StringBuffer("rsc/");
		buffer.append("Struts-Layout.properties");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject);
	}


}
