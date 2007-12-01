package org.xmdl.genext.taglib.xc;


import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;

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
            s = ClassTagUtils.capName(xClass);
        }

        if (object instanceof XAttribute) {
            XAttribute xAttribute = (XAttribute) object;
            s = ClassTagUtils.capName(xAttribute);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = ClassTagUtils.capName(enumeration);
        }

        out.write(s);
    }

}
