package org.xmdl.ida.templates.core.test.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * Log4J configuration (log4j.xml) template file
 * 
 * @author Hakan Dilek
 * 
 */
public class CoreTestLog4jXML extends Log4jXMLImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("core/src/test/resources/log4j.xml");
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
