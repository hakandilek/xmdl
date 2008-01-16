package org.xmdl.core.templates.dao;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.dao.hbm.impl.ProjectCFGTemplateImpl;


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
