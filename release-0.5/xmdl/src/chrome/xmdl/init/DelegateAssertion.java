package chrome.xmdl.init;

import org.apache.log4j.Logger;

public class DelegateAssertion extends AbstractAssertion {

	private final static Logger LOGGER = Logger
			.getLogger(DelegateAssertion.class);

	private final Assertion delegate;

	public DelegateAssertion(Assertion delegate) {
		super();
		this.delegate = delegate;
	}

	@Override
	public boolean test() {
		if (delegate == null)
			return false;
		delegate.setSource(getSource());
		delegate.setDestination(getDestination());
		boolean result = delegate.test();

		LOGGER.debug("delegate = " + delegate);
		LOGGER.debug("result = " + result);

		return result;
	}

	/**
	 * @return Returns the delegate.
	 */
	public Assertion getDelegate() {
		return delegate;
	}

	
}
