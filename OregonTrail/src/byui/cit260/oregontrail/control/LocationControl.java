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
        Locations.currentlocation = "Independence";
        currentlocation = Locations.currentlocation;
        return currentlocation ;
    }
        //this checks to see if the current location is in the list of locations
    public String locationcheck() {
        if (Locations.currentlocation.equals(Locationsenum.Independence) && (Locations.currentlocation.equals("trail"))) 
            return currentlocation;
        else
            return "Location Not Found";

    }
}
