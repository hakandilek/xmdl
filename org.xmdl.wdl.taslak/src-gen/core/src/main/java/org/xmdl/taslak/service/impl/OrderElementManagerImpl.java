package org.xmdl.taslak.service.impl;

import java.util.Collection;
import org.xmdl.ida.lib.service.impl.GenericManagerImpl;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.service.*;
import org.xmdl.taslak.dao.*;

/**
 *
 * OrderElement Service implementation
 *  
 * $Id$
 *
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

}
