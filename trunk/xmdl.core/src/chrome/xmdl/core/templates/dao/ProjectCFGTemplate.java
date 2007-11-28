package chrome.xmdl.core.templates.dao;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.dao.hbm.impl.ProjectCFGTemplateImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class ProjectCFGTemplate extends ProjectCFGTemplateImpl implements TemplateConfiguration{

	public String targetFile(Object object) {
		//XProject p=(XProject) object;
		StringBuffer buffer= new StringBuffer("rsc/");
		//buffer.append(p.getName());
		buffer.append("hibernate");
		buffer.append(".cfg.xml");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return object instanceof XProject;
	}
	

}
