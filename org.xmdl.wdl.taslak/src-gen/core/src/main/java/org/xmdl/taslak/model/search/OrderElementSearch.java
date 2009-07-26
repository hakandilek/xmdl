
package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;

/**
 *
 * OrderElement entity search bean
 *  
 * $Id$
 *
 */ 
public class OrderElementSearch implements Serializable {
    
    	
    		

    private Long quantity;
    		
    	
    
    	
    		

    private Order order;
    		
    	
    
    	
    		

    private Product product;
    		
    	
    

    public OrderElementSearch() {
    }

    
    	
    		

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    		
    	
    
    	
    		

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    		
    	
    
    	
    		

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    		
    	
    

    /** 
     * @generated
     */
	@Override
    public String toString() {
        return MessageFormat.format("OrderElementSearch "<%int i=0;%>
    
	    
	    	
	    		
	            + "[quantity={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[order={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[product={<%=i++%>}]"
	    		
	    	
	    
    
    
    	
    		
            , quantity
    		
    	
    
    	
    		
            , order
    		
    	
    
    	
    		
            , product
    		
    	
    
        );
    }

    /** 
     * @generated
     */
	@Override
    public int hashCode() {
        int result = 1;
    
    	
    		
    			
        if (quantity != null) result = 31 * result + quantity.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (order != null) result = 31 * result + order.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (product != null) result = 31 * result + product.hashCode();
    			
    		
    	
    
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
  