// Finish and comment me!

package model;

import java.math.BigDecimal;

public final class Item {
 
    public Item(final String theName, final BigDecimal thePrice) {

    }


    public Item(final String theName, final BigDecimal thePrice, final int theBulkQuantity,
                final BigDecimal theBulkPrice) {

    }


    public BigDecimal getPrice() {
        
        return null;
    }
    

    public int getBulkQuantity() {
        
        return 0;
    }
    

    public BigDecimal getBulkPrice() {
        
        return null;
    }

    
    public boolean isBulk() {
        
        return false;
    }

    @Override
    public String toString() {
        
        return null;
    }


    @Override
    public boolean equals(final Object theOther) {
        
        return false;
    }


    @Override
    public int hashCode() {
        
        return 0;
    }

}
