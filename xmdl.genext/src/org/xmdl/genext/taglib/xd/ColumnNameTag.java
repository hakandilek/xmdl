package org.xmdl.genext.taglib.xd;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XAttribute;
import chrome.xmdl.meta.MetaModelFinder;
import chrome.xmdldb.DField;

/**
 * Output the name of the column/field from the DB model corresponding to the
 * given attribute
 * 
 * @author Hakan Dilek
 * 
 */
public class ColumnNameTag extends BaseEmptyTag {

    public ColumnNameTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        String result = "";
        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            DField col = MetaModelFinder.findColumn(attribute);
            if (col != null) {
                String name = col.getName();
                result = name;
            }
        }
        out.write(result);

    }

}
