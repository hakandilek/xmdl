package org.xmdl.xmdl.init;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

public class SetReferenceTask implements Task {
	private final static Logger LOGGER = Logger
			.getLogger(SetReferenceTask.class);

	private String referenceName;

	public SetReferenceTask(String referenceName) {
		super();
		this.referenceName = referenceName;
	}

	public void initialize(Object source, Object destination) {
		try {
			LOGGER.debug("source = " + source);
			LOGGER.debug("destination = " + destination);
			LOGGER.debug("referenceName = " + referenceName);
			
			BeanUtils.setProperty(destination, referenceName, source);
			LOGGER.debug("destination = " + destination);
		} catch (Exception e) {
			LOGGER.error("Unable to set property " + referenceName + " for "
					+ destination, e);
		}
	}

}
