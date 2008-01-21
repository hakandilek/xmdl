package org.xmdl.gen.mark;

/**
 * Generated file class for the platform mark.
 * 
 * @author Hakan Dilek
 */
public class GeneratedFile {
	private String fileName;
	private Integer size;
	private GenerationType generationType;
	private FileType fileType;

	public enum GenerationType {
		COPY, GENERATE
	};

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

	public GenerationType getGenerationType() {
		return generationType;
	}

	public void setGenerationType(GenerationType generationType) {
		this.generationType = generationType;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

}
