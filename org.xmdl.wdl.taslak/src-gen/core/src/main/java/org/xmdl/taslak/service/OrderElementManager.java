package org.xmdl.taslak.service;

import java.util.Collection;
import org.xmdl.ida.lib.service.GenericManager;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * OrderElement Service interface
 *  
 * $Id$
 */
public interface OrderElementManager extends GenericManager<OrderElement, Long> {

	Collection<OrderElement> search(OrderElementSearch orderElementSearch);

	void copyFrom(Order source, Order destination);

}
