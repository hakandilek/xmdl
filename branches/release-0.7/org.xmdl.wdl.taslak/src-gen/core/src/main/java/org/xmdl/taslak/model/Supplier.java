
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
 * Supplier entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_SUPPLIER"))
public class Supplier extends BaseObject implements Serializable, Cloneable {

    /** 
     * Unique identifier
     * 
     * @generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("ID"))
    private Long id;
    
    
    
	@Column(name = (""), length = 0);
        
    
    private String name ;
    
    
    
    
    private Product products ;
    

    public Supplier() {
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

    
    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    

    public String toString() {
    	return MessageFormat.format("Supplier[name={1}], ", name );
    }

    public boolean equals(Object o) {
        return o instanceof Supplier && ((Supplier) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (name != null) result = 31 * result + ("" + name).hashCode();
            
        
    
        
    
        return result;
    }

     public Supplier createClone() {
         try {
             return (Supplier) clone();
        } catch (CloneNotSupportedException e) {
            Supplier copy = new Supplier();
    
        
            copy.name = this.name;
        
    
        
    
            return copy;
        }
     }
}
  