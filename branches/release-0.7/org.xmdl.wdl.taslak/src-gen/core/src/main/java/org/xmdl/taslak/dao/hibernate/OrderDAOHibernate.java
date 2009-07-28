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
 * Order DAO Hibernate implementation
 *  
 * $Id$
 *
 */
public class OrderDAOHibernate extends GenericDaoHibernate<Order, Long>
		implements
			OrderDAO {

	/**
	 * Public default constructor
	 */
	public OrderDAOHibernate() {
		super(Order.class);
	}

	public Collection<Order> search(OrderSearch orderSearch) {
		if (log.isDebugEnabled()) {
			log.debug("search(OrderSearch orderSearch) <-");
			log.debug("orderSearch: " + orderSearch);
		}

		Collection<Order> list = null;
		if (orderSearch == null) {
			list = new ArrayList<Order>();
		} else {

			String minName = orderSearch.getNameMin();
			String maxName = orderSearch.getNameMax();

			Double minPriceTotals = orderSearch.getPriceTotalsMin();
			Double maxPriceTotals = orderSearch.getPriceTotalsMax();

			Date createDate = orderSearch.getCreateDate();

			OrderElement orderElements = orderSearch.getOrderElements();

			if (log.isDebugEnabled()) {
				log.debug("search(OrderSearch <-");

				log.debug("minName       : " + minName);
				log.debug("maxName       : " + maxName);

				log.debug("minPriceTotals       : " + minPriceTotals);
				log.debug("maxPriceTotals       : " + maxPriceTotals);

				log.debug("createDate       : " + createDate);

				log.debug("orderElements       : " + orderElements);

			}

			Session session = getSession();
			Criteria criteria = session.createCriteria(Order.class);

			if (minName != null)
				criteria.add(Restrictions.ge("name", minName));
			if (maxName != null)
				criteria.add(Restrictions.le("name", maxName));

			if (minPriceTotals != null)
				criteria.add(Restrictions.ge("priceTotals", minPriceTotals));
			if (maxPriceTotals != null)
				criteria.add(Restrictions.le("priceTotals", maxPriceTotals));

			if (createDate != null)
				criteria.add(Restrictions.eq("createDate", createDate));

			if (orderElements != null) {
				Criteria subCriteria = criteria.createCriteria("orderElements");
				subCriteria.add(Restrictions.idEq(orderElements.getId()));
			}

			list = criteria.list();

		}

		if (log.isDebugEnabled())
			log.debug("search(OrderSearch orderSearch) ->");
		return list;
	}
}
