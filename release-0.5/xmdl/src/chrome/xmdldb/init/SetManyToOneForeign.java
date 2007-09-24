package chrome.xmdldb.init;

import org.apache.log4j.Logger;

import chrome.xmdl.XAttribute;
import chrome.xmdl.init.Task;
import chrome.xmdldb.DField;
import chrome.xmdldb.DTable;
import chrome.xmdldb.XmdldbUtils;

public class SetManyToOneForeign implements Task {

	private final static Logger LOGGER = Logger
			.getLogger(SetManyToOneForeign.class);
	public SetManyToOneForeign() {
		super();
	}

	public void initialize(Object source, Object destination) {
		XAttribute attrib1 = (XAttribute) source;
		XAttribute attrib2 = attrib1.getOpposite();
		DField field = (DField) destination;
		LOGGER.debug("attrib1 = " + attrib1);
		LOGGER.debug("attrib2 = " + attrib2);
		LOGGER.debug("field = " + field);

		DTable table = field.getDTable();
		DField opposite = XmdldbUtils.findOneToManyOppositeField(table, attrib1);
		LOGGER.debug("opposite = " + opposite);

	}

}
