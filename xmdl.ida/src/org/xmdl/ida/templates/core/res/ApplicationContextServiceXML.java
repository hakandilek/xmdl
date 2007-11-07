package org.xmdl.ida.templates.core.res;

import chrome.xmdl.XPackage;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * Struts configuration for service context template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextServiceXML extends
		ApplicationContextServiceXMLImpl implements Template {

	@Override
	public String targetFile(Object object) {
		XPackage p = (XPackage) object;
		StringBuffer buffer = new StringBuffer("core/src/main/resources/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		buffer.append(path);
		buffer.append("applicationContext-service.xml");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		return (object instanceof XPackage);
	}

}
