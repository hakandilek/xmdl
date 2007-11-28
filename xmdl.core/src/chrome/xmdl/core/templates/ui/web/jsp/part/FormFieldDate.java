package chrome.xmdl.core.templates.ui.web.jsp.part;

import chrome.xmdl.XAttribute;
import chrome.xmdl.core.templates.ui.web.jsp.part.impl.FormFieldDateImpl;
import chrome.xmdl.xgen.TemplateConfiguration;

public class FormFieldDate extends FormFieldDateImpl
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
