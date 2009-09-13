package org.xmdl.wdl.gen.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.xmdl.wdl.Model;

public class AssociationManagerReset extends AbstractWorkflowComponent2 {
	private static final Log log = LogFactory
			.getLog(AssociationManagerReset.class);

	private static final String COMPONENT_NAME = "Association Manager Reset";

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "Reseting associations";
	}

	@Override
	protected void invokeInternal(final WorkflowContext model,
			final ProgressMonitor monitor, final Issues issues) {
		if (log.isDebugEnabled()) {
			String[] slotNames = model.getSlotNames();
			for (String name : slotNames) {
				log.debug(name + " : ");
				log.debug("       " + model.get(name));
			}
		}
		Model mod = (Model) model.get("model");
		AssociationManager.getInstance().initialize(mod);
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}

}
