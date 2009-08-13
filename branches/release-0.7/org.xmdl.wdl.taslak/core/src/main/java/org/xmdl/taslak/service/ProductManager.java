package org.xmdl.taslak.service;

import java.util.Collection;
import org.xmdl.ida.lib.service.GenericManager;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Product Service interface
 */
public interface ProductManager extends GenericManager<Product, Long> {

	Collection<Product> search(ProductSearch productSearch);

	/*PROTECTED REGION ID(Product.svc.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
