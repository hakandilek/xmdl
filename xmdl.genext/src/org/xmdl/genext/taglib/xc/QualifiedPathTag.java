package org.xmdl.genext.taglib.xc;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;

import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;

public class QualifiedPathTag extends BaseEmptyTag {

    public QualifiedPathTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "element");

        String s = "";
        if (object instanceof XProject) {
            XProject project = (XProject) object;
            s = project.getName();
        }

        if (object instanceof XClass) {
            XClass xClass = (XClass) object;
            s = ClassTagUtils.qualifiedPath(xClass);
        }

        if (object instanceof XPackage) {
            XPackage xPackage = (XPackage) object;
            s = ClassTagUtils.qualifiedPath(xPackage);
        }

        if (object instanceof XEnumeration) {
            XEnumeration enumeration = (XEnumeration) object;
            s = ClassTagUtils.qualifiedPath(enumeration);
        }

        out.write(s);

    }

}
