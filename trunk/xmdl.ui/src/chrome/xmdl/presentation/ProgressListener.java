package chrome.xmdl.presentation;

import org.eclipse.core.runtime.IProgressMonitor;

import chrome.xmdl.xgen.GeneratorEvent;
import chrome.xmdl.xgen.GeneratorListener;

public class ProgressListener implements GeneratorListener {

	private final IProgressMonitor monitor;
	private int progress;

	public ProgressListener(IProgressMonitor progressMonitor) {
		super();
		this.monitor = progressMonitor;
		this.progress= 0;
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
		//monitor.worked(++progress);
		monitor.worked(1);
//		System.err.println(progress);
	}

}
