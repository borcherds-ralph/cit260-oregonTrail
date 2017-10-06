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
 */public class Animals implements Serializable {
    private String type;
    private Float cost;
    private String health;
    
    public Animals() {
                
    }

    public Animals(Float cost) {
        this.cost = cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public String getHealth() {
        return health;
    }
 }

