/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;


import byui.cit260.oregontrail.model.Game;
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
       
        return player;
    }
    private static Game game;

    public static Game getGame() {
        return game;
    }
    
    public static void setGame(Game game) {
        GameControl.game = game;
    }
    
    
    
    public static void createNewGame(Player player) {
        
       // create a new game
       GameControl.game = new Game();
       
       // save as current game
       OregonTrail.setCurrentGame(game);
       
    }
}