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
 * Money entity bean
 *  
 * $Id$
 *
 */
@Embeddable
public class Money
		extends
			/*PROTECTED REGION ID(Money.ebd.ext) ENABLED START*/BaseObject
		/*PROTECTED REGION END*/implements
			Serializable,
			Cloneable /*PROTECTED REGION ID(Money.ebd.imp) ENABLED START*//*, AnotherInterface *//*PROTECTED REGION END*/{

	@Column(name = "F_AMOUNT", length = 15)
	private Double amount;

	public Money() {
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String toString() {
		return MessageFormat.format("Money[amount={0}], ", amount);
	}

	public boolean equals(Object o) {
		return (o != null && o instanceof Money);
	}

	public int hashCode() {
		int result = 1;

		if (amount != null)
			result = 31 * result + ("" + amount).hashCode();

		return result;
	}

	public Money createClone() {
		try {
			return (Money) clone();
		} catch (CloneNotSupportedException e) {
			Money copy = new Money();

			copy.amount = this.amount;

			return copy;
		}
	}

	/*PROTECTED REGION ID(Money.ebd.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
