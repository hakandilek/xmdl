package org.xmdl.core.templates.context;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.context.impl.Log4JPropImpl;


public class Log4JProp extends Log4JPropImpl implements TemplateConfiguration{

	public String targetFile(Object object) {
		StringBuffer buffer= new StringBuffer("rsc/");
		buffer.append("log4j.properties");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject) ;
	}

}
