package org.xmdl.ida.templates.core.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * Default data template file
 * 
 * @author Hakan Dilek
 *
 */
public class DefaultDataXML extends DefaultDataXMLImpl implements Template {

	@Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer("core/src/main/resources/default-data.xml");
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
