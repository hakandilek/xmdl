package org.xmdl.genext.taglib.xc;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;
import org.xmdl.genext.taglib.MissingAttributeException;

import chrome.xmdl.XAttribute;

/**
 * This tag returns the type of the given attribute. *-to-many associations
 * produce a generics type of output (e.g. Set<T>).
 * 
 * @author Hakan Dilek
 * 
 */
public class AttributeTypeTag extends BaseEmptyTag {

    public AttributeTypeTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object attObject = fetchObject(context, "attribute");

        boolean wrapType = false;
        String wrapString = null;
        try {
            wrapString = fetchAttribute("wrapType");
            wrapType = wrapString != null
                    && Boolean.valueOf(wrapString).booleanValue();
        } catch (MissingAttributeException e) {
            // ignore optional variables
        } catch (RuntimeException e) {
            // ignore
        }

        String result = "";
        if (attObject instanceof XAttribute) {
            XAttribute attribute = (XAttribute) attObject;
            result = ClassTagUtils.importType(attribute, wrapType);
        }
        out.write(result);
    }

}
