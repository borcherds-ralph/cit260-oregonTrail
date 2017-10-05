/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
/**
 *
 * @author Casey
 */
public class Hotel implements Serializable {
    private String town;
    private String location;
    private String newPlayer;

public Hotel(){

}

    public void setTown(String town) {
        this.town = town;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNewPlayer(String newPlayer) {
        this.newPlayer = newPlayer;
    }

    public String getTown() {
        return town;
    }

    public String getLocation() {
        return location;
    }

    public String getNewPlayer() {
        return newPlayer;
    }
}