package org.xmdl.xmdldb;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;


public class XmdldbUtils {
	private final static Logger LOGGER = Logger.getLogger(XmdldbUtils.class);

	/**
	 * Find field of attribute in table
	 * 
	 * @param attribute
	 *            the attribute
	 * @param table
	 *            the table
	 * @return corresponding field of attribute
	 */
	public static DField findField(XAttribute attribute, DTable table) {
		if (table == null || attribute == null)
			return null;
		List<DField> fields = table.getDFields();
		for (DField f : fields) {
			if (attribute.equals(f.getXAttribute())) {
				return f;
			}
		}
		return null;
	}

	public static DField findRelationField(DField field) {
		XAttribute attribute = field.getXAttribute();
		DTable rel = findRelationTable(field);
		return findField(attribute, rel);
	}

	public static DField findRelationFieldOpposite(DField field) {
		XAttribute attribute = field.getXAttribute();
		XAttribute opposite = attribute.getOpposite();
		DTable rel = findRelationTable(field);
		return findField(opposite, rel);
	}

	@SuppressWarnings("unchecked")
	public static DTable findRelationTable(DField field) {
		XAttribute attrib1 = field.getXAttribute();
		XAttribute attrib2 = attrib1.getOpposite();
		// DField field = (DField) destination;
		LOGGER.debug("attrib1 = " + attrib1);
		LOGGER.debug("attrib2 = " + attrib2);
		LOGGER.debug("field = " + field);

		if (attrib2 != null) {
			XClass class1 = attrib1.getXClass();
			XClass class2 = attrib2.getXClass();
			LOGGER.debug("class1 = " + class1);
			LOGGER.debug("class2 = " + class2);

//			DField opposite = XmdldbUtils.getOpposite(field);
//			LOGGER.debug("opposite = " + opposite);
//
//			if (opposite == null) {
//				LOGGER.debug("Opposite field does not exist, quiting!");
//				return null;
//			}

			if (class1 != null && class2 != null) {
				DTable table = field.getDTable();
				DPackage pack = table.getDPackage();
				DTable newTable = null;
				// table.getDFields().remove(field);

				List<DTable> siblingTables = pack.getDTables();
				for (DTable sibling : siblingTables) {
					if (sibling != null) {
						XClass clazz = sibling.getXClass();
						String name = sibling.getName().toUpperCase(
								Locale.ENGLISH);
						String c1name = class1.getName().toUpperCase(
								Locale.ENGLISH);
						String c2name = class2.getName().toUpperCase(
								Locale.ENGLISH);
						if (clazz == null && name.contains(c1name)
								&& name.contains(c2name)) {
							newTable = sibling;
							LOGGER.debug("table found: newTable = " + newTable);
							return newTable;
						}
					}
				}
			}
		}
		return null;
	}

	public static DField getOpposite(DField field) {
		if (field != null) {
			DModel model = getModel(field);
			XAttribute attribute = field.getXAttribute();
			if (attribute != null
					&& attribute.getAssociationType() == XAssociationType.MANY_TO_MANY_LITERAL) {
				XAttribute oppAttrib = attribute.getOpposite();
				if (oppAttrib != null) {
					XClass oppClass = oppAttrib.getXClass();
					if (model != null) {
						DTable oppTable = findTableOf(model, oppClass);
						if (oppTable == null)
							return null;
						List<DField> fields = oppTable.getDFields();
						for (Iterator<DField> iter = fields.iterator(); iter.hasNext();) {
							DField opposite = (DField) iter.next();
							if (opposite.getXAttribute().equals(oppAttrib)) {
								return opposite;
							}
						}
					}
				}
			}
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	private static DTable findTableOf(DModel model, XClass xClass) {
		DTable result = null;
		if (model != null) {
			List<DPackage> packs = model.getDPackages();
			for (DPackage pack : packs) {
				List<DTable> tables = pack.getDTables();
				for (DTable table : tables) {
					XClass xClass2 = table.getXClass();
					if (xClass2 == null) continue;
					if (xClass.equals(xClass2)) {
						result = table;
						break;
					}
				}
				if (result != null)
					break;
			}
		}
		return result;
	}

	public static DModel getModel(DField field) {
		if (field != null) {
			DTable table = field.getDTable();
			return getModel(table);
		}
		return null;
	}

	public static DModel getModel(DTable table) {
		if (table != null) {
			DPackage pack = table.getDPackage();
			return pack.getModel();
		}

		return null;
	}

	public static DTable findOneToManyOppositeTable(DTable table,
			XAttribute attribute) {
		XAttribute oppAttrib = attribute.getOpposite();
		XClass oppClass = oppAttrib.getXClass();
		//XClass xClass = table.getXClass();
		DPackage dPackage = table.getDPackage();
		List<DTable> tables = dPackage.getDTables();
		for (Iterator<DTable> it = tables.iterator(); it.hasNext();) {
			DTable t = (DTable) it.next();
			XClass class1 = t.getXClass();
			if (class1 != null && class1.equals(oppClass)) {
				return t;
			}
		}
		return null;
	}

	public static DField findOneToManyOppositeField(DTable table,
			XAttribute attribute) {
		DTable oppositeTable = findOneToManyOppositeTable(table, attribute);
		XAttribute oppAttrib = attribute.getOpposite();
		DField oppField = findField(oppAttrib, oppositeTable);
		return oppField;
	}

}
