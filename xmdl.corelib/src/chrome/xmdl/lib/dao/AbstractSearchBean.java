package chrome.xmdl.lib.dao;

public abstract class AbstractSearchBean<E extends Entity>
        extends AbstractEntity implements SearchBean<E> {

    private String orderProperty_;
    private boolean isAscending_;
    private int maxResults_;
    private int firstResult_;

    public String getOrderProperty_() {
        return orderProperty_;
    }

    public void setOrderProperty_(String orderProperty_) {
        this.orderProperty_ = orderProperty_;
    }

    public boolean isAscending_() {
        return isAscending_;
    }

    public void setAscending_(boolean ascending_) {
        isAscending_ = ascending_;
    }

    public int getMaxResults_() {
        return maxResults_;
    }

    public void setMaxResults_(int maxResults_) {
        this.maxResults_ = maxResults_;
    }

    public int getFirstResult_() {
        return firstResult_;
    }

    public void setFirstResult_(int firstResult_) {
        this.firstResult_ = firstResult_;
    }
}
