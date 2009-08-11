package org.xmdl.taslak.dao.hibernate;

import org.xmdl.ida.lib.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.apache.commons.lang.StringUtils;
import java.util.*;
import org.xmdl.mesken.model.*;

import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.dao.*;

/**
 *
 * OrderElement DAO Hibernate implementation
 *  
 * $Id$
 *
 */
public class OrderElementDAOHibernate
		extends
			GenericDaoHibernate<OrderElement, Long> implements OrderElementDAO {

	/**
	 * Public default constructor
	 */
	public OrderElementDAOHibernate() {
		super(OrderElement.class);
	}

	public Collection<OrderElement> search(OrderElementSearch orderElementSearch) {
		if (log.isDebugEnabled()) {
			log.debug("search(OrderElementSearch orderElementSearch) <-");
			log.debug("orderElementSearch: " + orderElementSearch);
		}

		Collection<OrderElement> list = null;
		if (orderElementSearch == null) {
			list = new ArrayList<OrderElement>();
		} else {

			Long minQuantity = orderElementSearch.getQuantityMin();
			Long maxQuantity = orderElementSearch.getQuantityMax();

			Order order = orderElementSearch.getOrder();

			Product product = orderElementSearch.getProduct();

			if (log.isDebugEnabled()) {
				log.debug("search(OrderElementSearch <-");

				log.debug("minQuantity       : " + minQuantity);
				log.debug("maxQuantity       : " + maxQuantity);

				log.debug("order       : " + order);

				log.debug("product       : " + product);

			}

			Session session = getSession();
			Criteria criteria = session.createCriteria(OrderElement.class);

			if (minQuantity != null)
				criteria.add(Restrictions.ge("quantity", minQuantity));
			if (maxQuantity != null)
				criteria.add(Restrictions.le("quantity", maxQuantity));

			if (order != null) {
				Criteria subCriteria = criteria.createCriteria("order");
				subCriteria.add(Restrictions.idEq(order.getId()));
			}

			if (product != null) {
				Criteria subCriteria = criteria.createCriteria("product");
				subCriteria.add(Restrictions.idEq(product.getId()));
			}

			list = criteria.list();

		}

		if (log.isDebugEnabled())
			log.debug("search(OrderElementSearch orderElementSearch) ->");
		return list;
	}
}
