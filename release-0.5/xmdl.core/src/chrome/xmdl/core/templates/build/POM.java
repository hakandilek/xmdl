package chrome.xmdl.core.templates.build;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.build.impl.POMImpl;
import chrome.xmdl.xgen.Template;

public class POM extends POMImpl implements Template {

	public String targetFile(Object object) {
		
	
		return "pom.xml";
	}

	public boolean accept(Object object) {
		return (object instanceof XProject) ;
	}
}
