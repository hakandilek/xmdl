
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
 * Supplier entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_SUPPLIER))</c:if>
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
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  name
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  products
    
    

    public Supplier() {
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

    
    public  Products {
        return products;
    }

    public void setProducts( products) {
        this.products = products;
    }

    

    public String toString() {
        return MessageFormat.format("Supplier [id={0}]    [name={0}]   [products={0}]  
                                                                        , name   , products  
                                                            
                                      ;
    }

    public boolean equals(Object o) {
        return o instanceof Supplier && ((Supplier) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (name != null) result = 31 * result + name.hashCode();
            
        
    
        
            
        if (products != null) result = 31 * result + products.hashCode();
            
        
    
        return result;
    }

     public Supplier createClone() {
         try {
             return (Supplier) clone();
        } catch (CloneNotSupportedException e) {
            Supplier copy = new Supplier();
    
        
            copy.name = this.name;
        
    
        
            copy.products = this.products;
        
    
            return copy;
        }
     }
  