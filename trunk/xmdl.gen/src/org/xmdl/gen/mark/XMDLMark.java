package org.xmdl.gen.mark;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * XMDL mark class for the platform mark.
 * 
 * @author Hakan Dilek
 */
@XmlRootElement
public class XMDLMark {
	@XmlAttribute
	private Date lastGeneration;
	private Platform platform;
	private List<GeneratedFile> generatedFiles;

	public Date getLastGeneration() {
		return lastGeneration;
	}

	public void setLastGeneration(Date lastGeneration) {
		this.lastGeneration = lastGeneration;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public List<GeneratedFile> getGeneratedFiles() {
		return generatedFiles;
	}

	public void setGeneratedFiles(List<GeneratedFile> generatedFiles) {
		this.generatedFiles = generatedFiles;
	}

}
