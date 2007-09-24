package chrome.xmdl.init;

import java.util.*;

import org.apache.log4j.Logger;

/**
 * performs an logic OR operation among children
 * 
 * @author tr1d2643
 * 
 */
public class CompositeORAssertion extends AbstractAssertion {

	private final static Logger LOGGER = Logger
			.getLogger(CompositeORAssertion.class);

	private List<Assertion> children = new ArrayList<Assertion>();

	public void addChild(Assertion child) {
		children.add(child);
	}

	public void removeChild(Assertion child) {
		children.remove(child);
	}

	public boolean test() {
		Object source = getSource();
		Object destin = getDestination();
		LOGGER.debug("source = " + source);
		LOGGER.debug("destin = " + destin);

		boolean result = false;
		for (Assertion child : children) {
			child.setSource(source);
			child.setDestination(destin);

			result = child.test();
			LOGGER.debug("result = " + result);

			if (result) {
				// if one child is true, whole expression is true
				return true;
			}
		}
		return result;
	}

}
