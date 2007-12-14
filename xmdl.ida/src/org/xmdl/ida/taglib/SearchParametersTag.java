package org.xmdl.ida.taglib;

import java.util.Iterator;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XType;

/**
 * Outputs the search method parameters for the given class
 * 
 * @author Hakan Dilek
 * 
 */
public class SearchParametersTag extends BaseEmptyTag {

    public SearchParametersTag() {
    }

    @Override
    public void doAction(TagInfo info, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "class");
        boolean omitType = false;
        try {
            String omitTypeStr = fetchAttribute("omitType");
            omitType = Boolean.parseBoolean(omitTypeStr);
        } catch (Exception e) {
            // simply ignore
        }

        if (object instanceof XClass) {
            XClass clazz = (XClass) object;
            StringBuffer params = new StringBuffer();
            for (Iterator<XAttribute> i = clazz.getAttributes().iterator(); i
                    .hasNext();) {
                XAttribute attribute = i.next();
                if (!attribute.isReference()) {
                    XType type = attribute.getType();
                    boolean comparable = type.isComparable();
                    if (comparable) {
                        if (!omitType)
                            params.append(ClassTagUtils.importType(attribute, true));
                        params.append(" min");
                        params.append(ClassTagUtils.capName(attribute));
                        params.append(", ");
                        if (!omitType)
                            params.append(ClassTagUtils.importType(attribute, true));
                        params.append(" max");
                        params.append(ClassTagUtils.capName(attribute));
                    } else {
                        if (!omitType)
                            params.append(ClassTagUtils.importType(attribute, true));
                        params.append(" ");
                        params.append(ClassTagUtils.uncapName(attribute));
                    }
                    if (i.hasNext())
                        params.append(", ");
                }
            }// for
            out.write(params);
        }
    }

}
