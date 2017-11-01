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
 * @author Br33h3rr3ra
 */ 
public class Restaurante implements Serializable {
    private String type;
    private String location;
    private ArrayList<meal> meal;
    private ArrayList<Item> itemlist;
    
    public Shops() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Supplies> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<Supplies> supplies) {
        this.supplies = supplies;
    }

    public ArrayList<Item> getItemlist() {
        return itemlist;
    }

    public void setItemlist(ArrayList<Item> itemlist) {
        this.itemlist = itemlist;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Objects.hashCode(this.supplies);
        hash = 79 * hash + Objects.hashCode(this.itemlist);
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
        final Shops other = (Shops) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.supplies, other.supplies)) {
            return false;
        }
        if (!Objects.equals(this.itemlist, other.itemlist)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shops{" + "type=" + type + ", location=" + location + ", supplies=" + supplies + ", itemlist=" + itemlist + '}';
    }

    
    
}