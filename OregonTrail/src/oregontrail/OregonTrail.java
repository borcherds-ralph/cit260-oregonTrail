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



// Classes create by Brittany
import byui.cit260.oregontrail.model.Forts;
import byui.cit260.oregontrail.model.Activities;
import byui.cit260.oregontrail.model.Animals;
import byui.cit260.oregontrail.model.GamePlayMenu;
import byui.cit260.oregontrail.model.TeamPaceMenu;
import byui.cit260.oregontrail.model.Shops;
import byui.cit260.oregontrail.model.HelpMenu;


// Classes created by Casey
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.model.Party;
import byui.cit260.oregontrail.model.Hotel;
import byui.cit260.oregontrail.model.MainMenu;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Location;
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
         
       System.out.println("Wagon Name: " + wagon.toString());  // prints name to screen
       
       // Test class DailyTrailStop
       
       DailyTrailStop stop = new DailyTrailStop();
       
       stop.setClimate("Clear Skys");
       
       System.out.println("Weather at the stop is: " + stop.toString());
       
       // Test class Landmarks
       Landmarks landmark = new Landmarks();
       
       landmark.setName("Salt Lake City");
       
       System.out.println("Landmark Name is: " + landmark.toString());
       
       // Test class Player
       Player player = new Player();
       
       player.setName("Ralph");
        
       System.out.println("The players name is: " + player.toString());
       
       
       // Test class Rivers
       Rivers river = new Rivers();
       
       river.setName("Ohio River");
       
       System.out.println("The River Name is: " + river.toString());
       
       // Test Start Menu
       StartMenu start = new StartMenu();
       
       start.setWelcome("Welcome to the game.  Please select what you would like to do");
      
       System.out.println("The welcome message is: " + start.toString());
       
        // Test class Towns
       Towns town = new Towns();
       
       town.setName("Winter Quarters");
       
       System.out.println("The name of the town is: " + town.toString());
    
    // Test Actvities 
    
       Activities activities = new Activities();
       
       activities.setType("Hunting");
       
       System.out.println("The Activities are: " + activities.toString());
     
       // Test Animals
       
       Animals animals = new Animals();   //  Calls contructor
       
       animals.setType("Oxen");  // Set Name
       
       System.out.println("Animal Type: " + animals.toString());  // prints animal name to screen
       
       // Test Shops
       
       Shops shop = new Shops();
       
       shop.setType("Blacksmith");
             
       System.out.println("Welcome to " + shop.toString());
       
       // Test Forts
       
       Forts fort = new Forts();
       
       fort.setFortName("Fort1");
       
       System.out.println("Welcome to: " + fort.toString());
       
       // Test Team Pace Menu
       
       TeamPaceMenu teamPace = new TeamPaceMenu();
       
       teamPace.setPace("Slow");
             
       System.out.println("Your Team Pace is " + teamPace.toString());
       
       // Test HelpMenu
       
       HelpMenu help = new HelpMenu();
       
       help.setTips("Menu");
                     
       System.out.println("Here are some tips" + help.toString());
       
       // Test GamePlayMenu
       
       GamePlayMenu gameMenu = new GamePlayMenu();
       
       gameMenu.setMenuList("list supplies");
             
       System.out.println("Game Play Menu Items: " + gameMenu.toString());
       
       //
       //Casey's Classes
       //
       
    }
  
    
}
    

