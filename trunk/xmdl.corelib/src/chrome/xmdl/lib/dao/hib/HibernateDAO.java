package chrome.xmdl.lib.dao.hib;

import chrome.xmdl.lib.dao.DAO;
import chrome.xmdl.lib.dao.DataAccessException;
import chrome.xmdl.lib.dao.Entity;
import chrome.xmdl.lib.dao.Identifier;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
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
    protected abstract Class getEntityClass();

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
            return _query.list();
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

    public List<E> findAll(Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.findAll");
        List<E> items;
        try {
            Class clazz = getEntityClass();
            items = getSession().createCriteria(clazz).list();
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
        return items;
    }

    public List<E> findByExample(E sample, Identifier identifier)
            throws DataAccessException {
        LOGGER.debug("HibernateDAO.findByExample");
        List<E> list;
        try {
            Class clazz = getEntityClass();
            Criteria crit = getSession().createCriteria(clazz);
            list = crit.add(Example.create(sample)).list();
        } catch (HibernateException ex) {
            throw convertException(ex);
        }
        return list;
    }

    public E load(Serializable pk, Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.load");
        Class entityClass = getEntityClass();
        try {
            return (E) getSession().get(entityClass, pk);
        } catch (HibernateException e) {
            throw convertException(e);
        }
    }

    public E loadLazy(Serializable pk, Identifier identifier) throws DataAccessException {
        LOGGER.debug("HibernateDAO.loadLazy");
        Class entityClass = getEntityClass();
        try {
            return (E) getSession().load(entityClass, pk);
        } catch (HibernateException e) {
            throw convertException(e);
        }
    }

    private DataAccessException convertException(HibernateException e) {
        return new DataAccessException(e);
    }
}
