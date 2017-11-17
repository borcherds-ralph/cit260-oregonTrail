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
 * @author Casey
 */
public class Locations extends Towns implements Serializable {

    public static int milestraveled;
    public static String currentlocation;
    private ArrayList<Towns> towns;

    public Locations() {
    }

    public String getCurrentlocation() {
        return currentlocation;
    }

    public void setCurrentlocation(String currentlocation) {
        this.currentlocation = currentlocation;
    }

    public ArrayList<Towns> getTowns() {
        return towns;
    }

    public void setTowns(ArrayList<Towns> towns) {
        this.towns = towns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.currentlocation);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locations other = (Locations) obj;
        if (!Objects.equals(this.currentlocation, other.currentlocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locationcurrentlocation=" + currentlocation + ", " + super.toString()  + '}';
    }
    
        
    
}
