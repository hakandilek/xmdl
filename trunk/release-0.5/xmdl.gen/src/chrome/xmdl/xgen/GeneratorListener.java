package chrome.xmdl.xgen;

public interface GeneratorListener {
	void generationInitialized(GeneratorEvent event);

	void generationStarted(GeneratorEvent event);

	void generationFinished(GeneratorEvent event);

	void progress(GeneratorEvent event);
}
