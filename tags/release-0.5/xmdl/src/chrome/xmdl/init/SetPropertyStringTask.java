package chrome.xmdl.init;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;

class SetPropertyStringTask implements Task {

	public static Logger LOGGER = Logger.getLogger(SetPropertyStringTask.class);

	private final String propertyName;

	private final String prefix;

	private final String suffix;

	private Assertion prefixAssertion;

	private Assertion suffixAssertion;

	public SetPropertyStringTask(String property, String prefix, String suffix) {
		this.propertyName = property;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	/**
	 * @return Returns the prefix.
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @return Returns the suffix.
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @return Returns the propertyName.
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * @return Returns the prefixAssertion.
	 */
	public Assertion getPrefixAssertion() {
		return prefixAssertion;
	}

	/**
	 * @param prefixAssertion
	 *            The prefixAssertion to set.
	 */
	public void setPrefixAssertion(Assertion prefixAssertion) {
		this.prefixAssertion = prefixAssertion;
	}

	/**
	 * @return Returns the suffixAssertion.
	 */
	public Assertion getSuffixAssertion() {
		return suffixAssertion;
	}

	/**
	 * @param suffixAssertion
	 *            The suffixAssertion to set.
	 */
	public void setSuffixAssertion(Assertion suffixAssertion) {
		this.suffixAssertion = suffixAssertion;
	}

	public void initialize(Object source, Object destination) {
		try {
			Object value = PropertyUtils.getProperty(source, getPropertyName());
			String str = process(value, source, destination);
			PropertyUtils.setProperty(destination, propertyName, str);
		} catch (Exception e) {
			LOGGER.error("Cannot copy propertyName " + source.getClass() + "."
					+ propertyName, e);
		}
	}

	/**
	 * processes the propertyName value to retrieve a {@link java.lang.String}
	 * representation
	 * 
	 * @param value
	 *            propertyName
	 * @param destination 
	 * @param source object
	 * @return string representation of propertyName
	 */
	protected String process(Object value, Object source, Object destination) {
		Assertion pa = getPrefixAssertion();
		Assertion sa = getSuffixAssertion();

		String prefix = "";
		if (pa == null ) {
			LOGGER.debug("setting prefix = " + prefix);
			prefix = getPrefix();				
		} else {
			pa.setSource(source);
			pa.setDestination(destination);
			if (pa.test()){
				LOGGER.debug("setting prefix = " + prefix);
				prefix = getPrefix();				
			}
		}

		String suffix = "";
		if (sa == null ) {
			LOGGER.debug("setting suffix = " + suffix);
			suffix = getSuffix();
		} else {
			sa.setSource(source);
			sa.setDestination(destination);
			if (sa.test()){
				LOGGER.debug("setting suffix = " + suffix);
				suffix = getSuffix();
			}
		}

		LOGGER.debug("prefix = " + prefix);
		LOGGER.debug("suffix = " + suffix);
		LOGGER.debug("value = " + value);

		String str = prefix + (value + "") + suffix;

		LOGGER.debug("str = " + str);
		return str;
	}

}
