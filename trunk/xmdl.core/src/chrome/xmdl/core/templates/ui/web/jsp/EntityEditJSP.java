package chrome.xmdl.core.templates.ui.web.jsp;

import chrome.xmdl.XClass;
import chrome.xmdl.core.templates.ui.web.jsp.impl.EntityEditJSPImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class EntityEditJSP extends EntityEditJSPImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		
		XClass xClass = (XClass) object;

		buffer.append(xClass.getName());
		buffer.append("/");
		buffer.append("edit.jsp");
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
