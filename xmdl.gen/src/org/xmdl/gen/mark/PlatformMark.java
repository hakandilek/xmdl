package org.xmdl.gen.mark;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class PlatformMark {

	public static final MarkElement fromXML(Reader input) {
		MarkElement mark = null;
		try {
			Unmarshaller um = createUnmarshaller();
			Object o = um.unmarshal(input);
			mark = (MarkElement) o;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return mark;
	}

	public static final MarkElement fromXML(InputStream input) {
		MarkElement mark = null;
		try {
			Unmarshaller um = createUnmarshaller();
			Object o = um.unmarshal(input);
			mark = (MarkElement) o;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return mark;
	}

	private static Unmarshaller createUnmarshaller() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(MarkElement.class);
		Unmarshaller um = jc.createUnmarshaller();
		return um;
	}

	public static final void toXML(MarkElement mark, Writer output) {
		try {
			Marshaller m = createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(mark, output);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static final void toXML(MarkElement mark, OutputStream output) {
		try {
			Marshaller m = createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(mark, output);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static Marshaller createMarshaller() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(MarkElement.class);
		Marshaller m = jc.createMarshaller();
		return m;
	}
}
