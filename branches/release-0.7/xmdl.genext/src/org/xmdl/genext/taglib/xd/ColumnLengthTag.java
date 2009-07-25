package org.xmdl.genext.taglib.xd;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.meta.MetaModelFinder;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdldb.DField;


/**
 * Output the length of the column/field from the DB model corresponding to the
 * given attribute
 * 
 * @author Hakan Dilek
 * 
 */
public class ColumnLengthTag extends BaseEmptyTag {

    public ColumnLengthTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {
        Object object = fetchObject(context, "attribute");

        int len = 0;
        String result = "";
        if (object instanceof XAttribute) {
            XAttribute attribute = (XAttribute) object;
            DField col = MetaModelFinder.findColumn(attribute);
            if (col != null) {
                len = col.getLength();
                result = "" + len;
            }
        }
        out.write(result);

    }

}
