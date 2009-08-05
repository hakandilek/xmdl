package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;
import org.xmdl.mesken.model.*;

/**
 *
 * Order entity search bean
 *  
 * $Id$
 *
 */
public class OrderSearch implements Serializable {

	private String name;

	private Double priceTotalsMin;

	private Double priceTotalsMax;

	private Date createDateMin;

	private Date createDateMax;

	private OrderElement orderElements;

	public OrderSearch() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPriceTotalsMin() {
		return priceTotalsMin;
	}

	public void setPriceTotalsMin(Double priceTotalsMin) {
		this.priceTotalsMin = priceTotalsMin;
	}

	public Double getPriceTotalsMax() {
		return priceTotalsMax;
	}

	public void setPriceTotalsMax(Double priceTotalsMax) {
		this.priceTotalsMax = priceTotalsMax;
	}

	public Date getCreateDateMin() {
		return createDateMin;
	}

	public void setCreateDateMin(Date createDateMin) {
		this.createDateMin = createDateMin;
	}

	public Date getCreateDateMax() {
		return createDateMax;
	}

	public void setCreateDateMax(Date createDateMax) {
		this.createDateMax = createDateMax;
	}

	public OrderElement getOrderElements() {
		return orderElements;
	}

	public void setOrderElements(OrderElement orderElements) {
		this.orderElements = orderElements;
	}

	/** 
	 * @generated
	 */
	@Override
	public String toString() {
		return MessageFormat
				.format(
						"Order[name={1}], [priceTotalsMin={2}][priceTotalsMax={3}][createDateMin={4}][createDateMax={5}]",
						name, priceTotalsMin, priceTotalsMax, createDateMin,
						createDateMax);
	}

	/** 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;

		if (name != null)
			result = 31 * result + ("" + name).hashCode();

		if (priceTotalsMin != null)
			result = 31 * result + ("" + priceTotalsMin).hashCode();
		if (priceTotalsMax != null)
			result = 31 * result + ("" + priceTotalsMax).hashCode();

		if (createDateMin != null)
			result = 31 * result + ("" + createDateMin).hashCode();
		if (createDateMax != null)
			result = 31 * result + ("" + createDateMax).hashCode();

		if (orderElements != null)
			result = 31 * result + ("" + orderElements).hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
