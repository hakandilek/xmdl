package chrome.xmdl.lib.dao;

import java.util.List;
import java.io.Serializable;

/**
 * Standard DAO interface
 * 
 * @version 1.0
 * @author hd
 * @author mca
 */
public interface DAO<E extends Entity> {
	/**
     * Creates a new Entity
     * @return
     */
	E newEntity();

    /**
	 * save the object at persistance layer
	 */
	 void dbInsert(E entity, Identifier identifier)
			throws DataAccessException;
	/**
	 * update of save the object at persistance layer
	 */
	void dbUpdate(E entity, Identifier identifier)
			throws DataAccessException;

	/**
	 * update of save the object at persistance layer
	 */

	void dbModify(E entity, Identifier identifier)
			throws DataAccessException;

	/**
	 * delete the object from persistance layer
	 */
	void dbDelete(E entity, Identifier identifier)
			throws DataAccessException;

	/**
	 * delete instance of object with given key
	 */
	void dbDelete(Serializable pKey, Identifier identifier)
			throws DataAccessException;

	/**
	 * delete all instance of objects with given keys
	 */
	void dbDelete(Serializable[] pKeys, Identifier identifier)
			throws DataAccessException;

	/**
	 * return all instance of E object
	 */
	List<E> findAll(Identifier identifier) throws DataAccessException;
	/**
	 * return all instance of E object
	 */
	List<E> findAll(Serializable[] pks,Identifier identifier) throws DataAccessException;
	
	/**
	 * todo: javadoc here
	 * */
	List<E> findByExample(E example, Identifier identifier)
			throws DataAccessException;

	/**
	 * *loaded object <code>null</code> for not found objects.
	 * 
	 * @param pk
	 * @param identifier
	 * @return E instance
	 * @throws DataAccessException
	 */
	E load(Serializable pk, Identifier identifier) throws DataAccessException;

	/**
	 * Lazy Loading
	 * 
	 * @param pk
	 * @param identifier
	 * @return
	 * @throws DataAccessException
	 */
	E loadLazy(Serializable pk, Identifier identifier) throws DataAccessException;

    List<E> search(SearchBean<E> searchBean, Identifier dentifier);
}
