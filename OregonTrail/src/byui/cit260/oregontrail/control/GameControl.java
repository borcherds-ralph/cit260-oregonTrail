/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;


import byui.cit260.oregontrail.model.Player;
import oregontrail.OregonTrail;

/**
 *
 * @author ralphb
 */
public class GameControl {
    


   public static Player createPlayer(String name) {
       
       if (name == null) {
           return null;
       }
       
       Player player = new Player();
       player.setName(name);
       
       Player.setName(player);
       
      
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
   
}