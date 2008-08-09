package org.xmdl.ida.taglib;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseConditionalTag;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdldb.DField;

/**
 * 
 * This tag checks whether the given attribute is an entity reference. The
 * following are threatened as entity references:
 * 
 * <pre>
 * many-to-one associations,
 * references in association tables for many-to-many associations
 * </pre>
 * 
 * @author Hakan Dilek
 * 
 */
public class IsEntityReferenceTag extends BaseConditionalTag {

	public IsEntityReferenceTag() {
	}

	@Override
	public boolean doEvalCondition(TagInfo td, JET2Context context)
			throws JET2TagException {
		Object object = fetchObject(context, "attribute");

		XAttribute attribute = null;
		boolean eval = false;
		if (object instanceof XAttribute) {
			attribute = (XAttribute) object;
		} else if (object instanceof DField) {
			DField field = (DField) object;
			if (field != null)
				attribute = field.getXAttribute();
		}

		if (attribute != null) {
			XAssociationType associationType = attribute.getAssociationType();
			eval = (XAssociationType.MANY_TO_MANY_LITERAL
					.equals(associationType) || XAssociationType.MANY_TO_ONE_LITERAL
					.equals(associationType));
		}

		return eval;
	}
}
