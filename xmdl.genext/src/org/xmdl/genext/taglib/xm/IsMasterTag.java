package org.xmdl.genext.taglib.xm;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseConditionalTag;
import org.xmdl.genext.taglib.MetadataTagUtils;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;

/**
 * This tag checks whether the given element is a Master attribute or class.
 * 
 * @author Hakan Dilek
 * 
 */
public class IsMasterTag extends BaseConditionalTag {

	@Override
	public boolean doEvalCondition(TagInfo td, JET2Context context)
			throws JET2TagException {
		Object object = fetchObject(context, "element");

		boolean eval = false;
		if (object instanceof XClass) {
			XClass xClass = (XClass) object;
			eval = MetadataTagUtils.isMaster(xClass);
		} else if (object instanceof XAttribute) {
			XAttribute xAttribute = (XAttribute) object;
			eval = MetadataTagUtils.isMaster(xAttribute);
		}

		return eval;
	}

}
