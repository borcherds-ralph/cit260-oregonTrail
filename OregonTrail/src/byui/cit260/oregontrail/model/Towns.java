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
public class Towns extends Landmarks implements Serializable {
    private String name;

    private String shops;
    private String trades;
    private String activites;
    private ArrayList<Landmarks> landmarks;

    public Towns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<Landmarks> getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(ArrayList<Landmarks> landmarks) {
        this.landmarks = landmarks;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.shops);
        hash = 37 * hash + Objects.hashCode(this.trades);
        hash = 37 * hash + Objects.hashCode(this.activites);
        hash = 37 * hash + Objects.hashCode(this.landmarks);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) == false) {
            return false;
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
        final Towns other = (Towns) obj;
        if (!Objects.equals(this.name, other.name)) {
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
        if (!Objects.equals(this.landmarks, other.landmarks)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Towns{" + "name=" + name + ", shops=" + shops + ", trades=" + trades + ", activites=" + activites + ", " + super.toString() + '}';
    }

}
