package org.xmdl.core.util;

import org.xmdl.core.templates.ui.web.jsp.part.FormFieldBoolean;
import org.xmdl.core.templates.ui.web.jsp.part.FormFieldDate;
import org.xmdl.core.templates.ui.web.jsp.part.FormFieldDefault;
import org.xmdl.core.templates.ui.web.jsp.part.FormFieldDouble;
import org.xmdl.core.templates.ui.web.jsp.part.FormFieldEnumeration;
import org.xmdl.core.templates.ui.web.jsp.part.SearchFormFieldDate;
import org.xmdl.core.templates.ui.web.jsp.part.SearchFormFieldDouble;
import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xgen.TemplateAdapter;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;


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
