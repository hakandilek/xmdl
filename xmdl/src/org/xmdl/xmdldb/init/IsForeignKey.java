package org.xmdl.xmdldb.init;

import org.apache.log4j.Logger;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.init.AbstractAssertion;


class IsForeignKey extends AbstractAssertion {
	private final static Logger LOGGER = Logger.getLogger(IsForeignKey.class);

	public boolean test() {
		Object s = getSource();
		boolean isFK = false;
		if (s instanceof XAttribute && s != null) {
			XAttribute a = (XAttribute) s;

			boolean isReference = a.isReference();

			isFK = isReference;
			LOGGER.debug("attribute = " + a);
			LOGGER.debug("isReference = " + isReference);

			if (isReference) {
				XAssociationType type = a.getAssociationType();

				switch (type.getValue()) {
				case XAssociationType.MANY_TO_ONE:
				case XAssociationType.ONE_TO_ONE:
				case XAssociationType.MANY_TO_MANY:
					isFK = true;
					break;
				default:
					isFK = false;
					break;
				}
			}
		}
		LOGGER.debug("isFK = " + isFK);
		return isFK;
	}
}
