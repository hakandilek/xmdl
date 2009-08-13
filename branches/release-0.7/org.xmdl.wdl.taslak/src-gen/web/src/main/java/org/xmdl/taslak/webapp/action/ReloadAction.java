package org.xmdl.taslak.webapp.action;

import org.xmdl.ida.lib.web.action.BaseReloadAction;
import org.xmdl.taslak.webapp.listener.StartupListener;

/**
 *
 * taslak Web Reload action
 *  
 * This class is used to reload the drop-downs initialized in the
 * StartupListener.
 *
 */
public class ReloadAction extends BaseReloadAction {

	@Override
	protected void setStartupContext() {
		StartupListener.setupContext(getSession().getServletContext());
	}
}
