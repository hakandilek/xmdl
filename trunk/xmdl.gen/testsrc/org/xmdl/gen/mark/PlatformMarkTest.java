package org.xmdl.gen.mark;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.xmdl.gen.mark.FileElement.FileType;
import org.xmdl.gen.mark.FileElement.OutputType;

public class PlatformMarkTest extends TestCase {

	private static final Logger LOGGER = Logger.getLogger(PlatformMarkTest.class);

	private MarkElement mark;

	protected void setUp() throws Exception {
		super.setUp();

		PlatformElement platform = new PlatformElement();
		platform.setId("org.xmdl.test");
		platform.setName("Test Platform");
		platform.setVersion("very beta");

		FileElement file1 = new FileElement();
		file1.setFileName("file1");
		file1.setFileType(FileType.JAVA);
		file1.setOutputType(OutputType.GENERATE);
		file1.setSize(1);
		FileElement file2 = new FileElement();
		file2.setFileName("file2");
		file2.setFileType(FileType.PROPERTY);
		file2.setOutputType(OutputType.GENERATE);
		file2.setSize(2);
		FileElement file3 = new FileElement();
		file3.setFileName("file3");
		file3.setFileType(FileType.XML);
		file3.setOutputType(OutputType.COPY);
		file3.setSize(3);
		List<FileElement> files = new ArrayList<FileElement>();
		files.add(file1);
		files.add(file2);
		files.add(file3);

		mark = new MarkElement();
		mark.setGenerationTime(new Date());
		mark.setPlatform(platform);
		mark.setGeneratedFiles(files);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		mark = null;
	}

	public void testToXMLMarkElementWriter() {
		CharArrayWriter w = new CharArrayWriter();
		PlatformMark.toXML(mark, w);
		String s = new String(w.toCharArray());
		System.out.println(s);
		LOGGER.debug(s);
		CharArrayReader r = new CharArrayReader(s.toCharArray());
		MarkElement copy = PlatformMark.fromXML(r);
		
		assertEquals(mark.getGenerationTime(), copy.getGenerationTime());
		
		PlatformElement platform = copy.getPlatform();
		assertNotNull(platform);
		assertEquals(mark.getPlatform().getId(), platform.getId());
		assertEquals(mark.getPlatform().getName(), platform.getName());
		assertEquals(mark.getPlatform().getVersion(), platform.getVersion());
		
		List<FileElement> files = copy.getGeneratedFiles();
		assertNotNull(files);
		assertEquals(3, files.size());
		assertEquals(mark.getGeneratedFiles().get(0).getFileName(), files.get(0).getFileName());
		assertEquals(mark.getGeneratedFiles().get(0).getFileType(), files.get(0).getFileType());
		assertEquals(mark.getGeneratedFiles().get(0).getOutputType(), files.get(0).getOutputType());
		assertEquals(mark.getGeneratedFiles().get(0).getSize(), files.get(0).getSize());
		
		assertEquals(mark.getGeneratedFiles().get(1).getFileName(), files.get(1).getFileName());
		assertEquals(mark.getGeneratedFiles().get(1).getFileType(), files.get(1).getFileType());
		assertEquals(mark.getGeneratedFiles().get(1).getOutputType(), files.get(1).getOutputType());
		assertEquals(mark.getGeneratedFiles().get(1).getSize(), files.get(1).getSize());
		
		assertEquals(mark.getGeneratedFiles().get(2).getFileName(), files.get(2).getFileName());
		assertEquals(mark.getGeneratedFiles().get(2).getFileType(), files.get(2).getFileType());
		assertEquals(mark.getGeneratedFiles().get(2).getOutputType(), files.get(2).getOutputType());
		assertEquals(mark.getGeneratedFiles().get(2).getSize(), files.get(2).getSize());
	}

	public void testToXMLMarkElementOutputStream() {
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		PlatformMark.toXML(mark, o);
		byte[] bytes = o.toByteArray();
		
		String s =  new String(bytes, Charset.defaultCharset());
		System.out.println(s);
		LOGGER.debug(s);
		
		ByteArrayInputStream i = new ByteArrayInputStream(bytes);
		MarkElement copy = PlatformMark.fromXML(i);
		
		assertEquals(mark.getGenerationTime(), copy.getGenerationTime());
		
		PlatformElement platform = copy.getPlatform();
		assertNotNull(platform);
		assertEquals(mark.getPlatform().getId(), platform.getId());
		assertEquals(mark.getPlatform().getName(), platform.getName());
		assertEquals(mark.getPlatform().getVersion(), platform.getVersion());
		
		List<FileElement> files = copy.getGeneratedFiles();
		assertNotNull(files);
		assertEquals(3, files.size());
		assertEquals(mark.getGeneratedFiles().get(0).getFileName(), files.get(0).getFileName());
		assertEquals(mark.getGeneratedFiles().get(0).getFileType(), files.get(0).getFileType());
		assertEquals(mark.getGeneratedFiles().get(0).getOutputType(), files.get(0).getOutputType());
		assertEquals(mark.getGeneratedFiles().get(0).getSize(), files.get(0).getSize());
		
		assertEquals(mark.getGeneratedFiles().get(1).getFileName(), files.get(1).getFileName());
		assertEquals(mark.getGeneratedFiles().get(1).getFileType(), files.get(1).getFileType());
		assertEquals(mark.getGeneratedFiles().get(1).getOutputType(), files.get(1).getOutputType());
		assertEquals(mark.getGeneratedFiles().get(1).getSize(), files.get(1).getSize());
		
		assertEquals(mark.getGeneratedFiles().get(2).getFileName(), files.get(2).getFileName());
		assertEquals(mark.getGeneratedFiles().get(2).getFileType(), files.get(2).getFileType());
		assertEquals(mark.getGeneratedFiles().get(2).getOutputType(), files.get(2).getOutputType());
		assertEquals(mark.getGeneratedFiles().get(2).getSize(), files.get(2).getSize());
	}

}
