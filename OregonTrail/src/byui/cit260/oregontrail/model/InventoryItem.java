/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ralphb
 */
public class InventoryItem implements Serializable {
    
    private ArrayList<Item> itemlist;
    private String description;
    private double quantityInStock;
    private double requiredAmount;

    public InventoryItem() {
    }

    public InventoryItem(String description, double quantityInStock, double requiredAmount) {
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
    }

    public String getDescription() {
        return description;
    }
    

     

      
    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "description=" + description + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }

}
