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
	/*PROTECTED REGION ID(taslak.rld.act.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
