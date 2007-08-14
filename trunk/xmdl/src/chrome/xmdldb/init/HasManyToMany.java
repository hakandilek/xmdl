package chrome.xmdldb.init;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.init.AbstractAssertion;
import chrome.xmdl.init.Assertion;

public class HasManyToMany extends AbstractAssertion implements Assertion {

	private final static Logger LOGGER = Logger.getLogger(HasManyToMany.class);
	
	private List<XAttribute> opposites = new ArrayList<XAttribute>();

	public HasManyToMany() {
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean test() {
		boolean testResult = false;
		Object s = getSource();
		if (s instanceof XClass && s != null) {
			XClass cls = (XClass) s;
			List<XAttribute> attributes = cls.getAttributes();
			for (XAttribute attribute : attributes) {
				XAssociationType type = attribute.getAssociationType();
				if (XAssociationType.MANY_TO_MANY == type.getValue()) {
					
					LOGGER.debug("ManyToMany: a = " + attribute);
					
					opposites.add(attribute);				
					XAttribute opposite = attribute.getOpposite();
					LOGGER.debug("opposite = " + opposite);
					
					if (!opposites.contains(opposite)){
						testResult = true;
						break;
					}
					
					LOGGER.debug("testResult = " + testResult);
				}
				
			}
		}
		
		return testResult;
	}

}
