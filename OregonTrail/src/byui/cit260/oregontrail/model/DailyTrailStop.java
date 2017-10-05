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
 * @author ralphb
 */
public class DailyTrailStop implements Serializable {
    private int risk;
    private int length;
    private String climate;
    private String terrain;

    public DailyTrailStop() {
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.risk;
        hash = 29 * hash + this.length;
        hash = 29 * hash + Objects.hashCode(this.climate);
        hash = 29 * hash + Objects.hashCode(this.terrain);
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
        final DailyTrailStop other = (DailyTrailStop) obj;
        if (this.risk != other.risk) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (!Objects.equals(this.climate, other.climate)) {
            return false;
        }
        if (!Objects.equals(this.terrain, other.terrain)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DailyTrailStop{" + "risk=" + risk + ", length=" + length + ", climate=" + climate + ", terrain=" + terrain + '}';
    }
    
    
    
}
