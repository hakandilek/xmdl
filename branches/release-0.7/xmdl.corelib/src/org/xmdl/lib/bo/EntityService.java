package org.xmdl.lib.bo;

import org.apache.commons.chain.Context;
import org.xmdl.lib.dao.Entity;
import org.xmdl.lib.dao.SearchBean;

import java.util.List;

/**
 * $Id: EntityService.java,v 1.8 2006/02/13 08:37:13 tr001\tr1d2643 Exp $
 * @author hd
 */
public interface EntityService <E extends Entity> extends Service {

    static final Object COPY_KEY = Entity.class.getName() + ".copy";

    void putEntity(Context context, E entity);

    E getEntity(Context context);

    Object getKeys(Context context);

    void putEntityList(Context context, List<E> list);

    List<E> getEntityList(Context context);

    void putID(Context context, Long id);

    Long getID(Context context);

    boolean delete(Context ctx) throws Exception;

    boolean edit(Context ctx) throws Exception;

    boolean save(Context ctx) throws Exception;

    boolean search(Context ctx) throws Exception;

    SearchBean<E> getSearchBean(Context context);

    void putSearchBean(Context context, SearchBean<E> searchBean);

}
