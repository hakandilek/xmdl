package org.xmdl.taslak.service;

import java.util.Collection;
import org.xmdl.ida.lib.service.GenericManager;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * OrderElement Service interface
 */
public interface OrderElementManager extends GenericManager<OrderElement, Long> {

	Collection<OrderElement> search(OrderElementSearch orderElementSearch);

	void copyFrom(Order source, Order destination);

	/*PROTECTED REGION ID(OrderElement.svc.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
