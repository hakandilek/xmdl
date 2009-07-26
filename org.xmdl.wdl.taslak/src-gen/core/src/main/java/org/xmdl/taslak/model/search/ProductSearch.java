
package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;

/**
 *
 * Product entity search bean
 *  
 * $Id$
 *
 */ 
public class ProductSearch implements Serializable {
    
    	
    		

    private String name;
    		
    	
    
    	
    		

    private Money price;
    		
    	
    
    	
    		

    private OrderElement orderElements;
    		
    	
    
    	
    		

    private Supplier suppliers;
    		
    	
    

    public ProductSearch() {
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
    		
    	
    

    /** 
     * @generated
     */
	@Override
    public String toString() {
        return MessageFormat.format("ProductSearch "<%int i=0;%>
    
	    
	    	
	    		
	            + "[name={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[price={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[orderElements={<%=i++%>}]"
	    		
	    	
	    
	    	
	    		
	            + "[suppliers={<%=i++%>}]"
	    		
	    	
	    
    
    
    	
    		
            , name
    		
    	
    
    	
    		
            , price
    		
    	
    
    	
    		
            , orderElements
    		
    	
    
    	
    		
            , suppliers
    		
    	
    
        );
    }

    /** 
     * @generated
     */
	@Override
    public int hashCode() {
        int result = 1;
    
    	
    		
    			
        if (name != null) result = 31 * result + name.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (price != null) result = 31 * result + price.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (orderElements != null) result = 31 * result + orderElements.hashCode();
    			
    		
    	
    
    	
    		
    			
        if (suppliers != null) result = 31 * result + suppliers.hashCode();
    			
    		
    	
    
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
  