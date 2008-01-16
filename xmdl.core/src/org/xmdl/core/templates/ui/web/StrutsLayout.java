package org.xmdl.core.templates.ui.web;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.impl.StrutsLayoutImpl;


public class StrutsLayout 
		extends StrutsLayoutImpl 
		implements TemplateConfiguration{

	public String targetFile(Object object) {
		StringBuffer buffer= new StringBuffer("rsc/");
		buffer.append("Struts-Layout.properties");
		return buffer.toString();
	}
	public boolean accept(Object object) {
		return (object instanceof XProject);
	}


}
