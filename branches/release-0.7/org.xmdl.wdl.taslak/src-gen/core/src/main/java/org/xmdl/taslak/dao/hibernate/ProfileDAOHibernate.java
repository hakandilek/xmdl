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
 * Profile DAO Hibernate implementation
 *  
 * $Id$
 *
 */
public class ProfileDAOHibernate extends GenericDaoHibernate<Profile, Long>
		implements
			ProfileDAO {

	/**
	 * Public default constructor
	 */
	public ProfileDAOHibernate() {
		super(Profile.class);
	}

	public Collection<Profile> search(ProfileSearch profileSearch) {
		if (log.isDebugEnabled()) {
			log.debug("search(ProfileSearch profileSearch) <-");
			log.debug("profileSearch: " + profileSearch);
		}

		Collection<Profile> list = null;
		if (profileSearch == null) {
			list = new ArrayList<Profile>();
		} else {

			User user = profileSearch.getUser();

			String minPrivatePhone = profileSearch.getPrivatePhoneMin();
			String maxPrivatePhone = profileSearch.getPrivatePhoneMax();

			if (log.isDebugEnabled()) {
				log.debug("search(ProfileSearch <-");

				log.debug("user       : " + user);

				log.debug("minPrivatePhone       : " + minPrivatePhone);
				log.debug("maxPrivatePhone       : " + maxPrivatePhone);

			}

			Session session = getSession();
			Criteria criteria = session.createCriteria(Profile.class);

			if (user != null)
				criteria.add(Restrictions.eq("user", user));

			if (minPrivatePhone != null)
				criteria.add(Restrictions.ge("privatePhone", minPrivatePhone));
			if (maxPrivatePhone != null)
				criteria.add(Restrictions.le("privatePhone", maxPrivatePhone));

			list = criteria.list();

		}

		if (log.isDebugEnabled())
			log.debug("search(ProfileSearch profileSearch) ->");
		return list;
	}
}
