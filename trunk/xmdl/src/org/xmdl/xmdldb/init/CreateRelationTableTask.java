package org.xmdl.xmdldb.init;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.init.Task;
import org.xmdl.xmdldb.DField;
import org.xmdl.xmdldb.DPackage;
import org.xmdl.xmdldb.DTable;
import org.xmdl.xmdldb.XmdldbFactory;
import org.xmdl.xmdldb.XmdldbUtils;


public class CreateRelationTableTask implements Task {

	private final static Logger LOGGER = Logger
			.getLogger(CreateRelationTableTask.class);

	private final String tablePrefix;

	@SuppressWarnings("unused")
	private final String fieldSuffix;

	public CreateRelationTableTask(String tablePrefix, String fieldSuffix) {
		super();
		this.tablePrefix = tablePrefix;
		this.fieldSuffix = fieldSuffix;
	}

	@SuppressWarnings("unchecked")
	public void initialize(Object source, Object destination) {
		XAttribute attrib1 = (XAttribute) source;
		XAttribute attrib2 = attrib1.getOpposite();
		DField field1 = (DField) destination;
		LOGGER.debug("attrib1 = " + attrib1);
		LOGGER.debug("attrib2 = " + attrib2);
		LOGGER.debug("field = " + field1);

		DTable table1 = field1.getDTable();
		DField field2 = XmdldbUtils.findOneToManyOppositeField(table1, attrib1);
		LOGGER.debug("opposite = " + field2);

		if (attrib2 != null) {
			XClass class1 = attrib1.getXClass();
			XClass class2 = attrib2.getXClass();
			LOGGER.debug("class1 = " + class1);
			LOGGER.debug("class2 = " + class2);

			if (class1 != null && class2 != null) {
				DTable table = table1;
				DPackage pack = table.getDPackage();
				DTable relTable = XmdldbUtils.findRelationTable(field1);
				// table.getDFields().remove(field);

				if (relTable == null) {
					relTable = XmdldbFactory.eINSTANCE.createDTable();
					relTable.setDPackage(pack);
					// newTable.setXClass(class1);
					String name = tablePrefix + class1.getName() + "_"
							+ class2.getName();
					name = name.toUpperCase(Locale.ENGLISH);
					relTable.setName(name);

				}
				
				if (field1 != null) {
					DField currentField = XmdldbUtils.findField(attrib1,
							relTable);
					if (currentField == null) {
						field1.setDTable(relTable);
						field1.setXAttribute(attrib1);
					} else {
						field1.setDTable(null);
					}
				}

				if (field2 != null) {
					DField currentField = XmdldbUtils.findField(attrib2,
							relTable);
					if (currentField == null) {
						field2.setDTable(relTable);
						field2.setXAttribute(attrib2);
					} else {
						field2.setDTable(null);
					}
				}

				LOGGER.debug("newTable = " + relTable);
				LOGGER.debug("field1 = " + field1);
				LOGGER.debug("field2 = " + field2);
			}
		}
	}

}
