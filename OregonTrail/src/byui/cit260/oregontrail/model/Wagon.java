/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author ralphb
 */
public class Wagon implements Serializable {
    
    // Class instance variables
    private int qty;
    private int length;
    private int weight;
    private String name;

     public Wagon() {
    }
     
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.qty;
        hash = 31 * hash + this.length;
        hash = 31 * hash + this.weight;
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
        final Wagon other = (Wagon) obj;
        if (this.qty != other.qty) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        } else {}
        
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{ name=" + name + ", qty=" + qty + ", length=" + length + ", weight=" + weight + '}';
    }

   
    
    
}
