package org.xmdl.core.templates.ui.web.include;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.include.impl.TaglibsJSPImpl;


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
