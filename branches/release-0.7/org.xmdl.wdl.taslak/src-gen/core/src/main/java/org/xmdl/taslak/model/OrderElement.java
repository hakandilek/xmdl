
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
 * OrderElement entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_ORDERELEMENT))</c:if>
public class OrderElement extends BaseObject implements Serializable, Cloneable {

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
        
    
    private  quantity
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  order
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  product
    
    

    public OrderElement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public  Quantity {
        return quantity;
    }

    public void setQuantity( quantity) {
        this.quantity = quantity;
    }

    
    public  Order {
        return order;
    }

    public void setOrder( order) {
        this.order = order;
    }

    
    public  Product {
        return product;
    }

    public void setProduct( product) {
        this.product = product;
    }

    

    public String toString() {
        return MessageFormat.format("OrderElement [id={0}]    [quantity={0}]   [order={0}]   [product={0}]  
                                                                        , quantity   , order   , product  
                                                            
                                      ;
    }

    public boolean equals(Object o) {
        return o instanceof OrderElement && ((OrderElement) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (quantity != null) result = 31 * result + quantity.hashCode();
            
        
    
        
            
        if (order != null) result = 31 * result + order.hashCode();
            
        
    
        
            
        if (product != null) result = 31 * result + product.hashCode();
            
        
    
        return result;
    }

     public OrderElement createClone() {
         try {
             return (OrderElement) clone();
        } catch (CloneNotSupportedException e) {
            OrderElement copy = new OrderElement();
    
        
            copy.quantity = this.quantity;
        
    
        
            copy.order = this.order;
        
    
        
            copy.product = this.product;
        
    
            return copy;
        }
     }
  