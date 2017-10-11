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
public class Landmarks implements Serializable {
    private String name;
    private int distance;
    private String shops;
    private String trades;
    private ArrayList<Towns> townList;
    private ArrayList<Forts> fortList;

    public Landmarks() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
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

    public ArrayList<Towns> getTownList() {
        return townList;
    }

    public void setTownList(ArrayList<Towns> townList) {
        this.townList = townList;
    }

    public ArrayList<Forts> getFortList() {
        return fortList;
    }

    public void setFortList(ArrayList<Forts> fortList) {
        this.fortList = fortList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.distance;
        hash = 59 * hash + Objects.hashCode(this.shops);
        hash = 59 * hash + Objects.hashCode(this.trades);
        hash = 59 * hash + Objects.hashCode(this.townList);
        hash = 59 * hash + Objects.hashCode(this.fortList);
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
        final Landmarks other = (Landmarks) obj;
        if (this.distance != other.distance) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.shops, other.shops)) {
            return false;
        }
        if (!Objects.equals(this.trades, other.trades)) {
            return false;
        }
        if (!Objects.equals(this.townList, other.townList)) {
            return false;
        }
        if (!Objects.equals(this.fortList, other.fortList)) {
            return false;
        }
        return true;
    }

 
    
    
}
