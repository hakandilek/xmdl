package org.xmdl.taslak.service.impl;

import java.util.Collection;
import org.xmdl.ida.lib.service.impl.GenericManagerImpl;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.service.*;
import org.xmdl.taslak.dao.*;

/**
 * OrderElement Service implementation
 */
public class OrderElementManagerImpl
		extends
			GenericManagerImpl<OrderElement, Long>
		implements
			OrderElementManager {

	private final OrderElementDAO orderElementDAO;

	public OrderElementManagerImpl(OrderElementDAO orderElementDAO) {
		super(orderElementDAO);
		this.orderElementDAO = orderElementDAO;
	}

	public Collection<OrderElement> search(OrderElementSearch orderElementSearch) {
		return orderElementDAO.search(orderElementSearch);
	}

	public void copyFrom(Order source, Order destination) {
		OrderElementSearch search = new OrderElementSearch();
		search.setOrder(source);

		Collection<OrderElement> children = orderElementDAO.search(search);
		for (OrderElement child : children) {
			OrderElement copy = child.createClone();
			copy.setOrder(destination);
			save(copy);
		}
	}

	/*PROTECTED REGION ID(OrderElement.svc.imp.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
