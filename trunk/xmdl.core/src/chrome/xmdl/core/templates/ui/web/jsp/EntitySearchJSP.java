package chrome.xmdl.core.templates.ui.web.jsp;

import chrome.xmdl.XClass;
import chrome.xmdl.XProject;
import chrome.xmdl.XmdlUtils;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.jsp.impl.EntityEditJSPImpl;
import chrome.xmdl.core.templates.ui.web.jsp.impl.EntitySearchJSPImpl;

public class EntitySearchJSP extends EntitySearchJSPImpl implements Template {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XClass xClass = (XClass) object;
		XProject xProject = XmdlUtils.findProjectOf(xClass);
		

		buffer.append(xClass.getName());
		buffer.append("/");
		buffer.append("search.jsp");
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
