package chrome.xmdl.presentation;

import org.eclipse.core.runtime.IProgressMonitor;

import chrome.xmdl.xgen.GeneratorEvent;
import chrome.xmdl.xgen.GeneratorListener;

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

	public void generationInitialized(GeneratorEvent event) {
		monitor.subTask("XMDL initializing...");
	}

	public void generationStarted(GeneratorEvent event) {
		monitor.beginTask("XMDL generate", event.getSize());
	}

	public void generationFinished(GeneratorEvent event) {
		monitor.done();
	}

	public void progress(GeneratorEvent event) {
		monitor.worked(1);
	}

}
