package org.xmdl.xmdl.init;

import org.apache.log4j.Logger;

class SetPropertyStringUppercaseWithSuffixTask extends
		SetPropertyStringUppercaseTask implements Task {

	public static Logger LOGGER = Logger
			.getLogger(SetPropertyStringUppercaseWithSuffixTask.class);

	public SetPropertyStringUppercaseWithSuffixTask(String property,
			String suffix) {
		super(property, "", suffix);
	}

}
