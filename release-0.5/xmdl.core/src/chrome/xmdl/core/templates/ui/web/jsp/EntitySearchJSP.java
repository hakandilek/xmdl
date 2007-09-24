package chrome.xmdl.core.templates.ui.web.jsp;

import chrome.xmdl.XClass;
import chrome.xmdl.core.templates.ui.web.jsp.impl.EntitySearchJSPImpl;
import chrome.xmdl.xgen.Template;

public class EntitySearchJSP extends EntitySearchJSPImpl implements Template {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XClass xClass = (XClass) object;

		buffer.append(xClass.getName());
		buffer.append("/");
		buffer.append("search.jsp");
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
