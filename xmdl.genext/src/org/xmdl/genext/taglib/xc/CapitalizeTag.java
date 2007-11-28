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
public class CapitalizeTag extends BaseEmptyTag {

    public CapitalizeTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "element");

        String s = "";
        if (object instanceof XClass) {
            XClass xClass = (XClass) object;
            s = getCapName(xClass);
        }

        if (object instanceof XAttribute) {
            XAttribute xAttribute = (XAttribute) object;
            s = getCapName(xAttribute);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = getCapName(enumeration);
        }

        out.write(s);
    }

    public String getCapName(XEnumeration xClass) {
        return capName(xClass.getName());
    }

    public String getCapName(XClass xClass) {
        return capName(xClass.getName());
    }

    public String getCapName(XAttribute attribute) {
        return capName(attribute.getName());
    }

    public String capName(String name) {
        if (name.length() == 0)
            return name;
        else
            return name.substring(0, 1).toUpperCase(Locale.US)
                    + name.substring(1);
    }

}
