package org.xmdl.wdl.gen.utils;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class AssociationManagerReset extends AbstractWorkflowComponent2 {

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
		AssociationManager.getInstance().reset();
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}

}
