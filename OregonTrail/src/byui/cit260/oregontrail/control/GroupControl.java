/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Wagon;
import oregontrail.OregonTrail;

import byui.cit260.oregontrail.exceptions.GroupControlException;
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
   public int getSize(int groupSize) throws GroupControlException {

       

       if (groupSize < 1 || groupSize > 8) {
           throw new GroupControlException("\nYou cannot have a group less than 1 or greater than 8");
       }

       return groupSize;
       
   }

    /*
    getPace() Method
    Purpose: Verify that the pace of the group is not a negaive and not faster than 2 mph
    Parameters:  pace
    return:  Size of group if within range else an error message
    */
   public int getPace(int teamPace) throws GroupControlException {


       if (teamPace < 1 || teamPace > 3) {
           throw new GroupControlException("\nYou cannot have a pace less than 1 or higher than 3");
       }

       return teamPace;
   }

   public String getName(String name) throws GroupControlException {

       return name;

   }
   public static int createNewGame(Player player) throws GroupControlException {
        
       Game game = new Game(); // create new game
       OregonTrail.setCurrentGame(game); // save in CuriousWorkmanship
       
       game.setPlayer(player); // save player in game
       
       // create the inventory list amd save in the game
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
    
       Wagon wagon = new Wagon(); // create new wagon
       game.setWagon(wagon); // save wagon in game
        
       return 0;
       
    }
   
}