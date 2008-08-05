package org.xmdl.genext.taglib.xc;

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.taglib.AbstractIteratingTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.xpath.NodeSet;
import org.xmdl.genext.internal.l10n.GenExtMessages;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;

/**
 * This tag iterated attributes of the given class
 * 
 * @author hakan
 *
 */
public class IterateAttributesTag extends AbstractIteratingTag {

	private List<XAttribute> attribs;

	private int currentIndex;

	private String varName;

	private Object savedVarValue = null;

	private boolean nodeSetIteration;

	private long maxIterations = 0;

	public IterateAttributesTag() {
	}

	@Override
	public boolean doEvalLoopCondition(TagInfo td, JET2Context context)
			throws JET2TagException {
		boolean doAnotherIteration = currentIndex < maxIterations;

		if (doAnotherIteration) {
			if (nodeSetIteration) {
				XAttribute attrib = attribs.get(currentIndex);
				context.setVariable(varName, attrib);
			} else {
				context.setVariable(varName, new Long(currentIndex + 1));
			}
			// writeDelimiterIfAppropriate();
		} else {
			context.removeVariable(varName);
			if (savedVarValue != null) {
				context.setVariable(varName, savedVarValue);
			}
		}

		currentIndex++;

		return doAnotherIteration;
	}

	@Override
	public void doInitializeLoop(TagInfo td, JET2Context context)
			throws JET2TagException {
		String selectXPath = getAttribute("select"); //$NON-NLS-1$
		varName = getAttribute("var"); //$NON-NLS-1$

		setDelimiter(getAttribute("delimiter")); //$NON-NLS-1$

		XPathContextExtender xpathContext = XPathContextExtender
				.getInstance(context);

		if (context.hasVariable(varName)) {
			savedVarValue = context.getVariable(varName);
		}

		final Object resultObject = xpathContext.resolveAsObject(xpathContext
				.currentXPathContextObject(), selectXPath);
		if (resultObject instanceof NodeSet) {
			nodeSetIteration = true;
			NodeSet result = (NodeSet) resultObject;
			if (result.size() != 1) {
				Object[] param = new Object[] { selectXPath };
				String message = MessageFormat.format(
						GenExtMessages.IterateTablesTag_CannotIterateOnResult,
						param);
				throw new JET2TagException(message);
			}
			Object next = result.iterator().next();
			if (next instanceof XClass) {
				XClass cls = (XClass) next;
				try {
					List<XAttribute> selectedAttributes = cls.getAttributes();
					attribs = selectedAttributes;
					maxIterations = attribs.size();
				} catch (RuntimeException e) {
					Object[] param = new Object[] { selectXPath };
					String message = MessageFormat.format(
							GenExtMessages.IterateTablesTag_CannotIterateOnResult,
							param);
					throw new JET2TagException(message);
				}
			} else {
				Object[] param = new Object[] { selectXPath };
				String message = MessageFormat.format(
						GenExtMessages.IterateTablesTag_CannotIterateOnResult,
						param);
				throw new JET2TagException(message);
			}
		}
		currentIndex = 0;
	}

}
