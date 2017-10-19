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
 * @author Casey
 */
public class Item  extends Supplies implements Serializable{
    private String itemtype;
    private int itemcost;
    private ArrayList<Supplies> supplies;
    private double itemweight;

    public Item() {
    }

    public double getItemweight() {
        return itemweight;
    }
    public void setItemweight(double weight) {
        this.itemweight = weight;
    }
    
    

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public int getItemcost() {
        return itemcost;
    }

    public void setItemcost(int itemcost) {
        this.itemcost = itemcost;
    }

    public ArrayList<Supplies> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<Supplies> supplies) {
        this.supplies = supplies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.itemtype);
        hash = 89 * hash + this.itemcost;
        hash = 89 * hash + Objects.hashCode(this.supplies);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.itemweight) ^ (Double.doubleToLongBits(this.itemweight) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (super.equals(obj) == false) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.itemcost != other.itemcost) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemweight) != Double.doubleToLongBits(other.itemweight)) {
            return false;
        }
        if (!Objects.equals(this.itemtype, other.itemtype)) {
            return false;
        }
        if (!Objects.equals(this.supplies, other.supplies)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Item{" + "itemtype=" + itemtype + ", itemcost=$" + itemcost + "supplies=" + super.toString() + "item weight: " + itemweight + '}';
    }
    
}
