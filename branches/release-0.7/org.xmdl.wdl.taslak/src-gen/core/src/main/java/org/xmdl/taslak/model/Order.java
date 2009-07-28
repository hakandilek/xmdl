package org.xmdl.taslak.model;

import javax.persistence.*;
import org.xmdl.ida.lib.model.BaseObject;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Parameter;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.*;
import org.xmdl.mesken.model.*;

/**
 *
 * Order entity bean
 *  
 * $Id$
 *
 */
@Entity(name = "TBL_ORDER")
public class Order extends BaseObject implements Serializable, Cloneable {

	/** 
	 * Unique identifier
	 * 
	 * @generated
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "F_NAME", length = 15)
	private String name;

	@Column(name = "F_PRICETOTALS", length = 15)
	private Double priceTotals;

	@ManyToOne()
	@JoinColumn(name = "F_CREATEDATE", nullable = false)
	private Date createDate;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private OrderElement orderElements;

	public Order() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPriceTotals() {
		return priceTotals;
	}

	public void setPriceTotals(Double priceTotals) {
		this.priceTotals = priceTotals;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public OrderElement getOrderElements() {
		return orderElements;
	}

	public void setOrderElements(OrderElement orderElements) {
		this.orderElements = orderElements;
	}

	public String toString() {
		return MessageFormat.format("Order[name={1}], [priceTotals={2}], ",
				name, priceTotals);
	}

	public boolean equals(Object o) {
		return o instanceof Order && ((Order) o).getId() == this.getId();
	}

	public int hashCode() {
		int result = 1;
		if (id != null)
			result = 31 * result + id.hashCode();

		if (name != null)
			result = 31 * result + ("" + name).hashCode();

		if (priceTotals != null)
			result = 31 * result + ("" + priceTotals).hashCode();

		return result;
	}

	public Order createClone() {
		try {
			return (Order) clone();
		} catch (CloneNotSupportedException e) {
			Order copy = new Order();

			copy.name = this.name;

			copy.priceTotals = this.priceTotals;

			return copy;
		}
	}
}
