package chrome.xmdl.init;

import org.apache.log4j.Logger;

import chrome.xmdl.XAttribute;

public class IsReference extends AbstractAssertion {

	private final static Logger LOGGER = Logger.getLogger(IsReference.class);
	
	public boolean test() {
		Object s = getSource();
		if (s instanceof XAttribute && s != null) {
			XAttribute a = (XAttribute) s;
			
			boolean isReference = a.isReference();
			
			LOGGER.debug("attribute = " + a);
			LOGGER.debug("isReference = " + isReference);
			
			return isReference;
		}
		return false;
	}


}
