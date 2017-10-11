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
import byui.cit260.oregontrail.model.Towns;
import byui.cit260.oregontrail.model.RiverName;
import byui.cit260.oregontrail.view.StartMenu;


// Classes create by Brittany
import byui.cit260.oregontrail.model.Forts;
import byui.cit260.oregontrail.model.Activities;
import byui.cit260.oregontrail.model.Animals;
import byui.cit260.oregontrail.model.FortName;
import byui.cit260.oregontrail.model.Shops;
import byui.cit260.oregontrail.view.GamePlayMenu;
import byui.cit260.oregontrail.view.HelpMenu;



// Classes created by Casey
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.model.Party;
import byui.cit260.oregontrail.model.Hotel;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Locations;
import byui.cit260.oregontrail.view.MainMenu;

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
       wagon.setLength(20);
       wagon.setQty(2);
       wagon.setWeight(800);
         
       System.out.println(wagon.toString());  // prints name to screen
       
       // Test class DailyTrailStop
       
       DailyTrailStop stop = new DailyTrailStop();
       
       stop.setClimate("Clear Skys");
       stop.setLength(1);
       stop.setRisk(0);
       stop.setTerrain("Rolling Hills");
       
       System.out.println(stop.toString());
       
       // Test class Landmarks
       Landmarks landmark = new Landmarks();
       
       landmark.setName("Salt Lake City");
       landmark.setDistance(1500);
       landmark.setShops("Country Store");
       landmark.setTrades("Blacksmith");
       
       System.out.println(landmark.toString());
       
       // Test class Player
       Player player = new Player();
       
       player.setName("Ralph");
       player.setAge(48);
       player.setGender('M');
       player.setLiving(true);
       player.setMoney(3500);
       player.setOccupation("Doctor");
        
       System.out.println(player.toString());
       
       
       // Test class Rivers
       Rivers river = new Rivers();
       
       river.setName("Ohio River");
       river.setDepth(4);
       river.setWidth(30);
       
       System.out.println(river.toString());
       
        // Test class Towns
       Towns town = new Towns();
       
       town.setName("Winter Quarters");
       town.setActivites("Throwing Horseshoes");
       town.setShops("There are three shops here");
       town.setTrades("Farming");
       
       System.out.println(town.toString());
    
    // Test Actvities 
    
       Activities activities = new Activities();
       
       activities.setType("Hunting");
       activities.setCost(2.50);
       activities.setDuration(3);
       activities.setEffect("Getting Food");
       
       System.out.println(activities.toString());
     
       // Test Animals
       
       Animals animals = new Animals();   //  Calls contructor
       
       animals.setType("Oxen");  // Set Name
       animals.setCost(1.25);
       animals.setHealth("Good");
       
       System.out.println(animals.toString());  // prints animal name to screen
       
       // Test Shops
       
       Shops shop = new Shops();
       
       shop.setType("Blacksmith");
       shop.setLocation("End of Town");

             
       System.out.println(shop.toString());
       
       // Test Forts
       
       Forts fort = new Forts();
       
       fort.setFortName("Fort1");
       fort.setActivities("Target Practice");
       fort.setLocation("Wyoming");
       fort.setShops("none");
       fort.setTrades("Blacksmith");
       
       System.out.println(fort.toString());
       
       //
       //Casey's Classes
       //
       Supplies supplies = new Supplies();
       
       supplies.setWeight(50);
       supplies.setMaxcapacity(1000);
       supplies.setType("medicine");
       
       System.out.println(supplies.toString());
       
       //Item
       
       Item rifle = new Item();
       
       rifle.setItemtype("gun");
       rifle.setItemcost(50);
       
       System.out.println(rifle.toString());
       
       //Party
       
       Party partysize = new Party();
       
       partysize.setSizeofparty(6);
       
       System.out.println(partysize.toString());
       
       //Hotel
       
       Hotel hotel = new Hotel();
       
       hotel.setTown("Walla");
       hotel.setLocation("Walla Walla");
       hotel.setNewPlayer("Yes");
       
       System.out.println(hotel.toString());
       
       //Map
       
       Map map = new Map();
       
       map.setLocation("Walla Walla");
       map.setMapdetails("Walla Wall is a small town outside of Fort Walla Walla.");
       
       System.out.println(map.toString());
  
    
        Locations location = new Locations();
        location.setName("Winter Quarters");
        location.setActivites("Throwing Horseshoes");
        location.setShops("There are three shops here");
        location.setTrades("Farming");
        location.setCurrentlocation("Currnet Location Set");
        
        System.out.println(location.toString());
    
    
        // Test Enum Classes
        System.out.println("Fort NAme: " + FortName.WallaWalla.getName() + ", Fort Location: " + FortName.WallaWalla.getLocation());

        System.out.println("Fort NAme: " + FortName.Churchill.getName() + ", Fort Location: " + FortName.Churchill.getLocation());

        System.out.println("River Name: " + RiverName.Missisppi.getName() + ", River Width: " + RiverName.Missisppi.getWidth());

        System.out.println("River Name: " + RiverName.Colorado.getName() + ", River Width: " + RiverName.Colorado.getWidth());
    
    }
    
}
    

