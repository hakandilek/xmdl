package chrome.xmdl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

class MyPluginClass extends AbstractUIPlugin {
	static MyPluginClass singleton;

	public MyPluginClass() {
		if (singleton == null) {
			singleton = this;
		}
	}

	static public MyPluginClass getDefault() {
		return singleton;
	}
};
