package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Order DAO Test Case
 */
public class OrderDAOTest extends BaseDaoTestCase {

	private OrderDAO orderDAO = null;

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	public void testAddAndRemoveOrder() throws Exception {
		Order order = new Order();

		order.setName("EbmK afatU2Xc8 ");

		order.setPriceTotals(new Double(0.6571071197650238));

		order.setCreateDate(new Date(1037512640463L));

		order = orderDAO.save(order);
		flush();

		order = orderDAO.get(order.getId());

		assertNotNull(order.getId());
		assertEquals("EbmK afatU2Xc8 ", order.getName());
		assertEquals(new Double(0.6571071197650238), order.getPriceTotals());
		assertEquals(new Date(1037512640463L), order.getCreateDate());

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

		search.setName("EbmK afatU2Xc8 ");

		search.setPriceTotalsMin(new Double(0.6571071197650238));
		search.setPriceTotalsMax(new Double(0.6571071197650238));

		search.setCreateDateMin(new Date(1037512640463L));
		search.setCreateDateMax(new Date(1037512640463L));

		Collection<Order> orders = orderDAO.search(search);
		assertTrue(orders.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		Order order = new Order();

		order.setName("EbmK afatU2Xc8 ");

		order.setPriceTotals(new Double(0.6571071197650238));

		order.setCreateDate(new Date(1037512640463L));

		orderDAO.save(order);
	}

	/*PROTECTED REGION ID(Order.dao.t.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
