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
 * @author ralphb
 */
public class Towns implements Serializable {
    private String name;
    private String location;
    private String shops;
    private String trades;
    private String activites;

    public Towns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShops() {
        return shops;
    }

    public void setShops(String shops) {
        this.shops = shops;
    }

    public String getTrades() {
        return trades;
    }

    public void setTrades(String trades) {
        this.trades = trades;
    }

    public String getActivites() {
        return activites;
    }

    public void setActivites(String activites) {
        this.activites = activites;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.location);
        hash = 89 * hash + Objects.hashCode(this.shops);
        hash = 89 * hash + Objects.hashCode(this.trades);
        hash = 89 * hash + Objects.hashCode(this.activites);
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
        final Towns other = (Towns) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.shops, other.shops)) {
            return false;
        }
        if (!Objects.equals(this.trades, other.trades)) {
            return false;
        }
        if (!Objects.equals(this.activites, other.activites)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Towns{" + "name=" + name + ", location=" + location + ", shops=" + shops + ", trades=" + trades + ", activites=" + activites + '}';
    }
    
    
}
