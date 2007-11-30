package org.xmdl.genext.taglib.xc;

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
            s = TagUtils.qualifiedName(xClass);
        }

        if (object instanceof XPackage) {
            XPackage xPackage = (XPackage) object;
            s = TagUtils.qualifiedName(xPackage);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = TagUtils.qualifiedName(enumeration);
        }

        out.write(s);

    }

}
