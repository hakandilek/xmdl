package org.xmdl.lib.bo;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.chain.Context;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xmdl.lib.dao.*;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.List;

/**
 * Abstract entity service 
 * @author hd
 * @author mca
 */
public abstract class AbstractEntityService <E extends Entity> extends DispatchService implements EntityService<E> {
    private static final Log LOGGER = LogFactory.getLog(AbstractEntityService.class);

    public abstract DAO<E> getDAO();

    protected Identifier createIdentifier(Context context) {
        return new BasicIdentifier();
    }

    protected Serializable[] extractKeys(Object o) throws NotSerializableException {
        Serializable[] keys = new Serializable[0];
        LOGGER.debug("o = " + o);
        if (o == null){
            return keys;
        }
        if (o instanceof Serializable[]) {
            keys = (Serializable[]) o;
        } else if (o instanceof Serializable) {
            keys = new Serializable[]{(Serializable) o};
        } else {
            LOGGER.error("Keys are not Serializable = " + o);
            throw new NotSerializableException("Keys are not Serializable");
        }
        return keys;
    }

    public boolean delete(Context context) throws Exception {
        LOGGER.debug("delete.execute");

        Identifier identifier = createIdentifier(context);
        //DAO<E> getDAO() = getDAO();

        Object oKeys = getKeys(context);
        Serializable[] keys = extractKeys(oKeys);
        LOGGER.debug("keys = " + keys);

        getDAO().dbDelete(keys, identifier);
        List<E> all = getDAO().findAll(identifier);
        LOGGER.debug("all.size() = " + all.size());
        putEntityList(context, all);

        return true;
    }

    public boolean edit(Context context) throws Exception {
        LOGGER.debug("edit.execute");
        Identifier identifier = createIdentifier(context);

        List<E> list = getEntityList(context);
        if (LOGGER.isDebugEnabled()) {
            int s = list == null ? 0 : list.size();
            LOGGER.debug("list.size() = " + s);
        }

        if (list == null) {
            List<E> all = getDAO().findAll(identifier);
            putEntityList(context, all);
        }

        E entity = getEntity(context);
        LOGGER.debug("entity = " + entity);
        Boolean copy = (Boolean) context.get(COPY_KEY);
        if (copy == null) copy = Boolean.FALSE;
        LOGGER.debug("copy = " + copy);
        Long id = (Long) entity.getID();
        LOGGER.debug("id = " + id);
        if (id > 0) {
            E dbEntity = getDAO().load(id, identifier);
            if (copy) {
                E e = getDAO().newEntity();
                BeanUtils.copyProperties(e, dbEntity);
                dbEntity = e;
                dbEntity.setID(0);
            }
            LOGGER.debug("dbEntity = " + dbEntity);
            putEntity(context, dbEntity);
        }

        return true;
    }

    public boolean save(Context context) throws Exception {
        LOGGER.debug("save.execute");

        E originalE = getEntity(context);
        Identifier identifier = createIdentifier(context);
        //DAO<E> getDAO() = getDAO();
        E entity = getDAO().newEntity();
        BeanUtils.copyProperties(entity, originalE);

        getDAO().dbModify(entity, identifier);
        List<E> all = getDAO().findAll(identifier);
        putEntity(context, entity);
        putEntityList(context, all);
        return true;
    }

    public boolean search(Context context) throws Exception {
        LOGGER.debug("search.execute");

        Identifier identifier = createIdentifier(context);
        //DAO<E> getDAO() = getDAO();

        SearchBean<E> searchBean = getSearchBean(context);
        LOGGER.debug("searchBean = " + searchBean);

        List<E> all = getDAO().search(searchBean, identifier);
        LOGGER.debug("all.size() = " + all.size());
        putEntityList(context, all);

        return true;
    }

}
