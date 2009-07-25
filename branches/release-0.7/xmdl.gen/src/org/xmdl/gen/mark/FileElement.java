package org.xmdl.gen.mark;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;

/**
 * Generated file class for the platform mark.
 * 
 * @author Hakan Dilek
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FileElement {

	@XmlAttribute(name = "name")
	private String fileName;

	@XmlAttribute
	private Integer size;

	@XmlAttribute
	private OutputType outputType;

	@XmlAttribute
	private FileType fileType;

	@XmlEnum 
	public enum OutputType {
		COPY, GENERATE
	};

	@XmlEnum 
	public enum FileType {
		JAVA, XML, PROPERTY, OTHER
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public OutputType getOutputType() {
		return outputType;
	}

	public void setOutputType(OutputType outputType) {
		this.outputType = outputType;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

}
