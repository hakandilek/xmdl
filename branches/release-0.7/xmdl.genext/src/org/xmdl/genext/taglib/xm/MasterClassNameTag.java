package org.xmdl.genext.taglib.xm;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;
import org.xmdl.genext.taglib.MetadataTagUtils;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;

/**
 * This tag checks whether the given element is a Master attribute or class.
 * 
 * @author Hakan Dilek
 * 
 */
public class MasterClassNameTag extends BaseEmptyTag {

	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {
		Object object = fetchObject(context, "element");

		String eval = "";
		if (object instanceof XClass) {
			XClass xClass = (XClass) object;
			if (MetadataTagUtils.isChild(xClass)) {
				XClass master = MetadataTagUtils.getMaster(xClass);
	            eval =  ClassTagUtils.capName(master);
			}
		} else if (object instanceof XAttribute) {
			XAttribute xAttribute = (XAttribute) object;
			if (MetadataTagUtils.isChild(xAttribute)) {
				XClass master = MetadataTagUtils.getMaster(xAttribute);
	            eval =  ClassTagUtils.capName(master);
			}
		}
		out.write(eval);
	}

}
