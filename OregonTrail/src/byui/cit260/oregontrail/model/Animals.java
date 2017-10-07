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

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.type);
        hash = 11 * hash + Objects.hashCode(this.cost);
        hash = 11 * hash + Objects.hashCode(this.health);
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
        final Animals other = (Animals) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.health, other.health)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animals{" + "type=" + type + ", cost=" + cost + ", health=" + health + '}';
    }
    
    
 }

