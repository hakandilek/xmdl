package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * OrderElement DAO Test Case
 *  
 * $Id$
 */
public class OrderElementDAOTest extends BaseDaoTestCase {

	private OrderElementDAO orderElementDAO = null;

	public void setOrderElementDAO(OrderElementDAO orderElementDAO) {
		this.orderElementDAO = orderElementDAO;
	}

	public void testAddAndRemoveOrderElement() throws Exception {
		OrderElement orderElement = new OrderElement();

		orderElement.setQuantity(new Long(4769081124694304450L));

		orderElement = orderElementDAO.save(orderElement);
		flush();

		orderElement = orderElementDAO.get(orderElement.getId());

		assertNotNull(orderElement.getId());
		assertEquals(new Long(4769081124694304450L), orderElement.getQuantity());

		log.debug("removing orderElement...");
		orderElementDAO.remove(orderElement.getId());
		flush();

		try {
			orderElementDAO.get(orderElement.getId());
			fail("OrderElement found in database");
		} catch (DataAccessException dae) {
			log.debug("Expected exception: " + dae.getMessage());
			assertNotNull(dae);
		}
	}

	public void testSearch() throws Exception {
		OrderElementSearch search = new OrderElementSearch();
		search.setQuantityMin(new Long(4769081124694304450L));
		search.setQuantityMax(new Long(4769081124694304450L));
		Collection<OrderElement> orderElements = orderElementDAO.search(search);
		assertTrue(orderElements.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		OrderElement orderElement = new OrderElement();

		orderElement.setQuantity(new Long(4769081124694304450L));

		orderElementDAO.save(orderElement);
	}
}
