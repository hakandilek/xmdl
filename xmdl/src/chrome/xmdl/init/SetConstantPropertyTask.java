package chrome.xmdl.init;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;

class SetConstantPropertyTask extends SetPropertyTask {
	public static Logger LOGGER = Logger.getLogger(SetConstantPropertyTask.class);

	private Object value;

	/**
	 * @param destination
	 * @param property
	 * @param source
	 */
	public SetConstantPropertyTask(String property, Object value) {
		super(property);
		this.value = value;		
	}


	public void initialize(Object source, Object destination) {
		try {
			Object value = getValue();
			PropertyUtils.setProperty(destination, property, value);
			// BeanUtils.copyProperty(destination, property, source);
		} catch (Exception e) {
			LOGGER.error("Cannot copy property " + source.getClass() + "."
					+ property, e);
		}
	}


	protected void setValue(Object value) {
		this.value = value;
	}


	protected Object getValue() {
		return value;
	}

}
