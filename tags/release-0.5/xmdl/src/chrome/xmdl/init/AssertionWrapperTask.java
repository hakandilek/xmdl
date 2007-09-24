package chrome.xmdl.init;

import org.apache.log4j.Logger;

class AssertionWrapperTask extends DelegateAssertion implements Task {
	public static Logger LOGGER = Logger
			.getLogger(AssertionWrapperTask.class);

	private final Task delegate;

	public AssertionWrapperTask(Task delegate, Assertion assertion) {
		super(assertion);
		this.delegate = delegate;
	}

	public void initialize(Object source, Object destination) {
		try {
			LOGGER.debug("source = " + source);
			LOGGER.debug("destination = " + destination);
			
			setSource(source);
			setDestination(destination);
			
			boolean success = test();
			LOGGER.debug("success = " + success);
			
			if (success) {
				delegate.initialize(source, destination);
			}
			
		} catch (Exception e) {
			LOGGER.error("Cannot delegate to task " + delegate
					+ ", with assertive " + getDelegate() , e);
		}
	}

}
