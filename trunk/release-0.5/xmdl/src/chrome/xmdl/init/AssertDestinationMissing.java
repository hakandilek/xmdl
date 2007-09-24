package chrome.xmdl.init;

public class AssertDestinationMissing extends AssertReferenceDifferent implements
		Assertion {

	public AssertDestinationMissing(String name) {
		super(name);
	}

	@Override
	public boolean test() {
		Object destination = getDestination();

		boolean missing = destination == null || "".equals(destination);
		LOGGER.debug("missing = " + missing);

		return missing;
	}

}
