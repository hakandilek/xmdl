package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * Order DAO Test Case
 *  
 * $Id$
 */
public class OrderDAOTest extends BaseDaoTestCase {

	private OrderDAO orderDAO = null;

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	public void testAddAndRemoveOrder() throws Exception {
		Order order = new Order();

		order.setName("uM7fRBsNrcku P5");

		order.setPriceTotals(new Double(0.806593589070036));

		order.setCreateDate(new Date(1013559368480L));

		order = orderDAO.save(order);
		flush();

		order = orderDAO.get(order.getId());

		assertNotNull(order.getId());
		assertEquals("uM7fRBsNrcku P5", order.getName());
		assertEquals(new Double(0.806593589070036), order.getPriceTotals());
		assertEquals(new Date(1013559368480L), order.getCreateDate());

		log.debug("removing order...");
		orderDAO.remove(order.getId());
		flush();

		try {
			orderDAO.get(order.getId());
			fail("Order found in database");
		} catch (DataAccessException dae) {
			log.debug("Expected exception: " + dae.getMessage());
			assertNotNull(dae);
		}
	}

	public void testSearch() throws Exception {
		OrderSearch search = new OrderSearch();

		search.setName("uM7fRBsNrcku P5");

		search.setPriceTotalsMin(new Double(0.806593589070036));
		search.setPriceTotalsMax(new Double(0.806593589070036));

		search.setCreateDateMin(new Date(1013559368480L));
		search.setCreateDateMax(new Date(1013559368480L));

		Collection<Order> orders = orderDAO.search(search);
		assertTrue(orders.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		Order order = new Order();

		order.setName("uM7fRBsNrcku P5");

		order.setPriceTotals(new Double(0.806593589070036));

		order.setCreateDate(new Date(1013559368480L));

		orderDAO.save(order);
	}
}
