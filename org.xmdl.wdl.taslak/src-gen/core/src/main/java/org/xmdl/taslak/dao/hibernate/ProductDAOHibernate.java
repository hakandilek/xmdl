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
 * Product DAO Hibernate implementation
 *  
 * $Id$
 *
 */
public class ProductDAOHibernate extends GenericDaoHibernate<Product, Long>
		implements
			ProductDAO {

	/**
	 * Public default constructor
	 */
	public ProductDAOHibernate() {
		super(Product.class);
	}

	public Collection<Product> search(ProductSearch productSearch) {
		if (log.isDebugEnabled()) {
			log.debug("search(ProductSearch productSearch) <-");
			log.debug("productSearch: " + productSearch);
		}

		Collection<Product> list = null;
		if (productSearch == null) {
			list = new ArrayList<Product>();
		} else {

			String name = productSearch.getName();

			ProductType minProductType = productSearch.getProductTypeMin();
			ProductType maxProductType = productSearch.getProductTypeMax();

			OrderElement orderElements = productSearch.getOrderElements();

			Supplier suppliers = productSearch.getSuppliers();

			if (log.isDebugEnabled()) {
				log.debug("search(ProductSearch <-");

				log.debug("name       : " + name);

				log.debug("minProductType       : " + minProductType);
				log.debug("maxProductType       : " + maxProductType);

				log.debug("orderElements       : " + orderElements);

				log.debug("suppliers       : " + suppliers);

			}

			Session session = getSession();
			Criteria criteria = session.createCriteria(Product.class);

			if (name != null)
				criteria.add(Restrictions.eq("name", name));

			if (minProductType != null)
				criteria.add(Restrictions.ge("productType", minProductType));
			if (maxProductType != null)
				criteria.add(Restrictions.le("productType", maxProductType));

			if (orderElements != null) {
				Criteria subCriteria = criteria.createCriteria("orderElements");
				subCriteria.add(Restrictions.idEq(orderElements.getId()));
			}

			if (suppliers != null) {
				Criteria subCriteria = criteria.createCriteria("suppliers");
				subCriteria.add(Restrictions.idEq(suppliers.getId()));
			}

			list = criteria.list();

		}

		if (log.isDebugEnabled())
			log.debug("search(ProductSearch productSearch) ->");
		return list;
	}
}
