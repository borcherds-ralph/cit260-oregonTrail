/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.PersonControl;
/**
 *
 * @author ralphb
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    public void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                      *"
                + "\n* This is the game of                                  *"
        );

    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
   
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) 
                return;
                
                done = this.doAction(playersName);
            

        } while (!done);

    }

    private String getPlayersName() {
        System.out.println("\n*** getPlayersName() called ****");
        return "Joe";
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }

}

