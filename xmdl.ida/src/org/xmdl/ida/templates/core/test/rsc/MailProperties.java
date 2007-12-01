package org.xmdl.ida.templates.core.test.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * Mail configuration (mail.properties) template file
 * 
 * @author Hakan Dilek
 * 
 */
public class MailProperties extends MailPropertiesImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("core/src/test/resources/mail.properties");
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
