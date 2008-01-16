package org.xmdl.lib.dao;

/**
 * Bean holding Search criterion. 
 * @author hd
 */
public interface SearchBean<E> extends Bean {

    public void setID(long pKey);

    public long getID();

    public String getOrderProperty_();

    public void setOrderProperty_(String orderProperty_);

    public boolean isAscending_();

    public void setAscending_(boolean asccending_);

    public int getMaxResults_();

    public void setMaxResults_(int maxResults_);

    public int getFirstResult_();

    public void setFirstResult_(int firstResult_);

}
