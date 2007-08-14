package chrome.xmdl.core.templates.ui.web.jsp.part;

import chrome.xmdl.XAttribute;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.ui.web.jsp.part.impl.FormFieldDefaultImpl;
import chrome.xmdl.core.templates.ui.web.jsp.part.impl.FormFieldDoubleImpl;
import chrome.xmdl.core.templates.ui.web.jsp.part.impl.SearchFormFieldDateImpl;
import chrome.xmdl.core.templates.ui.web.jsp.part.impl.SearchFormFieldDoubleImpl;

public class SearchFormFieldDate extends SearchFormFieldDateImpl
		implements Template {

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
