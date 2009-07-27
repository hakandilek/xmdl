
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
    
    	
    		

    private String nameMin;

    private String nameMax;
			
    	
    
    	
    
    	
    		

    private OrderElement orderElements;
    		
    	
    
    	
    		

    private Supplier suppliers;
    		
    	
    

    public ProductSearch() {
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
    	return MessageFormat.format("Product[nameMin={1}][nameMax={2}]", nameMin , nameMax );
    }

    /** 
     * @generated
     */
	@Override
    public int hashCode() {
        int result = 1;
    
    	
    		
    			
        if (nameMin != null) result = 31 * result + ("" + nameMin).hashCode();
        if (nameMax != null) result = 31 * result + ("" + nameMax).hashCode();
    			
			
    	
    
    	
    
    	
    		
    			
        if (orderElements != null) result = 31 * result + ("" + orderElements).hashCode();
    			
    		
    	
    
    	
    		
    			
        if (suppliers != null) result = 31 * result + ("" + suppliers).hashCode();
    			
    		
    	
    
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
  