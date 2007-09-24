package chrome.xmdl.core.util;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlTypes;
import chrome.xmdl.core.templates.ui.web.jsp.part.*;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

public abstract class UIHelper {

	public static final Template getEditFormFieldTemplate(XAttribute attribute) {
		XType type = attribute.getType();
		if (type.equals(XmdlTypes.DOUBLE) || type.equals(XmdlTypes.FLOAT)
				|| type.equals(XmdlTypes.JAVA_DOUBLE)
				|| type.equals(XmdlTypes.JAVA_FLOAT)) {
			return new FormFieldDouble();
		} else if (type.equals(XmdlTypes.JAVA_DATE)
				|| type.equals(XmdlTypes.JAVA_DATETIME)) {
			return new FormFieldDate();
		} else if (type.equals(XmdlTypes.BOOLEAN)
				|| type.equals(XmdlTypes.JAVA_BOOLEAN)) {
			return new FormFieldBoolean();
		} else if (type instanceof XEnumeration) {
			return new FormFieldEnumeration();
		} else {
			return new FormFieldDefault();
		}
	}

	public static final Template getSearchFormFieldTemplate(XAttribute attribute) {
		XType type = attribute.getType();
		boolean comparable = type.isComparable();

		if (type.equals(XmdlTypes.DOUBLE) || type.equals(XmdlTypes.FLOAT)
				|| type.equals(XmdlTypes.JAVA_DOUBLE)
				|| type.equals(XmdlTypes.JAVA_FLOAT)) {
			return new SearchFormFieldDouble();
		} else if (type.equals(XmdlTypes.JAVA_DATE)
				|| type.equals(XmdlTypes.JAVA_DATETIME)) {
			return new SearchFormFieldDate();
		} else if (type.equals(XmdlTypes.BOOLEAN)
				|| type.equals(XmdlTypes.JAVA_BOOLEAN)) {
			return new FormFieldBoolean();
		} else if (type instanceof XEnumeration) {
			return new FormFieldEnumeration();
		} else if (comparable) {
			return new FormFieldDefault();
		} else {
			return new FormFieldDefault();
		}
	}

	public static final String formObject(XClass xClass) {
		return XMDLClassHelper.INSTANCE.uncapSafeName(xClass);
	}
}
