package org.xmdl.taslak.service.impl;

import java.util.*;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.jmock.Mock;
import org.xmdl.ida.lib.test.BaseManagerMockTestCase;
import org.xmdl.taslak.dao.*;

/**
 * OrderElement Service Implementation Test
 */
public class OrderElementManagerImplTest extends BaseManagerMockTestCase {

	private OrderElementManagerImpl manager = null;

	private Mock dao = null;

	private OrderElement orderElement = null;

	protected void setUp() throws Exception {
		dao = new Mock(OrderElementDAO.class);
		manager = new OrderElementManagerImpl((OrderElementDAO) dao.proxy());
	}

	protected void tearDown() throws Exception {
		manager = null;
	}

	public void testGet() {
		log.debug("testing get");

		Long id = 7L;
		orderElement = new OrderElement();

		// set expected behavior on DAO
		dao.expects(once()).method("get").with(eq(id)).will(
				returnValue(orderElement));

		OrderElement result = manager.get(id);
		assertSame(orderElement, result);
	}

	public void testGetAll() {
		log.debug("testing getAll");

		List<OrderElement> list = new ArrayList<OrderElement>();

		// set expected behavior on dao
		dao.expects(once()).method("getAll").will(returnValue(list));

		List<OrderElement> result = manager.getAll();
		assertSame(list, result);
	}

	public void testSearch() {
		log.debug("testing search");

		List<OrderElement> list = new ArrayList<OrderElement>();
		OrderElementSearch searchBean = new OrderElementSearch();

		// set expected behavior on DAO
		dao.expects(once()).method("search").with(eq(searchBean)).will(
				returnValue(list));

		Collection<OrderElement> result = manager.search(searchBean);
		assertSame(list, result);
	}

	public void testSave() {
		log.debug("testing save");

		orderElement = new OrderElement();

		// set expected behavior on DAO
		dao.expects(once()).method("save").with(same(orderElement)).will(
				returnValue(orderElement));

		manager.save(orderElement);
	}

	public void testRemove() {
		log.debug("testing remove");

		Long id = 11L;
		orderElement = new OrderElement();

		// set expected behavior on DAO
		dao.expects(once()).method("remove").with(eq(id)).isVoid();

		manager.remove(id);
	}

	/*PROTECTED REGION ID(OrderElement.svc.t.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
