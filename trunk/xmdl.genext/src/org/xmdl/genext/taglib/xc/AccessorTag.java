package org.xmdl.genext.taglib.xc;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XAttribute;

/**
 * This tag returns the the accessor (e.g. isSafe or getSafe) according to the
 * attribute type.
 * 
 * @author Hakan Dilek
 * 
 */
public class AccessorTag extends BaseEmptyTag {

    public AccessorTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            String capName = TagUtils.capName(attribute);
            String result = TagUtils.isBooleanType(attribute.getType()) ? "is"
                    + capName : "get"
                    + ("Class".equals(capName) ? "Class_" : capName);
            out.write(result);
        }

    }

}
