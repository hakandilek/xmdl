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

	private String nameMin;

	private String nameMax;

	private Product products;

	public SupplierSearch() {
	}

	public String getNameMin() {
		return nameMin;
	}

	public void setNameMin(String nameMin) {
		this.nameMin = nameMin;
	}

	public String getNameMax() {
		return nameMax;
	}

	public void setNameMax(String nameMax) {
		this.nameMax = nameMax;
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
		return MessageFormat.format("Supplier[nameMin={1}][nameMax={2}]",
				nameMin, nameMax);
	}

	/** 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;

		if (nameMin != null)
			result = 31 * result + ("" + nameMin).hashCode();
		if (nameMax != null)
			result = 31 * result + ("" + nameMax).hashCode();

		if (products != null)
			result = 31 * result + ("" + products).hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
