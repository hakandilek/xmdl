package org.xmdl.taslak.webapp.action;

import org.xmdl.taslak.service.*;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.xmdl.ida.lib.web.test.BaseActionTestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.dao.DataIntegrityViolationException;
import org.hibernate.exception.ConstraintViolationException;
import java.util.*;

/**
 * Web action test case for ProfileAction
 *  
 * @author Hakan Dilek
 */
public class ProfileActionTest extends BaseActionTestCase {

	private ProfileAction action;

	@Override
	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();
		action = new ProfileAction();
		ProfileManager profileManager = (ProfileManager) applicationContext
				.getBean("profileManager");
		action.setProfileManager(profileManager);

		// add a test profile to the database
		Profile profile = new Profile();

		// enter all required fields
		profile.setPrivatePhone("jm85sM 2s5mntS ");

		profileManager.save(profile);
	}

	public void testSearch() throws Exception {
		ProfileSearch search = new ProfileSearch();
		action.setProfileSearch(search);

		assertEquals(action.list(), ActionSupport.SUCCESS);
		assertTrue(action.getProfiles().size() >= 1);
	}

	public void testCopy() throws Exception {
		action.setIdToCopy(1L);
		assertEquals("success", action.copy());
		assertNotNull(action.getProfile());
		assertNull(action.getProfile().getId());
	}

	public void testEdit() throws Exception {
		log.debug("testing edit...");
		action.setId(1L);
		assertNull(action.getProfile());
		assertEquals("success", action.edit());
		assertNotNull(action.getProfile());
		assertFalse(action.hasActionErrors());
	}

	public void testSave() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletActionContext.setRequest(request);
		action.setId(1L);
		assertEquals("success", action.edit());
		assertNotNull(action.getProfile());

		Profile profile = action.getProfile();
		// update required fields

		action.setProfile(profile);

		assertEquals("input", action.save());
		assertFalse(action.hasActionErrors());
		assertFalse(action.hasFieldErrors());
		assertNotNull(request.getSession().getAttribute("messages"));
	}

	public void testRemove() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletActionContext.setRequest(request);
		action.setDelete("");
		Profile profile = new Profile();
		profile.setId(2L);
		action.setProfile(profile);
		assertEquals("success", action.delete());
		assertNotNull(request.getSession().getAttribute("messages"));
	}

	public void testMassDelete() throws Exception {
		Profile p = action.getProfileManager().get(new Long(3));

		List<String> deleteIds = new ArrayList<String>();
		deleteIds.add(p.getId() + "");

		action.setDeleteId(deleteIds);
		try {
			assertEquals("success", action.deleteMass());
		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
		}
	}

	/*PROTECTED REGION ID(Profile.act.t.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
