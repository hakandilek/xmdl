package org.xmdl.taslak.service;

import java.util.Collection;
import org.xmdl.ida.lib.service.GenericManager;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Order Service interface
 */
public interface OrderManager extends GenericManager<Order, Long> {

	Collection<Order> search(OrderSearch orderSearch);

	/*PROTECTED REGION ID(Order.svc.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
