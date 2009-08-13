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
 * Web action test case for OrderElementAction
 *  
 * @author Hakan Dilek
 */
public class OrderElementActionTest extends BaseActionTestCase {

	private OrderElementAction action;

	@Override
	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();
		action = new OrderElementAction();
		OrderElementManager orderElementManager = (OrderElementManager) applicationContext
				.getBean("orderElementManager");
		action.setOrderElementManager(orderElementManager);

		// add a test orderElement to the database
		OrderElement orderElement = new OrderElement();

		// enter all required fields
		orderElement.setQuantity(new Long(-8244772088778785312L));
		Order order = new Order();
		order.setId(1L);
		orderElement.setOrder(order);
		Product product = new Product();
		product.setId(1L);
		orderElement.setProduct(product);

		orderElementManager.save(orderElement);
	}

	public void testSearch() throws Exception {
		OrderElementSearch search = new OrderElementSearch();
		action.setOrderElementSearch(search);

		assertEquals(action.list(), ActionSupport.SUCCESS);
		assertTrue(action.getOrderElements().size() >= 1);
	}

	public void testCopy() throws Exception {
		action.setIdToCopy(1L);
		assertEquals("success", action.copy());
		assertNotNull(action.getOrderElement());
		assertNull(action.getOrderElement().getId());
	}

	public void testEdit() throws Exception {
		log.debug("testing edit...");
		action.setId(1L);
		assertNull(action.getOrderElement());
		assertEquals("success", action.edit());
		assertNotNull(action.getOrderElement());
		assertFalse(action.hasActionErrors());
	}

	public void testSave() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletActionContext.setRequest(request);
		action.setId(1L);
		assertEquals("success", action.edit());
		assertNotNull(action.getOrderElement());

		OrderElement orderElement = action.getOrderElement();
		// update required fields

		action.setOrderElement(orderElement);

		assertEquals("input", action.save());
		assertFalse(action.hasActionErrors());
		assertFalse(action.hasFieldErrors());
		assertNotNull(request.getSession().getAttribute("messages"));
	}

	public void testRemove() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletActionContext.setRequest(request);
		action.setDelete("");
		OrderElement orderElement = new OrderElement();
		orderElement.setId(2L);
		action.setOrderElement(orderElement);
		assertEquals("success", action.delete());
		assertNotNull(request.getSession().getAttribute("messages"));
	}

	public void testMassDelete() throws Exception {
		OrderElement p = action.getOrderElementManager().get(new Long(3));

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
