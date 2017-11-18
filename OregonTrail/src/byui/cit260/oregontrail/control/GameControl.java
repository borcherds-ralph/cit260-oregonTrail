
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
import byui.cit260.oregontrail.enums.Actorsenum;
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
        InventoryItem[] inventory = new InventoryItem[15];
        
        InventoryItem wagontonge = new InventoryItem();
        wagontonge.setDescription("Wagon Tongue");
        wagontonge.setQuantityInStock(0);
        wagontonge.setRequiredAmount(0);
        inventory[ItemList.WagonTongue.ordinal()] = wagontonge;
        
        InventoryItem wagonaxel = new InventoryItem();
        wagonaxel.setDescription("Wagon Axel");
        wagonaxel.setQuantityInStock(0);
        wagonaxel.setRequiredAmount(0);
        inventory[ItemList.WagonAxel.ordinal()] = wagonaxel;
        
        InventoryItem wagonwheel = new InventoryItem();
        wagonwheel.setDescription("Wagon Wheel");
        wagonwheel.setQuantityInStock(0);
        wagonwheel.setRequiredAmount(0);
        inventory[ItemList.WagonWheel.ordinal()] = wagonwheel;
        
        InventoryItem bacon = new InventoryItem();
        bacon.setDescription("Bacon");
        bacon.setQuantityInStock(0);
        bacon.setRequiredAmount(0);
        inventory[ItemList.Bacon.ordinal()] = bacon;
        
        InventoryItem bullets = new InventoryItem();
        bullets.setDescription("Bullets");
        bullets.setQuantityInStock(0);
        bullets.setRequiredAmount(0);
        inventory[ItemList.Bullets.ordinal()] = bullets;
        
        InventoryItem cornmeal = new InventoryItem();
        cornmeal.setDescription("Cornmeal");
        cornmeal.setQuantityInStock(0);
        cornmeal.setRequiredAmount(0);
        inventory[ItemList.CornMeal.ordinal()] = cornmeal;
        
        InventoryItem flour = new InventoryItem();
        flour.setDescription("Honey");
        flour.setQuantityInStock(0);
        flour.setRequiredAmount(0);
        inventory[ItemList.Flour.ordinal()] = flour;
        
        InventoryItem gunpowder = new InventoryItem();
        gunpowder.setDescription("Gunpowder");
        gunpowder.setQuantityInStock(0);
        gunpowder.setRequiredAmount(0);
        inventory[ItemList.Gunpowder.ordinal()] = gunpowder;
        
        InventoryItem matches = new InventoryItem();
        matches.setDescription("Axe");
        matches.setQuantityInStock(0);
        matches.setRequiredAmount(2);
        inventory[ItemList.Matches.ordinal()] = matches;

        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(3);
        inventory[ItemList.Hammer.ordinal()] = hammer;
        
        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(1);
        inventory[ItemList.Rope.ordinal()] = rope;
        
        InventoryItem shovel = new InventoryItem();
        shovel.setDescription("Shovel");
        shovel.setQuantityInStock(0);
        shovel.setRequiredAmount(1);
        inventory[ItemList.Shovel.ordinal()] = shovel;
        
        InventoryItem soap = new InventoryItem();
        soap.setDescription("Soap");
        soap.setQuantityInStock(0);
        soap.setRequiredAmount(2);
        inventory[ItemList.Soap.ordinal()] = soap;
        
        
        InventoryItem saw = new InventoryItem();
        saw.setDescription("Saw");
        saw.setQuantityInStock(0);
        saw.setRequiredAmount(2);
        inventory[ItemList.Saw.ordinal()] = saw;
        
        
        InventoryItem nails = new InventoryItem();
        nails.setDescription("Sickle");
        nails.setQuantityInStock(0);
        nails.setRequiredAmount(50);
        inventory[ItemList.Nails.ordinal()] = nails;
   
        return inventory;
    }
public Actorsenum[]  getSortActorList(Actorsenum[] actors) {
        
        // sort the list of actors by name and profession
        Actorsenum tempActor;
        for (int i = 0; i < actors.length-1; i++) {
            for (int j = 0; j < actors.length-1-i; j++) {
                String currentActorsName = actors[j].toString();
                String nextActorsNames = actors[j + 1].toString();
                if ( currentActorsName.compareToIgnoreCase(nextActorsNames) > 0) {
                    tempActor = actors[j];
                    actors[j] = actors[j+1];
                    actors[j+1] = tempActor;
                }
            }
        }
        
        return actors;
    }


    public static void startSavedGame() {
        System.out.println("*** startSavedGame() called ***");
    }
}