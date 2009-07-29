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

	private String nameMin;

	private String nameMax;

	private Double priceTotalsMin;

	private Double priceTotalsMax;

	private Date createDateMin;

	private Date createDateMax;

	private OrderElement orderElements;

	public OrderSearch() {
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
						"Order[nameMin={1}][nameMax={2}][priceTotalsMin={3}][priceTotalsMax={4}][createDateMin={5}][createDateMax={6}]",
						nameMin, nameMax, priceTotalsMin, priceTotalsMax,
						createDateMin, createDateMax);
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
