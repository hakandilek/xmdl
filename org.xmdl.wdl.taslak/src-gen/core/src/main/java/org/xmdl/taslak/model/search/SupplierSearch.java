package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;
import org.xmdl.mesken.model.*;

/**
 *
 * Supplier entity search bean
 *  
 * $Id$
 *
 */
public class SupplierSearch implements Serializable {

	private String name;

	private Product products;

	public SupplierSearch() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	/** 
	 * @generated
	 */
	@Override
	public String toString() {
		return MessageFormat.format("Supplier[name={1}], ", name);
	}

	/** 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;

		if (name != null)
			result = 31 * result + ("" + name).hashCode();

		if (products != null)
			result = 31 * result + ("" + products).hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
