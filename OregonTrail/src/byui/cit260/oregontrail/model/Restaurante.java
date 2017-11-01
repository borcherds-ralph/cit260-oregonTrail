/**
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
public class Restaurante implements Serializable {
    private String town;
    private String location;
    private String meals;

public Restaurante(){

}

    public void setTown(String town) {
        this.town = town;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setmeals(String meals) {
        this.meals = meals;
    }

    public String getTown() {
        return town;
    }

    public String getLocation() {
        return location;
    }

    public String getmeals() {
        return meals;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.town);
        hash = 19 * hash + Objects.hashCode(this.location);
        hash = 19 * hash + Objects.hashCode(this.meals);
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
        final Restaurante other = (Restaurante) obj;
        if (!Objects.equals(this.town, other.town)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.meals, other.meals)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "town=" + town + ", location=" + location + ", meals=" + meals + '}';
    }
    
}