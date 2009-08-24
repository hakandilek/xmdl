package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;
import org.xmdl.mesken.model.*;

/**
 * Supplier entity search bean
 */
public class SupplierSearch
		/*PROTECTED REGION ID(Supplier.ens.ext) ENABLED START*//*PROTECTED REGION END*/implements
			Serializable /*PROTECTED REGION ID(Supplier.ens.imp) ENABLED START*//*, AnotherInterface *//*PROTECTED REGION END*/{

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

	@Override
	public String toString() {
		return MessageFormat.format("SupplierSearch[name={0}], ", name);
	}

	@Override
	public int hashCode() {
		int result = 1;

		if (name != null)
			result = 31 * result + ("" + name).hashCode();

		if (products != null)
			result = 31 * result + products.hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}

	/*PROTECTED REGION ID(Supplier.ens.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
