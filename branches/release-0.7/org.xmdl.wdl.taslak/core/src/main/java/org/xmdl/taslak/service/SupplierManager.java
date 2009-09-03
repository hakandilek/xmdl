package org.xmdl.taslak.service;

import java.util.Collection;
import org.xmdl.ida.lib.service.GenericManager;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Supplier Service interface
 */
public interface SupplierManager extends GenericManager<Supplier, Long> {

	Collection<Supplier> search(SupplierSearch supplierSearch);

	/*PROTECTED REGION ID(Supplier.svc.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
