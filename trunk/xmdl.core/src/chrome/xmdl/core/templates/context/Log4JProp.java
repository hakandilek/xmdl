package chrome.xmdl.core.templates.context;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.context.impl.Log4JPropImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

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
