package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * Profile DAO Test Case
 *  
 * $Id$
 */
public class ProfileDAOTest extends BaseDaoTestCase {

	private ProfileDAO profileDAO = null;

	public void setProfileDAO(ProfileDAO profileDAO) {
		this.profileDAO = profileDAO;
	}

	public void testAddAndRemoveProfile() throws Exception {
		Profile profile = new Profile();

		profile.setUser(null);

		profile.setPrivatePhone("r9k32HpZs D5RCV");

		profile = profileDAO.save(profile);
		flush();

		profile = profileDAO.get(profile.getId());

		assertNotNull(profile.getId());
		assertEquals(null, profile.getUser());
		assertEquals("r9k32HpZs D5RCV", profile.getPrivatePhone());

		log.debug("removing profile...");
		profileDAO.remove(profile.getId());
		flush();

		try {
			profileDAO.get(profile.getId());
			fail("Profile found in database");
		} catch (DataAccessException dae) {
			log.debug("Expected exception: " + dae.getMessage());
			assertNotNull(dae);
		}
	}

	public void testSearch() throws Exception {
		ProfileSearch search = new ProfileSearch();
		search.setUser(null);
		search.setPrivatePhoneMin("r9k32HpZs D5RCV");
		search.setPrivatePhoneMax("r9k32HpZs D5RCV");
		Collection<Profile> profiles = profileDAO.search(search);
		assertTrue(profiles.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		Profile profile = new Profile();

		profile.setUser(null);

		profile.setPrivatePhone("r9k32HpZs D5RCV");

		profileDAO.save(profile);
	}
}
