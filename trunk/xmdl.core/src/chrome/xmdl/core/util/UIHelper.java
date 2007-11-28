package chrome.xmdl.core.util;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlTypes;
import chrome.xmdl.core.templates.ui.web.jsp.part.FormFieldBoolean;
import chrome.xmdl.core.templates.ui.web.jsp.part.FormFieldDate;
import chrome.xmdl.core.templates.ui.web.jsp.part.FormFieldDefault;
import chrome.xmdl.core.templates.ui.web.jsp.part.FormFieldDouble;
import chrome.xmdl.core.templates.ui.web.jsp.part.FormFieldEnumeration;
import chrome.xmdl.core.templates.ui.web.jsp.part.SearchFormFieldDate;
import chrome.xmdl.core.templates.ui.web.jsp.part.SearchFormFieldDouble;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;
import chrome.xmdl.xgen.TemplateAdapter;

public abstract class UIHelper {

	public static final Template getEditFormFieldTemplate(
            XAttribute attribute) {
        XType type = attribute.getType();
        if (type.equals(XmdlTypes.DOUBLE) || type.equals(XmdlTypes.FLOAT)
                || type.equals(XmdlTypes.JAVA_DOUBLE)
                || type.equals(XmdlTypes.JAVA_FLOAT)) {
            return new TemplateAdapter(new FormFieldDouble());
        } else if (type.equals(XmdlTypes.JAVA_DATE)
                || type.equals(XmdlTypes.JAVA_DATETIME)) {
            return new TemplateAdapter(new FormFieldDate());
        } else if (type.equals(XmdlTypes.BOOLEAN)
                || type.equals(XmdlTypes.JAVA_BOOLEAN)) {
            return new TemplateAdapter(new FormFieldBoolean());
        } else if (type instanceof XEnumeration) {
            return new TemplateAdapter(new FormFieldEnumeration());
        } else {
            return new TemplateAdapter(new FormFieldDefault());
        }
    }

	public static final Template getSearchFormFieldTemplate(XAttribute attribute) {
        XType type = attribute.getType();
        boolean comparable = type.isComparable();

        if (type.equals(XmdlTypes.DOUBLE) || type.equals(XmdlTypes.FLOAT)
                || type.equals(XmdlTypes.JAVA_DOUBLE)
                || type.equals(XmdlTypes.JAVA_FLOAT)) {
            return new TemplateAdapter(new SearchFormFieldDouble());
        } else if (type.equals(XmdlTypes.JAVA_DATE)
                || type.equals(XmdlTypes.JAVA_DATETIME)) {
            return new TemplateAdapter(new SearchFormFieldDate());
        } else if (type.equals(XmdlTypes.BOOLEAN)
                || type.equals(XmdlTypes.JAVA_BOOLEAN)) {
            return new TemplateAdapter(new FormFieldBoolean());
        } else if (type instanceof XEnumeration) {
            return new TemplateAdapter(new FormFieldEnumeration());
        } else if (comparable) {
            return new TemplateAdapter(new FormFieldDefault());
        } else {
            return new TemplateAdapter(new FormFieldDefault());
        }
    }

	public static final String formObject(XClass xClass) {
		return XMDLClassHelper.INSTANCE.uncapSafeName(xClass);
	}
}
