package org.xmdl.gen.mark;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * XMDL mark class for the platform mark.
 * 
 * @author Hakan Dilek
 */
@XmlRootElement(name="mark")
@XmlAccessorType(XmlAccessType.FIELD)
public class MarkElement {

	@XmlAttribute
	private Date generationTime;

	@XmlElement(name="platform")
	private PlatformElement platform;

	@XmlElementWrapper(name = "files")
	@XmlElements(@XmlElement(name = "file", type = FileElement.class))
	private List<FileElement> generatedFiles;

	public Date getGenerationTime() {
		return generationTime;
	}

	public void setGenerationTime(Date generationTime) {
		this.generationTime = generationTime;
	}

	public PlatformElement getPlatform() {
		return platform;
	}

	public void setPlatform(PlatformElement platform) {
		this.platform = platform;
	}

	public List<FileElement> getGeneratedFiles() {
		return generatedFiles;
	}

	public void setGeneratedFiles(List<FileElement> generatedFiles) {
		this.generatedFiles = generatedFiles;
	}

}
