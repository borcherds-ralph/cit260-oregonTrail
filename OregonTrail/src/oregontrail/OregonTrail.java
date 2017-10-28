/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.control.GamePlayerControl;
import byui.cit260.oregontrail.view.StartProgramView;
import java.io.IOException;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.PersonControl;

/**
 *
 * @author ralphb
 */
public class OregonTrail {

    private static GameControl currentGame = null;
    private static PersonControl player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
      
    }

    public static String getPlayer(String name){
        return name;
    }
    public static void setPlayer(PersonControl player) {
        
    }

    public static GameControl getCurrentGame() {
        GameControl currentGame = null;
        return currentGame;
    }

    
}
    

