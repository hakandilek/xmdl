package org.xmdl.core.templates.build;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.build.impl.POMImpl;


public class POM extends POMImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		
	
		return "pom.xml";
	}

	public boolean accept(Object object) {
		return (object instanceof XProject) ;
	}
}
