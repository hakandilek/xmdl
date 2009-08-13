package org.xmdl.taslak.service.impl;

import java.util.Collection;
import org.xmdl.ida.lib.service.impl.GenericManagerImpl;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import org.xmdl.taslak.service.*;
import org.xmdl.taslak.dao.*;

/**
 *
 * Supplier Service implementation
 *  
 * $Id$
 *
 */
public class SupplierManagerImpl extends GenericManagerImpl<Supplier, Long>
		implements
			SupplierManager {

	private final SupplierDAO supplierDAO;

	public SupplierManagerImpl(SupplierDAO supplierDAO) {
		super(supplierDAO);
		this.supplierDAO = supplierDAO;
	}

	public Collection<Supplier> search(SupplierSearch supplierSearch) {
		return supplierDAO.search(supplierSearch);
	}

	/*PROTECTED REGION ID(Supplier.svc.imp.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
