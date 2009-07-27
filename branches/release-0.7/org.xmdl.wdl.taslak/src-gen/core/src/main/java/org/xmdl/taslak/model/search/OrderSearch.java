
package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;

/**
 *
 * Order entity search bean
 *  
 * $Id$
 *
 */ 
public class OrderSearch implements Serializable {
    
    	
    		

    private String nameMin;

    private String nameMax;
			
    	
    
    	
    		

    private Double priceTotalsMin;

    private Double priceTotalsMax;
			
    	
    
    	
    		

    private Date createDate;
    		
    	
    
    	
    		

    private OrderElement orderElements;
    		
    	
    

    public OrderSearch() {
    }

    
    	
    		

    public String getNameMin() {
        return nameMin;
    }

    public void setNameMin(String nameMin) {
        this.nameMin = nameMin;
    }

    public String getNameMax() {
        return nameMax;
    }

    public void setNameMax(String nameMax) {
        this.nameMax = nameMax;
    }
			
    	
    
    	
    		

    public Double getPriceTotalsMin() {
        return priceTotalsMin;
    }

    public void setPriceTotalsMin(Double priceTotalsMin) {
        this.priceTotalsMin = priceTotalsMin;
    }

    public Double getPriceTotalsMax() {
        return priceTotalsMax;
    }

    public void setPriceTotalsMax(Double priceTotalsMax) {
        this.priceTotalsMax = priceTotalsMax;
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
    		
    	
    

    /** 
     * @generated
     */
	@Override
    public String toString() {
    	return MessageFormat.format("Order[nameMin={1}][nameMax={2}][priceTotalsMin={3}][priceTotalsMax={4}]", nameMin , nameMax , priceTotalsMin , priceTotalsMax );
    }

    /** 
     * @generated
     */
	@Override
    public int hashCode() {
        int result = 1;
    
    	
    		
    			
        if (nameMin != null) result = 31 * result + ("" + nameMin).hashCode();
        if (nameMax != null) result = 31 * result + ("" + nameMax).hashCode();
    			
			
    	
    
    	
    		
    			
        if (priceTotalsMin != null) result = 31 * result + ("" + priceTotalsMin).hashCode();
        if (priceTotalsMax != null) result = 31 * result + ("" + priceTotalsMax).hashCode();
    			
			
    	
    
    	
    		
    			
        if (createDate != null) result = 31 * result + ("" + createDate).hashCode();
    			
    		
    	
    
    	
    		
    			
        if (orderElements != null) result = 31 * result + ("" + orderElements).hashCode();
    			
    		
    	
    
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
  