/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
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
    
    
}