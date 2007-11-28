package org.xmdl.genext.taglib.xc;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XType;

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
        Object object = fetchObject(context, "attribute");

        if (object instanceof XAttribute) {
            XAttribute xAttribute = (XAttribute) object;
            XAssociationType associationType = xAttribute.getAssociationType();
            boolean association = (XAssociationType.ONE_TO_MANY_LITERAL == associationType || XAssociationType.MANY_TO_MANY_LITERAL == associationType);
            if (association) {
                out.write("Set<");
            }
            XType type = xAttribute.getType();
            String name = type.getName();
            out.write(name);
            if (association) {
                out.write(">");
            }
        }

    }

}
