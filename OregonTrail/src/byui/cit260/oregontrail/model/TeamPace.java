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
 */ 
public class TeamPace implements Serializable {
    private String pace;

    public TeamPace() {
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.pace);
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
        final TeamPace other = (TeamPace) obj;
        if (!Objects.equals(this.pace, other.pace)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TeamPaceMenu{" + "pace=" + pace + '}';
    }
    

    
}