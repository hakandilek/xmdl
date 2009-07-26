
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
 * Money entity bean
 *  
 * $Id$
 *
 */ 
@Embeddable
public class Money extends BaseObject implements Serializable, Cloneable {

	
	
	@Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
		
	
    private  amount
	
	
	
	@Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
		
	
    private  currency
	
	

    public Money() {
    }

	
    public  Amount {
        return amount;
    }

    public void setAmount( amount) {
        this.amount = amount;
    }

	
    public  Currency {
        return currency;
    }

    public void setCurrency( currency) {
        this.currency = currency;
    }

	

    public String toString() {
        return MessageFormat.format("Money   [amount={0}]   [currency={0}]  
                                                              , amount   , currency  
                                                            
                                      ;
    }

    public int hashCode() {
        int result = 1;
    
        
            
        if (amount != null) result = 31 * result + amount.hashCode();
            
        
    
        
            
        if (currency != null) result = 31 * result + currency.hashCode();
            
        
    
        return result;
    }

     public Money createClone() {
         try {
             return (Money) clone();
        } catch (CloneNotSupportedException e) {
            Money copy = new Money();
    
        
            copy.amount = this.amount;
        
    
        
            copy.currency = this.currency;
        
    
            return copy;
        }
     }
  