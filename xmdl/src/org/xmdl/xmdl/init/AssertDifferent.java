package org.xmdl.xmdl.init;

import org.apache.log4j.Logger;

public class AssertDifferent extends AbstractAssertion {

	public final static Logger LOGGER = Logger.getLogger(AssertDifferent.class);

	public AssertDifferent() {
		super();
	}

	@Override
	public boolean test() {
		Object source = getSource();
		Object destination = getDestination();

		boolean different = !source.equals(destination);
		LOGGER.debug("different = " + different);

		return different;
	}

}
