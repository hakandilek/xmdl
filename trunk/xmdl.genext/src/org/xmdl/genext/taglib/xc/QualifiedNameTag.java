package org.xmdl.genext.taglib.xc;

import java.util.Locale;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XPackage;

public class QualifiedNameTag extends BaseEmptyTag {

    public QualifiedNameTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "element");

        String s = "";
        if (object instanceof XClass) {
            XClass xClass = (XClass) object;
            s = getQualifiedName(xClass);
        }

        if (object instanceof XPackage) {
            XPackage xPackage = (XPackage) object;
            s = getQualifiedName(xPackage);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = qualifiedName(enumeration);
        }

        out.write(s);

    }

    protected String qualifiedName(XEnumeration enumeration) {
        String name = capName(enumeration.getName());
        XPackage package1 = enumeration.getXPackage();
        if (package1 != null) {
            String pn = getQualifiedName(package1);
            if (!"".equals(pn))
                name = pn + "." + name;
        }
        return name;
    }

    protected String getQualifiedName(XPackage package1) {
        String name = package1.getName();
        name = uncapName(name);
        name = name.replaceAll("/", ".");
        return name;
    }

    protected String getQualifiedName(XClass class1) {
        String name = capName(class1.getName());
        XPackage package1 = class1.getXPackage();
        if (package1 != null) {
            String pn = getQualifiedName(package1);
            if (!"".equals(pn))
                name = pn + "." + name;
        }
        return name;
    }

    public String uncapName(String name) {
        if (name == null)
            return "";
        if (name.length() == 0)
            return name;
        else
            return name.substring(0, 1).toLowerCase(Locale.US)
                    + name.substring(1);
    }

    public String capName(String name) {
        if (name == null)
            return "";
        if (name.length() == 0)
            return name;
        else
            return name.substring(0, 1).toUpperCase(Locale.US)
                    + name.substring(1);
    }

}
