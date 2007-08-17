package chrome.xmdldb.init;

import org.apache.log4j.Logger;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.init.AbstractAssertion;
import chrome.xmdl.init.Assertion;

public class IsManyToMany extends AbstractAssertion implements Assertion {

	private final static Logger LOGGER = Logger.getLogger(IsManyToMany.class);
	
//	private List<XAttribute> opposites = new ArrayList<XAttribute>();

	public IsManyToMany() {
		super();
	}

	@Override
	public boolean test() {
		boolean testResult = false;
		Object s = getSource();
		if (s instanceof XAttribute && s != null) {
			XAttribute a = (XAttribute) s;
			XAssociationType type = a.getAssociationType();
			if (XAssociationType.MANY_TO_MANY == type.getValue()) {
				
				LOGGER.debug("ManyToMany: a = " + a);
				
//				opposites.add(a);				
				XAttribute opposite = a.getOpposite();
				LOGGER.debug("opposite = " + opposite);
				
//				if (!opposites.contains(opposite)){
					testResult = true;
//				}
				
				LOGGER.debug("testResult = " + testResult);
			}
		}
		
		return testResult;
	}

}
