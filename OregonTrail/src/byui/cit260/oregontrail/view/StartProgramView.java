/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;


import byui.cit260.oregontrail.control.PersonControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;
/**
 *
 * @author ralphb
 */
public class StartProgramView {

    private final String promptMessage;

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
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: vlaue cannot be blank");
                continue;
            }
            
            break;
        }
        return value;
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
           System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
           return false;
       }
       Player player = PersonControl.createPlayer(playersName);
       
       if (player == null) {
           System.out.println("\nError creating the player.");
           return false;
       }
       
       this.displaNextView(player);
       
       return true;
    }

    private void displaNextView(Player player) {
        System.out.println("*** displayNextView() called ***");
        
    }
    
    

}

