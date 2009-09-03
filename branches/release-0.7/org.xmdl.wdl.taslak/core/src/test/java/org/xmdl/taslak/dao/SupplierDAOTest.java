package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Supplier DAO Test Case
 */
public class SupplierDAOTest extends BaseDaoTestCase {

	private SupplierDAO supplierDAO = null;

	public void setSupplierDAO(SupplierDAO supplierDAO) {
		this.supplierDAO = supplierDAO;
	}

	public void testAddAndRemoveSupplier() throws Exception {
		Supplier supplier = new Supplier();

		supplier.setName("hznQcdE f68MD Q");

		supplier = supplierDAO.save(supplier);
		flush();

		supplier = supplierDAO.get(supplier.getId());

		assertNotNull(supplier.getId());
		assertEquals("hznQcdE f68MD Q", supplier.getName());

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

		search.setName("hznQcdE f68MD Q");

		Collection<Supplier> suppliers = supplierDAO.search(search);
		assertTrue(suppliers.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		Supplier supplier = new Supplier();

		supplier.setName("hznQcdE f68MD Q");

		supplierDAO.save(supplier);
	}

	/*PROTECTED REGION ID(Supplier.dao.t.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
