package chrome.xmdl.init;

public interface Assertion {
	
	void setSource(Object source);

	void setDestination(Object destination);

	/**
	 * Tests the assertion
	 * @return test result
	 */
	boolean test();

}
