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
public class Supplies implements Serializable{

    //variables
    public Supplies() {
    }
    
    private int weight;
    private int maxcapacity;
    private String type;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxcapacity() {
        return maxcapacity;
    }

    public void setMaxcapacity(int maxcapacity) {
        this.maxcapacity = maxcapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }
    private String Size;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.weight;
        hash = 83 * hash + this.maxcapacity;
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + Objects.hashCode(this.Size);
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
        final Supplies other = (Supplies) obj;
        if (this.weight != other.weight) {
            return false;
        }
        if (this.maxcapacity != other.maxcapacity) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.Size, other.Size)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supplies{" + "weight=" + weight + ", maxcapacity=" + maxcapacity + ", type=" + type + ", Size=" + Size + '}';
    }
    
}
