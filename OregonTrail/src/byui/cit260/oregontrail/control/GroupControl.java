/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Map;
import oregontrail.OregonTrail;
/**
 *
 * @author ralphb
 */
public class GroupControl {

    /*
    getSize() Method
    Purpose: Verify that the size of the groups is at lease 1 and not greater than 8
    Parameters:  Number of people
    return:  Size of group if within range else an error message
    */
   public int getSize(int groupSize) {

       

       if (groupSize < 0 || groupSize > 8) {
           return -1;
       }

       return groupSize;
       
   }

    /*
    getPace() Method
    Purpose: Verify that the pace of the group is not a negaive and not faster than 2 mph
    Parameters:  pace
    return:  Size of group if within range else an error message
    */
   public int getPace(int teamPace) {


       if (teamPace < 1 || teamPace > 3) {
           return -1;
       }

       return teamPace;
   }

   public String getName(String name) {

       return name;

   }
   public static int createNewGame(Player player) {
        
       Game game = new Game(); // create new game
       OregonTrail.setCurrentGame(game); // save in CuriousWorkmanship
       
       game.setPlayer(player); // save player in game
       
       // create the inventory list amd save in the game
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
    
       Wagon wagon = new Wagon(); // create new wagon
       game.setWagon(wagon); // save wagon in game
        
       //Map map = MapControl.createMap(); // create and initialize new map
       //game.setMap(map); // save map in game

       // move actors to starting position in the map
       
       // ...
       
       //int returnValue = MapControl.moveActorsToStartingLocation(map);
//       if (returnValue < 0) {
//           return -1;
//       }
       
       return 0;
    }
   
}