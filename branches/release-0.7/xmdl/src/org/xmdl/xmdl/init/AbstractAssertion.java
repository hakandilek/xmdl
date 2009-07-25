package org.xmdl.xmdl.init;

import org.apache.log4j.Logger;

public abstract class AbstractAssertion implements Assertion {

	public final static Logger LOGGER = Logger
			.getLogger(AbstractAssertion.class);
	
	private Object source;
	private Object destination;
	
	public AbstractAssertion() {
		super();
	}

	public abstract boolean test();

	/**
	 * @return Returns the destination.
	 */
	public Object getDestination() {
		return destination;
	}

	/**
	 * @param destination The destination to set.
	 */
	public void setDestination(Object destination) {
		LOGGER.debug("set destination = " + destination);
		this.destination = destination;
	}

	/**
	 * @return Returns the source.
	 */
	public Object getSource() {
		return source;
	}

	/**
	 * @param source The source to set.
	 */
	public void setSource(Object source) {
		LOGGER.debug("set source = " + source);
		this.source = source;
	}

	
}
