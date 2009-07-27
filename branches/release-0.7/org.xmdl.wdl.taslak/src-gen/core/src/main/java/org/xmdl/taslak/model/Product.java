
package org.xmdl.taslak.model;

import javax.persistence.*;
import org.xmdl.ida.lib.model.BaseObject;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Parameter;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.*;


/**
 *
 * Product entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_PRODUCT"))
public class Product extends BaseObject implements Serializable, Cloneable {

    /** 
     * Unique identifier
     * 
     * @generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("ID"))
    private Long id;
    
    
    
	@Column(name = (""), length = "");
        
    
    private String name ;
    
    
    
    
    private Money price = new Money();
    
    
    
    
    private OrderElement orderElements ;
    
    
    
    
    private Supplier suppliers ;
    

    public Product() {
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

    
    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
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

    

    public String toString() {
    	return MessageFormat.format("Product[name={1}], ", name );
    }

    public boolean equals(Object o) {
        return o instanceof Product && ((Product) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (name != null) result = 31 * result + ("" + name).hashCode();
            
        
    
        
    
        
    
        
    
        return result;
    }

     public Product createClone() {
         try {
             return (Product) clone();
        } catch (CloneNotSupportedException e) {
            Product copy = new Product();
    
        
            copy.name = this.name;
        
    
        
    
        
    
        
    
            return copy;
        }
     }
}
  