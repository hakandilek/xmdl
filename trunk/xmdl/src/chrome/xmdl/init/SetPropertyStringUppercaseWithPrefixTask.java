package chrome.xmdl.init;

import org.apache.log4j.Logger;

class SetPropertyStringUppercaseWithPrefixTask extends
		SetPropertyStringUppercaseTask implements Task {

	public static Logger LOGGER = Logger.getLogger(SetPropertyStringUppercaseWithPrefixTask.class);

	public SetPropertyStringUppercaseWithPrefixTask(String property,
			String prefix) {
		super(property, prefix, "");
	}

}
