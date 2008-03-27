package org.xmdl.genext.taglib.xd;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.taglib.AbstractIteratingTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.xpath.NodeSet;
import org.xmdl.genext.internal.l10n.GenExtMessages;
import org.xmdl.xmdldb.DTable;

public class IterateTablesTag extends AbstractIteratingTag {

	private List<DTable> tables;

	private int currentIndex;

	private String varName;

	private Object savedVarValue = null;

	private boolean nodeSetIteration;

	private long maxIterations = 0;

	public IterateTablesTag() {
	}

	@Override
	public boolean doEvalLoopCondition(TagInfo td, JET2Context context)
			throws JET2TagException {
		boolean doAnotherIteration = currentIndex < maxIterations;

		if (doAnotherIteration) {
			if (nodeSetIteration) {
				DTable table = tables.get(currentIndex);
				context.setVariable(varName, table);
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
		if (resultObject instanceof Number) {
			nodeSetIteration = false;
			maxIterations = ((Number) resultObject).longValue();
		} else if (resultObject instanceof NodeSet) {
			nodeSetIteration = true;
			NodeSet result = (NodeSet) resultObject;
			try {
				@SuppressWarnings("unchecked")
				Collection<DTable> selectedTables = (Collection<DTable>) result;
				tables = sort(selectedTables);
				maxIterations = tables.size();
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
		currentIndex = 0;
	}

	protected List<DTable> sort(Collection<DTable> selectedTables) {
		List<DTable> result = new ArrayList<DTable>();
		List<DTable> assocTables = new ArrayList<DTable>();
		for (DTable table : selectedTables) {
			if (table.getXClass() == null){
				assocTables.add(table);
			} else {
				result.add(table);
			}
		}
		
		for (DTable table : assocTables) {
			result.add(table);
		}
		return result;
	}

}
