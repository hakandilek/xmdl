package org.xmdl.taslak.service.impl;

import java.util.*;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.jmock.Mock;
import org.xmdl.ida.lib.test.BaseManagerMockTestCase;
import org.xmdl.taslak.dao.*;

/**
 * Order Service Implementation Test
 */
public class OrderManagerImplTest extends BaseManagerMockTestCase {

	private OrderManagerImpl manager = null;

	private Mock dao = null;

	private Order order = null;

	protected void setUp() throws Exception {
		dao = new Mock(OrderDAO.class);
		manager = new OrderManagerImpl((OrderDAO) dao.proxy());
	}

	protected void tearDown() throws Exception {
		manager = null;
	}

	public void testGet() {
		log.debug("testing get");

		Long id = 7L;
		order = new Order();

		// set expected behavior on DAO
		dao.expects(once()).method("get").with(eq(id)).will(returnValue(order));

		Order result = manager.get(id);
		assertSame(order, result);
	}

	public void testGetAll() {
		log.debug("testing getAll");

		List<Order> list = new ArrayList<Order>();

		// set expected behavior on dao
		dao.expects(once()).method("getAll").will(returnValue(list));

		List<Order> result = manager.getAll();
		assertSame(list, result);
	}

	public void testSearch() {
		log.debug("testing search");

		List<Order> list = new ArrayList<Order>();
		OrderSearch searchBean = new OrderSearch();

		// set expected behavior on DAO
		dao.expects(once()).method("search").with(eq(searchBean)).will(
				returnValue(list));

		Collection<Order> result = manager.search(searchBean);
		assertSame(list, result);
	}

	public void testSave() {
		log.debug("testing save");

		order = new Order();

		// set expected behavior on DAO
		dao.expects(once()).method("save").with(same(order)).will(
				returnValue(order));

		manager.save(order);
	}

	public void testRemove() {
		log.debug("testing remove");

		Long id = 11L;
		order = new Order();

		// set expected behavior on DAO
		dao.expects(once()).method("remove").with(eq(id)).isVoid();

		manager.remove(id);
	}

	/*PROTECTED REGION ID(Order.svc.t.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
