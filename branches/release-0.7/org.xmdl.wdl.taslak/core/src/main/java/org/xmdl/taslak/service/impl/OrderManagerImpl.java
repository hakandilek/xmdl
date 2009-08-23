package org.xmdl.taslak.service.impl;

import java.util.Collection;
import org.xmdl.ida.lib.service.impl.GenericManagerImpl;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.service.*;
import org.xmdl.taslak.dao.*;

/**
 * Order Service implementation
 */
public class OrderManagerImpl extends GenericManagerImpl<Order, Long>
		implements
			OrderManager {

	private final OrderDAO orderDAO;

	public OrderManagerImpl(OrderDAO orderDAO) {
		super(orderDAO);
		this.orderDAO = orderDAO;
	}

	public Collection<Order> search(OrderSearch orderSearch) {
		return orderDAO.search(orderSearch);
	}

	/*PROTECTED REGION ID(Order.svc.imp.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}