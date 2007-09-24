package chrome.xmdl.core.templates.ui.web.jsp.part;

import chrome.xmdl.XAttribute;
import chrome.xmdl.core.templates.ui.web.jsp.part.impl.SearchFormFieldDateImpl;
import chrome.xmdl.xgen.Template;

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
