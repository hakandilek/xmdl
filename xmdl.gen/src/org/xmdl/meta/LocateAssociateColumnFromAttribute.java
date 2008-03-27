package org.xmdl.meta;

import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdldb.DField;
import org.xmdl.xmdldb.DTable;

/**
 * Used to locate association column for many-to-many associated attributes.
 * 
 * @author Hakan Dilek
 */
public class LocateAssociateColumnFromAttribute extends
		LocateColumnFromAttribute {

	public LocateAssociateColumnFromAttribute(XAttribute attribute) {
		this(attribute, false);
	}

	/**
	 * @param attribute
	 *            the attribute to match
	 * @param opposite
	 *            flag to find the opposite attribute
	 */
	public LocateAssociateColumnFromAttribute(XAttribute attribute, boolean opposite) {
		super(opposite ? attribute.getOpposite() : attribute);
	}

	@Override
	protected boolean matches(DField d) {
		if(super.matches(d)) {
			DTable table = d.getDTable();
			if (table != null) {
				return table.getXClass() == null;
			}
			return false;
		}
		return false;
	}

}
