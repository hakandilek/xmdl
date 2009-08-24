package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;
import org.xmdl.mesken.model.*;

/**
 * OrderElement entity search bean
 */
public class OrderElementSearch
		/*PROTECTED REGION ID(OrderElement.ens.ext) ENABLED START*//*PROTECTED REGION END*/implements
			Serializable /*PROTECTED REGION ID(OrderElement.ens.imp) ENABLED START*//*, AnotherInterface *//*PROTECTED REGION END*/{

	private Long quantityMin;

	private Long quantityMax;

	private Order order;

	private Product product;

	public OrderElementSearch() {
	}

	public Long getQuantityMin() {
		return quantityMin;
	}

	public void setQuantityMin(Long quantityMin) {
		this.quantityMin = quantityMin;
	}

	public Long getQuantityMax() {
		return quantityMax;
	}

	public void setQuantityMax(Long quantityMax) {
		this.quantityMax = quantityMax;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return MessageFormat.format(
				"OrderElementSearch[quantityMin={0}][quantityMax={1}]",
				quantityMin, quantityMax);
	}

	@Override
	public int hashCode() {
		int result = 1;

		if (quantityMin != null)
			result = 31 * result + ("" + quantityMin).hashCode();
		if (quantityMax != null)
			result = 31 * result + ("" + quantityMax).hashCode();

		if (order != null)
			result = 31 * result + order.hashCode();

		if (product != null)
			result = 31 * result + product.hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}

	/*PROTECTED REGION ID(OrderElement.ens.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
