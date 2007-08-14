package chrome.xmdl.init;

import java.util.Locale;

import org.apache.log4j.Logger;

class SetPropertyStringUppercaseTask extends SetPropertyStringTask {

	public static Logger LOGGER = Logger
			.getLogger(SetPropertyStringUppercaseTask.class);

	public SetPropertyStringUppercaseTask(String property, String prefix,
			String suffix) {
		super(property, prefix, suffix);
	}

	@Override
	protected String process(Object value, Object source, Object destination) {
		String str = super.process(value, source, destination);
		str = str.toUpperCase(Locale.ENGLISH);
		LOGGER.debug("str = " + str);
		return str;
	}


}
