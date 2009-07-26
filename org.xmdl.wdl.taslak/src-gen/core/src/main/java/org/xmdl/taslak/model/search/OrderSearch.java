
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
    
    	
    		

    private String name;
    		
    	
    
    	
    		

    private Double priceTotals;
    		
    	
    
    	
    		

    private Date createDate;
    		
    	
    
    	
    		

    private OrderElement orderElements;
    		
    	
    

    public OrderSearch() {
    }

    
    	
    		

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    		
    	
    
    	
    		

    public Double getPriceTotals() {
        return priceTotals;
    }

    public void setPriceTotals(Double priceTotals) {
        this.priceTotals = priceTotals;
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
        return MessageFormat.format("OrderSearch "<%int i=0;%>
    
	    
	    	
	    		
	            + "[name={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[priceTotals={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[createDate={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[orderElements={<%=i++%>}]"
	    		
	    	
	    
    
    
    	
    		
            , name
    		
    	
    
    	
    		
            , priceTotals
    		
    	
    
    	
    		
            , createDate
    		
    	
    
    	
    		
            , orderElements
    		
    	
    
        );
    }

    /** 
     * @generated
     */
	@Override
    public int hashCode() {
        int result = 1;
    
    	
    		
    			
        if (name != null) result = 31 * result + name.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (priceTotals != null) result = 31 * result + priceTotals.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (createDate != null) result = 31 * result + createDate.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (orderElements != null) result = 31 * result + orderElements.hashCode();
    			
    		
    	
    
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
  