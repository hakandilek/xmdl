package chrome.xmdl.init;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;

class SetPropertyTask implements Task {
	public static Logger LOGGER = Logger.getLogger(SetPropertyTask.class);

	protected String property;

	/**
	 * @param destination
	 * @param property
	 * @param source
	 */
	public SetPropertyTask(String property) {
		super();
		this.property = property;
	}

	/**
	 * @return Returns the property.
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * @param property
	 *            The property to set.
	 */
	public void setProperty(String property) {
		this.property = property;
	}

	public void initialize(Object source, Object destination) {
		try {
			Object value = PropertyUtils.getProperty(source, property);
			PropertyUtils.setProperty(destination, property, value);
			// BeanUtils.copyProperty(destination, property, source);
		} catch (Exception e) {
			LOGGER.error("Cannot copy property " + source.getClass() + "."
					+ property, e);
		}
	}

}
