package org.xmdl.taslak.service.impl;

import java.util.Collection;
import org.xmdl.ida.lib.service.impl.GenericManagerImpl;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.service.*;
import org.xmdl.taslak.dao.*;

/**
 *
 * Product Service implementation
 *  
 * $Id$
 *
 */
public class ProductManagerImpl extends GenericManagerImpl<Product, Long>
		implements
			ProductManager {

	private final ProductDAO productDAO;

	public ProductManagerImpl(ProductDAO productDAO) {
		super(productDAO);
		this.productDAO = productDAO;
	}

	public Collection<Product> search(ProductSearch productSearch) {
		return productDAO.search(productSearch);
	}

	/*PROTECTED REGION ID(Product.svc.imp.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
