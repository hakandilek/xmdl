package org.xmdl.xgen;

/**
 * A Listener interface used to monitor generator activities.
 * 
 * @author Hakan Dilek
 */
public interface GeneratorListener {
	void generationInitialized(InitializedEvent event);

	void generationStarted(GenerationStartedEvent event);

	void generationFinished(GenerationFinishedEvent event);

	void fileGenerated(FileGeneratedEvent event);
}
