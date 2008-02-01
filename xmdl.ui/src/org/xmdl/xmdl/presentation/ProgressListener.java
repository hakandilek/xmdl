package org.xmdl.xmdl.presentation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.xmdl.xgen.FileGeneratedEvent;
import org.xmdl.xgen.GenerationFinishedEvent;
import org.xmdl.xgen.GenerationStartedEvent;
import org.xmdl.xgen.GeneratorListener;
import org.xmdl.xgen.InitializedEvent;


/**
 * 
 * @author Hakan Dilek
 *
 */
public class ProgressListener implements GeneratorListener {

	private final IProgressMonitor monitor;

	public ProgressListener(IProgressMonitor progressMonitor) {
		super();
		this.monitor = progressMonitor;
	}

	@Override
	public void generationInitialized(InitializedEvent event) {
		monitor.subTask("XMDL initializing...");
	}

	@Override
	public void generationStarted(GenerationStartedEvent event) {
		monitor.beginTask("XMDL generate", event.getSize());
	}

	@Override
	public void generationFinished(GenerationFinishedEvent event) {
		monitor.done();
	}
	@Override
	public void fileGenerated(FileGeneratedEvent event) {
		monitor.worked(1);
	}


}
