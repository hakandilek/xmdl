
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
 * Order entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_ORDER))</c:if>
public class Order extends BaseObject implements Serializable, Cloneable {

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
        
    
    private  priceTotals
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  createDate
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  orderElements
    
    

    public Order() {
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

    
    public  PriceTotals {
        return priceTotals;
    }

    public void setPriceTotals( priceTotals) {
        this.priceTotals = priceTotals;
    }

    
    public  CreateDate {
        return createDate;
    }

    public void setCreateDate( createDate) {
        this.createDate = createDate;
    }

    
    public  OrderElements {
        return orderElements;
    }

    public void setOrderElements( orderElements) {
        this.orderElements = orderElements;
    }

    

    public String toString() {
        return MessageFormat.format("Order [id={0}]    [name={0}]   [priceTotals={0}]   [createDate={0}]   [orderElements={0}]  
                                                                        , name   , priceTotals   , createDate   , orderElements  
                                                            
                                      ;
    }

    public boolean equals(Object o) {
        return o instanceof Order && ((Order) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (name != null) result = 31 * result + name.hashCode();
            
        
    
        
            
        if (priceTotals != null) result = 31 * result + priceTotals.hashCode();
            
        
    
        
            
        if (createDate != null) result = 31 * result + createDate.hashCode();
            
        
    
        
            
        if (orderElements != null) result = 31 * result + orderElements.hashCode();
            
        
    
        return result;
    }

     public Order createClone() {
         try {
             return (Order) clone();
        } catch (CloneNotSupportedException e) {
            Order copy = new Order();
    
        
            copy.name = this.name;
        
    
        
            copy.priceTotals = this.priceTotals;
        
    
        
            copy.createDate = this.createDate;
        
    
        
            copy.orderElements = this.orderElements;
        
    
            return copy;
        }
     }
  