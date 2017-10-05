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
 * @author Casey
 */
public class Map implements Serializable {

    public Map() {
    }
    
    private String location;
    private String mapdetails;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMapdetails() {
        return mapdetails;
    }

    public void setMapdetails(String mapdetails) {
        this.mapdetails = mapdetails;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Objects.hashCode(this.mapdetails);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.mapdetails, other.mapdetails)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + ", mapdetails=" + mapdetails + '}';
    }
    
}
