package org.xmdl.genext.taglib.xc;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XEnumerationLiteral;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlTypes;

/**
 * This tag returns the the accessor (e.g. isSafe or getSafe) according to the
 * attribute type.
 * 
 * @author Hakan Dilek
 * 
 */
public class DefaultValueTag extends BaseEmptyTag {

    public DefaultValueTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            XType type = attribute.getType();
            String result = "";
            if (XmdlTypes.LONG.equals(type))
                result = "0L";
            else if (XmdlTypes.JAVA_LONG.equals(type))
                result = "0L";
            else if (XmdlTypes.INT.equals(type))
                result = "0";
            else if (XmdlTypes.JAVA_INTEGER.equals(type))
                result = "0";
            else if (XmdlTypes.DOUBLE.equals(type))
                result = "0d";
            else if (XmdlTypes.JAVA_DOUBLE.equals(type))
                result = "0d";
            else if (XmdlTypes.BOOLEAN.equals(type))
                result = "false";
            else if (XmdlTypes.JAVA_BOOLEAN.equals(type))
                result = "false";
            else if (type instanceof XEnumeration) {
                XEnumeration xenum = (XEnumeration) type;
                XEnumerationLiteral defaultLiteral = xenum.getDefaultLiteral();
                if (defaultLiteral != null) {
                    result = TagUtils.capName(xenum) + "."
                            + defaultLiteral.getName();
                }
            } else
                result = attribute.getDefaultValue() + "";
            out.write(result);
        }

    }

}
