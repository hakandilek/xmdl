package org.xmdl.core.templates.ui.web.jsp.part;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.core.templates.ui.web.jsp.part.impl.FormFieldDefaultImpl;


public class FormFieldDefault extends FormFieldDefaultImpl  
		implements TemplateConfiguration {

	public String targetFile(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean accept(Object object) {
		if (object instanceof XAttribute) {
			return true;
		}
		return false;
	}

}
