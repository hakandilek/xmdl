package chrome.xmdl.lib.dao;

/**
 * Created by IntelliJ IDEA.
 * User: tr1d2643
 * Date: 21.Ara.2005
 * Time: 14:36:33
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionManager {
    void beginTransaction();
    void commitTransaction();
    void rollbackTransaction();
}
