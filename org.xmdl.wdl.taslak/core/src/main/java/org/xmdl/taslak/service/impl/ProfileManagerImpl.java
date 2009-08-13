package org.xmdl.taslak.service.impl;

import java.util.Collection;
import org.xmdl.ida.lib.service.impl.GenericManagerImpl;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.service.*;
import org.xmdl.taslak.dao.*;

/**
 *
 * Profile Service implementation
 *  
 * $Id$
 *
 */
public class ProfileManagerImpl extends GenericManagerImpl<Profile, Long>
		implements
			ProfileManager {

	private final ProfileDAO profileDAO;

	public ProfileManagerImpl(ProfileDAO profileDAO) {
		super(profileDAO);
		this.profileDAO = profileDAO;
	}

	public Collection<Profile> search(ProfileSearch profileSearch) {
		return profileDAO.search(profileSearch);
	}

	/*PROTECTED REGION ID(Profile.svc.imp.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
