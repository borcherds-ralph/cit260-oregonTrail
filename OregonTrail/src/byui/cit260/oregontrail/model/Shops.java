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
}