package chrome.xmdl.core.templates.ui.web.jsp;

import chrome.xmdl.XClass;
import chrome.xmdl.XProject;
import chrome.xmdl.XmdlUtils;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.jsp.impl.EntityEditJSPImpl;

public class EntityEditJSP extends EntityEditJSPImpl implements Template {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XClass xClass = (XClass) object;
		XProject xProject = XmdlUtils.findProjectOf(xClass);
		

		buffer.append(xClass.getName());
		buffer.append("/");
		buffer.append("edit.jsp");
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
