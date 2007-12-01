package org.xmdl.ida.templates.core.rsc;

import chrome.xmdl.XPackage;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * Struts configuration for DAO context template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ApplicationContextDAOXML extends ApplicationContextDAOXMLImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		XPackage p = (XPackage) object;
		StringBuffer buffer = new StringBuffer("core/src/main/resources/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		buffer.append(path);
		buffer.append("applicationContext-dao.xml");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		return (object instanceof XPackage);
	}

	@Override
	public String parameterName() {
		return "package";
	}

}
