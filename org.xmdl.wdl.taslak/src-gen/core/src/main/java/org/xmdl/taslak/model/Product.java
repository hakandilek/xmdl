
package org.xmdl.taslak.model;

import javax.persistence.*"/>
import org.xmdl.ida.lib.model.BaseObject"/>
import org.hibernate.annotations.Type"/>
import org.hibernate.annotations.Parameter"/>
import java.io.Serializable"/>
import java.text.MessageFormat"/>
import java.util.*"/>


/**
 *
 * Product entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_PRODUCT))</c:if>
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
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  name
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  price
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  orderElements
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  suppliers
    
    

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public  Name {
        return name;
    }

    public void setName( name) {
        this.name = name;
    }

    
    public  Price {
        return price;
    }

    public void setPrice( price) {
        this.price = price;
    }

    
    public  OrderElements {
        return orderElements;
    }

    public void setOrderElements( orderElements) {
        this.orderElements = orderElements;
    }

    
    public  Suppliers {
        return suppliers;
    }

    public void setSuppliers( suppliers) {
        this.suppliers = suppliers;
    }

    

    public String toString() {
        return MessageFormat.format("Product [id={0}]    [name={0}]   [price={0}]   [orderElements={0}]   [suppliers={0}]  
                                                                        , name   , price   , orderElements   , suppliers  
                                                            
                                      ;
    }

    public boolean equals(Object o) {
        return o instanceof Product && ((Product) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (name != null) result = 31 * result + name.hashCode();
            
        
    
        
            
        if (price != null) result = 31 * result + price.hashCode();
            
        
    
        
            
        if (orderElements != null) result = 31 * result + orderElements.hashCode();
            
        
    
        
            
        if (suppliers != null) result = 31 * result + suppliers.hashCode();
            
        
    
        return result;
    }

     public Product createClone() {
         try {
             return (Product) clone();
        } catch (CloneNotSupportedException e) {
            Product copy = new Product();
    
        
            copy.name = this.name;
        
    
        
            copy.price = this.price;
        
    
        
            copy.orderElements = this.orderElements;
        
    
        
            copy.suppliers = this.suppliers;
        
    
            return copy;
        }
     }
  