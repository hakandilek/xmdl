package chrome.xmdl.init;

import org.apache.log4j.Logger;

public class NegativeAssertion extends DelegateAssertion {

	private final static Logger LOGGER = Logger
			.getLogger(NegativeAssertion.class);

	public NegativeAssertion(Assertion delegate) {
		super(delegate);
	}

	public boolean test() {
		boolean delegateResult = super.test(); 
		boolean result  = !delegateResult;
		
		LOGGER.debug("delegateResult = " + delegateResult);
		LOGGER.debug("negating, result = " + result);
		
		return result;
	}

}
