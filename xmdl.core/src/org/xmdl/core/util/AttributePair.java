package org.xmdl.core.util;

import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdldb.DField;
import org.xmdl.xmdldb.DTable;

/**
 * Temporary data structure holding, an attribute and field pair.
 * @author hd
 */
public class AttributePair {

	private XAttribute attribute;
	private DField field;
	private DTable table;
	
	public AttributePair() {
		super();
	}

	public AttributePair(XAttribute attribute, DField field, DTable table) {
		super();
		this.attribute = attribute;
		this.field = field;
		this.table = table;
	}

	/**
	 * @return Returns the attribute.
	 */
	public XAttribute getAttribute() {
		return attribute;
	}

	/**
	 * @param attribute The attribute to set.
	 */
	public void setAttribute(XAttribute attribute) {
		this.attribute = attribute;
	}

	/**
	 * @return Returns the field.
	 */
	public DField getField() {
		return field;
	}

	/**
	 * @param field The field to set.
	 */
	public void setField(DField field) {
		this.field = field;
	}

	/**
	 * @param table The table to set.
	 */
	public void setTable(DTable table) {
		this.table = table;
	}

	/**
	 * @return Returns the table.
	 */
	public DTable getTable() {
		return table;
	}

	
}
