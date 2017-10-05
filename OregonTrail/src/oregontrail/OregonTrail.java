/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

//classes created by Ralph Borcherds
import byui.cit260.oregontrail.model.DailyTrailStop;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Landmarks;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Rivers;
import byui.cit260.oregontrail.model.StartMenu;
import byui.cit260.oregontrail.model.Towns;


/**
 *
 * @author ralphb
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test class Wagon
       Wagon wagon = new Wagon();   //  Calls contructor
       
       wagon.setName("Wagon Team 1");  // Set Name
       
       String playeronename = wagon.getName();  // Get players name and set to variable
       
       System.out.println("Wagon Name: " + playeronename);  // prints name to screen
       
       // Test class DailyTrailStop
       
       DailyTrailStop stop = new DailyTrailStop();
       
       stop.setClimate("Clear Skys");
       
       String weather = stop.getClimate();
       
       System.out.println("Weather at the stop is: " + weather);
       
       // Test class Landmarks
       
       
       // Test class Player
       
       // Test class Rivers
       
       // Test Start Menu
       
       // Test class Towns
       
    }
  
}
    

