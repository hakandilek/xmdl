package org.xmdl.genext.taglib.xc;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;

import chrome.xmdl.XAttribute;

/**
 * This tag returns the the mutator name (e.ggetSafe) of the attribute.
 * 
 * @author Hakan Dilek
 * 
 */
public class MutatorTag extends BaseEmptyTag {

    public MutatorTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            String capName = ClassTagUtils.capName(attribute);
            String result = "set"
                    + ("Class".equals(capName) ? "Class_" : capName);
            out.write(result);
        }

    }

}
