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
import chrome.xmdl.XEnumerationLiteral;

/**
 * This tag makes lower-case the first character in the name of the given
 * element.
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
            s = ClassTagUtils.uncapName(xClass);
        }

        if (object instanceof XAttribute) {
            XAttribute xAttribute = (XAttribute) object;
            s = ClassTagUtils.uncapName(xAttribute);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = ClassTagUtils.uncapName(enumeration);
        }

        if (object instanceof XEnumerationLiteral) {
            XEnumerationLiteral literal = (XEnumerationLiteral) object;
            s = ClassTagUtils.uncapName(literal);
        }
        out.write(s);
    }

}
