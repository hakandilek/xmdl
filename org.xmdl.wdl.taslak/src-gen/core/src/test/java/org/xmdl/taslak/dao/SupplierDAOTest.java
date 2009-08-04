package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * Supplier DAO Test Case
 *  
 * $Id$
 */
public class SupplierDAOTest extends BaseDaoTestCase {

	private SupplierDAO supplierDAO = null;

	public void setSupplierDAO(SupplierDAO supplierDAO) {
		this.supplierDAO = supplierDAO;
	}

	public void testAddAndRemoveSupplier() throws Exception {
		Supplier supplier = new Supplier();

		supplier.setName("jKyGQtF36ymcf 2");

		supplier = supplierDAO.save(supplier);
		flush();

		supplier = supplierDAO.get(supplier.getId());

		assertNotNull(supplier.getId());
		assertEquals("jKyGQtF36ymcf 2", supplier.getName());

		log.debug("removing supplier...");
		supplierDAO.remove(supplier.getId());
		flush();

		try {
			supplierDAO.get(supplier.getId());
			fail("Supplier found in database");
		} catch (DataAccessException dae) {
			log.debug("Expected exception: " + dae.getMessage());
			assertNotNull(dae);
		}
	}

	public void testSearch() throws Exception {
		SupplierSearch search = new SupplierSearch();
		search.setNameMin("jKyGQtF36ymcf 2");
		search.setNameMax("jKyGQtF36ymcf 2");
		Collection<Supplier> suppliers = supplierDAO.search(search);
		assertTrue(suppliers.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		Supplier supplier = new Supplier();

		supplier.setName("jKyGQtF36ymcf 2");

		supplierDAO.save(supplier);
	}
}
