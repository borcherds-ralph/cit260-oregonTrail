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
public class Forts implements Serializable {
    private String fortName;
    private String location;
    private String trades;
    private String shops;
    private String activities;
 
    public Forts() {
        
    }

    public String getFortName() {
        return fortName;
    }

    public void setFortName(String fortName) {
        this.fortName = fortName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setTrades(String trades) {
        this.trades = trades;
    }

    public void setShops(String shops) {
        this.shops = shops;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getTrades() {
        return trades;
    }

    public String getShops() {
        return shops;
    }

    public String getActivities() {
        return activities;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.fortName);
        hash = 73 * hash + Objects.hashCode(this.location);
        hash = 73 * hash + Objects.hashCode(this.trades);
        hash = 73 * hash + Objects.hashCode(this.shops);
        hash = 73 * hash + Objects.hashCode(this.activities);
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
        final Forts other = (Forts) obj;
        if (!Objects.equals(this.fortName, other.fortName)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.trades, other.trades)) {
            return false;
        }
        if (!Objects.equals(this.shops, other.shops)) {
            return false;
        }
        if (!Objects.equals(this.activities, other.activities)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Forts{" + "fortName=" + fortName + ", location=" + location + ", trades=" + trades + ", shops=" + shops + ", activities=" + activities + '}';
    }

    
}