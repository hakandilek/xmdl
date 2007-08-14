package chrome.xmdl.core.templates.ui.web;

import chrome.xmdl.XPackage;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.impl.ParameterKeysImpl;

public class ParameterKeys 
		extends ParameterKeysImpl 
		implements Template{

	public String targetFile(Object object) {
		
		StringBuffer buffer=  new StringBuffer("src");
		XPackage package1 = (XPackage) object;
		String t=package1.getName().replace(".","/");
		if(!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/ui/web/action/");
		
		buffer.append("ParameterKeys.java");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XPackage); 
	}


}
