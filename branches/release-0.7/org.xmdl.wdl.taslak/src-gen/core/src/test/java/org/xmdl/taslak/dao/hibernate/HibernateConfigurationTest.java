package org.xmdl.taslak.dao.hibernate;

import java.util.*;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.persister.entity.EntityPersister;

/**
 *
 * 'org.xmdl.taslak' package Hibernate Configuration Test Case
 *  
 * $Id$
 *
 */
public class HibernateConfigurationTest extends BaseDaoTestCase {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void testColumnMapping() throws Exception {
		Session session = sessionFactory.openSession();
		try {
			Map<?, ?> metadata = sessionFactory.getAllClassMetadata();
			for (Object o : metadata.values()) {
				EntityPersister persister = (EntityPersister) o;
				String className = persister.getEntityName();
				log.debug("Trying select * from: " + className);
				Query q = session.createQuery("from " + className + " c");
				q.iterate();
				log.debug("ok: " + className);
			}
		} finally {
			session.close();
		}
	}
}