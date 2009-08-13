package org.xmdl.taslak.dao;

import java.util.*;
import org.xmdl.ida.lib.dao.GenericDao;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Product DAO interface
 */
public interface ProductDAO extends GenericDao<Product, Long> {

	Collection<Product> search(ProductSearch searchBean);

}
