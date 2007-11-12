package org.xmdl.ida.templates.core.test.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * Struts configuration for test context template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextTestXML extends ApplicationContextTestXMLImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("core/src/test/resources/applicationContext-test.xml");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
