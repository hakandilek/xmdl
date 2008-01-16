package org.xmdl.core.templates.ui.web.include;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.ui.web.include.impl.FooterJSPImpl;


public class FooterJSP extends FooterJSPImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("include/footer.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
