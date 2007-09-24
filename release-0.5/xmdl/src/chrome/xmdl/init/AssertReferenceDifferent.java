package chrome.xmdl.init;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;

public class AssertReferenceDifferent extends AssertDifferent {

	public final static Logger LOGGER = Logger
			.getLogger(AssertReferenceDifferent.class);
	
	private String referenceName;
	
	public AssertReferenceDifferent(String name) {
		super();
		referenceName = name;
	}

	
	/* (non-Javadoc)
	 * @see chrome.xmdl.init.AbstractAssertion#getDestination()
	 */
	@Override
	public Object getDestination() {
		Object destination = super.getDestination();
		Object reference = null;
		try {
			reference = PropertyUtils.getProperty(destination,
					referenceName);
		} catch (Exception e) {
			LOGGER.error("'" + destination.getClass() + "'"
					+ " can not access property '" + referenceName + "'", e);
		}

		LOGGER.debug("reference = " + reference);
		return reference;
	}


}
