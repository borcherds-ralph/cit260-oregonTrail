/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Forts;
import byui.cit260.oregontrail.model.Locations;
import byui.cit260.oregontrail.model.Towns;
import byui.cit260.oregontrail.enums.Locationsenum;
import java.util.ArrayList;
/**
 *
 * @author ralphb
 */
public class LocationControl {
    public String currentlocation;
    private ArrayList<Towns> townList;
    private ArrayList<Forts> fortList;
    public LocationControl() {
    }
    

    
    //this sets the starting location of the game
    public String startGameLocation() {
        Locations.milestraveled = 0;
        Locations.currentlocation = "Independence";
        currentlocation = Locations.currentlocation;
        return currentlocation ;
    }

    //This checks to see if the player has traveled enough miles to be at a location
    public String milageCheck() {
        if (Locations.milestraveled.equals(Locationsenum.valueOf(LocationMilage)))
            currentlocation.equals(Locationsenum.valueOf(currentlocation));
    else
            currentlocation = "trail";
    return currentlocation;
    }
    
            //this checks to see if the current location is in the list of locations, 
            //and if not assign the location as trail
    public String locationcheck() {
        if (Locations.currentlocation.equals(Locationsenum.valueOf(LocationName)) && (Locations.currentlocation.equals("trail"))) 
            return currentlocation;
        else
            return "Location Not Found";

    }
}
