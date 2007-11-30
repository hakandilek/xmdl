package org.xmdl.genext.taglib.tu;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.MissingAttributeException;

import chrome.xmdl.XAttribute;

/**
 * This tag returns a random value that is assigned to the given attribute.
 * 
 * @author Hakan Dilek
 * 
 */
public class RandomTag extends BaseEmptyTag {

    public RandomTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        String result = "";
        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            boolean wrap = false;
            int trim = 0;
            String wrapString = null;
            String trimString = null;

            try {
                wrapString = fetchAttribute("wrapString");
            } catch (MissingAttributeException e) {
                // ignore optional variables
            }
            try {
                trimString = fetchAttribute("trim");
            } catch (MissingAttributeException e) {
                // ignore optional variables
            }

            try {
                wrap = wrapString != null
                        && Boolean.valueOf(wrapString).booleanValue();
            } catch (RuntimeException e) {
                // ignore
            }

            try {
                trim = trimString == null ? 0 : Integer.parseInt(trimString);
            } catch (RuntimeException e) {
                // ignore
            }

            if (trim > 0) {
                result = TestTagUtils.randomValueTrimmed(attribute, trim);
            } else if (wrap) {
                result = TestTagUtils.randomValueString(attribute);
            } else {
                result = TestTagUtils.randomValuePlain(attribute);
            }
        }
        out.write(result);
    }

}
