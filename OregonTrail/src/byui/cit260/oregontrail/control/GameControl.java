/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;


import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.enums.ItemList;
import byui.cit260.oregontrail.model.Wagon;
import oregontrail.OregonTrail;

/**
 *
 * @author ralphb
 */
public class GameControl {
    
   public static int createNewGame(Player player) {
        
       Game game = new Game(); // create new game
       OregonTrail.setCurrentGame(game); // save in CuriousWorkmanship
       
       game.setPlayer(player); // save player in game
       
       // create the inventory list amd save in the game
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
 
       Wagon wagon = new Wagon(); // create new wagon
       game.setWagon(wagon); // save wagon in game
        
//       Map map = MapControl.createMap(); // create and initialize new map
//       game.setMap(map); // save map in game

       // move actors to starting position in the map
       
//       int returnValue = MapControl.moveActorsToStartingLocation(map);
//       if (returnValue < 0) {
//           return -1;
//       }
     
       return 0;
    }
 
        private static Wagon createWagon() {
        Wagon wagon = new Wagon();
        wagon.setMaxWeight(1000);
        wagon.setLoadedWeight(0);
        wagon.setNumberBarrelsLoaded(0);
        return wagon;
    }    

    
  
    public static InventoryItem[] createInventoryList() {
        // created array(list) of inventory items    
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem lumber = new InventoryItem();
        lumber.setDescription("Lumber");
        lumber.setQuantityInStock(0);
        lumber.setRequiredAmount(0);
        inventory[ItemList.lumber.ordinal()] = lumber;
        
        InventoryItem ore = new InventoryItem();
        ore.setDescription("Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmount(0);
        inventory[Item.ore.ordinal()] = ore;
        
        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(0);
        inventory[Item.grain.ordinal()] = grain;
        
        InventoryItem legumes = new InventoryItem();
        legumes.setDescription("Legumes");
        legumes.setQuantityInStock(0);
        legumes.setRequiredAmount(0);
        inventory[Item.legume.ordinal()] = legumes;
        
        InventoryItem oil = new InventoryItem();
        oil.setDescription("Olive Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        inventory[Item.oil.ordinal()] = oil;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem honey = new InventoryItem();
        honey.setDescription("Honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(0);
        inventory[Item.honey.ordinal()] = honey;
        
        InventoryItem salt = new InventoryItem();
        salt.setDescription("Salt");
        salt.setQuantityInStock(0);
        salt.setRequiredAmount(0);
        inventory[Item.salt.ordinal()] = salt;
        
        InventoryItem axe = new InventoryItem();
        axe.setDescription("Axe");
        axe.setQuantityInStock(0);
        axe.setRequiredAmount(2);
        inventory[Item.axe.ordinal()] = axe;

        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(3);
        inventory[Item.hammer.ordinal()] = hammer;
        
        InventoryItem drill = new InventoryItem();
        drill.setDescription("Drill");
        drill.setQuantityInStock(0);
        drill.setRequiredAmount(1);
        inventory[Item.drill.ordinal()] = drill;
        
        InventoryItem shovel = new InventoryItem();
        shovel.setDescription("Shovel");
        shovel.setQuantityInStock(0);
        shovel.setRequiredAmount(1);
        inventory[Item.shovel.ordinal()] = shovel;
        
        InventoryItem sickle = new InventoryItem();
        sickle.setDescription("Sickle");
        sickle.setQuantityInStock(0);
        sickle.setRequiredAmount(2);
        inventory[Item.sickle.ordinal()] = sickle;
        
        
        InventoryItem saw = new InventoryItem();
        saw.setDescription("Saw");
        saw.setQuantityInStock(0);
        saw.setRequiredAmount(2);
        inventory[Item.saw.ordinal()] = saw;
        
        
        InventoryItem nails = new InventoryItem();
        nails.setDescription("Sickle");
        nails.setQuantityInStock(0);
        nails.setRequiredAmount(50);
        inventory[Item.nails.ordinal()] = nails;
   
        return inventory;
    }

    public static void startSavedGame() {
        System.out.println("*** startSavedGame() called ***");
    }
}