/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Casey
 */
public class Item implements Serializable{
    private String itemtype;
    private int itemcost;

    public Item() {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.itemtype);
        hash = 53 * hash + this.itemcost;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.itemcost != other.itemcost) {
            return false;
        }
        if (!Objects.equals(this.itemtype, other.itemtype)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemtype=" + itemtype + ", itemcost=" + itemcost + '}';
    }
    
}
