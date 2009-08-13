package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;
import org.xmdl.mesken.model.*;

/**
 *
 * Product entity search bean
 *  
 * $Id$
 *
 */
public class ProductSearch implements Serializable {

	private String name;

	private ProductType productTypeMin;

	private ProductType productTypeMax;

	private OrderElement orderElements;

	private Supplier suppliers;

	public ProductSearch() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getProductTypeMin() {
		return productTypeMin;
	}

	public void setProductTypeMin(ProductType productTypeMin) {
		this.productTypeMin = productTypeMin;
	}

	public ProductType getProductTypeMax() {
		return productTypeMax;
	}

	public void setProductTypeMax(ProductType productTypeMax) {
		this.productTypeMax = productTypeMax;
	}

	public OrderElement getOrderElements() {
		return orderElements;
	}

	public void setOrderElements(OrderElement orderElements) {
		this.orderElements = orderElements;
	}

	public Supplier getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Supplier suppliers) {
		this.suppliers = suppliers;
	}

	/** 
	 * @generated
	 */
	@Override
	public String toString() {
		return MessageFormat
				.format(
						"ProductSearch[name={0}], [productTypeMin={1}][productTypeMax={2}]",
						name, productTypeMin, productTypeMax);
	}

	/** 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;

		if (name != null)
			result = 31 * result + ("" + name).hashCode();

		if (productTypeMin != null)
			result = 31 * result + productTypeMin.hashCode();
		if (productTypeMax != null)
			result = 31 * result + productTypeMax.hashCode();

		if (orderElements != null)
			result = 31 * result + orderElements.hashCode();

		if (suppliers != null)
			result = 31 * result + suppliers.hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
