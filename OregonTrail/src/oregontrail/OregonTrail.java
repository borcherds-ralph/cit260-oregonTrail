/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.view.StartProgramView;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;

/**
 *
 * @author ralphb
 */
public class OregonTrail {

    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        StartProgramView startProgramView = new StartProgramView();
        
        try {
             startProgramView.display();
        } catch (Throwable te) {
             System.out.println(te.getMessage());
             te.printStackTrace();
             startProgramView.display();
        }
        
    }

    public static Player getPlayer(){
        return player;
    }
    public static void setPlayer(Player player) {
        OregonTrail.currentGame = currentGame;
    }

    public static GameControl getCurrentGame() {
        GameControl currentGame = null;
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    
}
    

