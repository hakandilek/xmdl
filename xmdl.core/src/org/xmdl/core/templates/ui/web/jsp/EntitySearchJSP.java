package org.xmdl.core.templates.ui.web.jsp;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XClass;
import org.xmdl.core.templates.ui.web.jsp.impl.EntitySearchJSPImpl;


public class EntitySearchJSP extends EntitySearchJSPImpl implements TemplateConfiguration {

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
