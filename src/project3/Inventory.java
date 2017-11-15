package project3;

import java.io.Serializable;


/**
 * Inventory class defines an inventory
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class Inventory implements Serializable {
    
    private BikePart bikePart;
    private Boolean onSale;
    private int quantity;
    
    /**
     * Inventory constructor
     * @param bikepart Bike part
     * @param onSale On sale or not
     */
    public Inventory(BikePart bikepart, Boolean onSale){
        this.bikePart = bikepart;
        this.onSale = onSale;
    }
    
    /**
     * Add quantity of inventory
     * @param number Number of quantity added
     */
    public void add(int number){
        quantity += number;
    }
    
    /**
     * Take quantity of inventory
     * @param number Number of quantity taken
     */
    public void take(int number){
        quantity -= number;
    }
    
    /**
     * Set bike part on sale
     * @param onSale Bike part on sale or not
     */
    public void setOnSale(boolean onSale){
        this.onSale = onSale;
    }
    
    /**
     * Get on sale
     * @return Bike part on sale or not
     */
    public Boolean getOnSale(){
        return onSale;
    }
    
    /**
     * Display bike part attributes
     * @return Bike part name, number, price, sales price, on sale, and quantity
     */
    @Override
    public String toString(){
        return bikePart.toString() + "," + onSale + "," + quantity;
    }

    /**
     * Get name of bike part
     * @return Bike part name
     */
    public String getName(){
        return bikePart.getPartName();
    }

    /**
     * Get sales price of bike part
     * @return Bike part sales price
     */
    public double getSalesPrice(){
        return bikePart.getSalesPrice();
    }

    /**
     * Get part number of bike part
     * @return Bike part number
     */
    public int getNumber(){
        return bikePart.getPartNumber();
    }

    /**
     * Get list price of bike part
     * @return Bike part list price
     */
    public double getListPrice(){
        return bikePart.getListPrice();
    }
}
    