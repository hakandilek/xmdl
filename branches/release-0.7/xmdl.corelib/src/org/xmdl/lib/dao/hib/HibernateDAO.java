package org.xmdl.lib.dao.hib;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xmdl.lib.dao.DAO;
import org.xmdl.lib.dao.DataAccessException;
import org.xmdl.lib.dao.Entity;
import org.xmdl.lib.dao.Identifier;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * Hibernate implementation of DAO, uses
 * {@link HibernateDaoSupport} implementation from Spring
 *
 * @author mca
 * @author hd
 */

public abstract class HibernateDAO <E extends Entity>
        extends HibernateDaoSupport implements DAO<E> {

    private static final Log LOGGER = LogFactory.getLog(HibernateDAO.class);

    public HibernateDAO() {
        super();
        Locale.setDefault(Locale.ENGLISH);
    }

    /**
     * inner method for handing EntitiyClass
     *
     * @return Entity Class type
     */
    protected abstract Class<E> getEntityClass();

    @SuppressWarnings("unchecked")
	public List<E> findAll(Serializable[] pks, Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.findAll");
        if (pks == null)
            return Collections.emptyList();
        Serializable[] array = new Serializable[pks.length];
        for (int i = 0; i < pks.length; i++) {
            array[i] = pks[i];
        }
        try {
            Query _query = getSession().createQuery("from " + getEntityClass().getName() + " as o where o.ID in (:IDset) ");
            _query.setParameterList("IDset", array, Hibernate.LONG);
            List<E> list = _query.list();
			return list;
        } catch (HibernateException e) {
            throw convertException(e);                   
        }
    }

    public void dbInsert(E entity, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.dbInsert");
        try {
            getSession().save(entity);
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
    }

    public void dbUpdate(E entity, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.dbUpdate");
        try {
            getSession().update(entity);
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
    }

    public void dbModify(E entity, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.dbModify");
        if (entity.getID() == 0) {
            dbInsert(entity, identifier);
        } else {
            dbUpdate(entity, identifier);
        }
    }

    public void dbDelete(Serializable pKey, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.dbDelete");
        dbDelete(loadLazy(pKey, identifier), identifier);
    }

    public void dbDelete(E e, Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.dbDelete");
        try {
            getSession().delete(e);
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
    }

    public void dbDelete(Serializable[] pKeys, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.dbDelete");
        for (int i = 0; i < pKeys.length; i++) {
            Serializable pKey = pKeys[i];
            dbDelete(pKey, identifier);
        }
    }

    @SuppressWarnings("unchecked")
	public List<E> findAll(Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.findAll");
        List<E> items;
        try {
            Class<E> clazz = getEntityClass();
            Session session = getSession();
			Criteria criteria = session.createCriteria(clazz);
			items = criteria.list();
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
        return items;
    }

    @SuppressWarnings("unchecked")
	public List<E> findByExample(E sample, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.findByExample");
        List<E> list;
        try {
            Class<E> clazz = getEntityClass();
            Criteria crit = getSession().createCriteria(clazz);
            Example example = Example.create(sample);
			Criteria criteria = crit.add(example);
			list = criteria.list();
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
        return list;
    }

    @SuppressWarnings("unchecked")
	public E load(Serializable pk, Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.load");
        Class<E> entityClass = getEntityClass();
        try {
            Session session = getSession();
			E e = (E) session.get(entityClass, pk);
			return e;
        } catch (HibernateException e) {
            throw convertException(e);
        }
    }

    @SuppressWarnings("unchecked")
	public E loadLazy(Serializable pk, Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.loadLazy");
        Class<E> entityClass = getEntityClass();
        try {
            Session session = getSession();
			E load = (E) session.load(entityClass, pk);
			return load;
        } catch (HibernateException e) {
            throw convertException(e);
        }
    }

    private DataAccessException convertException(HibernateException e) {
        return new DataAccessException(e);
    }
}
