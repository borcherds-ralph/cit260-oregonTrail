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
 * @author Br33h3rr3ra
 */ 
public class Shops implements Serializable {
    private String type;
    private String location;
    private String supplies;
    
public Shops() {
    
}

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getSupplies() {
        return supplies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.supplies);
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
        return true;
    }

    @Override
    public String toString() {
        return "Shops{" + "type=" + type + ", location=" + location + ", supplies=" + supplies + '}';
    }
    
    
}