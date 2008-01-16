package org.xmdl.xmdldb.init;

import org.apache.log4j.Logger;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.init.AbstractAssertion;


public class IsManyToOne extends AbstractAssertion {

	private final static Logger LOGGER = Logger.getLogger(IsManyToOne.class);
	
	public boolean test() {
		Object s = getSource();
		if (s instanceof XAttribute && s != null) {
			XAttribute a = (XAttribute) s;
			XAssociationType type = a.getAssociationType();
			
			boolean isManyToOne = type == XAssociationType.MANY_TO_ONE_LITERAL;
			
			LOGGER.debug("attribute = " + a);
			LOGGER.debug("isManyToOne = " + isManyToOne);
			
			return isManyToOne;
		}
		return false;
	}


}
