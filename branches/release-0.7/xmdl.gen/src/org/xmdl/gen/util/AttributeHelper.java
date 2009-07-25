package org.xmdl.gen.util;

import org.xmdl.xmdl.XAssociationBehaviour;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XType;

/**
 * Attribute meta-data helper class
 * 
 * @author hakan
 */
public class AttributeHelper {

	/**
	 * Hidden constructor
	 */
	protected AttributeHelper() {
		super();
	}

	/** singleton instance */
	public static final AttributeHelper INSTANCE = new AttributeHelper();

	/** singleton access method */
	public static AttributeHelper getInstance() {
		return INSTANCE;
	}
	
	/**
	 * @param a the attribute
	 * @return true if this is an embedded attribute
	 */
	public boolean isEmbeded(XAttribute a) {
		if (a == null) return false;
		XAssociationType type = a.getAssociationType();
		XType t = a.getType();
		XAssociationBehaviour beha = a.getAssociationBehaviour();
		if (!XAssociationType.ONE_TO_ONE_LITERAL.equals(type))
			return false;
		if(!XAssociationBehaviour.COMPOSITION_LITERAL.equals(beha))
			return false;
		if (t instanceof XClass) {
			XClass cls = (XClass) t;
			XClassBehavior b = cls.getBehavior();
			if (XClassBehavior.EMBEDDABLE.equals(b))
				return true;
		}
		return false;
	}

}
