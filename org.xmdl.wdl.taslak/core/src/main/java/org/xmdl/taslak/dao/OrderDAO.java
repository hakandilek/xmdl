package org.xmdl.taslak.dao;

import java.util.*;
import org.xmdl.ida.lib.dao.GenericDao;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Order DAO interface
 */
public interface OrderDAO extends GenericDao<Order, Long> {

	Collection<Order> search(OrderSearch searchBean);

}
