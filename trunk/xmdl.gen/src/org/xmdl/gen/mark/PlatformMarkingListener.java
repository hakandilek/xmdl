package org.xmdl.gen.mark;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.xmdl.gen.mark.FileElement.FileType;
import org.xmdl.gen.mark.FileElement.OutputType;
import org.xmdl.xgen.FileCopyEvent;
import org.xmdl.xgen.FileCopyListener;
import org.xmdl.xgen.FileGeneratedEvent;
import org.xmdl.xgen.GenerationFinishedEvent;
import org.xmdl.xgen.GenerationStartedEvent;
import org.xmdl.xgen.GeneratorListener;
import org.xmdl.xgen.InitializedEvent;
import org.xmdl.xgen.Platform;

public class PlatformMarkingListener implements GeneratorListener, FileCopyListener {

	private Platform platform;
	private Date startTime;
	private Date finishTime;
	private List<String> generatedFiles = new ArrayList<String>();
	private List<String> copiedFiles = new ArrayList<String>();

	@Override
	public void fileGenerated(FileGeneratedEvent event) {
		String filePath = event.getFilePath();
		generatedFiles.add(filePath);
	}

	@Override
	public void generationFinished(GenerationFinishedEvent event) {
		finishTime = event.getTime();
		writeMark();
	}

	@Override
	public void generationInitialized(InitializedEvent event) {
		//do nothing
	}

	@Override
	public void generationStarted(GenerationStartedEvent event) {
		platform = event.getPlatform();
		startTime = event.getTime();
	}
	
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @return the finishTime
	 */
	public Date getFinishTime() {
		return finishTime;
	}

	private void writeMark() {
		Writer w = new OutputStreamWriter(System.out);
		MarkElement mark = getMark();
		PlatformMark.toXML(mark , w);
	}

	public MarkElement getMark() {
		
		MarkElement mark = new MarkElement();
		mark.setGenerationTime(finishTime);
		PlatformElement p = new PlatformElement();
		p.setId(platform.id());
		p.setName(platform.name());
		p.setVersion(platform.version());
		mark.setPlatform(p);
		
		List<FileElement> fileElements = new ArrayList<FileElement>();
		for (String file : generatedFiles) {
			FileElement e = new FileElement();
			fileElements.add(e);
			e.setFileName(file);
			e.setFileType(FileType.OTHER);
			e.setOutputType(OutputType.GENERATE);
		}
		for (String file : copiedFiles) {
			FileElement e = new FileElement();
			fileElements.add(e);
			e.setFileName(file);
			e.setFileType(FileType.OTHER);
			e.setOutputType(OutputType.COPY);
		}
		mark.setGeneratedFiles(fileElements);
		return mark;
	}

	@Override
	public void fileCopied(FileCopyEvent event) {
		String filePath = event.getFilePath();
		copiedFiles.add(filePath);
	}


}
