package org.xmdl.ida.templates.core.rsc;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XPackage;


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
		buffer.append("/applicationContext-service.xml");
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
