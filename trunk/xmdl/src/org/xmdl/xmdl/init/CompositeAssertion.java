package org.xmdl.xmdl.init;

import java.util.*;

import org.apache.log4j.Logger;

/**
 * performs an logic AND operation among children
 * @author tr1d2643
 *
 */
public class CompositeAssertion extends AbstractAssertion {

	private final static Logger LOGGER = Logger
			.getLogger(CompositeAssertion.class);

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

		boolean result = true;
		for (Assertion child : children) {
			child.setSource(source);
			child.setDestination(destin);

			result = child.test();
			LOGGER.debug("result = " + result);
			
			if(!result) break;
		}
		return result;
	}

}
