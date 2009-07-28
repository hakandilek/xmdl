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
 * OrderElement entity bean
 *  
 * $Id$
 *
 */
@Entity(name = "TBL_ORDERELEMENT")
public class OrderElement extends BaseObject implements Serializable, Cloneable {

	/** 
	 * Unique identifier
	 * 
	 * @generated
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "F_QUANTITY", length = 15)
	private Long quantity;

	@ManyToMany(targetEntity = Order.class, cascade = {CascadeType.PERSIST,
			CascadeType.MERGE})
	@JoinTable(name = "TBL_ORDERELEMENTORDER", joinColumns = {@JoinColumn(name = "F_ORDERELEMENTS")}, inverseJoinColumns = {@JoinColumn(name = "F_ORDER")})
	private Order order;

	@ManyToMany(targetEntity = Product.class, cascade = {CascadeType.PERSIST,
			CascadeType.MERGE})
	@JoinTable(name = "TBL_ORDERELEMENTPRODUCT", joinColumns = {@JoinColumn(name = "F_ORDERELEMENTS")}, inverseJoinColumns = {@JoinColumn(name = "F_PRODUCT")})
	private Product product;

	public OrderElement() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
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

	public String toString() {
		return MessageFormat.format("OrderElement[quantity={1}], ", quantity);
	}

	public boolean equals(Object o) {
		return o instanceof OrderElement
				&& ((OrderElement) o).getId() == this.getId();
	}

	public int hashCode() {
		int result = 1;
		if (id != null)
			result = 31 * result + id.hashCode();

		if (quantity != null)
			result = 31 * result + ("" + quantity).hashCode();

		return result;
	}

	public OrderElement createClone() {
		try {
			return (OrderElement) clone();
		} catch (CloneNotSupportedException e) {
			OrderElement copy = new OrderElement();

			copy.quantity = this.quantity;

			return copy;
		}
	}
}
