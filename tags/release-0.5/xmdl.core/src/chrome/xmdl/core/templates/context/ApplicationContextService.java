package chrome.xmdl.core.templates.context;

import chrome.xmdl.XPackage;
import chrome.xmdl.core.templates.context.impl.ApplicationContextServiceImpl;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

public class ApplicationContextService extends ApplicationContextServiceImpl
		implements Template {

	public String targetFile(Object object) {
		XPackage p = (XPackage) object;
		StringBuffer buffer = new StringBuffer("rsc/");
		String path = XMDLClassHelper.INSTANCE.getQualifiedPath(p);
		buffer.append(path);
		buffer.append("/");
		buffer.append("applicationContext-service.xml");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XPackage);
	}

}