package org.xmdl.genext.taglib.tu;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.MissingAttributeException;
import org.xmdl.genext.taglib.TestTagUtils;
import org.xmdl.xmdl.XAttribute;


/**
 * This tag returns a random value that is assigned to the given attribute.
 * 
 * @author Hakan Dilek
 * 
 */
public class RandomPlainTag extends BaseEmptyTag {

    public RandomPlainTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        String result = "";
        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            int trim = 0;
            String trimString = null;

            String formatString = null;

            String variantString = null;
            
            try {
                trimString = fetchAttribute("trim");
            } catch (MissingAttributeException e) {
                // ignore optional variables
            }

            try {
                formatString = fetchAttribute("format");
            } catch (MissingAttributeException e) {
                // ignore optional variables
            }

            try {
                variantString = fetchAttribute("variant");
            } catch (MissingAttributeException e) {
                // ignore optional variables
            }

            try {
                trim = trimString == null ? 0 : Integer.parseInt(trimString);
            } catch (RuntimeException e) {
                // ignore
            }

            if (trim > 0) {
                result = TestTagUtils.plainRandomValueTrimmed(attribute, variantString, trim);
            } else {
                result = TestTagUtils.plainRandomValue(attribute, variantString, formatString);
            }
        }
        out.write(result);
    }

}
