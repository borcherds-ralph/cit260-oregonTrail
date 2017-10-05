/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author Casey
 */
public class Party {
    private int sizeofparty;

    public Party() {
    }

    public int getSizeofparty() {
        return sizeofparty;
    }

    public void setSizeofparty(int sizeofparty) {
        this.sizeofparty = sizeofparty;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.sizeofparty;
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
        final Party other = (Party) obj;
        if (this.sizeofparty != other.sizeofparty) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Party{" + "sizeofparty=" + sizeofparty + '}';
    }
    
}
