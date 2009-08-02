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
 * Supplier DAO Hibernate implementation
 *  
 * $Id$
 *
 */
public class SupplierDAOHibernate extends GenericDaoHibernate<Supplier, Long>
		implements
			SupplierDAO {

	/**
	 * Public default constructor
	 */
	public SupplierDAOHibernate() {
		super(Supplier.class);
	}

	public Collection<Supplier> search(SupplierSearch supplierSearch) {
		if (log.isDebugEnabled()) {
			log.debug("search(SupplierSearch supplierSearch) <-");
			log.debug("supplierSearch: " + supplierSearch);
		}

		Collection<Supplier> list = null;
		if (supplierSearch == null) {
			list = new ArrayList<Supplier>();
		} else {

			String minName = supplierSearch.getNameMin();
			String maxName = supplierSearch.getNameMax();

			Product products = supplierSearch.getProducts();

			if (log.isDebugEnabled()) {
				log.debug("search(SupplierSearch <-");

				log.debug("minName       : " + minName);
				log.debug("maxName       : " + maxName);

				log.debug("products       : " + products);

			}

			Session session = getSession();
			Criteria criteria = session.createCriteria(Supplier.class);

			if (minName != null)
				criteria.add(Restrictions.ge("name", minName));
			if (maxName != null)
				criteria.add(Restrictions.le("name", maxName));

			if (products != null) {
				Criteria subCriteria = criteria.createCriteria("products");
				subCriteria.add(Restrictions.idEq(products.getId()));
			}

			list = criteria.list();

		}

		if (log.isDebugEnabled())
			log.debug("search(SupplierSearch supplierSearch) ->");
		return list;
	}
}
