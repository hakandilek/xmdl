package org.xmdl.genext.taglib.xc;

import java.util.Locale;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;

/**
 * This tag capitalizes the first character in the name of the given element.
 * 
 * @author Hakan Dilek
 * 
 */
public class UncapitalizeTag extends BaseEmptyTag {

    public UncapitalizeTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "element");

        String s = "";
        if (object instanceof XClass) {
            XClass xClass = (XClass) object;
            s = getUncapName(xClass);
        }

        if (object instanceof XAttribute) {
            XAttribute xAttribute = (XAttribute) object;
            s = getUncapName(xAttribute);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = getUncapName(enumeration);
        }

        out.write(s);
    }

    public String getUncapName(XEnumeration xClass) {
        return uncapName(xClass.getName());
    }

    public String getUncapName(XClass xClass) {
        return uncapName(xClass.getName());
    }

    public String getUncapName(XAttribute attribute) {
        return uncapName(attribute.getName());
    }

    public String uncapName(String name) {
        if (name.length() == 0)
            return name;
        else
            return name.substring(0, 1).toLowerCase(Locale.US)
                    + name.substring(1);
    }

}
