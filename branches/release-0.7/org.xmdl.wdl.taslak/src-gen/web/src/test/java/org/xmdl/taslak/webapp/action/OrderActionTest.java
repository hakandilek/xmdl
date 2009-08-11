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
 * Web action test case for OrderAction
 *  
 * @author Hakan Dilek
 */
public class OrderActionTest extends BaseActionTestCase {

	private OrderAction action;

	@Override
	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();
		action = new OrderAction();
		OrderManager orderManager = (OrderManager) applicationContext
				.getBean("orderManager");
		action.setOrderManager(orderManager);

		// add a test order to the database
		Order order = new Order();

		// enter all required fields
		order.setName("EbmK afatU2Xc8 ");
		order.setPriceTotals(new Double(0.6571071197650238));
		order.setCreateDate(new Date(1037512640463L));

		orderManager.save(order);
	}

	public void testSearch() throws Exception {
		OrderSearch search = new OrderSearch();
		action.setOrderSearch(search);

		assertEquals(action.list(), ActionSupport.SUCCESS);
		assertTrue(action.getOrders().size() >= 1);
	}

	public void testCopy() throws Exception {
		action.setIdToCopy(1L);
		assertEquals("success", action.copy());
		assertNotNull(action.getOrder());
		assertNull(action.getOrder().getId());
	}

	public void testEdit() throws Exception {
		log.debug("testing edit...");
		action.setId(1L);
		assertNull(action.getOrder());
		assertEquals("success", action.edit());
		assertNotNull(action.getOrder());
		assertFalse(action.hasActionErrors());
	}

	public void testSave() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletActionContext.setRequest(request);
		action.setId(1L);
		assertEquals("success", action.edit());
		assertNotNull(action.getOrder());

		Order order = action.getOrder();
		// update required fields

		action.setOrder(order);

		assertEquals("input", action.save());
		assertFalse(action.hasActionErrors());
		assertFalse(action.hasFieldErrors());
		assertNotNull(request.getSession().getAttribute("messages"));
	}

	public void testRemove() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletActionContext.setRequest(request);
		action.setDelete("");
		Order order = new Order();
		order.setId(2L);
		action.setOrder(order);
		assertEquals("success", action.delete());
		assertNotNull(request.getSession().getAttribute("messages"));
	}

	public void testMassDelete() throws Exception {
		Order p = action.getOrderManager().get(new Long(3));

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
}
