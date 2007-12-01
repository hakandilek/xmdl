package org.xmdl.ida.templates.core.test.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * Struts configuration for resource context template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextResourcesXML extends ApplicationContextResourcesXMLImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("core/src/test/resources/applicationContext-resources.xml");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

	@Override
	public String parameterName() {
		return "project";
	}


}
