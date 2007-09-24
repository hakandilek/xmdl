package chrome.xmdldb.init;

import org.apache.log4j.Logger;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.init.AbstractAssertion;

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
